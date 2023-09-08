package dp1;

import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;

/* renamed from: dp1.x */
public final class C7457x extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58353a0 f25665d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7457x(C58353a0 a0Var) {
        super(0);
        this.f25665d = a0Var;
    }

    public Object invoke() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.f25665d.f167093x);
        this.f25665d.f167093x.clear();
        if (!linkedList.isEmpty()) {
            C58368h1.f167164D.mo8589a(this.f25665d.f167327h, linkedList);
        }
        return C13598b0.f38549a;
    }
}
