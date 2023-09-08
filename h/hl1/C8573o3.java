package hl1;

import fy3.C32224a;
import gy3.C87413o;
import qj1.C12389fa;
import rx3.C13598b0;

/* renamed from: hl1.o3 */
public final class C8573o3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f27657d;

    /* renamed from: e */
    public final /* synthetic */ int f27658e;

    /* renamed from: f */
    public final /* synthetic */ int f27659f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8573o3(C59988k kVar, int i, int i2) {
        super(0);
        this.f27657d = kVar;
        this.f27658e = i;
        this.f27659f = i2;
    }

    public Object invoke() {
        C12389fa faVar;
        C12389fa faVar2 = this.f27657d.f171235p1;
        boolean z = false;
        if (faVar2 != null && faVar2.mo14483f0() == 0) {
            z = true;
        }
        if (z && this.f27658e == 0 && this.f27659f == 0 && (faVar = this.f27657d.f171235p1) != null) {
            faVar.mo12070b1(true);
        }
        return C13598b0.f38549a;
    }
}
