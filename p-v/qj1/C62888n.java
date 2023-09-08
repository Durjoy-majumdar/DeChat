package qj1;

import cl1.C54951d;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C50516na1;

/* renamed from: qj1.n */
public final class C62888n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62898o f178440d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C50516na1> f178441e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62888n(C62898o oVar, C8479f0<C50516na1> f0Var) {
        super(0);
        this.f178440d = oVar;
        this.f178441e = f0Var;
    }

    public Object invoke() {
        C54951d.C54953c b1 = this.f178440d.mo87843b1();
        if (b1 != null) {
            b1.setOnVideoComplete(new C62838k(this.f178440d, this.f178441e));
        }
        C54951d.C54953c b15 = this.f178440d.mo87843b1();
        if (b15 != null) {
            b15.setOnVideoError(new C62860l(this.f178440d, this.f178441e));
        }
        C54951d.C54953c b16 = this.f178440d.mo87843b1();
        if (b16 != null) {
            b16.setOnFirstFrameRendered(new C62875m(this.f178440d));
        }
        return C13598b0.f38549a;
    }
}
