package com.tencent.p014mm.plugin.report.service;

import com.tencent.p014mm.app.C40008f;
import f40.C86709a0;
import g40.C87134f;

/* renamed from: com.tencent.mm.plugin.report.service.n$$p */
public class n$$p implements C87134f {

    /* renamed from: d */
    public final /* synthetic */ C115669n f81928d;

    public n$$p(C115669n nVar) {
        this.f81928d = nVar;
    }

    /* renamed from: e */
    public void mo1180e() {
        C86709a0.m107528h().mo121101p(this);
        C115669n nVar = this.f81928d;
        nVar.getClass();
        C42883p pVar = new C42883p(nVar);
        new ReportManager$4(nVar, C40008f.f107254d, pVar).alive();
        C86709a0.m107524d().mo123455a(701, new C30360q(nVar, pVar));
    }

    /* renamed from: g */
    public void mo1181g(boolean z) {
    }
}
