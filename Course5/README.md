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
