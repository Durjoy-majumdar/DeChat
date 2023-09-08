package com.tencent.map.lib.models;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public class GeoPoint implements Parcelable {
    public static final Parcelable.Creator<GeoPoint> CREATOR = new Parcelable.Creator<GeoPoint>() {
        /* renamed from: a */
        private static GeoPoint m155367a(Parcel parcel) {
            return new GeoPoint(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GeoPoint(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GeoPoint[i];
        }

        /* renamed from: a */
        private static GeoPoint[] m155368a(int i) {
            return new GeoPoint[i];
        }
    };
    private int mLatitudeE6;
    private int mLongitudeE6;

    public static GeoPoint formString(String str) {
        GeoPoint geoPoint = new GeoPoint();
        if (str != null) {
            try {
                String[] split = str.split(",");
                if (split != null && split.length == 2) {
                    geoPoint.mLatitudeE6 = Integer.parseInt(split[0]);
                    geoPoint.mLongitudeE6 = Integer.parseInt(split[1]);
                }
            } catch (Exception unused) {
            }
        }
        return geoPoint;
    }

    public static GeoPoint from(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new GeoPoint(latLng);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GeoPoint) {
            GeoPoint geoPoint = (GeoPoint) obj;
            return this.mLatitudeE6 == geoPoint.mLatitudeE6 && this.mLongitudeE6 == geoPoint.mLongitudeE6;
        }
    }

    public int getLatitudeE6() {
        return this.mLatitudeE6;
    }

    public int getLongitudeE6() {
        return this.mLongitudeE6;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.mLatitudeE6 = geoPoint.getLatitudeE6();
        this.mLongitudeE6 = geoPoint.getLongitudeE6();
    }

    public void setLatitudeE6(int i) {
        this.mLatitudeE6 = i;
    }

    public void setLongitudeE6(int i) {
        this.mLongitudeE6 = i;
    }

    public LatLng toLatLng() {
        return new LatLng(((double) this.mLatitudeE6) / 1000000.0d, ((double) this.mLongitudeE6) / 1000000.0d);
    }

    public Point toPoint() {
        return new Point(getLongitudeE6(), getLatitudeE6());
    }

    public String toString() {
        return this.mLatitudeE6 + "," + this.mLongitudeE6;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mLatitudeE6);
        parcel.writeInt(this.mLongitudeE6);
    }

    public GeoPoint() {
        this.mLatitudeE6 = -85000001;
        this.mLongitudeE6 = -180000001;
    }

    public static List<GeoPoint> from(List<LatLng> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList(0);
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            LatLng latLng = list.get(i);
            if (latLng != null) {
                arrayList.add(from(latLng));
            }
        }
        return arrayList;
    }

    public GeoPoint(GeoPoint geoPoint) {
        this();
        this.mLatitudeE6 = geoPoint.mLatitudeE6;
        this.mLongitudeE6 = geoPoint.mLongitudeE6;
    }

    public GeoPoint(int i, int i2) {
        this.mLatitudeE6 = i;
        this.mLongitudeE6 = i2;
    }

    public GeoPoint(LatLng latLng) {
        this.mLatitudeE6 = (int) (latLng.latitude * 1000000.0d);
        this.mLongitudeE6 = (int) (latLng.longitude * 1000000.0d);
    }

    private GeoPoint(Parcel parcel) {
        this.mLatitudeE6 = parcel.readInt();
        this.mLongitudeE6 = parcel.readInt();
    }
}
