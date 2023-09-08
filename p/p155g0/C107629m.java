package p155g0;

import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;
import my3.C61595o;
import p152f0.C107303c1;
import p735w1.C111703v;
import p735w1.C38006x;
import p735w1.C38007y;
import z04.C112550d0;

/* renamed from: g0.m */
public interface C107629m {

    /* renamed from: a */
    public static final /* synthetic */ int f322022a = 0;

    /* renamed from: g0.m$a */
    public static final class C107630a {

        /* renamed from: a */
        public static final /* synthetic */ C107630a f322023a = new C107630a();

        /* renamed from: b */
        public static final C107629m f322024b = new C107631a();

        /* renamed from: c */
        public static final C107629m f322025c = new C107636e();

        /* renamed from: d */
        public static final C107629m f322026d = new C107632b();

        /* renamed from: g0.m$a$a */
        public static final class C107631a implements C107629m {
            /* renamed from: a */
            public long mo158054a(C111703v vVar, long j, int i, boolean z, C38006x xVar) {
                C87412m.m108594g(vVar, "textLayoutResult");
                if (!C38006x.m41694b(j)) {
                    return j;
                }
                return C107638n.m145813a((int) (j >> 32), C112550d0.m153765A(vVar.f334371a.f334361a), z, xVar != null ? C38006x.m41699g(xVar.f100500a) : false);
            }
        }

        /* renamed from: g0.m$a$b */
        public static final class C107632b implements C107629m {
            /* renamed from: a */
            public long mo158054a(C111703v vVar, long j, int i, boolean z, C38006x xVar) {
                int i2;
                int i3;
                C111703v vVar2 = vVar;
                long j2 = j;
                boolean z2 = z;
                C38006x xVar2 = xVar;
                C87412m.m108594g(vVar, "textLayoutResult");
                if (xVar2 == null) {
                    return C107630a.m145805a(C107630a.f322023a, vVar, j, new C107636e.C107637a(vVar));
                }
                if (C38006x.m41694b(j)) {
                    return C107638n.m145813a((int) (j2 >> 32), C112550d0.m153765A(vVar2.f334371a.f334361a), z2, C38006x.m41699g(xVar2.f100500a));
                }
                if (z2) {
                    i3 = mo158056c(vVar, (int) (j2 >> 32), i, (int) (xVar2.f100500a >> 32), C38006x.m41695c(j), true, C38006x.m41699g(j));
                    i2 = C38006x.m41695c(j);
                } else {
                    int i4 = (int) (j2 >> 32);
                    i2 = mo158056c(vVar, C38006x.m41695c(j), i, C38006x.m41695c(xVar2.f100500a), i4, false, C38006x.m41699g(j));
                    i3 = i4;
                }
                return C38007y.m41701a(i3, i2);
            }

            /* renamed from: b */
            public final int mo158055b(C111703v vVar, int i, int i2, int i3, boolean z, boolean z2) {
                long n = vVar.mo163378n(i);
                int i4 = (int) (n >> 32);
                if (vVar.mo163369f(i4) != i2) {
                    i4 = vVar.mo163374j(i2);
                }
                int c = vVar.mo163369f(C38006x.m41695c(n)) == i2 ? C38006x.m41695c(n) : vVar.mo163367e(i2, false);
                if (i4 == i3) {
                    return c;
                }
                if (c == i3) {
                    return i4;
                }
                int i5 = (i4 + c) / 2;
                if (z ^ z2) {
                    if (i <= i5) {
                        return i4;
                    }
                } else if (i < i5) {
                    return i4;
                }
                return c;
            }

            /* renamed from: c */
            public final int mo158056c(C111703v vVar, int i, int i2, int i3, int i4, boolean z, boolean z2) {
                if (i == i2) {
                    return i3;
                }
                int f = vVar.mo163369f(i);
                if (f != vVar.mo163369f(i3)) {
                    return mo158055b(vVar, i, f, i4, z, z2);
                }
                boolean z3 = true;
                if (!(i2 == -1 || (i != i2 && (!(z ^ z2) ? i > i2 : i < i2)))) {
                    return i;
                }
                long n = vVar.mo163378n(i3);
                if (!(i3 == ((int) (n >> 32)) || i3 == C38006x.m41695c(n))) {
                    z3 = false;
                }
                return !z3 ? i : mo158055b(vVar, i, f, i4, z, z2);
            }
        }

        /* renamed from: g0.m$a$c */
        public static final class C107633c implements C107629m {
            /* renamed from: a */
            public long mo158054a(C111703v vVar, long j, int i, boolean z, C38006x xVar) {
                C87412m.m108594g(vVar, "textLayoutResult");
                return j;
            }
        }

        /* renamed from: g0.m$a$d */
        public static final class C107634d implements C107629m {

            /* renamed from: g0.m$a$d$a */
            public /* synthetic */ class C107635a extends C24565l implements C32226l<Integer, C38006x> {
                public C107635a(Object obj) {
                    super(1, obj, C107303c1.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
                }

                public Object invoke(Object obj) {
                    int intValue = ((Number) obj).intValue();
                    CharSequence charSequence = (CharSequence) this.receiver;
                    C87412m.m108594g(charSequence, "<this>");
                    int i = intValue - 1;
                    while (true) {
                        if (i <= 0) {
                            i = 0;
                            break;
                        }
                        int i2 = i - 1;
                        if (charSequence.charAt(i2) == 10) {
                            break;
                        }
                        i = i2;
                    }
                    return new C38006x(C38007y.m41701a(i, C107303c1.m145447a(charSequence, intValue)));
                }
            }

            /* renamed from: a */
            public long mo158054a(C111703v vVar, long j, int i, boolean z, C38006x xVar) {
                C87412m.m108594g(vVar, "textLayoutResult");
                return C107630a.m145805a(C107630a.f322023a, vVar, j, new C107635a(vVar.f334371a.f334361a));
            }
        }

        /* renamed from: g0.m$a$e */
        public static final class C107636e implements C107629m {

            /* renamed from: g0.m$a$e$a */
            public /* synthetic */ class C107637a extends C24565l implements C32226l<Integer, C38006x> {
                public C107637a(Object obj) {
                    super(1, obj, C111703v.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
                }

                public Object invoke(Object obj) {
                    return new C38006x(((C111703v) this.receiver).mo163378n(((Number) obj).intValue()));
                }
            }

            /* renamed from: a */
            public long mo158054a(C111703v vVar, long j, int i, boolean z, C38006x xVar) {
                C87412m.m108594g(vVar, "textLayoutResult");
                return C107630a.m145805a(C107630a.f322023a, vVar, j, new C107637a(vVar));
            }
        }

        static {
            new C107633c();
            new C107634d();
        }

        /* renamed from: a */
        public static final long m145805a(C107630a aVar, C111703v vVar, long j, C32226l lVar) {
            aVar.getClass();
            if (vVar.f334371a.f334361a.length() == 0) {
                return C38006x.f100498b;
            }
            int A = C112550d0.m153765A(vVar.f334371a.f334361a);
            int i = C38006x.f100499c;
            long j2 = ((C38006x) lVar.invoke(Integer.valueOf(C61595o.m72297e((int) (j >> 32), 0, A)))).f100500a;
            long j3 = ((C38006x) lVar.invoke(Integer.valueOf(C61595o.m72297e(C38006x.m41695c(j), 0, A)))).f100500a;
            return C38007y.m41701a(C38006x.m41699g(j) ? C38006x.m41695c(j2) : (int) (j2 >> 32), C38006x.m41699g(j) ? (int) (j3 >> 32) : C38006x.m41695c(j3));
        }
    }

    /* renamed from: a */
    long mo158054a(C111703v vVar, long j, int i, boolean z, C38006x xVar);
}
