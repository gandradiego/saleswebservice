package com.mycompany.saleswebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.saleswebservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
