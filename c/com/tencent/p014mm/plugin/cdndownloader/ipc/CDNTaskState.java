package com.tencent.p014mm.plugin.cdndownloader.ipc;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState */
public class CDNTaskState implements Parcelable {
    public static final Parcelable.Creator<CDNTaskState> CREATOR = new C40891a();

    /* renamed from: d */
    public int f109974d = -100;

    /* renamed from: e */
    public long f109975e = 0;

    /* renamed from: f */
    public long f109976f = 0;

    /* renamed from: com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState$a */
    public class C40891a implements Parcelable.Creator<CDNTaskState> {
        public Object createFromParcel(Parcel parcel) {
            CDNTaskState cDNTaskState = new CDNTaskState();
            cDNTaskState.f109974d = parcel.readInt();
            cDNTaskState.f109975e = parcel.readLong();
            cDNTaskState.f109976f = parcel.readLong();
            return cDNTaskState;
        }

        public Object[] newArray(int i) {
            return new CDNTaskState[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f109974d);
        parcel.writeLong(this.f109975e);
        parcel.writeLong(this.f109976f);
    }
}
