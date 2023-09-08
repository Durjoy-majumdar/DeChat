package d60;

import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: d60.b1 */
public final class C7173b1 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f25145d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7173b1(C32226l<? super Boolean, C13598b0> lVar) {
        super(1);
        this.f25145d = lVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C32226l<Boolean, C13598b0> lVar = this.f25145d;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(booleanValue));
        }
        return C13598b0.f38549a;
    }
}
