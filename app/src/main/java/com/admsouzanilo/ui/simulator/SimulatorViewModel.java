package com.admsouzanilo.ui.simulator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SimulatorViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SimulatorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Em Breve!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}