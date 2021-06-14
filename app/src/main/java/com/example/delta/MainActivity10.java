package com.example.delta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity10 extends AppCompatActivity {
    private TextView textView12;
//    private TextView textView13;
//    private TextView textView14;
    private Button button12;
    private TextView textView15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        textView12 = findViewById(R.id.textView12);
//        textView13 = findViewById(R.id.textView13);
//        textView14 = findViewById(R.id.textView14);
        button12 = findViewById(R.id.button12);
        textView15 = findViewById(R.id.textView15);

//        //Get the bundle
//        Bundle bundle = getIntent().getExtras();
//
////Extract the data
//        String stuff = bundle.getString();
//
//        textView15.setText("SCORE = "+stuff);
        Intent i = getIntent();
        String p1 = i.getStringExtra("msg");
        int p2 = Integer.parseInt(p1);
        textView15.setText("SCORE = "+p2);


    }
    public void cal10(View view)
    {
//        finish();
//        System.exit(0);
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("EXIT", true);
        startActivity(intent);
    }
}