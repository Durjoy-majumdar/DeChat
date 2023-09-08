package rr3;

import com.tencent.p014mm.xeffect.effect.VLogEffectJNI;
import gy3.C87412m;

/* renamed from: rr3.v */
public class C110646v extends C110644t {

    /* renamed from: g */
    public final C110621a0 f331006g = new C110621a0(this);

    public C110646v(long j) {
        super(j);
    }

    /* renamed from: c */
    public C110632i mo162185c() {
        return C110632i.PAGTextEffect;
    }

    /* renamed from: f */
    public void mo162194f(C110630g gVar) {
        C87412m.m108595h(gVar, "textInfo");
        C110621a0 a0Var = this.f331006g;
        a0Var.getClass();
        VLogEffectJNI.INSTANCE.setEffectText$renderlib_release(a0Var.f330965a.f330969c, gVar);
    }
}
