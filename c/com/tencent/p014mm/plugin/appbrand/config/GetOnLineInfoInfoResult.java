package com.tencent.p014mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult */
public class GetOnLineInfoInfoResult implements Parcelable {
    public static final Parcelable.Creator<GetOnLineInfoInfoResult> CREATOR = new C29472a();

    /* renamed from: d */
    public int f80323d;

    /* renamed from: e */
    public int f80324e;

    /* renamed from: f */
    public boolean f80325f;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult$a */
    public class C29472a implements Parcelable.Creator<GetOnLineInfoInfoResult> {
        public Object createFromParcel(Parcel parcel) {
            return new GetOnLineInfoInfoResult(parcel);
        }

        public Object[] newArray(int i) {
            return new GetOnLineInfoInfoResult[i];
        }
    }

    public GetOnLineInfoInfoResult() {
        this.f80323d = -1;
        this.f80324e = 0;
        this.f80325f = false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetOnLineInfoInfoResult)) {
            return false;
        }
        GetOnLineInfoInfoResult getOnLineInfoInfoResult = (GetOnLineInfoInfoResult) obj;
        return this.f80323d == getOnLineInfoInfoResult.f80323d && this.f80324e == getOnLineInfoInfoResult.f80324e && this.f80325f == getOnLineInfoInfoResult.f80325f;
    }

    public String toString() {
        return "GetOnLineInfoInfoResult{iconType=" + this.f80323d + ", clientVersion=" + this.f80324e + ", isWXOnline=" + this.f80325f + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f80323d);
        parcel.writeInt(this.f80324e);
        parcel.writeByte(this.f80325f ? (byte) 1 : 0);
    }

    public GetOnLineInfoInfoResult(Parcel parcel) {
        this.f80323d = -1;
        boolean z = false;
        this.f80324e = 0;
        this.f80325f = false;
        this.f80323d = parcel.readInt();
        this.f80324e = parcel.readInt();
        this.f80325f = parcel.readByte() != 0 ? true : z;
    }
}
