package org.bms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Account {
    @Getter @Setter
    @Id
    private  UUID     id;

    @ManyToOne
    private  Customer accountHolder;
    private  Double   amount;
    private  String   branch;
    private  Integer  isSavings;

    private  Boolean  isDeleted;
}
