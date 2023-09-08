package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState */
public class AppBrandDownloadState implements Parcelable {
    public static final Parcelable.Creator<AppBrandDownloadState> CREATOR = new C40444a();

    /* renamed from: d */
    public String f108698d;

    /* renamed from: e */
    public long f108699e;

    /* renamed from: f */
    public String f108700f;

    /* renamed from: g */
    public long f108701g;

    /* renamed from: h */
    public long f108702h;

    /* renamed from: i */
    public float f108703i;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState$a */
    public class C40444a implements Parcelable.Creator<AppBrandDownloadState> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandDownloadState(parcel, (C40444a) null);
        }

        public Object[] newArray(int i) {
            return new AppBrandDownloadState[i];
        }
    }

    public AppBrandDownloadState() {
    }

    public AppBrandDownloadState(Parcel parcel, C40444a aVar) {
        this.f108698d = parcel.readString();
        this.f108699e = parcel.readLong();
        this.f108700f = parcel.readString();
        this.f108701g = parcel.readLong();
        this.f108702h = parcel.readLong();
        this.f108703i = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f108698d);
        parcel.writeLong(this.f108699e);
        parcel.writeString(this.f108700f);
        parcel.writeLong(this.f108701g);
        parcel.writeLong(this.f108702h);
        parcel.writeFloat(this.f108703i);
    }
}
