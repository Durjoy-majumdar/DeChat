package com.tencent.p014mm.plugin.report.service;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.report.service.KVReportDataInfo */
class KVReportDataInfo implements Parcelable {
    public static final Parcelable.Creator<KVReportDataInfo> CREATOR = new C115664a();

    /* renamed from: d */
    public long f346938d;

    /* renamed from: e */
    public long f346939e = 0;

    /* renamed from: f */
    public String f346940f;

    /* renamed from: g */
    public boolean f346941g;

    /* renamed from: h */
    public boolean f346942h;

    /* renamed from: i */
    public boolean f346943i;

    /* renamed from: com.tencent.mm.plugin.report.service.KVReportDataInfo$a */
    public class C115664a implements Parcelable.Creator<KVReportDataInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new KVReportDataInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new KVReportDataInfo[i];
        }
    }

    public KVReportDataInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f346938d);
        parcel.writeLong(this.f346939e);
        parcel.writeString(this.f346940f);
        parcel.writeInt(this.f346941g ? 1 : 0);
        parcel.writeInt(this.f346942h ? 1 : 0);
        parcel.writeInt(this.f346943i ? 1 : 0);
    }

    public KVReportDataInfo(Parcel parcel) {
        this.f346938d = parcel.readLong();
        this.f346939e = parcel.readLong();
        this.f346940f = parcel.readString();
        boolean z = false;
        this.f346941g = parcel.readInt() == 1;
        this.f346942h = parcel.readInt() == 1;
        this.f346943i = parcel.readInt() == 1 ? true : z;
    }
}
