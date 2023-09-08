package com.tencent.p014mm.plugin.appbrand.jsapi.h5_interact;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event */
public class SendDataToMiniProgramFromH5Event implements Parcelable {
    public static final Parcelable.Creator<SendDataToMiniProgramFromH5Event> CREATOR = new C82525a();

    /* renamed from: d */
    public String f241627d;

    /* renamed from: e */
    public String f241628e;

    /* renamed from: f */
    public int f241629f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event$a */
    public class C82525a implements Parcelable.Creator<SendDataToMiniProgramFromH5Event> {
        public Object createFromParcel(Parcel parcel) {
            return new SendDataToMiniProgramFromH5Event(parcel);
        }

        public Object[] newArray(int i) {
            return new SendDataToMiniProgramFromH5Event[i];
        }
    }

    public SendDataToMiniProgramFromH5Event() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f241627d);
        parcel.writeString(this.f241628e);
        parcel.writeInt(this.f241629f);
    }

    public SendDataToMiniProgramFromH5Event(Parcel parcel) {
        this.f241627d = parcel.readString();
        this.f241628e = parcel.readString();
        this.f241629f = parcel.readInt();
    }
}
