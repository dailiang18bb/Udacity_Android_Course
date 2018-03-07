package com.example.charles.quantity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    boolean hasWhippedCreamChecked = false;
    boolean hasChocolateChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantity = Integer.parseInt(getString(R.string.quantity_string));
        runTest();
    }

    private void displayQuantity(int num) {
        TextView quantityView = findViewById(R.id.quantityTextView);
        quantityView.setText(String.valueOf(num));
    }

    public void decrement(View view) {
        /*
        quantity = (quantity == 1) ? quantity : quantity - 1;
        */

        if (quantity < 2) {
            Toast.makeText(this, R.string.decrement_warning_msg, Toast.LENGTH_SHORT).show();
        } else {
            quantity -= 1;
        }
        displayQuantity(quantity);

    }

    public void increment(View view) {
        /*
        quantity = (quantity <= 30) ? quantity + 1 : quantity;
        */

        if (quantity >= 100) {
            Toast.makeText(this, R.string.increment_warning_msg, Toast.LENGTH_SHORT).show();
        } else {
            quantity += 1;
        }
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
        return "Name: " + getName()
                + "\nAdd Whipped cream? " + hasWhippedCreamChecked
                + "\nAdd Chocolate? " + hasChocolateChecked
                + "\nQuantity: " + quantity
                + "\nTotal: $" + price
                + "\nThank you!";
    }


    private int calculatePrice() {
        int chocolateChecked = (hasChocolateChecked) ? 1 : 0;
        int whippedCreamChecked = (hasWhippedCreamChecked) ? 1 : 0;
        return quantity * (5 + chocolateChecked * 2 + whippedCreamChecked);
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
     * get the topping selections from checkbox update
     */
    private void hasToppingCheckBox() {
        CheckBox hasWhippedCreamCheckBox = (CheckBox) findViewById(R.id.whippedCreamCheckBox);
        hasWhippedCreamChecked = hasWhippedCreamCheckBox.isChecked();
        CheckBox hasChocolateCheckBox = (CheckBox) findViewById(R.id.chocolateCheckBox);
        hasChocolateChecked = hasChocolateCheckBox.isChecked();
        Log.v("CheckBoxStatus: ", "has whipped cream checked: " + hasWhippedCreamChecked);
        Log.v("CheckBoxStatus: ", "has chocolate checked: " + hasChocolateChecked);
    }

    /**
     * get the client's name from EditView
     *
     * @return the name
     */
    private String getName() {
        EditText getNameEditView = (EditText) findViewById(R.id.name_EditView);
        return getNameEditView.getText().toString();
    }
}
