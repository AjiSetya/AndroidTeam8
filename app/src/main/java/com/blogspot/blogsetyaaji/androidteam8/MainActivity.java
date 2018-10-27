package com.blogspot.blogsetyaaji.androidteam8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.awt.Button;

import javax.swing.text.html.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
