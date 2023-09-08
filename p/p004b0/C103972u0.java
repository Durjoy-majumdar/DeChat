package p004b0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: b0.u0 */
public final class C103972u0 extends C87413o implements C32226l<Object, Integer> {

    /* renamed from: d */
    public final /* synthetic */ C103962o f307503d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103972u0(C103962o oVar) {
        super(1);
        this.f307503d = oVar;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g(obj, "needle");
        C103970t0 t0Var = new C103970t0(this.f307503d);
        int itemCount = this.f307503d.getItemCount();
        int i = 0;
        while (true) {
            if (i >= itemCount) {
                i = -1;
                break;
            } else if (C87412m.m108589b(t0Var.invoke(Integer.valueOf(i)), obj)) {
                break;
            } else {
                i++;
            }
        }
        return Integer.valueOf(i);
    }
}
