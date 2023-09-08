package com.tencent.p014mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer */
public final class AppBrandLaunchReferrer implements Parcelable {
    public static final Parcelable.Creator<AppBrandLaunchReferrer> CREATOR = new C81618a();

    /* renamed from: d */
    public int f239396d;

    /* renamed from: e */
    public String f239397e;

    /* renamed from: f */
    public String f239398f;

    /* renamed from: g */
    public String f239399g;

    /* renamed from: h */
    public String f239400h;

    /* renamed from: i */
    public String f239401i;

    /* renamed from: j */
    public String f239402j;

    /* renamed from: n */
    public int f239403n;

    /* renamed from: o */
    public String f239404o;

    /* renamed from: p */
    public String f239405p;

    /* renamed from: q */
    public String f239406q;

    /* renamed from: r */
    public String f239407r;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer$a */
    public class C81618a implements Parcelable.Creator<AppBrandLaunchReferrer> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandLaunchReferrer(parcel, (C81618a) null);
        }

        public Object[] newArray(int i) {
            return new AppBrandLaunchReferrer[i];
        }
    }

    public AppBrandLaunchReferrer() {
    }

    /* renamed from: a */
    public void mo113920a(Parcel parcel) {
        this.f239396d = parcel.readInt();
        this.f239397e = parcel.readString();
        this.f239398f = parcel.readString();
        this.f239399g = parcel.readString();
        this.f239401i = parcel.readString();
        this.f239402j = parcel.readString();
        this.f239403n = parcel.readInt();
        this.f239404o = parcel.readString();
        this.f239400h = parcel.readString();
        this.f239405p = parcel.readString();
        this.f239406q = parcel.readString();
        this.f239407r = parcel.readString();
    }

    /* renamed from: b */
    public void mo113921b(AppBrandLaunchReferrer appBrandLaunchReferrer) {
        if (appBrandLaunchReferrer != null) {
            Parcel obtain = Parcel.obtain();
            obtain.setDataPosition(0);
            appBrandLaunchReferrer.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mo113920a(obtain);
            obtain.recycle();
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "AppBrandLaunchReferrer{launchScene=" + this.f239396d + ", appId='" + this.f239397e + '\'' + ", extraData='" + this.f239398f + '\'' + ", url='" + this.f239401i + '\'' + ", agentId='" + this.f239402j + '\'' + ", sourceType='" + this.f239403n + '\'' + ", businessType='" + this.f239404o + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f239396d);
        parcel.writeString(this.f239397e);
        parcel.writeString(this.f239398f);
        parcel.writeString(this.f239399g);
        parcel.writeString(this.f239401i);
        parcel.writeString(this.f239402j);
        parcel.writeInt(this.f239403n);
        parcel.writeString(this.f239404o);
        parcel.writeString(this.f239400h);
        parcel.writeString(this.f239405p);
        parcel.writeString(this.f239406q);
        parcel.writeString(this.f239407r);
    }

    public AppBrandLaunchReferrer(Parcel parcel, C81618a aVar) {
        mo113920a(parcel);
    }
}
