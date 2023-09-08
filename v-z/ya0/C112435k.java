package ya0;

import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p1125j2.C108530a;
import p175j0.C108504h;
import p435a0.C103160j0;
import p435a0.C103214y0;
import p721v0.C111294a;
import p721v0.C65503j;
import sx3.C110818d0;
import sx3.C64197v;
import wa0.C111791f;

/* renamed from: ya0.k */
public final class C112435k extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ C112430i f336670d;

    /* renamed from: e */
    public final /* synthetic */ List<C111791f> f336671e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112435k(C112430i iVar, List<C111791f> list) {
        super(3);
        this.f336670d = iVar;
        this.f336671e = list;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        float f2;
        C65503j jVar = (C65503j) obj;
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g(jVar, "$this$composed");
        hVar.mo51557H(2147956);
        if (this.f336670d.mo164139g() == 0) {
            hVar.mo51565P();
            return jVar;
        }
        List<C111791f> list = this.f336671e;
        C111791f fVar = list.get(Math.min(C64197v.m75536e(list), this.f336670d.mo164141i()));
        int h = this.f336670d.mo164140h();
        C111791f fVar2 = (C111791f) C110818d0.m150917O(this.f336671e, h);
        if (fVar2 != null) {
            float abs = Math.abs(this.f336670d.mo164138f() / ((float) Math.max(Math.abs(h - this.f336670d.mo164141i()), 1)));
            f2 = C108530a.m147078a(fVar.f334755a, fVar2.f334755a, abs);
            f = Math.abs(C108530a.m147078a(fVar.f334756b, fVar2.f334756b, abs));
        } else {
            f2 = fVar.f334755a;
            f = fVar.f334756b;
        }
        C65503j g = C103214y0.m136591g(jVar, 0.0f, 1, (Object) null);
        int i = C111294a.f333218a;
        C65503j l = C103214y0.m136596l(C103160j0.m136502a(C103214y0.m136598n(g, C111294a.C111295a.f333223e, false, 2, (Object) null), f2, 0.0f, 2, (Object) null), f);
        hVar.mo51565P();
        return l;
    }
}
