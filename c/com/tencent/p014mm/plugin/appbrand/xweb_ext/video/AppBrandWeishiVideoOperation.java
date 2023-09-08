package com.tencent.p014mm.plugin.appbrand.xweb_ext.video;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.xweb_ext.video.AppBrandWeishiVideoOperation */
public class AppBrandWeishiVideoOperation implements Parcelable {
    public static final Parcelable.Creator<AppBrandWeishiVideoOperation> CREATOR = new C85039a();

    /* renamed from: d */
    public String f247813d;

    /* renamed from: e */
    public long f247814e;

    /* renamed from: f */
    public long f247815f;

    /* renamed from: com.tencent.mm.plugin.appbrand.xweb_ext.video.AppBrandWeishiVideoOperation$a */
    public class C85039a implements Parcelable.Creator<AppBrandWeishiVideoOperation> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandWeishiVideoOperation(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandWeishiVideoOperation[i];
        }
    }

    public AppBrandWeishiVideoOperation(String str, long j, long j2) {
        this.f247813d = str;
        this.f247814e = j;
        this.f247815f = j2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f247813d);
        parcel.writeLong(this.f247814e);
        parcel.writeLong(this.f247815f);
    }

    public AppBrandWeishiVideoOperation(Parcel parcel) {
        this.f247813d = parcel.readString();
        this.f247814e = parcel.readLong();
        this.f247815f = parcel.readLong();
    }
}
