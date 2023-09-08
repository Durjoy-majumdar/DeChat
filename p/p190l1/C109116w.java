package p190l1;

import gy3.C87412m;
import java.util.LinkedHashMap;
import p410k0.C108793e;
import p658q1.C110301j;
import p658q1.C62573f;

/* renamed from: l1.w */
public final class C109116w {

    /* renamed from: a */
    public final C110301j f326743a;

    /* renamed from: b */
    public final C109092f f326744b;

    /* renamed from: c */
    public final C109112t f326745c = new C109112t();

    /* renamed from: d */
    public final C62573f<C109117x> f326746d = new C62573f<>();

    public C109116w(C110301j jVar) {
        C87412m.m108594g(jVar, "root");
        this.f326743a = jVar;
        this.f326744b = new C109092f(jVar.f329895I);
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x024d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo160360a(p190l1.C109114u r45, p190l1.C109089d0 r46, boolean r47) {
        /*
            r44 = this;
            r0 = r44
            r1 = r45
            r2 = r46
            r3 = r47
            java.lang.String r4 = "pointerEvent"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "positionCalculator"
            gy3.C87412m.m108594g(r2, r4)
            l1.t r4 = r0.f326745c
            r4.getClass()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            java.util.List<l1.v> r6 = r1.f326732a
            int r6 = r6.size()
            r5.<init>(r6)
            java.util.List<l1.v> r6 = r1.f326732a
            int r7 = r6.size()
            r9 = 0
        L_0x0029:
            if (r9 >= r7) goto L_0x00d4
            java.lang.Object r10 = r6.get(r9)
            l1.v r10 = (p190l1.C109115v) r10
            java.util.Map<l1.r, l1.t$a> r11 = r4.f326728a
            long r12 = r10.f326734a
            l1.r r14 = new l1.r
            r14.<init>(r12)
            java.util.LinkedHashMap r11 = (java.util.LinkedHashMap) r11
            java.lang.Object r11 = r11.get(r14)
            l1.t$a r11 = (p190l1.C109112t.C109113a) r11
            if (r11 != 0) goto L_0x0051
            long r11 = r10.f326735b
            long r13 = r10.f326737d
            r16 = r9
            r25 = r11
            r27 = r13
            r29 = 0
            goto L_0x0063
        L_0x0051:
            long r12 = r11.f326729a
            boolean r14 = r11.f326731c
            r16 = r9
            long r8 = r11.f326730b
            long r8 = r2.mo144670l(r8)
            r27 = r8
            r25 = r12
            r29 = r14
        L_0x0063:
            long r8 = r10.f326734a
            r18 = r8
            l1.r r11 = new l1.r
            r11.<init>(r8)
            l1.s r8 = new l1.s
            r17 = r8
            long r12 = r10.f326735b
            r20 = r12
            long r12 = r10.f326737d
            r22 = r12
            boolean r9 = r10.f326738e
            r24 = r9
            r30 = 0
            int r9 = r10.f326739f
            r31 = r9
            java.util.List<l1.e> r9 = r10.f326741h
            r32 = r9
            long r12 = r10.f326742i
            r33 = r12
            r35 = 0
            r17.<init>(r18, r20, r22, r24, r25, r27, r29, r30, r31, r32, r33, r35)
            r5.put(r11, r8)
            boolean r8 = r10.f326738e
            if (r8 == 0) goto L_0x00be
            java.util.Map<l1.r, l1.t$a> r9 = r4.f326728a
            long r11 = r10.f326734a
            l1.r r13 = new l1.r
            r13.<init>(r11)
            l1.t$a r11 = new l1.t$a
            r12 = r6
            r14 = r7
            long r6 = r10.f326735b
            r18 = r14
            long r14 = r10.f326736c
            int r10 = r10.f326739f
            r43 = 0
            r36 = r11
            r37 = r6
            r39 = r14
            r41 = r8
            r42 = r10
            r36.<init>(r37, r39, r41, r42, r43)
            r9.put(r13, r11)
            goto L_0x00cd
        L_0x00be:
            r12 = r6
            r18 = r7
            java.util.Map<l1.r, l1.t$a> r6 = r4.f326728a
            long r7 = r10.f326734a
            l1.r r9 = new l1.r
            r9.<init>(r7)
            r6.remove(r9)
        L_0x00cd:
            int r9 = r16 + 1
            r6 = r12
            r7 = r18
            goto L_0x0029
        L_0x00d4:
            l1.g r2 = new l1.g
            r2.<init>(r5, r1)
            java.util.Map<l1.r, l1.s> r1 = r2.f326682a
            java.util.Collection r1 = r1.values()
            boolean r4 = r1 instanceof java.util.Collection
            r5 = 1
            if (r4 == 0) goto L_0x00eb
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x00eb
            goto L_0x010b
        L_0x00eb:
            java.util.Iterator r1 = r1.iterator()
        L_0x00ef:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x010b
            java.lang.Object r4 = r1.next()
            l1.s r4 = (p190l1.C109111s) r4
            boolean r6 = r4.f326720d
            if (r6 != 0) goto L_0x0106
            boolean r4 = r4.f326723g
            if (r4 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r4 = 0
            goto L_0x0107
        L_0x0106:
            r4 = 1
        L_0x0107:
            if (r4 == 0) goto L_0x00ef
            r1 = 1
            goto L_0x010c
        L_0x010b:
            r1 = 0
        L_0x010c:
            r1 = r1 ^ r5
            java.util.Map<l1.r, l1.s> r4 = r2.f326682a
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L_0x0117:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01cc
            java.lang.Object r6 = r4.next()
            l1.s r6 = (p190l1.C109111s) r6
            if (r1 != 0) goto L_0x012b
            boolean r7 = p190l1.C109107m.m148148a(r6)
            if (r7 == 0) goto L_0x01c9
        L_0x012b:
            int r7 = r6.f326724h
            if (r7 != r5) goto L_0x0131
            r12 = 1
            goto L_0x0132
        L_0x0131:
            r12 = 0
        L_0x0132:
            q1.j r8 = r0.f326743a
            long r9 = r6.f326719c
            q1.f<l1.x> r11 = r0.f326746d
            q1.j$$h r7 = p658q1.C110301j.f329884p0
            r13 = 1
            r8.mo161727v(r9, r11, r12, r13)
            q1.f<l1.x> r7 = r0.f326746d
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x01c9
            l1.f r7 = r0.f326744b
            long r8 = r6.f326717a
            q1.f<l1.x> r6 = r0.f326746d
            r7.getClass()
            java.lang.String r10 = "pointerInputFilters"
            gy3.C87412m.m108594g(r6, r10)
            l1.k r7 = r7.f326660b
            int r10 = r6.f177723g
            r11 = 0
            r12 = 1
        L_0x015b:
            if (r11 >= r10) goto L_0x01c4
            java.lang.Object[] r13 = r6.f177720d
            r13 = r13[r11]
            l1.x r13 = (p190l1.C109117x) r13
            if (r12 == 0) goto L_0x01ab
            k0.e<l1.j> r14 = r7.f326706a
            int r15 = r14.f325786f
            if (r15 <= 0) goto L_0x0187
            T[] r14 = r14.f325784d
            r16 = 0
        L_0x016f:
            r18 = r14[r16]
            r5 = r18
            l1.j r5 = (p190l1.C109103j) r5
            l1.x r5 = r5.f326698b
            boolean r5 = gy3.C87412m.m108589b(r5, r13)
            if (r5 == 0) goto L_0x017e
            goto L_0x0189
        L_0x017e:
            int r5 = r16 + 1
            if (r5 < r15) goto L_0x0183
            goto L_0x0187
        L_0x0183:
            r16 = r5
            r5 = 1
            goto L_0x016f
        L_0x0187:
            r18 = 0
        L_0x0189:
            r5 = r18
            l1.j r5 = (p190l1.C109103j) r5
            if (r5 == 0) goto L_0x01aa
            r14 = 1
            r5.f326704h = r14
            k0.e<l1.r> r7 = r5.f326699c
            l1.r r13 = new l1.r
            r13.<init>(r8)
            boolean r7 = r7.mo159864f(r13)
            if (r7 != 0) goto L_0x01bf
            k0.e<l1.r> r7 = r5.f326699c
            l1.r r13 = new l1.r
            r13.<init>(r8)
            r7.mo159860b(r13)
            goto L_0x01bf
        L_0x01aa:
            r12 = 0
        L_0x01ab:
            l1.j r5 = new l1.j
            r5.<init>(r13)
            k0.e<l1.r> r13 = r5.f326699c
            l1.r r14 = new l1.r
            r14.<init>(r8)
            r13.mo159860b(r14)
            k0.e<l1.j> r7 = r7.f326706a
            r7.mo159860b(r5)
        L_0x01bf:
            r7 = r5
            int r11 = r11 + 1
            r5 = 1
            goto L_0x015b
        L_0x01c4:
            q1.f<l1.x> r5 = r0.f326746d
            r5.clear()
        L_0x01c9:
            r5 = 1
            goto L_0x0117
        L_0x01cc:
            l1.f r1 = r0.f326744b
            l1.k r1 = r1.f326660b
            r1.mo160350c()
            l1.f r1 = r0.f326744b
            r1.getClass()
            l1.k r4 = r1.f326660b
            java.util.Map<l1.r, l1.s> r5 = r2.f326682a
            o1.o r6 = r1.f326659a
            boolean r4 = r4.mo160344a(r5, r6, r2, r3)
            if (r4 != 0) goto L_0x01e5
            goto L_0x0245
        L_0x01e5:
            l1.k r4 = r1.f326660b
            java.util.Map<l1.r, l1.s> r5 = r2.f326682a
            o1.o r6 = r1.f326659a
            r4.getClass()
            java.lang.String r7 = "changes"
            gy3.C87412m.m108594g(r5, r7)
            java.lang.String r7 = "parentCoordinates"
            gy3.C87412m.m108594g(r6, r7)
            k0.e<l1.j> r4 = r4.f326706a
            int r7 = r4.f325786f
            if (r7 <= 0) goto L_0x0217
            T[] r4 = r4.f325784d
            r8 = 0
            r9 = 0
        L_0x0202:
            r10 = r4[r8]
            l1.j r10 = (p190l1.C109103j) r10
            boolean r10 = r10.mo160348f(r5, r6, r2, r3)
            if (r10 != 0) goto L_0x0211
            if (r9 == 0) goto L_0x020f
            goto L_0x0211
        L_0x020f:
            r9 = 0
            goto L_0x0212
        L_0x0211:
            r9 = 1
        L_0x0212:
            int r8 = r8 + 1
            if (r8 < r7) goto L_0x0202
            goto L_0x0218
        L_0x0217:
            r9 = 0
        L_0x0218:
            l1.k r1 = r1.f326660b
            r1.getClass()
            k0.e<l1.j> r3 = r1.f326706a
            int r4 = r3.f325786f
            if (r4 <= 0) goto L_0x023c
            T[] r3 = r3.f325784d
            r5 = 0
            r6 = 0
        L_0x0227:
            r7 = r3[r5]
            l1.j r7 = (p190l1.C109103j) r7
            boolean r7 = r7.mo160347e(r2)
            if (r7 != 0) goto L_0x0236
            if (r6 == 0) goto L_0x0234
            goto L_0x0236
        L_0x0234:
            r6 = 0
            goto L_0x0237
        L_0x0236:
            r6 = 1
        L_0x0237:
            int r5 = r5 + 1
            if (r5 < r4) goto L_0x0227
            goto L_0x023d
        L_0x023c:
            r6 = 0
        L_0x023d:
            r1.mo160345b(r2)
            if (r6 != 0) goto L_0x0247
            if (r9 == 0) goto L_0x0245
            goto L_0x0247
        L_0x0245:
            r14 = 0
            goto L_0x0248
        L_0x0247:
            r14 = 1
        L_0x0248:
            boolean r1 = r2.f326684c
            if (r1 == 0) goto L_0x024d
            goto L_0x028e
        L_0x024d:
            java.util.Map<l1.r, l1.s> r1 = r2.f326682a
            java.util.Collection r1 = r1.values()
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x025e
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x025e
            goto L_0x028e
        L_0x025e:
            java.util.Iterator r1 = r1.iterator()
        L_0x0262:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x028e
            java.lang.Object r2 = r1.next()
            l1.s r2 = (p190l1.C109111s) r2
            java.lang.String r3 = "<this>"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 1
            long r4 = p190l1.C109107m.m148152e(r2, r3)
            long r6 = p1166z0.C112539e.f336955b
            boolean r4 = p1166z0.C112539e.m153736a(r4, r6)
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x0289
            boolean r2 = r2.mo160355b()
            if (r2 == 0) goto L_0x0289
            r2 = 1
            goto L_0x028a
        L_0x0289:
            r2 = 0
        L_0x028a:
            if (r2 == 0) goto L_0x0262
            r5 = 1
            goto L_0x028f
        L_0x028e:
            r5 = 0
        L_0x028f:
            if (r5 == 0) goto L_0x0293
            r8 = 2
            goto L_0x0294
        L_0x0293:
            r8 = 0
        L_0x0294:
            r1 = r14 | r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p190l1.C109116w.mo160360a(l1.u, l1.d0, boolean):int");
    }

    /* renamed from: b */
    public final void mo160361b() {
        ((LinkedHashMap) this.f326745c.f326728a).clear();
        C109092f fVar = this.f326744b;
        C108793e<C109103j> eVar = fVar.f326660b.f326706a;
        int i = eVar.f325786f;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = eVar.f325784d;
            do {
                ((C109103j) tArr[i2]).mo160346d();
                i2++;
            } while (i2 < i);
        }
        fVar.f326660b.f326706a.mo159863e();
    }
}
