package wg1;

import android.view.View;
import cj1.C54768h6;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: wg1.d0 */
public final class C65988d0 extends C87413o implements C32228q<View, Integer, C54768h6, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65954a0 f189725d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65988d0(C65954a0 a0Var) {
        super(3);
        this.f189725d = a0Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        int[] iArr;
        View view = (View) obj;
        int intValue = ((Number) obj2).intValue();
        C54768h6 h6Var = (C54768h6) obj3;
        C87412m.m108594g(view, "view");
        C87412m.m108594g(h6Var, "musicItem");
        C66096w wVar = this.f189725d.f189624h;
        if (wVar == null || (iArr = wVar.mo90101m()) == null) {
            iArr = new int[2];
        }
        if (iArr[0] == 0 || iArr[1] == 0) {
            view.getLocationOnScreen(iArr);
        }
        C66096w wVar2 = this.f189725d.f189624h;
        if (wVar2 != null) {
            wVar2.mo90095B(view, intValue, h6Var, iArr[0], iArr[1]);
        }
        return C13598b0.f38549a;
    }
}
