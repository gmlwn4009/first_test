package com.example.daily_weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ListFragment;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        FragmentManager manager = getSupportFragmentManager();
        fragment = manager.findFragmentById(R.id.main_fragment);

        TextView textView = findViewById(R.id.textView);
        LinearLayout linearLayout=findViewById(R.id.linearlayout);

    }
}