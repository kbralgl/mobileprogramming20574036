package com.example.donemodevi;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class sharedPreferencesFile {
    public static final String prefUser = "person";
    public static final String keys = "item";
    public static final String prefsettings = "settings";
    public static final String prefquestion = "questionInfo";

    public static void putUserToList(List<person> userList) {
        Gson gson = new Gson();
        SharedPreferences preferences = MainActivity.main.getSharedPreferences(prefUser, Context.MODE_PRIVATE);
        List<person> listWillBePut = new ArrayList<>();
        if (userList != null) {
            for (person user : userList) {
                listWillBePut.add(user);
            }
        }
        preferences.edit().putString(keys, gson.toJson(listWillBePut)).apply();
    }

    public static List<person> getPersonsList() {
        try {
            Gson gson = new Gson();
            SharedPreferences preferences = MainActivity.main.getSharedPreferences(prefUser, Context.MODE_PRIVATE);
            Type typeOfT = TypeToken.getParameterized(List.class, person.class).getType();
            String json = preferences.getString(keys, null);
            if (json != null)
                return gson.fromJson(json, typeOfT);
            else
                return null;
        } catch (Exception e) {
            return null;
        }
    }


    //for questions settings
    public static void putsettingtolist(List<settings> settingsList) {
        Gson gson = new Gson();
        SharedPreferences preferences = MainActivity.main.getSharedPreferences(prefUser, Context.MODE_PRIVATE);
        List<settings> listWillBePut = new ArrayList<>();
        if (settingsList != null) {
            for (settings settingsObject : settingsList) {
                listWillBePut.add(settingsObject);
            }
        }
        preferences.edit().putString(prefsettings, gson.toJson(listWillBePut)).apply();
    }

    public static List<settings> getsettinglist() {
        try {
            Gson gson = new Gson();
            SharedPreferences preferences = MainActivity.main.getSharedPreferences(prefUser, Context.MODE_PRIVATE);
            Type typeOfT = TypeToken.getParameterized(List.class, settings.class).getType();
            String json = preferences.getString(prefsettings, null);
            if (json != null)
                return gson.fromJson(json, typeOfT);
            else
                return null;
        } catch (Exception e) {
            return null;
        }
    }


    //for questions add
    public static void putquestiontolist(List<questionInfo> questionInfoList) {
        Gson gson = new Gson();
        SharedPreferences preferences = MainActivity.main.getSharedPreferences(prefUser, Context.MODE_PRIVATE);
        List<questionInfo> listWillBePut = new ArrayList<>();
        if (questionInfoList != null) {
            for (questionInfo questionObject : questionInfoList) {
                listWillBePut.add(questionObject);
            }
        }
        preferences.edit().putString(prefquestion, gson.toJson(listWillBePut)).apply();
    }

    public static List<questionInfo> getquestionlist() {
        try {
            Gson gson = new Gson();
            SharedPreferences preferences = MainActivity.main.getSharedPreferences(prefUser, Context.MODE_PRIVATE);
            Type typeOfT = TypeToken.getParameterized(List.class, settings.class).getType();
            String json = preferences.getString(prefquestion, null);
            if (json != null)
                return gson.fromJson(json, typeOfT);
            else
                return null;
        } catch (Exception e) {
            return null;
        }
    }
}
