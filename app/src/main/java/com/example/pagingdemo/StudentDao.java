package com.example.pagingdemo;

import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDao {
    @Insert
    void insertStudent(Student... students);


    @Query("DELETE FROM STUDENT_TABLE")
    void deleteAllStudents();

    @Query("SELECT * FROM student_table ORDER BY id")
    DataSource.Factory<Integer, Student> getAllStudents();
}
