package com.tencent.p014mm.plugin.appbrand.jsapi.errno;

import android.os.Parcel;
import android.os.Parcelable;
import fl0.C86918c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable */
public class AppBrandErrorInfoParcelable implements Parcelable {
    public static final Parcelable.Creator<AppBrandErrorInfoParcelable> CREATOR = new C82380a();

    /* renamed from: d */
    public int f241429d;

    /* renamed from: e */
    public String f241430e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable$a */
    public class C82380a implements Parcelable.Creator<AppBrandErrorInfoParcelable> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandErrorInfoParcelable(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandErrorInfoParcelable[i];
        }
    }

    public AppBrandErrorInfoParcelable() {
    }

    public AppBrandErrorInfoParcelable(C86918c cVar) {
        this.f241429d = cVar.f252304a;
        this.f241430e = cVar.f252305b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f241429d);
        parcel.writeString(this.f241430e);
    }

    public AppBrandErrorInfoParcelable(Parcel parcel) {
        this.f241429d = parcel.readInt();
        this.f241430e = parcel.readString();
    }
}
