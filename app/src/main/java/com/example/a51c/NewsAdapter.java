package com.example.a51c ;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    private List<NewsStory> newsStories;
    private Context context;

    public NewsAdapter(Context context, List<NewsStory> newsStories) {
        this.context = context;
        this.newsStories = newsStories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news_story, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NewsStory newsStory = newsStories.get(position);
        holder.imageView.setImageDrawable(context.getResources().getDrawable(newsStory.getImageResourceId(), null));
        holder.titleTextView.setText(newsStory.getTitle());

    }

    @Override
    public int getItemCount() {
        return newsStories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView imageView;
        private TextView titleTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ivNewsImage);
            titleTextView = itemView.findViewById(R.id.tvNewsTitle);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            NewsStory relatedNewsStory = newsStories.get(getAdapterPosition());
            NewsStory newsStory = newsStories.get(getAdapterPosition());
            NewsDetailFragment fragment = new NewsDetailFragment();
            fragment.setNewsStories(relatedNewsStory,  relatedNewsStory);
            FragmentTransaction transaction = ((FragmentActivity) context).getSupportFragmentManager().beginTransaction();
            transaction.replace(android.R.id.content, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }


    }
}