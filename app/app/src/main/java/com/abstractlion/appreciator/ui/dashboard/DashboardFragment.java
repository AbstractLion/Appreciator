package com.abstractlion.appreciator.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.abstractlion.appreciator.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_appreciate, container, false);
        final View rootView = root;
        ScrollView myScrollView = root.findViewById(R.id.employees);
        LinearLayout employees = (LinearLayout)myScrollView.getChildAt(0);
        for(int i=0; i < employees.getChildCount(); i++) {
            LinearLayout cur_row = (LinearLayout) employees.getChildAt(i);
            for (int j=0; j < cur_row.getChildCount(); ++j) {
                ImageButton button = (ImageButton) cur_row.getChildAt(j);
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        View C = rootView.findViewById(R.id.appreciation_form);
                        ViewGroup parent = (ViewGroup) C.getParent();
                        int index = parent.indexOfChild(C);
                        parent.removeView(C);
                        C = getLayoutInflater().inflate(optionId, parent, false);
                    }
                });

            }
        }
        return root;
    }
}