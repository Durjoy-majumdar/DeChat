package com.tencent.p014mm.sandbox.monitor;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import p156gj.C87200o;
import qe3.C89625d;

/* renamed from: com.tencent.mm.sandbox.monitor.ErrLog$Error */
class ErrLog$Error implements Parcelable {
    public static final Parcelable.Creator<ErrLog$Error> CREATOR = new C85696a();

    /* renamed from: d */
    public final String f249700d;

    /* renamed from: e */
    public String f249701e;

    /* renamed from: f */
    public String f249702f;

    /* renamed from: g */
    public long f249703g;

    /* renamed from: h */
    public String f249704h;

    /* renamed from: i */
    public boolean f249705i;

    /* renamed from: com.tencent.mm.sandbox.monitor.ErrLog$Error$a */
    public class C85696a implements Parcelable.Creator<ErrLog$Error> {
        public Object createFromParcel(Parcel parcel) {
            return new ErrLog$Error(parcel);
        }

        public Object[] newArray(int i) {
            return new ErrLog$Error[i];
        }
    }

    public ErrLog$Error(String str, String str2, long j, String str3, boolean z) {
        StringBuilder sb = new StringBuilder();
        int i = C89625d.f257835a;
        sb.append(C87200o.f252868a);
        sb.append("_");
        sb.append(C89625d.f257841g);
        sb.append("_");
        sb.append(Build.CPU_ABI);
        this.f249700d = sb.toString();
        this.f249701e = str;
        this.f249702f = str2;
        this.f249703g = j;
        this.f249704h = str3;
        this.f249705i = z;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f249701e + "," + this.f249700d + "," + this.f249702f + ",time_" + this.f249703g + ",error_" + this.f249704h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f249701e);
        parcel.writeString(this.f249702f);
        parcel.writeLong(this.f249703g);
        parcel.writeString(this.f249704h);
        parcel.writeByte(this.f249705i ? (byte) 1 : 0);
    }

    public ErrLog$Error(Parcel parcel) {
        StringBuilder sb = new StringBuilder();
        int i = C89625d.f257835a;
        sb.append(C87200o.f252868a);
        sb.append("_");
        sb.append(C89625d.f257841g);
        sb.append("_");
        sb.append(Build.CPU_ABI);
        this.f249700d = sb.toString();
        this.f249701e = parcel.readString();
        this.f249702f = parcel.readString();
        this.f249703g = parcel.readLong();
        this.f249704h = parcel.readString();
        this.f249705i = parcel.readByte() != 0;
    }
}
