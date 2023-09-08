package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs */
public final class NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs implements Parcelable {
    public static final Parcelable.Creator<NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs> CREATOR = new C29529a();

    /* renamed from: d */
    public final String f80418d;

    /* renamed from: e */
    public final int f80419e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs$a */
    public static final class C29529a implements Parcelable.Creator<NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs(parcel.readString(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs[i];
        }
    }

    public NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs(String str, int i) {
        C87412m.m108594g(str, "appId");
        this.f80418d = str;
        this.f80419e = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs)) {
            return false;
        }
        NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs navigatorInterceptor$CheckIsActiveMiniGameIPCArgs = (NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs) obj;
        return C87412m.m108589b(this.f80418d, navigatorInterceptor$CheckIsActiveMiniGameIPCArgs.f80418d) && this.f80419e == navigatorInterceptor$CheckIsActiveMiniGameIPCArgs.f80419e;
    }

    public int hashCode() {
        return (this.f80418d.hashCode() * 31) + this.f80419e;
    }

    public String toString() {
        return "CheckIsActiveMiniGameIPCArgs(appId=" + this.f80418d + ", versionType=" + this.f80419e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f80418d);
        parcel.writeInt(this.f80419e);
    }
}
