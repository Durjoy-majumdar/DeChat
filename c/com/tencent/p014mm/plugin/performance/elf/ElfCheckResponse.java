package com.tencent.p014mm.plugin.performance.elf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.performance.elf.ElfCheckResponse */
public class ElfCheckResponse implements Parcelable {
    public static final Parcelable.Creator<ElfCheckResponse> CREATOR = new C30342a();

    /* renamed from: d */
    public boolean f81890d;

    /* renamed from: e */
    public boolean f81891e;

    /* renamed from: f */
    public long f81892f;

    /* renamed from: g */
    public boolean f81893g;

    /* renamed from: h */
    public String f81894h;

    /* renamed from: i */
    public String f81895i;

    /* renamed from: j */
    public long f81896j;

    /* renamed from: n */
    public long f81897n;

    /* renamed from: o */
    public Bundle f81898o;

    /* renamed from: com.tencent.mm.plugin.performance.elf.ElfCheckResponse$a */
    public class C30342a implements Parcelable.Creator<ElfCheckResponse> {
        public Object createFromParcel(Parcel parcel) {
            return new ElfCheckResponse(parcel);
        }

        public Object[] newArray(int i) {
            return new ElfCheckResponse[i];
        }
    }

    public ElfCheckResponse(boolean z, long j, boolean z2, boolean z3, String str, String str2, long j2) {
        this.f81893g = z3;
        this.f81890d = z2;
        this.f81895i = str;
        this.f81894h = str2;
        this.f81897n = j2;
        this.f81892f = j;
        this.f81891e = z;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f81890d + "," + this.f81893g + "," + this.f81896j + "," + this.f81895i + "," + this.f81894h + "," + this.f81897n;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f81890d ? (byte) 1 : 0);
        parcel.writeByte(this.f81891e ? (byte) 1 : 0);
        parcel.writeLong(this.f81892f);
        parcel.writeByte(this.f81893g ? (byte) 1 : 0);
        parcel.writeString(this.f81894h);
        parcel.writeString(this.f81895i);
        parcel.writeLong(this.f81896j);
        parcel.writeLong(this.f81897n);
        parcel.writeBundle(this.f81898o);
    }

    public ElfCheckResponse(Parcel parcel) {
        boolean z = true;
        this.f81890d = parcel.readByte() != 0;
        this.f81891e = parcel.readByte() != 0;
        this.f81892f = parcel.readLong();
        this.f81893g = parcel.readByte() == 0 ? false : z;
        this.f81894h = parcel.readString();
        this.f81895i = parcel.readString();
        this.f81896j = parcel.readLong();
        this.f81897n = parcel.readLong();
        this.f81898o = parcel.readBundle();
    }
}
