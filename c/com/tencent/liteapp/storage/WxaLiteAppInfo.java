package com.tencent.liteapp.storage;

import android.os.Parcel;
import android.os.Parcelable;

public class WxaLiteAppInfo implements Parcelable {
    public static final Parcelable.Creator<WxaLiteAppInfo> CREATOR = new C113400a();

    /* renamed from: d */
    public String f339290d;

    /* renamed from: e */
    public String f339291e;

    /* renamed from: f */
    public String f339292f;

    /* renamed from: g */
    public String f339293g;

    /* renamed from: h */
    public String f339294h;

    /* renamed from: i */
    public String f339295i;

    /* renamed from: j */
    public String f339296j;

    /* renamed from: n */
    public String f339297n;

    /* renamed from: o */
    public String f339298o;

    /* renamed from: p */
    public String f339299p;

    /* renamed from: q */
    public String f339300q = "";

    /* renamed from: r */
    public long f339301r;

    /* renamed from: s */
    public long f339302s;

    /* renamed from: t */
    public byte[] f339303t;

    /* renamed from: com.tencent.liteapp.storage.WxaLiteAppInfo$a */
    public class C113400a implements Parcelable.Creator<WxaLiteAppInfo> {
        public Object createFromParcel(Parcel parcel) {
            WxaLiteAppInfo wxaLiteAppInfo = new WxaLiteAppInfo();
            wxaLiteAppInfo.f339290d = parcel.readString();
            wxaLiteAppInfo.f339291e = parcel.readString();
            wxaLiteAppInfo.f339292f = parcel.readString();
            wxaLiteAppInfo.f339293g = parcel.readString();
            wxaLiteAppInfo.f339294h = parcel.readString();
            wxaLiteAppInfo.f339295i = parcel.readString();
            wxaLiteAppInfo.f339296j = parcel.readString();
            wxaLiteAppInfo.f339297n = parcel.readString();
            wxaLiteAppInfo.f339298o = parcel.readString();
            wxaLiteAppInfo.f339299p = parcel.readString();
            wxaLiteAppInfo.f339300q = parcel.readString();
            wxaLiteAppInfo.f339301r = parcel.readLong();
            wxaLiteAppInfo.f339302s = parcel.readLong();
            if (parcel.readInt() >= 0) {
                byte[] bArr = new byte[parcel.readInt()];
                wxaLiteAppInfo.f339303t = bArr;
                parcel.readByteArray(bArr);
            }
            return wxaLiteAppInfo;
        }

        public Object[] newArray(int i) {
            return new WxaLiteAppInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "WxaLiteAppInfo{appId='" + this.f339290d + '\'' + ", groupId='" + this.f339291e + '\'' + ", url='" + this.f339292f + '\'' + ", md5='" + this.f339293g + '\'' + ", signatureKey='" + this.f339294h + '\'' + ", path='" + this.f339295i + '\'' + ", type='" + this.f339296j + '\'' + ", patchId='" + this.f339297n + '\'' + ", version='" + this.f339298o + '\'' + ", minliteappversion='" + this.f339299p + '\'' + ", minlvcppversion='" + this.f339300q + '\'' + ", updateTime=" + this.f339301r + ", lastUseTime=" + this.f339302s + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f339290d);
        parcel.writeString(this.f339291e);
        parcel.writeString(this.f339292f);
        parcel.writeString(this.f339293g);
        parcel.writeString(this.f339294h);
        parcel.writeString(this.f339295i);
        parcel.writeString(this.f339296j);
        parcel.writeString(this.f339297n);
        parcel.writeString(this.f339298o);
        parcel.writeString(this.f339299p);
        parcel.writeString(this.f339300q);
        parcel.writeLong(this.f339301r);
        parcel.writeLong(this.f339302s);
        parcel.writeByteArray(this.f339303t);
    }
}
