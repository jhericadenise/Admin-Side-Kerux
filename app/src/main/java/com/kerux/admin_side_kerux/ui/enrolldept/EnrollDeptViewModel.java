package com.kerux.admin_side_kerux.ui.enrolldept;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EnrollDeptViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EnrollDeptViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("DEPARTMENT ENROLLMENT");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
