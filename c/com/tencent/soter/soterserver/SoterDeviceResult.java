package com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;

public class SoterDeviceResult implements Parcelable {
    public static final Parcelable.Creator<SoterDeviceResult> CREATOR = new C86042a();

    /* renamed from: d */
    public int f250522d;

    /* renamed from: e */
    public byte[] f250523e;

    /* renamed from: f */
    public int f250524f;

    /* renamed from: com.tencent.soter.soterserver.SoterDeviceResult$a */
    public class C86042a implements Parcelable.Creator<SoterDeviceResult> {
        public Object createFromParcel(Parcel parcel) {
            return new SoterDeviceResult(parcel);
        }

        public Object[] newArray(int i) {
            return new SoterDeviceResult[i];
        }
    }

    public SoterDeviceResult() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f250522d);
        parcel.writeByteArray(this.f250523e);
        parcel.writeInt(this.f250524f);
    }

    public SoterDeviceResult(Parcel parcel) {
        this.f250522d = parcel.readInt();
        this.f250523e = parcel.createByteArray();
        this.f250524f = parcel.readInt();
    }
}
