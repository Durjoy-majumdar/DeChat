package com.tencent.p014mm.plugin.appbrand.jsapi.openvoice;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.openvoice.AppBrandVoIP1v1FloatBallEvent */
public class AppBrandVoIP1v1FloatBallEvent implements Parcelable {
    public static final Parcelable.Creator<AppBrandVoIP1v1FloatBallEvent> CREATOR = new C82869a();

    /* renamed from: d */
    public int f242313d = 0;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.openvoice.AppBrandVoIP1v1FloatBallEvent$a */
    public class C82869a implements Parcelable.Creator<AppBrandVoIP1v1FloatBallEvent> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandVoIP1v1FloatBallEvent(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandVoIP1v1FloatBallEvent[i];
        }
    }

    public AppBrandVoIP1v1FloatBallEvent() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f242313d);
    }

    public AppBrandVoIP1v1FloatBallEvent(Parcel parcel) {
        this.f242313d = parcel.readInt();
    }
}
