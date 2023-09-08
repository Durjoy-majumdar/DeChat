package com.tencent.p014mm.choosemsgfile.compat;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.choosemsgfile.compat.MsgFile */
public class MsgFile implements Parcelable {
    public static final Parcelable.Creator<MsgFile> CREATOR = new C80832a();

    /* renamed from: d */
    public int f237615d;

    /* renamed from: e */
    public String f237616e;

    /* renamed from: f */
    public String f237617f;

    /* renamed from: g */
    public long f237618g;

    /* renamed from: h */
    public String f237619h;

    /* renamed from: i */
    public String f237620i;

    /* renamed from: com.tencent.mm.choosemsgfile.compat.MsgFile$a */
    public class C80832a implements Parcelable.Creator<MsgFile> {
        public Object createFromParcel(Parcel parcel) {
            return new MsgFile(parcel);
        }

        public Object[] newArray(int i) {
            return new MsgFile[i];
        }
    }

    public MsgFile() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MsgFile{fileSize=" + this.f237615d + ", filePath='" + this.f237616e + '\'' + ", fileName='" + this.f237617f + '\'' + ", timeStamp=" + this.f237618g + ", type='" + this.f237619h + '\'' + ", fileExt='" + this.f237620i + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f237615d);
        parcel.writeString(this.f237616e);
        parcel.writeString(this.f237617f);
        parcel.writeLong(this.f237618g);
        parcel.writeString(this.f237619h);
        parcel.writeString(this.f237620i);
    }

    public MsgFile(Parcel parcel) {
        this.f237615d = parcel.readInt();
        this.f237616e = parcel.readString();
        this.f237617f = parcel.readString();
        this.f237618g = parcel.readLong();
        this.f237619h = parcel.readString();
        this.f237620i = parcel.readString();
    }
}
