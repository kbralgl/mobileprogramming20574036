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
}
