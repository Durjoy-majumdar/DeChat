package com.tencent.map.sdk.utilities.visualization.datamodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

public class WeightedLatLng implements Parcelable {
    public static final Parcelable.Creator<WeightedLatLng> CREATOR = new Parcelable.Creator<WeightedLatLng>() {
        /* renamed from: a */
        private static WeightedLatLng m155380a(Parcel parcel) {
            return new WeightedLatLng(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new WeightedLatLng(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new WeightedLatLng[i];
        }

        /* renamed from: a */
        private static WeightedLatLng[] m155381a(int i) {
            return new WeightedLatLng[i];
        }
    };
    private static final double DEFAULT_INTENSITY = 1.0d;
    private double mIntensity;
    private LatLng mPoint;

    public WeightedLatLng(Parcel parcel) {
        this.mPoint = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.mIntensity = parcel.readDouble();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WeightedLatLng)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        LatLng latLng = this.mPoint;
        if (latLng != null) {
            WeightedLatLng weightedLatLng = (WeightedLatLng) obj;
            return latLng.equals(weightedLatLng.mPoint) && this.mIntensity == weightedLatLng.mIntensity;
        }
        WeightedLatLng weightedLatLng2 = (WeightedLatLng) obj;
        return weightedLatLng2.mPoint == null && this.mIntensity == weightedLatLng2.mIntensity;
    }

    public double getIntensity() {
        return this.mIntensity;
    }

    public LatLng getPoint() {
        return this.mPoint;
    }

    public int hashCode() {
        LatLng latLng = this.mPoint;
        return latLng != null ? latLng.hashCode() + ((int) (this.mIntensity * 1000000.0d)) : (int) (this.mIntensity * 1000000.0d);
    }

    public void setIntensity(double d) {
        if (d >= 0.0d) {
            this.mIntensity = d;
        } else {
            this.mIntensity = 1.0d;
        }
    }

    public void setPoint(LatLng latLng) {
        this.mPoint = latLng;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mPoint, i);
        parcel.writeDouble(this.mIntensity);
    }

    public WeightedLatLng(LatLng latLng, double d) {
        setPoint(latLng);
        setIntensity(d);
    }

    public WeightedLatLng(LatLng latLng) {
        this(latLng, 1.0d);
    }
}
