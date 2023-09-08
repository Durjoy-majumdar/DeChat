package p175j0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p410k0.C60926c;
import rx3.C13598b0;

/* renamed from: j0.r1 */
public final class C60681r1 extends C87413o implements C32226l<Object, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60689y f172851d;

    /* renamed from: e */
    public final /* synthetic */ C60926c<Object> f172852e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60681r1(C60689y yVar, C60926c<Object> cVar) {
        super(1);
        this.f172851d = yVar;
        this.f172852e = cVar;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g(obj, "value");
        this.f172851d.mo51673q(obj);
        C60926c<Object> cVar = this.f172852e;
        if (cVar != null) {
            cVar.add(obj);
        }
        return C13598b0.f38549a;
    }
}
