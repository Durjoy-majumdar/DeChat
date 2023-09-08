package com.tencent.p014mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams */
public class AppBrandWeishiParams implements Parcelable {
    public static final Parcelable.Creator<AppBrandWeishiParams> CREATOR = new C81620a();

    /* renamed from: d */
    public int f239420d;

    /* renamed from: e */
    public String f239421e;

    /* renamed from: f */
    public String f239422f;

    /* renamed from: g */
    public String f239423g;

    /* renamed from: h */
    public String f239424h;

    /* renamed from: i */
    public String f239425i;

    /* renamed from: j */
    public String f239426j;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams$a */
    public class C81620a implements Parcelable.Creator<AppBrandWeishiParams> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandWeishiParams(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandWeishiParams[i];
        }
    }

    public AppBrandWeishiParams() {
    }

    /* renamed from: a */
    public void mo113929a(Parcel parcel) {
        this.f239420d = parcel.readInt();
        this.f239421e = parcel.readString();
        this.f239422f = parcel.readString();
        this.f239423g = parcel.readString();
        this.f239424h = parcel.readString();
        this.f239425i = parcel.readString();
        this.f239426j = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "AppBrandWeishiParams{fromOpenSdk=" + this.f239420d + ", thumbUrl='" + this.f239421e + '\'' + ", thumbFullPath='" + this.f239422f + '\'' + ", msgImgPath='" + this.f239423g + '\'' + ", appId='" + this.f239424h + '\'' + ", appName='" + this.f239425i + '\'' + ", sourceUserName='" + this.f239426j + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f239420d);
        parcel.writeString(this.f239421e);
        parcel.writeString(this.f239422f);
        parcel.writeString(this.f239423g);
        parcel.writeString(this.f239424h);
        parcel.writeString(this.f239425i);
        parcel.writeString(this.f239426j);
    }

    public AppBrandWeishiParams(Parcel parcel) {
        mo113929a(parcel);
    }
}
