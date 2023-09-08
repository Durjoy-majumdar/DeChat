package p747xb;

import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ListIterator;
import rx3.C13598b0;

/* renamed from: xb.k */
public final class C91158k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C91151g f261385d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91158k(C91151g gVar) {
        super(0);
        this.f261385d = gVar;
    }

    public Object invoke() {
        C83849m0 m0Var = this.f261385d.f261370a;
        m0Var.getClass();
        ListIterator<C83820i0> listIterator = m0Var.f244745p.listIterator();
        C91151g gVar = this.f261385d;
        int i = 0;
        while (listIterator.hasNext()) {
            C83820i0 next = listIterator.next();
            int i2 = i + 1;
            if (i >= gVar.f261372c) {
                C87412m.m108593f(next, "page");
                C91151g.m114371a(gVar, next);
            }
            i = i2;
        }
        return C13598b0.f38549a;
    }
}
