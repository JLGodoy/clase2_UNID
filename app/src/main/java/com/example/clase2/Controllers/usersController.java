package com.example.clase2.Controllers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.clase2.Modelos.userContract.userTable.*;

public class usersController extends SQLiteOpenHelper {

    public static final  String DATABASE_NAME= "Users.db";
    public static final int DATABASE_VERSION= 1;

    public usersController(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

        db.execSQL("CREATE TABLE"+ TABLE_NAME + "("+
                COLUMN_NAME_userId + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_NAME_userName + "TEXT NO NULL," +
                COLUMN_NAME_userPassword + "TEXT NO NULL )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
