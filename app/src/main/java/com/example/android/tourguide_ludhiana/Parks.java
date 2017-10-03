package com.example.android.tourguide_ludhiana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Avneet on 2017-08-07.
 */

public class Parks extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);

            // Create a custom array list
            final ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("Nehru Rose Garden", "+91 72064 51251", "Open 24 hours", "Government College Rd", "Beautiful Park with local zoo"));
            words.add(new Word("Leisure Valley", "No phone number", "Open 24 hours", "16C, Convent School Rd", "Beautfiul park in the heart of the city"));
            words.add(new Word("Atam Park", "+91 98767 10054", "Open 24 hours", "Dugri Rd, Atam Nagar Police Station", "Small childrens park"));
            words.add(new Word("Chattar Singh Park", "No phone number", "Open 24 hours", "Ward No. 48, Park No 59, Model Town Rd", "Well maintained park"));
            words.add(new Word("Gur Mandi Maharaja Aggarsen Park", "No phone number", "Open 24 hours", "Aggrasen Chowk, Gur Mandi, Chaura Bazar", "Small park in the heart of the city"));
            words.add(new Word("Bedi Park", "No phone number", "Open 24 hours", "296, Model Town Extension", "Small park"));
            words.add(new Word("Neelimohar Park", "No phone number", "Open 24 hours", "39E, BRS Nagar Main Rd, Block C", "One of the best parks in Ludhiana"));

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
