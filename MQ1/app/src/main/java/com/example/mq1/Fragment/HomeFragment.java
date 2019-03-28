package com.example.mq1.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mq1.MainLenta;
import com.example.mq1.R;

public class HomeFragment extends Fragment implements View.OnClickListener {
    private Button logoutB;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        logoutB = (Button) container.findViewById(R.id.LogOutB);
//        logoutB.setOnClickListener(this);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    @Override
    public void onClick(View view) {

    }
}
