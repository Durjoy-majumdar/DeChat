package bh3;

import bh3.C113177k;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: bh3.u */
public final class C113191u extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C113177k.C113181e f338693d;

    /* renamed from: e */
    public final /* synthetic */ boolean f338694e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113191u(C113177k.C113181e eVar, boolean z) {
        super(0);
        this.f338693d = eVar;
        this.f338694e = z;
    }

    public Object invoke() {
        C113177k.C113181e eVar = this.f338693d;
        if (eVar != null) {
            eVar.onOp(Boolean.valueOf(this.f338694e));
        }
        return C13598b0.f38549a;
    }
}
