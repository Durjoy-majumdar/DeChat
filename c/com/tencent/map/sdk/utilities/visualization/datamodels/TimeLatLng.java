package com.tencent.map.sdk.utilities.visualization.datamodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

public class TimeLatLng implements Parcelable {
    public static final Parcelable.Creator<TimeLatLng> CREATOR = new Parcelable.Creator<TimeLatLng>() {
        /* renamed from: a */
        private static TimeLatLng m155378a(Parcel parcel) {
            return new TimeLatLng(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new TimeLatLng(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TimeLatLng[i];
        }

        /* renamed from: a */
        private static TimeLatLng[] m155379a(int i) {
            return new TimeLatLng[i];
        }
    };
    private static final int DEFAULT_TIME = 0;
    private LatLng mPoint;
    private int mTime;

    public TimeLatLng(Parcel parcel) {
        this.mPoint = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.mTime = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TimeLatLng)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        LatLng latLng = this.mPoint;
        if (latLng != null) {
            TimeLatLng timeLatLng = (TimeLatLng) obj;
            return latLng.equals(timeLatLng.mPoint) && this.mTime == timeLatLng.mTime;
        }
        TimeLatLng timeLatLng2 = (TimeLatLng) obj;
        return timeLatLng2.mPoint == null && this.mTime == timeLatLng2.mTime;
    }

    public LatLng getPoint() {
        return this.mPoint;
    }

    public int getTime() {
        return this.mTime;
    }

    public int hashCode() {
        LatLng latLng = this.mPoint;
        return latLng != null ? latLng.hashCode() + ((int) (((double) this.mTime) * 1000000.0d)) : (int) (((double) this.mTime) * 1000000.0d);
    }

    public void setPoint(LatLng latLng) {
        this.mPoint = latLng;
    }

    public void setTime(int i) {
        if (i >= 0) {
            this.mTime = i;
        } else {
            this.mTime = 0;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mPoint, i);
        parcel.writeInt(this.mTime);
    }

    public TimeLatLng(LatLng latLng, int i) {
        setPoint(latLng);
        setTime(i);
    }

    public TimeLatLng(LatLng latLng) {
        this(latLng, 0);
    }
}
