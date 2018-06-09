package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOCATION_SEPARATOR = " of ";


    public EarthquakeAdapter(@NonNull Context context, ArrayList<Earthquake> earthquake) {
        super(context, 0, earthquake);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Earthquake earthquake = getItem(position);

        TextView mItemMag = (TextView) listItemView.findViewById(R.id.item_mag);
        TextView mItemDistance = (TextView) listItemView.findViewById(R.id.item_distance);
        TextView mItemLocation = (TextView) listItemView.findViewById(R.id.item_place);
        TextView mItemDate = (TextView) listItemView.findViewById(R.id.item_date);
        TextView mItemTime = (TextView) listItemView.findViewById(R.id.item_time);


        //format time
        Date dateObject = new Date(earthquake.getTime());

        //format place
        String place = earthquake.getPlace();
        String distance = "";
        String location = "";

        if (place.contains(LOCATION_SEPARATOR)) {
//            distance = place.substring(0, place.indexOf("of") + 3);
//            location = place.substring(place.indexOf("of") + 3, place.length());

            String[] parts = place.split(LOCATION_SEPARATOR);
            distance = parts[0] + LOCATION_SEPARATOR;
            location = parts[1];
        } else {
            distance = getContext().getString(R.string.near_the);
            location = place;
        }


        //format mag
        String dispMag = formatMagnitude(earthquake.getMagnitude());


        mItemMag.setText(dispMag);
        mItemDistance.setText(distance);
        mItemLocation.setText(location);
        mItemDate.setText(String.valueOf(formatData(dateObject)));
        mItemTime.setText(String.valueOf(formatTime(dateObject)));

        //color the mag circle

        // Set the proper background color on the magnitude circle.
        // Fetch the background from the TextView, which is a GradientDrawable.
        GradientDrawable magnitudeCircle = (GradientDrawable) mItemMag.getBackground();
        // Get the appropriate background color based on the current earthquake magnitude
        int magnitudeColor = getMagnitudeColor(earthquake.getMagnitude());
        // Set the color on the magnitude circle
        magnitudeCircle.setColor(magnitudeColor);


        return listItemView;
    }




    private String formatData(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(getContext().getString(R.string.data_format), Locale.US);
        return dateFormat.format(dateObject);

    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(getContext().getString(R.string.time_format), Locale.US);
        return dateFormat.format(dateObject);
    }

    private String formatMagnitude(double mag) {
        DecimalFormat decimalFormat = new DecimalFormat(getContext().getString(R.string.mag_format));
        return decimalFormat.format(mag);
    }

    private int getMagnitudeColor(double mag) {
        int intMag = (int) Math.floor(mag);
        int magnitude1Color;

        switch (intMag) {
            case 0:
            case 1:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude1);
                break;
            case 2:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude2);
                break;
            case 3:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude3);
                break;
            case 4:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude4);
                break;
            case 5:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude5);
                break;
            case 6:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude6);
                break;
            case 7:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude7);
                break;
            case 8:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude8);
                break;
            case 9:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude9);
                break;
            default:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude10plus);

        }

        return magnitude1Color;

    }

}
