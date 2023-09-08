package com.tencent.p014mm.plugin.appbrand.permission.appidABTest;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;

/* renamed from: com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle */
public class AppRuntimeAppidABTestPermissionBundle implements Parcelable, C1727m {
    public static final Parcelable.Creator<AppRuntimeAppidABTestPermissionBundle> CREATOR = new C84012a();

    /* renamed from: d */
    public final byte[] f245269d;

    /* renamed from: com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle$a */
    public class C84012a implements Parcelable.Creator<AppRuntimeAppidABTestPermissionBundle> {
        public Object createFromParcel(Parcel parcel) {
            return new AppRuntimeAppidABTestPermissionBundle(parcel);
        }

        public Object[] newArray(int i) {
            return new AppRuntimeAppidABTestPermissionBundle[i];
        }
    }

    public AppRuntimeAppidABTestPermissionBundle(byte[] bArr) {
        this.f245269d = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f245269d);
    }

    public AppRuntimeAppidABTestPermissionBundle(Parcel parcel) {
        this.f245269d = parcel.createByteArray();
    }
}
