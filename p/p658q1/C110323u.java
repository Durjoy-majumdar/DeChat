package p658q1;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p410k0.C108793e;
import p560i2.C108319b;
import p658q1.C110282c0;
import rx3.C13603j;

/* renamed from: q1.u */
public final class C110323u {

    /* renamed from: a */
    public final C110301j f330017a;

    /* renamed from: b */
    public final C110278b f330018b = new C110278b(false);

    /* renamed from: c */
    public boolean f330019c;

    /* renamed from: d */
    public final C110331z f330020d = new C110331z();

    /* renamed from: e */
    public final C108793e<C110282c0.C110284b> f330021e = new C108793e<>(new C110282c0.C110284b[16], 0);

    /* renamed from: f */
    public long f330022f = 1;

    /* renamed from: g */
    public final List<C110301j> f330023g = new ArrayList();

    /* renamed from: h */
    public C108319b f330024h;

    public C110323u(C110301j jVar) {
        C87412m.m108594g(jVar, "root");
        this.f330017a = jVar;
    }

    /* renamed from: a */
    public final void mo161768a(boolean z) {
        if (z) {
            C110331z zVar = this.f330020d;
            C110301j jVar = this.f330017a;
            zVar.getClass();
            C87412m.m108594g(jVar, "rootNode");
            zVar.f330045a.mo159863e();
            zVar.f330045a.mo159860b(jVar);
            jVar.f329907V = true;
        }
        C110331z zVar2 = this.f330020d;
        C108793e<C110301j> eVar = zVar2.f330045a;
        C110330y yVar = C110330y.f330044d;
        eVar.getClass();
        T[] tArr = eVar.f325784d;
        int i = eVar.f325786f;
        C87412m.m108594g(tArr, "<this>");
        Arrays.sort(tArr, 0, i, yVar);
        C108793e<C110301j> eVar2 = zVar2.f330045a;
        int i2 = eVar2.f325786f;
        if (i2 > 0) {
            int i3 = i2 - 1;
            T[] tArr2 = eVar2.f325784d;
            do {
                C110301j jVar2 = (C110301j) tArr2[i3];
                if (jVar2.f329907V) {
                    zVar2.mo161784a(jVar2);
                }
                i3--;
            } while (i3 >= 0);
        }
        zVar2.f330045a.mo159863e();
    }

    /* renamed from: b */
    public final boolean mo161769b(C110301j jVar, C108319b bVar) {
        boolean z;
        j$$i j__i = j$$i.NotUsed;
        if (bVar != null) {
            if (jVar.f329892F == j__i) {
                jVar.mo161716l();
            }
            z = jVar.f329896J.mo161681v0(bVar.f324343a);
        } else {
            C110276a0 a0Var = jVar.f329896J;
            C108319b bVar2 = a0Var.f329846j ? new C108319b(a0Var.f328782g) : null;
            if (bVar2 != null) {
                if (jVar.f329892F == j__i) {
                    jVar.mo161716l();
                }
                z = jVar.f329896J.mo161681v0(bVar2.f324343a);
            } else {
                j$$h j__h = C110301j.f329884p0;
                jVar.getClass();
                z = false;
            }
        }
        C110301j s = jVar.mo161723s();
        if (z && s != null) {
            j$$i j__i2 = jVar.f329891E;
            if (j__i2 == j$$i.InMeasureBlock) {
                mo161775h(s, false);
            } else if (j__i2 == j$$i.InLayoutBlock) {
                mo161774g(s, false);
            }
        }
        return z;
    }

    /* renamed from: c */
    public final void mo161770c(C110301j jVar) {
        C87412m.m108594g(jVar, "layoutNode");
        if (!this.f330018b.f329856a.isEmpty()) {
            if (!this.f330019c) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!jVar.f329909X) {
                C108793e<C110301j> u = jVar.mo161726u();
                int i = u.f325786f;
                if (i > 0) {
                    int i2 = 0;
                    T[] tArr = u.f325784d;
                    do {
                        C110301j jVar2 = (C110301j) tArr[i2];
                        if (jVar2.f329909X && this.f330018b.mo161683b(jVar2)) {
                            mo161773f(jVar2);
                        }
                        if (!jVar2.f329909X) {
                            mo161770c(jVar2);
                        }
                        i2++;
                    } while (i2 < i);
                }
                if (jVar.f329909X && this.f330018b.mo161683b(jVar)) {
                    mo161773f(jVar);
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v2, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo161771d(fy3.C32224a<rx3.C13598b0> r8) {
        /*
            r7 = this;
            q1.j r0 = r7.f330017a
            boolean r0 = r0.mo161701A()
            java.lang.String r1 = "Failed requirement."
            if (r0 == 0) goto L_0x008b
            q1.j r0 = r7.f330017a
            boolean r0 = r0.f329887A
            if (r0 == 0) goto L_0x0081
            boolean r0 = r7.f330019c
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0077
            i2.b r0 = r7.f330024h
            r1 = 0
            if (r0 == 0) goto L_0x005e
            r7.f330019c = r2
            q1.b r0 = r7.f330018b     // Catch:{ all -> 0x005a }
            q1.k0<q1.j> r0 = r0.f329856a     // Catch:{ all -> 0x005a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005a }
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0056
            q1.b r0 = r7.f330018b     // Catch:{ all -> 0x005a }
            r3 = 0
        L_0x002b:
            q1.k0<q1.j> r4 = r0.f329856a     // Catch:{ all -> 0x005a }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x005a }
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x0050
            q1.k0<q1.j> r4 = r0.f329856a     // Catch:{ all -> 0x005a }
            java.lang.Object r4 = r4.first()     // Catch:{ all -> 0x005a }
            q1.j r4 = (p658q1.C110301j) r4     // Catch:{ all -> 0x005a }
            java.lang.String r5 = "node"
            gy3.C87412m.m108593f(r4, r5)     // Catch:{ all -> 0x005a }
            r0.mo161683b(r4)     // Catch:{ all -> 0x005a }
            boolean r5 = r7.mo161773f(r4)     // Catch:{ all -> 0x005a }
            q1.j r6 = r7.f330017a     // Catch:{ all -> 0x005a }
            if (r4 != r6) goto L_0x002b
            if (r5 == 0) goto L_0x002b
            r3 = 1
            goto L_0x002b
        L_0x0050:
            if (r8 == 0) goto L_0x0057
            r8.invoke()     // Catch:{ all -> 0x005a }
            goto L_0x0057
        L_0x0056:
            r3 = 0
        L_0x0057:
            r7.f330019c = r1
            goto L_0x005f
        L_0x005a:
            r8 = move-exception
            r7.f330019c = r1
            throw r8
        L_0x005e:
            r3 = 0
        L_0x005f:
            k0.e<q1.c0$b> r8 = r7.f330021e
            int r0 = r8.f325786f
            if (r0 <= 0) goto L_0x0071
            T[] r8 = r8.f325784d
        L_0x0067:
            r4 = r8[r1]
            q1.c0$b r4 = (p658q1.C110282c0.C110284b) r4
            r4.mo161687d()
            int r1 = r1 + r2
            if (r1 < r0) goto L_0x0067
        L_0x0071:
            k0.e<q1.c0$b> r8 = r7.f330021e
            r8.mo159863e()
            return r3
        L_0x0077:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        L_0x0081:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        L_0x008b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p658q1.C110323u.mo161771d(fy3.a):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v2, types: [int] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo161772e(p658q1.C110301j r4, long r5) {
        /*
            r3 = this;
            java.lang.String r0 = "layoutNode"
            gy3.C87412m.m108594g(r4, r0)
            q1.j r0 = r3.f330017a
            boolean r0 = gy3.C87412m.m108589b(r4, r0)
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Failed requirement."
            if (r0 == 0) goto L_0x008c
            q1.j r0 = r3.f330017a
            boolean r0 = r0.mo161701A()
            if (r0 == 0) goto L_0x0082
            q1.j r0 = r3.f330017a
            boolean r0 = r0.f329887A
            if (r0 == 0) goto L_0x0078
            boolean r0 = r3.f330019c
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x006e
            i2.b r0 = r3.f330024h
            r2 = 0
            if (r0 == 0) goto L_0x0056
            r3.f330019c = r1
            q1.b r0 = r3.f330018b     // Catch:{ all -> 0x0052 }
            r0.mo161683b(r4)     // Catch:{ all -> 0x0052 }
            i2.b r0 = new i2.b     // Catch:{ all -> 0x0052 }
            r0.<init>(r5)     // Catch:{ all -> 0x0052 }
            r3.mo161769b(r4, r0)     // Catch:{ all -> 0x0052 }
            boolean r5 = r4.f329910Y     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x004f
            boolean r5 = r4.f329887A     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x004f
            r4.mo161710L()     // Catch:{ all -> 0x0052 }
            q1.z r5 = r3.f330020d     // Catch:{ all -> 0x0052 }
            r5.getClass()     // Catch:{ all -> 0x0052 }
            k0.e<q1.j> r5 = r5.f330045a     // Catch:{ all -> 0x0052 }
            r5.mo159860b(r4)     // Catch:{ all -> 0x0052 }
            r4.f329907V = r1     // Catch:{ all -> 0x0052 }
        L_0x004f:
            r3.f330019c = r2
            goto L_0x0056
        L_0x0052:
            r4 = move-exception
            r3.f330019c = r2
            throw r4
        L_0x0056:
            k0.e<q1.c0$b> r4 = r3.f330021e
            int r5 = r4.f325786f
            if (r5 <= 0) goto L_0x0068
            T[] r4 = r4.f325784d
        L_0x005e:
            r6 = r4[r2]
            q1.c0$b r6 = (p658q1.C110282c0.C110284b) r6
            r6.mo161687d()
            int r2 = r2 + r1
            if (r2 < r5) goto L_0x005e
        L_0x0068:
            k0.e<q1.c0$b> r4 = r3.f330021e
            r4.mo159863e()
            return
        L_0x006e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L_0x0078:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L_0x0082:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L_0x008c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p658q1.C110323u.mo161772e(q1.j, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if ((r0.f329957h != null) != false) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo161773f(p658q1.C110301j r14) {
        /*
            r13 = this;
            boolean r0 = r14.f329887A
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0031
            boolean r0 = r14.f329909X
            if (r0 == 0) goto L_0x0020
            q1.j$$i r0 = r14.f329891E
            q1.j$$i r3 = p658q1.j$$i.InMeasureBlock
            if (r0 == r3) goto L_0x001e
            q1.o r0 = r14.f329931z
            r0.mo161734c()
            q1.j r0 = r0.f329957h
            if (r0 == 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 != 0) goto L_0x0031
            q1.o r0 = r14.f329931z
            r0.mo161734c()
            q1.j r0 = r0.f329957h
            if (r0 == 0) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x00be
        L_0x0031:
            boolean r0 = r14.f329909X
            if (r0 == 0) goto L_0x0045
            q1.j r0 = r13.f330017a
            if (r14 != r0) goto L_0x003f
            i2.b r0 = r13.f330024h
            gy3.C87412m.m108591d(r0)
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            boolean r0 = r13.mo161769b(r14, r0)
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            boolean r3 = r14.f329910Y
            if (r3 == 0) goto L_0x008e
            boolean r3 = r14.f329887A
            if (r3 == 0) goto L_0x008e
            q1.j r3 = r13.f330017a
            if (r14 != r3) goto L_0x007f
            r6 = 0
            r7 = 0
            q1.j$$i r3 = r14.f329892F
            q1.j$$i r4 = p658q1.j$$i.NotUsed
            if (r3 != r4) goto L_0x005d
            r14.mo161717m()
        L_0x005d:
            o1.n0$a$a r4 = p631o1.C109854n0.C109855a.f328783a
            q1.a0 r3 = r14.f329896J
            int r3 = r3.mo161168i0()
            i2.o r5 = r14.f329929x
            r4.getClass()
            int r11 = p631o1.C109854n0.C109855a.f328785c
            i2.o r12 = p631o1.C109854n0.C109855a.f328784b
            p631o1.C109854n0.C109855a.f328785c = r3
            p631o1.C109854n0.C109855a.f328784b = r5
            q1.a0 r5 = r14.f329896J
            r8 = 0
            r9 = 4
            r10 = 0
            p631o1.C109854n0.C109855a.m149306f(r4, r5, r6, r7, r8, r9, r10)
            p631o1.C109854n0.C109855a.f328785c = r11
            p631o1.C109854n0.C109855a.f328784b = r12
            goto L_0x0082
        L_0x007f:
            r14.mo161710L()
        L_0x0082:
            q1.z r3 = r13.f330020d
            r3.getClass()
            k0.e<q1.j> r3 = r3.f330045a
            r3.mo159860b(r14)
            r14.f329907V = r1
        L_0x008e:
            java.util.List<q1.j> r14 = r13.f330023g
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            boolean r14 = r14.isEmpty()
            r14 = r14 ^ r1
            if (r14 == 0) goto L_0x00bd
            java.util.List<q1.j> r14 = r13.f330023g
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r1 = r14.size()
            r3 = 0
        L_0x00a2:
            if (r3 >= r1) goto L_0x00b6
            java.lang.Object r4 = r14.get(r3)
            q1.j r4 = (p658q1.C110301j) r4
            boolean r5 = r4.mo161701A()
            if (r5 == 0) goto L_0x00b3
            r13.mo161775h(r4, r2)
        L_0x00b3:
            int r3 = r3 + 1
            goto L_0x00a2
        L_0x00b6:
            java.util.List<q1.j> r14 = r13.f330023g
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            r14.clear()
        L_0x00bd:
            r2 = r0
        L_0x00be:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p658q1.C110323u.mo161773f(q1.j):boolean");
    }

    /* renamed from: g */
    public final boolean mo161774g(C110301j jVar, boolean z) {
        C87412m.m108594g(jVar, "layoutNode");
        int ordinal = jVar.f329920o.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return false;
        }
        if (ordinal != 2) {
            throw new C13603j();
        } else if ((jVar.f329909X || jVar.f329910Y) && !z) {
            return false;
        } else {
            jVar.f329910Y = true;
            if (jVar.f329887A) {
                C110301j s = jVar.mo161723s();
                if (!(s != null && s.f329910Y)) {
                    if (!(s != null && s.f329909X)) {
                        this.f330018b.mo161682a(jVar);
                    }
                }
            }
            return !this.f330019c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r6 == false) goto L_0x004f;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo161775h(p658q1.C110301j r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "layoutNode"
            gy3.C87412m.m108594g(r5, r0)
            q1.j$$g r0 = r5.f329920o
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0062
            if (r0 == r2) goto L_0x005b
            r3 = 2
            if (r0 != r3) goto L_0x0055
            boolean r0 = r5.f329909X
            if (r0 == 0) goto L_0x001b
            if (r6 != 0) goto L_0x001b
            goto L_0x0062
        L_0x001b:
            r5.f329909X = r2
            boolean r6 = r5.f329887A
            if (r6 != 0) goto L_0x003b
            q1.j$$i r6 = r5.f329891E
            q1.j$$i r0 = p658q1.j$$i.InMeasureBlock
            if (r6 == r0) goto L_0x0038
            q1.o r6 = r5.f329931z
            r6.mo161734c()
            q1.j r6 = r6.f329957h
            if (r6 == 0) goto L_0x0032
            r6 = 1
            goto L_0x0033
        L_0x0032:
            r6 = 0
        L_0x0033:
            if (r6 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r6 = 0
            goto L_0x0039
        L_0x0038:
            r6 = 1
        L_0x0039:
            if (r6 == 0) goto L_0x004f
        L_0x003b:
            q1.j r6 = r5.mo161723s()
            if (r6 == 0) goto L_0x0047
            boolean r6 = r6.f329909X
            if (r6 != r2) goto L_0x0047
            r6 = 1
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            if (r6 != 0) goto L_0x004f
            q1.b r6 = r4.f330018b
            r6.mo161682a(r5)
        L_0x004f:
            boolean r5 = r4.f330019c
            if (r5 != 0) goto L_0x0062
            r1 = 1
            goto L_0x0062
        L_0x0055:
            rx3.j r5 = new rx3.j
            r5.<init>()
            throw r5
        L_0x005b:
            java.util.List<q1.j> r6 = r4.f330023g
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r5)
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p658q1.C110323u.mo161775h(q1.j, boolean):boolean");
    }

    /* renamed from: i */
    public final void mo161776i(long j) {
        C108319b bVar = this.f330024h;
        if (bVar == null ? false : C108319b.m146691b(bVar.f324343a, j)) {
            return;
        }
        if (!this.f330019c) {
            this.f330024h = new C108319b(j);
            C110301j jVar = this.f330017a;
            jVar.f329909X = true;
            this.f330018b.mo161682a(jVar);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
