package com.tencent.p014mm.plugin.report.service;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.report.service.BroadCastData */
class BroadCastData implements Parcelable {
    public static final Parcelable.Creator<BroadCastData> CREATOR = new C115659a();

    /* renamed from: d */
    public ArrayList<KVReportDataInfo> f346923d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<StIDKeyDataInfo> f346924e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<GroupIDKeyDataInfo> f346925f = new ArrayList<>();

    /* renamed from: g */
    public final long[] f346926g = new long[1];

    /* renamed from: com.tencent.mm.plugin.report.service.BroadCastData$a */
    public class C115659a implements Parcelable.Creator<BroadCastData> {
        public Object createFromParcel(Parcel parcel) {
            return new BroadCastData(parcel);
        }

        public Object[] newArray(int i) {
            return new BroadCastData[i];
        }
    }

    public BroadCastData() {
    }

    /* renamed from: a */
    public final void mo175883a(int i) {
        synchronized (this.f346926g) {
            long[] jArr = this.f346926g;
            jArr[0] = jArr[0] + ((long) i);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f346923d);
        parcel.writeTypedList(this.f346924e);
        parcel.writeTypedList(this.f346925f);
    }

    public BroadCastData(BroadCastData broadCastData) {
        if (broadCastData != null) {
            this.f346923d = new ArrayList<>(broadCastData.f346923d);
            this.f346924e = new ArrayList<>(broadCastData.f346924e);
            this.f346925f = new ArrayList<>(broadCastData.f346925f);
        }
    }

    public BroadCastData(Parcel parcel) {
        parcel.readTypedList(this.f346923d, KVReportDataInfo.CREATOR);
        parcel.readTypedList(this.f346924e, StIDKeyDataInfo.CREATOR);
        parcel.readTypedList(this.f346925f, GroupIDKeyDataInfo.CREATOR);
    }
}
