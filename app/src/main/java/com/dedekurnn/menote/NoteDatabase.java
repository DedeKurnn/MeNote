package com.dedekurnn.menote;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class NoteDatabase extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME = "notes_db";
    private static final String DATABASE_TABLE = "notes_table";

    // Column name for db table
    private static final String KEY_ID = "id";
    private static final String KEY_TITLE = "title";
    private static final String KEY_CONTENT = "content";
    private static final String KEY_DATE = "date";
    private static final String KEY_TIME = "time";

    NoteDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // CREATE TABLE nametable(id INT PRIMARY KEY, title TEXT, content TEXT, data TEXT, time TEXT);

        String query = "CREATE TABLE " + DATABASE_TABLE + "( " + KEY_ID + "INT PRIMARY KEY, " + KEY_TITLE +
                "TEXT, " + KEY_CONTENT + "TEXT, " + KEY_DATE + "TEXT, " + KEY_TIME + "TEXT" + ")";

        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

        if (oldVersion >= newVersion)
            return;
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
        onCreate(sqLiteDatabase);
    }
}
