package com.example.clase2.Modelos;

import android.provider.BaseColumns;

public class userContract {
    public static abstract class userTable implements BaseColumns{

        public static final String TABLE_NAME="Usuarios ";

        public static final  String COLUMN_NAME_userId = "userId";
        public static final String COLUMN_NAME_userName = "userName";
        public static final String COLUMN_NAME_userPassword= "userPassword";

        
    }
}
