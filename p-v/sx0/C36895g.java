package sx0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: sx0.g */
public final class C36895g extends C87413o implements C32227p<Boolean, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C48489d f97916d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f97917e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36895g(C48489d dVar, C32226l<? super Boolean, C13598b0> lVar) {
        super(2);
        this.f97916d = dVar;
        this.f97917e = lVar;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        if (booleanValue) {
            C48489d dVar = this.f97916d;
            C36894f fVar = new C36894f(this.f97917e, booleanValue);
            dVar.f129687d = true;
            fVar.invoke();
        } else {
            this.f97917e.invoke(Boolean.FALSE);
        }
        return C13598b0.f38549a;
    }
}
