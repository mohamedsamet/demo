package com.clean.demo;

import com.clean.demo.domain.UserApp;
import com.clean.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
class DemoApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {
        UserApp userApp = UserApp.builder().id(5L).name("test").build();
        userRepository.save(userApp);
        List<UserApp> userApp1 = userRepository.findAll();
        assertThat(userApp1.size()).isGreaterThan(3);
    }

}
