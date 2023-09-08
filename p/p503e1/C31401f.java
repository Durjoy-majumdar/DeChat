package p503e1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p436a1.C27726j0;

/* renamed from: e1.f */
public final class C31401f {

    /* renamed from: a */
    public final List<C31381e> f84037a = new ArrayList();

    /* renamed from: b */
    public final C31402a f84038b = new C31402a(0.0f, 0.0f, 3, (C8480h) null);

    /* renamed from: c */
    public final C31402a f84039c = new C31402a(0.0f, 0.0f, 3, (C8480h) null);

    /* renamed from: d */
    public final C31402a f84040d = new C31402a(0.0f, 0.0f, 3, (C8480h) null);

    /* renamed from: e */
    public final C31402a f84041e = new C31402a(0.0f, 0.0f, 3, (C8480h) null);

    /* renamed from: e1.f$a */
    public static final class C31402a {

        /* renamed from: a */
        public float f84042a;

        /* renamed from: b */
        public float f84043b;

        public C31402a() {
            this(0.0f, 0.0f, 3, (C8480h) null);
        }

        public C31402a(float f, float f2, int i, C8480h hVar) {
            f = (i & 1) != 0 ? 0.0f : f;
            f2 = (i & 2) != 0 ? 0.0f : f2;
            this.f84042a = f;
            this.f84043b = f2;
        }

        /* renamed from: a */
        public final void mo58150a() {
            this.f84042a = 0.0f;
            this.f84043b = 0.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31402a)) {
                return false;
            }
            C31402a aVar = (C31402a) obj;
            return C87412m.m108589b(Float.valueOf(this.f84042a), Float.valueOf(aVar.f84042a)) && C87412m.m108589b(Float.valueOf(this.f84043b), Float.valueOf(aVar.f84043b));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f84042a) * 31) + Float.floatToIntBits(this.f84043b);
        }

        public String toString() {
            return "PathPoint(x=" + this.f84042a + ", y=" + this.f84043b + ')';
        }
    }

    /* JADX WARNING: type inference failed for: r13v2, types: [e1.e$m] */
    /* JADX WARNING: type inference failed for: r13v3, types: [e1.e$e] */
    /* JADX WARNING: type inference failed for: r13v6, types: [e1.e$m] */
    /* JADX WARNING: type inference failed for: r13v7, types: [e1.e$e] */
    /* JADX WARNING: type inference failed for: r10v21, types: [e1.e$m] */
    /* JADX WARNING: type inference failed for: r10v22, types: [e1.e$e] */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x03fa, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06d0, code lost:
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x075b, code lost:
        r20 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58147a(char r29, float[] r30) {
        /*
            r28 = this;
            r0 = r29
            r1 = r28
            r2 = r30
            java.util.List<e1.e> r3 = r1.f84037a
            java.lang.String r4 = "args"
            gy3.C87412m.m108594g(r2, r4)
            r4 = 122(0x7a, float:1.71E-43)
            r5 = 0
            r6 = 1
            if (r0 != r4) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            r4 = 90
            if (r0 != r4) goto L_0x001a
        L_0x0018:
            r4 = 1
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            if (r4 == 0) goto L_0x0025
            e1.e$b r0 = p503e1.C31381e.C31383b.f83985c
            java.util.List r0 = sx3.C26236u.m33719b(r0)
            goto L_0x0760
        L_0x0025:
            r4 = 109(0x6d, float:1.53E-43)
            r7 = 10
            r8 = 2
            if (r0 != r4) goto L_0x0085
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r8
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r8)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0044:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r8 = r7 + 2
            my3.j r8 = my3.C61595o.m72301i(r7, r8)
            java.util.List r8 = sx3.C110823p.m150994T(r2, r8)
            float[] r8 = sx3.C110818d0.m150950v0(r8)
            e1.e$n r9 = new e1.e$n
            r10 = r8[r5]
            r8 = r8[r6]
            r9.<init>(r10, r8)
            boolean r11 = r9 instanceof p503e1.C31381e.C31387f
            if (r11 == 0) goto L_0x0077
            if (r7 <= 0) goto L_0x0077
            e1.e$e r9 = new e1.e$e
            r9.<init>(r10, r8)
            goto L_0x007e
        L_0x0077:
            if (r7 <= 0) goto L_0x007e
            e1.e$m r9 = new e1.e$m
            r9.<init>(r10, r8)
        L_0x007e:
            r4.add(r9)
            goto L_0x0044
        L_0x0082:
            r0 = r4
            goto L_0x0760
        L_0x0085:
            r4 = 77
            if (r0 != r4) goto L_0x00df
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r8
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r8)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x00a1:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r8 = r7 + 2
            my3.j r8 = my3.C61595o.m72301i(r7, r8)
            java.util.List r8 = sx3.C110823p.m150994T(r2, r8)
            float[] r8 = sx3.C110818d0.m150950v0(r8)
            e1.e$f r9 = new e1.e$f
            r10 = r8[r5]
            r8 = r8[r6]
            r9.<init>(r10, r8)
            if (r7 <= 0) goto L_0x00d0
            e1.e$e r9 = new e1.e$e
            r9.<init>(r10, r8)
            goto L_0x00db
        L_0x00d0:
            boolean r11 = r9 instanceof p503e1.C31381e.C31395n
            if (r11 == 0) goto L_0x00db
            if (r7 <= 0) goto L_0x00db
            e1.e$m r9 = new e1.e$m
            r9.<init>(r10, r8)
        L_0x00db:
            r4.add(r9)
            goto L_0x00a1
        L_0x00df:
            r4 = 108(0x6c, float:1.51E-43)
            if (r0 != r4) goto L_0x013d
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r8
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r8)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x00fb:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r8 = r7 + 2
            my3.j r8 = my3.C61595o.m72301i(r7, r8)
            java.util.List r8 = sx3.C110823p.m150994T(r2, r8)
            float[] r8 = sx3.C110818d0.m150950v0(r8)
            e1.e$m r9 = new e1.e$m
            r10 = r8[r5]
            r8 = r8[r6]
            r9.<init>(r10, r8)
            boolean r11 = r9 instanceof p503e1.C31381e.C31387f
            if (r11 == 0) goto L_0x012e
            if (r7 <= 0) goto L_0x012e
            e1.e$e r9 = new e1.e$e
            r9.<init>(r10, r8)
            goto L_0x0139
        L_0x012e:
            boolean r11 = r9 instanceof p503e1.C31381e.C31395n
            if (r11 == 0) goto L_0x0139
            if (r7 <= 0) goto L_0x0139
            e1.e$m r9 = new e1.e$m
            r9.<init>(r10, r8)
        L_0x0139:
            r4.add(r9)
            goto L_0x00fb
        L_0x013d:
            r4 = 76
            if (r0 != r4) goto L_0x019b
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r8
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r8)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0159:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r8 = r7 + 2
            my3.j r8 = my3.C61595o.m72301i(r7, r8)
            java.util.List r8 = sx3.C110823p.m150994T(r2, r8)
            float[] r8 = sx3.C110818d0.m150950v0(r8)
            e1.e$e r9 = new e1.e$e
            r10 = r8[r5]
            r8 = r8[r6]
            r9.<init>(r10, r8)
            boolean r11 = r9 instanceof p503e1.C31381e.C31387f
            if (r11 == 0) goto L_0x018c
            if (r7 <= 0) goto L_0x018c
            e1.e$e r9 = new e1.e$e
            r9.<init>(r10, r8)
            goto L_0x0197
        L_0x018c:
            boolean r11 = r9 instanceof p503e1.C31381e.C31395n
            if (r11 == 0) goto L_0x0197
            if (r7 <= 0) goto L_0x0197
            e1.e$m r9 = new e1.e$m
            r9.<init>(r10, r8)
        L_0x0197:
            r4.add(r9)
            goto L_0x0159
        L_0x019b:
            r4 = 104(0x68, float:1.46E-43)
            if (r0 != r4) goto L_0x01fb
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r6
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r6)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x01b7:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r8 = r7 + 1
            my3.j r8 = my3.C61595o.m72301i(r7, r8)
            java.util.List r8 = sx3.C110823p.m150994T(r2, r8)
            float[] r8 = sx3.C110818d0.m150950v0(r8)
            e1.e$l r9 = new e1.e$l
            r10 = r8[r5]
            r9.<init>(r10)
            boolean r11 = r9 instanceof p503e1.C31381e.C31387f
            if (r11 == 0) goto L_0x01ea
            if (r7 <= 0) goto L_0x01ea
            e1.e$e r9 = new e1.e$e
            r7 = r8[r6]
            r9.<init>(r10, r7)
            goto L_0x01f7
        L_0x01ea:
            boolean r11 = r9 instanceof p503e1.C31381e.C31395n
            if (r11 == 0) goto L_0x01f7
            if (r7 <= 0) goto L_0x01f7
            e1.e$m r9 = new e1.e$m
            r7 = r8[r6]
            r9.<init>(r10, r7)
        L_0x01f7:
            r4.add(r9)
            goto L_0x01b7
        L_0x01fb:
            r4 = 72
            if (r0 != r4) goto L_0x025b
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r6
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r6)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0217:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r8 = r7 + 1
            my3.j r8 = my3.C61595o.m72301i(r7, r8)
            java.util.List r8 = sx3.C110823p.m150994T(r2, r8)
            float[] r8 = sx3.C110818d0.m150950v0(r8)
            e1.e$d r9 = new e1.e$d
            r10 = r8[r5]
            r9.<init>(r10)
            boolean r11 = r9 instanceof p503e1.C31381e.C31387f
            if (r11 == 0) goto L_0x024a
            if (r7 <= 0) goto L_0x024a
            e1.e$e r9 = new e1.e$e
            r7 = r8[r6]
            r9.<init>(r10, r7)
            goto L_0x0257
        L_0x024a:
            boolean r11 = r9 instanceof p503e1.C31381e.C31395n
            if (r11 == 0) goto L_0x0257
            if (r7 <= 0) goto L_0x0257
            e1.e$m r9 = new e1.e$m
            r7 = r8[r6]
            r9.<init>(r10, r7)
        L_0x0257:
            r4.add(r9)
            goto L_0x0217
        L_0x025b:
            r4 = 118(0x76, float:1.65E-43)
            if (r0 != r4) goto L_0x02bb
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r6
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r6)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0277:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r8 = r7 + 1
            my3.j r8 = my3.C61595o.m72301i(r7, r8)
            java.util.List r8 = sx3.C110823p.m150994T(r2, r8)
            float[] r8 = sx3.C110818d0.m150950v0(r8)
            e1.e$r r9 = new e1.e$r
            r10 = r8[r5]
            r9.<init>(r10)
            boolean r11 = r9 instanceof p503e1.C31381e.C31387f
            if (r11 == 0) goto L_0x02aa
            if (r7 <= 0) goto L_0x02aa
            e1.e$e r9 = new e1.e$e
            r7 = r8[r6]
            r9.<init>(r10, r7)
            goto L_0x02b7
        L_0x02aa:
            boolean r11 = r9 instanceof p503e1.C31381e.C31395n
            if (r11 == 0) goto L_0x02b7
            if (r7 <= 0) goto L_0x02b7
            e1.e$m r9 = new e1.e$m
            r7 = r8[r6]
            r9.<init>(r10, r7)
        L_0x02b7:
            r4.add(r9)
            goto L_0x0277
        L_0x02bb:
            r4 = 86
            if (r0 != r4) goto L_0x031b
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r6
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r6)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x02d7:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r8 = r7 + 1
            my3.j r8 = my3.C61595o.m72301i(r7, r8)
            java.util.List r8 = sx3.C110823p.m150994T(r2, r8)
            float[] r8 = sx3.C110818d0.m150950v0(r8)
            e1.e$s r9 = new e1.e$s
            r10 = r8[r5]
            r9.<init>(r10)
            boolean r11 = r9 instanceof p503e1.C31381e.C31387f
            if (r11 == 0) goto L_0x030a
            if (r7 <= 0) goto L_0x030a
            e1.e$e r9 = new e1.e$e
            r7 = r8[r6]
            r9.<init>(r10, r7)
            goto L_0x0317
        L_0x030a:
            boolean r11 = r9 instanceof p503e1.C31381e.C31395n
            if (r11 == 0) goto L_0x0317
            if (r7 <= 0) goto L_0x0317
            e1.e$m r9 = new e1.e$m
            r7 = r8[r6]
            r9.<init>(r10, r7)
        L_0x0317:
            r4.add(r9)
            goto L_0x02d7
        L_0x031b:
            r4 = 99
            r9 = 5
            r10 = 6
            r11 = 3
            r12 = 4
            if (r0 != r4) goto L_0x0392
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r10
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r10)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x033b:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r10 = r7 + 6
            my3.j r10 = my3.C61595o.m72301i(r7, r10)
            java.util.List r10 = sx3.C110823p.m150994T(r2, r10)
            float[] r10 = sx3.C110818d0.m150950v0(r10)
            e1.e$k r15 = new e1.e$k
            r14 = r10[r5]
            r13 = r10[r6]
            r16 = r10[r8]
            r17 = r10[r11]
            r18 = r10[r12]
            r19 = r10[r9]
            r10 = r13
            r13 = r15
            r29 = r14
            r9 = r15
            r15 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19)
            boolean r13 = r9 instanceof p503e1.C31381e.C31387f
            if (r13 == 0) goto L_0x037e
            if (r7 <= 0) goto L_0x037e
            e1.e$e r15 = new e1.e$e
            r13 = r29
            r15.<init>(r13, r10)
            goto L_0x038d
        L_0x037e:
            r13 = r29
            boolean r14 = r9 instanceof p503e1.C31381e.C31395n
            if (r14 == 0) goto L_0x038c
            if (r7 <= 0) goto L_0x038c
            e1.e$m r15 = new e1.e$m
            r15.<init>(r13, r10)
            goto L_0x038d
        L_0x038c:
            r15 = r9
        L_0x038d:
            r4.add(r15)
            r9 = 5
            goto L_0x033b
        L_0x0392:
            r4 = 67
            if (r0 != r4) goto L_0x03ff
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r10
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r10)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x03ae:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r9 = r7 + 6
            my3.j r9 = my3.C61595o.m72301i(r7, r9)
            java.util.List r9 = sx3.C110823p.m150994T(r2, r9)
            float[] r9 = sx3.C110818d0.m150950v0(r9)
            e1.e$c r10 = new e1.e$c
            r15 = r9[r5]
            r14 = r9[r6]
            r16 = r9[r8]
            r17 = r9[r11]
            r18 = r9[r12]
            r13 = 5
            r19 = r9[r13]
            r13 = r10
            r9 = r14
            r14 = r15
            r11 = r15
            r15 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19)
            boolean r13 = r10 instanceof p503e1.C31381e.C31387f
            if (r13 == 0) goto L_0x03ef
            if (r7 <= 0) goto L_0x03ef
            e1.e$e r10 = new e1.e$e
            r10.<init>(r11, r9)
            goto L_0x03fa
        L_0x03ef:
            boolean r13 = r10 instanceof p503e1.C31381e.C31395n
            if (r13 == 0) goto L_0x03fa
            if (r7 <= 0) goto L_0x03fa
            e1.e$m r10 = new e1.e$m
            r10.<init>(r11, r9)
        L_0x03fa:
            r4.add(r10)
            r11 = 3
            goto L_0x03ae
        L_0x03ff:
            r4 = 115(0x73, float:1.61E-43)
            if (r0 != r4) goto L_0x0462
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r12
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r12)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x041b:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r9 = r7 + 4
            my3.j r9 = my3.C61595o.m72301i(r7, r9)
            java.util.List r9 = sx3.C110823p.m150994T(r2, r9)
            float[] r9 = sx3.C110818d0.m150950v0(r9)
            e1.e$p r10 = new e1.e$p
            r11 = r9[r5]
            r12 = r9[r6]
            r13 = r9[r8]
            r14 = 3
            r9 = r9[r14]
            r10.<init>(r11, r12, r13, r9)
            boolean r9 = r10 instanceof p503e1.C31381e.C31387f
            if (r9 == 0) goto L_0x0453
            if (r7 <= 0) goto L_0x0453
            e1.e$e r10 = new e1.e$e
            r10.<init>(r11, r12)
            goto L_0x045e
        L_0x0453:
            boolean r9 = r10 instanceof p503e1.C31381e.C31395n
            if (r9 == 0) goto L_0x045e
            if (r7 <= 0) goto L_0x045e
            e1.e$m r10 = new e1.e$m
            r10.<init>(r11, r12)
        L_0x045e:
            r4.add(r10)
            goto L_0x041b
        L_0x0462:
            r4 = 83
            if (r0 != r4) goto L_0x04c5
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r12
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r12)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x047e:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r9 = r7 + 4
            my3.j r9 = my3.C61595o.m72301i(r7, r9)
            java.util.List r9 = sx3.C110823p.m150994T(r2, r9)
            float[] r9 = sx3.C110818d0.m150950v0(r9)
            e1.e$h r10 = new e1.e$h
            r11 = r9[r5]
            r12 = r9[r6]
            r13 = r9[r8]
            r14 = 3
            r9 = r9[r14]
            r10.<init>(r11, r12, r13, r9)
            boolean r9 = r10 instanceof p503e1.C31381e.C31387f
            if (r9 == 0) goto L_0x04b6
            if (r7 <= 0) goto L_0x04b6
            e1.e$e r10 = new e1.e$e
            r10.<init>(r11, r12)
            goto L_0x04c1
        L_0x04b6:
            boolean r9 = r10 instanceof p503e1.C31381e.C31395n
            if (r9 == 0) goto L_0x04c1
            if (r7 <= 0) goto L_0x04c1
            e1.e$m r10 = new e1.e$m
            r10.<init>(r11, r12)
        L_0x04c1:
            r4.add(r10)
            goto L_0x047e
        L_0x04c5:
            r4 = 113(0x71, float:1.58E-43)
            if (r0 != r4) goto L_0x0528
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r12
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r12)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x04e1:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r9 = r7 + 4
            my3.j r9 = my3.C61595o.m72301i(r7, r9)
            java.util.List r9 = sx3.C110823p.m150994T(r2, r9)
            float[] r9 = sx3.C110818d0.m150950v0(r9)
            e1.e$o r10 = new e1.e$o
            r11 = r9[r5]
            r12 = r9[r6]
            r13 = r9[r8]
            r14 = 3
            r9 = r9[r14]
            r10.<init>(r11, r12, r13, r9)
            boolean r9 = r10 instanceof p503e1.C31381e.C31387f
            if (r9 == 0) goto L_0x0519
            if (r7 <= 0) goto L_0x0519
            e1.e$e r10 = new e1.e$e
            r10.<init>(r11, r12)
            goto L_0x0524
        L_0x0519:
            boolean r9 = r10 instanceof p503e1.C31381e.C31395n
            if (r9 == 0) goto L_0x0524
            if (r7 <= 0) goto L_0x0524
            e1.e$m r10 = new e1.e$m
            r10.<init>(r11, r12)
        L_0x0524:
            r4.add(r10)
            goto L_0x04e1
        L_0x0528:
            r4 = 81
            if (r0 != r4) goto L_0x058b
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r12
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r12)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0544:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r9 = r7 + 4
            my3.j r9 = my3.C61595o.m72301i(r7, r9)
            java.util.List r9 = sx3.C110823p.m150994T(r2, r9)
            float[] r9 = sx3.C110818d0.m150950v0(r9)
            e1.e$g r10 = new e1.e$g
            r11 = r9[r5]
            r12 = r9[r6]
            r13 = r9[r8]
            r14 = 3
            r9 = r9[r14]
            r10.<init>(r11, r12, r13, r9)
            boolean r9 = r10 instanceof p503e1.C31381e.C31387f
            if (r9 == 0) goto L_0x057c
            if (r7 <= 0) goto L_0x057c
            e1.e$e r10 = new e1.e$e
            r10.<init>(r11, r12)
            goto L_0x0587
        L_0x057c:
            boolean r9 = r10 instanceof p503e1.C31381e.C31395n
            if (r9 == 0) goto L_0x0587
            if (r7 <= 0) goto L_0x0587
            e1.e$m r10 = new e1.e$m
            r10.<init>(r11, r12)
        L_0x0587:
            r4.add(r10)
            goto L_0x0544
        L_0x058b:
            r4 = 116(0x74, float:1.63E-43)
            if (r0 != r4) goto L_0x05e9
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r8
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r8)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x05a7:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r8 = r7 + 2
            my3.j r8 = my3.C61595o.m72301i(r7, r8)
            java.util.List r8 = sx3.C110823p.m150994T(r2, r8)
            float[] r8 = sx3.C110818d0.m150950v0(r8)
            e1.e$q r9 = new e1.e$q
            r10 = r8[r5]
            r8 = r8[r6]
            r9.<init>(r10, r8)
            boolean r11 = r9 instanceof p503e1.C31381e.C31387f
            if (r11 == 0) goto L_0x05da
            if (r7 <= 0) goto L_0x05da
            e1.e$e r9 = new e1.e$e
            r9.<init>(r10, r8)
            goto L_0x05e5
        L_0x05da:
            boolean r11 = r9 instanceof p503e1.C31381e.C31395n
            if (r11 == 0) goto L_0x05e5
            if (r7 <= 0) goto L_0x05e5
            e1.e$m r9 = new e1.e$m
            r9.<init>(r10, r8)
        L_0x05e5:
            r4.add(r9)
            goto L_0x05a7
        L_0x05e9:
            r4 = 84
            if (r0 != r4) goto L_0x0647
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r8
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r8)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0605:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r8 = r7 + 2
            my3.j r8 = my3.C61595o.m72301i(r7, r8)
            java.util.List r8 = sx3.C110823p.m150994T(r2, r8)
            float[] r8 = sx3.C110818d0.m150950v0(r8)
            e1.e$i r9 = new e1.e$i
            r10 = r8[r5]
            r8 = r8[r6]
            r9.<init>(r10, r8)
            boolean r11 = r9 instanceof p503e1.C31381e.C31387f
            if (r11 == 0) goto L_0x0638
            if (r7 <= 0) goto L_0x0638
            e1.e$e r9 = new e1.e$e
            r9.<init>(r10, r8)
            goto L_0x0643
        L_0x0638:
            boolean r11 = r9 instanceof p503e1.C31381e.C31395n
            if (r11 == 0) goto L_0x0643
            if (r7 <= 0) goto L_0x0643
            e1.e$m r9 = new e1.e$m
            r9.<init>(r10, r8)
        L_0x0643:
            r4.add(r9)
            goto L_0x0605
        L_0x0647:
            r4 = 97
            r9 = 0
            r11 = 7
            if (r0 != r4) goto L_0x06d4
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r11
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r11)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0665:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r11 = r7 + 7
            my3.j r11 = my3.C61595o.m72301i(r7, r11)
            java.util.List r11 = sx3.C110823p.m150994T(r2, r11)
            float[] r11 = sx3.C110818d0.m150950v0(r11)
            e1.e$j r13 = new e1.e$j
            r21 = r11[r5]
            r22 = r11[r6]
            r23 = r11[r8]
            r14 = 3
            r15 = r11[r14]
            int r14 = java.lang.Float.compare(r15, r9)
            if (r14 == 0) goto L_0x0697
            r24 = 1
            goto L_0x0699
        L_0x0697:
            r24 = 0
        L_0x0699:
            r14 = r11[r12]
            int r14 = java.lang.Float.compare(r14, r9)
            if (r14 == 0) goto L_0x06a5
            r14 = 5
            r25 = 1
            goto L_0x06a8
        L_0x06a5:
            r14 = 5
            r25 = 0
        L_0x06a8:
            r26 = r11[r14]
            r27 = r11[r10]
            r20 = r13
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            boolean r14 = r13 instanceof p503e1.C31381e.C31387f
            if (r14 == 0) goto L_0x06c1
            if (r7 <= 0) goto L_0x06c1
            e1.e$e r13 = new e1.e$e
            r7 = r11[r5]
            r11 = r11[r6]
            r13.<init>(r7, r11)
            goto L_0x06d0
        L_0x06c1:
            boolean r14 = r13 instanceof p503e1.C31381e.C31395n
            if (r14 == 0) goto L_0x06d0
            if (r7 <= 0) goto L_0x06d0
            e1.e$m r13 = new e1.e$m
            r7 = r11[r5]
            r11 = r11[r6]
            r13.<init>(r7, r11)
        L_0x06d0:
            r4.add(r13)
            goto L_0x0665
        L_0x06d4:
            r4 = 65
            if (r0 != r4) goto L_0x0766
            my3.j r0 = new my3.j
            int r4 = r2.length
            int r4 = r4 - r11
            r0.<init>(r5, r4)
            my3.h r0 = my3.C61595o.m72300h(r0, r11)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x06f0:
            r7 = r0
            my3.i r7 = (my3.C34690i) r7
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L_0x0082
            r7 = r0
            sx3.l0 r7 = (sx3.C36904l0) r7
            int r7 = r7.mo59695a()
            int r11 = r7 + 7
            my3.j r11 = my3.C61595o.m72301i(r7, r11)
            java.util.List r11 = sx3.C110823p.m150994T(r2, r11)
            float[] r11 = sx3.C110818d0.m150950v0(r11)
            e1.e$a r13 = new e1.e$a
            r21 = r11[r5]
            r22 = r11[r6]
            r23 = r11[r8]
            r14 = 3
            r15 = r11[r14]
            int r15 = java.lang.Float.compare(r15, r9)
            if (r15 == 0) goto L_0x0722
            r24 = 1
            goto L_0x0724
        L_0x0722:
            r24 = 0
        L_0x0724:
            r15 = r11[r12]
            int r15 = java.lang.Float.compare(r15, r9)
            if (r15 == 0) goto L_0x0730
            r15 = 5
            r25 = 1
            goto L_0x0733
        L_0x0730:
            r15 = 5
            r25 = 0
        L_0x0733:
            r26 = r11[r15]
            r27 = r11[r10]
            r20 = r13
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            boolean r8 = r13 instanceof p503e1.C31381e.C31387f
            if (r8 == 0) goto L_0x074c
            if (r7 <= 0) goto L_0x074c
            e1.e$e r13 = new e1.e$e
            r7 = r11[r5]
            r8 = r11[r6]
            r13.<init>(r7, r8)
            goto L_0x075b
        L_0x074c:
            boolean r8 = r13 instanceof p503e1.C31381e.C31395n
            if (r8 == 0) goto L_0x075b
            if (r7 <= 0) goto L_0x075b
            e1.e$m r13 = new e1.e$m
            r7 = r11[r5]
            r8 = r11[r6]
            r13.<init>(r7, r8)
        L_0x075b:
            r4.add(r13)
            r8 = 2
            goto L_0x06f0
        L_0x0760:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.addAll(r0)
            return
        L_0x0766:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown command for: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p503e1.C31401f.mo58147a(char, float[]):void");
    }

    /* renamed from: b */
    public final void mo58148b(C27726j0 j0Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d15 = d;
        double d16 = d3;
        double d17 = d5;
        boolean z3 = z2;
        double d18 = (d7 / ((double) 180)) * 3.141592653589793d;
        double cos = Math.cos(d18);
        double sin = Math.sin(d18);
        double d19 = ((d15 * cos) + (d2 * sin)) / d17;
        double d25 = (((-d15) * sin) + (d2 * cos)) / d6;
        double d26 = ((d16 * cos) + (d4 * sin)) / d17;
        double d27 = (((-d16) * sin) + (d4 * cos)) / d6;
        double d28 = d19 - d26;
        double d29 = d25 - d27;
        double d35 = (double) 2;
        double d36 = (d19 + d26) / d35;
        double d37 = (d25 + d27) / d35;
        double d38 = (d28 * d28) + (d29 * d29);
        if (!(d38 == 0.0d)) {
            double d39 = (1.0d / d38) - 0.25d;
            if (d39 < 0.0d) {
                double sqrt = (double) ((float) (Math.sqrt(d38) / 1.99999d));
                mo58148b(j0Var, d, d2, d3, d4, d17 * sqrt, d6 * sqrt, d7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d39);
            double d44 = d28 * sqrt2;
            double d45 = sqrt2 * d29;
            double d46 = d35;
            boolean z4 = z2;
            if (z == z4) {
                d9 = d36 - d45;
                d8 = d37 + d44;
            } else {
                d9 = d36 + d45;
                d8 = d37 - d44;
            }
            double atan2 = Math.atan2(d25 - d8, d19 - d9);
            double atan22 = Math.atan2(d27 - d8, d26 - d9) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z4 != (i >= 0)) {
                atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d47 = d9 * d17;
            double d48 = d8 * d6;
            double d49 = (d47 * cos) - (d48 * sin);
            double d54 = (d47 * sin) + (d48 * cos);
            double d55 = (double) 4;
            int ceil = (int) Math.ceil(Math.abs((atan22 * d55) / 3.141592653589793d));
            double cos2 = Math.cos(d18);
            double sin2 = Math.sin(d18);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d56 = atan2;
            double d57 = -d17;
            double d58 = d57 * cos2;
            double d59 = d6 * sin2;
            double d64 = (d58 * sin3) - (d59 * cos3);
            double d65 = d57 * sin2;
            double d66 = d6 * cos2;
            double d67 = (sin3 * d65) + (cos3 * d66);
            double d68 = d55;
            double d69 = atan22 / ((double) ceil);
            double d74 = d;
            double d75 = d67;
            double d76 = d64;
            int i2 = 0;
            double d77 = d2;
            double d78 = d56;
            while (i2 < ceil) {
                double d79 = d78 + d69;
                double sin4 = Math.sin(d79);
                double cos4 = Math.cos(d79);
                double d84 = d69;
                double d85 = (d49 + ((d17 * cos2) * cos4)) - (d59 * sin4);
                double d86 = d54 + (d17 * sin2 * cos4) + (d66 * sin4);
                double d87 = (d58 * sin4) - (d59 * cos4);
                double d88 = (sin4 * d65) + (cos4 * d66);
                double d89 = d79 - d78;
                double tan = Math.tan(d89 / d46);
                double sin5 = (Math.sin(d89) * (Math.sqrt(d68 + ((3.0d * tan) * tan)) - ((double) 1))) / ((double) 3);
                j0Var.mo55576b((float) (d74 + (d76 * sin5)), (float) (d77 + (d75 * sin5)), (float) (d85 - (sin5 * d87)), (float) (d86 - (sin5 * d88)), (float) d85, (float) d86);
                i2++;
                sin2 = sin2;
                d65 = d65;
                d77 = d86;
                d74 = d85;
                ceil = ceil;
                d78 = d79;
                d75 = d88;
                d76 = d87;
                d69 = d84;
                d17 = d5;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: e1.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p436a1.C27726j0 mo58149c(p436a1.C27726j0 r28) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            java.lang.String r2 = "target"
            gy3.C87412m.m108594g(r0, r2)
            r28.reset()
            e1.f$a r2 = r1.f84038b
            r2.mo58150a()
            e1.f$a r2 = r1.f84039c
            r2.mo58150a()
            e1.f$a r2 = r1.f84040d
            r2.mo58150a()
            e1.f$a r2 = r1.f84041e
            r2.mo58150a()
            java.util.List<e1.e> r2 = r1.f84037a
            r14 = r2
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r15 = r14.size()
            r2 = 0
            r3 = 0
            r12 = 0
        L_0x002c:
            if (r12 >= r15) goto L_0x043e
            java.lang.Object r3 = r14.get(r12)
            r13 = r3
            e1.e r13 = (p503e1.C31381e) r13
            if (r2 != 0) goto L_0x0038
            r2 = r13
        L_0x0038:
            boolean r3 = r13 instanceof p503e1.C31381e.C31383b
            if (r3 == 0) goto L_0x0069
            e1.f$a r2 = r1.f84038b
            e1.f$a r3 = r1.f84040d
            float r4 = r3.f84042a
            r2.f84042a = r4
            float r4 = r3.f84043b
            r2.f84043b = r4
            e1.f$a r2 = r1.f84039c
            float r4 = r3.f84042a
            r2.f84042a = r4
            float r3 = r3.f84043b
            r2.f84043b = r3
            r28.close()
            e1.f$a r2 = r1.f84038b
            float r3 = r2.f84042a
            float r2 = r2.f84043b
            r0.mo55575a(r3, r2)
        L_0x005e:
            r0 = r1
            r21 = r12
            r20 = r13
            r24 = r14
            r23 = r15
            goto L_0x0431
        L_0x0069:
            boolean r3 = r13 instanceof p503e1.C31381e.C31395n
            if (r3 == 0) goto L_0x0090
            r2 = r13
            e1.e$n r2 = (p503e1.C31381e.C31395n) r2
            e1.f$a r3 = r1.f84038b
            float r4 = r3.f84042a
            float r5 = r2.f84023c
            float r4 = r4 + r5
            r3.f84042a = r4
            float r4 = r3.f84043b
            float r2 = r2.f84024d
            float r4 = r4 + r2
            r3.f84043b = r4
            r0.mo55588l(r5, r2)
            e1.f$a r2 = r1.f84040d
            e1.f$a r3 = r1.f84038b
            float r4 = r3.f84042a
            r2.f84042a = r4
            float r3 = r3.f84043b
            r2.f84043b = r3
            goto L_0x005e
        L_0x0090:
            boolean r3 = r13 instanceof p503e1.C31381e.C31387f
            if (r3 == 0) goto L_0x00b1
            r2 = r13
            e1.e$f r2 = (p503e1.C31381e.C31387f) r2
            e1.f$a r3 = r1.f84038b
            float r4 = r2.f83995c
            r3.f84042a = r4
            float r2 = r2.f83996d
            r3.f84043b = r2
            r0.mo55575a(r4, r2)
            e1.f$a r2 = r1.f84040d
            e1.f$a r3 = r1.f84038b
            float r4 = r3.f84042a
            r2.f84042a = r4
            float r3 = r3.f84043b
            r2.f84043b = r3
            goto L_0x005e
        L_0x00b1:
            boolean r3 = r13 instanceof p503e1.C31381e.C31394m
            if (r3 == 0) goto L_0x00d0
            r2 = r13
            e1.e$m r2 = (p503e1.C31381e.C31394m) r2
            float r3 = r2.f84021c
            float r4 = r2.f84022d
            r0.mo55587k(r3, r4)
            e1.f$a r3 = r1.f84038b
            float r4 = r3.f84042a
            float r5 = r2.f84021c
            float r4 = r4 + r5
            r3.f84042a = r4
            float r4 = r3.f84043b
            float r2 = r2.f84022d
            float r4 = r4 + r2
            r3.f84043b = r4
            goto L_0x005e
        L_0x00d0:
            boolean r3 = r13 instanceof p503e1.C31381e.C31386e
            if (r3 == 0) goto L_0x00ea
            r2 = r13
            e1.e$e r2 = (p503e1.C31381e.C31386e) r2
            float r3 = r2.f83993c
            float r4 = r2.f83994d
            r0.mo55577c(r3, r4)
            e1.f$a r3 = r1.f84038b
            float r4 = r2.f83993c
            r3.f84042a = r4
            float r2 = r2.f83994d
            r3.f84043b = r2
            goto L_0x005e
        L_0x00ea:
            boolean r3 = r13 instanceof p503e1.C31381e.C31393l
            r4 = 0
            if (r3 == 0) goto L_0x0102
            r2 = r13
            e1.e$l r2 = (p503e1.C31381e.C31393l) r2
            float r3 = r2.f84020c
            r0.mo55587k(r3, r4)
            e1.f$a r3 = r1.f84038b
            float r4 = r3.f84042a
            float r2 = r2.f84020c
            float r4 = r4 + r2
            r3.f84042a = r4
            goto L_0x005e
        L_0x0102:
            boolean r3 = r13 instanceof p503e1.C31381e.C31385d
            if (r3 == 0) goto L_0x011a
            r2 = r13
            e1.e$d r2 = (p503e1.C31381e.C31385d) r2
            float r3 = r2.f83992c
            e1.f$a r4 = r1.f84038b
            float r4 = r4.f84043b
            r0.mo55577c(r3, r4)
            e1.f$a r3 = r1.f84038b
            float r2 = r2.f83992c
            r3.f84042a = r2
            goto L_0x005e
        L_0x011a:
            boolean r3 = r13 instanceof p503e1.C31381e.C31399r
            if (r3 == 0) goto L_0x0131
            r2 = r13
            e1.e$r r2 = (p503e1.C31381e.C31399r) r2
            float r3 = r2.f84035c
            r0.mo55587k(r4, r3)
            e1.f$a r3 = r1.f84038b
            float r4 = r3.f84043b
            float r2 = r2.f84035c
            float r4 = r4 + r2
            r3.f84043b = r4
            goto L_0x005e
        L_0x0131:
            boolean r3 = r13 instanceof p503e1.C31381e.C31400s
            if (r3 == 0) goto L_0x0149
            r2 = r13
            e1.e$s r2 = (p503e1.C31381e.C31400s) r2
            e1.f$a r3 = r1.f84038b
            float r3 = r3.f84042a
            float r4 = r2.f84036c
            r0.mo55577c(r3, r4)
            e1.f$a r3 = r1.f84038b
            float r2 = r2.f84036c
            r3.f84043b = r2
            goto L_0x005e
        L_0x0149:
            boolean r3 = r13 instanceof p503e1.C31381e.C31392k
            if (r3 == 0) goto L_0x0183
            r9 = r13
            e1.e$k r9 = (p503e1.C31381e.C31392k) r9
            float r3 = r9.f84014c
            float r4 = r9.f84015d
            float r5 = r9.f84016e
            float r6 = r9.f84017f
            float r7 = r9.f84018g
            float r8 = r9.f84019h
            r2 = r28
            r2.mo55589m(r3, r4, r5, r6, r7, r8)
            e1.f$a r2 = r1.f84039c
            e1.f$a r3 = r1.f84038b
            float r4 = r3.f84042a
            float r5 = r9.f84016e
            float r4 = r4 + r5
            r2.f84042a = r4
            float r4 = r3.f84043b
            float r5 = r9.f84017f
            float r4 = r4 + r5
            r2.f84043b = r4
            float r2 = r3.f84042a
            float r4 = r9.f84018g
            float r2 = r2 + r4
            r3.f84042a = r2
            float r2 = r3.f84043b
            float r4 = r9.f84019h
            float r2 = r2 + r4
            r3.f84043b = r2
            goto L_0x005e
        L_0x0183:
            boolean r3 = r13 instanceof p503e1.C31381e.C31384c
            if (r3 == 0) goto L_0x01b1
            r9 = r13
            e1.e$c r9 = (p503e1.C31381e.C31384c) r9
            float r3 = r9.f83986c
            float r4 = r9.f83987d
            float r5 = r9.f83988e
            float r6 = r9.f83989f
            float r7 = r9.f83990g
            float r8 = r9.f83991h
            r2 = r28
            r2.mo55576b(r3, r4, r5, r6, r7, r8)
            e1.f$a r2 = r1.f84039c
            float r3 = r9.f83988e
            r2.f84042a = r3
            float r3 = r9.f83989f
            r2.f84043b = r3
            e1.f$a r2 = r1.f84038b
            float r3 = r9.f83990g
            r2.f84042a = r3
            float r3 = r9.f83991h
            r2.f84043b = r3
            goto L_0x005e
        L_0x01b1:
            boolean r3 = r13 instanceof p503e1.C31381e.C31397p
            if (r3 == 0) goto L_0x020e
            r9 = r13
            e1.e$p r9 = (p503e1.C31381e.C31397p) r9
            gy3.C87412m.m108591d(r2)
            boolean r2 = r2.f83976a
            if (r2 == 0) goto L_0x01d4
            e1.f$a r2 = r1.f84041e
            e1.f$a r3 = r1.f84038b
            float r4 = r3.f84042a
            e1.f$a r5 = r1.f84039c
            float r6 = r5.f84042a
            float r4 = r4 - r6
            r2.f84042a = r4
            float r3 = r3.f84043b
            float r4 = r5.f84043b
            float r3 = r3 - r4
            r2.f84043b = r3
            goto L_0x01d9
        L_0x01d4:
            e1.f$a r2 = r1.f84041e
            r2.mo58150a()
        L_0x01d9:
            e1.f$a r2 = r1.f84041e
            float r3 = r2.f84042a
            float r4 = r2.f84043b
            float r5 = r9.f84029c
            float r6 = r9.f84030d
            float r7 = r9.f84031e
            float r8 = r9.f84032f
            r2 = r28
            r2.mo55589m(r3, r4, r5, r6, r7, r8)
            e1.f$a r2 = r1.f84039c
            e1.f$a r3 = r1.f84038b
            float r4 = r3.f84042a
            float r5 = r9.f84029c
            float r4 = r4 + r5
            r2.f84042a = r4
            float r4 = r3.f84043b
            float r5 = r9.f84030d
            float r4 = r4 + r5
            r2.f84043b = r4
            float r2 = r3.f84042a
            float r4 = r9.f84031e
            float r2 = r2 + r4
            r3.f84042a = r2
            float r2 = r3.f84043b
            float r4 = r9.f84032f
            float r2 = r2 + r4
            r3.f84043b = r2
            goto L_0x005e
        L_0x020e:
            boolean r3 = r13 instanceof p503e1.C31381e.C31389h
            r4 = 2
            if (r3 == 0) goto L_0x026c
            r9 = r13
            e1.e$h r9 = (p503e1.C31381e.C31389h) r9
            gy3.C87412m.m108591d(r2)
            boolean r2 = r2.f83976a
            if (r2 == 0) goto L_0x0237
            e1.f$a r2 = r1.f84041e
            float r3 = (float) r4
            e1.f$a r4 = r1.f84038b
            float r5 = r4.f84042a
            float r5 = r5 * r3
            e1.f$a r6 = r1.f84039c
            float r7 = r6.f84042a
            float r5 = r5 - r7
            r2.f84042a = r5
            float r4 = r4.f84043b
            float r3 = r3 * r4
            float r4 = r6.f84043b
            float r3 = r3 - r4
            r2.f84043b = r3
            goto L_0x0243
        L_0x0237:
            e1.f$a r2 = r1.f84041e
            e1.f$a r3 = r1.f84038b
            float r4 = r3.f84042a
            r2.f84042a = r4
            float r3 = r3.f84043b
            r2.f84043b = r3
        L_0x0243:
            e1.f$a r2 = r1.f84041e
            float r3 = r2.f84042a
            float r4 = r2.f84043b
            float r5 = r9.f84001c
            float r6 = r9.f84002d
            float r7 = r9.f84003e
            float r8 = r9.f84004f
            r2 = r28
            r2.mo55576b(r3, r4, r5, r6, r7, r8)
            e1.f$a r2 = r1.f84039c
            float r3 = r9.f84001c
            r2.f84042a = r3
            float r3 = r9.f84002d
            r2.f84043b = r3
            e1.f$a r2 = r1.f84038b
            float r3 = r9.f84003e
            r2.f84042a = r3
            float r3 = r9.f84004f
            r2.f84043b = r3
            goto L_0x005e
        L_0x026c:
            boolean r3 = r13 instanceof p503e1.C31381e.C31396o
            if (r3 == 0) goto L_0x02a0
            r2 = r13
            e1.e$o r2 = (p503e1.C31381e.C31396o) r2
            float r3 = r2.f84025c
            float r4 = r2.f84026d
            float r5 = r2.f84027e
            float r6 = r2.f84028f
            r0.mo55579d(r3, r4, r5, r6)
            e1.f$a r3 = r1.f84039c
            e1.f$a r4 = r1.f84038b
            float r5 = r4.f84042a
            float r6 = r2.f84025c
            float r5 = r5 + r6
            r3.f84042a = r5
            float r5 = r4.f84043b
            float r6 = r2.f84026d
            float r5 = r5 + r6
            r3.f84043b = r5
            float r3 = r4.f84042a
            float r5 = r2.f84027e
            float r3 = r3 + r5
            r4.f84042a = r3
            float r3 = r4.f84043b
            float r2 = r2.f84028f
            float r3 = r3 + r2
            r4.f84043b = r3
            goto L_0x005e
        L_0x02a0:
            boolean r3 = r13 instanceof p503e1.C31381e.C31388g
            if (r3 == 0) goto L_0x02c8
            r2 = r13
            e1.e$g r2 = (p503e1.C31381e.C31388g) r2
            float r3 = r2.f83997c
            float r4 = r2.f83998d
            float r5 = r2.f83999e
            float r6 = r2.f84000f
            r0.mo55584i(r3, r4, r5, r6)
            e1.f$a r3 = r1.f84039c
            float r4 = r2.f83997c
            r3.f84042a = r4
            float r4 = r2.f83998d
            r3.f84043b = r4
            e1.f$a r3 = r1.f84038b
            float r4 = r2.f83999e
            r3.f84042a = r4
            float r2 = r2.f84000f
            r3.f84043b = r2
            goto L_0x005e
        L_0x02c8:
            boolean r3 = r13 instanceof p503e1.C31381e.C31398q
            if (r3 == 0) goto L_0x0321
            r3 = r13
            e1.e$q r3 = (p503e1.C31381e.C31398q) r3
            gy3.C87412m.m108591d(r2)
            boolean r2 = r2.f83977b
            if (r2 == 0) goto L_0x02eb
            e1.f$a r2 = r1.f84041e
            e1.f$a r4 = r1.f84038b
            float r5 = r4.f84042a
            e1.f$a r6 = r1.f84039c
            float r7 = r6.f84042a
            float r5 = r5 - r7
            r2.f84042a = r5
            float r4 = r4.f84043b
            float r5 = r6.f84043b
            float r4 = r4 - r5
            r2.f84043b = r4
            goto L_0x02f0
        L_0x02eb:
            e1.f$a r2 = r1.f84041e
            r2.mo58150a()
        L_0x02f0:
            e1.f$a r2 = r1.f84041e
            float r4 = r2.f84042a
            float r2 = r2.f84043b
            float r5 = r3.f84033c
            float r6 = r3.f84034d
            r0.mo55579d(r4, r2, r5, r6)
            e1.f$a r2 = r1.f84039c
            e1.f$a r4 = r1.f84038b
            float r5 = r4.f84042a
            e1.f$a r6 = r1.f84041e
            float r7 = r6.f84042a
            float r5 = r5 + r7
            r2.f84042a = r5
            float r5 = r4.f84043b
            float r6 = r6.f84043b
            float r5 = r5 + r6
            r2.f84043b = r5
            float r2 = r4.f84042a
            float r5 = r3.f84033c
            float r2 = r2 + r5
            r4.f84042a = r2
            float r2 = r4.f84043b
            float r3 = r3.f84034d
            float r2 = r2 + r3
            r4.f84043b = r2
            goto L_0x005e
        L_0x0321:
            boolean r3 = r13 instanceof p503e1.C31381e.C31390i
            if (r3 == 0) goto L_0x037a
            r3 = r13
            e1.e$i r3 = (p503e1.C31381e.C31390i) r3
            gy3.C87412m.m108591d(r2)
            boolean r2 = r2.f83977b
            if (r2 == 0) goto L_0x0349
            e1.f$a r2 = r1.f84041e
            float r4 = (float) r4
            e1.f$a r5 = r1.f84038b
            float r6 = r5.f84042a
            float r6 = r6 * r4
            e1.f$a r7 = r1.f84039c
            float r8 = r7.f84042a
            float r6 = r6 - r8
            r2.f84042a = r6
            float r5 = r5.f84043b
            float r4 = r4 * r5
            float r5 = r7.f84043b
            float r4 = r4 - r5
            r2.f84043b = r4
            goto L_0x0355
        L_0x0349:
            e1.f$a r2 = r1.f84041e
            e1.f$a r4 = r1.f84038b
            float r5 = r4.f84042a
            r2.f84042a = r5
            float r4 = r4.f84043b
            r2.f84043b = r4
        L_0x0355:
            e1.f$a r2 = r1.f84041e
            float r4 = r2.f84042a
            float r2 = r2.f84043b
            float r5 = r3.f84005c
            float r6 = r3.f84006d
            r0.mo55584i(r4, r2, r5, r6)
            e1.f$a r2 = r1.f84039c
            e1.f$a r4 = r1.f84041e
            float r5 = r4.f84042a
            r2.f84042a = r5
            float r4 = r4.f84043b
            r2.f84043b = r4
            e1.f$a r2 = r1.f84038b
            float r4 = r3.f84005c
            r2.f84042a = r4
            float r3 = r3.f84006d
            r2.f84043b = r3
            goto L_0x005e
        L_0x037a:
            boolean r2 = r13 instanceof p503e1.C31381e.C31391j
            if (r2 == 0) goto L_0x03d9
            r10 = r13
            e1.e$j r10 = (p503e1.C31381e.C31391j) r10
            float r2 = r10.f84012h
            e1.f$a r3 = r1.f84038b
            float r4 = r3.f84042a
            float r11 = r2 + r4
            float r2 = r10.f84013i
            float r5 = r3.f84043b
            float r8 = r2 + r5
            double r2 = (double) r4
            double r4 = (double) r5
            double r6 = (double) r11
            double r0 = (double) r8
            r18 = r8
            r8 = r0
            float r0 = r10.f84007c
            double r0 = (double) r0
            r19 = r2
            r2 = r10
            r3 = r11
            r10 = r0
            float r0 = r2.f84008d
            double r0 = (double) r0
            r21 = r12
            r22 = r13
            r12 = r0
            float r0 = r2.f84009e
            double r0 = (double) r0
            r24 = r14
            r23 = r15
            r14 = r0
            boolean r0 = r2.f84010f
            r16 = r0
            boolean r0 = r2.f84011g
            r17 = r0
            r0 = r27
            r2 = r27
            r1 = r28
            r25 = r3
            r2 = r19
            r0.mo58148b(r1, r2, r4, r6, r8, r10, r12, r14, r16, r17)
            r1 = r27
            e1.f$a r0 = r1.f84038b
            r2 = r25
            r0.f84042a = r2
            r3 = r18
            r0.f84043b = r3
            e1.f$a r0 = r1.f84039c
            r0.f84042a = r2
            r0.f84043b = r3
            r0 = r1
            r20 = r22
            goto L_0x0431
        L_0x03d9:
            r21 = r12
            r0 = r13
            r24 = r14
            r23 = r15
            boolean r2 = r0 instanceof p503e1.C31381e.C31382a
            if (r2 == 0) goto L_0x042e
            r14 = r0
            e1.e$a r14 = (p503e1.C31381e.C31382a) r14
            e1.f$a r4 = r1.f84038b
            float r2 = r4.f84042a
            double r2 = (double) r2
            float r4 = r4.f84043b
            double r4 = (double) r4
            float r6 = r14.f83983h
            double r6 = (double) r6
            float r8 = r14.f83984i
            double r8 = (double) r8
            float r10 = r14.f83978c
            double r10 = (double) r10
            float r12 = r14.f83979d
            double r12 = (double) r12
            float r15 = r14.f83980e
            r22 = r0
            double r0 = (double) r15
            r18 = r2
            r2 = r14
            r14 = r0
            boolean r0 = r2.f83981f
            r16 = r0
            boolean r0 = r2.f83982g
            r17 = r0
            r20 = r22
            r0 = r27
            r3 = r27
            r1 = r28
            r26 = r2
            r2 = r18
            r0.mo58148b(r1, r2, r4, r6, r8, r10, r12, r14, r16, r17)
            e1.f$a r1 = r0.f84038b
            r13 = r26
            float r2 = r13.f83983h
            r1.f84042a = r2
            float r3 = r13.f83984i
            r1.f84043b = r3
            e1.f$a r1 = r0.f84039c
            r1.f84042a = r2
            r1.f84043b = r3
            goto L_0x0431
        L_0x042e:
            r20 = r0
            r0 = r1
        L_0x0431:
            int r12 = r21 + 1
            r1 = r0
            r2 = r20
            r15 = r23
            r14 = r24
            r0 = r28
            goto L_0x002c
        L_0x043e:
            r0 = r1
            return r28
        */
        throw new UnsupportedOperationException("Method not decompiled: p503e1.C31401f.mo58149c(a1.j0):a1.j0");
    }
}
