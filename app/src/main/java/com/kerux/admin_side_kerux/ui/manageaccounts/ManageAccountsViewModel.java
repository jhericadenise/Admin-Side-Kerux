package com.kerux.admin_side_kerux.ui.manageaccounts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ManageAccountsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ManageAccountsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("MANAGE ACCOUNTS");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
