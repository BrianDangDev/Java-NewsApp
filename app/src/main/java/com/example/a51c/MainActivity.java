package com.example.a51c;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView topStoriesRecyclerView;
    private RecyclerView newsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topStoriesRecyclerView = findViewById(R.id.top_stories_recycler_view);
        newsRecyclerView = findViewById(R.id.news_recycler_view);

        // Set up the top stories and news RecyclerViews with their respective adapters
        NewsAdapter topStoriesAdapter = new NewsAdapter(this, NewsStaticDataSource.getTopStories());
        topStoriesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        topStoriesRecyclerView.setAdapter(topStoriesAdapter);

        NewsAdapter newsAdapter = new NewsAdapter(this, NewsStaticDataSource.getNews());
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false);
        newsRecyclerView.setLayoutManager(layoutManager);
        newsRecyclerView.setAdapter(newsAdapter);

    }
}
