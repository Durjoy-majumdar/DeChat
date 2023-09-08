package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel */
public class AppBrandBackgroundFetchDataParcel implements Parcelable {
    public static final Parcelable.Creator<AppBrandBackgroundFetchDataParcel> CREATOR = new C29406a();

    /* renamed from: d */
    public String f80216d;

    /* renamed from: e */
    public int f80217e;

    /* renamed from: f */
    public String f80218f;

    /* renamed from: g */
    public String f80219g;

    /* renamed from: h */
    public String f80220h;

    /* renamed from: i */
    public int f80221i;

    /* renamed from: j */
    public long f80222j;

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel$a */
    public class C29406a implements Parcelable.Creator<AppBrandBackgroundFetchDataParcel> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandBackgroundFetchDataParcel(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandBackgroundFetchDataParcel[i];
        }
    }

    public AppBrandBackgroundFetchDataParcel() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f80216d);
        parcel.writeInt(this.f80217e);
        parcel.writeString(this.f80218f);
        parcel.writeString(this.f80219g);
        parcel.writeString(this.f80220h);
        parcel.writeInt(this.f80221i);
        parcel.writeLong(this.f80222j);
    }

    public AppBrandBackgroundFetchDataParcel(Parcel parcel) {
        this.f80216d = parcel.readString();
        this.f80217e = parcel.readInt();
        this.f80218f = parcel.readString();
        this.f80219g = parcel.readString();
        this.f80220h = parcel.readString();
        this.f80221i = parcel.readInt();
        this.f80222j = parcel.readLong();
    }
}
