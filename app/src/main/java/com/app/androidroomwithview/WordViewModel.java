package com.app.androidroomwithview;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by minhaj on 08/10/2018.
 */
public class WordViewModel extends AndroidViewModel {

    private WordRepository mWordRepository;
    private LiveData<List<Word>> mListAllWords;

    public WordViewModel(@NonNull Application application) {
        super(application);

        mWordRepository = new WordRepository(application);
        mListAllWords = mWordRepository.getAllWords();
    }

    public LiveData<List<Word>> getAllWords() {
        return mListAllWords;
    }

    public void insertWord(Word word){
        mWordRepository.insertWord(word);
    }
}
