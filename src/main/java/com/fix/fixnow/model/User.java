package com.fix.fixnow.model;

import jakarta.persistence.*;

import java.util.List;

@Entity // da table fel database
@Table(name = "users") // esm el table fel mysql
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // id bytgenerate auto mn DB
    private Long id;

    private String name;

    @Column(unique = true, nullable = false) // email lazm unique w msh fady
    private String email;

    private String password;

@Enumerated(EnumType.STRING) // role bytb2a string (CUSTOMER / TECHNICIAN)
    private Role role; // CUSTOMER / TECHNICIAN

    @OneToMany(mappedBy = "user") // user wa7ed y3ml kaza request
    private List<ServiceRequest> requests;

    @OneToMany(mappedBy = "user")  // user wa7ed y3ml kaza review
    private List<Review> reviews;

    public User(Long id, String name, String email, String password, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User() {

    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}