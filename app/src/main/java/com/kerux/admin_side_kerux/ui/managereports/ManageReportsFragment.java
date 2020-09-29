package com.kerux.admin_side_kerux.ui.managereports;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kerux.admin_side_kerux.R;

public class ManageReportsFragment extends Fragment {
    private ManageReportsViewModel manageReportsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        manageReportsViewModel =
                ViewModelProviders.of(this).get(ManageReportsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_manage_reports, container, false);
        final TextView textView = root.findViewById(R.id.text_manage_rep);
        manageReportsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
