package p631o1;

import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import my3.C61595o;
import p436a1.C103224b0;
import p560i2.C108319b;
import p560i2.C108329n;
import p560i2.C33177j;
import p560i2.C33179k;
import p560i2.C33181m;
import p560i2.C33183o;
import rx3.C13598b0;

/* renamed from: o1.n0 */
public abstract class C109854n0 {

    /* renamed from: d */
    public int f328779d;

    /* renamed from: e */
    public int f328780e;

    /* renamed from: f */
    public long f328781f = C108329n.m146743a(0, 0);

    /* renamed from: g */
    public long f328782g = C109859o0.f328787b;

    /* renamed from: o1.n0$a */
    public static abstract class C109855a {

        /* renamed from: a */
        public static final C109856a f328783a = new C109856a((C8480h) null);

        /* renamed from: b */
        public static C33183o f328784b = C33183o.Ltr;

        /* renamed from: c */
        public static int f328785c;

        /* renamed from: o1.n0$a$a */
        public static final class C109856a extends C109855a {
            public C109856a(C8480h hVar) {
            }

            /* renamed from: a */
            public C33183o mo161172a() {
                return C109855a.f328784b;
            }

            /* renamed from: b */
            public int mo161173b() {
                return C109855a.f328785c;
            }
        }

        /* renamed from: c */
        public static void m149304c(C109855a aVar, C109854n0 n0Var, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                aVar.getClass();
                C87412m.m108594g(n0Var, "<this>");
                long a = C33179k.m39964a(i, i2);
                long a0 = n0Var.mo161165a0();
                n0Var.mo161160j0(C33179k.m39964a(((int) (a >> 32)) + ((int) (a0 >> 32)), C33177j.m39962a(a) + C33177j.m39962a(a0)), f, (C32226l<? super C103224b0, C13598b0>) null);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        /* renamed from: e */
        public static /* synthetic */ void m149305e(C109855a aVar, C109854n0 n0Var, long j, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                aVar.mo161174d(n0Var, j, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        /* renamed from: f */
        public static void m149306f(C109855a aVar, C109854n0 n0Var, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                aVar.getClass();
                C87412m.m108594g(n0Var, "<this>");
                long a = C33179k.m39964a(i, i2);
                if (aVar.mo161172a() == C33183o.Ltr || aVar.mo161173b() == 0) {
                    long a0 = n0Var.mo161165a0();
                    n0Var.mo161160j0(C33179k.m39964a(((int) (a >> 32)) + ((int) (a0 >> 32)), C33177j.m39962a(a) + C33177j.m39962a(a0)), f, (C32226l<? super C103224b0, C13598b0>) null);
                    return;
                }
                long a2 = C33179k.m39964a((aVar.mo161173b() - ((int) (n0Var.f328781f >> 32))) - ((int) (a >> 32)), C33177j.m39962a(a));
                long a05 = n0Var.mo161165a0();
                n0Var.mo161160j0(C33179k.m39964a(((int) (a2 >> 32)) + ((int) (a05 >> 32)), C33177j.m39962a(a2) + C33177j.m39962a(a05)), f, (C32226l<? super C103224b0, C13598b0>) null);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        /* renamed from: g */
        public static void m149307g(C109855a aVar, C109854n0 n0Var, int i, int i2, float f, C32226l<C103224b0, C13598b0> lVar, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                if ((i3 & 8) != 0) {
                    lVar = C109859o0.f328786a;
                }
                aVar.getClass();
                C87412m.m108594g(n0Var, "<this>");
                C87412m.m108594g(lVar, "layerBlock");
                long a = C33179k.m39964a(i, i2);
                if (aVar.mo161172a() == C33183o.Ltr || aVar.mo161173b() == 0) {
                    long a0 = n0Var.mo161165a0();
                    n0Var.mo161160j0(C33179k.m39964a(((int) (a >> 32)) + ((int) (a0 >> 32)), C33177j.m39962a(a) + C33177j.m39962a(a0)), f, lVar);
                    return;
                }
                long a2 = C33179k.m39964a((aVar.mo161173b() - ((int) (n0Var.f328781f >> 32))) - ((int) (a >> 32)), C33177j.m39962a(a));
                long a05 = n0Var.mo161165a0();
                n0Var.mo161160j0(C33179k.m39964a(((int) (a2 >> 32)) + ((int) (a05 >> 32)), C33177j.m39962a(a2) + C33177j.m39962a(a05)), f, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        /* renamed from: h */
        public static void m149308h(C109855a aVar, C109854n0 n0Var, int i, int i2, float f, C32226l<C103224b0, C13598b0> lVar, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                if ((i3 & 8) != 0) {
                    lVar = C109859o0.f328786a;
                }
                aVar.getClass();
                C87412m.m108594g(n0Var, "<this>");
                C87412m.m108594g(lVar, "layerBlock");
                long a = C33179k.m39964a(i, i2);
                long a0 = n0Var.mo161165a0();
                n0Var.mo161160j0(C33179k.m39964a(((int) (a >> 32)) + ((int) (a0 >> 32)), C33177j.m39962a(a) + C33177j.m39962a(a0)), f, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        /* renamed from: j */
        public static /* synthetic */ void m149309j(C109855a aVar, C109854n0 n0Var, long j, float f, C32226l<C103224b0, C13598b0> lVar, int i, Object obj) {
            if (obj == null) {
                float f2 = (i & 2) != 0 ? 0.0f : f;
                if ((i & 4) != 0) {
                    lVar = C109859o0.f328786a;
                }
                aVar.mo161175i(n0Var, j, f2, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        /* renamed from: a */
        public abstract C33183o mo161172a();

        /* renamed from: b */
        public abstract int mo161173b();

        /* renamed from: d */
        public final void mo161174d(C109854n0 n0Var, long j, float f) {
            C87412m.m108594g(n0Var, "$this$place");
            long a0 = n0Var.mo161165a0();
            n0Var.mo161160j0(C33179k.m39964a(((int) (j >> 32)) + ((int) (a0 >> 32)), C33177j.m39962a(j) + C33177j.m39962a(a0)), f, (C32226l<? super C103224b0, C13598b0>) null);
        }

        /* renamed from: i */
        public final void mo161175i(C109854n0 n0Var, long j, float f, C32226l<? super C103224b0, C13598b0> lVar) {
            C87412m.m108594g(n0Var, "$this$placeWithLayer");
            C87412m.m108594g(lVar, "layerBlock");
            long a0 = n0Var.mo161165a0();
            n0Var.mo161160j0(C33179k.m39964a(((int) (j >> 32)) + ((int) (a0 >> 32)), C33177j.m39962a(j) + C33177j.m39962a(a0)), f, lVar);
        }
    }

    /* renamed from: a0 */
    public final long mo161165a0() {
        int i = this.f328779d;
        long j = this.f328781f;
        return C33179k.m39964a((i - ((int) (j >> 32))) / 2, (this.f328780e - C33181m.m39966b(j)) / 2);
    }

    /* renamed from: c */
    public Object mo161166c() {
        return null;
    }

    /* renamed from: c0 */
    public int mo161167c0() {
        return C33181m.m39966b(this.f328781f);
    }

    /* renamed from: i0 */
    public int mo161168i0() {
        return (int) (this.f328781f >> 32);
    }

    /* renamed from: j0 */
    public abstract void mo161160j0(long j, float f, C32226l<? super C103224b0, C13598b0> lVar);

    /* renamed from: k0 */
    public final void mo161169k0() {
        this.f328779d = C61595o.m72297e((int) (this.f328781f >> 32), C108319b.m146699j(this.f328782g), C108319b.m146697h(this.f328782g));
        this.f328780e = C61595o.m72297e(C33181m.m39966b(this.f328781f), C108319b.m146698i(this.f328782g), C108319b.m146696g(this.f328782g));
    }

    /* renamed from: n0 */
    public final void mo161170n0(long j) {
        if (!C33181m.m39965a(this.f328781f, j)) {
            this.f328781f = j;
            mo161169k0();
        }
    }

    /* renamed from: s0 */
    public final void mo161171s0(long j) {
        if (!C108319b.m146691b(this.f328782g, j)) {
            this.f328782g = j;
            mo161169k0();
        }
    }
}
