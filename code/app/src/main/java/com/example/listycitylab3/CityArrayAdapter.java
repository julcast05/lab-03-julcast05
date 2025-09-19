package com.example.listycitylab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CityArrayAdapter extends ArrayAdapter<City> {
    public CityArrayAdapter(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if an existing view is being reused,otherwise inflate the view
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.content, parent, false);
        } else {
            view = convertView;
        }
        //Get the data item for this position
        City city = getItem(position);
        //Lookup view for data population
        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);
        //Populate the data into the template view using the data object
        cityName.setText(city.getName());
        provinceName.setText(city.getProvince());
        //Return the completed view to render on screen
        return view;
    }

}
