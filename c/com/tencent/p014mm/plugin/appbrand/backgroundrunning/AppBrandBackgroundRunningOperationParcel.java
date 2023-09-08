package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel */
public class AppBrandBackgroundRunningOperationParcel implements Parcelable {
    public static final Parcelable.Creator<AppBrandBackgroundRunningOperationParcel> CREATOR = new C81572a();

    /* renamed from: d */
    public String f239222d;

    /* renamed from: e */
    public int f239223e;

    /* renamed from: f */
    public int f239224f;

    /* renamed from: g */
    public int f239225g;

    /* renamed from: h */
    public String f239226h;

    /* renamed from: i */
    public String f239227i;

    /* renamed from: j */
    public String f239228j;

    /* renamed from: n */
    public String f239229n;

    /* renamed from: o */
    public String f239230o;

    /* renamed from: p */
    public int f239231p = -1;

    /* renamed from: q */
    public String f239232q;

    /* renamed from: r */
    public boolean f239233r = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel$a */
    public class C81572a implements Parcelable.Creator<AppBrandBackgroundRunningOperationParcel> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandBackgroundRunningOperationParcel(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandBackgroundRunningOperationParcel[i];
        }
    }

    public AppBrandBackgroundRunningOperationParcel() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "operation{appId='" + this.f239222d + '\'' + ", versionType=" + this.f239223e + ", usage=" + this.f239224f + ", operation=" + this.f239225g + ", uiclass='" + this.f239226h + '\'' + ", name='" + this.f239227i + '\'' + ", icon='" + this.f239228j + '\'' + ", username='" + this.f239229n + '\'' + ", process='" + this.f239230o + '\'' + ", customNotificationLogicClassName='" + this.f239232q + '\'' + ", justNotify=" + this.f239233r + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f239222d);
        parcel.writeInt(this.f239223e);
        parcel.writeInt(this.f239224f);
        parcel.writeInt(this.f239225g);
        parcel.writeString(this.f239226h);
        parcel.writeString(this.f239227i);
        parcel.writeString(this.f239228j);
        parcel.writeString(this.f239229n);
        parcel.writeString(this.f239230o);
        parcel.writeString(this.f239232q);
        parcel.writeInt(this.f239231p);
    }

    public AppBrandBackgroundRunningOperationParcel(Parcel parcel) {
        this.f239222d = parcel.readString();
        this.f239223e = parcel.readInt();
        this.f239224f = parcel.readInt();
        this.f239225g = parcel.readInt();
        this.f239226h = parcel.readString();
        this.f239227i = parcel.readString();
        this.f239228j = parcel.readString();
        this.f239229n = parcel.readString();
        this.f239230o = parcel.readString();
        this.f239232q = parcel.readString();
        this.f239231p = parcel.readInt();
    }
}
