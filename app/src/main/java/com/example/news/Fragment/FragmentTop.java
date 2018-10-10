package com.example.news.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.news.Adapter.TopRecyclerViewDataAdapter;
import com.example.news.TopRecyclerViewItem;
import com.example.news.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentTop extends Fragment {
    private List<TopRecyclerViewItem> carItemList = null;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View RootView = inflater.inflate(R.layout.top, container, false);
        initializeCarItemList();

        // Create the recyclerview.
        RecyclerView carRecyclerView = (RecyclerView)RootView.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        // Set layout manager.
        carRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        TopRecyclerViewDataAdapter carDataAdapter = new TopRecyclerViewDataAdapter(carItemList);
        // Set data adapter.
        carRecyclerView.setAdapter(carDataAdapter);
        return RootView;
    }
    private void initializeCarItemList()
    {
        if(carItemList == null)
        {
            carItemList = new ArrayList<TopRecyclerViewItem>();
            carItemList.add(new TopRecyclerViewItem("The Delhi HC on Monday freed Mr. Navlakha from house arrest five weeks ", R.drawable.newsdp));
            carItemList.add(new TopRecyclerViewItem("Habeas corpus for rights activist Sudha Bharadwaj withdrawn", R.drawable.newsdp));
            carItemList.add(new TopRecyclerViewItem("Multiculturalism was robbing Britain of its communities, wrote Shaun Bailey", R.drawable.newsdp));
            carItemList.add(new TopRecyclerViewItem("Regarded a “fugitive” by the outgoing President Abdulla Yameen administration", R.drawable.newsdp));
            carItemList.add(new TopRecyclerViewItem("With security forces concentrating on other regions", R.drawable.newsdp));
            carItemList.add(new TopRecyclerViewItem("DMK president M.K.Stalin underwent a minor surgical procedure for removal of a cyst f  ", R.drawable.newsdp));
        }
    }
}
