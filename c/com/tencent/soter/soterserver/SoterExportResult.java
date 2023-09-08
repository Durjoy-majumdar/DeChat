package com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;

public class SoterExportResult implements Parcelable {
    public static final Parcelable.Creator<SoterExportResult> CREATOR = new C20015a();

    /* renamed from: d */
    public int f56988d;

    /* renamed from: e */
    public byte[] f56989e;

    /* renamed from: f */
    public int f56990f;

    /* renamed from: com.tencent.soter.soterserver.SoterExportResult$a */
    public class C20015a implements Parcelable.Creator<SoterExportResult> {
        public Object createFromParcel(Parcel parcel) {
            return new SoterExportResult(parcel);
        }

        public Object[] newArray(int i) {
            return new SoterExportResult[i];
        }
    }

    public SoterExportResult() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f56988d);
        parcel.writeByteArray(this.f56989e);
        parcel.writeInt(this.f56990f);
    }

    public SoterExportResult(Parcel parcel) {
        this.f56988d = parcel.readInt();
        this.f56989e = parcel.createByteArray();
        this.f56990f = parcel.readInt();
    }
}
