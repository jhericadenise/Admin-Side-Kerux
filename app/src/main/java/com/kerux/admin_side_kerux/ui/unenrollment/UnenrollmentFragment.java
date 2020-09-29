package com.kerux.admin_side_kerux.ui.unenrollment;

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

public class UnenrollmentFragment extends Fragment {

    private UnenrollmentViewModel unenrollmentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        unenrollmentViewModel =
                ViewModelProviders.of(this).get(UnenrollmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_unenrollment, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        unenrollmentViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
