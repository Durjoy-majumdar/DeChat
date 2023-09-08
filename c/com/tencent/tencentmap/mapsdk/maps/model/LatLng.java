package com.tencent.tencentmap.mapsdk.maps.model;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate;

public class LatLng implements Parcelable, Coordinate {
    public static final Parcelable.Creator<LatLng> CREATOR = new Parcelable.Creator<LatLng>() {
        /* renamed from: a */
        private static LatLng m164012a(Parcel parcel) {
            return new LatLng(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LatLng(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LatLng[i];
        }

        /* renamed from: a */
        private static LatLng[] m164013a(int i) {
            return new LatLng[i];
        }
    };
    public double altitude;
    public double latitude;
    public double longitude;

    public LatLng() {
        this.altitude = 0.0d;
        this.latitude = 0.0d;
        this.longitude = 0.0d;
    }

    public static double wrap(double d, double d2, double d3) {
        double d4 = d3 - d2;
        double d5 = (((d - d2) % d4) + d4) % d4;
        return (d < d3 || d5 != 0.0d) ? d5 + d2 : d3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LatLng latLng = (LatLng) obj;
            return Double.compare(latLng.altitude, this.altitude) == 0 && Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0;
        }
    }

    public double getAltitude() {
        return this.altitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        long doubleToLongBits3 = Double.doubleToLongBits(this.altitude);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
    }

    public void setAltitude(double d) {
        this.altitude = d;
    }

    public void setLatitude(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("latitude must not be NaN");
        } else if (Math.abs(d) <= 90.0d) {
            this.latitude = d;
        } else {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        }
    }

    public void setLongitude(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("longitude must not be NaN");
        } else if (!Double.isInfinite(d)) {
            this.longitude = d;
        } else {
            throw new IllegalArgumentException("longitude must not be infinite");
        }
    }

    public void setX(double d) {
        this.latitude = d;
    }

    public void setY(double d) {
        this.longitude = d;
    }

    public void setZ(double d) {
        this.altitude = d;
    }

    public String toString() {
        return "LatLng [latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + "]";
    }

    public LatLng wrap() {
        return new LatLng(this.latitude, wrap(this.longitude, -180.0d, 180.0d));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.altitude);
    }

    /* renamed from: x */
    public double mo172089x() {
        return this.latitude;
    }

    /* renamed from: y */
    public double mo172090y() {
        return this.longitude;
    }

    /* renamed from: z */
    public double mo172091z() {
        return this.altitude;
    }

    public LatLng(double d, double d2) {
        this.altitude = 0.0d;
        setLatitude(d);
        setLongitude(d2);
    }

    public LatLng(double d, double d2, double d3) {
        this.altitude = 0.0d;
        setLatitude(d);
        setLongitude(d2);
        setAltitude(d3);
    }

    public LatLng(Location location) {
        this(location.getLatitude(), location.getLongitude(), location.getAltitude());
    }

    public LatLng(LatLng latLng) {
        this.altitude = 0.0d;
        this.latitude = latLng.latitude;
        this.longitude = latLng.longitude;
        this.altitude = latLng.altitude;
    }

    public LatLng(Parcel parcel) {
        this.altitude = 0.0d;
        setLatitude(parcel.readDouble());
        setLongitude(parcel.readDouble());
        setAltitude(parcel.readDouble());
    }
}
