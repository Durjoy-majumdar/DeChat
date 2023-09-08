package cl1;

import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;
import te3.C51660v81;

/* renamed from: cl1.p */
public final class C0677p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54991o f1594d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C51660v81> f1595e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0677p(C54991o oVar, LinkedList<C51660v81> linkedList) {
        super(0);
        this.f1594d = oVar;
        this.f1595e = linkedList;
    }

    public Object invoke() {
        this.f1594d.f154390y2.clear();
        this.f1594d.f154390y2.addAll(this.f1595e);
        return C13598b0.f38549a;
    }
}
