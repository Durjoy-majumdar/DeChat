package com.tencent.map.sdk.utilities.visualization.datamodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

public class ScatterLatLng implements Parcelable {
    public static final Parcelable.Creator<ScatterLatLng> CREATOR = new Parcelable.Creator<ScatterLatLng>() {
        /* renamed from: a */
        private static ScatterLatLng m155376a(Parcel parcel) {
            return new ScatterLatLng(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ScatterLatLng(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ScatterLatLng[i];
        }

        /* renamed from: a */
        private static ScatterLatLng[] m155377a(int i) {
            return new ScatterLatLng[i];
        }
    };
    private static final double DEFAULT_INTENSITY = 1.0d;
    private static final int DEFAULT_TYPE = 0;
    private double mIntensity;
    private LatLng mPoint;
    private int mType;

    public ScatterLatLng(Parcel parcel) {
        this.mPoint = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.mType = parcel.readInt();
        this.mIntensity = parcel.readDouble();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ScatterLatLng)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        LatLng latLng = this.mPoint;
        if (latLng != null) {
            ScatterLatLng scatterLatLng = (ScatterLatLng) obj;
            return latLng.equals(scatterLatLng.mPoint) && this.mType == scatterLatLng.mType && this.mIntensity == scatterLatLng.mIntensity;
        }
        ScatterLatLng scatterLatLng2 = (ScatterLatLng) obj;
        return scatterLatLng2.mPoint == null && this.mType == scatterLatLng2.mType && this.mIntensity == scatterLatLng2.mIntensity;
    }

    public double getIntensity() {
        return this.mIntensity;
    }

    public LatLng getPoint() {
        return this.mPoint;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        int i;
        double d;
        LatLng latLng = this.mPoint;
        if (latLng != null) {
            i = latLng.hashCode() + ((int) (((double) this.mType) * 1000000.0d));
            d = this.mIntensity;
        } else {
            i = (int) (((double) this.mType) * 1000000.0d);
            d = this.mIntensity;
        }
        return i + ((int) (d * 1000000.0d));
    }

    public void setIntensity(double d) {
        this.mIntensity = d;
    }

    public void setPoint(LatLng latLng) {
        this.mPoint = latLng;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mPoint, i);
        parcel.writeInt(this.mType);
        parcel.writeDouble(this.mIntensity);
    }

    public ScatterLatLng(LatLng latLng, int i) {
        setPoint(latLng);
        setType(i);
        setIntensity(1.0d);
    }

    public ScatterLatLng(LatLng latLng, double d) {
        setPoint(latLng);
        setType(0);
        setIntensity(d);
    }

    public ScatterLatLng(LatLng latLng, int i, double d) {
        setPoint(latLng);
        setType(i);
        setIntensity(d);
    }

    public ScatterLatLng(LatLng latLng) {
        this(latLng, 0, 1.0d);
    }
}
