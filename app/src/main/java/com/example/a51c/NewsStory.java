package com.example.a51c;

import java.util.ArrayList;
import java.util.List;

public class NewsStory {
    private String title;
    private String description;
    private int imageResourceId;
    private List<NewsStory> relatedStories;

    public NewsStory(String title, String description, int imageResourceId, List<NewsStory> relatedStories) {
        this.title = title;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.relatedStories = relatedStories;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public List<NewsStory> getRelatedStories() {
        if (relatedStories == null) {
            relatedStories = new ArrayList<>();
        }
        return relatedStories;
    }

}
