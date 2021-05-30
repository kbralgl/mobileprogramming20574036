package com.example.donemodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class questionAdd extends AppCompatActivity {

    EditText questionText;
    EditText answer1, answer2, answer3, answer4;
    Button questionAdd;
    questionInfo newQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_add);
        questionText = (EditText) findViewById(R.id.questionText);
        answer1 = (EditText) findViewById(R.id.answer1);
        answer2 = (EditText) findViewById(R.id.answer2);
        answer3 = (EditText) findViewById(R.id.answer3);
        answer4 = (EditText) findViewById(R.id.answer4);
        questionAdd = (Button) findViewById(R.id.questionAdd);


        questionAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionSave();
            }
        });

        //
    }
        private void questionSave(){
            newQuestion = new questionInfo();

            newQuestion.setquestionText(questionText.getText().toString());
            newQuestion.setanswer1(answer1.getText().toString());
            newQuestion.setanswer2(answer2.getText().toString());
            newQuestion.setanswer3(answer3.getText().toString());
            newQuestion.setanswer4(answer4.getText().toString());

            List<questionInfo> questionList = sharedPreferencesFile.getquestionlist();
            if (questionList == null) {
                questionList = new ArrayList<>();
            }
            questionList.add(newQuestion);
            sharedPreferencesFile.putquestiontolist(questionList);

            Toast.makeText(MainActivity.main, "Soru Kaydedilmiştir.", Toast.LENGTH_SHORT).show();

        }

    }
