package sk3;

import fy3.C32227p;
import gq3.C107902e;
import gq3.C59629h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: sk3.q */
public final class C64003q extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63995m f181446d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64003q(C63995m mVar) {
        super(2);
        this.f181446d = mVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C59629h e3 = this.f181446d.mo88763e3();
            C87412m.m108593f(e3, "imageDataQueryModel");
            C64001o oVar = new C64001o(this.f181446d);
            C64002p pVar = new C64002p(this.f181446d);
            List<String> list = C59629h.f170395E;
            C107902e.m146196a(e3, oVar, pVar, hVar, 8);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
