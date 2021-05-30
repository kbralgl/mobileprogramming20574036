package com.example.donemodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class examAdd extends AppCompatActivity {

    Button sendmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_add);

        sendmail = (Button)findViewById(R.id.sendmail);
        sendmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendMail = new Intent(Intent.ACTION_SEND);
                sendMail.setType("text/plain");
                sendMail.putExtra(Intent.EXTRA_SUBJECT, "SORULAR");
                startActivity(sendMail);
            }
        });
    }
}