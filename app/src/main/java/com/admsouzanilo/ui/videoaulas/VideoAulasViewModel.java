package com.admsouzanilo.ui.videoaulas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VideoAulasViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public VideoAulasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Em Breve!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}