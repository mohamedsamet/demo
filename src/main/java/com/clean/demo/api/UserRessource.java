package com.clean.demo.api;

import com.clean.demo.domain.UserApp;
import com.clean.demo.dto.UserDto;
import com.clean.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserRessource {

    private UserService userService;

    @Autowired
    UserRessource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public ResponseEntity<UserApp> addUser(@RequestBody UserDto userDto) {
        try {
            UserApp user = userService.addUser(userDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(user);
        } catch (Exception exception) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping()
    public ResponseEntity<List<UserDto>> getUsers() {
        try {
            List<UserDto> users = userService.getUsers();
            return ResponseEntity.ok().body(users);
        } catch (Exception exception) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
