package p191l2;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108499f1;
import p175j0.C108504h;
import p175j0.C60667k2;
import rx3.C13598b0;

/* renamed from: l2.f */
public final class C61192f extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60667k2<C32227p<C108504h, Integer, C13598b0>> f174210d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61192f(C60667k2<? extends C32227p<? super C108504h, ? super Integer, C13598b0>> k2Var) {
        super(2);
        this.f174210d = k2Var;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C60667k2<C32227p<C108504h, Integer, C13598b0>> k2Var = this.f174210d;
            C108499f1<String> f1Var = C109132a.f326780a;
            k2Var.getValue().invoke(hVar, 0);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
