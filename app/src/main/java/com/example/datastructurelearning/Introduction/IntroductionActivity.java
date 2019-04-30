package com.example.datastructurelearning.Introduction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.datastructurelearning.Introduction.Class.ClassActivity;
import com.example.datastructurelearning.Introduction.Functions.FunctionActivity;
import com.example.datastructurelearning.Introduction.Pointers.PointerActivity;
import com.example.datastructurelearning.Introduction.Recursion.RecursionActivity;
import com.example.datastructurelearning.Introduction.Structure.StructureActivity;
import com.example.datastructurelearning.Introduction.Variables.VariableActivity;
import com.example.datastructurelearning.R;

import at.markushi.ui.CircleButton;

public class IntroductionActivity extends AppCompatActivity {

    CircleButton variableButton, pointerButton, functionButton, recursionButton, structButton, classButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        variableButton = findViewById(R.id.variableButton);
        pointerButton = findViewById(R.id.pointerButton);
        functionButton = findViewById(R.id.functionButton);
        recursionButton = findViewById(R.id.recursionButton);
        structButton = findViewById(R.id.structureButton);
        classButton = findViewById(R.id.classButton);

        variableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(IntroductionActivity.this, VariableActivity.class);
                startActivity(intent);
            }
        });
        pointerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(IntroductionActivity.this, PointerActivity.class);
                startActivity(intent);
            }
        });
        functionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(IntroductionActivity.this, FunctionActivity.class);
                startActivity(intent);
            }
        });
        recursionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(IntroductionActivity.this, RecursionActivity.class);
                startActivity(intent);
            }
        });
        structButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(IntroductionActivity.this, StructureActivity.class);
                startActivity(intent);
            }
        });
        classButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(IntroductionActivity.this, ClassActivity.class);
                startActivity(intent);
            }
        });

    }
}
