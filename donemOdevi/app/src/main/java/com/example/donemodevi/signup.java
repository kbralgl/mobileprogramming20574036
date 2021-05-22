package com.example.donemodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    EditText name, surname, phoneNumber, birthday, password, password2;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        defineVariables();
        initView();
        initEvent();
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control();
            }
        });

    }

    private void control() {
        String parola1 = password.getText().toString();
        String parola2 = password2.getText().toString();
        if (parola1 != parola2) {
            Toast.makeText(getApplicationContext(), "Girilen şifreler aynı değil", Toast.LENGTH_SHORT).show();
        }
    }


    private void defineVariables() {
        name = (EditText) findViewById(R.id.name);
        surname = (EditText) findViewById(R.id.surname);
        phoneNumber = (EditText) findViewById(R.id.phoneNumber);
        birthday = (EditText) findViewById(R.id.birthday);
        password = (EditText) findViewById(R.id.password);
        password2 = (EditText) findViewById(R.id.password2);
        signup = (Button) findViewById(R.id.signup);

    }

    private void initView() {
        //TODO 3 Java - Xml eşleştirmelerini initView metotu içerisinde yapıyoruz
        signup = (Button) findViewById(R.id.signup);
    }

    private void initEvent() {
        //TODO 4 Button onClick tanımlaması yapıyoruz

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, MainActivity.class);

                //TODO 5.1 startActivity metoduna yazdığımız intent'i veriyoruz Bu şekilde diğer activity'ye geçeceğiz.
                startActivity(intent);
            }


        });
    }
}