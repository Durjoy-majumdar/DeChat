package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82250m;
import fl0.C86920e;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j */
public final class C82243j implements C82250m {

    /* renamed from: f */
    public static final C82244a f241145f = new C82244a((C8480h) null);

    /* renamed from: d */
    public final AppBrandRuntime f241146d;

    /* renamed from: e */
    public final String f241147e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j$a */
    public static final class C82244a implements C82250m.C82252b {
        public C82244a(C8480h hVar) {
        }

        /* renamed from: a */
        public C82250m mo114628a(AppBrandRuntime appBrandRuntime) {
            C87412m.m108594g(appBrandRuntime, "runtime");
            return new C82243j(appBrandRuntime);
        }
    }

    public C82243j(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        this.f241146d = appBrandRuntime;
        this.f241147e = "DefaultBluetoothBackgroundSupportClient#" + C82234f.f241133b.mo114635d(appBrandRuntime);
    }

    /* renamed from: P */
    public boolean mo114618P() {
        return false;
    }

    /* renamed from: T */
    public void mo114619T(C82250m.C82253c cVar) {
        C87412m.m108594g(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    /* renamed from: a */
    public void mo114620a() {
    }

    /* renamed from: b */
    public String mo114621b() {
        return this.f241147e;
    }

    /* renamed from: j */
    public void mo114624j() {
        throw new C82237g(C86920e.f252316f, (String) null, 2, (C8480h) null);
    }

    /* renamed from: n */
    public void mo114626n(C82250m.C82253c cVar) {
        C87412m.m108594g(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    /* renamed from: t */
    public void mo114627t(boolean z) {
    }
}
