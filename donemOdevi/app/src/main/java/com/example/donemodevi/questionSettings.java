package com.example.donemodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class questionSettings extends AppCompatActivity {

    EditText sinavSuresi, soruPuani, zorlukDuzeyi;
    Button savesettingsbutton;
    settings newSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_settings);
        sinavSuresi = (EditText)findViewById(R.id.sinavSuresi);
        soruPuani = (EditText)findViewById(R.id.soruPuani);
        zorlukDuzeyi = (EditText)findViewById(R.id.zorlukDuzeyi);
        savesettingsbutton = (Button)findViewById(R.id.savesettingsbutton);
        settingsRead();
        savesettingsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settingsSave();
            }
        });

    }

    private void settingsSave() {
        newSettings = new settings();

        newSettings.setsinavSuresi(sinavSuresi.getText().toString());
        newSettings.setsoruPuani(soruPuani.getText().toString());
        newSettings.setzorlukDuzeyi(zorlukDuzeyi.getText().toString());

        List<settings> settingsList = sharedPreferencesFile.getsettinglist();
        if (settingsList == null) {
            settingsList = new ArrayList<>();
        }
        settingsList.add(newSettings);
        sharedPreferencesFile.putsettingtolist(settingsList);

        Toast.makeText(MainActivity.main, "Ayarlarınız Kaydedilmiştir.", Toast.LENGTH_SHORT).show();

    }

    private void settingsRead() {
        List<settings> settingsList = sharedPreferencesFile.getsettinglist();
        if (settingsList != null){
            settings settingsInfo = settingsList.get(settingsList.size()-1);
            sinavSuresi.setText(settingsInfo.getsinavSuresi());
            soruPuani.setText(settingsInfo.getsoruPuani());
            zorlukDuzeyi.setText(settingsInfo.getzorlukDuzeyi());

        }

    }

}