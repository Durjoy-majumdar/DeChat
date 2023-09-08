package rs1;

import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rs1.r7 */
public final class C13420r7 extends C87413o implements C32227p<Float, Float, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13329m7 f37996d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13420r7(C13329m7 m7Var) {
        super(2);
        this.f37996d = m7Var;
    }

    public Object invoke(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        C32227p<? super Float, ? super Float, Boolean> pVar = this.f37996d.f37814l;
        if (pVar != null) {
            Boolean invoke = pVar.invoke(Float.valueOf(floatValue), Float.valueOf(floatValue2));
        }
        return C13598b0.f38549a;
    }
}
