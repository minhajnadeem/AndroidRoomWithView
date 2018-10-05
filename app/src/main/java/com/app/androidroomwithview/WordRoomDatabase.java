package com.app.androidroomwithview;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by minhaj on 05/10/2018.
 */

@Database(entities = {Word.class},version = 1)
public abstract class WordRoomDatabase extends RoomDatabase {

    public abstract WordDao mWordDao();
}
