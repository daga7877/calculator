package com.example.mss2015.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView t1,t2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    double f=0,ans=0;
    String s="";
    String se="";
    char op;
    int i=0;
    int y=0,a,x=1;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button1);
        b3=(Button) findViewById(R.id.button2);
        b4=(Button) findViewById(R.id.button3);
        b5=(Button) findViewById(R.id.button4);
        b6=(Button) findViewById(R.id.button5);
        b7=(Button) findViewById(R.id.button6);
        b8=(Button) findViewById(R.id.button7);
        b9=(Button) findViewById(R.id.button8);
        b10=(Button) findViewById(R.id.button9);
        b11=(Button) findViewById(R.id.button10);
        b12=(Button) findViewById(R.id.button11);
        b13=(Button) findViewById(R.id.button12);
        b14=(Button) findViewById(R.id.button13);
        b15=(Button) findViewById(R.id.button14);
        b16=(Button) findViewById(R.id.button15);
        b17=(Button) findViewById(R.id.button16);
        b18=(Button) findViewById(R.id.button17);
        b19=(Button) findViewById(R.id.button18);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                t2.setText(String.valueOf(ans));
                s=t2.getText().toString();
                t1.setText(null);
                 break;
            case R.id.button1:
                   y = 0;
                   s = s.concat("0");
                   t2.setText(s);
                   value();
                break;
            case R.id.button2:
                if(s.isEmpty())
                {
                    s="0";
                }
                    y = 0;
                    s = s.concat(".");
                    t2.setText(s);
                    value();
                break;
            case R.id.button3:
                y=0;
                s=s.concat("1");
                t2.setText(s);
                value();
                break;
            case R.id.button4:
                y=0;
                s=s.concat("2");
                t2.setText(s);
                value();
                break;
            case R.id.button5:
                y=0;
                s=s.concat("3");
                t2.setText(s);
                value();
                break;
            case R.id.button6:
                y=0;
                s=s.concat("4");
                t2.setText(s);
                value();
                break;
            case R.id.button7:
                y=0;
                s=s.concat("5");
                t2.setText(s);
                value();
                break;
            case R.id.button8:
                y=0;
                s=s.concat("6");
                t2.setText(s);
                value();
                break;
            case R.id.button9:
                y=0;
                s=s.concat("7");
                t2.setText(s);
                value();
                break;
            case R.id.button10:
                y=0;
                s=s.concat("8");
                t2.setText(s);
                value();
                break;
            case R.id.button11:
                y=0;
                s=s.concat("9");
                t2.setText(s);
                value();
                break;
            case R.id.button12:
                t1.setText(null);
                t2.setText(String.valueOf(ans));
                x++;
                break;
            case R.id.button13:
               try {
                   if (y == 1) {
                       a = s.length();
                       s = s.substring(0, (a - 1));
                       s = s.concat("+");
                       t2.setText(s);
                       op = '+';

                   } else if (x == 1) {
                       f = Double.parseDouble(s);
                       s = s.concat("+");
                       t2.setText(s);
                       op = '+';
                       x++;
                       y++;
                   } else if (x != 1) {
                       f = ans;
                       s = s.concat("+");
                       t2.setText(s);
                       op = '+';
                       x++;
                       y++;
                       i++;
                   }
               }
               catch (Exception e)
               {
                   Toast.makeText(this,"enter number first",2000);
               }

                break;
            case R.id.button14:
                if(y==1)
                {
                    a = s.length();
                    s = s.substring(0,(a - 1));
                    s=s.concat("-");
                    t2.setText(s);
                    op='-';

                }
                else if (x == 1) {
                    if (s.isEmpty())
                    {
                        s = s.concat("-");
                        t2.setText(s);
                        op='-';
                        x++;
                        y++;
                        i--;
                    }
                    else
                    {
                        f = Double.parseDouble(s);
                        s = s.concat("-");
                        t2.setText(s);
                        op = '-';
                        x++;
                        y++;
                    }
                }
                else if (x != 1)
                {
                        f = ans;
                        s = s.concat("-");
                        t2.setText(s);
                        op = '-';
                        x++;
                        y++;
                        i++;
                }
                break;
            case R.id.button15:
                ans=0;
                t1.setText("");
                t2.setText(" ");
                 s="";
                 f=0;
                 y=0;
                 x=1;
                 i=0;
                break;
            case R.id.button16:
                try
                {
                    if(y==1)
                    {
                        a = s.length();
                        s = s.substring(0,(a - 1));
                        s=s.concat("/");
                        t2.setText(s);
                        op='/';

                    }
                    else if (x == 1)
                    {
                        f = Double.parseDouble(s);
                        s = s.concat("/");
                        t2.setText(s);
                        op = '/';
                        x++;
                        y++;
                    }
                    else if (x != 1)
                    {
                        f = ans;
                        s = s.concat("/");
                        t2.setText(s);
                        op = '/';
                        x++;
                        y++;
                        i++;
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(this,"enter number first",2000);
                }
                break;
            case R.id.button17:
               try
               {
                   if(y==1)
                   {
                       a = s.length();
                       s = s.substring(0,(a - 1));
                       s=s.concat("x");
                       t2.setText(s);
                       op='x';
                   }
                   else if (x == 1)
                   {
                       f = Double.parseDouble(s);
                       s = s.concat("x");
                       t2.setText(s);
                       op = 'x';
                       x++;
                       y++;
                   }
                   else if (x != 1)
                   {
                       f = ans;
                       s = s.concat("x");
                       t2.setText(s);
                       op = 'x';
                       x++;
                       y++;
                       i++;
                   }
               }
               catch (Exception e)
               {
                   Toast.makeText(this,"enter number first",2000);
               }

                break;
            case R.id.button18:
                try {
                    a = s.length();
                    if (s.charAt((a - 1)) == '+' || s.charAt((a - 1)) == '-' || s.charAt((a - 1)) == '/' || s.charAt((a - 1)) == 'x') {
                        s = s.substring(0, (a - 1));
                        t2.setText(s);
                        t1.setText("");
                        x = 1;

                    } else if (a > 0) {
                        s = s.substring(0, (a - 1));
                        t2.setText(s);
                        t1.setText("");
                    } else if (a == 0) {
                        s = s.substring(0, (a - 1));
                        t2.setText(s);
                        t1.setText("");
                        y = 0;
                        x = 1;
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(this,"enter number first",2000);
                }
                break;
        }

    }
    void value()
    {   double v = 0;
        i=s.indexOf(op,(i+1));
        se=s;
        v=Double.parseDouble(se.substring(i+1));

        switch (op) {
            case '+':
                ans = f + v;
                t1.setText(String.valueOf(ans));
                i--;
                break;
            case '-':
                ans = f - v;
                t1.setText(String.valueOf(ans));
                i--;
                break;
            case 'x':
                ans = f * v;
                t1.setText(String.valueOf(ans));
                i--;
                break;
            case '/':
                ans = f / v;
                t1.setText(String.valueOf(ans));
                i--;
                break;

            default:
                break;
        }
    }

}
