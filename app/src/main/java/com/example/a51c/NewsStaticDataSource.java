package com.example.a51c;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewsStaticDataSource {
    private static List<NewsStory> topStories;
    private static List<NewsStory> news;

    static {
        topStories = new ArrayList<>();
        topStories.add(new NewsStory("Title 1", "Description 1", R.drawable.news1,
                Arrays.asList(new NewsStory("Related 1", "Description 1", R.drawable.news2, null),
                        new NewsStory("Related 2", "Description 2", R.drawable.news3, null),
                        new NewsStory("Related 3", "Description 3", R.drawable.news4, null))));
        topStories.add(new NewsStory("Title 2", "Description 2", R.drawable.news2,
                Arrays.asList(new NewsStory("Related 4", "Description 4", R.drawable.news3, null),
                        new NewsStory("Related 5", "Description 5", R.drawable.news4, null),
                        new NewsStory("Related 6", "Description 6", R.drawable.news1, null))));
        topStories.add(new NewsStory("Title 3", "Description 3", R.drawable.news3,
                Arrays.asList(new NewsStory("Related 7", "Description 7", R.drawable.news4, null),
                        new NewsStory("Related 8", "Description 8", R.drawable.news1, null),
                        new NewsStory("Related 9", "Description 9", R.drawable.news2, null))));
        topStories.add(new NewsStory("Title 4", "Description 3", R.drawable.news3,
                Arrays.asList(new NewsStory("Related 7", "Description 7", R.drawable.news4, null),
                        new NewsStory("Related 8", "Description 8", R.drawable.news1, null),
                        new NewsStory("Related 9", "Description 9", R.drawable.news2, null))));

        news = new ArrayList<>();
        news.add(new NewsStory("Title 4", "Description 4", R.drawable.news4,
                Arrays.asList(new NewsStory("Related 10", "Description 10", R.drawable.news3, null),
                        new NewsStory("Related 11", "Description 11", R.drawable.news2, null),
                        new NewsStory("Related 12", "Description 12", R.drawable.news1, null))));
        news.add(new NewsStory("Title 5", "Description 5", R.drawable.news1,
                Arrays.asList(new NewsStory("Related 13", "Description 13", R.drawable.news2, null),
                        new NewsStory("Related 14", "Description 14", R.drawable.news3, null),
                        new NewsStory("Related 15", "Description 15", R.drawable.news4, null))));
        news.add(new NewsStory("Title 6", "Description 6", R.drawable.news2,
                Arrays.asList(new NewsStory("Related 16", "Description 16", R.drawable.news4, null),
                        new NewsStory("Related 17", "Description 17", R.drawable.news1, null),
                        new NewsStory("Related 18", "Description 18", R.drawable.news3, null))));
        news.add(new NewsStory("Title 7", "Description 7", R.drawable.news2,
                Arrays.asList(new NewsStory("Related 16", "Description 16", R.drawable.news4, null),
                        new NewsStory("Related 17", "Description 17", R.drawable.news1, null),
                        new NewsStory("Related 18", "Description 18", R.drawable.news3, null))));
        news.add(new NewsStory("Title 8", "Description 7", R.drawable.news2,
                Arrays.asList(new NewsStory("Related 16", "Description 16", R.drawable.news4, null),
                        new NewsStory("Related 17", "Description 17", R.drawable.news1, null),
                        new NewsStory("Related 18", "Description 18", R.drawable.news3, null))));
        news.add(new NewsStory("Title 9", "Description 7", R.drawable.news2,
                Arrays.asList(new NewsStory("Related 16", "Description 16", R.drawable.news4, null),
                        new NewsStory("Related 17", "Description 17", R.drawable.news1, null),
                        new NewsStory("Related 18", "Description 18", R.drawable.news3, null))));
        news.add(new NewsStory("Title 10", "Description 7", R.drawable.news2,
                Arrays.asList(new NewsStory("Related 16", "Description 16", R.drawable.news4, null),
                        new NewsStory("Related 17", "Description 17", R.drawable.news1, null),
                        new NewsStory("Related 18", "Description 18", R.drawable.news3, null))));
        news.add(new NewsStory("Title 11", "Description 7", R.drawable.news2,
                Arrays.asList(new NewsStory("Related 16", "Description 16", R.drawable.news4, null),
                        new NewsStory("Related 17", "Description 17", R.drawable.news1, null),
                        new NewsStory("Related 18", "Description 18", R.drawable.news3, null))));
        news.add(new NewsStory("Title 12", "Description 7", R.drawable.news2,
                Arrays.asList(new NewsStory("Related 16", "Description 16", R.drawable.news4, null),
                        new NewsStory("Related 17", "Description 17", R.drawable.news1, null),
                        new NewsStory("Related 18", "Description 18", R.drawable.news3, null))));
    }

    public static List<NewsStory> getTopStories() {
        return topStories;
    }

    public static List<NewsStory> getNews() {
        return news;
    }

}
