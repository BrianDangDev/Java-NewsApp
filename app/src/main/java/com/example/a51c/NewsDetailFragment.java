package com.example.a51c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NewsDetailFragment extends Fragment {
    private NewsStory originalNewsStory;
    private NewsStory selectedRelatedNewsStory;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news_story, container, false);

        ImageView imageView = view.findViewById(R.id.news_image);
        TextView titleTextView = view.findViewById(R.id.news_title);
        TextView descriptionTextView = view.findViewById(R.id.news_description);
        RecyclerView relatedNewsRecyclerView = view.findViewById(R.id.related_news_recycler_view);

        // Set up the UI with data from the news story
        if (selectedRelatedNewsStory != null) {
            imageView.setImageDrawable(getResources().getDrawable(selectedRelatedNewsStory.getImageResourceId(), null));
            titleTextView.setText(selectedRelatedNewsStory.getTitle());
            descriptionTextView.setText(selectedRelatedNewsStory.getDescription());
        } else {
            imageView.setImageDrawable(getResources().getDrawable(originalNewsStory.getImageResourceId(), null));
            titleTextView.setText(originalNewsStory.getTitle());
            descriptionTextView.setText(originalNewsStory.getDescription());
        }

        // Set up the related news RecyclerView with its adapter
        NewsAdapter relatedNewsAdapter = new NewsAdapter(getContext(), originalNewsStory.getRelatedStories());
        relatedNewsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        relatedNewsRecyclerView.setAdapter(relatedNewsAdapter);

        return view;
    }

    public void setNewsStories(NewsStory originalNewsStory, NewsStory selectedRelatedNewsStory) {
        this.originalNewsStory = originalNewsStory;
        this.selectedRelatedNewsStory = selectedRelatedNewsStory;
    }
}

