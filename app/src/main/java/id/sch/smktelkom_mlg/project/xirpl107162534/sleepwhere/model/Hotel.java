package id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.model;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by Smktelkom on 10/28/2016.
 */

public class Hotel implements Serializable{
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto)
    {
        this.judul=judul;
        this.deskripsi=deskripsi;
        this.foto=foto;
    }

}
