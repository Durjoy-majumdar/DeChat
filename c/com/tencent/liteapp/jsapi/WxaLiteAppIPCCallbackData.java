package com.tencent.liteapp.jsapi;

import android.os.Parcel;
import android.os.Parcelable;

public class WxaLiteAppIPCCallbackData implements Parcelable {
    public static final Parcelable.Creator<WxaLiteAppIPCCallbackData> CREATOR = new C28636a();

    /* renamed from: d */
    public boolean f78566d = false;

    /* renamed from: e */
    public String f78567e = null;

    /* renamed from: f */
    public String f78568f = null;

    /* renamed from: com.tencent.liteapp.jsapi.WxaLiteAppIPCCallbackData$a */
    public class C28636a implements Parcelable.Creator<WxaLiteAppIPCCallbackData> {
        public Object createFromParcel(Parcel parcel) {
            return new WxaLiteAppIPCCallbackData(parcel);
        }

        public Object[] newArray(int i) {
            return new WxaLiteAppIPCCallbackData[i];
        }
    }

    public WxaLiteAppIPCCallbackData() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f78566d ? 1 : 0);
        parcel.writeString(this.f78567e);
        parcel.writeString(this.f78568f);
    }

    public WxaLiteAppIPCCallbackData(Parcel parcel) {
        boolean z = false;
        this.f78566d = parcel.readInt() == 1 ? true : z;
        this.f78567e = parcel.readString();
        this.f78568f = parcel.readString();
    }
}
