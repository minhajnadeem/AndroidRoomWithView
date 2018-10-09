package com.app.androidroomwithview;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

/**
 * Created by minhaj on 08/10/2018.
 */
public class WordRepository {

    private WordDao mWordDao;
    private LiveData<List<Word>> mListAllWords;

    public WordRepository(Application application) {
        WordRoomDatabase db = WordRoomDatabase.getDatabase(application);
        mWordDao = db.mWordDao();
        mListAllWords = mWordDao.getAllWord();
    }

    LiveData<List<Word>> getAllWords(){
        return mListAllWords;
    }

    public void insertWord(Word word){
        new InsertWordTask(mWordDao).execute(word);
    }

    class InsertWordTask extends AsyncTask<Word,Void,Void>{

        WordDao mWordDao;

        public InsertWordTask(WordDao wordDao) {
            mWordDao = wordDao;
        }

        @Override
        protected Void doInBackground(Word... words) {

            mWordDao.insert(words[0]);
            return null;
        }
    }
}
