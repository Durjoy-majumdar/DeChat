package q52;

import fy3.C32224a;
import gy3.C87413o;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: q52.i */
public final class C89471i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89468h f257531d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89471i(C89468h hVar) {
        super(0);
        this.f257531d = hVar;
    }

    public Object invoke() {
        C89468h hVar = this.f257531d;
        if (hVar.f257525k && hVar.f257524j) {
            Iterator<String> it = hVar.f257522h.iterator();
            while (it.hasNext()) {
                C89468h.m111855f(hVar, it.next());
            }
        }
        return C13598b0.f38549a;
    }
}
