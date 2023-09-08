package com.tencent.p014mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCString */
public class IPCString implements Parcelable {
    public static final Parcelable.Creator<IPCString> CREATOR = new C1260a();

    /* renamed from: d */
    public String f10315d;

    /* renamed from: com.tencent.mm.ipcinvoker.type.IPCString$a */
    public class C1260a implements Parcelable.Creator<IPCString> {
        public Object createFromParcel(Parcel parcel) {
            IPCString iPCString = new IPCString();
            iPCString.f10315d = parcel.readString();
            return iPCString;
        }

        public Object[] newArray(int i) {
            return new IPCString[i];
        }
    }

    public IPCString() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IPCString) {
            String str = this.f10315d;
            String str2 = ((IPCString) obj).f10315d;
            if (str != str2) {
                return str != null && str.equals(str2);
            }
            return true;
        } else if (obj instanceof String) {
            return obj.equals(this.f10315d);
        } else {
            return false;
        }
    }

    public String toString() {
        return this.f10315d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10315d);
    }

    public IPCString(String str) {
        this.f10315d = str;
    }
}
