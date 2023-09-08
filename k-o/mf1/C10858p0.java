package mf1;

import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import pf1.C11920q;
import rf1.C12982a;
import rx3.C13598b0;
import te3.uc4;

/* renamed from: mf1.p0 */
public final class C10858p0 extends C87413o implements C32226l<C12982a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12982a f32426d;

    /* renamed from: e */
    public final /* synthetic */ int f32427e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<C12982a> f32428f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10858p0(C12982a aVar, int i, C8479f0<C12982a> f0Var) {
        super(1);
        this.f32426d = aVar;
        this.f32427e = i;
        this.f32428f = f0Var;
    }

    public Object invoke(Object obj) {
        C11920q qVar;
        T t;
        boolean z;
        T t2 = (C12982a) obj;
        C87412m.m108594g(t2, "thatObserver");
        if (!C87412m.m108589b(t2, this.f32426d) && (qVar = t2.f37015d) != null) {
            LinkedList<uc4> linkedList = qVar.f34827a.style;
            C87412m.m108593f(linkedList, "thatInfoEx.jumpInfo.style");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((uc4) t).f142762h == qVar.f34842p) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            uc4 uc4 = (uc4) t;
            if (uc4 != null && this.f32427e == uc4.f142777z / 1000) {
                this.f32428f.f27484d = t2;
            }
        }
        return C13598b0.f38549a;
    }
}
