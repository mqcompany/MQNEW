package com.example.mq1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterMQ extends RecyclerView.Adapter<AdapterMQ.ViewMQ> {
    public Context context;
    public List<Read> read_list;

    public AdapterMQ(Context context, List<Read> read_list) {
        this.context = context;
        this.read_list = read_list;
    }

    @NonNull
    @Override
    public ViewMQ onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_element, viewGroup, false);
        return new ViewMQ(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewMQ viewMQ, int position) {
        Read read = read_list.get(position);
        Picasso.with(context).load(read.getImage()).into(viewMQ.imag_lenta);
        Picasso.with(context).load(read.getAvatar()).into(viewMQ.ic_round);
        viewMQ.nickname_lenta.setText(read.getName());
        viewMQ.title_lenta.setText(read.getTitle());
//        viewMQ.discription.setText(read.getDiscript());
    }

    @Override
    public int getItemCount() {
        return read_list.size();
    }

    public class ViewMQ extends RecyclerView.ViewHolder{
        public ImageView imag_lenta, ic_round;
        public TextView nickname_lenta, title_lenta, discription;
        public ViewMQ(@NonNull View itemView) {
            super(itemView);
            imag_lenta = (ImageView)itemView.findViewById(R.id.imag_lenta);
            ic_round = (ImageView)itemView.findViewById(R.id.ic_round);
            nickname_lenta = (TextView)itemView.findViewById(R.id.nickname_lenta);
            title_lenta = (TextView)itemView.findViewById(R.id.title_lenta);
//            discription = (TextView)itemView.findViewById(R.id.discription);
        }
    }
}
