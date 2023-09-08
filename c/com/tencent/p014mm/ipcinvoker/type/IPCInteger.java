package com.tencent.p014mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCInteger */
public class IPCInteger implements Parcelable {
    public static final Parcelable.Creator<IPCInteger> CREATOR = new C1258a();

    /* renamed from: d */
    public int f10313d;

    /* renamed from: com.tencent.mm.ipcinvoker.type.IPCInteger$a */
    public class C1258a implements Parcelable.Creator<IPCInteger> {
        public Object createFromParcel(Parcel parcel) {
            IPCInteger iPCInteger = new IPCInteger();
            iPCInteger.f10313d = parcel.readInt();
            return iPCInteger;
        }

        public Object[] newArray(int i) {
            return new IPCInteger[i];
        }
    }

    public IPCInteger() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IPCInteger) {
            return this.f10313d == ((IPCInteger) obj).f10313d;
        }
        if (obj instanceof Integer) {
            return obj.equals(Integer.valueOf(this.f10313d));
        }
        return false;
    }

    public String toString() {
        return Integer.toString(this.f10313d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10313d);
    }

    public IPCInteger(int i) {
        this.f10313d = i;
    }
}
