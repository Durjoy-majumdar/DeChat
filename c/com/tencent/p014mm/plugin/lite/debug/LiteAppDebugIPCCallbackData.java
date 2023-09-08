package com.tencent.p014mm.plugin.lite.debug;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.lite.debug.LiteAppDebugIPCCallbackData */
class LiteAppDebugIPCCallbackData implements Parcelable {
    public static final Parcelable.Creator<LiteAppDebugIPCCallbackData> CREATOR = new C69111a();

    /* renamed from: d */
    public String f198745d = null;

    /* renamed from: com.tencent.mm.plugin.lite.debug.LiteAppDebugIPCCallbackData$a */
    public class C69111a implements Parcelable.Creator<LiteAppDebugIPCCallbackData> {
        public Object createFromParcel(Parcel parcel) {
            return new LiteAppDebugIPCCallbackData(parcel);
        }

        public Object[] newArray(int i) {
            return new LiteAppDebugIPCCallbackData[i];
        }
    }

    public LiteAppDebugIPCCallbackData() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f198745d);
    }

    public LiteAppDebugIPCCallbackData(Parcel parcel) {
        this.f198745d = parcel.readString();
    }
}
