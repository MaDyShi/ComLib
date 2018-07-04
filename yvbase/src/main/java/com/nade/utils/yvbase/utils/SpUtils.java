package com.nade.utils.yvbase.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/**
 * 作者: Nade_S on 2018/7/4.
 */

public class SpUtils {
    public static  SharedPreferences sp;
    public static String PREFERENCE_NAME = "userlogin";
    Context context;

    public SpUtils(Context context) {
        this.context = context;
        getSpInstance(context);
    }

    public static SharedPreferences getSpInstance(Context context){
        if (null == sp){
            synchronized (SpUtils.class){
                if (null == sp){
                    sp = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
                }
            }
        }
        return sp;
    }

    public void setString(String key,String value){
        if (TextUtils.isEmpty(key))
            return;
        if (TextUtils.isEmpty(value))
            return;
        sp.edit().putString(key,value).commit();
    }
    public void setInt(String key,int value){
        if (TextUtils.isEmpty(key))
            return;
        sp.edit().putInt(key,value).commit();
    }
    public String getString(String key){
        String str = null;
        if (!TextUtils.isEmpty(key)) {
             str = sp.getString(key, "");
        }
        return str == null ? "" : str;
    }
    public int getInt(String key){
        int backInt = 0;
        if (!TextUtils.isEmpty(key)){
            backInt = sp.getInt(key,0);
        }
        return backInt;
    }
    public void setBool(String key,boolean bool){
        if (TextUtils.isEmpty(key))
            return;
        sp.edit().putBoolean(key,bool).commit();
    }
    public boolean getBool(String key){
        boolean bool = false;
        if (!TextUtils.isEmpty(key)){
            bool = sp.getBoolean(key,false);
        }
        return bool;
    }


}
