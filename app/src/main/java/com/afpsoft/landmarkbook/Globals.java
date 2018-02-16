package com.afpsoft.landmarkbook;

import android.graphics.Bitmap;

/**
 * Created by alipi on 16.02.2018.
 */

public class Globals {

    public static Globals instance;
    private Bitmap chosenImage;

    private Globals(){

    }

    public void setData(Bitmap chosenImage){
        this.chosenImage=chosenImage;
    }

    public Bitmap getData(){

        return this.chosenImage;
    }

    public static Globals getinstance(){

        if (instance ==null){

            instance = new Globals();
        }
        return instance;
    }
}
