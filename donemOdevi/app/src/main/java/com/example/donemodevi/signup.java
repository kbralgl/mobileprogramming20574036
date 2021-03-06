package com.example.donemodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class signup extends AppCompatActivity {

    EditText name, surname, phoneNumber, email, password, password2;
    Button signup;
    person newuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        defineVariables();
        //initView();
        //initEvent();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control();
                Intent intent = new Intent(signup.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void control() {
        newuser = new person();

        newuser.setName(name.getText().toString());
        newuser.setSurname(surname.getText().toString());
        newuser.setUserName(email.getText().toString());
        newuser.setPassword(password.getText().toString());

        List<person> persons = sharedPreferencesFile.getPersonsList();
        if (persons == null) {
            persons = new ArrayList<>();
        }
        persons.add(newuser);
        sharedPreferencesFile.putUserToList(persons);

        Toast.makeText(MainActivity.main, "Kaydınız başarıyla oluşturuldu.", Toast.LENGTH_SHORT).show();
        //String parola1 = password.getText().toString();
        //String parola2 = password2.getText().toString();
        //if (parola1 != parola2) {
           // Toast.makeText(getApplicationContext(), "Girilen şifreler aynı değil", Toast.LENGTH_SHORT).show();
        //}
    }


    private void defineVariables() {
        name = (EditText) findViewById(R.id.name);
        surname = (EditText) findViewById(R.id.surname);
        phoneNumber = (EditText) findViewById(R.id.phoneNumber);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        password2 = (EditText) findViewById(R.id.password2);
        signup = (Button) findViewById(R.id.signup);

    }

    /*private void initView() {
        //TODO 3 Java - Xml eşleştirmelerini initView metotu içerisinde yapıyoruz
        signup = (Button) findViewById(R.id.signup);
    }*/

    /*private void initEvent() {
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Intent intent = new Intent(signup.this, MainActivity.class);
                //startActivity(intent);
            }


        });
    }*/
}