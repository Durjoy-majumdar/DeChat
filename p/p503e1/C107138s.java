package p503e1;

import fy3.C32229r;
import gy3.C87413o;
import java.util.Map;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: e1.s */
public final class C107138s extends C87413o implements C32229r<Float, Float, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107082c f320698d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107138s(C107082c cVar) {
        super(4);
        this.f320698d = cVar;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        C108504h hVar = (C108504h) obj3;
        if ((((Number) obj4).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C107133r.m144996a(this.f320698d.f320548f, (Map<String, ? extends C107122k>) null, hVar, 0, 2);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
