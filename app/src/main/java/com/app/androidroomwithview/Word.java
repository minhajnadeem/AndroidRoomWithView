package com.app.androidroomwithview;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by minhaj on 05/10/2018.
 */

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @ColumnInfo(name = "word")
    @NonNull
    private String word;

    public Word(@NonNull String word){
        setWord(word);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
