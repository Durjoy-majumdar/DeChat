package p869y0;

import androidx.compose.p002ui.platform.C103612c1;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p1140p1.C110100f;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60690y0;
import p721v0.C111299g;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: y0.b */
public final class C112304b {

    /* renamed from: y0.b$a */
    public static final class C112305a extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C66476a0, C13598b0> f336306d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112305a(C32226l<? super C66476a0, C13598b0> lVar) {
            super(3);
            this.f336306d = lVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C108504h hVar = (C108504h) obj2;
            ((Number) obj3).intValue();
            C87412m.m108594g((C65503j) obj, "$this$composed");
            hVar.mo51557H(-1741761824);
            hVar.mo51557H(-492369756);
            Object q = hVar.mo51606q();
            int i = C108504h.f324828a;
            if (q == C108504h.C60656a.f172772a) {
                q = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
                hVar.mo51553F(q);
            }
            hVar.mo51565P();
            int i2 = C65503j.f188489K0;
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            C66475a aVar2 = new C66475a((C60690y0) q, this.f336306d);
            C110100f<C112317h> fVar = C112311e.f336315a;
            C65503j a = C111299g.m151786a(aVar, C103612c1.f306063a, new C112316g(aVar2));
            hVar.mo51565P();
            return a;
        }
    }

    /* renamed from: a */
    public static final C65503j m153184a(C65503j jVar, C32226l<? super C66476a0, C13598b0> lVar) {
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(lVar, "onFocusChanged");
        return C111299g.m151786a(jVar, C103612c1.f306063a, new C112305a(lVar));
    }
}
