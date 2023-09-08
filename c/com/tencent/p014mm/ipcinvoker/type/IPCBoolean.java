package com.tencent.p014mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCBoolean */
public class IPCBoolean implements Parcelable {
    public static final Parcelable.Creator<IPCBoolean> CREATOR = new C1257a();

    /* renamed from: d */
    public boolean f10312d;

    /* renamed from: com.tencent.mm.ipcinvoker.type.IPCBoolean$a */
    public class C1257a implements Parcelable.Creator<IPCBoolean> {
        public Object createFromParcel(Parcel parcel) {
            IPCBoolean iPCBoolean = new IPCBoolean();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            iPCBoolean.f10312d = z;
            return iPCBoolean;
        }

        public Object[] newArray(int i) {
            return new IPCBoolean[i];
        }
    }

    public IPCBoolean() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IPCBoolean) {
            return this.f10312d == ((IPCBoolean) obj).f10312d;
        }
        if (obj instanceof Boolean) {
            return obj.equals(Boolean.valueOf(this.f10312d));
        }
        return false;
    }

    public String toString() {
        return Boolean.toString(this.f10312d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10312d ? 1 : 0);
    }

    public IPCBoolean(boolean z) {
        this.f10312d = z;
    }
}
