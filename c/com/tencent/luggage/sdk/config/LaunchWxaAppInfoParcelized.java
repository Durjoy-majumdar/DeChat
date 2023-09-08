package com.tencent.luggage.sdk.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/config/LaunchWxaAppInfoParcelized;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class LaunchWxaAppInfoParcelized implements Parcelable {
    public static final Parcelable.Creator<LaunchWxaAppInfoParcelized> CREATOR = new C80226a();

    /* renamed from: d */
    public AppRuntimeApiPermissionBundle f234895d;

    /* renamed from: e */
    public Parcelable f234896e;

    /* renamed from: f */
    public String f234897f;

    /* renamed from: g */
    public boolean f234898g;

    /* renamed from: h */
    public boolean f234899h;

    /* renamed from: i */
    public LaunchWxaAppMigrateInfoParcelized f234900i;

    /* renamed from: com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized$a */
    public static final class C80226a implements Parcelable.Creator<LaunchWxaAppInfoParcelized> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle = (AppRuntimeApiPermissionBundle) parcel.readParcelable(LaunchWxaAppInfoParcelized.class.getClassLoader());
            Parcelable readParcelable = parcel.readParcelable(LaunchWxaAppInfoParcelized.class.getClassLoader());
            String readString = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new LaunchWxaAppInfoParcelized(appRuntimeApiPermissionBundle, readParcelable, readString, z2, z, parcel.readInt() == 0 ? null : LaunchWxaAppMigrateInfoParcelized.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new LaunchWxaAppInfoParcelized[i];
        }
    }

    public LaunchWxaAppInfoParcelized(AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle, Parcelable parcelable, String str, boolean z, boolean z2, LaunchWxaAppMigrateInfoParcelized launchWxaAppMigrateInfoParcelized) {
        this.f234895d = appRuntimeApiPermissionBundle;
        this.f234896e = parcelable;
        this.f234897f = str;
        this.f234898g = z;
        this.f234899h = z2;
        this.f234900i = launchWxaAppMigrateInfoParcelized;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeParcelable(this.f234895d, i);
        parcel.writeParcelable(this.f234896e, i);
        parcel.writeString(this.f234897f);
        parcel.writeInt(this.f234898g ? 1 : 0);
        parcel.writeInt(this.f234899h ? 1 : 0);
        LaunchWxaAppMigrateInfoParcelized launchWxaAppMigrateInfoParcelized = this.f234900i;
        if (launchWxaAppMigrateInfoParcelized == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        launchWxaAppMigrateInfoParcelized.writeToParcel(parcel, i);
    }
}
