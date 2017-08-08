package com.example.android.tourguide_ludhiana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the restaurants category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantsActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, Restaurants.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the Parks category
        TextView parks = (TextView) findViewById(R.id.parks);

        // Set a click listener on that View
        parks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the parks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ParksActivity}
                Intent parksIntent = new Intent(MainActivity.this, Parks.class);

                // Start the new activity
                startActivity(parksIntent);
            }
        });

        // Find the View that shows the Pictures category
        TextView pictures = (TextView) findViewById(R.id.pictures);

        // Set a click listener on that View
        pictures.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pictures category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PicturesActivity}
                Intent picturesIntent = new Intent(MainActivity.this, Pictures.class);

                // Start the new activity
                startActivity(picturesIntent);
            }
        });

        // Find the View that shows the Shopping category
        TextView shopping = (TextView) findViewById(R.id.shopping);

        // Set a click listener on that View
        shopping.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the parks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShoppingActivity}
                Intent shoppingIntent = new Intent(MainActivity.this, Shopping.class);

                // Start the new activity
                startActivity(shoppingIntent);
            }
        });

    }
}
