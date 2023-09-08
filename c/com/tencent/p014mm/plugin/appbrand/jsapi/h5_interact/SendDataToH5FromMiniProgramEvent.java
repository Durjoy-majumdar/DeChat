package com.tencent.p014mm.plugin.appbrand.jsapi.h5_interact;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent */
public class SendDataToH5FromMiniProgramEvent extends IEvent implements Parcelable {
    public static final Parcelable.Creator<SendDataToH5FromMiniProgramEvent> CREATOR = new C40466a();

    /* renamed from: d */
    public String f108754d;

    /* renamed from: e */
    public String f108755e;

    /* renamed from: f */
    public int f108756f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent$a */
    public class C40466a implements Parcelable.Creator<SendDataToH5FromMiniProgramEvent> {
        public Object createFromParcel(Parcel parcel) {
            return new SendDataToH5FromMiniProgramEvent(parcel);
        }

        public Object[] newArray(int i) {
            return new SendDataToH5FromMiniProgramEvent[i];
        }
    }

    public SendDataToH5FromMiniProgramEvent() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f108754d);
        parcel.writeString(this.f108755e);
        parcel.writeInt(this.f108756f);
    }

    public SendDataToH5FromMiniProgramEvent(Parcel parcel) {
        this.f108754d = parcel.readString();
        this.f108755e = parcel.readString();
        this.f108756f = parcel.readInt();
    }
}
