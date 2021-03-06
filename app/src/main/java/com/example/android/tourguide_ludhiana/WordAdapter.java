package com.example.android.tourguide_ludhiana;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Avneet on 2017-08-08.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    /**
     * Create a new WordAdapter
     */

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID location_name.
        TextView locationName = (TextView) listItemView.findViewById(R.id.location_name);
        // Get the Name from the currentWord object and set this text on
        // the LocationName TextView.
        locationName.setText(currentWord.getName());

        // Find the TextView in the list_item.xml layout with the ID default_phone.
        TextView phone = (TextView) listItemView.findViewById(R.id.default_phone);
        // Get the Phone translation from the currentWord object and set this text on
        // the DefaultPhone TextView.
        phone.setText(currentWord.getPhone());

        // Find the TextView in the list_item.xml layout with the ID default_timings.
        TextView timings = (TextView) listItemView.findViewById(R.id.default_timings);
        // Get the Timings translation from the currentWord object and set this text on
        // the DefaultTimings TextView.
        timings.setText(currentWord.getTimings());

        // Find the TextView in the list_item.xml layout with the ID default_phone.
        TextView info = (TextView) listItemView.findViewById(R.id.default_info);
        // Get the Phone translation from the currentWord object and set this text on
        // the DefaultPhone TextView.
        info.setText(currentWord.getInfo());

        // Find the TextView in the list_item.xml layout with the ID default_address.
        TextView address = (TextView) listItemView.findViewById(R.id.default_address);
        // Get the Address translation from the currentWord object and set this text on
        // the DefaultAddress TextView.
        address.setText(currentWord.getAddress());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        return listItemView;

    }
}