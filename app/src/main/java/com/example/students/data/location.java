package com.example.students.data;

public  class location {
    private double lat;
    private double lng;

    public location(){}

    public location(double lat, double lng){
        this.lat=lat;
        this.lng=lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

}
