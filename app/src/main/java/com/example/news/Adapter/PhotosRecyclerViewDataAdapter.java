package com.example.news.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.news.PhotosRecyclerViewItem;
import com.example.news.PhotosRecyclerViewItemHolder;
import com.example.news.R;

import java.util.List;

public class PhotosRecyclerViewDataAdapter extends RecyclerView.Adapter<PhotosRecyclerViewItemHolder> {

    private List<PhotosRecyclerViewItem> carItemList;

    public PhotosRecyclerViewDataAdapter(List<PhotosRecyclerViewItem> carItemList) {
        this.carItemList = carItemList;
    }

    @Override
    public PhotosRecyclerViewItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Get LayoutInflater object.
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        // Inflate the RecyclerView item layout xml.
        View carItemView = layoutInflater.inflate(R.layout.photos_card_view_item, parent, false);

        // Get car title text view object.

        // Get car image view object.
        final ImageView carImageView = (ImageView)carItemView.findViewById(R.id.card_view_image);
        // When click the image.
        carImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get car title text.

                // Create a snackbar and show it.

            }
        });

        // Create and return our custom Car Recycler View Item Holder object.
        PhotosRecyclerViewItemHolder ret = new PhotosRecyclerViewItemHolder(carItemView);
        return ret;
    }

    @Override
    public void onBindViewHolder(PhotosRecyclerViewItemHolder holder, int position) {
        if(carItemList!=null) {
            // Get car item dto in list.
            PhotosRecyclerViewItem carItem = carItemList.get(position);

            if(carItem != null) {
                // Set car item title.

                // Set car image resource id.
                holder.getCarImageView().setImageResource(carItem.getCarImageId());
            }
        }
    }

    @Override
    public int getItemCount() {
        int ret = 0;
        if(carItemList!=null)
        {
            ret = carItemList.size();
        }
        return ret;
    }
}