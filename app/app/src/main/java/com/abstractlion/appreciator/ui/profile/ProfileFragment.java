package com.abstractlion.appreciator.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.abstractlion.appreciator.AppreciationForm;
import com.abstractlion.appreciator.R;

public class ProfileFragment extends Fragment {

    private ProfileViewModel profileViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        profileViewModel =
                ViewModelProviders.of(this).get(ProfileViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        final View rootView = root;
        final ProfileFragment self = this;
        /*ScrollView myScrollView = root.findViewById(R.id.employees);
        LinearLayout employees = ((LinearLayout)myScrollView).getChildAt(0);
        for(int i=0; i < employees.getChildCount(); i++) {
            final int fi = i;
            LinearLayout cur_row = (LinearLayout) employees.getChildAt(i);
            for (int j=0; j < cur_row.getChildCount(); ++j) {
                final int fj = j;
                ImageButton button = (ImageButton) cur_row.getChildAt(j);
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(v.getContext(), AppreciationForm.class);
                        intent.putExtra("image_id", fi*3+fj+1);
                        startActivity(intent);
                    }
                });
            }
        }*/
        return root;
    }
}