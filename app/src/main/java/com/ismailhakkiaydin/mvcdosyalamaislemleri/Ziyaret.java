package com.ismailhakkiaydin.mvcdosyalamaislemleri;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

public class Ziyaret {

    private Date zaman;
    private String kimlik, aciklama;
    private boolean ispersonel;

    public Date getZaman() {
        return zaman;
    }

    public String getKimlik() {
        return kimlik;
    }

    public void setKimlik(String kimlik) {
        this.kimlik = kimlik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public boolean isIspersonel() {
        return ispersonel;
    }

    public void setIspersonel(boolean ispersonel) {
        this.ispersonel = ispersonel;
    }

    public Ziyaret(String kimlik, String aciklama, boolean ispersonel) {
        this.kimlik = kimlik;
        this.aciklama = aciklama;
        this.ispersonel = ispersonel;
    }

    @Override
    public String toString() {

        JSONObject json = new JSONObject();

        try {

            json.put("Stuff", ispersonel);
            json.put("Identity", kimlik);
            json.put("Description", aciklama);
            json.put("DateTime", zaman);

        }catch (JSONException e){
            Log.e("HATA",e.getMessage());
        }


        return json.toString();
    }
}
