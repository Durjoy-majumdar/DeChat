package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/NavigatorInterceptor$CheckIsActiveMiniGameIPCResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.NavigatorInterceptor$CheckIsActiveMiniGameIPCResult */
public final class NavigatorInterceptor$CheckIsActiveMiniGameIPCResult implements Parcelable {
    public static final Parcelable.Creator<NavigatorInterceptor$CheckIsActiveMiniGameIPCResult> CREATOR = new C82790a();

    /* renamed from: d */
    public final boolean f242150d;

    /* renamed from: e */
    public final boolean f242151e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.NavigatorInterceptor$CheckIsActiveMiniGameIPCResult$a */
    public static final class C82790a implements Parcelable.Creator<NavigatorInterceptor$CheckIsActiveMiniGameIPCResult> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new NavigatorInterceptor$CheckIsActiveMiniGameIPCResult(z2, z);
        }

        public Object[] newArray(int i) {
            return new NavigatorInterceptor$CheckIsActiveMiniGameIPCResult[i];
        }
    }

    public NavigatorInterceptor$CheckIsActiveMiniGameIPCResult(boolean z, boolean z2) {
        this.f242150d = z;
        this.f242151e = z2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigatorInterceptor$CheckIsActiveMiniGameIPCResult)) {
            return false;
        }
        NavigatorInterceptor$CheckIsActiveMiniGameIPCResult navigatorInterceptor$CheckIsActiveMiniGameIPCResult = (NavigatorInterceptor$CheckIsActiveMiniGameIPCResult) obj;
        return this.f242150d == navigatorInterceptor$CheckIsActiveMiniGameIPCResult.f242150d && this.f242151e == navigatorInterceptor$CheckIsActiveMiniGameIPCResult.f242151e;
    }

    public int hashCode() {
        boolean z = this.f242150d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f242151e;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        return "CheckIsActiveMiniGameIPCResult(isAlive=" + this.f242150d + ", isGame=" + this.f242151e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f242150d ? 1 : 0);
        parcel.writeInt(this.f242151e ? 1 : 0);
    }
}
