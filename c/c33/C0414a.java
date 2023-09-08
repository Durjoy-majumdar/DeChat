package c33;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: c33.a */
public final class C0414a extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32227p<Boolean, Integer, C13598b0> f1022d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0414a(C32227p<? super Boolean, ? super Integer, C13598b0> pVar) {
        super(1);
        this.f1022d = pVar;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f1022d.invoke(Boolean.TRUE, 4);
        } else {
            this.f1022d.invoke(Boolean.FALSE, 1012);
        }
        return C13598b0.f38549a;
    }
}
