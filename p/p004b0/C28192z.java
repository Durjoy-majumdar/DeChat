package p004b0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p631o1.C109854n0;
import rx3.C13598b0;

/* renamed from: b0.z */
public final class C28192z extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<C103940e0> f77690d;

    /* renamed from: e */
    public final /* synthetic */ C103940e0 f77691e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28192z(List<C103940e0> list, C103940e0 e0Var) {
        super(1);
        this.f77690d = list;
        this.f77691e = e0Var;
    }

    public Object invoke(Object obj) {
        C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
        C87412m.m108594g(aVar, "$this$invoke");
        List<C103940e0> list = this.f77690d;
        C103940e0 e0Var = this.f77691e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C103940e0 e0Var2 = list.get(i);
            if (e0Var2 != e0Var) {
                e0Var2.mo145558d(aVar);
            }
        }
        C103940e0 e0Var3 = this.f77691e;
        if (e0Var3 != null) {
            e0Var3.mo145558d(aVar);
        }
        return C13598b0.f38549a;
    }
}
