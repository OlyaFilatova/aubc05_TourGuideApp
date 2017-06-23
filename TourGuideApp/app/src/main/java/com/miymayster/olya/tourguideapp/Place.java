package com.miymayster.olya.tourguideapp;

class Place {
    static final int NO_IMAGE_RESOURCE = -1;
    private String mName;
    private String mAddress;
    private int mImageResource = NO_IMAGE_RESOURCE;

    Place(String name, String address, int imageResource) {
        mName = name;
        mImageResource = imageResource;
        mAddress = address;
    }

    String getName() {
        return mName;
    }

    String getAddress() {
        return mAddress;
    }

    int getImageResource() {
        return mImageResource;
    }

    boolean hasImageResource() {
        return mImageResource != NO_IMAGE_RESOURCE;
    }
}
