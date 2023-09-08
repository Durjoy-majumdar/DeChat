package op1;

import ak1.C54108o;
import cm1.C0740i2;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import sk1.C63964u;
import sk1.C63965x;

/* renamed from: op1.i */
public final class C62102i extends C87413o implements C32227p<Integer, C0740i2, C13598b0> {

    /* renamed from: d */
    public static final C62102i f176597d = new C62102i();

    public C62102i() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        C0740i2 i2Var = (C0740i2) obj2;
        Class cls = C54108o.class;
        C87412m.m108594g(i2Var, "item");
        if (i2Var instanceof C63965x) {
            ((C54108o) C86312j.m106911c(cls)).getClass();
            C54108o.f151869h.f151454e0.add(Long.valueOf(((C63965x) i2Var).f181347t));
        } else if (i2Var instanceof C63964u) {
            ((C54108o) C86312j.m106911c(cls)).getClass();
            C54108o.f151869h.f151454e0.add(Long.valueOf(((C63964u) i2Var).f181326t));
        }
        return C13598b0.f38549a;
    }
}
