package p759y;

import fy3.C32227p;
import gy3.C59741c0;
import gy3.C87412m;
import gy3.C87413o;
import p190l1.C109111s;
import p604m1.C109464f;
import p604m1.C109465g;
import rx3.C13598b0;

/* renamed from: y.q */
public final class C112277q extends C87413o implements C32227p<C109111s, Float, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109464f f336205d;

    /* renamed from: e */
    public final /* synthetic */ C59741c0 f336206e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112277q(C109464f fVar, C59741c0 c0Var) {
        super(2);
        this.f336205d = fVar;
        this.f336206e = c0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        C109111s sVar = (C109111s) obj;
        float floatValue = ((Number) obj2).floatValue();
        C87412m.m108594g(sVar, "event");
        C109465g.m148683a(this.f336205d, sVar);
        sVar.mo160354a();
        this.f336206e.f170634d = floatValue;
        return C13598b0.f38549a;
    }
}
