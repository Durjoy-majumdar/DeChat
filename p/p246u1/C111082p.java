package p246u1;

import androidx.compose.p002ui.platform.C103612c1;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicInteger;
import p175j0.C108504h;
import p721v0.C111299g;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: u1.p */
public final class C111082p {

    /* renamed from: u1.p$a */
    public static final class C111083a extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C111064a0, C13598b0> f332631d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111083a(C32226l<? super C111064a0, C13598b0> lVar) {
            super(3);
            this.f332631d = lVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C108504h hVar = (C108504h) obj2;
            ((Number) obj3).intValue();
            C87412m.m108594g((C65503j) obj, "$this$composed");
            hVar.mo51557H(1495908050);
            hVar.mo51557H(-492369756);
            Object q = hVar.mo51606q();
            if (q == C108504h.C60656a.f172772a) {
                AtomicInteger atomicInteger = C111080o.f332628f;
                q = Integer.valueOf(C111080o.f332628f.addAndGet(1));
                hVar.mo51553F(q);
            }
            hVar.mo51565P();
            C111080o oVar = new C111080o(((Number) q).intValue(), false, true, this.f332631d);
            hVar.mo51565P();
            return oVar;
        }
    }

    /* renamed from: u1.p$b */
    public static final class C111084b extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

        /* renamed from: d */
        public final /* synthetic */ boolean f332632d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<C111064a0, C13598b0> f332633e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111084b(boolean z, C32226l<? super C111064a0, C13598b0> lVar) {
            super(3);
            this.f332632d = z;
            this.f332633e = lVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C108504h hVar = (C108504h) obj2;
            ((Number) obj3).intValue();
            C87412m.m108594g((C65503j) obj, "$this$composed");
            hVar.mo51557H(-140499264);
            hVar.mo51557H(-492369756);
            Object q = hVar.mo51606q();
            if (q == C108504h.C60656a.f172772a) {
                AtomicInteger atomicInteger = C111080o.f332628f;
                q = Integer.valueOf(C111080o.f332628f.addAndGet(1));
                hVar.mo51553F(q);
            }
            hVar.mo51565P();
            C111080o oVar = new C111080o(((Number) q).intValue(), this.f332632d, false, this.f332633e);
            hVar.mo51565P();
            return oVar;
        }
    }

    /* renamed from: a */
    public static final C65503j m151475a(C65503j jVar, C32226l<? super C111064a0, C13598b0> lVar) {
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(lVar, "properties");
        return C111299g.m151786a(jVar, C103612c1.f306063a, new C111083a(lVar));
    }

    /* renamed from: b */
    public static final C65503j m151476b(C65503j jVar, boolean z, C32226l<? super C111064a0, C13598b0> lVar) {
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(lVar, "properties");
        return C111299g.m151786a(jVar, C103612c1.f306063a, new C111084b(z, lVar));
    }
}
