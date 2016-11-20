package id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.adapter.TipsAdapter;
import id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.baru.Tips;

/**
 * Created by Yess on 18/11/2016.
 */
public class TipsActivity extends AppCompatActivity {
    ArrayList<Tips> mList = new ArrayList<>();
    TipsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new TipsAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.tips);
        String[] arDeskripsi = resources.getStringArray(R.array.tips_details);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Tips(arJudul[i], arDeskripsi[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

}



