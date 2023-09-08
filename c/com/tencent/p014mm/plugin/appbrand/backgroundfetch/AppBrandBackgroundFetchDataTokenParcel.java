package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel */
public class AppBrandBackgroundFetchDataTokenParcel implements Parcelable {
    public static final Parcelable.Creator<AppBrandBackgroundFetchDataTokenParcel> CREATOR = new C29415a();

    /* renamed from: d */
    public String f80234d;

    /* renamed from: e */
    public String f80235e;

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel$a */
    public class C29415a implements Parcelable.Creator<AppBrandBackgroundFetchDataTokenParcel> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandBackgroundFetchDataTokenParcel(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandBackgroundFetchDataTokenParcel[i];
        }
    }

    public AppBrandBackgroundFetchDataTokenParcel() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f80234d);
        parcel.writeString(this.f80235e);
    }

    public AppBrandBackgroundFetchDataTokenParcel(Parcel parcel) {
        this.f80234d = parcel.readString();
        this.f80235e = parcel.readString();
    }
}
