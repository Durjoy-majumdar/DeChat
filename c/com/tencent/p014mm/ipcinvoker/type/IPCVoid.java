package com.tencent.p014mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCVoid */
public class IPCVoid implements Parcelable {
    public static final Parcelable.Creator<IPCVoid> CREATOR = new C1261a();

    /* renamed from: d */
    public static final IPCVoid f10316d = new IPCVoid();

    /* renamed from: com.tencent.mm.ipcinvoker.type.IPCVoid$a */
    public class C1261a implements Parcelable.Creator<IPCVoid> {
        public Object createFromParcel(Parcel parcel) {
            return new IPCVoid();
        }

        public Object[] newArray(int i) {
            return new IPCVoid[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
