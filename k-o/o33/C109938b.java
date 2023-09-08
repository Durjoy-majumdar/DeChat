package o33;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import di3.C86312j;
import l33.C109247e;
import p646pn.C110234e;
import uv0.C111237j;
import xv0.C112181e;

/* renamed from: o33.b */
public class C109938b extends C105052s {
    public C109938b(C111237j jVar) {
        super(jVar);
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        super.mo35648A(i, str);
        getReportInfo().f311717f = 10;
        if (C109247e.xx0() != null) {
            getReportInfo().f311718g = String.valueOf(C109247e.xx0().mo152616o());
        }
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
        BallInfo ballInfo = this.f311726d;
        ballInfo.f311683H.f311721j = 4;
        C112181e eVar = this.f311729g;
        if (eVar != null) {
            eVar.mo149088F(ballInfo);
        }
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
