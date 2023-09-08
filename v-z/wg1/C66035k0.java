package wg1;

import android.view.View;
import cj1.C54785k6;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: wg1.k0 */
public final class C66035k0 extends C87413o implements C32228q<View, Integer, C54785k6, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66010g0 f189844d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66035k0(C66010g0 g0Var) {
        super(3);
        this.f189844d = g0Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        int[] iArr;
        View view = (View) obj;
        int intValue = ((Number) obj2).intValue();
        C54785k6 k6Var = (C54785k6) obj3;
        C87412m.m108594g(view, "view");
        C87412m.m108594g(k6Var, "musicItem");
        C66112z0 z0Var = this.f189844d.f189774h;
        if (z0Var == null || (iArr = z0Var.mo90082m()) == null) {
            iArr = new int[2];
        }
        if (iArr[0] == 0 || iArr[1] == 0) {
            view.getLocationOnScreen(iArr);
        }
        C66112z0 z0Var2 = this.f189844d.f189774h;
        if (z0Var2 != null) {
            z0Var2.mo90076V(view, intValue, k6Var, iArr[0], iArr[1]);
        }
        return C13598b0.f38549a;
    }
}
