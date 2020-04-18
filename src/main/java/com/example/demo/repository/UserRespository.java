package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRespository extends CrudRepository<User, Integer> {

    /*
        drop table user_table;


       create table user_table(
        user_id serial PRIMARY KEY,
        password varchar(20),
        roles varchar(30),
        userName varchar(30),
        active varchar(20)
        );

        select * from user_table;

        insert into user_table values(2, 'sathwik','USER','sathwik','true');
     */
    Optional<User> findByUsername(String userName);


}
