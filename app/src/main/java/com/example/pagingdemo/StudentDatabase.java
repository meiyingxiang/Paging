package com.example.pagingdemo;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Student.class, version = 1, exportSchema = false)
public abstract class StudentDatabase extends RoomDatabase {

    private static StudentDatabase studentDatabase;

    public static synchronized StudentDatabase getStudentDatabase(Context mContext) {
        if (studentDatabase == null) {
            studentDatabase = Room.databaseBuilder(mContext, StudentDatabase.class, "student_database")
                    .build();
        }
        return studentDatabase;
    }

    public abstract StudentDao getStudentDao();
}
