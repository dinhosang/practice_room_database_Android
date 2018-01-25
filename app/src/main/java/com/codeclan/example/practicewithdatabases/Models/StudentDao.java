package com.codeclan.example.practicewithdatabases.Models;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

/**
 * Created by user on 25/01/2018.
 */

@Dao
public interface StudentDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    public void insertStudent(Student student);

    @Insert(onConflict = OnConflictStrategy.ABORT)
    public void insertStudents(Student... students);

    @Update
    public void updateStudent(Student student);

    @Update
    public void updateStudents(Student... students);

    @Delete
    public void deleteStudent(Student student);

    @Delete
    public void deleteStudents(Student... student);

//    does not like this - try using @Query
//    @Delete("DELETE FROM student")
//    public void deleteAllStudents();

    @Query("SELECT * FROM student")
    public Student[] getAllStudents();

    @Query("DELETE FROM student")
    public void deleteAllStudents();



}
