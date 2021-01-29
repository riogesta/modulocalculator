package com.rgst.modulocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText edit1, edit2;
    TextView v_sum;

    int sum=0;
    int satu=0, dua=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.buttonHitung);
        edit1 = findViewById(R.id.editText1);
        edit2 = findViewById(R.id.editText2);
        v_sum = findViewById(R.id.textView);



        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Boolean is = true;
                while(is) {
                    if (TextUtils.isEmpty(edit1.getText().toString())) {
                        Toast.makeText(MainActivity.this, "inputan tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if (TextUtils.isEmpty(edit2.getText().toString())) {
                        Toast.makeText(MainActivity.this, "inputan tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    is = false;
                }

                satu = Integer.parseInt(edit1.getText().toString().trim());
                dua = Integer.parseInt(edit2.getText().toString().trim());

                sum = satu % dua;

                v_sum.setText(String.valueOf(sum));
            }
        });





    }
}