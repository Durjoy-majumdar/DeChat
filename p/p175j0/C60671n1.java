package p175j0;

import fy3.C32224a;
import gy3.C87413o;
import java.util.Iterator;
import p410k0.C60926c;
import rx3.C13598b0;

/* renamed from: j0.n1 */
public final class C60671n1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60926c<Object> f172814d;

    /* renamed from: e */
    public final /* synthetic */ C60689y f172815e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60671n1(C60926c<Object> cVar, C60689y yVar) {
        super(0);
        this.f172814d = cVar;
        this.f172815e = yVar;
    }

    public Object invoke() {
        C60926c<Object> cVar = this.f172814d;
        C60689y yVar = this.f172815e;
        Iterator<Object> it = cVar.iterator();
        while (true) {
            C60926c.C60927a aVar = (C60926c.C60927a) it;
            if (!aVar.hasNext()) {
                return C13598b0.f38549a;
            }
            yVar.mo51673q(aVar.next());
        }
    }
}
