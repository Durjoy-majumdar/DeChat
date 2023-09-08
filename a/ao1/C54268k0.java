package ao1;

import bh3.C113177k;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fe1.C58964h;
import gy3.C87412m;
import os1.C62153d;

/* renamed from: ao1.k0 */
public final class C54268k0 implements C113177k.C113181e {

    /* renamed from: a */
    public final /* synthetic */ C54269l0 f152309a;

    public C54268k0(C54269l0 l0Var) {
        this.f152309a = l0Var;
    }

    public final void onOp(Boolean bool) {
        C87412m.m108593f(bool, LocaleUtil.ITALIAN);
        if (bool.booleanValue()) {
            this.f152309a.getClass();
            ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9105q2(false);
            return;
        }
        C58964h hVar = this.f152309a.f152310d;
        if (hVar != null) {
            hVar.mo83365d();
        } else {
            C87412m.m108603p("locationWidget");
            throw null;
        }
    }
}
