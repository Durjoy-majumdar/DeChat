package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.k */
public final class C84846k extends C86301e implements C84871v {

    /* renamed from: d */
    public final /* synthetic */ C84871v f247330d;

    public C84846k() {
        this.f247330d = C84840f0.f247297a.mo117571c() ? C84852n0.f247339d : C84851n.f247338d;
    }

    /* renamed from: Fr */
    public boolean mo117582Fr(String str) {
        C87412m.m108594g(str, "wxaPkgPath");
        return this.f247330d.mo117582Fr(str);
    }

    public boolean Lf0(int i) {
        return this.f247330d.Lf0(i);
    }

    public void U00(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        this.f247330d.U00(wxaPkgV8SnapshotInfo);
    }

    /* renamed from: hf */
    public void mo117585hf(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        this.f247330d.mo117585hf(wxaPkgV8SnapshotInfo);
    }

    public void lv0(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        this.f247330d.lv0(wxaPkgV8SnapshotInfo);
    }

    /* renamed from: mZ */
    public WxaPkgV8SnapshotInfo mo117587mZ() {
        return this.f247330d.mo117587mZ();
    }

    /* renamed from: nX */
    public WxaPkgV8SnapshotInfo mo117588nX(ICommLibReader iCommLibReader, C84872v0 v0Var) {
        C87412m.m108594g(iCommLibReader, "reader");
        C87412m.m108594g(v0Var, "category");
        return this.f247330d.mo117588nX(iCommLibReader, v0Var);
    }

    /* renamed from: zk */
    public boolean mo117589zk(C86009m1 m1Var) {
        C87412m.m108594g(m1Var, "file");
        return this.f247330d.mo117589zk(m1Var);
    }
}
