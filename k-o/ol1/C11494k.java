package ol1;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import nl1.C11217a;
import ol1.C11490j;
import rx3.C13598b0;

/* renamed from: ol1.k */
public final class C11494k extends C87413o implements C32227p<String, Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11490j f33788d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11494k(C11490j jVar) {
        super(2);
        this.f33788d = jVar;
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        long longValue = ((Number) obj2).longValue();
        C87412m.m108594g(str, "giftId");
        this.f33788d.mo3431p();
        C11217a aVar = this.f33788d.f33769p.get(str);
        if (aVar != null) {
            aVar.f33073b = longValue;
        }
        C11490j.C11491a aVar2 = this.f33788d.f33770q.get(str);
        if (aVar2 != null) {
            aVar2.mo11454a(this.f33788d.f33769p.get(str));
        }
        this.f33788d.mo11450t();
        return C13598b0.f38549a;
    }
}
