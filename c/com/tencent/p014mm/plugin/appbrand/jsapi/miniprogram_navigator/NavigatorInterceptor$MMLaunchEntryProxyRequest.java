package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/NavigatorInterceptor$MMLaunchEntryProxyRequest", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.NavigatorInterceptor$MMLaunchEntryProxyRequest */
final class NavigatorInterceptor$MMLaunchEntryProxyRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C82791a CREATOR = new C82791a((C8480h) null);

    /* renamed from: d */
    public final LaunchParcel f242152d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.NavigatorInterceptor$MMLaunchEntryProxyRequest$a */
    public static final class C82791a implements Parcelable.Creator<NavigatorInterceptor$MMLaunchEntryProxyRequest> {
        public C82791a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new NavigatorInterceptor$MMLaunchEntryProxyRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new NavigatorInterceptor$MMLaunchEntryProxyRequest[i];
        }
    }

    public NavigatorInterceptor$MMLaunchEntryProxyRequest(LaunchParcel launchParcel) {
        C87412m.m108594g(launchParcel, "args");
        this.f242152d = launchParcel;
    }

    public Class<C82821s> getTaskClass() {
        return C82821s.class;
    }

    public boolean oneShotForeground() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeParcelable(this.f242152d, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigatorInterceptor$MMLaunchEntryProxyRequest(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parcel"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.Class<com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel> r0 = com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r2 = r2.readParcelable(r0)
            gy3.C87412m.m108591d(r2)
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r2 = (com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel) r2
            r1.<init>((com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.NavigatorInterceptor$MMLaunchEntryProxyRequest.<init>(android.os.Parcel):void");
    }
}
