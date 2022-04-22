package com.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entities.User;

public interface IUserDao extends JpaRepository<User, Long> {

}
