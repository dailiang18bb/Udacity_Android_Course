package com.example.charles.quantity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display(int number) {
        TextView quantityView = findViewById(R.id.quantityTextView);
        quantityView.setText(String.valueOf(number));
    }

    private void displayPrice(int price) {
        TextView priceView = findViewById(R.id.price);
        priceView.setText(NumberFormat.getCurrencyInstance().format(price));
    }

    public void decrement(View view) {
        quantity = (quantity == 0) ? quantity : quantity - 1;
        display(quantity);
    }

    public void increment(View view) {
        quantity = (quantity <= 30) ? quantity + 1 : quantity;
        display(quantity);
    }

    public void orderBtn(View view) {
        //String priceMessage = "Amount due $" + (quantity * 5);
        //String priceMessage = "That would be $" + (quantity * 5) + " please.";
        //String priceMessage = "You owe " + (quantity * 5) + " bucks, dude!";
        //String priceMessage = (quantity * 5) + " dollars for " + quantity + " cups of coffee. Pay up.";
        String priceMessage = "Total: $" + (quantity * 5) + "\nThank you!";
        displayMessage(priceMessage);
    }

    public void displayMessage(String string) {
        TextView priceString = (TextView) findViewById(R.id.price);
        priceString.setText(string);
    }


}
