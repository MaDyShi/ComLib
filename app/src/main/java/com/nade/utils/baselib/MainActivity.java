package com.nade.utils.baselib;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.nade.utils.yvbase.utils.SpUtils;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SpUtils spUtils = new SpUtils(this);
        spUtils.setString("maoge","shide");
        spUtils.setInt("age",25);
        Log.d("tag", "onCreate: sp----"+ spUtils.getString("maoge")+"//"+spUtils.getInt("age"));


    }


}
