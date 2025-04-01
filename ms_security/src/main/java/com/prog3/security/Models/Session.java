package com.prog3.security.Models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Document
public class Session {

    @Id
    private String _id;
    private String token;
    private Date expirationDate;
    private String validationCode;
    private int timesErrorValidationCode;
    @DBRef
    private User user; // This is the user that is logged in

    public Session() {
    }

}
