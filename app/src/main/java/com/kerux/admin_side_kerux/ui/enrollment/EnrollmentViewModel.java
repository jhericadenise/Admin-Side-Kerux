package com.kerux.admin_side_kerux.ui.enrollment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EnrollmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EnrollmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ENROLLMENT");
    }

    public LiveData<String> getText() {
        return mText;
    }
}