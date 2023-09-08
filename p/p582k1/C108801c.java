package p582k1;

import a14.C0000n0;
import androidx.compose.p002ui.platform.C103612c1;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p175j0.C108515x;
import p175j0.C60655g0;
import p721v0.C111299g;
import p721v0.C65503j;
import wx3.C66217g;

/* renamed from: k1.c */
public final class C108801c {

    /* renamed from: k1.c$a */
    public static final class C108802a extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

        /* renamed from: d */
        public final /* synthetic */ C108797b f325798d;

        /* renamed from: e */
        public final /* synthetic */ C108796a f325799e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108802a(C108797b bVar, C108796a aVar) {
            super(3);
            this.f325798d = bVar;
            this.f325799e = aVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C108504h hVar = (C108504h) obj2;
            ((Number) obj3).intValue();
            C87412m.m108594g((C65503j) obj, "$this$composed");
            hVar.mo51557H(410346167);
            hVar.mo51557H(773894976);
            hVar.mo51557H(-492369756);
            Object q = hVar.mo51606q();
            int i = C108504h.f324828a;
            Object obj4 = C108504h.C60656a.f172772a;
            if (q == obj4) {
                C108515x xVar = new C108515x(C60655g0.m70937h(C66217g.f190253d, hVar));
                hVar.mo51553F(xVar);
                q = xVar;
            }
            hVar.mo51565P();
            C0000n0 n0Var = ((C108515x) q).f324838d;
            hVar.mo51565P();
            C108797b bVar = this.f325798d;
            hVar.mo51557H(100475863);
            if (bVar == null) {
                hVar.mo51557H(-492369756);
                Object q2 = hVar.mo51606q();
                if (q2 == obj4) {
                    q2 = new C108797b();
                    hVar.mo51553F(q2);
                }
                hVar.mo51565P();
                bVar = (C108797b) q2;
            }
            hVar.mo51565P();
            C108796a aVar = this.f325799e;
            hVar.mo51557H(1618982084);
            boolean x = hVar.mo51619x(aVar) | hVar.mo51619x(bVar) | hVar.mo51619x(n0Var);
            Object q3 = hVar.mo51606q();
            if (x || q3 == obj4) {
                bVar.f325789b = n0Var;
                q3 = new C108803d(bVar, aVar);
                hVar.mo51553F(q3);
            }
            hVar.mo51565P();
            C108803d dVar = (C108803d) q3;
            hVar.mo51565P();
            return dVar;
        }
    }

    /* renamed from: a */
    public static final C65503j m147665a(C65503j jVar, C108796a aVar, C108797b bVar) {
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(aVar, "connection");
        return C111299g.m151786a(jVar, C103612c1.f306063a, new C108802a(bVar, aVar));
    }
}
