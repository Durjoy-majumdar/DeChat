package com.tencent.p014mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCDouble */
public class IPCDouble implements Parcelable {
    public static final Parcelable.Creator<IPCDouble> CREATOR = new C114730a();

    /* renamed from: d */
    public double f343953d;

    /* renamed from: com.tencent.mm.ipcinvoker.type.IPCDouble$a */
    public class C114730a implements Parcelable.Creator<IPCDouble> {
        public Object createFromParcel(Parcel parcel) {
            IPCDouble iPCDouble = new IPCDouble();
            iPCDouble.f343953d = parcel.readDouble();
            return iPCDouble;
        }

        public Object[] newArray(int i) {
            return new IPCDouble[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IPCDouble) {
            return this.f343953d == ((IPCDouble) obj).f343953d;
        }
        if (obj instanceof Double) {
            return obj.equals(Double.valueOf(this.f343953d));
        }
        return false;
    }

    public String toString() {
        return Double.toString(this.f343953d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f343953d);
    }
}
