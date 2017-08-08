package com.example.android.tourguide_ludhiana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Avneet on 2017-08-07.
 */

public class Pictures extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);

            // Create a custom array list
            final ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("Spice Club", "+91 161 444 4450", "11am - 11:30pm", "Address", "Info"));
            words.add(new Word("Spice Club", "+91 161 444 4450", "11am - 11:30pm", "Address", "Info"));
            words.add(new Word("Spice Club", "+91 161 444 4450", "11am - 11:30pm", "Address", "Info"));
            words.add(new Word("Spice Club", "+91 161 444 4450", "11am - 11:30pm", "Address", "Info" ));
            words.add(new Word("Spice Club", "+91 161 444 4450", "11am - 11:30pm", "Address", "Info" ));
            words.add(new Word("Spice Club", "+91 161 444 4450", "11am - 11:30pm", "Address", "Info" ));
            words.add(new Word("Spice Club", "+91 161 444 4450", "11am - 11:30pm", "Address", "Info" ));
            words.add(new Word("Spice Club", "+91 161 444 4450", "11am - 11:30pm", "Address", "Info" ));
            words.add(new Word("Spice Club", "+91 161 444 4450", "11am - 11:30pm", "Address", "Info" ));
            words.add(new Word("Spice Club", "+91 161 444 4450", "11am - 11:30pm", "Address", "Info" ));
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
