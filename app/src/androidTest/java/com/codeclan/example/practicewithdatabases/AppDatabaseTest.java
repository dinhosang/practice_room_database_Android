package com.codeclan.example.practicewithdatabases;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.codeclan.example.practicewithdatabases.Models.AppDatabase;
import com.codeclan.example.practicewithdatabases.Models.Student;
import com.codeclan.example.practicewithdatabases.Models.StudentDao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.io.IOException;
import java.util.List;
import android.app.Instrumentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;


/**
 * Created by user on 25/01/2018.
 */



@RunWith(AndroidJUnit4.class)
public class AppDatabaseTest {
    private StudentDao mStudentDao;
    private AppDatabase mDb;

    @Before
    public void createDb() {
        Context context = InstrumentationRegistry.getTargetContext();
        mDb = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        mStudentDao = mDb.studentDao();
    }

    @After
    public void closeDb() throws IOException {
        mDb.close();
    }

    @Test
    public void writeUserAndReadInList() throws Exception {
        Student student = new Student();
        student.setFirstName("Douglas");
        student.setAge(30);

        mStudentDao.insertStudent(student);
        Student[] students = mStudentDao.getAllStudents();
        Log.d(getClass().toString(), Integer.toString(students[0].getId()));
        assertEquals((Integer)1, (Integer)students.length);
    }
}
