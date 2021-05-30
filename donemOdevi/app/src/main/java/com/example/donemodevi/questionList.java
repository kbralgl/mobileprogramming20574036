package com.example.donemodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class questionList extends AppCompatActivity {

    TextView questionListNumber;
    int questionSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_list);

        questionListNumber = (TextView)findViewById(R.id.questionListNumber);
        questionRead();

    }
    //questionRead
    private void questionRead() {
        List<questionInfo> getquestionlist = sharedPreferencesFile.getquestionlist();
        if (getquestionlist != null){
            questionSize = getquestionlist.size();
            questionListNumber.setText("Sistemde Tanımlanan Soru Adedi : "+questionSize);
        }

    }
}