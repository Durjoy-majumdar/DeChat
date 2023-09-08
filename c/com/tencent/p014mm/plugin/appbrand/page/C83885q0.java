package com.tencent.p014mm.plugin.appbrand.page;

import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.page.q0 */
public class C83885q0 implements x$$h {

    /* renamed from: a */
    public final /* synthetic */ C83820i0 f244924a;

    /* renamed from: b */
    public final /* synthetic */ m0$$c0[] f244925b;

    /* renamed from: c */
    public final /* synthetic */ long f244926c;

    /* renamed from: d */
    public final /* synthetic */ C83849m0 f244927d;

    public C83885q0(C83849m0 m0Var, C83820i0 i0Var, m0$$c0[] m0__c0Arr, long j) {
        this.f244927d = m0Var;
        this.f244924a = i0Var;
        this.f244925b = m0__c0Arr;
        this.f244926c = j;
    }

    /* renamed from: a */
    public void mo116457a(C83966x xVar, String str) {
        long j = this.f244926c;
        C83817h4 h4Var = C83817h4.SWITCH_TAB;
        xVar.mo116303q(j, h4Var);
        this.f244927d.mo116361m(h4Var, this.f244924a, xVar);
        this.f244927d.mo110176G(this.f244924a, xVar, h4Var);
    }

    /* renamed from: b */
    public void mo116458b(C83966x xVar, String str) {
        C83849m0 m0Var = this.f244927d;
        C83820i0 i0Var = this.f244924a;
        C83817h4 h4Var = C83817h4.SWITCH_TAB;
        m0$$c0 H = m0Var.mo110177H(i0Var, xVar, h4Var, str, C83829i4.m103114a(h4Var));
        this.f244925b[0] = H;
        xVar.mo116299o(this.f244926c, h4Var, H, (JSONObject) null);
    }

    /* renamed from: c */
    public void mo116459c(C83966x xVar, String str) {
    }
}
