package gr1;

import com.tencent.p014mm.xeffect.effect.EffectManager;
import ei2.C31606c;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gr1.h2 */
public final class C59658h2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C31606c f170482d;

    /* renamed from: e */
    public final /* synthetic */ EffectManager f170483e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59658h2(C31606c cVar, EffectManager effectManager) {
        super(0);
        this.f170482d = cVar;
        this.f170483e = effectManager;
    }

    public Object invoke() {
        this.f170482d.destroy();
        this.f170483e.mo154931k();
        return C13598b0.f38549a;
    }
}
