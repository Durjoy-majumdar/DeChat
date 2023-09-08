package qj1;

import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.cf */
public final class C12269cf extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f35356d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12269cf(C32226l<? super Boolean, C13598b0> lVar) {
        super(1);
        this.f35356d = lVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C32226l<Boolean, C13598b0> lVar = this.f35356d;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(booleanValue));
        }
        return C13598b0.f38549a;
    }
}
