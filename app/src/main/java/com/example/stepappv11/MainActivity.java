package com.example.stepappv11;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int stepCounter = 0;
    TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        showCount = (TextView) findViewById(R.id.show_count);;

    }

    public void startCount(View view) {
        stepCounter = 0;
        showCount.setText(String.format("%d", stepCounter));

    }

    public void CountUp(View view) {
        stepCounter ++;
        showCount.setText(String.format("%d", stepCounter));

    }

}