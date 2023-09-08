package com.tencent.p014mm.plugin.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo */
public class FileDownloadTaskInfo implements Parcelable {

    /* renamed from: d */
    public long f12194d = -1;

    /* renamed from: e */
    public String f12195e = "";

    /* renamed from: f */
    public int f12196f = 0;

    /* renamed from: g */
    public String f12197g = "";

    /* renamed from: h */
    public String f12198h = "";

    /* renamed from: i */
    public String f12199i = "";

    /* renamed from: j */
    public long f12200j = 0;

    /* renamed from: n */
    public long f12201n = 0;

    /* renamed from: o */
    public boolean f12202o = false;

    /* renamed from: p */
    public int f12203p = 2;

    /* renamed from: q */
    public boolean f12204q = false;

    /* renamed from: r */
    public boolean f12205r = false;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12194d);
        parcel.writeString(this.f12195e);
        parcel.writeInt(this.f12196f);
        parcel.writeString(this.f12197g);
        parcel.writeString(this.f12198h);
        parcel.writeString(this.f12199i);
        parcel.writeLong(this.f12200j);
        parcel.writeLong(this.f12201n);
        parcel.writeByte(this.f12202o ? (byte) 1 : 0);
        parcel.writeInt(this.f12203p);
        parcel.writeByte(this.f12204q ? (byte) 1 : 0);
        parcel.writeByte(this.f12205r ? (byte) 1 : 0);
    }
}
