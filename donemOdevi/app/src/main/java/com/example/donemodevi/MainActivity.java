package com.example.donemodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.donemodevi.R;

public class MainActivity extends AppCompatActivity {

    EditText kullanici_adi ;
    EditText sifre ;
    Button gonder ;
    Button sign_up ;
    TextView yazi_metni ;
    int sayac=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defineVariables();

        initView();
        initEvent();

        gonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();

            }


        });
    }

    private void cleanTextBoxes(){
        kullanici_adi.setText("");
        sifre.setText("");
    }
    /*private boolean checkPerson(){
        for (person aPerson:persons)
    }*/
    private void defineVariables() {
        kullanici_adi = (EditText) findViewById(R.id.kullanici_adi);
        sifre = (EditText) findViewById(R.id.sifre);
        yazi_metni = (TextView) findViewById(R.id.yazi_metni);
        gonder = (Button) findViewById(R.id.gonder);
        sign_up = (Button) findViewById(R.id.sign_up);

    }
    private void initView() {
        //TODO 3 Java - Xml eşleştirmelerini initView metotu içerisinde yapıyoruz
        sign_up = (Button) findViewById(R.id.sign_up);
    }

    private void initEvent() {
        //TODO 4 Button onClick tanımlaması yapıyoruz

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, signup.class);

                //TODO 5.1 startActivity metoduna yazdığımız intent'i veriyoruz Bu şekilde diğer activity'ye geçeceğiz.
                startActivity(intent);
            }


        });


    }

    private void loginUser() {
        String kullanici_adi2 = kullanici_adi.getText().toString();
        String sifre2 = sifre.getText().toString();
        String yazi_metni2 = yazi_metni.getText().toString();

        //sayac = Integer.valueOf(yazi_metni2.getText().toString()) + 1;

        if (kullanici_adi2.equals("admin") && sifre2.equals("admin")){
            Toast.makeText(getApplicationContext(),"Doğru", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Yanlış", Toast.LENGTH_LONG).show();
            //yazi_metni.setText("Sayac : "+(sayac++));
            sayac++;

            if (sayac>3)
            {
                Toast.makeText(getApplicationContext(),"3 defa Yanlış girdin", Toast.LENGTH_LONG).show();
                gonder.setEnabled(false);

            }

        }

    }


}
