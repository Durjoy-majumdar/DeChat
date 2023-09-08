package com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;

public class SoterExtraParam implements Parcelable {
    public static final Parcelable.Creator<SoterExtraParam> CREATOR = new C106895a();

    /* renamed from: d */
    public Object f320107d;

    /* renamed from: com.tencent.soter.soterserver.SoterExtraParam$a */
    public class C106895a implements Parcelable.Creator<SoterExtraParam> {
        public Object createFromParcel(Parcel parcel) {
            return new SoterExtraParam(parcel);
        }

        public Object[] newArray(int i) {
            return new SoterExtraParam[i];
        }
    }

    public SoterExtraParam(Parcel parcel) {
        this.f320107d = parcel.readValue(getClass().getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f320107d);
    }
}
