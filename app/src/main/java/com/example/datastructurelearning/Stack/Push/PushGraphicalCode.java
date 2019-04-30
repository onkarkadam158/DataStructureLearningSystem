package com.example.datastructurelearning.Stack.Push;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.datastructurelearning.R;
import com.example.datastructurelearning.Rectangle;

public class PushGraphicalCode extends Fragment {

    RelativeLayout pushGraphicLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_push_graphical_code, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        pushGraphicLayout = view.findViewById(R.id.pushGraphicalLayout);
        pushGraphicLayout.addView(new Rectangle(getActivity(),20,20,100,500, Color.GREEN));
        pushGraphicLayout.addView(new Rectangle(getActivity(),50,50,100,100,Color.RED));
        pushGraphicLayout.addView(new Rectangle(getActivity(),50,150,100,200,Color.RED));
        pushGraphicLayout.addView(new Rectangle(getActivity(),50,250,100,300,Color.RED));

    }
}
