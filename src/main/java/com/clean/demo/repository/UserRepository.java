package com.clean.demo.repository;

import com.clean.demo.domain.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserApp, Long> {
}
