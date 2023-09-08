package oa0;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: oa0.d */
public final class C61950d extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f176088d;

    /* renamed from: e */
    public final /* synthetic */ int f176089e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61950d(C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
        super(2);
        this.f176088d = pVar;
        this.f176089e = i;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            this.f176088d.invoke(hVar, Integer.valueOf((this.f176089e >> 9) & 14));
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
