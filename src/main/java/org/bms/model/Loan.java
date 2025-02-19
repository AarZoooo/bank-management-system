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
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Loan {
    @Id
    private  UUID     id;

    @ManyToOne
    private  Customer loanHolder;
    private  Double   totalAmount;
    private  Double   interestRate;
    private  Integer  totalMonths;

    private  Double   amountPaid;
    private  Integer  termsPaid;

    private  Boolean  isDeleted;
}
