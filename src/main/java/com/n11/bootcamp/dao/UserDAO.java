package com.n11.bootcamp.dao;

import com.n11.bootcamp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserDAO extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Optional<User> findByPhoneNumber(String phoneNumber);

    Optional<User> findByUsernameAndPhoneNumber(String username, String phoneNumber);

    void deleteUserByUsernameAndPhoneNumber(String username, String phoneNumber);
}
