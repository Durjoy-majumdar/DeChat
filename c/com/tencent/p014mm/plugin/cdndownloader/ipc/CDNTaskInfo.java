package com.tencent.p014mm.plugin.cdndownloader.ipc;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo */
public class CDNTaskInfo implements Parcelable {
    public static final Parcelable.Creator<CDNTaskInfo> CREATOR = new C40890a();

    /* renamed from: d */
    public boolean f109963d;

    /* renamed from: e */
    public String f109964e;

    /* renamed from: f */
    public String f109965f;

    /* renamed from: g */
    public String f109966g;

    /* renamed from: h */
    public String f109967h;

    /* renamed from: i */
    public String f109968i;

    /* renamed from: j */
    public int f109969j;

    /* renamed from: n */
    public int f109970n;

    /* renamed from: o */
    public boolean f109971o;

    /* renamed from: p */
    public boolean f109972p;

    /* renamed from: q */
    public boolean f109973q;

    /* renamed from: com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo$a */
    public class C40890a implements Parcelable.Creator<CDNTaskInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new CDNTaskInfo(parcel, (C40890a) null);
        }

        public Object[] newArray(int i) {
            return new CDNTaskInfo[i];
        }
    }

    public CDNTaskInfo() {
    }

    public CDNTaskInfo(Parcel parcel, C40890a aVar) {
        boolean z = false;
        this.f109963d = parcel.readByte() == 1;
        this.f109964e = parcel.readString();
        this.f109965f = parcel.readString();
        this.f109966g = parcel.readString();
        this.f109967h = parcel.readString();
        this.f109968i = parcel.readString();
        this.f109969j = parcel.readInt();
        this.f109970n = parcel.readInt();
        this.f109971o = parcel.readByte() == 1;
        this.f109973q = parcel.readByte() == 1 ? true : z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj == this || (obj != null && (obj instanceof CDNTaskInfo) && ((CDNTaskInfo) obj).f109964e.equals(this.f109964e));
    }

    public int hashCode() {
        return this.f109964e.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f109963d ? (byte) 1 : 0);
        parcel.writeString(this.f109964e);
        parcel.writeString(this.f109965f);
        parcel.writeString(this.f109966g);
        parcel.writeString(this.f109967h);
        parcel.writeString(this.f109968i);
        parcel.writeInt(this.f109969j);
        parcel.writeInt(this.f109970n);
        parcel.writeByte(this.f109971o ? (byte) 1 : 0);
        parcel.writeByte(this.f109973q ? (byte) 1 : 0);
    }

    public CDNTaskInfo(String str) {
        this.f109964e = str;
    }
}
