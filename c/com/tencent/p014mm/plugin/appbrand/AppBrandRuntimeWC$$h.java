package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82228d;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82232e;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82247k;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82581d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82587e0;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C88021l;
import yq0.C91548e;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$h */
public class AppBrandRuntimeWC$$h implements MMToClientEvent.C81947d {

    /* renamed from: a */
    public final /* synthetic */ AppBrandRuntimeWC f238323a;

    public AppBrandRuntimeWC$$h(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f238323a = appBrandRuntimeWC;
    }

    /* renamed from: a */
    public void mo22085a(Object obj) {
        if (obj instanceof AppBrandAuthorizeUI.AuthStateChangedByUserEvent) {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify, appId[%s], AuthStateChangedByUserEvent", this.f238323a.f238147j);
            C91548e.f262377e.mo122466g(this.f238323a.f238147j);
            AppBrandRuntimeWC appBrandRuntimeWC = this.f238323a;
            AppBrandAuthorizeUI.AuthStateChangedByUserEvent authStateChangedByUserEvent = (AppBrandAuthorizeUI.AuthStateChangedByUserEvent) obj;
            MMToClientEvent.C81947d dVar = AppBrandBackgroundRunningMonitor.f239216a;
            if (appBrandRuntimeWC != null) {
                C82581d0 d0Var = (C82581d0) appBrandRuntimeWC.mo113032U(C82581d0.class);
                if (!(d0Var instanceof C82587e0)) {
                    Log.m105928w("MicroMsg.AppBrandBackgroundRunningMonitor", "handleUserAuthChanged, invalid location state manager");
                } else {
                    C82587e0 e0Var = (C82587e0) d0Var;
                    boolean z = authStateChangedByUserEvent.f49776d;
                    boolean z2 = authStateChangedByUserEvent.f49777e;
                    boolean z3 = !e0Var.f241702n && !z;
                    boolean z4 = e0Var.f241702n && (!z2 || !z);
                    Log.m105925i("MicroMsg.AppBrandBackgroundRunningMonitor", "handleUserAuthChanged, should stop location foreground:%s, should stop location background:%s", Boolean.valueOf(z3), Boolean.valueOf(z4));
                    if (z3 || z4) {
                        e0Var.f241700i = true;
                        e0Var.sendMessage(2);
                        e0Var.mo114900e(appBrandRuntimeWC);
                    }
                    if (z4) {
                        AppBrandBackgroundRunningMonitor.m100057b(appBrandRuntimeWC);
                    }
                }
            }
            C82232e eVar = C82232e.f241129a;
            String str = this.f238323a.f238147j;
            boolean z5 = authStateChangedByUserEvent.f49778f;
            C82228d dVar2 = (z5 || authStateChangedByUserEvent.f49779g) ? (!z5 || authStateChangedByUserEvent.f49779g) ? (!z5 || !authStateChangedByUserEvent.f49779g) ? null : C82228d.ALWAYS_ACCEPTED : C82228d.ACCEPTED_IN_FOREGROUND : C82228d.REJECTED;
            Log.m105924i("MicroMsg.AppBrand.BluetoothAuthorizeStateQuickAccess", "onAuthorizeStateChange, appId: " + str + ", newState: " + dVar2);
            if (str != null && dVar2 != null) {
                C88021l<String, C82247k> lVar = C82232e.f241130b;
                lVar.getClass();
                for (C82247k a : lVar.mo122463d(str)) {
                    a.mo114613a(dVar2);
                }
            }
        }
    }
}
