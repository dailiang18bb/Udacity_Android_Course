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
