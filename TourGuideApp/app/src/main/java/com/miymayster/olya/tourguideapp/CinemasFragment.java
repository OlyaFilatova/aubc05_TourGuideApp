package com.miymayster.olya.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CinemasFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.cinema_blockbaster), getString(R.string.cinema_blockbaster_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.cinema_oskar), getString(R.string.cinema_oskar_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.cinema_jovten), getString(R.string.cinema_jovten_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.cinema_batterfly_de_luxe), getString(R.string.cinema_batterfly_de_luxe_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.cinema_kyiv_cinema), getString(R.string.cinema_kyiv_cinema_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.cinema_ukraine), getString(R.string.cinema_ukraine_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.cinema_liniya_kino), getString(R.string.cinema_liniya_kino_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.cinema_kyivska_rus), getString(R.string.cinema_kyivska_rus_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.cinema_leipcig), getString(R.string.cinema_leipcig_address), Place.NO_IMAGE_RESOURCE));
        PlaceAdapter adapter = new PlaceAdapter(getContext(), R.layout.place, places);
        listView.setAdapter(adapter);
        return rootView;
    }
}
