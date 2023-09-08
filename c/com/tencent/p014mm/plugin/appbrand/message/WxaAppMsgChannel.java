package com.tencent.p014mm.plugin.appbrand.message;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel */
public class WxaAppMsgChannel implements Parcelable {
    public static final Parcelable.Creator<WxaAppMsgChannel> CREATOR = new C40495a();

    /* renamed from: d */
    public String f108799d;

    /* renamed from: e */
    public String f108800e;

    /* renamed from: f */
    public String f108801f;

    /* renamed from: g */
    public String f108802g;

    /* renamed from: h */
    public int f108803h;

    /* renamed from: i */
    public String f108804i;

    /* renamed from: j */
    public long f108805j;

    /* renamed from: com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel$a */
    public class C40495a implements Parcelable.Creator<WxaAppMsgChannel> {
        public Object createFromParcel(Parcel parcel) {
            return new WxaAppMsgChannel(parcel);
        }

        public Object[] newArray(int i) {
            return new WxaAppMsgChannel[i];
        }
    }

    public WxaAppMsgChannel() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f108799d);
        parcel.writeString(this.f108800e);
        parcel.writeString(this.f108801f);
        parcel.writeString(this.f108802g);
        parcel.writeInt(this.f108803h);
        parcel.writeString(this.f108804i);
        parcel.writeLong(this.f108805j);
    }

    public WxaAppMsgChannel(Parcel parcel) {
        this.f108799d = parcel.readString();
        this.f108800e = parcel.readString();
        this.f108801f = parcel.readString();
        this.f108802g = parcel.readString();
        this.f108803h = parcel.readInt();
        this.f108804i = parcel.readString();
        this.f108805j = parcel.readLong();
    }
}
