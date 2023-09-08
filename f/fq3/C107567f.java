package fq3;

import fy3.C32226l;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import p004b0.C103941f;
import p157gk.C32466a;
import p175j0.C108504h;
import p246u1.C111072h;
import p267x.C111940o;
import p435a0.C103214y0;
import p502e0.C107074g;
import p721v0.C65503j;
import p868x0.C111979d;
import rx3.C13598b0;

/* renamed from: fq3.f */
public final class C107567f extends C87413o implements C32229r<C103941f, Integer, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<C32466a> f321851d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C32466a, C13598b0> f321852e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107567f(ArrayList<C32466a> arrayList, C32226l<? super C32466a, C13598b0> lVar) {
        super(4);
        this.f321851d = arrayList;
        this.f321852e = lVar;
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
            float f = (float) 8;
            C107569j.m145739c(C111979d.m152690a(C111940o.m152651d(C103214y0.m136594j(C65503j.C65504a.f188490d, ((float) 7.5d) * f), false, (String) null, (C111072h) null, new C8181e(this.f321852e, this.f321851d, intValue), 7, (Object) null), C107074g.m144958a(((float) 1) * f)), this.f321851d.get(intValue).f86262b, hVar, 0);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
