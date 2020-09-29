package com.kerux.admin_side_kerux.ui.managereports;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ManageReportsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ManageReportsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("MANAGE REPORTS");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
