package rl1;

import al1.C0082q;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;

/* renamed from: rl1.f0 */
public final class C13036f0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13022d0 f37136d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13036f0(C13022d0 d0Var) {
        super(0);
        this.f37136d = d0Var;
    }

    public Object invoke() {
        LinkedList<C0082q> linkedList = this.f37136d.f37097j;
        if (linkedList != null) {
            linkedList.clear();
        }
        C13022d0 d0Var = this.f37136d;
        LinkedList<C0082q> linkedList2 = new LinkedList<>();
        d0Var.getClass();
        d0Var.f37097j = linkedList2;
        return C13598b0.f38549a;
    }
}
