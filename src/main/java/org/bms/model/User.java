package org.bms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public abstract class User {
    @Id
    private  UUID     id;

    private  String   fullName;
    private  String   email;
    private  String   password;

    private  Boolean  isDeleted;
}
