# Networking



## ellipsize and maxLines in XML Layout

For details on the specific attributes, check out the TextView documentation. Specifically, the ellipsize and maxLines attributes are probably new to you. These two attributes mean that if the text in the TextView is longer than the number of maxLines, then we can add an ellipsis (“...”) within the text (such as at the end of the text). A lot of the positioning was done with the layout_gravity attribute, which is a LinearLayout layout parameter, just like layout_height and layout_width.  
  
    
    <TextView
            android:id="@+id/item_distance"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:ellipsize="end"
            android:fontFamily="sans-serif-medium"
            android:maxLines="1"
            android:textAllCaps="true"
            android:textColor="@color/textColorEarthquakeDetails"
            android:textSize="12sp"
            tools:text="30km S of" />



## Hide divider between list items

To hide the divider between list items, there are two attributes that you can set on the ListView XML element within the earthquake_activity.xml file. We want to set android:divider to be “@null” and android:dividerHeight to be “0dp”.

     <ListView xmlns:android="http://schemas.android.com/apk/res/android"
        android:id="@+id/list"
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:divider="@null"
        android:dividerHeight="0dp"/>

## setOnItemClick

    earthquakeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(earthquakes.get(position).getUrl()));
                startActivity(intent);

            }
        });
        
## URL intent

    Intent intent = new Intent(Intent.ACTION_VIEW);
    intent.setData(Uri.parse(earthquakes.get(position).getUrl()));
    startActivity(intent);

## String builder VS String

* `String` Immutable, **can't** change once created.

* `String builder` Mutable, **can** change Once created.

      StringBuilder mBuilder = new StringBuilder();
      mBuilder.append("World");
      mBuilder.deleteCharAt(3);
      mBuilder.append(" builder").append(".");
      String builderResult = mBuilder.toString();  // Word builder.

## Exceptions
* **Checked** vs. **Unchecked** exceptions

An Unchecked exception can be considered one that has a chance of occurring, but based on your code, the compiler doesn't know. In other words, it's a programming error. For example, if you're taking user input and expect a number, and the user enters something you didn't expect, such as a string, your program would throw a NumberFormatException. You can predict these scenarios and put try/catch to try and avoid them before they occur. Very rarely seen is a person adding a throws NullPointerException or throws NumberFormatException (or throwing any other Unchecked exception, for that matter). It's allowed, but explicitly creating that exception is weird and most people would say that it's bad coding style.

Note that all Checked suggestions must be caught or thrown to something that can handle it; if you don't do it, your program won't compile. If you throw it to something that can't handle it, then your program will likely crash if it occurs.

Also note that an unchecked Exception (eg: one that occurs during runtime, usually via bad user input or whatnot) will also usually crash your program. Thus, it's usually a good idea to use try/catch when something can potentially go wrong, but you don't have to.

Also interesting to note is that while Checked exceptions are subclasses of Exception and Unchecked exceptions are subclasses of RuntimeException, RuntimeException itself is a subclass of Exception. That means that if you really wanted to, a single try {} catch (Exception e) {} will catch every single exception your program could possibly throw. Granted, this is considered a horrible way to deal with exceptions, and you should catch each one separately so that you can handle them separately. Please try not to use it.


* The `try-catch-finally` structure:

      try {
          // Code bock
      }
      catch (ExceptionType1 e1) {
          // Handle ExceptionType1 exceptions
      }
      catch (ExceptionType2 e2) {
          // Handle ExceptionType2 exceptions
      }
      // ...
      finally {
          // Code always executed after the
          // try and any catch block
      }
