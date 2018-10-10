package com.example.news.Adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.news.NavDrawerItem;

import java.util.Collections;
import java.util.List;
import com.example.news.R;

public class NavigationDrawerAdapter extends RecyclerView.Adapter<NavigationDrawerAdapter.MyViewHolder> {
    List<NavDrawerItem> data = Collections.emptyList();
    private LayoutInflater inflater;
    private Context context;
    int Icon[];

    public NavigationDrawerAdapter(Context context, List<NavDrawerItem> data, int Icon[]) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
        this.Icon = Icon;
    }

    public void delete(int position) {
        data.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.nav_drawer_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        NavDrawerItem current = data.get(position);
        Typeface tf = Typeface.createFromAsset(context.getAssets(),
                "fonts/Raleway-Regular.ttf");

        holder.imageView.setImageResource(Icon[position]);
        holder.title.setText(current.getTitle());
        holder.title.setTypeface(tf, Typeface.BOLD);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);

        }
    }
}