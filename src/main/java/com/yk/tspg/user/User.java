package com.yk.tspg.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="user", schema = "public")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "email", unique=true)
    private String email;

    @JsonIgnore
    @Column(name = "password")
    private String password;

    @Column(name = "nickname")
    private String nickname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
