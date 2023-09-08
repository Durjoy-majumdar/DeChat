package ca0;

import fy3.C32227p;
import fy3.C32228q;
import gy3.C87413o;
import p175j0.C108504h;
import p435a0.C103214y0;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: ca0.f */
public final class C54682f extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32228q<C65503j, C108504h, Integer, C13598b0> f153248d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54682f(C32228q<? super C65503j, ? super C108504h, ? super Integer, C13598b0> qVar) {
        super(2);
        this.f153248d = qVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C32228q<C65503j, C108504h, Integer, C13598b0> qVar = this.f153248d;
            int i = C65503j.f188489K0;
            qVar.invoke(C103214y0.m136591g(C65503j.C65504a.f188490d, 0.0f, 1, (Object) null), hVar, 54);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
