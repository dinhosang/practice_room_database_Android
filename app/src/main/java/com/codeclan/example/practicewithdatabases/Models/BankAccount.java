package com.codeclan.example.practicewithdatabases.Models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by user on 25/01/2018.
 */

@Entity(tableName = "bank_account", foreignKeys = @ForeignKey(entity = Student.class, parentColumns = "id", childColumns = "account_holder_id"))
public class BankAccount {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "bank_account_id")
    private int id;


    @ColumnInfo(name = "amount")
    private Double amount;

    @ColumnInfo(name="type")
    private char type;

    @ColumnInfo(name="active")
    private Boolean active;

    @ColumnInfo(name = "account_holder_id")
    private int accountHolderId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getAccountHolderId() {
        return accountHolderId;
    }

    public void setAccountHolderId(int accountHolderId) {
        this.accountHolderId = accountHolderId;
    }
}
