package com.example.news.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.news.Adapter.PhotosRecyclerViewDataAdapter;
import com.example.news.Adapter.TopRecyclerViewDataAdapter;
import com.example.news.PhotosRecyclerViewItem;
import com.example.news.TopRecyclerViewItem;
import com.example.news.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentPhotos extends Fragment {
    private List<PhotosRecyclerViewItem> carItemList = null;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View RootView = inflater.inflate(R.layout.top, container, false);
        initializeCarItemList();

        // Create the recyclerview.
        RecyclerView carRecyclerView = (RecyclerView)RootView.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        // Set layout manager.
        carRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        PhotosRecyclerViewDataAdapter carDataAdapter = new PhotosRecyclerViewDataAdapter(carItemList);
        // Set data adapter.
        carRecyclerView.setAdapter(carDataAdapter);
        return RootView;
    }
    private void initializeCarItemList()
    {
        if(carItemList == null)
        {
            carItemList = new ArrayList<PhotosRecyclerViewItem>();
            carItemList.add(new PhotosRecyclerViewItem( R.drawable.newsdp));
            carItemList.add(new PhotosRecyclerViewItem( R.drawable.newsdp));
            carItemList.add(new PhotosRecyclerViewItem( R.drawable.newsdp));
            carItemList.add(new PhotosRecyclerViewItem( R.drawable.newsdp));
            carItemList.add(new PhotosRecyclerViewItem( R.drawable.newsdp));
            carItemList.add(new PhotosRecyclerViewItem(R.drawable.newsdp));
        }
    }
}
