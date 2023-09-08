package com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;

public class SoterSessionResult implements Parcelable {
    public static final Parcelable.Creator<SoterSessionResult> CREATOR = new C20016a();

    /* renamed from: d */
    public long f56991d;

    /* renamed from: e */
    public int f56992e;

    /* renamed from: com.tencent.soter.soterserver.SoterSessionResult$a */
    public class C20016a implements Parcelable.Creator<SoterSessionResult> {
        public Object createFromParcel(Parcel parcel) {
            return new SoterSessionResult(parcel);
        }

        public Object[] newArray(int i) {
            return new SoterSessionResult[i];
        }
    }

    public SoterSessionResult() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f56991d);
        parcel.writeInt(this.f56992e);
    }

    public SoterSessionResult(Parcel parcel) {
        this.f56991d = parcel.readLong();
        this.f56992e = parcel.readInt();
    }
}
