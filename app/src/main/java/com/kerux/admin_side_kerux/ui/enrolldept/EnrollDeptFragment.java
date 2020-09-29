package com.kerux.admin_side_kerux.ui.enrolldept;

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

public class EnrollDeptFragment extends Fragment {

    private EnrollDeptViewModel enrollDeptViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        enrollDeptViewModel =
                ViewModelProviders.of(this).get(EnrollDeptViewModel.class);
        View root = inflater.inflate(R.layout.fragment_enroll_dept, container, false);
        final TextView textView = root.findViewById(R.id.text_enroll_dept);
        enrollDeptViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
