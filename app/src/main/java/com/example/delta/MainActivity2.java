package com.example.delta;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {
    public int randBetween;

    private TextView textView2;
    private Button button2;
    private RadioButton radioButton;
    private RadioGroup radioGroup;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private Button button11;
    public String s2;
    public String s3;
    public String s4;
    public String s5;
    public int y;


    @SuppressLint("SimpleDateFormat")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2 = findViewById(R.id.textView2);
        button2 = findViewById(R.id.button2);
        radioButton = findViewById(R.id.radioButton);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        button11 = findViewById(R.id.button11);
        radioGroup.clearCheck();

        String[] st = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday",""};


        String s7 = rand();
        Date d2 = null ;

        try {
            d2 = new SimpleDateFormat("yyyy-MM-dd").parse(s7);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        s2 = getDayStringOld(d2,Locale.getDefault());
        for(int i=0;i<7;i++)
        {
            if(st[i].equalsIgnoreCase(s2))
            {
                y =i;
                break;
            }
        }
        for(int j=y;j<7;j++)
        {
            st[j] = st[j+1];
        }
        int y1 = randBetween(0,5);
        s3 = st[y1];
        for(int j1 = y1; j1<6; j1++)
        {
            st[j1] = st[j1+1];
        }
        int y2 = randBetween(0,4);
        s4 = st[y2];
        for(int j2 = y2; j2<5; j2++)
        {
            st[j2] = st[j2+1];
        }
        int y3 = randBetween(0,3);
        s5 = st[y3];
        for (int j3 = y3;j3<4;j3++)
        {
            st[j3] = st[j3+1];
        }

        textView2.setText(s7);
        String[] ss = new String[4];
          String[] stt = {s2,s3,s4,s5,""};
          int z1 = randBetween(0,3);
           ss[0] = stt[z1];
           for(int k1 = z1;k1<4; k1++)
           {
               stt[k1] = stt[k1+1];
           }
           int z2 = randBetween(0,2);
           ss[1] = stt[z2];
           for(int k2 = z2; k2<3; k2++)
           {
               stt[k2]= stt[k2+1];
           }
           int z3 = randBetween(0,1);
           ss[2] = stt[z3];
           for(int k3 = z3; k3< 2;k3++)
           {
               stt[k3] = stt[k3+1];
           }
           ss[3] = stt[0];
            radioButton.setText(ss[0]);
            radioButton2.setText(ss[1]);
            radioButton3.setText(ss[2]);
            radioButton4.setText(ss[3]);
    }
    private String rand()
    {
        GregorianCalendar gc =new GregorianCalendar();
        int year = randBetween(1900,2100);
        gc.set(GregorianCalendar.YEAR,year);
        int month = randBetween(1,11);
        gc.set(GregorianCalendar.MONTH,month);
        int dayofmonth = randBetween(1,gc.getActualMaximum(Calendar.DAY_OF_MONTH));
        gc.set(GregorianCalendar.DAY_OF_MONTH,dayofmonth);
        String finaldate = gc.get(GregorianCalendar.YEAR)+"-"+gc.get(GregorianCalendar.MONTH)+"-"+gc.get(GregorianCalendar.DAY_OF_MONTH);
        return finaldate;
    }

    public static int randBetween(int i, int i1)
    {
        return i + (int) Math.round(Math.random() * (i1 - i));

    }

    public static String getDayStringOld(Date date, Locale locale)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE", locale);
        return formatter.format(date);
    }


    public void cal1(View view)
    {

        int selectid = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(selectid);
        String temp = radioButton.getText().toString();
        if(s2.equalsIgnoreCase(temp))
        {
           Intent intent = new Intent(this,MainActivity3.class);
            startActivity(intent);
        }
        else
        {
            Intent i = new Intent(getApplicationContext(),MainActivity10.class);
            String p="0";
            i.putExtra("msg",p);
            startActivity(i);


        }
    }
    public void next1(View view)
    {
        Intent i = new Intent(getApplicationContext(),MainActivity10.class);
        String p="0";
        i.putExtra("msg",p);
        startActivity(i);

    }
}
//        int selectid2 = radioGroup.getCheckedRadioButtonId();
//        radioButton2 = (RadioButton) findViewById(selectid2);
//
//        int selectid3 = radioGroup.getCheckedRadioButtonId();
//        radioButton3 = (RadioButton) findViewById(selectid3);
//
//        int selectid4 = radioGroup.getCheckedRadioButtonId();
//        radioButton4 = (RadioButton) findViewById(selectid4);
////
//        String s = "Friday";
//        if(selectid!=-1)
//        {
//            String temp = radioButton.getText().toString();
//            if(temp.equalsIgnoreCase(s))
//            {
//                Intent intent = new Intent(this,MainActivity3.class);
//                startActivity(intent);
//            }
//            else
//            {
//                //score
//                int score = 0;
//            }
//        }
//        else if(selectid2!=-1)
//        {
//            String temp = radioButton2.getText().toString();
//            if(temp.equalsIgnoreCase(s))
//            {
//                Intent intent = new Intent(this,MainActivity3.class);
//                startActivity(intent);
//            }
//            else
//            {
//                //score
//                int score = 0;
//            }
//        }
//        else if(selectid3 != -1)
//        {
//            String temp = radioButton3.getText().toString();
//            if(temp.equalsIgnoreCase(s))
//            {
//                Intent intent = new Intent(this,MainActivity3.class);
//                startActivity(intent);
//            }
//            else
//            {
//                //score
//                int score = 0;
//            }
//        }
//        else if(selectid4!=-1)
//        {
//            String temp = radioButton4.getText().toString();
//            if(temp.equalsIgnoreCase(s))
//            {
//                Intent intent = new Intent(this,MainActivity3.class);
//                startActivity(intent);
//            }
//            else
//            {
//                //score
//                int score =0;
//            }
//        }
//        for (int i = 0; i < radioGroup .getChildCount(); i++)
//        {
//            ((RadioButton) radioGroup.getChildAt(i)).setText(String.valueOf(i));
//        }


//       SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
//        int year = randBetween(1960,2014);
//       int month = randBetween(0,11);
//
//        GregorianCalendar gc = new GregorianCalendar(year,month,1);
//        int day =randBetween(1,gc.getActualMaximum(Calendar.DAY_OF_MONTH));
//       gc.set(year,month,day);
//       textView2.setText(df.format(gc.getTime()));
//        String ddd = df.format(gc.getTime());
//        s2 = getDayStringOld(ddd,Locale.getDefault());