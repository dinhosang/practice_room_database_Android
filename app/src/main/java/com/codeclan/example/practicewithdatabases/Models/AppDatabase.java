package com.codeclan.example.practicewithdatabases.Models;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by user on 25/01/2018.
 */

@Database(entities = {Student.class, BankAccount.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract StudentDao studentDao();
    public abstract BankAccountDao bankAccountDao();
}