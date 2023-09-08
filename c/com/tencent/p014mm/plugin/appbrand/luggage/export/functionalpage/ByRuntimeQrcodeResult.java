package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.ByRuntimeQrcodeResult */
public class ByRuntimeQrcodeResult implements Parcelable {
    public static final Parcelable.Creator<ByRuntimeQrcodeResult> CREATOR = new C83548a();

    /* renamed from: d */
    public String f244073d;

    /* renamed from: e */
    public String f244074e;

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.ByRuntimeQrcodeResult$a */
    public class C83548a implements Parcelable.Creator<ByRuntimeQrcodeResult> {
        public Object createFromParcel(Parcel parcel) {
            return new ByRuntimeQrcodeResult(parcel);
        }

        public Object[] newArray(int i) {
            return new ByRuntimeQrcodeResult[i];
        }
    }

    public ByRuntimeQrcodeResult(String str, String str2) {
        this.f244073d = str;
        this.f244074e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f244073d);
        parcel.writeString(this.f244074e);
    }

    public ByRuntimeQrcodeResult(Parcel parcel) {
        this.f244073d = parcel.readString();
        this.f244074e = parcel.readString();
    }
}
