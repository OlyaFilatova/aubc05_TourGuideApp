package com.miymayster.olya.tourguideapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class PlaceAdapter extends ArrayAdapter<Place> {
    private ArrayList<Place> mPlaces;

    PlaceAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Place> places) {
        super(context, resource, places);
        mPlaces = places;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Place place = mPlaces.get(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.place, parent, false);
        }
        if (place.hasImageResource()) {
            ((ImageView) convertView.findViewById(R.id.image)).setImageResource(place.getImageResource());
            convertView.findViewById(R.id.image).setVisibility(View.VISIBLE);
        } else {
            convertView.findViewById(R.id.image).setVisibility(View.GONE);
        }
        ((TextView) convertView.findViewById(R.id.name)).setText(place.getName());
        ((TextView) convertView.findViewById(R.id.address)).setText(place.getAddress());
        return convertView;
    }
}
