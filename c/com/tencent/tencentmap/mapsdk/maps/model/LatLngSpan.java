package com.tencent.tencentmap.mapsdk.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public class LatLngSpan implements Parcelable {
    public static final Parcelable.Creator<LatLngSpan> CREATOR = new Parcelable.Creator<LatLngSpan>() {
        /* renamed from: a */
        private static LatLngSpan m164016a(Parcel parcel) {
            return new LatLngSpan(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LatLngSpan(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LatLngSpan[i];
        }

        /* renamed from: a */
        private static LatLngSpan[] m164017a(int i) {
            return new LatLngSpan[i];
        }
    };
    private double mLatitudeSpan;
    private double mLongitudeSpan;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngSpan) {
            LatLngSpan latLngSpan = (LatLngSpan) obj;
            return this.mLongitudeSpan == latLngSpan.getLongitudeSpan() && this.mLatitudeSpan == latLngSpan.getLatitudeSpan();
        }
    }

    public double getLatitudeSpan() {
        return this.mLatitudeSpan;
    }

    public double getLongitudeSpan() {
        return this.mLongitudeSpan;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.mLatitudeSpan);
        long doubleToLongBits2 = Double.doubleToLongBits(this.mLongitudeSpan);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public void setLatitudeSpan(double d) {
        this.mLatitudeSpan = d;
    }

    public void setLongitudeSpan(double d) {
        this.mLongitudeSpan = d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mLatitudeSpan);
        parcel.writeDouble(this.mLongitudeSpan);
    }

    private LatLngSpan(Parcel parcel) {
        this.mLatitudeSpan = parcel.readDouble();
        this.mLongitudeSpan = parcel.readDouble();
    }

    public LatLngSpan(double d, double d2) {
        this.mLatitudeSpan = d;
        this.mLongitudeSpan = d2;
    }
}
