package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.C103581i;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108494d2;
import p175j0.C108504h;
import p175j0.C60655g0;
import p415q0.C110261c;
import rx3.C13598b0;

/* renamed from: androidx.compose.foundation.lazy.layout.h */
public final class C103580h extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C103581i f305899d;

    /* renamed from: e */
    public final /* synthetic */ C103581i.C103582a f305900e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103580h(C103581i iVar, C103581i.C103582a aVar) {
        super(2);
        this.f305899d = iVar;
        this.f305900e = aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int i;
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C103583j invoke = this.f305899d.f305902b.invoke();
            Integer num = invoke.mo75149e().get(this.f305900e.f305906a);
            if (num != null) {
                C103581i.C103582a aVar = this.f305900e;
                int intValue = num.intValue();
                ((C108494d2) aVar.f305908c).setValue(Integer.valueOf(intValue));
                i = num.intValue();
            } else {
                i = ((Number) ((C108494d2) this.f305900e.f305908c).getValue()).intValue();
            }
            hVar.mo51557H(-715769699);
            if (i < invoke.getItemCount()) {
                Object f = invoke.mo75150f(i);
                if (C87412m.m108589b(f, this.f305900e.f305906a)) {
                    this.f305899d.f305901a.mo162239a(f, C110261c.m149878b(hVar, -1238863364, true, new C103577e(invoke, i)), hVar, 568);
                }
            }
            hVar.mo51565P();
            C103581i.C103582a aVar2 = this.f305900e;
            C60655g0.m70930a(aVar2.f305906a, new C103579g(aVar2), hVar, 8);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
