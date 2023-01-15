package com.backendcodes.fullstack2backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendcodes.fullstack2backend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
