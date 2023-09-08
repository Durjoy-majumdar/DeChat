package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.luggage.sdk.launching.C80241b;
import com.tencent.luggage.sdk.launching.C80243d;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.MiniProgramNavigationBackResult;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29553m0;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84273a0;
import com.tencent.p014mm.plugin.appbrand.task.C84274b0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import nj0.C34855o;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic */
public final class MiniProgramNavigatorUglyLogic {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/MiniProgramNavigatorUglyLogic$ProxyRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyRequest */
    public static final class ProxyRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final C82787a CREATOR = new C82787a((C8480h) null);

        /* renamed from: d */
        public final AppBrandInitConfigWC f242146d;

        /* renamed from: e */
        public final AppBrandStatObject f242147e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyRequest$a */
        public static final class C82787a implements Parcelable.Creator<ProxyRequest> {
            public C82787a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
                return new ProxyRequest(parcel);
            }

            public Object[] newArray(int i) {
                return new ProxyRequest[i];
            }
        }

        public ProxyRequest(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
            C87412m.m108594g(appBrandInitConfigWC, "initConfig");
            C87412m.m108594g(appBrandStatObject, "statObj");
            this.f242146d = appBrandInitConfigWC;
            this.f242147e = appBrandStatObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProxyRequest)) {
                return false;
            }
            ProxyRequest proxyRequest = (ProxyRequest) obj;
            return C87412m.m108589b(this.f242146d, proxyRequest.f242146d) && C87412m.m108589b(this.f242147e, proxyRequest.f242147e);
        }

        public Class<C82788a> getTaskClass() {
            return C82788a.class;
        }

        public int hashCode() {
            return (this.f242146d.hashCode() * 31) + this.f242147e.hashCode();
        }

        public boolean oneShotForeground() {
            return true;
        }

        public String toString() {
            return "ProxyRequest(initConfig=" + this.f242146d + ", statObj=" + this.f242147e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "dest");
            parcel.writeParcelable(this.f242146d, i);
            parcel.writeParcelable(this.f242147e, i);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ProxyRequest(android.os.Parcel r3) {
            /*
                r2 = this;
                java.lang.String r0 = "parcel"
                gy3.C87412m.m108594g(r3, r0)
                java.lang.Class<com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC> r0 = com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r3.readParcelable(r0)
                gy3.C87412m.m108591d(r0)
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r0
                java.lang.Class<com.tencent.mm.plugin.appbrand.report.AppBrandStatObject> r1 = com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                android.os.Parcelable r3 = r3.readParcelable(r1)
                gy3.C87412m.m108591d(r3)
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r3 = (com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject) r3
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic.ProxyRequest.<init>(android.os.Parcel):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$a */
    public static final class C82788a extends AppBrandProxyUIProcessTask {
        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            C87412m.m108594g(processRequest, "request");
            ProxyRequest proxyRequest = (ProxyRequest) processRequest;
            AppBrandInitConfigWC appBrandInitConfigWC = proxyRequest.f242146d;
            AppBrandStatObject appBrandStatObject = proxyRequest.f242147e;
            AppBrandProcessesManager a = AppBrandProcessesManager.f246131g.mo116962a();
            MMActivity activityContext = getActivityContext();
            C87412m.m108593f(activityContext, "activityContext");
            a.mo111383E(activityContext, new C84274b0(appBrandInitConfigWC, appBrandStatObject, (ActivityStarterIpcDelegate) null, 4, (C8480h) null));
            finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$b */
    public static final class C82789b<R extends Parcelable> implements C80243d {

        /* renamed from: a */
        public final /* synthetic */ AppBrandRuntimeWC f242148a;

        /* renamed from: b */
        public final /* synthetic */ AppBrandInitConfigWC f242149b;

        public C82789b(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandInitConfigWC appBrandInitConfigWC) {
            this.f242148a = appBrandRuntimeWC;
            this.f242149b = appBrandInitConfigWC;
        }

        /* renamed from: a */
        public void mo111348a(Parcelable parcelable) {
            MiniProgramNavigationBackResult miniProgramNavigationBackResult = (MiniProgramNavigationBackResult) parcelable;
            AppBrandRuntimeWC appBrandRuntimeWC = this.f242148a;
            AppBrandInitConfigWC appBrandInitConfigWC = this.f242149b;
            C87412m.m108594g(appBrandInitConfigWC, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            if (appBrandRuntimeWC != null) {
                appBrandRuntimeWC.mo113002B0(appBrandInitConfigWC, miniProgramNavigationBackResult);
            }
        }
    }

    /* renamed from: a */
    public static final boolean m101533a(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandRuntimeWC appBrandRuntimeWC2, AppBrandInitConfigWC appBrandInitConfigWC) {
        C87412m.m108594g(appBrandRuntimeWC, "from");
        C87412m.m108594g(appBrandInitConfigWC, "config");
        if (!((appBrandRuntimeWC.mo121254q1() && appBrandInitConfigWC.mo111300k() && !C34855o.m40516a()) || (C29553m0.f80469a.mo56809b() && appBrandInitConfigWC.mo111300k()) || (!appBrandRuntimeWC.mo121254q1() && appBrandInitConfigWC.mo111300k() && C84566n2.m104161j() && C90599h.m113508a(C84273a0.f246143j, MMApplicationContext.getProcessName()) && C84566n2.m104159h()))) {
            return false;
        }
        appBrandInitConfigWC.f239393x1 = true;
        appBrandInitConfigWC.f234824W = new C80241b(new C82789b(appBrandRuntimeWC, appBrandInitConfigWC));
        Activity R = appBrandRuntimeWC.mo113026R();
        AppBrandStatObject appBrandStatObject = appBrandInitConfigWC.f234834c1;
        C87412m.m108593f(appBrandStatObject, "config.statObject");
        C81956c.m100675c(R, new ProxyRequest(appBrandInitConfigWC, appBrandStatObject), (AppBrandProxyUIProcessTask.C81943b) null, (Intent) null);
        return true;
    }
}
