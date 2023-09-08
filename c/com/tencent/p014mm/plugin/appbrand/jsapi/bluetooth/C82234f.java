package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82250m;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import li0.C88508b;
import li0.C88509c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f */
public final class C82234f implements C82249l {

    /* renamed from: b */
    public static final C82235a f241133b = new C82235a();

    /* renamed from: c */
    public static volatile C82249l f241134c = new C82234f(C82243j.f241145f);

    /* renamed from: a */
    public final C82250m.C82252b f241135a;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f$a */
    public static final class C82235a implements C82249l {
        /* renamed from: a */
        public C82250m mo114632a(AppBrandRuntime appBrandRuntime) {
            C87412m.m108594g(appBrandRuntime, "runtime");
            Log.m105924i("MicroMsg.AppBrand.BluetoothBackgroundSupportAccessible", "getClient, runtime: " + mo114635d(appBrandRuntime));
            return C82234f.f241134c.mo114632a(appBrandRuntime);
        }

        /* renamed from: b */
        public C82250m mo114633b(AppBrandRuntime appBrandRuntime) {
            C87412m.m108594g(appBrandRuntime, "runtime");
            Log.m105924i("MicroMsg.AppBrand.BluetoothBackgroundSupportAccessible", "requireClient, runtime: " + mo114635d(appBrandRuntime));
            return C82234f.f241134c.mo114633b(appBrandRuntime);
        }

        /* renamed from: c */
        public void mo114634c(AppBrandRuntime appBrandRuntime) {
            C87412m.m108594g(appBrandRuntime, "runtime");
            Log.m105924i("MicroMsg.AppBrand.BluetoothBackgroundSupportAccessible", "destroyClientIfNeed, runtime: " + mo114635d(appBrandRuntime));
            C82234f.f241134c.mo114634c(appBrandRuntime);
        }

        /* renamed from: d */
        public final String mo114635d(AppBrandRuntime appBrandRuntime) {
            C87412m.m108594g(appBrandRuntime, "runtime");
            AppBrandInitConfig W = appBrandRuntime.mo113036W();
            if (W == null) {
                return String.valueOf(appBrandRuntime.hashCode());
            }
            String str = W.f239362d;
            int i = W.f239365g;
            return str + '#' + i;
        }

        /* renamed from: e */
        public final boolean mo114636e(AppBrandRuntime appBrandRuntime) {
            C87412m.m108594g(appBrandRuntime, "runtime");
            C88509c cVar = appBrandRuntime.f238113K;
            if (cVar == null) {
                Log.m105928w("MicroMsg.AppBrand.BluetoothBackgroundSupportAccessible", "isRuntimeInBackground, runningStateController is null");
                return false;
            }
            C88508b c = cVar.mo122980c();
            Log.m105924i("MicroMsg.AppBrand.BluetoothBackgroundSupportAccessible", "isRuntimeInBackground, currentState: " + c);
            return C88508b.BACKGROUND == c;
        }
    }

    public C82234f(C82250m.C82252b bVar) {
        C87412m.m108594g(bVar, "clientFactory");
        this.f241135a = bVar;
    }

    /* renamed from: a */
    public C82250m mo114632a(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        return (C82250m) appBrandRuntime.mo113032U(C82250m.class);
    }

    /* renamed from: b */
    public C82250m mo114633b(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        C82250m a = mo114632a(appBrandRuntime);
        if (a != null) {
            return a;
        }
        C82250m a2 = this.f241135a.mo114628a(appBrandRuntime);
        appBrandRuntime.mo113059i(a2);
        return a2;
    }

    /* renamed from: c */
    public void mo114634c(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        C82250m a = mo114632a(appBrandRuntime);
        if (a != null) {
            synchronized (appBrandRuntime.f238110H) {
                appBrandRuntime.f238110H.remove(a);
            }
        }
    }
}
