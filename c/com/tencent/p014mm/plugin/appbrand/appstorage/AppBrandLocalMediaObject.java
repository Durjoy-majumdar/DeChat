package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;

@Deprecated
/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject */
public class AppBrandLocalMediaObject implements Parcelable, C81415h0.C81416a {
    public static final Parcelable.Creator<AppBrandLocalMediaObject> CREATOR = new C81397a();

    /* renamed from: d */
    public String f238902d;

    /* renamed from: e */
    public String f238903e;

    /* renamed from: f */
    public String f238904f;

    /* renamed from: g */
    public String f238905g;

    /* renamed from: h */
    public boolean f238906h;

    /* renamed from: i */
    public long f238907i;

    /* renamed from: j */
    public long f238908j;

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject$a */
    public class C81397a implements Parcelable.Creator<AppBrandLocalMediaObject> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandLocalMediaObject(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandLocalMediaObject[i];
        }
    }

    public AppBrandLocalMediaObject() {
    }

    /* renamed from: a */
    public String mo113671a() {
        return this.f238902d;
    }

    /* renamed from: b */
    public long mo113672b() {
        return this.f238907i;
    }

    public int describeContents() {
        return 0;
    }

    public long lastModified() {
        return this.f238908j;
    }

    public String toString() {
        return "AppBrandLocalMediaObject{localId='" + this.f238902d + '\'' + ", fileFullPath='" + this.f238903e + '\'' + ", mimeType='" + this.f238904f + '\'' + ", fileExt='" + this.f238905g + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f238902d);
        parcel.writeString(this.f238903e);
        parcel.writeString(this.f238904f);
        parcel.writeString(this.f238905g);
        parcel.writeByte(this.f238906h ? (byte) 1 : 0);
        parcel.writeLong(this.f238907i);
        parcel.writeLong(this.f238908j);
    }

    public AppBrandLocalMediaObject(Parcel parcel) {
        this.f238902d = parcel.readString();
        this.f238903e = parcel.readString();
        this.f238904f = parcel.readString();
        this.f238905g = parcel.readString();
        this.f238906h = parcel.readByte() != 0;
        this.f238907i = parcel.readLong();
        this.f238908j = parcel.readLong();
    }
}
