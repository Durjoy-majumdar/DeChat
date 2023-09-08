package p631o1;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108494d2;
import p175j0.C108504h;
import p631o1.C109874t;
import rx3.C13598b0;

/* renamed from: o1.w */
public final class C109887w extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109874t.C109875a f328834d;

    /* renamed from: e */
    public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f328835e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109887w(C109874t.C109875a aVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
        super(2);
        this.f328834d = aVar;
        this.f328835e = pVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            boolean booleanValue = ((Boolean) ((C108494d2) this.f328834d.f328813e).getValue()).booleanValue();
            C32227p<C108504h, Integer, C13598b0> pVar = this.f328835e;
            hVar.mo51617w(207, Boolean.valueOf(booleanValue));
            boolean g = hVar.mo51586g(booleanValue);
            if (booleanValue) {
                pVar.invoke(hVar, 0);
            } else {
                hVar.mo51608r(g);
            }
            hVar.mo51604p();
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
