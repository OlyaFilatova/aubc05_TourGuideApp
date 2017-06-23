package com.miymayster.olya.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.restaurant_odesa), getString(R.string.restaurant_odesa_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.restaurant_shoti), getString(R.string.restaurant_shoti_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.restaurant_spotikach), getString(R.string.restaurant_spotikach_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.restaurant_chachapuri), getString(R.string.restaurant_chachapuri_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.restaurant_napule), getString(R.string.restaurant_napule_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.restaurant_favorite_uncle), getString(R.string.restaurant_favorite_uncle_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.restaurant_beef_meat_n_wine), getString(R.string.restaurant_beef_meat_n_wine_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.restaurant_pervak), getString(R.string.restaurant_pervak_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.restaurant_oliva), getString(R.string.restaurant_oliva_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.restaurant_happy_grill_bar), getString(R.string.restaurant_happy_grill_bar_address), Place.NO_IMAGE_RESOURCE));
        PlaceAdapter adapter = new PlaceAdapter(getContext(), R.layout.place, places);
        listView.setAdapter(adapter);
        return rootView;
    }
}
