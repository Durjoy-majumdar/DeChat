package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.i */
public final class C84843i extends C86301e implements C84867u {

    /* renamed from: d */
    public final /* synthetic */ C84867u f247325d;

    public C84843i() {
        this.f247325d = C84840f0.f247297a.mo117571c() ? WxaCommLibV8SnapshotClientImpl.f247258d : C84849m.f247336d;
    }

    /* renamed from: KI */
    public WxaPkgV8SnapshotInfo mo117543KI(ICommLibReader iCommLibReader, C84872v0 v0Var) {
        C87412m.m108594g(iCommLibReader, "reader");
        C87412m.m108594g(v0Var, "category");
        return this.f247325d.mo117543KI(iCommLibReader, v0Var);
    }

    /* renamed from: Tf */
    public WxaPkgV8SnapshotInfo mo117544Tf() {
        return this.f247325d.mo117544Tf();
    }

    public void i30(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        this.f247325d.i30(wxaPkgV8SnapshotInfo);
    }

    public void rj0(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        this.f247325d.rj0(wxaPkgV8SnapshotInfo);
    }
}
