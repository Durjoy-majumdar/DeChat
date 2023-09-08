package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import bj0.C79708a;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n */
public final class C81795n implements C81807x {

    /* renamed from: a */
    public final String f240011a;

    /* renamed from: b */
    public final C81809z f240012b;

    /* renamed from: c */
    public final String f240013c = ("MicroMsg.AppBrand.AutoConnectGattSimpleStrategy#" + hashCode());

    public C81795n(String str, C81809z zVar) {
        C87412m.m108594g(str, "deviceId");
        C87412m.m108594g(zVar, "gattConnectListener");
        this.f240011a = str;
        this.f240012b = zVar;
    }

    /* renamed from: a */
    public void mo114173a() {
        C79708a.f233619a.mo109821a(this.f240013c, "pauseConnect");
    }

    /* renamed from: b */
    public void mo114174b(boolean z) {
        C79708a aVar = C79708a.f233619a;
        String str = this.f240013c;
        aVar.mo109821a(str, "resumeConnect, canReset: " + z);
    }

    public boolean connect() {
        C79708a.f233619a.mo109821a(this.f240013c, "connect");
        return C81797p.f240015a.mo114177a(this.f240011a, this.f240012b);
    }

    public boolean disconnect() {
        C79708a.f233619a.mo109821a(this.f240013c, "disconnect");
        return C81797p.f240015a.mo114178b(this.f240011a);
    }
}
