package com.example.android.tourguide_ludhiana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Avneet on 2017-08-07.
 */

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a custom array list
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Spice Club", "+91 161 444 4450", "11am - 11:30 pm", "Kartar Bhawan M.C. No. 2439/1284, Ferozepur Rd", "In Line with the Five Indian Elements, this restaurant serves classic dishes without meat"));
        words.add(new Word("Colonel's Cabin", "+91 161 245 3902", "11am - 11:30 pm", "3780, Ishmeet Singh Road", "Continental Cuisine"));
        words.add(new Word("Barbeque Nation", "+91 161 606 0000", "12 noon - 11:00 pm", "2nd Floor, Dhanraj Sing Complex, Ferozepur Road ", "All you can eat"));
        words.add(new Word("Kitchen at 95", "+91 161 407 1222", "7am - 11:30pm", " First Floor, Site No. 4, Ferozepur Road ", "Ideal for Groups"));
        words.add(new Word("Sagar Ratna", "+91 161 276 1763", "9:00 am - 11:30pm", "G.T. Road, Opp. Railway Station", "South Indian Cuisine"));
        words.add(new Word("Orient Blade", "+91 161 277 3000", "1:30 pm - 11:30pm", "Park Plaza Hotel, Bhai Bala Chowk, Ferozepur Road", "Refined restaurant with a menu including dishes from all over Asia"));
        words.add(new Word("The Yellow Chilli", "+91 161 461 0070", "11am - 11:30pm", "32C, SCF Sarabha Nagar, Main Market", "All you can eat Asian fare"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
