package com.tencent.p014mm.plugin.report.service;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.report.service.StIDKeyDataInfo */
class StIDKeyDataInfo implements Parcelable {
    public static final Parcelable.Creator<StIDKeyDataInfo> CREATOR = new C115665a();

    /* renamed from: d */
    public long f346944d;

    /* renamed from: e */
    public long f346945e;

    /* renamed from: f */
    public long f346946f;

    /* renamed from: g */
    public boolean f346947g;

    /* renamed from: com.tencent.mm.plugin.report.service.StIDKeyDataInfo$a */
    public class C115665a implements Parcelable.Creator<StIDKeyDataInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new StIDKeyDataInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new StIDKeyDataInfo[i];
        }
    }

    public StIDKeyDataInfo() {
    }

    public StIDKeyDataInfo(Parcel parcel) {
        this.f346944d = parcel.readLong();
        this.f346945e = parcel.readLong();
        this.f346946f = parcel.readLong();
        this.f346947g = parcel.readInt() != 1 ? false : true;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f346944d);
        parcel.writeLong(this.f346945e);
        parcel.writeLong(this.f346946f);
        parcel.writeInt(this.f346947g ? 1 : 0);
    }
}
