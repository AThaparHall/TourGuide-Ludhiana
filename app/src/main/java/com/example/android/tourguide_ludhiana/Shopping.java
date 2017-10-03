package com.example.android.tourguide_ludhiana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Avneet on 2017-08-07.
 */

public class Shopping extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);

            // Create a custom array list
            final ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("Kala Mandir", "+91 98728 55555", "11am - 9:30pm", "Carnival Complex, The Mall Rd, Mall Enclave", "Designer Indian Garments for Ladies"));
            words.add(new Word("Roop Kala", "++91 161 241 2170", "10am - 10:30pm", "Near Mai Nand Kaur Gurudwara, Ghumar Mandi", "Casual and Formal Indian dresses"));
            words.add(new Word("West End Mall", "+91 161 444 4450", "9:30am - 11:00pm", "Ferozpur Road, Bhai Randhir Singh Nagar", "Mid range mall with cinema and food court"));
            words.add(new Word("Shabnam's Ludhiana", "+91 99144 03741", "10am - 8:30pm", "Lower Ground Floor Opp. Chawla's Veg. Restaurant", "Bridal wear"));
            words.add(new Word("Nilibar", "+91 161 500 0000", "10am - 7:30pm", "1st Floor, Surya Tower, Mall Road", "Bridal Shop"));
            words.add(new Word("Meena Bazaar", "+91 161 444 4450", "11am - 11:30pm", "42-43, The Westend Mall, Firozpur Road", "Indian Formal Wear"));
            words.add(new Word("Fashion Femina", "+91 161 458 999", "11am - 11:30pm", "Firozpur Road opp Fountain Chowk", "Casual Wear"));

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
