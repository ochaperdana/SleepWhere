package id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.adapter.InfoAdapter;
import id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.baru.Info;


public class InfoActivity extends AppCompatActivity {

    ArrayList<Info> mList = new ArrayList<>();
    InfoAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(InfoActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new InfoAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        fillData();


    }

    private void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel :" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);

    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.tempat);
        String[] arDeskripsi = resources.getStringArray(R.array.des_tempat);
        String[] arDetail = resources.getStringArray(R.array.detail_tempat);
        TypedArray a = resources.obtainTypedArray(R.array.gambar_tempat);
        TypedArray z = resources.obtainTypedArray(R.array.panggil);
        Drawable[] arFoto = new Drawable[a.length()];
        // Drawable[] arpanggil = new Drawable[z.length()];
        for (int i = 0; i < arFoto.length; i++) {
            BitmapDrawable bd = (BitmapDrawable) a.getDrawable(i);
            RoundedBitmapDrawable rbd = RoundedBitmapDrawableFactory.create(getResources(), bd.getBitmap());
            rbd.setCircular(true);
            arFoto[i] = rbd;
        }
        a.recycle();
        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Info(arJudul[i], arDeskripsi[i], arDetail[i], arFoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

}

