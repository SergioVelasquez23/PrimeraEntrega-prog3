package com.prog3.security.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Data
@Document
public class UserRole {
    @Id
    private String _id;

    @DBRef
    private Role role;
    @DBRef
    private User user;

    public UserRole() {

    }
}
