package com.tencent.p014mm.plugin.magicbrush.api;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo */
public class WxaMagicPkgInfo implements Parcelable {
    public static final Parcelable.Creator<WxaMagicPkgInfo> CREATOR = new C30174a();

    /* renamed from: d */
    public String f81564d;

    /* renamed from: e */
    public String f81565e;

    /* renamed from: f */
    public String f81566f;

    /* renamed from: g */
    public String f81567g;

    /* renamed from: h */
    public String f81568h;

    /* renamed from: i */
    public String f81569i;

    /* renamed from: j */
    public int f81570j;

    /* renamed from: n */
    public String f81571n;

    /* renamed from: o */
    public String f81572o;

    /* renamed from: p */
    public String f81573p;

    /* renamed from: q */
    public long f81574q;

    /* renamed from: r */
    public long f81575r;

    /* renamed from: com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo$a */
    public class C30174a implements Parcelable.Creator<WxaMagicPkgInfo> {
        public Object createFromParcel(Parcel parcel) {
            WxaMagicPkgInfo wxaMagicPkgInfo = new WxaMagicPkgInfo();
            wxaMagicPkgInfo.f81564d = parcel.readString();
            wxaMagicPkgInfo.f81565e = parcel.readString();
            wxaMagicPkgInfo.f81566f = parcel.readString();
            wxaMagicPkgInfo.f81567g = parcel.readString();
            wxaMagicPkgInfo.f81568h = parcel.readString();
            wxaMagicPkgInfo.f81569i = parcel.readString();
            wxaMagicPkgInfo.f81570j = parcel.readInt();
            wxaMagicPkgInfo.f81571n = parcel.readString();
            wxaMagicPkgInfo.f81572o = parcel.readString();
            wxaMagicPkgInfo.f81573p = parcel.readString();
            wxaMagicPkgInfo.f81574q = parcel.readLong();
            wxaMagicPkgInfo.f81575r = parcel.readLong();
            return wxaMagicPkgInfo;
        }

        public Object[] newArray(int i) {
            return new WxaMagicPkgInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "WxaMagicPkgInfo{pkgId='" + this.f81564d + '\'' + ", url='" + this.f81565e + '\'' + ", md5='" + this.f81566f + '\'' + ", pkgpath='" + this.f81567g + '\'' + ", unzippath='" + this.f81568h + '\'' + ", originalName='" + this.f81569i + '\'' + ", pkgtype='" + this.f81570j + '\'' + ", patchId='" + this.f81571n + '\'' + ", version='" + this.f81572o + '\'' + ", wxapath='" + this.f81573p + '\'' + ", updateTime=" + this.f81574q + ", lastUseTime=" + this.f81575r + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f81564d);
        parcel.writeString(this.f81565e);
        parcel.writeString(this.f81566f);
        parcel.writeString(this.f81567g);
        parcel.writeString(this.f81568h);
        parcel.writeString(this.f81569i);
        parcel.writeInt(this.f81570j);
        parcel.writeString(this.f81571n);
        parcel.writeString(this.f81572o);
        parcel.writeString(this.f81573p);
        parcel.writeLong(this.f81574q);
        parcel.writeLong(this.f81575r);
    }
}
