package com.tencent.p014mm.plugin.finder.live.view;

import com.tencent.p014mm.plugin.ball.service.C105052s;
import di3.C86312j;
import gy3.C87412m;
import p646pn.C110234e;
import uv0.C111237j;

/* renamed from: com.tencent.mm.plugin.finder.live.view.m1 */
public final class C56090m1 extends C105052s {

    /* renamed from: s */
    public static String f159950s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56090m1(C111237j jVar) {
        super(jVar);
        C87412m.m108594g(jVar, "pageAdapter");
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        super.mo35648A(i, str);
        getReportInfo().f311717f = 15;
        mo68414O();
    }

    /* renamed from: B0 */
    public void mo78184B0() {
        ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149141q(true);
        super.mo78184B0();
    }

    /* renamed from: C */
    public void mo64001C() {
        ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149141q(false);
        this.f311726d.f311683H.f311721j = 4;
        super.mo64001C();
    }

    /* renamed from: C0 */
    public final void mo78185C0(boolean z) {
        ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149141q(z);
        this.f311726d.f311683H.f311721j = 4;
        super.mo64001C();
    }

    /* renamed from: f0 */
    public boolean mo35651f0() {
        return false;
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        this.f311808n.mo23513d(false);
    }
}
