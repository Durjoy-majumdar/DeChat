package com.tencent.p014mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import b34.C79664a;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig */
public class AppBrandInitConfig implements Parcelable {
    public static final Parcelable.Creator<AppBrandInitConfig> CREATOR = new C81616a();

    /* renamed from: d */
    public String f239362d;

    /* renamed from: e */
    public String f239363e;

    /* renamed from: f */
    public String f239364f;

    /* renamed from: g */
    public int f239365g;

    /* renamed from: h */
    public String f239366h;

    /* renamed from: i */
    public String f239367i;

    /* renamed from: j */
    public int f239368j;

    /* renamed from: n */
    public String f239369n;

    /* renamed from: o */
    public int f239370o;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig$a */
    public class C81616a implements Parcelable.Creator<AppBrandInitConfig> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandInitConfig(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandInitConfig[i];
        }
    }

    public AppBrandInitConfig() {
    }

    /* renamed from: a */
    public AppBrandInitConfig clone() {
        Parcel b = mo113913b();
        Class<?> cls = getClass();
        AppBrandInitConfig appBrandInitConfig = (AppBrandInitConfig) new C79664a(cls, cls).mo109791d(b).f233575b;
        b.recycle();
        return appBrandInitConfig;
    }

    /* renamed from: b */
    public Parcel mo113913b() {
        Parcel obtain = Parcel.obtain();
        obtain.setDataPosition(0);
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        return obtain;
    }

    /* renamed from: c */
    public JSONObject mo111291c() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f239362d);
        parcel.writeString(this.f239363e);
        parcel.writeString(this.f239364f);
        parcel.writeInt(this.f239365g);
        parcel.writeString(this.f239367i);
        parcel.writeString(this.f239366h);
        parcel.writeInt(this.f239368j);
        parcel.writeString(this.f239369n);
        parcel.writeInt(this.f239370o);
    }

    public AppBrandInitConfig(Parcel parcel) {
        this.f239362d = parcel.readString();
        this.f239363e = parcel.readString();
        this.f239364f = parcel.readString();
        this.f239365g = parcel.readInt();
        this.f239367i = parcel.readString();
        this.f239366h = parcel.readString();
        this.f239368j = parcel.readInt();
        this.f239369n = parcel.readString();
        this.f239370o = parcel.readInt();
    }
}
