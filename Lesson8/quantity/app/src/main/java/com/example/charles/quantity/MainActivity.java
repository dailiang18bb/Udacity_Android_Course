package com.example.charles.quantity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    boolean hasWhippedCreamChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        runTest();
    }

    private void displayQuantity(int num) {
        TextView quantityView = findViewById(R.id.quantityTextView);
        quantityView.setText(String.valueOf(num));
    }

    public void decrement(View view) {
        quantity = (quantity == 0) ? quantity : quantity - 1;
        displayQuantity(quantity);
    }

    public void increment(View view) {
        quantity = (quantity <= 30) ? quantity + 1 : quantity;
        displayQuantity(quantity);
    }

    public void orderBtn(View view) {
        //String priceMessage = "Amount due $" + (quantity * 5);
        //String priceMessage = "That would be $" + (quantity * 5) + " please.";
        //String priceMessage = "You owe " + (quantity * 5) + " bucks, dude!";
        //String priceMessage = (quantity * 5) + " dollars for " + quantity + " cups of coffee. Pay up.";
        //String priceMessage =
        hasToppingCheckBox();
        displayMessage(createOrderSummary(calculatePrice()));

    }

    /**
     * Create the order summary
     *
     * @param price is the final price after calculatePrice method
     * @return the String summary
     */
    private String createOrderSummary(int price) {
        return "Name: Charles Dai\n" +"Add Whipped cream? "+ hasWhippedCreamChecked + "\nQuantity: " + quantity + "\nTotal: $" + price + "\nThank you!";
    }


    private int calculatePrice() {
        return quantity * 5;
    }

    public void displayMessage(String string) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(string);
    }

    /**
     * test out the get String method
     */
    private void runTest() {
        TextView test = findViewById(R.id.test);
        test.setText(getString(R.string.test));
    }

    /**
     * checkbox update
     */
    private void hasToppingCheckBox() {
        CheckBox hasWhippedCreamCheckBox = (CheckBox) findViewById(R.id.toppingCheckBox);
        hasWhippedCreamChecked = hasWhippedCreamCheckBox.isChecked();
        Log.v("CheckBoxStatus: ", "has whipped cream checked: "+hasWhippedCreamChecked);
    }
}
