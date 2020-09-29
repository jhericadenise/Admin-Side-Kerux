package com.kerux.admin_side_kerux.ui.unenrollment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UnenrollmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public UnenrollmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("UNENROLLMENT");
    }

    public LiveData<String> getText() {
        return mText;
    }
}