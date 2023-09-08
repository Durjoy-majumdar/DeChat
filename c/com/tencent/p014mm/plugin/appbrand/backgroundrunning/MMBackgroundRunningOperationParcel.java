package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel */
public class MMBackgroundRunningOperationParcel implements Parcelable {
    public static final Parcelable.Creator<MMBackgroundRunningOperationParcel> CREATOR = new C81576a();

    /* renamed from: d */
    public String f239244d;

    /* renamed from: e */
    public int f239245e;

    /* renamed from: f */
    public int f239246f;

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel$a */
    public class C81576a implements Parcelable.Creator<MMBackgroundRunningOperationParcel> {
        public Object createFromParcel(Parcel parcel) {
            return new MMBackgroundRunningOperationParcel(parcel);
        }

        public Object[] newArray(int i) {
            return new MMBackgroundRunningOperationParcel[i];
        }
    }

    public MMBackgroundRunningOperationParcel() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "operation{appId='" + this.f239244d + '\'' + ", usage=" + this.f239245e + ", operation=" + this.f239246f + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f239244d);
        parcel.writeInt(this.f239245e);
        parcel.writeInt(this.f239246f);
    }

    public MMBackgroundRunningOperationParcel(Parcel parcel) {
        this.f239244d = parcel.readString();
        this.f239245e = parcel.readInt();
        this.f239246f = parcel.readInt();
    }
}
