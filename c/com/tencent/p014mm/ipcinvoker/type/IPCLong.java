package com.tencent.p014mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCLong */
public class IPCLong implements Parcelable {
    public static final Parcelable.Creator<IPCLong> CREATOR = new C1259a();

    /* renamed from: d */
    public long f10314d;

    /* renamed from: com.tencent.mm.ipcinvoker.type.IPCLong$a */
    public class C1259a implements Parcelable.Creator<IPCLong> {
        public Object createFromParcel(Parcel parcel) {
            IPCLong iPCLong = new IPCLong();
            iPCLong.f10314d = parcel.readLong();
            return iPCLong;
        }

        public Object[] newArray(int i) {
            return new IPCLong[i];
        }
    }

    public IPCLong() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IPCLong) {
            return this.f10314d == ((IPCLong) obj).f10314d;
        }
        if (obj instanceof Long) {
            return obj.equals(Long.valueOf(this.f10314d));
        }
        return false;
    }

    public String toString() {
        return Long.toString(this.f10314d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f10314d);
    }

    public IPCLong(long j) {
        this.f10314d = j;
    }
}
