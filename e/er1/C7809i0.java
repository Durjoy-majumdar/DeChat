package er1;

import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: er1.i0 */
public final class C7809i0 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7823k0 f26329d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7809i0(C7823k0 k0Var) {
        super(1);
        this.f26329d = k0Var;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue == 1) {
            this.f26329d.f26356b = true;
        } else if (intValue == 2) {
            this.f26329d.f26357c = true;
        } else if (intValue == 3) {
            this.f26329d.f26358d = true;
        } else if (intValue == 5) {
            this.f26329d.f26359e = true;
        }
        return C13598b0.f38549a;
    }
}
