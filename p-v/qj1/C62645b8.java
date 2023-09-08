package qj1;

import fy3.C32227p;
import gy3.C87413o;
import qj1.C63006u7;
import rx3.C13598b0;

/* renamed from: qj1.b8 */
public final class C62645b8 extends C87413o implements C32227p<Float, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63006u7 f177903d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62645b8(C63006u7 u7Var) {
        super(2);
        this.f177903d = u7Var;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj).floatValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C63006u7 u7Var = this.f177903d;
        C63006u7.C63008c cVar = u7Var.f178780A.get(u7Var.f178799v);
        if (cVar != null) {
            cVar.mo87963b(booleanValue);
        }
        return C13598b0.f38549a;
    }
}
