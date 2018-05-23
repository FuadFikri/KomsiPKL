package com.komsi.komsipkl;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class KegiatanAdapter extends RecyclerView.Adapter<KegiatanAdapter.KegiatanViewHolder>{
    private ArrayList<Kegiatan> dataList;

    public KegiatanAdapter(ArrayList<Kegiatan> dataList) {
        this.dataList = dataList;
    }

    @Override
    public KegiatanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_kegiatan, parent, false);
        return new KegiatanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(KegiatanViewHolder holder, int position) {
        holder.txtKegiatan.setText(dataList.get(position).getkegiatan());
        holder.txtDeskripsi.setText(dataList.get(position).getDeskripsi());
//        holder.txt.setText(dataList.get(position).getTanggal());
        holder.txtStatus.setText(dataList.get(position).getTanggal());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class KegiatanViewHolder extends RecyclerView.ViewHolder{
        private TextView txtKegiatan, txtDeskripsi, txtStatus;

        public KegiatanViewHolder(View itemView) {
            super(itemView);
            txtKegiatan = (TextView) itemView.findViewById(R.id.txt_kegiatan);
            txtDeskripsi = (TextView) itemView.findViewById(R.id.txt_deskripsi);
            txtStatus = (TextView) itemView.findViewById(R.id.txt_status);
        }
    }

}
