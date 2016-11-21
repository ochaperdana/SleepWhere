package id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.baru;

import java.io.Serializable;

/**
 * Created by Yess on 17/11/2016.
 */

public class Tips implements Serializable{
    public String judul;
    public String deskripsi;
    public String pict;

    public Tips(String judul, String deskripsi, String pict) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.pict=pict;

    }


}
