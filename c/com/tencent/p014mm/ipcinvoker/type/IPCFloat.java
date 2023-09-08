package com.tencent.p014mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCFloat */
public class IPCFloat implements Parcelable {
    public static final Parcelable.Creator<IPCFloat> CREATOR = new C114731a();

    /* renamed from: d */
    public float f343954d;

    /* renamed from: com.tencent.mm.ipcinvoker.type.IPCFloat$a */
    public class C114731a implements Parcelable.Creator<IPCFloat> {
        public Object createFromParcel(Parcel parcel) {
            IPCFloat iPCFloat = new IPCFloat();
            iPCFloat.f343954d = parcel.readFloat();
            return iPCFloat;
        }

        public Object[] newArray(int i) {
            return new IPCFloat[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IPCFloat) {
            return this.f343954d == ((IPCFloat) obj).f343954d;
        }
        if (obj instanceof Float) {
            return obj.equals(Float.valueOf(this.f343954d));
        }
        return false;
    }

    public String toString() {
        return Float.toString(this.f343954d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f343954d);
    }
}
