package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject */
public class AppBrandLocalVideoObject extends AppBrandLocalMediaObject {
    public static final Parcelable.Creator<AppBrandLocalVideoObject> CREATOR = new C81401a();

    /* renamed from: n */
    public int f238912n;

    /* renamed from: o */
    public long f238913o;

    /* renamed from: p */
    public int f238914p;

    /* renamed from: q */
    public int f238915q;

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject$a */
    public class C81401a implements Parcelable.Creator<AppBrandLocalVideoObject> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandLocalVideoObject(parcel, (C81401a) null);
        }

        public Object[] newArray(int i) {
            return new AppBrandLocalVideoObject[i];
        }
    }

    public AppBrandLocalVideoObject() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "AppBrandLocalVideoObject{duration=" + this.f238912n + ", size=" + this.f238913o + ", width=" + this.f238914p + ", height=" + this.f238915q + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f238912n);
        parcel.writeLong(this.f238913o);
        parcel.writeInt(this.f238914p);
        parcel.writeInt(this.f238915q);
    }

    public AppBrandLocalVideoObject(Parcel parcel, C81401a aVar) {
        super(parcel);
        this.f238912n = parcel.readInt();
        this.f238913o = parcel.readLong();
        this.f238914p = parcel.readInt();
        this.f238915q = parcel.readInt();
    }
}
