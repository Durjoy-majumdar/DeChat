package p190l1;

import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p410k0.C108793e;
import p631o1.C109857o;

/* renamed from: l1.j */
public final class C109103j extends C109104k {

    /* renamed from: b */
    public final C109117x f326698b;

    /* renamed from: c */
    public final C108793e<C109110r> f326699c = new C108793e<>(new C109110r[16], 0);

    /* renamed from: d */
    public final Map<C109110r, C109111s> f326700d = new LinkedHashMap();

    /* renamed from: e */
    public C109857o f326701e;

    /* renamed from: f */
    public C109106l f326702f;

    /* renamed from: g */
    public boolean f326703g;

    /* renamed from: h */
    public boolean f326704h = true;

    /* renamed from: i */
    public boolean f326705i = true;

    public C109103j(C109117x xVar) {
        C87412m.m108594g(xVar, "pointerInputFilter");
        this.f326698b = xVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0198, code lost:
        if ((r11 == 5) != false) goto L_0x019a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x020e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo160344a(java.util.Map<p190l1.C109110r, p190l1.C109111s> r33, p631o1.C109857o r34, p190l1.C109097g r35, boolean r36) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r35
            java.lang.String r4 = "changes"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "parentCoordinates"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "internalPointerEvent"
            gy3.C87412m.m108594g(r3, r4)
            boolean r4 = super.mo160344a(r33, r34, r35, r36)
            l1.x r5 = r0.f326698b
            boolean r6 = r5.f326748e
            r7 = 1
            if (r6 != 0) goto L_0x0023
            return r7
        L_0x0023:
            o1.o r5 = r5.f326747d
            r0.f326701e = r5
            java.util.Set r5 = r33.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x002f:
            boolean r6 = r5.hasNext()
            r8 = 0
            if (r6 == 0) goto L_0x00ea
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r9 = r6.getKey()
            l1.r r9 = (p190l1.C109110r) r9
            long r9 = r9.f326716a
            java.lang.Object r6 = r6.getValue()
            l1.s r6 = (p190l1.C109111s) r6
            k0.e<l1.r> r11 = r0.f326699c
            l1.r r12 = new l1.r
            r12.<init>(r9)
            boolean r11 = r11.mo159864f(r12)
            if (r11 == 0) goto L_0x002f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List<l1.e> r12 = r6.f326726j
            if (r12 != 0) goto L_0x0062
            sx3.f0 r12 = sx3.C64186f0.f181907d
        L_0x0062:
            int r13 = r12.size()
        L_0x0066:
            if (r8 >= r13) goto L_0x009a
            java.lang.Object r14 = r12.get(r8)
            l1.e r14 = (p190l1.C109090e) r14
            l1.e r15 = new l1.e
            r21 = r8
            long r7 = r14.f326656a
            r31 = r5
            o1.o r5 = r0.f326701e
            gy3.C87412m.m108591d(r5)
            r22 = r12
            r23 = r13
            long r12 = r14.f326657b
            long r18 = r5.mo161178U(r2, r12)
            r20 = 0
            r5 = r15
            r16 = r7
            r15.<init>(r16, r18, r20)
            r11.add(r5)
            int r8 = r21 + 1
            r12 = r22
            r13 = r23
            r5 = r31
            r7 = 1
            goto L_0x0066
        L_0x009a:
            r31 = r5
            java.util.Map<l1.r, l1.s> r5 = r0.f326700d
            l1.r r7 = new l1.r
            r7.<init>(r9)
            o1.o r8 = r0.f326701e
            gy3.C87412m.m108591d(r8)
            long r9 = r6.f326722f
            long r22 = r8.mo161178U(r2, r9)
            o1.o r8 = r0.f326701e
            gy3.C87412m.m108591d(r8)
            long r9 = r6.f326719c
            long r17 = r8.mo161178U(r2, r9)
            long r13 = r6.f326717a
            long r8 = r6.f326718b
            r15 = r8
            boolean r8 = r6.f326720d
            r19 = r8
            long r8 = r6.f326721e
            r20 = r8
            boolean r8 = r6.f326723g
            r24 = r8
            int r8 = r6.f326724h
            r26 = r8
            long r8 = r6.f326725i
            r28 = r8
            l1.s r8 = new l1.s
            r12 = r8
            r25 = 0
            r30 = 0
            r27 = r11
            r12.<init>(r13, r15, r17, r19, r20, r22, r24, r25, r26, r27, r28, r30)
            l1.d r6 = r6.f326727k
            r8.f326727k = r6
            r5.put(r7, r8)
            r5 = r31
            r7 = 1
            goto L_0x002f
        L_0x00ea:
            java.util.Map<l1.r, l1.s> r2 = r0.f326700d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00fe
            k0.e<l1.r> r1 = r0.f326699c
            r1.mo159863e()
            k0.e<l1.j> r1 = r0.f326706a
            r1.mo159863e()
            r2 = 1
            return r2
        L_0x00fe:
            r2 = 1
            k0.e<l1.r> r5 = r0.f326699c
            int r5 = r5.f325786f
            int r5 = r5 - r2
        L_0x0104:
            r2 = -1
            if (r2 >= r5) goto L_0x0124
            k0.e<l1.r> r2 = r0.f326699c
            T[] r2 = r2.f325784d
            r2 = r2[r5]
            l1.r r2 = (p190l1.C109110r) r2
            long r6 = r2.f326716a
            l1.r r2 = new l1.r
            r2.<init>(r6)
            boolean r2 = r1.containsKey(r2)
            if (r2 != 0) goto L_0x0121
            k0.e<l1.r> r2 = r0.f326699c
            r2.mo159871m(r5)
        L_0x0121:
            int r5 = r5 + -1
            goto L_0x0104
        L_0x0124:
            l1.l r1 = new l1.l
            java.util.Map<l1.r, l1.s> r2 = r0.f326700d
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.util.Collection r2 = r2.values()
            java.util.List r2 = sx3.C110818d0.m150953y0(r2)
            r1.<init>(r2, r3)
            java.util.List<l1.s> r2 = r1.f326709a
            int r5 = r2.size()
            r6 = 0
        L_0x013c:
            if (r6 >= r5) goto L_0x0151
            java.lang.Object r7 = r2.get(r6)
            r9 = r7
            l1.s r9 = (p190l1.C109111s) r9
            long r9 = r9.f326717a
            boolean r9 = r3.mo160341a(r9)
            if (r9 == 0) goto L_0x014e
            goto L_0x0152
        L_0x014e:
            int r6 = r6 + 1
            goto L_0x013c
        L_0x0151:
            r7 = 0
        L_0x0152:
            l1.s r7 = (p190l1.C109111s) r7
            r2 = 3
            if (r7 == 0) goto L_0x01c2
            if (r36 != 0) goto L_0x015c
            r0.f326704h = r8
            goto L_0x017a
        L_0x015c:
            boolean r3 = r0.f326704h
            if (r3 != 0) goto L_0x017a
            boolean r3 = r7.f326720d
            if (r3 != 0) goto L_0x0168
            boolean r3 = r7.f326723g
            if (r3 == 0) goto L_0x017a
        L_0x0168:
            o1.o r3 = r0.f326701e
            gy3.C87412m.m108591d(r3)
            long r5 = r3.mo161181b()
            boolean r3 = p190l1.C109107m.m148150c(r7, r5)
            r5 = 1
            r3 = r3 ^ r5
            r0.f326704h = r3
            goto L_0x017b
        L_0x017a:
            r5 = 1
        L_0x017b:
            boolean r3 = r0.f326704h
            boolean r6 = r0.f326703g
            r9 = 5
            r10 = 4
            if (r3 == r6) goto L_0x01a0
            int r11 = r1.f326711c
            if (r11 != r2) goto L_0x0189
            r12 = 1
            goto L_0x018a
        L_0x0189:
            r12 = 0
        L_0x018a:
            if (r12 != 0) goto L_0x019a
            if (r11 != r10) goto L_0x0190
            r12 = 1
            goto L_0x0191
        L_0x0190:
            r12 = 0
        L_0x0191:
            if (r12 != 0) goto L_0x019a
            if (r11 != r9) goto L_0x0197
            r11 = 1
            goto L_0x0198
        L_0x0197:
            r11 = 0
        L_0x0198:
            if (r11 == 0) goto L_0x01a0
        L_0x019a:
            if (r3 == 0) goto L_0x019d
            r9 = 4
        L_0x019d:
            r1.f326711c = r9
            goto L_0x01c3
        L_0x01a0:
            int r11 = r1.f326711c
            if (r11 != r10) goto L_0x01a6
            r10 = 1
            goto L_0x01a7
        L_0x01a6:
            r10 = 0
        L_0x01a7:
            if (r10 == 0) goto L_0x01b2
            if (r6 == 0) goto L_0x01b2
            boolean r6 = r0.f326705i
            if (r6 != 0) goto L_0x01b2
            r1.f326711c = r2
            goto L_0x01c3
        L_0x01b2:
            if (r11 != r9) goto L_0x01b6
            r6 = 1
            goto L_0x01b7
        L_0x01b6:
            r6 = 0
        L_0x01b7:
            if (r6 == 0) goto L_0x01c3
            if (r3 == 0) goto L_0x01c3
            boolean r3 = r7.f326720d
            if (r3 == 0) goto L_0x01c3
            r1.f326711c = r2
            goto L_0x01c3
        L_0x01c2:
            r5 = 1
        L_0x01c3:
            if (r4 != 0) goto L_0x0210
            int r3 = r1.f326711c
            if (r3 != r2) goto L_0x01cb
            r2 = 1
            goto L_0x01cc
        L_0x01cb:
            r2 = 0
        L_0x01cc:
            if (r2 == 0) goto L_0x0210
            l1.l r2 = r0.f326702f
            if (r2 == 0) goto L_0x020a
            java.util.List<l1.s> r3 = r2.f326709a
            int r3 = r3.size()
            java.util.List<l1.s> r4 = r1.f326709a
            int r4 = r4.size()
            if (r3 == r4) goto L_0x01e1
            goto L_0x020a
        L_0x01e1:
            java.util.List<l1.s> r3 = r1.f326709a
            int r3 = r3.size()
            r4 = 0
        L_0x01e8:
            if (r4 >= r3) goto L_0x0208
            java.util.List<l1.s> r6 = r2.f326709a
            java.lang.Object r6 = r6.get(r4)
            l1.s r6 = (p190l1.C109111s) r6
            java.util.List<l1.s> r7 = r1.f326709a
            java.lang.Object r7 = r7.get(r4)
            l1.s r7 = (p190l1.C109111s) r7
            long r9 = r6.f326719c
            long r6 = r7.f326719c
            boolean r6 = p1166z0.C112539e.m153736a(r9, r6)
            if (r6 != 0) goto L_0x0205
            goto L_0x020a
        L_0x0205:
            int r4 = r4 + 1
            goto L_0x01e8
        L_0x0208:
            r2 = 0
            goto L_0x020b
        L_0x020a:
            r2 = 1
        L_0x020b:
            if (r2 == 0) goto L_0x020e
            goto L_0x0210
        L_0x020e:
            r7 = 0
            goto L_0x0211
        L_0x0210:
            r7 = 1
        L_0x0211:
            r0.f326702f = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p190l1.C109103j.mo160344a(java.util.Map, o1.o, l1.g, boolean):boolean");
    }

    /* renamed from: b */
    public void mo160345b(C109097g gVar) {
        C87412m.m108594g(gVar, "internalPointerEvent");
        super.mo160345b(gVar);
        C109106l lVar = this.f326702f;
        if (lVar != null) {
            this.f326703g = this.f326704h;
            List<C109111s> list = lVar.f326709a;
            int size = list.size();
            boolean z = false;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= size) {
                    break;
                }
                C109111s sVar = list.get(i);
                if (sVar.f326720d || (gVar.mo160341a(sVar.f326717a) && this.f326704h)) {
                    z2 = false;
                }
                if (z2) {
                    this.f326699c.mo159869k(new C109110r(sVar.f326717a));
                }
                i++;
            }
            this.f326704h = false;
            if (lVar.f326711c == 5) {
                z = true;
            }
            this.f326705i = z;
        }
    }

    /* renamed from: d */
    public void mo160346d() {
        C108793e<C109103j> eVar = this.f326706a;
        int i = eVar.f325786f;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = eVar.f325784d;
            do {
                ((C109103j) tArr[i2]).mo160346d();
                i2++;
            } while (i2 < i);
        }
        this.f326698b.mo160327g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        r0 = r7.f326706a;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo160347e(p190l1.C109097g r8) {
        /*
            r7 = this;
            java.lang.String r0 = "internalPointerEvent"
            gy3.C87412m.m108594g(r8, r0)
            java.util.Map<l1.r, l1.s> r0 = r7.f326700d
            boolean r0 = r0.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            r1 = 0
            goto L_0x0045
        L_0x0011:
            l1.x r0 = r7.f326698b
            boolean r0 = r0.f326748e
            if (r0 != 0) goto L_0x0018
            goto L_0x000f
        L_0x0018:
            l1.l r0 = r7.f326702f
            gy3.C87412m.m108591d(r0)
            o1.o r3 = r7.f326701e
            gy3.C87412m.m108591d(r3)
            long r3 = r3.mo161181b()
            l1.x r5 = r7.f326698b
            l1.n r6 = p190l1.C109108n.Final
            r5.mo160328i(r0, r6, r3)
            l1.x r0 = r7.f326698b
            boolean r0 = r0.f326748e
            if (r0 == 0) goto L_0x0045
            k0.e<l1.j> r0 = r7.f326706a
            int r3 = r0.f325786f
            if (r3 <= 0) goto L_0x0045
            T[] r0 = r0.f325784d
        L_0x003b:
            r4 = r0[r2]
            l1.j r4 = (p190l1.C109103j) r4
            r4.mo160347e(r8)
            int r2 = r2 + r1
            if (r2 < r3) goto L_0x003b
        L_0x0045:
            r7.mo160345b(r8)
            java.util.Map<l1.r, l1.s> r8 = r7.f326700d
            java.util.LinkedHashMap r8 = (java.util.LinkedHashMap) r8
            r8.clear()
            r8 = 0
            r7.f326701e = r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p190l1.C109103j.mo160347e(l1.g):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        r3 = r8.f326706a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo160348f(java.util.Map<p190l1.C109110r, p190l1.C109111s> r9, p631o1.C109857o r10, p190l1.C109097g r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "changes"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r9 = "parentCoordinates"
            gy3.C87412m.m108594g(r10, r9)
            java.lang.String r9 = "internalPointerEvent"
            gy3.C87412m.m108594g(r11, r9)
            java.util.Map<l1.r, l1.s> r9 = r8.f326700d
            boolean r9 = r9.isEmpty()
            r10 = 1
            r0 = 0
            if (r9 == 0) goto L_0x001b
        L_0x0019:
            r10 = 0
            goto L_0x0061
        L_0x001b:
            l1.x r9 = r8.f326698b
            boolean r9 = r9.f326748e
            if (r9 != 0) goto L_0x0022
            goto L_0x0019
        L_0x0022:
            l1.l r9 = r8.f326702f
            gy3.C87412m.m108591d(r9)
            o1.o r1 = r8.f326701e
            gy3.C87412m.m108591d(r1)
            long r1 = r1.mo161181b()
            l1.x r3 = r8.f326698b
            l1.n r4 = p190l1.C109108n.Initial
            r3.mo160328i(r9, r4, r1)
            l1.x r3 = r8.f326698b
            boolean r3 = r3.f326748e
            if (r3 == 0) goto L_0x0056
            k0.e<l1.j> r3 = r8.f326706a
            int r4 = r3.f325786f
            if (r4 <= 0) goto L_0x0056
            T[] r3 = r3.f325784d
        L_0x0045:
            r5 = r3[r0]
            l1.j r5 = (p190l1.C109103j) r5
            java.util.Map<l1.r, l1.s> r6 = r8.f326700d
            o1.o r7 = r8.f326701e
            gy3.C87412m.m108591d(r7)
            r5.mo160348f(r6, r7, r11, r12)
            int r0 = r0 + r10
            if (r0 < r4) goto L_0x0045
        L_0x0056:
            l1.x r11 = r8.f326698b
            boolean r12 = r11.f326748e
            if (r12 == 0) goto L_0x0061
            l1.n r12 = p190l1.C109108n.Main
            r11.mo160328i(r9, r12, r1)
        L_0x0061:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p190l1.C109103j.mo160348f(java.util.Map, o1.o, l1.g, boolean):boolean");
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f326698b + ", children=" + this.f326706a + ", pointerIds=" + this.f326699c + ')';
    }
}
