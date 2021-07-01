package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*String course = "";*/

        CheckBox cb_bca = (CheckBox) findViewById(R.id.cb_bca);
        CheckBox cb_mca = (CheckBox) findViewById(R.id.cb_mca);
        CheckBox cb_b_tech = (CheckBox) findViewById(R.id.cb_b_tech);
        CheckBox cb_m_tech = (CheckBox) findViewById(R.id.cb_m_tech);
        Button btn = (Button) findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Selected Courses \n";

                if(cb_bca.isChecked() == true){
                    result+= "BCA ";
                }
                if(cb_mca.isChecked() == true){
                    result+= "MCA ";
                }
                if(cb_b_tech.isChecked() == true){
                    result+= "BTech ";
                }
                if(cb_m_tech.isChecked() == true){
                    result+= "MTech";
                }

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}