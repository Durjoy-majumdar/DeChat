package p435a0;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p560i2.C33183o;
import p721v0.C111294a;

/* renamed from: a0.b */
public final class C27715b extends C87413o implements C32227p<Integer, C33183o, Integer> {

    /* renamed from: d */
    public final /* synthetic */ C111294a.C37633b f76726d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27715b(C111294a.C37633b bVar) {
        super(2);
        this.f76726d = bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        C33183o oVar = (C33183o) obj2;
        C87412m.m108594g(oVar, "layoutDirection");
        return Integer.valueOf(this.f76726d.mo61254a(0, intValue, oVar));
    }
}
