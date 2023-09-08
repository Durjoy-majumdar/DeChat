package cz1;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: cz1.f */
public final class C7148f extends C87413o implements C32227p<Boolean, List<? extends C7143c>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32227p<Boolean, List<C7143c>, C13598b0> f25123d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7148f(C32227p<? super Boolean, ? super List<C7143c>, C13598b0> pVar) {
        super(2);
        this.f25123d = pVar;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        List list = (List) obj2;
        C87412m.m108594g(list, "result");
        this.f25123d.invoke(Boolean.valueOf(booleanValue), list);
        return C13598b0.f38549a;
    }
}
