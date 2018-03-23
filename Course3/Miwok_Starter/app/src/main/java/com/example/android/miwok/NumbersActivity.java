package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        /**
         * setTitle(R.string.category_numbers);
         * done it in manifests.xml
         *
         */

        //String[] words = {"one","two","three","four","five","six","seven","eight","nine","ten"};
        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");


        //LinearLayout rootView = findViewById(R.id.rootView);

        /*
        int i = 0;
        while (i < words.size()) {
            TextView textView = new TextView(this);
            textView.setText(words.get(i));
            rootView.addView(textView);
            i++;
        }
        */


// Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
// adapter knows how to create layouts for each item in the list, using the
// simple_list_item_1.xml layout resource defined in the Android framework.
// This list item layout contains a single {@link TextView}, which the adapter will set to
// display a single word.
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
// There should be a {@link ListView} with the view ID called list, which is declared in the
// activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
// Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
// {@link ListView} will display list items for each word in the list of words.
// Do this by calling the setAdapter method on the {@link ListView} object and pass in
// 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);



        /*
        for(int k = 0; k< words.size();k++){
            TextView textView = new TextView(this);
            textView.setText(words.get(k));
            rootView.addView(textView);
        }
        */


        /*
        for(int i = 0; i < 10; i++){
            Log.v("NumbersActivity", "word at index " + i+ ": " + words.get(i));
        }
        */

    }
}
