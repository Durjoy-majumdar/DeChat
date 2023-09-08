package com.tencent.p014mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCByte */
public class IPCByte implements Parcelable {
    public static final Parcelable.Creator<IPCByte> CREATOR = new C114729a();

    /* renamed from: d */
    public byte f343952d;

    /* renamed from: com.tencent.mm.ipcinvoker.type.IPCByte$a */
    public class C114729a implements Parcelable.Creator<IPCByte> {
        public Object createFromParcel(Parcel parcel) {
            IPCByte iPCByte = new IPCByte();
            iPCByte.f343952d = parcel.readByte();
            return iPCByte;
        }

        public Object[] newArray(int i) {
            return new IPCByte[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IPCByte) {
            return this.f343952d == ((IPCByte) obj).f343952d;
        }
        if (obj instanceof Byte) {
            return obj.equals(Byte.valueOf(this.f343952d));
        }
        return false;
    }

    public String toString() {
        return Integer.toString(this.f343952d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f343952d);
    }
}
