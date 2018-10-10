package com.example.news;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.news.R;

public class PhotosRecyclerViewItemHolder extends RecyclerView.ViewHolder {



    private ImageView carImageView = null;

    public PhotosRecyclerViewItemHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {


            carImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
    }



    public ImageView getCarImageView() {
        return carImageView;
    }
}