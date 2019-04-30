package com.example.datastructurelearning.Stack;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.datastructurelearning.R;
import com.example.datastructurelearning.Stack.Display.DisplayActivity;
import com.example.datastructurelearning.Stack.Pop.PopActivity;
import com.example.datastructurelearning.Stack.Push.PushActivity;

import at.markushi.ui.CircleButton;


public class StackOperations extends Fragment {

    CircleButton pushButton,popButton,displayButton;
    Intent intent;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stack_operations, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        pushButton = view.findViewById(R.id.pushButton);
        popButton = view.findViewById(R.id.popButton);
        displayButton = view.findViewById(R.id.displayButton);

        pushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),PushActivity.class);
                startActivity(intent);
            }
        });

        popButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),PopActivity.class);
                startActivity(intent);
            }
        });

        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), DisplayActivity.class);
                startActivity(intent);
            }
        });

    }

}
