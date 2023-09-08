package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.AppIdentity */
public final class AppIdentity implements Parcelable {
    public static final Parcelable.Creator<AppIdentity> CREATOR = new C81464a();

    /* renamed from: d */
    public final String f239038d;

    /* renamed from: e */
    public final int f239039e;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.AppIdentity$a */
    public class C81464a implements Parcelable.Creator<AppIdentity> {
        public Object createFromParcel(Parcel parcel) {
            return new AppIdentity(parcel);
        }

        public Object[] newArray(int i) {
            return new AppIdentity[i];
        }
    }

    public AppIdentity(String str, int i) {
        this.f239038d = str;
        this.f239039e = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f239038d);
        parcel.writeInt(this.f239039e);
    }

    public AppIdentity(Parcel parcel) {
        this.f239038d = parcel.readString();
        this.f239039e = parcel.readInt();
    }
}
