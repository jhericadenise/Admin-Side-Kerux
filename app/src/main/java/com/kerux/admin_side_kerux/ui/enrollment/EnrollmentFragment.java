package com.kerux.admin_side_kerux.ui.enrollment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.kerux.admin_side_kerux.R;

public class EnrollmentFragment extends Fragment {

    private EnrollmentViewModel enrollmentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        enrollmentViewModel =
                ViewModelProviders.of(this).get(EnrollmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_enrollment, container, false);
        final TextView textView = root.findViewById(R.id.text_enroll);
        enrollmentViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}