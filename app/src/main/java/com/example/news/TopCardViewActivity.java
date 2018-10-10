package com.example.news;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.news.Adapter.TopRecyclerViewDataAdapter;
import com.example.news.R;

import java.util.ArrayList;
import java.util.List;

public class TopCardViewActivity extends AppCompatActivity {

    private List<TopRecyclerViewItem> carItemList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top);

        setTitle("dev2qa.com - Android CardView Example.");

        initializeCarItemList();

        // Create the recyclerview.
        RecyclerView carRecyclerView = (RecyclerView)findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        // Set layout manager.
        carRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        TopRecyclerViewDataAdapter carDataAdapter = new TopRecyclerViewDataAdapter(carItemList);
        // Set data adapter.
        carRecyclerView.setAdapter(carDataAdapter);

    }

    /* Initialise car items in list. */
    private void initializeCarItemList()
    {
        if(carItemList == null)
        {
            carItemList = new ArrayList<TopRecyclerViewItem>();
            carItemList.add(new TopRecyclerViewItem("The Delhi HC on Monday freed Mr. Navlakha from house arrest five weeks after he was arrested in connection with the Bhima-Koregaon case", R.drawable.newsdp));
            carItemList.add(new TopRecyclerViewItem("Habeas corpus for rights activist Sudha Bharadwaj withdrawn", R.drawable.newsdp));
            carItemList.add(new TopRecyclerViewItem("Multiculturalism was robbing Britain of its communities, wrote Shaun Bailey", R.drawable.newsdp));
            carItemList.add(new TopRecyclerViewItem("Regarded a “fugitive” by the outgoing President Abdulla Yameen administration, the former president has been living in exile the last couple of years", R.drawable.newsdp));
            carItemList.add(new TopRecyclerViewItem("With security forces concentrating on other regions, it appears to have worked in favour of the Maoists", R.drawable.newsdp));
            carItemList.add(new TopRecyclerViewItem("DMK president M.K.Stalin underwent a minor surgical procedure for removal of a cyst from his right thigh at Apollo Hospitals. He will be discharged this afternoon, according to a statement issued ", R.drawable.newsdp));
        }
    }
}