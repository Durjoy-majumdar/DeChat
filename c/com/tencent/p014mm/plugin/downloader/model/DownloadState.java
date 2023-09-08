package com.tencent.p014mm.plugin.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.downloader.model.DownloadState */
public class DownloadState implements Parcelable {
    public static final Parcelable.Creator<DownloadState> CREATOR = new C55616a();

    /* renamed from: d */
    public String f158301d;

    /* renamed from: e */
    public long f158302e;

    /* renamed from: f */
    public String f158303f;

    /* renamed from: g */
    public long f158304g;

    /* renamed from: h */
    public long f158305h;

    /* renamed from: i */
    public float f158306i;

    /* renamed from: com.tencent.mm.plugin.downloader.model.DownloadState$a */
    public class C55616a implements Parcelable.Creator<DownloadState> {
        public Object createFromParcel(Parcel parcel) {
            return new DownloadState(parcel, (C55616a) null);
        }

        public Object[] newArray(int i) {
            return new DownloadState[i];
        }
    }

    public DownloadState() {
    }

    public DownloadState(Parcel parcel, C55616a aVar) {
        this.f158301d = parcel.readString();
        this.f158302e = parcel.readLong();
        this.f158303f = parcel.readString();
        this.f158304g = parcel.readLong();
        this.f158305h = parcel.readLong();
        this.f158306i = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f158301d);
        parcel.writeLong(this.f158302e);
        parcel.writeString(this.f158303f);
        parcel.writeLong(this.f158304g);
        parcel.writeLong(this.f158305h);
        parcel.writeFloat(this.f158306i);
    }
}
