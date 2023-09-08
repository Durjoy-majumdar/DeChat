package iw2;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: iw2.y */
public final class C98883y extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f289870d;

    /* renamed from: e */
    public final /* synthetic */ C98880x f289871e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98883y(boolean z, C98880x xVar) {
        super(0);
        this.f289870d = z;
        this.f289871e = xVar;
    }

    public Object invoke() {
        if (this.f289870d) {
            int size = this.f289871e.f289859i.size();
            C98880x xVar = this.f289871e;
            int i = xVar.f289861n;
            if (i >= 0 && i < size) {
                xVar.f289859i.remove(i);
                C98880x xVar2 = this.f289871e;
                xVar2.f289856f.mo134399g(0, xVar2.f289859i);
                C98880x xVar3 = this.f289871e;
                xVar3.f289856f.mo134402j(0, xVar3.f289861n, 1);
                this.f289871e.f289856f.mo134397e();
            }
        }
        this.f289871e.f289856f.mo134401i(this.f289870d);
        this.f289871e.f289861n = -1;
        return C13598b0.f38549a;
    }
}
