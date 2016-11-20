package id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.R;
import id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.baru.Tips;


/**
 * Created by Yess on 17/11/2016.
 */
public class TipsAdapter extends RecyclerView.Adapter<TipsAdapter.ViewHolder> {

    ArrayList<Tips> tipsList;


    public TipsAdapter(ArrayList<Tips> tipsList) {
        this.tipsList = tipsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tips, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Tips tips = tipsList.get(position);
        holder.tvJudul.setText(tips.judul);
        holder.tvDeskripsi.setText(tips.deskripsi);
    }

    @Override
    public int getItemCount() {

        if (tipsList != null)
            return tipsList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudultips);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsitips);
        }
    }

}

