package com.tencent.p014mm.plugin.lite.api;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.lite.api.IPCCallbackData */
class IPCCallbackData implements Parcelable {
    public static final Parcelable.Creator<IPCCallbackData> CREATOR = new C4769a();

    /* renamed from: d */
    public boolean f19810d = false;

    /* renamed from: e */
    public boolean f19811e = false;

    /* renamed from: f */
    public String f19812f = null;

    /* renamed from: g */
    public String f19813g = null;

    /* renamed from: com.tencent.mm.plugin.lite.api.IPCCallbackData$a */
    public class C4769a implements Parcelable.Creator<IPCCallbackData> {
        public Object createFromParcel(Parcel parcel) {
            return new IPCCallbackData(parcel);
        }

        public Object[] newArray(int i) {
            return new IPCCallbackData[i];
        }
    }

    public IPCCallbackData() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19810d ? 1 : 0);
        parcel.writeInt(this.f19811e ? 1 : 0);
        parcel.writeString(this.f19812f);
        parcel.writeString(this.f19813g);
    }

    public IPCCallbackData(Parcel parcel) {
        boolean z = false;
        this.f19810d = parcel.readInt() == 1;
        this.f19811e = parcel.readInt() == 1 ? true : z;
        this.f19812f = parcel.readString();
        this.f19813g = parcel.readString();
    }
}
