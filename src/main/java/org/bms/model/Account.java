package org.bms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private  UUID     id;
    private  UUID     userId;
    private  Integer  accountNumber;
    private  Double   amount;
    private  String   branch;
    private  Boolean  isDeleted;
}
