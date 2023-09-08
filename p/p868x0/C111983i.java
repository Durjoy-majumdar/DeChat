package p868x0;

import androidx.compose.p002ui.platform.C103612c1;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p721v0.C111299g;
import p721v0.C65503j;
import p835c1.C104231f;
import p835c1.C54601d;
import rx3.C13598b0;

/* renamed from: x0.i */
public final class C111983i {

    /* renamed from: x0.i$a */
    public static final class C111984a extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C111978c, C111985j> f335231d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111984a(C32226l<? super C111978c, C111985j> lVar) {
            super(3);
            this.f335231d = lVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C65503j jVar = (C65503j) obj;
            C108504h hVar = (C108504h) obj2;
            ((Number) obj3).intValue();
            C87412m.m108594g(jVar, "$this$composed");
            hVar.mo51557H(-1689569019);
            hVar.mo51557H(-492369756);
            Object q = hVar.mo51606q();
            int i = C108504h.f324828a;
            if (q == C108504h.C60656a.f172772a) {
                q = new C111978c();
                hVar.mo51553F(q);
            }
            hVar.mo51565P();
            C65503j i0 = jVar.mo74972i0(new C111981g((C111978c) q, this.f335231d));
            hVar.mo51565P();
            return i0;
        }
    }

    /* renamed from: a */
    public static final C65503j m152700a(C65503j jVar, C32226l<? super C104231f, C13598b0> lVar) {
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(lVar, "onDraw");
        return jVar.mo74972i0(new C66231e(lVar, C103612c1.f306063a));
    }

    /* renamed from: b */
    public static final C65503j m152701b(C65503j jVar, C32226l<? super C111978c, C111985j> lVar) {
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(lVar, "onBuildDrawCache");
        return C111299g.m151786a(jVar, C103612c1.f306063a, new C111984a(lVar));
    }

    /* renamed from: c */
    public static final C65503j m152702c(C65503j jVar, C32226l<? super C54601d, C13598b0> lVar) {
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(lVar, "onDraw");
        return jVar.mo74972i0(new C66232k(lVar, C103612c1.f306063a));
    }
}
