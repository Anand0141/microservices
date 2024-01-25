package com.example.microservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="Users")
public class User {

    @Id
    @Column(name = "ID")
    //@GeneratedValue(strategy = GenerationType.UUID)
    private String userID;
    @Column(name = "Name",length = 50)
    private String name;
    @Column(name = "Email")
    private String email;
    @Column(name = "About")
    private String about;

}
