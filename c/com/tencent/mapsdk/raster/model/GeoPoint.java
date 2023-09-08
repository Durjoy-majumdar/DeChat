package com.tencent.mapsdk.raster.model;

import android.os.Parcel;
import android.os.Parcelable;

public class GeoPoint implements Parcelable {
    public static final Parcelable.Creator<GeoPoint> CREATOR = new Parcelable.Creator<GeoPoint>() {
        public GeoPoint createFromParcel(Parcel parcel) {
            return new GeoPoint(parcel);
        }

        public GeoPoint[] newArray(int i) {
            return new GeoPoint[i];
        }
    };
    private int e6Lat;
    private int e6Lon;

    public static LatLng g2l(GeoPoint geoPoint) {
        return new LatLng((((double) geoPoint.getLatitudeE6()) * 1.0d) / 1000000.0d, (((double) geoPoint.getLongitudeE6()) * 1.0d) / 1000000.0d);
    }

    public GeoPoint Copy() {
        return new GeoPoint(this.e6Lat, this.e6Lon);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        GeoPoint geoPoint = (GeoPoint) obj;
        return this.e6Lat == geoPoint.e6Lat && this.e6Lon == geoPoint.e6Lon;
    }

    public int getLatitudeE6() {
        return this.e6Lat;
    }

    public int getLongitudeE6() {
        return this.e6Lon;
    }

    public int hashCode() {
        return (this.e6Lon * 7) + (this.e6Lat * 11);
    }

    public void setLatitudeE6(int i) {
        this.e6Lat = i;
    }

    public void setLongitudeE6(int i) {
        this.e6Lon = i;
    }

    public String toString() {
        return this.e6Lat + "," + this.e6Lon;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e6Lat);
        parcel.writeInt(this.e6Lon);
    }

    public GeoPoint(int i, int i2) {
        this.e6Lat = i;
        this.e6Lon = i2;
    }

    private GeoPoint(Parcel parcel) {
        this.e6Lat = 0;
        this.e6Lon = 0;
        this.e6Lat = parcel.readInt();
        this.e6Lon = parcel.readInt();
    }
}
