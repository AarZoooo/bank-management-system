package org.bms.model;

import java.util.UUID;

public abstract class User {
    private UUID     id;
    private String   fullName;
    private String   email;
    private String   password;
    private Boolean  isDeleted;
}
