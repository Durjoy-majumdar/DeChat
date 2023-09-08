package iw2;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: iw2.a0 */
public final class C98807a0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C98880x f289667d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98807a0(C98880x xVar) {
        super(0);
        this.f289667d = xVar;
    }

    public Object invoke() {
        int size = this.f289667d.f289859i.size();
        C98880x xVar = this.f289667d;
        int i = xVar.f289862o;
        if (i >= 0 && i < size) {
            xVar.f289859i.remove(i);
            C98880x xVar2 = this.f289667d;
            xVar2.f289856f.mo134399g(0, xVar2.f289859i);
            C98880x xVar3 = this.f289667d;
            xVar3.f289856f.mo134402j(0, xVar3.f289862o, 1);
            this.f289667d.f289856f.mo134397e();
        }
        this.f289667d.f289862o = -1;
        return C13598b0.f38549a;
    }
}
