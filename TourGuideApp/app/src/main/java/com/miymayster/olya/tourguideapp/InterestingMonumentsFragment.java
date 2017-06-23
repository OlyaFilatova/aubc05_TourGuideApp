package com.miymayster.olya.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class InterestingMonumentsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        ListView placeList = (ListView) rootView.findViewById(R.id.list);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.monument_cat_hippopotamus), getString(R.string.monument_cat_hippopotamus_address), R.drawable.cat_hippopotamus));
        places.add(new Place(getString(R.string.monument_cat_named_panteleimon), getString(R.string.monument_cat_named_panteleimon_address), R.drawable.cat_panteleimon));
        places.add(new Place(getString(R.string.monument_chairs_on_a_bench), getString(R.string.monument_chairs_on_a_bench_address), R.drawable.chairs_on_a_bench));
        places.add(new Place(getString(R.string.monument_first_tram), getString(R.string.monument_first_tram_address), R.drawable.first_tram));
        places.add(new Place(getString(R.string.monument_hedgehog_in_the_fog), getString(R.string.monument_hedgehog_in_the_fog_address), R.drawable.fog_hog));
        places.add(new Place(getString(R.string.monument_forky_cat), getString(R.string.monument_forky_cat_address), R.drawable.forky_cat));
        places.add(new Place(getString(R.string.monument_little_ballerina), getString(R.string.monument_little_ballerina_address), R.drawable.little_ballerina));
        places.add(new Place(getString(R.string.monument_little_prince), getString(R.string.monument_little_prince_address), R.drawable.little_prince));
        placeList.setAdapter(new PlaceAdapter(getActivity(), R.layout.place, places));
        return rootView;
    }
}
