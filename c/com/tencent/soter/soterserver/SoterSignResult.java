package com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;

public class SoterSignResult implements Parcelable {
    public static final Parcelable.Creator<SoterSignResult> CREATOR = new C20017a();

    /* renamed from: d */
    public int f56993d;

    /* renamed from: e */
    public byte[] f56994e;

    /* renamed from: f */
    public int f56995f;

    /* renamed from: com.tencent.soter.soterserver.SoterSignResult$a */
    public class C20017a implements Parcelable.Creator<SoterSignResult> {
        public Object createFromParcel(Parcel parcel) {
            return new SoterSignResult(parcel);
        }

        public Object[] newArray(int i) {
            return new SoterSignResult[i];
        }
    }

    public SoterSignResult() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f56993d);
        parcel.writeByteArray(this.f56994e);
        parcel.writeInt(this.f56995f);
    }

    public SoterSignResult(Parcel parcel) {
        this.f56993d = parcel.readInt();
        this.f56994e = parcel.createByteArray();
        this.f56995f = parcel.readInt();
    }
}
