package gt0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: gt0.g0 */
public final class C8453g0 extends C87413o implements C32226l<ArrayList<Integer>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87330d0 f27457d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8453g0(C87330d0 d0Var) {
        super(1);
        this.f27457d = d0Var;
    }

    public Object invoke(Object obj) {
        ArrayList<Number> arrayList = (ArrayList) obj;
        C87412m.m108594g(arrayList, "changed");
        C87330d0 d0Var = this.f27457d;
        for (Number intValue : arrayList) {
            d0Var.notifyItemChanged(intValue.intValue());
        }
        return C13598b0.f38549a;
    }
}
