package com.tencent.p014mm.plugin.appbrand.permission;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import java.util.Locale;
import te3.C48761au;

/* renamed from: com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle */
public final class AppRuntimeApiPermissionBundle implements Parcelable, C1727m {
    public static final Parcelable.Creator<AppRuntimeApiPermissionBundle> CREATOR = new C84011a();

    /* renamed from: g */
    public static AppRuntimeApiPermissionBundle f245265g = new AppRuntimeApiPermissionBundle();

    /* renamed from: d */
    public final byte[] f245266d;

    /* renamed from: e */
    public final byte[] f245267e;

    /* renamed from: f */
    public final byte[] f245268f;

    /* renamed from: com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle$a */
    public class C84011a implements Parcelable.Creator<AppRuntimeApiPermissionBundle> {
        public Object createFromParcel(Parcel parcel) {
            return new AppRuntimeApiPermissionBundle(parcel, (C84011a) null);
        }

        public Object[] newArray(int i) {
            return new AppRuntimeApiPermissionBundle[i];
        }
    }

    public AppRuntimeApiPermissionBundle(C48761au auVar) {
        this.f245266d = auVar.f130770d.f257327a;
        this.f245267e = auVar.f130771e.get(0).f257327a;
        this.f245268f = auVar.f130771e.get(1).f257327a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format(Locale.US, "PermissionBundle[%d][%d][%d]", new Object[]{Integer.valueOf(this.f245266d.length), Integer.valueOf(this.f245267e.length), Integer.valueOf(this.f245268f.length)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f245266d);
        parcel.writeByteArray(this.f245267e);
        parcel.writeByteArray(this.f245268f);
    }

    private AppRuntimeApiPermissionBundle() {
        this.f245266d = new byte[0];
        this.f245267e = new byte[0];
        this.f245268f = new byte[0];
    }

    public AppRuntimeApiPermissionBundle(Parcel parcel, C84011a aVar) {
        this.f245266d = parcel.createByteArray();
        this.f245267e = parcel.createByteArray();
        this.f245268f = parcel.createByteArray();
    }
}
