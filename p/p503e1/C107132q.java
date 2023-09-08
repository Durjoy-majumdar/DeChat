package p503e1;

import fy3.C32227p;
import fy3.C32229r;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: e1.q */
public final class C107132q extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32229r<Float, Float, C108504h, Integer, C13598b0> f320690d;

    /* renamed from: e */
    public final /* synthetic */ C107128p f320691e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107132q(C32229r<? super Float, ? super Float, ? super C108504h, ? super Integer, C13598b0> rVar, C107128p pVar) {
        super(2);
        this.f320690d = rVar;
        this.f320691e = pVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            this.f320690d.mo162I(Float.valueOf(this.f320691e.f320677n.f320600g), Float.valueOf(this.f320691e.f320677n.f320601h), hVar, 0);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
