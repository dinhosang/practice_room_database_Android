package com.codeclan.example.practicewithdatabases.Models;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.ArrayList;

/**
 * Created by user on 25/01/2018.
 */

@Dao
public interface BankAccountDao {

    // it is abort by default
    @Insert(onConflict = OnConflictStrategy.ABORT)
    public void insertAccount(BankAccount account);

    @Insert
    public void insertAccounts(BankAccount... accounts);

    @Update
    public void updateAccount(BankAccount account);

    @Update
    public void updateAccounts(BankAccount... accounts);

    @Delete
    public void deleteAccount(BankAccount account);

    @Delete
    public void deleteAccounts(BankAccount... account);

    @Query("SELECT * FROM bank_account")
    public BankAccount[] getAllAccounts();






}
