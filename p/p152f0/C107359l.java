package p152f0;

import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p155g0.C107601b0;
import p175j0.C108504h;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24724t1;
import p175j0.C33487v1;
import rx3.C13598b0;

/* renamed from: f0.l */
public final class C107359l {

    /* renamed from: f0.l$a */
    public static final class C107360a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107601b0 f321205d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f321206e;

        /* renamed from: f */
        public final /* synthetic */ int f321207f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107360a(C107601b0 b0Var, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f321205d = b0Var;
            this.f321206e = pVar;
            this.f321207f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107359l.m145491a(this.f321205d, this.f321206e, (C108504h) obj, this.f321207f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m145491a(C107601b0 b0Var, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C108504h hVar, int i) {
        int i2;
        C87412m.m108594g(b0Var, "manager");
        C87412m.m108594g(pVar, "content");
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(-1985516685);
        if ((i & 112) == 0) {
            i2 = (z.mo51619x(pVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) != 16 || !z.mo51575a()) {
            pVar.invoke(z, Integer.valueOf((i2 >> 3) & 14));
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C107360a(b0Var, pVar, i));
        }
    }
}
