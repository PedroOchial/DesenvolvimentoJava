package br.pedroochial;

public class Geo {

    private double latitude;
    private double longitude;

    public Geo (double latitude, double longitude ){
       this.latitude = latitude;
       this.longitude= longitude;
    }

    public double getLatitude(){
        return this.latitude;
    }
    public double getLongitude(){
        return this.longitude;
    }

    public String toString(){
        return " longitude " + this.longitude +
                " latitude " + this.latitude;
    }
}
