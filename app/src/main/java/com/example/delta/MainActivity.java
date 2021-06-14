package com.example.delta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;
    private Button button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        button10 = findViewById(R.id.button10);
    }

    public void cal(View view)
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void cal9(View view)
    {
//        finish();
//        System.exit(0);
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
    }
}