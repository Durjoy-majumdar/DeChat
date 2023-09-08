package com.tencent.map.sdk.utilities.heatmap;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

public class WeightedLatLng extends com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng {
    public static final Parcelable.Creator<WeightedLatLng> CREATOR = new Parcelable.Creator<WeightedLatLng>() {
        /* renamed from: a */
        private static WeightedLatLng m155369a(Parcel parcel) {
            return new WeightedLatLng(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new WeightedLatLng(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new WeightedLatLng[i];
        }

        /* renamed from: a */
        private static WeightedLatLng[] m155370a(int i) {
            return new WeightedLatLng[i];
        }
    };

    public WeightedLatLng(Parcel parcel) {
        super(parcel);
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
        LatLng point = getPoint();
        double intensity = getIntensity();
        if (point != null) {
            WeightedLatLng weightedLatLng = (WeightedLatLng) obj;
            return point.equals(weightedLatLng.getPoint()) && intensity == weightedLatLng.getIntensity();
        }
        WeightedLatLng weightedLatLng2 = (WeightedLatLng) obj;
        return weightedLatLng2.getPoint() == null && intensity == weightedLatLng2.getIntensity();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public WeightedLatLng(LatLng latLng, double d) {
        super(latLng, d);
    }

    public WeightedLatLng(LatLng latLng) {
        super(latLng);
    }
}
