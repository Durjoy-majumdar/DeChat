package z90;

import ca0.C104344e0;
import ca0.C104353p;
import ca0.C54683f0;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;
import um0.C22657f;

/* renamed from: z90.j */
public final class C66760j extends C87413o implements C32228q<Boolean, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54683f0 f191827d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f191828e;

    /* renamed from: f */
    public final /* synthetic */ int f191829f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66760j(C54683f0 f0Var, C32224a<C13598b0> aVar, int i) {
        super(3);
        this.f191827d = f0Var;
        this.f191828e = aVar;
        this.f191829f = i;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C108504h hVar = (C108504h) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 14) == 0) {
            intValue |= hVar.mo51586g(booleanValue) ? 4 : 2;
        }
        if ((intValue & 91) == 18 && hVar.mo51575a()) {
            hVar.mo51581d();
        } else if (booleanValue) {
            C104353p.m139327f(this.f191827d.f153250b.getValue(), C104344e0.f308940k, this.f191828e, hVar, ((this.f191829f >> 3) & C22657f.CTRL_INDEX) | 56);
        }
        return C13598b0.f38549a;
    }
}
