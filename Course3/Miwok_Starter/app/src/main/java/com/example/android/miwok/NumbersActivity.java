package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /**
         * setTitle(R.string.category_numbers);
         * done it in manifests.xml
         *
         */

        //String[] words = {"one","two","three","four","five","six","seven","eight","nine","ten"};
        ArrayList<Word> words = new ArrayList<Word>();

        //Word[] test = new Word[10];
        //test[0] = new Word("asd","dsa");

        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight));
        words.add(new Word("nine", "wo’e", R.drawable.number_nine));
        words.add(new Word("ten", "na’aacha", R.drawable.number_ten));


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
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
// There should be a {@link ListView} with the view ID called list, which is declared in the
// word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);



// Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
// {@link ListView} will display list items for each word in the list of words.
// Do this by calling the setAdapter method on the {@link ListView} object and pass in
// 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);






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
