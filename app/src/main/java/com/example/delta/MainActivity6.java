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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MainActivity6 extends AppCompatActivity {
    private TextView textView6;
    private Button button6;
    private Button button16;
    private RadioButton radioButton17;
    private RadioGroup radioGroup6;
    private RadioButton radioButton18;
    private RadioButton radioButton19;
    private RadioButton radioButton20;
    public String s2;
    public String s3;
    public String s4;
    public String s5;
    public int y;
    @SuppressLint("SimpleDateFormat")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        textView6 = findViewById(R.id.textView6);
        button6 = findViewById(R.id.button6);
        button16 = findViewById(R.id.button16);
        radioButton17 = findViewById(R.id.radioButton17);
        radioGroup6 = findViewById(R.id.radioGroup6);
        radioButton18 = findViewById(R.id.radioButton18);
        radioButton19 = findViewById(R.id.radioButton19);
        radioButton20 = findViewById(R.id.radioButton20);

        radioGroup6.clearCheck();
        String[] st = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday",""};
        String s7 = rand();
        Date d2 = null ;
        try {
            d2 = new SimpleDateFormat("yyyy-MM-dd").parse(s7);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        s2 = getDayStringOld(d2, Locale.getDefault());
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
        textView6.setText(s7);


        radioButton17.setText(ss[0]);
        radioButton18.setText(ss[1]);
        radioButton19.setText(ss[2]);
        radioButton20.setText(ss[3]);
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

    public void cal5(View view)
    {
        int selectid = radioGroup6.getCheckedRadioButtonId();
        radioButton17 = (RadioButton) findViewById(selectid);
        String temp = radioButton17.getText().toString();

        if (temp.equalsIgnoreCase(s2))
        {
            Intent intent = new Intent(this, MainActivity7.class);
            startActivity(intent);
        }
        else
        {
            Intent i = new Intent(getApplicationContext(),MainActivity10.class);
            String p="4";
            i.putExtra("msg",p);
            startActivity(i);

//            Intent intent = new Intent(this,MainActivity10.class);
//            startActivity(intent);
        }
    }
    public void next6(View view)
    {
        Intent i = new Intent(getApplicationContext(),MainActivity10.class);
        String p="4";
        i.putExtra("msg",p);
        startActivity(i);

//        Intent intent = new Intent(this,MainActivity10.class);
//        startActivity(intent);
    }
}