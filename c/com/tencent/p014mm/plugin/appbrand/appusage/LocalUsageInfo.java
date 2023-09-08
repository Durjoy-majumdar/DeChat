package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo */
public class LocalUsageInfo implements Parcelable {
    public static final Parcelable.Creator<LocalUsageInfo> CREATOR = new C81465a();

    /* renamed from: d */
    public final String f239040d;

    /* renamed from: e */
    public final String f239041e;

    /* renamed from: f */
    public final int f239042f;

    /* renamed from: g */
    public final int f239043g;

    /* renamed from: h */
    public final String f239044h;

    /* renamed from: i */
    public final String f239045i;

    /* renamed from: j */
    public final String f239046j;

    /* renamed from: n */
    public final boolean f239047n;

    /* renamed from: o */
    public final long f239048o;

    /* renamed from: p */
    public final long f239049p;

    /* renamed from: q */
    public final boolean f239050q;

    /* renamed from: r */
    public final String f239051r;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo$a */
    public class C81465a implements Parcelable.Creator<LocalUsageInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new LocalUsageInfo(parcel, (C81465a) null);
        }

        public Object[] newArray(int i) {
            return new LocalUsageInfo[i];
        }
    }

    public LocalUsageInfo(String str, String str2, int i, int i2, String str3, String str4, String str5, boolean z, long j, long j2, boolean z2, String str6) {
        this.f239040d = str;
        this.f239041e = str2;
        this.f239042f = i;
        this.f239043g = i2;
        this.f239044h = str3;
        this.f239045i = str4;
        this.f239046j = str5;
        this.f239047n = z;
        this.f239048o = j;
        this.f239049p = j2;
        this.f239050q = z2;
        this.f239051r = str6;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f239040d);
        parcel.writeString(this.f239041e);
        parcel.writeInt(this.f239042f);
        parcel.writeInt(this.f239043g);
        parcel.writeString(this.f239044h);
        parcel.writeString(this.f239045i);
        parcel.writeString(this.f239046j);
        parcel.writeByte(this.f239047n ? (byte) 1 : 0);
        parcel.writeLong(this.f239048o);
        parcel.writeLong(this.f239049p);
        parcel.writeByte(this.f239050q ? (byte) 1 : 0);
        parcel.writeString(this.f239051r);
    }

    public LocalUsageInfo(String str, String str2, int i, int i2, String str3, String str4, String str5, boolean z, long j, long j2) {
        this(str, str2, i, i2, str3, str4, str5, z, j, j2, false, "");
    }

    public LocalUsageInfo(Parcel parcel, C81465a aVar) {
        this.f239040d = parcel.readString();
        this.f239041e = parcel.readString();
        this.f239042f = parcel.readInt();
        this.f239043g = parcel.readInt();
        this.f239044h = parcel.readString();
        this.f239045i = parcel.readString();
        this.f239046j = parcel.readString();
        boolean z = false;
        this.f239047n = parcel.readByte() > 0;
        this.f239048o = parcel.readLong();
        this.f239049p = parcel.readLong();
        this.f239050q = parcel.readByte() > 0 ? true : z;
        this.f239051r = parcel.readString();
    }
}
