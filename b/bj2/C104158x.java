package bj2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p175j0.C33487v1;
import p543h0.C107951g;
import p543h0.C107953h;
import p543h0.C107957i0;
import p543h0.C107979v;
import p543h0.C107984y;
import rx3.C13598b0;
import ta0.C110954a;

/* renamed from: bj2.x */
public final class C104158x {

    /* renamed from: bj2.x$a */
    public static final class C104159a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f308185d;

        /* renamed from: e */
        public final /* synthetic */ int f308186e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104159a(C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f308185d = pVar;
            this.f308186e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104158x.m138991a(this.f308185d, (C108504h) obj, this.f308186e | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m138991a(C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C108504h hVar, int i) {
        int i2;
        C32227p<? super C108504h, ? super Integer, C13598b0> pVar2 = pVar;
        int i3 = i;
        C87412m.m108594g(pVar2, "content");
        C108504h z = hVar.mo51623z(862783314);
        if ((i3 & 14) == 0) {
            i2 = (z.mo51619x(pVar2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !z.mo51575a()) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C107979v.m146264a(C107951g.m146243a((C107951g) z.mo51598m(C107953h.f323293a), 0, 0, 0, 0, 0, C110954a.m151254b(C0966R.color.f2929c, context), 0, 0, 0, 0, 0, 0, false, 8159, (Object) null), (C107957i0) null, (C107984y) null, pVar, z, (i2 << 9) & 7168, 6);
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C104159a(pVar2, i3));
        }
    }
}
