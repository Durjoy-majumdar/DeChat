package va0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108499f1;
import p175j0.C108502g1;
import p175j0.C108504h;
import p175j0.C108513w;
import p175j0.C33487v1;
import p267x.C111907e1;
import p267x.C111912g1;
import p415q0.C110261c;
import p558i0.C108308p;
import rx3.C13598b0;
import ta0.C110954a;

/* renamed from: va0.j */
public final class C111510j {

    /* renamed from: va0.j$a */
    public static final class C65560a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f188637d;

        /* renamed from: e */
        public final /* synthetic */ int f188638e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65560a(C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f188637d = pVar;
            this.f188638e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                this.f188637d.invoke(hVar, Integer.valueOf(this.f188638e & 14));
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: va0.j$b */
    public static final class C65561b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f188639d;

        /* renamed from: e */
        public final /* synthetic */ int f188640e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65561b(C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f188639d = pVar;
            this.f188640e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C111510j.m152007a(this.f188639d, (C108504h) obj, this.f188640e | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m152007a(C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C108504h hVar, int i) {
        int i2;
        C87412m.m108594g(pVar, "content");
        C108504h z = hVar.mo51623z(1209355651);
        if ((i & 14) == 0) {
            i2 = (z.mo51619x(pVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !z.mo51575a()) {
            C108499f1<C111907e1> f1Var = C111912g1.f335027a;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C108513w.m147056a(new C108502g1[]{f1Var.mo159370b(C108308p.m146678a(false, 0.0f, C110954a.m151254b(C0966R.color.BW_0_Alpha_0_1, context), z, 0, 3))}, C110261c.m149878b(z, 469869123, true, new C65560a(pVar, i2)), z, 56);
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C65561b(pVar, i));
        }
    }
}
