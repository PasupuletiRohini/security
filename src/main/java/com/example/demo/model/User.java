package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
public class User {

    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    int user_id;

    String password;

    String roles;

    String username;

    String active;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
