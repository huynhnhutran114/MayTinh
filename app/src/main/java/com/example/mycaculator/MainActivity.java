package com.example.mycaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    public String math=" ";
    TextView txtmaytinh;
    View.OnClickListener myClick;
    Button btnce, btnc, btnchia, btn7, btn8, btn9, btnphantram, btn5, btn6, btn4, btnnha, btntru, btncong, btnbang, btn3, btn2, btn1, btn0, btnphay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtmaytinh = (TextView) findViewById(R.id.txtmaytinh);
        btnce = (Button) findViewById(R.id.btnce);
        btnc = (Button) findViewById(R.id.btnc);
        btnchia = (Button) findViewById(R.id.btnchia);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnphantram = (Button) findViewById(R.id.btnphantram);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn4 = (Button) findViewById(R.id.btn4);
        btncong = (Button) findViewById(R.id.btncong);
        btntru = (Button) findViewById(R.id.btntru);
        btnnha = (Button) findViewById(R.id.btnnhan);
        btnbang = (Button) findViewById(R.id.btnbang);
        btn3 = (Button) findViewById(R.id.btn3);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn0 = (Button) findViewById(R.id.btn0);
        btnphay = (Button) findViewById(R.id.btnphay);
        addEvents();
    }

    private void addEvents() {
        myClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btn0:
                        math = math + "0";
                        txtmaytinh.setText(math + "");

                        break;
                    case R.id.btn1:
                        math = math + "1";
                        txtmaytinh.setText(math + "");

                        break;
                    case R.id.btn2:
                        math = math + "2";
                        txtmaytinh.setText(math + "");

                        break;
                    case R.id.btn3:
                        math = math + "3";
                        txtmaytinh.setText(math + "");

                        break;
                    case R.id.btn4:
                        math = math + "4";
                        txtmaytinh.setText(math + "");

                        break;
                    case R.id.btn5:
                        math = math + "5";
                        txtmaytinh.setText(math + "");

                        break;
                    case R.id.btn6:
                        math = math + "6";
                        txtmaytinh.setText(math + "");

                        break;
                    case R.id.btn7:
                        math = math + "7";
                        txtmaytinh.setText(math + "");

                        break;
                    case R.id.btn8:
                        math = math + "8";
                        txtmaytinh.setText(math + "");

                        break;
                    case R.id.btn9:
                        math = math + "9";
                        txtmaytinh.setText(math + "");

                        break;
                    case R.id.btnbang:


                        break;
                    case R.id.btncong:
                        math = math + "+";
                        txtmaytinh.setText(math + "");
                        break;

                    case R.id.btntru:
                        math = math + "-";
                        txtmaytinh.setText(math + "");
                        break;
                    case R.id.btnnhan:
                        math = math + "*";
                        txtmaytinh.setText(math + "");
                        break;
                    case R.id.btnchia:
                        math = math + "/";
                        txtmaytinh.setText(math + "");
                        break;
                    case R.id.btnphantram:
                        math = math + "%";
                        txtmaytinh.setText(math + "");
                        break;
                    case R.id.btnphay:
                        math = math + ",";
                        txtmaytinh.setText(math + "");
                        break;
                    case R.id.btnce:

                        break;
                    case R.id.btnc:

                        break;
                }
            }
        };


        btn0.setOnClickListener(myClick);
        btn1.setOnClickListener(myClick);
        btn2.setOnClickListener(myClick);
        btn3.setOnClickListener(myClick);
        btn4.setOnClickListener(myClick);
        btn5.setOnClickListener(myClick);
        btn6.setOnClickListener(myClick);
        btn7.setOnClickListener(myClick);
        btn8.setOnClickListener(myClick);
        btn9.setOnClickListener(myClick);
        btncong.setOnClickListener(myClick);
        btntru.setOnClickListener(myClick);
        btnnha.setOnClickListener(myClick);
        btnchia.setOnClickListener(myClick);
        btnce.setOnClickListener(myClick);
        btnc.setOnClickListener(myClick);
        btnphantram.setOnClickListener(myClick);
        btnphay.setOnClickListener(myClick);
        btnbang.setOnClickListener(myClick);
    }
}
