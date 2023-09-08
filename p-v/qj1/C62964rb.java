package qj1;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.rb */
public final class C62964rb extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62938qb f178667d;

    /* renamed from: e */
    public final /* synthetic */ int f178668e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62964rb(C62938qb qbVar, int i) {
        super(0);
        this.f178667d = qbVar;
        this.f178668e = i;
    }

    public Object invoke() {
        int i;
        if (this.f178667d.mo14483f0() == 0 && (i = this.f178668e) != 0) {
            C62938qb qbVar = this.f178667d;
            if (qbVar.f178590C != i) {
                qbVar.f178590C = i;
                qbVar.mo87875Z0();
            }
        }
        return C13598b0.f38549a;
    }
}
