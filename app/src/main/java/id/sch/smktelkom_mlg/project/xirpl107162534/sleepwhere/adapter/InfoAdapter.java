package id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.R;
import id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.baru.Info;

/**
 * Created by Smktelkom on 11/12/2016.
 */

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder> {

    ArrayList<Info> infoList;


    public InfoAdapter(ArrayList<Info> infoList) {
        this.infoList = infoList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.info,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Info info = infoList.get(position);
        holder.tvJudul.setText(info.judul);
        holder.tvDeskripsi.setText(info.deskripsi);
        holder.tvDetail.setText(info.detail);
        holder.ivFoto.setImageDrawable(info.foto);
    }

    @Override
    public int getItemCount() {

        if (infoList !=null)
            return  infoList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;
        TextView tvDetail;
        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudultips);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsitips);
            tvDetail = (TextView) itemView.findViewById(R.id.textViewDetail);
        }
    }

}
