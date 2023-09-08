package wg1;

import cj1.C54785k6;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import qk1.C63205e0;
import rx3.C13598b0;

/* renamed from: wg1.i0 */
public final class C66017i0 extends C87413o implements C32227p<Integer, C54785k6, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66010g0 f189795d;

    /* renamed from: e */
    public final /* synthetic */ C63205e0 f189796e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66017i0(C66010g0 g0Var, C63205e0 e0Var) {
        super(2);
        this.f189795d = g0Var;
        this.f189796e = e0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        C54785k6 k6Var = (C54785k6) obj2;
        C87412m.m108594g(k6Var, "musicItem");
        this.f189795d.mo90045A(k6Var);
        this.f189796e.notifyItemChanged(intValue);
        return C13598b0.f38549a;
    }
}
