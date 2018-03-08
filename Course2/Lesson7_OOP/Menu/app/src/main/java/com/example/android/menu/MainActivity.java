package com.example.android.menu;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
// Find first menu item TextView and print the text to the logs
        TextView textView1 = (TextView)findViewById(R.id.menu_item_1);
        String item1 = textView1.getText().toString();
        Log.v("MainActivity",item1);



// Find second menu item TextView and print the text to the logs
        TextView textView2 = (TextView) findViewById(R.id.menu_item_2);
        String item2 = textView2.getText().toString();
        Log.v("MainActivity",item2);


// Find third menu item TextView and print the text to the logs
        TextView textView3 = (TextView) findViewById(R.id.menu_item_3);
        String item3 = textView3.getText().toString();
        Log.v("MainActivity",item3);
    }
}