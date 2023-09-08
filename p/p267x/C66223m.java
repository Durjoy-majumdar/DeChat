package p267x;

import fy3.C32226l;
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
import p435a0.C103129b1;
import p721v0.C65503j;
import p835c1.C104231f;
import p868x0.C111983i;
import rx3.C13598b0;

/* renamed from: x.m */
public final class C66223m {

    /* renamed from: x.m$a */
    public static final class C66224a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65503j f190266d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<C104231f, C13598b0> f190267e;

        /* renamed from: f */
        public final /* synthetic */ int f190268f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66224a(C65503j jVar, C32226l<? super C104231f, C13598b0> lVar, int i) {
            super(2);
            this.f190266d = jVar;
            this.f190267e = lVar;
            this.f190268f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C66223m.m78148a(this.f190266d, this.f190267e, (C108504h) obj, this.f190268f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m78148a(C65503j jVar, C32226l<? super C104231f, C13598b0> lVar, C108504h hVar, int i) {
        int i2;
        C87412m.m108594g(jVar, "modifier");
        C87412m.m108594g(lVar, "onDraw");
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(-932836462);
        if ((i & 14) == 0) {
            i2 = (z.mo51619x(jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= z.mo51619x(lVar) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !z.mo51575a()) {
            C103129b1.m136432a(C111983i.m152700a(jVar, lVar), z, 0);
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C66224a(jVar, lVar, i));
        }
    }
}
