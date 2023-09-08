package com.tencent.p014mm.plugin.downloader_app.api;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo */
public class DownloadWidgetTaskInfo implements Parcelable {
    public static final Parcelable.Creator<DownloadWidgetTaskInfo> CREATOR = new C40978a();

    /* renamed from: d */
    public String f110282d;

    /* renamed from: e */
    public long f110283e;

    /* renamed from: f */
    public String f110284f;

    /* renamed from: g */
    public int f110285g;

    /* renamed from: h */
    public boolean f110286h;

    /* renamed from: i */
    public float f110287i;

    /* renamed from: j */
    public int f110288j;

    /* renamed from: com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo$a */
    public class C40978a implements Parcelable.Creator<DownloadWidgetTaskInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new DownloadWidgetTaskInfo(parcel, (C40978a) null);
        }

        public Object[] newArray(int i) {
            return new DownloadWidgetTaskInfo[i];
        }
    }

    public DownloadWidgetTaskInfo() {
    }

    public DownloadWidgetTaskInfo(Parcel parcel, C40978a aVar) {
        this.f110282d = parcel.readString();
        this.f110283e = parcel.readLong();
        this.f110284f = parcel.readString();
        this.f110285g = parcel.readInt();
        this.f110286h = parcel.readInt() != 1 ? false : true;
        this.f110287i = parcel.readFloat();
        this.f110288j = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110282d);
        parcel.writeLong(this.f110283e);
        parcel.writeString(this.f110284f);
        parcel.writeInt(this.f110285g);
        parcel.writeInt(this.f110286h ? 1 : 0);
        parcel.writeFloat(this.f110287i);
        parcel.writeInt(this.f110288j);
    }
}
