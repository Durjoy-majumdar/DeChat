package to1;

import ac3.C103355g1;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import sh2.C110788a;

/* renamed from: to1.c */
public final class C111046c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111040a f332544d;

    /* renamed from: e */
    public final /* synthetic */ XEffectConfig f332545e;

    public C111046c(C111040a aVar, XEffectConfig xEffectConfig) {
        this.f332544d = aVar;
        this.f332545e = xEffectConfig;
    }

    public final void run() {
        C110788a g = this.f332544d.mo162728g();
        XEffectConfig xEffectConfig = this.f332545e;
        C87412m.m108593f(xEffectConfig, LocaleUtil.ITALIAN);
        g.getClass();
        g.f331429x = xEffectConfig;
        C103355g1 g1Var = g.f331427v;
        if (g1Var != null) {
            g1Var.mo143252s(xEffectConfig);
        }
    }
}
