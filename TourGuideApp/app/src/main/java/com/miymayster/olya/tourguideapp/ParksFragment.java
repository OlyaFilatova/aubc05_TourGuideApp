package com.miymayster.olya.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.park_pheophania), getString(R.string.park_pheophania_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.park_pevcheskoe_pole), getString(R.string.park_pevcheskoe_pole_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.park_kyoto), getString(R.string.park_kyoto_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.park_golosiivskiy), getString(R.string.park_golosiivskiy_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.park_skver_geidara_alieva), getString(R.string.park_skver_geidara_alieva_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.park_mariinskiy), getString(R.string.park_mariinskiy_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.park_imeni_tarasa_shevchenko), getString(R.string.park_imeni_tarasa_shevchenko_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.park_vkadymyrska_gorka), getString(R.string.park_vkadymyrska_gorka_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.park_vidradniy), getString(R.string.park_vidradniy_address), Place.NO_IMAGE_RESOURCE));
        places.add(new Place(getString(R.string.park_dryjby_narodiv), getString(R.string.park_dryjby_narodiv_address), Place.NO_IMAGE_RESOURCE));
        PlaceAdapter adapter = new PlaceAdapter(getContext(), R.layout.place, places);
        ListView list = (ListView) rootView.findViewById(R.id.list);
        list.setAdapter(adapter);
        return rootView;
    }
}
