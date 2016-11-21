package id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.R;
import id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.baru.Tips;


/**
 * Created by Yess on 17/11/2016.
 */
public class TipsAdapter extends RecyclerView.Adapter<TipsAdapter.ViewHolder> {

    ArrayList<Tips> tipsList;
    ITipsAdapter mITipsAdapter;


    public TipsAdapter(Context context, ArrayList<Tips> tipsList) {
        this.tipsList = tipsList;
        mITipsAdapter=(ITipsAdapter) context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tipsss, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Tips tips = tipsList.get(position);
        holder.tvJudul.setText(tips.judul);
        holder.tvDeskripsi.setText(tips.deskripsi);
        holder.ivPict.setImageURI(Uri.parse(tips.pict));
    }

    @Override
    public int getItemCount() {

        if (tipsList != null)
            return tipsList.size();
        return 0;
    }

    public  interface ITipsAdapter
    {
        void doClick(int pos);
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul;
        TextView tvDeskripsi;
        ImageView ivPict;

        public ViewHolder(View tipsssView) {
            super(tipsssView);
            tvJudul = (TextView) tipsssView.findViewById(R.id.title);
            tvDeskripsi = (TextView) tipsssView.findViewById(R.id.describe);
            ivPict=(ImageView) tipsssView.findViewById(R.id.pictView);
            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    mITipsAdapter.doClick(getAdapterPosition());
                }
            }
            );
        }
    }

}

