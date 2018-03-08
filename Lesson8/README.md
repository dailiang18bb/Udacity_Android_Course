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

________________
Localization checklist


________________

https://classroom.udacity.com/courses/ud853/lessons/1623168625/concepts/16677585930923




__________________

Styles
https://developer.android.com/guide/topics/ui/look-and-feel/themes.html?utm_source=udacity&utm_medium=course&utm_campaign=android_basics

        style="@style/HeaderTextStyle"

Style Resource
https://developer.android.com/guide/topics/resources/style-resource.html?utm_source=udacity&utm_medium=course&utm_campaign=android_basics
Styles and Themes
https://developer.android.com/guide/topics/ui/look-and-feel/themes.html?utm_source=udacity&utm_medium=course&utm_campaign=android_basics


Support Different Screen Sizes
https://developer.android.com/training/multiscreen/screensizes.html?utm_source=udacity&utm_medium=course&utm_campaign=android_basics#TaskUseSWQuali


_______________

Themes

https://www.materialpalette.com

    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">#FF5722</item>
        <item name="colorPrimaryDark">#E64A19</item>
        <item name="colorAccent">#FFC107</item>
    </style>
