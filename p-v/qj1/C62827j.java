package qj1;

import cl1.C54951d;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.j */
public final class C62827j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62898o f178315d;

    /* renamed from: e */
    public final /* synthetic */ C54951d.C54955e f178316e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62827j(C62898o oVar, C54951d.C54955e eVar) {
        super(0);
        this.f178315d = oVar;
        this.f178316e = eVar;
    }

    public Object invoke() {
        C54951d.C54953c b1 = this.f178315d.mo87843b1();
        if (b1 != null) {
            b1.setOnProgressChange(new C62768f(this.f178315d));
        }
        C54951d.C54953c b15 = this.f178315d.mo87843b1();
        if (b15 != null) {
            b15.setOnFirstFrameRendered(new C62788g(this.f178315d));
        }
        C54951d.C54953c b16 = this.f178315d.mo87843b1();
        if (b16 != null) {
            b16.setOnVideoError(new C62798h(this.f178315d, this.f178316e));
        }
        C54951d.C54953c b17 = this.f178315d.mo87843b1();
        if (b17 != null) {
            b17.setOnVideoComplete(new C62813i(this.f178315d, this.f178316e));
        }
        return C13598b0.f38549a;
    }
}
