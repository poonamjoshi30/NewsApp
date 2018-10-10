package com.example.news.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.news.Adapter.TopRecyclerViewDataAdapter;
import com.example.news.R;
import com.example.news.TopRecyclerViewItem;

import java.util.ArrayList;
import java.util.List;

public class FragmentVedios extends Fragment {
    private List<TopRecyclerViewItem> carItemList = null;
    RecyclerView  rv_entertainment,rv_featured,rv_trending;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View RootView = inflater.inflate(R.layout.videos, container, false);
        initializeCarItemList();

        rv_entertainment = (RecyclerView)RootView.findViewById(R.id.rv_entertainment);
        rv_featured = (RecyclerView)RootView.findViewById(R.id.rv_featured);
        rv_trending = (RecyclerView)RootView.findViewById(R.id.rv_trending);
        // Create the recyclerview.
        fill(rv_featured);
        fill(rv_trending);
        fill(rv_entertainment);

        return RootView;
    }
    public void fill(RecyclerView rv){
        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(getActivity(), OrientationHelper.VERTICAL,false);
        rv.setLayoutManager(gridLayoutManager);
        TopRecyclerViewDataAdapter carDataAdapter = new TopRecyclerViewDataAdapter(carItemList);
        rv.setAdapter(carDataAdapter);
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
