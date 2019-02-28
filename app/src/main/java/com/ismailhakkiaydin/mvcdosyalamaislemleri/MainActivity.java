package com.ismailhakkiaydin.mvcdosyalamaislemleri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    private ZiyaretciController adp;

    private void init(){
        adp = new ZiyaretciController(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void btnKaydet(View v){
        FileUtil fu = new FileUtil(this);
        fu.Write(adp.getZiyaret().toString());

    }

}
