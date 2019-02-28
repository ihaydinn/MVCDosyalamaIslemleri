package com.ismailhakkiaydin.mvcdosyalamaislemleri;

import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileUtil {

    private Context _context;

    public FileUtil(Context context){
        _context = context;
    }

    public  void Write(String s){

        try {
            File dir = _context.getDir("Veri", Context.MODE_PRIVATE);
            File file = new File(dir,"Ziyaret.txt");
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
        } catch (FileNotFoundException e) {
            try {
                throw e;
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        }catch (IOException e){
            throw  e ;
        }
    }

}
