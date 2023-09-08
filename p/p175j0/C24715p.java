package p175j0;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: j0.p */
public final class C24715p {

    /* renamed from: a */
    public static final C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> f70494a = C24717b.f70506d;

    /* renamed from: b */
    public static final C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> f70495b = C24719d.f70508d;

    /* renamed from: c */
    public static final C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> f70496c = C24716a.f70505d;

    /* renamed from: d */
    public static final C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> f70497d = C24720e.f70509d;

    /* renamed from: e */
    public static final C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> f70498e = C24718c.f70507d;

    /* renamed from: f */
    public static final Object f70499f = new C9268b1("provider");

    /* renamed from: g */
    public static final Object f70500g = new C9268b1("provider");

    /* renamed from: h */
    public static final Object f70501h = new C9268b1("compositionLocalMap");

    /* renamed from: i */
    public static final Object f70502i = new C9268b1("providerValues");

    /* renamed from: j */
    public static final Object f70503j = new C9268b1("providers");

    /* renamed from: k */
    public static final Object f70504k = new C9268b1("reference");

    /* renamed from: j0.p$a */
    public static final class C24716a extends C87413o implements C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> {

        /* renamed from: d */
        public static final C24716a f70505d = new C24716a();

        public C24716a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C24661b2 b2Var = (C24661b2) obj2;
            C87412m.m108594g((C24665d) obj, "<anonymous parameter 0>");
            C87412m.m108594g(b2Var, "slots");
            C87412m.m108594g((C24724t1) obj3, "<anonymous parameter 2>");
            b2Var.mo51518i();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j0.p$b */
    public static final class C24717b extends C87413o implements C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> {

        /* renamed from: d */
        public static final C24717b f70506d = new C24717b();

        public C24717b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C24661b2 b2Var = (C24661b2) obj2;
            C24724t1 t1Var = (C24724t1) obj3;
            C87412m.m108594g((C24665d) obj, "<anonymous parameter 0>");
            C87412m.m108594g(b2Var, "slots");
            C87412m.m108594g(t1Var, "rememberManager");
            C24715p.m31029e(b2Var, t1Var);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j0.p$c */
    public static final class C24718c extends C87413o implements C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> {

        /* renamed from: d */
        public static final C24718c f70507d = new C24718c();

        public C24718c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C24661b2 b2Var = (C24661b2) obj2;
            C87412m.m108594g((C24665d) obj, "<anonymous parameter 0>");
            C87412m.m108594g(b2Var, "slots");
            C87412m.m108594g((C24724t1) obj3, "<anonymous parameter 2>");
            if (b2Var.f70319m == 0) {
                b2Var.mo51496A();
                b2Var.f70324r = 0;
                b2Var.f70313g = (b2Var.f70308b.length / 5) - b2Var.f70312f;
                b2Var.f70314h = 0;
                b2Var.f70315i = 0;
                b2Var.f70320n = 0;
                return C13598b0.f38549a;
            }
            C24715p.m31027c("Cannot reset when inserting".toString());
            throw null;
        }
    }

    /* renamed from: j0.p$d */
    public static final class C24719d extends C87413o implements C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> {

        /* renamed from: d */
        public static final C24719d f70508d = new C24719d();

        public C24719d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C24661b2 b2Var = (C24661b2) obj2;
            C87412m.m108594g((C24665d) obj, "<anonymous parameter 0>");
            C87412m.m108594g(b2Var, "slots");
            C87412m.m108594g((C24724t1) obj3, "<anonymous parameter 2>");
            b2Var.mo51502G();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j0.p$e */
    public static final class C24720e extends C87413o implements C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> {

        /* renamed from: d */
        public static final C24720e f70509d = new C24720e();

        public C24720e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C24661b2 b2Var = (C24661b2) obj2;
            C87412m.m108594g((C24665d) obj, "<anonymous parameter 0>");
            C87412m.m108594g(b2Var, "slots");
            C87412m.m108594g((C24724t1) obj3, "<anonymous parameter 2>");
            b2Var.mo51520k(0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m31025a(List list, int i, int i2) {
        int d = m31028d(list, i);
        if (d < 0) {
            d = -(d + 1);
        }
        while (d < list.size() && ((C24709l0) list.get(d)).f70477b < i2) {
            list.remove(d);
        }
    }

    /* renamed from: b */
    public static final void m31026b(C24728y1 y1Var, List<Object> list, int i) {
        if (y1Var.mo51695i(i)) {
            list.add(y1Var.mo51696j(i));
            return;
        }
        int i2 = i + 1;
        int h = i + y1Var.mo51694h(i);
        while (i2 < h) {
            m31026b(y1Var, list, i2);
            i2 += y1Var.mo51694h(i2);
        }
    }

    /* renamed from: c */
    public static final Void m31027c(String str) {
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        throw new IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    /* renamed from: d */
    public static final int m31028d(List<C24709l0> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = C87412m.m108596i(list.get(i3).f70477b, i);
            if (i4 < 0) {
                i2 = i3 + 1;
            } else if (i4 <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        r0 = (p175j0.C24705j1) r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m31029e(p175j0.C24661b2 r4, p175j0.C24724t1 r5) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "rememberManager"
            gy3.C87412m.m108594g(r5, r0)
            int[] r0 = r4.f70308b
            int r1 = r4.f70324r
            int r1 = r4.mo51523n(r1)
            int r0 = r4.mo51516g(r0, r1)
            int[] r1 = r4.f70308b
            int r2 = r4.f70324r
            int r3 = r4.mo51524o(r2)
            int r2 = r2 + r3
            int r2 = r4.mo51523n(r2)
            int r1 = r4.mo51516g(r1, r2)
            j0.c2 r2 = new j0.c2
            r2.<init>(r0, r1, r4)
        L_0x002c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r2.next()
            boolean r1 = r0 instanceof p175j0.C24725u1
            if (r1 == 0) goto L_0x0040
            j0.u1 r0 = (p175j0.C24725u1) r0
            r5.mo51683b(r0)
            goto L_0x002c
        L_0x0040:
            boolean r1 = r0 instanceof p175j0.C24705j1
            if (r1 == 0) goto L_0x002c
            j0.j1 r0 = (p175j0.C24705j1) r0
            j0.t r1 = r0.f70463a
            if (r1 == 0) goto L_0x002c
            r3 = 1
            r1.f70523t = r3
            r1 = 0
            r0.f70463a = r1
            goto L_0x002c
        L_0x0051:
            r4.mo51497B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p175j0.C24715p.m31029e(j0.b2, j0.t1):void");
    }

    /* renamed from: f */
    public static final void m31030f(boolean z) {
        if (!z) {
            m31027c("Check failed".toString());
            throw null;
        }
    }
}
