    <EditText
            android:id="@+id/name_EditView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:hint="NAME"
            android:inputType="textCapWords"/>

_________


    EditText getNameEditView = (EditText) findViewById(R.id.name_EditView);
    return getNameEditView.getText().toString();
    
______________
    
        Toast.makeText(this, R.string.decrement_warning_msg, Toast.LENGTH_SHORT).show();

_____________

Commen intents

https://developer.android.com/guide/components/intents-common.html?utm_source=udacity&utm_medium=course&utm_campaign=android_basics#Clock
    

        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:")); //only Email app can solve it
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Just Java order for " + getName());
        emailIntent.putExtra(Intent.EXTRA_TEXT, createOrderSummary(calculatePrice()));
        if (emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        }
