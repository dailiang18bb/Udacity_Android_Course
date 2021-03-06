/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);




        TextView mNumbersView = (TextView) findViewById(R.id.numbers);
        TextView mFamilyView = (TextView) findViewById(R.id.family);
        TextView mColorsView = (TextView) findViewById(R.id.colors);
        TextView mPhrasesView = (TextView) findViewById(R.id.phrases);


        mNumbersView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //put the actions here
                Intent i = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(i);
            }
        });




        mFamilyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //put the actions here
                Intent i = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(i);
            }
        });

        mColorsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //put the actions here
                Intent i = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(i);
            }
        });

        mPhrasesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //put the actions here
                Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(i);
            }
        });


    }


//    public void openNumberAct(View view) {
//        Intent i = new Intent(this, NumbersActivity.class);
//        startActivity(i);
//    }


}
