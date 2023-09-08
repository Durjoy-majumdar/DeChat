package fh1;

import android.content.Context;
import android.view.ViewGroup;
import cj1.C54741c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: fh1.b2 */
public final class C58998b2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f168793d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f168794e;

    /* renamed from: f */
    public final /* synthetic */ C54741c f168795f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58998b2(C59018f2 f2Var, ViewGroup viewGroup, C54741c cVar) {
        super(0);
        this.f168793d = f2Var;
        this.f168794e = viewGroup;
        this.f168795f = cVar;
    }

    public Object invoke() {
        C59018f2 f2Var = this.f168793d;
        Context context = this.f168794e.getContext();
        C87412m.m108593f(context, "root.context");
        C59018f2.m68936m3(f2Var, context, this.f168795f);
        return C13598b0.f38549a;
    }
}
