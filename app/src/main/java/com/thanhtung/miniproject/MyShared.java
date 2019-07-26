package com.thanhtung.miniproject;

import android.content.Context;
import android.content.SharedPreferences;

public class MyShared {
    private SharedPreferences preferences;

    public MyShared(Context context) {
//        ten file Myshared
        preferences = context.getSharedPreferences("Myshared",Context.MODE_PRIVATE);

    }

    public void put(String key, String value){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key,value);
//        cap nhat gia tri
        editor.commit();
    }
    public String get(String key){
        return preferences.getString(key,"");
    }
    public void reset(){
        preferences.edit().clear().commit();
    }
}
