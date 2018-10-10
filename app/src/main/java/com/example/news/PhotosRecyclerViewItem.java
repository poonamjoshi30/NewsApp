package com.example.news;

public class PhotosRecyclerViewItem {


    // Save car image resource id.
    private int carImageId;

    public PhotosRecyclerViewItem( int carImageId) {

        this.carImageId = carImageId;
    }



    public int getCarImageId() {
        return carImageId;
    }

    public void setCarImageId(int carImageId) {
        this.carImageId = carImageId;
    }

}
