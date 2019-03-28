package com.example.mq1.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mq1.MainActivity;
import com.example.mq1.MainLenta;
import com.example.mq1.R;
import com.google.firebase.auth.FirebaseAuth;

public class HomeFragment extends Fragment implements View.OnClickListener {
    private Button logoutB;
    private FirebaseAuth firebaseAuth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        firebaseAuth = FirebaseAuth.getInstance();
        logoutB = (Button) view.findViewById(R.id.LogOutB);
        logoutB.setOnClickListener(this);
//        logoutB.setOnClickListener(this);
        // Inflate the layout for this fragment
        return view;
    }


    @Override
    public void onClick(View view) {
        if(view == logoutB){
            firebaseAuth.signOut();
            startActivity(new Intent(getActivity(), MainActivity.class));
        }
    }
}
