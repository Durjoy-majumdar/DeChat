package oa0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p267x.C111885b;
import p415q0.C110261c;
import p435a0.C103141f;
import p435a0.C103214y0;
import p436a1.C103257q;
import p436a1.C103266t0;
import p436a1.C103272w;
import p721v0.C65503j;
import rx3.C13598b0;
import sx3.C64197v;
import ta0.C110954a;

/* renamed from: oa0.b */
public final class C110005b {

    /* renamed from: a */
    public static C32227p<C108504h, Integer, C13598b0> f329191a = C110261c.m149879c(-2021293840, false, C110006a.f329192d);

    /* renamed from: oa0.b$a */
    public static final class C110006a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public static final C110006a f329192d = new C110006a();

        public C110006a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                int i = C65503j.f188489K0;
                C65503j f = C103214y0.m136590f(C65503j.C65504a.f188490d, 0.0f, 1, (Object) null);
                C103257q.C103258a aVar = C103257q.f304461a;
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                Context context2 = MMApplicationContext.getContext();
                C87412m.m108593f(context2, "getContext()");
                C103141f.m136470a(C111885b.m152605a(f, C103257q.C103258a.m136720a(aVar, C64197v.m75537f(new C103272w(C110954a.m151254b(C0966R.color.ahf, context)), new C103272w(C110954a.m151254b(C0966R.color.BW_0_Alpha_0_5, context2))), 0.0f, 0.0f, 0, 14, (Object) null), (C103266t0) null, 0.0f, 6, (Object) null), hVar, 0);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }
}
