package fq3;

import fy3.C32229r;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import p004b0.C103941f;
import p175j0.C108504h;
import p267x.C66223m;
import p435a0.C103214y0;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: fq3.i */
public final class C59278i extends C87413o implements C32229r<C103941f, Integer, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8478d0 f169503d;

    /* renamed from: e */
    public final /* synthetic */ long f169504e;

    /* renamed from: f */
    public final /* synthetic */ long f169505f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59278i(C8478d0 d0Var, long j, long j2) {
        super(4);
        this.f169503d = d0Var;
        this.f169504e = j;
        this.f169505f = j2;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        C108504h hVar = (C108504h) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C87412m.m108594g((C103941f) obj, "$this$items");
        if ((intValue2 & 112) == 0) {
            intValue2 |= hVar.mo51592j(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) != 144 || !hVar.mo51575a()) {
            int i = C65503j.f188489K0;
            C66223m.m78148a(C103214y0.m136594j(C65503j.C65504a.f188490d, ((float) 1) * ((float) 8)), new C59277h(intValue, this.f169503d, this.f169504e, this.f169505f), hVar, 6);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
