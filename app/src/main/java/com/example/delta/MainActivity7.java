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

public class MainActivity7 extends AppCompatActivity {
    private TextView textView7;
    private Button button7;
    private Button button17;
    private RadioButton radioButton22;
    private RadioGroup radioGroup5;
    private RadioButton radioButton23;
    private RadioButton radioButton24;
    private RadioButton radioButton25;
    public String s2;
    public String s3;
    public String s4;
    public String s5;
    public int y;
    @SuppressLint("SimpleDateFormat")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        textView7 = findViewById(R.id.textView7);
        button7 = findViewById(R.id.button7);
        button17 = findViewById(R.id.button17);
        radioButton22 = findViewById(R.id.radioButton22);
        radioGroup5 = findViewById(R.id.radioGroup5);
        radioButton23 = findViewById(R.id.radioButton23);
        radioButton24 = findViewById(R.id.radioButton24);
        radioButton25 = findViewById(R.id.radioButton25);

        radioGroup5.clearCheck();


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
        textView7.setText(s7);
        radioButton22.setText(ss[0]);
        radioButton23.setText(ss[1]);
        radioButton24.setText(ss[2]);
        radioButton25.setText(ss[3]);
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
    public void cal6(View view)
    {
        int selectid = radioGroup5.getCheckedRadioButtonId();
        radioButton22 = (RadioButton) findViewById(selectid);
        String temp = radioButton22.getText().toString();

        if (temp.equalsIgnoreCase(s2))
        {
            Intent intent = new Intent(this, MainActivity8.class);
            startActivity(intent);
        }
        else
        {
            Intent i = new Intent(getApplicationContext(),MainActivity10.class);
            String p="5";
            i.putExtra("msg",p);
            startActivity(i);
        }
    }

    public void next7(View view)
    {
        Intent i = new Intent(getApplicationContext(),MainActivity10.class);
        String p="5";
        i.putExtra("msg",p);
        startActivity(i);

//        Intent intent = new Intent(this,MainActivity10.class);
//        startActivity(intent);
    }
}