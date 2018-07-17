package sg.edu.rp.c346.basicmathformula;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;

    ArrayList<MovieItem> alMovieList;

    CustomAdapter caMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);

        alMovieList = new ArrayList<>();

        MovieItem movie1 = new MovieItem("Area of rectangle","Length x Length","Formula type is: Area");
        MovieItem movie2 = new MovieItem("Area of triangle","(Length of base x Length) / 2","Formula type is: Area");
        MovieItem movie3 = new MovieItem("Volume of cube","Length x Length x Length","Formula type is: Volume");
        alMovieList.add(movie1);
        alMovieList.add(movie2);
        alMovieList.add(movie3);

        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovieList);

        lvMovie.setAdapter(caMovie);


    }
}
