package com.github.artembondar.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.github.artembondar.myrecyclerview.adapter.MoviesAdapter;
import com.github.artembondar.myrecyclerview.adapter.decoration.DividerItemDecoration;
import com.github.artembondar.myrecyclerview.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movies = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new MoviesAdapter(movies);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015");
        movies.add(movie);

        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015");
        movies.add(movie);

        movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movies.add(movie);

        movie = new Movie("Shaun the Sheep", "Animation", "2015");
        movies.add(movie);

        movie = new Movie("The Martian", "Science Fiction & Fantasy", "2015");
        movies.add(movie);

        movie = new Movie("Mission: Impossible Rogue Nation", "Action", "2015");
        movies.add(movie);

        movie = new Movie("Up", "Animation", "2009");
        movies.add(movie);

        movie = new Movie("Star Trek", "Science Fiction", "2009");
        movies.add(movie);

        movie = new Movie("The LEGO Movie", "Animation", "2014");
        movies.add(movie);

        movie = new Movie("Iron Man", "Action & Adventure", "2008");
        movies.add(movie);

        movie = new Movie("Aliens", "Science Fiction", "1986");
        movies.add(movie);

        movie = new Movie("Chicken Run", "Animation", "2000");
        movies.add(movie);

        movie = new Movie("Back to the Future", "Science Fiction", "1985");
        movies.add(movie);

        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movies.add(movie);

        movie = new Movie("Goldfinger", "Action & Adventure", "1965");
        movies.add(movie);

        movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movies.add(movie);

        adapter.notifyDataSetChanged();
    }
}
