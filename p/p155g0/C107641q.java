package p155g0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p257w.C111654m;
import p257w.C111656m1;
import p257w.C37906k1;
import p257w.C37944w0;

/* renamed from: g0.q */
public final class C107641q {

    /* renamed from: a */
    public static final C111654m f322032a = new C111654m(Float.NaN, Float.NaN);

    /* renamed from: b */
    public static final C37906k1<C112539e, C111654m> f322033b = C111656m1.m152187a(C107642a.f322036d, C107643b.f322037d);

    /* renamed from: c */
    public static final long f322034c;

    /* renamed from: d */
    public static final C37944w0<C112539e> f322035d;

    /* renamed from: g0.q$a */
    public static final class C107642a extends C87413o implements C32226l<C112539e, C111654m> {

        /* renamed from: d */
        public static final C107642a f322036d = new C107642a();

        public C107642a() {
            super(1);
        }

        public Object invoke(Object obj) {
            long j = ((C112539e) obj).f336959a;
            return C112540f.m153747c(j) ? new C111654m(C112539e.m153738c(j), C112539e.m153739d(j)) : C107641q.f322032a;
        }
    }

    /* renamed from: g0.q$b */
    public static final class C107643b extends C87413o implements C32226l<C111654m, C112539e> {

        /* renamed from: d */
        public static final C107643b f322037d = new C107643b();

        public C107643b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C111654m mVar = (C111654m) obj;
            C87412m.m108594g(mVar, LocaleUtil.ITALIAN);
            return new C112539e(C112540f.m153745a(mVar.f334250a, mVar.f334251b));
        }
    }

    static {
        long a = C112540f.m153745a(0.01f, 0.01f);
        f322034c = a;
        f322035d = new C37944w0(0.0f, 0.0f, new C112539e(a), 3, (C8480h) null);
    }
}
