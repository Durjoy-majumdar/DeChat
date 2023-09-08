package com.tencent.p014mm.media.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.media.model.AppBrandMediaSource */
public class AppBrandMediaSource implements Parcelable {
    public static final Parcelable.Creator<AppBrandMediaSource> CREATOR = new C80994a();

    /* renamed from: d */
    public String f237881d = "";

    /* renamed from: e */
    public String f237882e = "";

    /* renamed from: f */
    public String f237883f = "";

    /* renamed from: com.tencent.mm.media.model.AppBrandMediaSource$a */
    public class C80994a implements Parcelable.Creator<AppBrandMediaSource> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandMediaSource(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandMediaSource[i];
        }
    }

    public AppBrandMediaSource() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f237881d);
        parcel.writeString(this.f237882e);
        parcel.writeString(this.f237883f);
    }

    public AppBrandMediaSource(Parcel parcel) {
        this.f237881d = parcel.readString();
        this.f237882e = parcel.readString();
        this.f237883f = parcel.readString();
    }
}
