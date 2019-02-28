package com.ismailhakkiaydin.mvcdosyalamaislemleri;

import android.annotation.SuppressLint;
import android.widget.EditText;
import android.widget.RadioButton;

public class ZiyaretciController {

    private MainActivity activity;

    public ZiyaretciController(MainActivity activity){
        this.activity=activity;
    }

    public Ziyaret getZiyaret(){
        String kimlik = ((EditText)activity.findViewById(R.id.editText)).getText().toString();
        String aciklama = ((EditText)activity.findViewById(R.id.editText2)).getText().toString();

        boolean ispersonel = ((RadioButton)activity.findViewById(R.id.radioButton)).isChecked();

        return new Ziyaret(kimlik,aciklama,ispersonel);
    }

}
