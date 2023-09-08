package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp */
public class AppBrandBackgroundRunningApp implements Parcelable {
    public static final Parcelable.Creator<AppBrandBackgroundRunningApp> CREATOR = new C81568a();

    /* renamed from: d */
    public String f239207d;

    /* renamed from: e */
    public int f239208e;

    /* renamed from: f */
    public int f239209f;

    /* renamed from: g */
    public String f239210g;

    /* renamed from: h */
    public String f239211h;

    /* renamed from: i */
    public String f239212i;

    /* renamed from: j */
    public String f239213j;

    /* renamed from: n */
    public String f239214n;

    /* renamed from: o */
    public String f239215o;

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp$a */
    public class C81568a implements Parcelable.Creator<AppBrandBackgroundRunningApp> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandBackgroundRunningApp(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandBackgroundRunningApp[i];
        }
    }

    public AppBrandBackgroundRunningApp() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f239207d, ((AppBrandBackgroundRunningApp) obj).f239207d);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f239207d});
    }

    public String toString() {
        return "AppBrandBackgroundRunningApp{appId='" + this.f239207d + '\'' + ", versionType=" + this.f239208e + ", usage=" + this.f239209f + ", icon='" + this.f239210g + '\'' + ", name='" + this.f239211h + '\'' + ", username='" + this.f239212i + '\'' + ", uiclass='" + this.f239213j + '\'' + ", process='" + this.f239214n + '\'' + ", customNotificationLogicClassName='" + this.f239215o + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f239207d);
        parcel.writeInt(this.f239208e);
        parcel.writeInt(this.f239209f);
        parcel.writeString(this.f239210g);
        parcel.writeString(this.f239211h);
        parcel.writeString(this.f239212i);
        parcel.writeString(this.f239213j);
        parcel.writeString(this.f239214n);
        parcel.writeString(this.f239215o);
    }

    public AppBrandBackgroundRunningApp(Parcel parcel) {
        this.f239207d = parcel.readString();
        this.f239208e = parcel.readInt();
        this.f239209f = parcel.readInt();
        this.f239210g = parcel.readString();
        this.f239211h = parcel.readString();
        this.f239212i = parcel.readString();
        this.f239213j = parcel.readString();
        this.f239214n = parcel.readString();
        this.f239215o = parcel.readString();
    }
}
