package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress */
public class WxaPkgLoadProgress implements Parcelable {
    public static final Parcelable.Creator<WxaPkgLoadProgress> CREATOR = new C81221a();

    /* renamed from: d */
    public int f238582d;

    /* renamed from: e */
    public long f238583e;

    /* renamed from: f */
    public long f238584f;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress$a */
    public class C81221a implements Parcelable.Creator<WxaPkgLoadProgress> {
        public Object createFromParcel(Parcel parcel) {
            return new WxaPkgLoadProgress(parcel);
        }

        public Object[] newArray(int i) {
            return new WxaPkgLoadProgress[i];
        }
    }

    public WxaPkgLoadProgress(int i, long j, long j2) {
        this.f238582d = i;
        this.f238583e = j;
        this.f238584f = j2;
        if (i <= 0 && j > 0 && j2 > 0) {
            this.f238582d = Math.max(Math.round((((float) j) / ((float) j2)) * 100.0f), 0);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "WxaPkgLoadProgress{progress=" + this.f238582d + ", writtenLength=" + this.f238583e + ", totalLength=" + this.f238584f + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f238582d);
        parcel.writeLong(this.f238583e);
        parcel.writeLong(this.f238584f);
    }

    public WxaPkgLoadProgress() {
        this.f238582d = 0;
        this.f238583e = -1;
        this.f238584f = -1;
    }

    public WxaPkgLoadProgress(Parcel parcel) {
        this.f238582d = 0;
        this.f238583e = -1;
        this.f238584f = -1;
        this.f238582d = parcel.readInt();
        this.f238583e = parcel.readLong();
        this.f238584f = parcel.readLong();
    }
}
