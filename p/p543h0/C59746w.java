package p543h0;

import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24724t1;
import p175j0.C33487v1;
import rx3.C13598b0;

/* renamed from: h0.w */
public final class C59746w {

    /* renamed from: h0.w$a */
    public static final class C59747a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f170638d;

        /* renamed from: e */
        public final /* synthetic */ int f170639e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59747a(C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f170638d = pVar;
            this.f170639e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C59746w.m69651a(this.f170638d, (C108504h) obj, this.f170639e | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m69651a(C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C108504h hVar, int i) {
        int i2;
        C87412m.m108594g(pVar, "content");
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(-1322912246);
        if ((i & 14) == 0) {
            i2 = (z.mo51619x(pVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !z.mo51575a()) {
            pVar.invoke(z, Integer.valueOf(i2 & 14));
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C59747a(pVar, i));
        }
    }
}
