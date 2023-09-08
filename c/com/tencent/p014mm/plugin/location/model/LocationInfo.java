package com.tencent.p014mm.plugin.location.model;

import android.os.Parcel;
import android.os.Parcelable;
import x22.C38446c;

/* renamed from: com.tencent.mm.plugin.location.model.LocationInfo */
public class LocationInfo implements Parcelable {
    public static final Parcelable.Creator<LocationInfo> CREATOR = new C94159a();

    /* renamed from: d */
    public String f271929d;

    /* renamed from: e */
    public double f271930e;

    /* renamed from: f */
    public double f271931f;

    /* renamed from: g */
    public int f271932g;

    /* renamed from: h */
    public String f271933h;

    /* renamed from: i */
    public String f271934i;

    /* renamed from: j */
    public String f271935j;

    /* renamed from: n */
    public String f271936n;

    /* renamed from: o */
    public int f271937o;

    /* renamed from: p */
    public String f271938p;

    /* renamed from: q */
    public boolean f271939q;

    /* renamed from: r */
    public String f271940r;

    /* renamed from: s */
    public String f271941s;

    /* renamed from: t */
    public String f271942t;

    /* renamed from: u */
    public float f271943u;

    /* renamed from: v */
    public String f271944v;

    /* renamed from: w */
    public String f271945w;

    /* renamed from: com.tencent.mm.plugin.location.model.LocationInfo$a */
    public class C94159a implements Parcelable.Creator<LocationInfo> {
        public Object createFromParcel(Parcel parcel) {
            LocationInfo locationInfo = new LocationInfo();
            locationInfo.f271929d = parcel.readString();
            locationInfo.f271930e = parcel.readDouble();
            locationInfo.f271931f = parcel.readDouble();
            locationInfo.f271932g = parcel.readInt();
            locationInfo.f271933h = parcel.readString();
            locationInfo.f271934i = parcel.readString();
            locationInfo.f271935j = parcel.readString();
            locationInfo.f271936n = parcel.readString();
            locationInfo.f271937o = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            locationInfo.f271939q = z;
            locationInfo.f271940r = parcel.readString();
            locationInfo.f271941s = parcel.readString();
            locationInfo.f271942t = parcel.readString();
            locationInfo.f271943u = parcel.readFloat();
            locationInfo.f271944v = parcel.readString();
            locationInfo.f271945w = parcel.readString();
            return locationInfo;
        }

        public Object[] newArray(int i) {
            return new LocationInfo[i];
        }
    }

    public LocationInfo() {
        this.f271929d = "";
        this.f271930e = -85.0d;
        this.f271931f = -1000.0d;
        this.f271933h = "";
        this.f271934i = "zh-cn";
        this.f271936n = "";
        this.f271937o = 0;
        this.f271939q = false;
        this.f271940r = "";
        this.f271941s = "";
        this.f271942t = "";
        this.f271943u = 0.0f;
    }

    /* renamed from: a */
    public boolean mo129348a() {
        return (this.f271930e == -85.0d || this.f271931f == -1000.0d) ? false : true;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f271930e + " " + this.f271931f + " " + this.f271933h + " " + this.f271935j + "  " + this.f271929d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f271929d);
        parcel.writeDouble(this.f271930e);
        parcel.writeDouble(this.f271931f);
        parcel.writeInt(this.f271932g);
        parcel.writeString(this.f271933h);
        parcel.writeString(this.f271934i);
        parcel.writeString(this.f271935j);
        parcel.writeString(this.f271936n);
        parcel.writeInt(this.f271937o);
        parcel.writeString(this.f271938p);
        parcel.writeInt(this.f271939q ? 1 : 0);
        parcel.writeString(this.f271940r);
        parcel.writeString(this.f271941s);
        parcel.writeString(this.f271942t);
        parcel.writeFloat(this.f271943u);
        parcel.writeString(this.f271944v);
        parcel.writeString(this.f271945w);
    }

    public LocationInfo(boolean z) {
        this.f271929d = "";
        this.f271930e = -85.0d;
        this.f271931f = -1000.0d;
        this.f271933h = "";
        this.f271934i = "zh-cn";
        this.f271936n = "";
        this.f271937o = 0;
        this.f271939q = false;
        this.f271940r = "";
        this.f271941s = "";
        this.f271942t = "";
        this.f271943u = 0.0f;
        this.f271929d = toString() + " " + System.nanoTime();
        this.f271932g = C38446c.m41877a(z);
    }
}
