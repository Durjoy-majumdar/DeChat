package n04;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n04.C25134i1;
import q04.C25521d;
import q04.C25526i;
import q04.C25528k;
import q04.C25529m;
import q04.C25530n;
import q04.C25531o;
import q04.C25532p;
import q04.C25535s;
import q04.C25536t;
import q04.C35757b;
import q04.C35758l;
import rx3.C13603j;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C64186f0;
import w04.C22850f;
import w04.C26413e;

/* renamed from: n04.h */
public final class C25123h {

    /* renamed from: a */
    public static final C25123h f71559a = new C25123h();

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m31899a(q04.C25532p r3, q04.C25528k r4) {
        /*
            boolean r0 = r3.mo52468n(r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0030
            boolean r0 = r4 instanceof q04.C25521d
            if (r0 != 0) goto L_0x000d
            goto L_0x002d
        L_0x000d:
            q04.d r4 = (q04.C25521d) r4
            q04.c r4 = r3.mo52449a0(r4)
            q04.m r4 = r3.mo52459i(r4)
            boolean r0 = r3.mo52440Q(r4)
            if (r0 != 0) goto L_0x002d
            q04.i r4 = r3.mo52466m(r4)
            q04.k r4 = r3.mo52442S(r4)
            boolean r3 = r3.mo52468n(r4)
            if (r3 == 0) goto L_0x002d
            r3 = 1
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n04.C25123h.m31899a(q04.p, q04.k):boolean");
    }

    /* renamed from: b */
    public static final boolean m31900b(C25532p pVar, C25134i1 i1Var, C25528k kVar, C25528k kVar2, boolean z) {
        boolean z2;
        Collection<C25526i> u = pVar.mo52480u(kVar);
        if ((u instanceof Collection) && u.isEmpty()) {
            return false;
        }
        for (C25526i iVar : u) {
            if (C87412m.m108589b(pVar.mo52485y(iVar), pVar.mo52402e(kVar2)) || (z && m31901i(f71559a, i1Var, kVar2, iVar, false, 8, (Object) null))) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x018f, code lost:
        if (r0 == false) goto L_0x01a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0324 A[LOOP:3: B:162:0x02e9->B:177:0x0324, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0320 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0110  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m31901i(n04.C25123h r26, n04.C25134i1 r27, q04.C25526i r28, q04.C25526i r29, boolean r30, int r31, java.lang.Object r32) {
        /*
            r7 = r27
            r0 = r28
            r1 = r29
            r26.getClass()
            java.lang.String r2 = "state"
            gy3.C87412m.m108594g(r7, r2)
            java.lang.String r8 = "subType"
            gy3.C87412m.m108594g(r0, r8)
            java.lang.String r9 = "superType"
            gy3.C87412m.m108594g(r1, r9)
            r11 = 1
            if (r0 != r1) goto L_0x001e
        L_0x001b:
            r12 = 1
            goto L_0x06b8
        L_0x001e:
            boolean r2 = r27.mo52282b(r28, r29)
            if (r2 != 0) goto L_0x0026
            goto L_0x06f6
        L_0x0026:
            q04.p r12 = r7.f71577c
            n04.m r2 = r7.f71579e
            q04.i r0 = r2.mo52294a(r0)
            q04.i r13 = r7.mo52284d(r0)
            n04.m r0 = r7.f71579e
            q04.i r0 = r0.mo52294a(r1)
            q04.i r14 = r7.mo52284d(r0)
            n04.h r0 = f71559a
            q04.k r15 = r12.mo52474q0(r13)
            q04.k r6 = r12.mo52442S(r14)
            q04.p r5 = r7.f71577c
            boolean r1 = r5.mo52486z(r15)
            r16 = 0
            if (r1 != 0) goto L_0x01b2
            boolean r1 = r5.mo52486z(r6)
            if (r1 == 0) goto L_0x0058
            goto L_0x01b2
        L_0x0058:
            boolean r1 = r5.mo52465l0(r15)
            if (r1 == 0) goto L_0x00b5
            boolean r1 = r5.mo52465l0(r6)
            if (r1 == 0) goto L_0x00b5
            q04.e r0 = r5.mo52473q(r15)
            if (r0 == 0) goto L_0x0070
            q04.k r0 = r5.mo52445W(r0)
            if (r0 != 0) goto L_0x0071
        L_0x0070:
            r0 = r15
        L_0x0071:
            q04.e r1 = r5.mo52473q(r6)
            if (r1 == 0) goto L_0x007d
            q04.k r1 = r5.mo52445W(r1)
            if (r1 != 0) goto L_0x007e
        L_0x007d:
            r1 = r6
        L_0x007e:
            q04.n r0 = r5.mo52402e(r0)
            q04.n r1 = r5.mo52402e(r1)
            if (r0 == r1) goto L_0x0089
            goto L_0x00a2
        L_0x0089:
            boolean r0 = r5.mo52426B(r15)
            if (r0 != 0) goto L_0x0096
            boolean r0 = r5.mo52426B(r6)
            if (r0 == 0) goto L_0x0096
            goto L_0x00a2
        L_0x0096:
            boolean r0 = r5.mo52436M(r15)
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r5.mo52436M(r6)
            if (r0 != 0) goto L_0x00a4
        L_0x00a2:
            r0 = 0
            goto L_0x00a5
        L_0x00a4:
            r0 = 1
        L_0x00a5:
            if (r0 != 0) goto L_0x00ae
            boolean r0 = r7.f71576b
            if (r0 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r0 = 0
            goto L_0x00af
        L_0x00ae:
            r0 = 1
        L_0x00af:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x01e7
        L_0x00b5:
            boolean r1 = r5.mo52443U(r15)
            if (r1 != 0) goto L_0x01ab
            boolean r1 = r5.mo52443U(r6)
            if (r1 == 0) goto L_0x00c3
            goto L_0x01ab
        L_0x00c3:
            q04.e r1 = r5.mo52473q(r6)
            if (r1 == 0) goto L_0x00cf
            q04.k r1 = r5.mo52445W(r1)
            if (r1 != 0) goto L_0x00d0
        L_0x00cf:
            r1 = r6
        L_0x00d0:
            q04.d r1 = r5.mo52401d(r1)
            if (r1 == 0) goto L_0x00db
            q04.i r2 = r5.mo52464l(r1)
            goto L_0x00dd
        L_0x00db:
            r2 = r16
        L_0x00dd:
            if (r1 == 0) goto L_0x0114
            if (r2 == 0) goto L_0x0114
            boolean r1 = r5.mo52436M(r6)
            if (r1 == 0) goto L_0x00ec
            q04.i r1 = r5.mo52470o0(r2, r11)
            goto L_0x00f6
        L_0x00ec:
            boolean r1 = r5.mo52426B(r6)
            if (r1 == 0) goto L_0x00f8
            q04.i r1 = r5.mo52448Z(r2)
        L_0x00f6:
            r3 = r1
            goto L_0x00f9
        L_0x00f8:
            r3 = r2
        L_0x00f9:
            gy3.C87412m.m108594g(r15, r8)
            r4 = 0
            r17 = 8
            r18 = 0
            r1 = r27
            r2 = r15
            r11 = r5
            r5 = r17
            r10 = r6
            r6 = r18
            boolean r0 = m31901i(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0116
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x01e7
        L_0x0114:
            r11 = r5
            r10 = r6
        L_0x0116:
            q04.n r0 = r11.mo52402e(r10)
            boolean r1 = r11.mo52434K(r0)
            if (r1 == 0) goto L_0x015b
            r11.mo52436M(r10)
            java.util.Collection r0 = r11.mo52428D(r0)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0132
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0132
            goto L_0x0154
        L_0x0132:
            java.util.Iterator r10 = r0.iterator()
        L_0x0136:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0154
            java.lang.Object r0 = r10.next()
            r3 = r0
            q04.i r3 = (q04.C25526i) r3
            n04.h r0 = f71559a
            r4 = 0
            r5 = 8
            r6 = 0
            r1 = r27
            r2 = r15
            boolean r0 = m31901i(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0136
            r0 = 0
            goto L_0x0155
        L_0x0154:
            r0 = 1
        L_0x0155:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x01e7
        L_0x015b:
            q04.n r0 = r11.mo52402e(r15)
            boolean r1 = r15 instanceof q04.C25521d
            if (r1 != 0) goto L_0x0191
            boolean r1 = r11.mo52434K(r0)
            if (r1 == 0) goto L_0x01a8
            java.util.Collection r0 = r11.mo52428D(r0)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0178
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0178
            goto L_0x018e
        L_0x0178:
            java.util.Iterator r0 = r0.iterator()
        L_0x017c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x018e
            java.lang.Object r1 = r0.next()
            q04.i r1 = (q04.C25526i) r1
            boolean r1 = r1 instanceof q04.C25521d
            if (r1 != 0) goto L_0x017c
            r0 = 0
            goto L_0x018f
        L_0x018e:
            r0 = 1
        L_0x018f:
            if (r0 == 0) goto L_0x01a8
        L_0x0191:
            n04.h r0 = f71559a
            q04.p r1 = r7.f71577c
            q04.o r0 = r0.mo52265f(r1, r10, r15)
            if (r0 == 0) goto L_0x01a8
            q04.n r1 = r11.mo52402e(r10)
            boolean r0 = r11.mo52447Y(r0, r1)
            if (r0 == 0) goto L_0x01a8
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x01e7
        L_0x01a8:
            r0 = r16
            goto L_0x01e7
        L_0x01ab:
            boolean r0 = r7.f71576b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x01e7
        L_0x01b2:
            r11 = r5
            r10 = r6
            boolean r0 = r7.f71575a
            if (r0 == 0) goto L_0x01bb
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x01e7
        L_0x01bb:
            boolean r0 = r11.mo52436M(r15)
            if (r0 == 0) goto L_0x01ca
            boolean r0 = r11.mo52436M(r10)
            if (r0 != 0) goto L_0x01ca
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x01e7
        L_0x01ca:
            n04.d r0 = n04.C25112d.f71547a
            r1 = 0
            q04.k r2 = r11.mo52400c(r15, r1)
            q04.k r3 = r11.mo52400c(r10, r1)
            java.lang.String r1 = "a"
            gy3.C87412m.m108594g(r2, r1)
            java.lang.String r1 = "b"
            gy3.C87412m.m108594g(r3, r1)
            boolean r0 = r0.mo52246b(r11, r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x01e7:
            if (r0 == 0) goto L_0x01f5
            boolean r10 = r0.booleanValue()
            gy3.C87412m.m108594g(r13, r8)
            gy3.C87412m.m108594g(r14, r9)
            goto L_0x06f7
        L_0x01f5:
            gy3.C87412m.m108594g(r13, r8)
            gy3.C87412m.m108594g(r14, r9)
            q04.k r0 = r12.mo52474q0(r13)
            q04.k r1 = r12.mo52442S(r14)
            q04.p r2 = r7.f71577c
            n04.c r3 = n04.C25108c.f71539a
            gy3.C87412m.m108594g(r0, r8)
            gy3.C87412m.m108594g(r1, r9)
            q04.p r4 = r7.f71577c
            boolean r5 = r4.mo52436M(r1)
            java.lang.String r6 = "current"
            java.lang.String r8 = ". Supertypes = "
            java.lang.String r9 = "Too many supertypes for type: "
            r10 = 1000(0x3e8, float:1.401E-42)
            if (r5 == 0) goto L_0x021f
            goto L_0x0368
        L_0x021f:
            boolean r5 = r4.mo52426B(r0)
            if (r5 != 0) goto L_0x0368
            boolean r5 = r4.mo52438O(r0)
            if (r5 == 0) goto L_0x022d
            goto L_0x0368
        L_0x022d:
            boolean r5 = r0 instanceof q04.C25521d
            if (r5 == 0) goto L_0x023c
            r5 = r0
            q04.d r5 = (q04.C25521d) r5
            boolean r5 = r4.mo52462j0(r5)
            if (r5 == 0) goto L_0x023c
            goto L_0x0368
        L_0x023c:
            n04.i1$b$b r5 = n04.C25134i1.C25135b.C25137b.f71583a
            boolean r5 = r3.mo52241a(r7, r0, r5)
            if (r5 == 0) goto L_0x0246
            goto L_0x0368
        L_0x0246:
            boolean r5 = r4.mo52426B(r1)
            if (r5 == 0) goto L_0x024e
            goto L_0x0366
        L_0x024e:
            n04.i1$b$d r5 = n04.C25134i1.C25135b.C25139d.f71585a
            boolean r3 = r3.mo52241a(r7, r1, r5)
            if (r3 == 0) goto L_0x0258
            goto L_0x0366
        L_0x0258:
            boolean r3 = r4.mo52446X(r0)
            if (r3 == 0) goto L_0x0260
            goto L_0x0366
        L_0x0260:
            q04.n r3 = r4.mo52402e(r1)
            java.lang.String r4 = "end"
            gy3.C87412m.m108594g(r3, r4)
            q04.p r4 = r7.f71577c
            boolean r5 = r4.mo52482v(r0)
            if (r5 == 0) goto L_0x0273
        L_0x0271:
            r5 = 1
            goto L_0x028e
        L_0x0273:
            boolean r5 = r4.mo52436M(r0)
            if (r5 == 0) goto L_0x027b
            r5 = 0
            goto L_0x028e
        L_0x027b:
            boolean r5 = r7.f71576b
            if (r5 == 0) goto L_0x0286
            boolean r5 = r4.mo52443U(r0)
            if (r5 == 0) goto L_0x0286
            goto L_0x0271
        L_0x0286:
            q04.n r5 = r4.mo52402e(r0)
            boolean r5 = r4.mo52431G(r5, r3)
        L_0x028e:
            if (r5 == 0) goto L_0x0292
            goto L_0x0368
        L_0x0292:
            r27.mo52283c()
            java.util.ArrayDeque<q04.k> r5 = r7.f71581g
            gy3.C87412m.m108591d(r5)
            java.util.Set<q04.k> r11 = r7.f71582h
            gy3.C87412m.m108591d(r11)
            r5.push(r0)
        L_0x02a2:
            boolean r12 = r5.isEmpty()
            r13 = 1
            r12 = r12 ^ r13
            if (r12 == 0) goto L_0x0363
            r12 = r11
            w04.f r12 = (w04.C22850f) r12
            int r13 = r12.f65676e
            if (r13 > r10) goto L_0x032e
            java.lang.Object r13 = r5.pop()
            q04.k r13 = (q04.C25528k) r13
            gy3.C87412m.m108593f(r13, r6)
            boolean r12 = r12.add(r13)
            if (r12 == 0) goto L_0x02a2
            boolean r12 = r4.mo52436M(r13)
            if (r12 == 0) goto L_0x02c9
            n04.i1$b$c r12 = n04.C25134i1.C25135b.C25138c.f71584a
            goto L_0x02cb
        L_0x02c9:
            n04.i1$b$b r12 = n04.C25134i1.C25135b.C25137b.f71583a
        L_0x02cb:
            n04.i1$b$c r14 = n04.C25134i1.C25135b.C25138c.f71584a
            boolean r14 = gy3.C87412m.m108589b(r12, r14)
            r15 = 1
            r14 = r14 ^ r15
            if (r14 == 0) goto L_0x02d6
            goto L_0x02d8
        L_0x02d6:
            r12 = r16
        L_0x02d8:
            if (r12 != 0) goto L_0x02db
            goto L_0x032a
        L_0x02db:
            q04.p r14 = r7.f71577c
            q04.n r13 = r14.mo52402e(r13)
            java.util.Collection r13 = r14.mo52428D(r13)
            java.util.Iterator r13 = r13.iterator()
        L_0x02e9:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x032a
            java.lang.Object r14 = r13.next()
            q04.i r14 = (q04.C25526i) r14
            q04.k r14 = r12.mo52285a(r7, r14)
            q04.p r15 = r7.f71577c
            boolean r17 = r15.mo52482v(r14)
            if (r17 == 0) goto L_0x0302
            goto L_0x0314
        L_0x0302:
            boolean r17 = r15.mo52436M(r14)
            if (r17 == 0) goto L_0x030a
            r10 = 0
            goto L_0x031e
        L_0x030a:
            boolean r10 = r7.f71576b
            if (r10 == 0) goto L_0x0316
            boolean r10 = r15.mo52443U(r14)
            if (r10 == 0) goto L_0x0316
        L_0x0314:
            r10 = 1
            goto L_0x031e
        L_0x0316:
            q04.n r10 = r15.mo52402e(r14)
            boolean r10 = r15.mo52431G(r10, r3)
        L_0x031e:
            if (r10 == 0) goto L_0x0324
            r27.mo52281a()
            goto L_0x0368
        L_0x0324:
            r5.add(r14)
            r10 = 1000(0x3e8, float:1.401E-42)
            goto L_0x02e9
        L_0x032a:
            r10 = 1000(0x3e8, float:1.401E-42)
            goto L_0x02a2
        L_0x032e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r0)
            r2.append(r8)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63
            r25 = 0
            r17 = r11
            java.lang.String r0 = sx3.C110818d0.m150921S(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0363:
            r27.mo52281a()
        L_0x0366:
            r3 = 0
            goto L_0x0369
        L_0x0368:
            r3 = 1
        L_0x0369:
            if (r3 != 0) goto L_0x036d
            goto L_0x06f6
        L_0x036d:
            q04.k r3 = r2.mo52474q0(r0)
            q04.k r4 = r2.mo52442S(r1)
            q04.p r5 = r7.f71577c
            boolean r10 = r5.mo52468n(r3)
            if (r10 != 0) goto L_0x0386
            boolean r10 = r5.mo52468n(r4)
            if (r10 != 0) goto L_0x0386
            r10 = 0
            goto L_0x03fb
        L_0x0386:
            boolean r10 = m31899a(r5, r3)
            if (r10 == 0) goto L_0x0397
            boolean r10 = m31899a(r5, r4)
            if (r10 == 0) goto L_0x0397
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r10 = 0
            goto L_0x03fd
        L_0x0397:
            boolean r10 = r5.mo52468n(r3)
            if (r10 == 0) goto L_0x03a7
            r10 = 0
            boolean r3 = m31900b(r5, r7, r3, r4, r10)
            if (r3 == 0) goto L_0x03fb
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x03fd
        L_0x03a7:
            r10 = 0
            boolean r11 = r5.mo52468n(r4)
            if (r11 == 0) goto L_0x03fb
            q04.n r11 = r5.mo52402e(r3)
            boolean r12 = r11 instanceof q04.C25525h
            if (r12 == 0) goto L_0x03ee
            java.util.Collection r11 = r5.mo52428D(r11)
            boolean r12 = r11 instanceof java.util.Collection
            if (r12 == 0) goto L_0x03c5
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x03c5
            goto L_0x03e9
        L_0x03c5:
            java.util.Iterator r11 = r11.iterator()
        L_0x03c9:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x03e9
            java.lang.Object r12 = r11.next()
            q04.i r12 = (q04.C25526i) r12
            q04.k r12 = r5.mo52398a(r12)
            if (r12 == 0) goto L_0x03e4
            boolean r12 = r5.mo52468n(r12)
            r13 = 1
            if (r12 != r13) goto L_0x03e4
            r12 = 1
            goto L_0x03e5
        L_0x03e4:
            r12 = 0
        L_0x03e5:
            if (r12 == 0) goto L_0x03c9
            r11 = 1
            goto L_0x03ea
        L_0x03e9:
            r11 = 0
        L_0x03ea:
            if (r11 == 0) goto L_0x03ee
            r11 = 1
            goto L_0x03ef
        L_0x03ee:
            r11 = 0
        L_0x03ef:
            if (r11 != 0) goto L_0x03f8
            r11 = 1
            boolean r3 = m31900b(r5, r7, r4, r3, r11)
            if (r3 == 0) goto L_0x03fb
        L_0x03f8:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x03fd
        L_0x03fb:
            r3 = r16
        L_0x03fd:
            if (r3 == 0) goto L_0x0405
            boolean r10 = r3.booleanValue()
            goto L_0x06f7
        L_0x0405:
            q04.n r3 = r2.mo52402e(r1)
            q04.n r4 = r2.mo52402e(r0)
            boolean r4 = r2.mo52431G(r4, r3)
            if (r4 == 0) goto L_0x041b
            int r4 = r2.mo52456g0(r3)
            if (r4 != 0) goto L_0x041b
            goto L_0x0640
        L_0x041b:
            q04.n r4 = r2.mo52402e(r1)
            boolean r4 = r2.mo52484x(r4)
            if (r4 == 0) goto L_0x0427
            goto L_0x0640
        L_0x0427:
            n04.h r4 = f71559a
            java.lang.String r5 = "superConstructor"
            gy3.C87412m.m108594g(r3, r5)
            q04.p r5 = r7.f71577c
            boolean r11 = r5.mo52446X(r0)
            if (r11 == 0) goto L_0x043c
            java.util.List r4 = r4.mo52263d(r7, r0, r3)
            goto L_0x0522
        L_0x043c:
            boolean r11 = r5.mo52432I(r3)
            if (r11 != 0) goto L_0x044e
            boolean r11 = r5.mo52435L(r3)
            if (r11 != 0) goto L_0x044e
            java.util.List r4 = r4.mo52262c(r7, r0, r3)
            goto L_0x0522
        L_0x044e:
            w04.e r4 = new w04.e
            r4.<init>()
            r27.mo52283c()
            java.util.ArrayDeque<q04.k> r11 = r7.f71581g
            gy3.C87412m.m108591d(r11)
            java.util.Set<q04.k> r12 = r7.f71582h
            gy3.C87412m.m108591d(r12)
            r11.push(r0)
        L_0x0463:
            boolean r13 = r11.isEmpty()
            r14 = 1
            r13 = r13 ^ r14
            if (r13 == 0) goto L_0x04fa
            r13 = r12
            w04.f r13 = (w04.C22850f) r13
            int r14 = r13.f65676e
            r15 = 1000(0x3e8, float:1.401E-42)
            if (r14 > r15) goto L_0x04c5
            java.lang.Object r14 = r11.pop()
            q04.k r14 = (q04.C25528k) r14
            gy3.C87412m.m108593f(r14, r6)
            boolean r13 = r13.add(r14)
            if (r13 == 0) goto L_0x0463
            boolean r13 = r5.mo52446X(r14)
            if (r13 == 0) goto L_0x048f
            r4.add(r14)
            n04.i1$b$c r13 = n04.C25134i1.C25135b.C25138c.f71584a
            goto L_0x0491
        L_0x048f:
            n04.i1$b$b r13 = n04.C25134i1.C25135b.C25137b.f71583a
        L_0x0491:
            n04.i1$b$c r15 = n04.C25134i1.C25135b.C25138c.f71584a
            boolean r15 = gy3.C87412m.m108589b(r13, r15)
            r17 = 1
            r15 = r15 ^ 1
            if (r15 == 0) goto L_0x049e
            goto L_0x04a0
        L_0x049e:
            r13 = r16
        L_0x04a0:
            if (r13 != 0) goto L_0x04a3
            goto L_0x0463
        L_0x04a3:
            q04.p r15 = r7.f71577c
            q04.n r14 = r15.mo52402e(r14)
            java.util.Collection r14 = r15.mo52428D(r14)
            java.util.Iterator r14 = r14.iterator()
        L_0x04b1:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0463
            java.lang.Object r15 = r14.next()
            q04.i r15 = (q04.C25526i) r15
            q04.k r15 = r13.mo52285a(r7, r15)
            r11.add(r15)
            goto L_0x04b1
        L_0x04c5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r0)
            r2.append(r8)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63
            r25 = 0
            r17 = r12
            java.lang.String r0 = sx3.C110818d0.m150921S(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x04fa:
            r27.mo52281a()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0506:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x0521
            java.lang.Object r11 = r4.next()
            q04.k r11 = (q04.C25528k) r11
            n04.h r12 = f71559a
            java.lang.String r13 = "it"
            gy3.C87412m.m108593f(r11, r13)
            java.util.List r11 = r12.mo52263d(r7, r11, r3)
            sx3.C64175a0.m75508p(r5, r11)
            goto L_0x0506
        L_0x0521:
            r4 = r5
        L_0x0522:
            java.util.ArrayList r5 = new java.util.ArrayList
            r11 = 10
            int r12 = sx3.C36907w.m41090l(r4, r11)
            r5.<init>(r12)
            java.util.Iterator r4 = r4.iterator()
        L_0x0531:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x054d
            java.lang.Object r12 = r4.next()
            q04.k r12 = (q04.C25528k) r12
            q04.i r13 = r7.mo52284d(r12)
            q04.k r13 = r2.mo52398a(r13)
            if (r13 != 0) goto L_0x0548
            goto L_0x0549
        L_0x0548:
            r12 = r13
        L_0x0549:
            r5.add(r12)
            goto L_0x0531
        L_0x054d:
            int r4 = r5.size()
            if (r4 == 0) goto L_0x0624
            r12 = 1
            if (r4 == r12) goto L_0x0612
            q04.a r4 = new q04.a
            int r6 = r2.mo52456g0(r3)
            r4.<init>(r6)
            int r6 = r2.mo52456g0(r3)
            r8 = 0
            r9 = 0
        L_0x0565:
            if (r8 >= r6) goto L_0x05f6
            if (r9 != 0) goto L_0x0578
            q04.o r9 = r2.mo52427C(r3, r8)
            q04.t r9 = r2.mo52460i0(r9)
            q04.t r12 = q04.C25536t.OUT
            if (r9 == r12) goto L_0x0576
            goto L_0x0578
        L_0x0576:
            r9 = 0
            goto L_0x0579
        L_0x0578:
            r9 = 1
        L_0x0579:
            if (r9 != 0) goto L_0x05ef
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = sx3.C36907w.m41090l(r5, r11)
            r12.<init>(r13)
            java.util.Iterator r13 = r5.iterator()
        L_0x0588:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x05e4
            java.lang.Object r14 = r13.next()
            q04.k r14 = (q04.C25528k) r14
            q04.m r15 = r2.mo52433J(r14, r8)
            if (r15 == 0) goto L_0x05b9
            q04.t r10 = r2.mo52441R(r15)
            q04.t r11 = q04.C25536t.INV
            if (r10 != r11) goto L_0x05a4
            r10 = 1
            goto L_0x05a5
        L_0x05a4:
            r10 = 0
        L_0x05a5:
            if (r10 == 0) goto L_0x05a8
            goto L_0x05aa
        L_0x05a8:
            r15 = r16
        L_0x05aa:
            if (r15 == 0) goto L_0x05b9
            q04.i r10 = r2.mo52466m(r15)
            if (r10 == 0) goto L_0x05b9
            r12.add(r10)
            r10 = 0
            r11 = 10
            goto L_0x0588
        L_0x05b9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Incorrect type: "
            r3.append(r4)
            r3.append(r14)
            java.lang.String r4 = ", subType: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", superType: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x05e4:
            q04.i r10 = r2.mo52475r(r12)
            q04.m r10 = r2.mo52463k(r10)
            r4.add(r10)
        L_0x05ef:
            int r8 = r8 + 1
            r10 = 0
            r11 = 10
            goto L_0x0565
        L_0x05f6:
            if (r9 != 0) goto L_0x0601
            n04.h r0 = f71559a
            boolean r0 = r0.mo52267h(r7, r4, r1)
            if (r0 == 0) goto L_0x0601
            goto L_0x0640
        L_0x0601:
            n04.g r0 = new n04.g
            r0.<init>(r5, r7, r2, r1)
            n04.i1$a$a r1 = new n04.i1$a$a
            r1.<init>()
            r0.invoke(r1)
            boolean r10 = r1.f71586a
            goto L_0x06f7
        L_0x0612:
            n04.h r0 = f71559a
            java.lang.Object r3 = sx3.C110818d0.m150914L(r5)
            q04.k r3 = (q04.C25528k) r3
            q04.l r2 = r2.mo52471p(r3)
            boolean r10 = r0.mo52267h(r7, r2, r1)
            goto L_0x06f7
        L_0x0624:
            q04.p r1 = r7.f71577c
            q04.n r2 = r1.mo52402e(r0)
            boolean r3 = r1.mo52432I(r2)
            if (r3 == 0) goto L_0x0636
            boolean r10 = r1.mo52425A(r2)
            goto L_0x06f7
        L_0x0636:
            q04.n r2 = r1.mo52402e(r0)
            boolean r2 = r1.mo52425A(r2)
            if (r2 == 0) goto L_0x0642
        L_0x0640:
            goto L_0x001b
        L_0x0642:
            r27.mo52283c()
            java.util.ArrayDeque<q04.k> r2 = r7.f71581g
            gy3.C87412m.m108591d(r2)
            java.util.Set<q04.k> r3 = r7.f71582h
            gy3.C87412m.m108591d(r3)
            r2.push(r0)
        L_0x0652:
            boolean r4 = r2.isEmpty()
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x06f3
            r4 = r3
            w04.f r4 = (w04.C22850f) r4
            int r5 = r4.f65676e
            r10 = 1000(0x3e8, float:1.401E-42)
            if (r5 > r10) goto L_0x06be
            java.lang.Object r5 = r2.pop()
            q04.k r5 = (q04.C25528k) r5
            gy3.C87412m.m108593f(r5, r6)
            boolean r4 = r4.add(r5)
            if (r4 == 0) goto L_0x0652
            boolean r4 = r1.mo52446X(r5)
            if (r4 == 0) goto L_0x067b
            n04.i1$b$c r4 = n04.C25134i1.C25135b.C25138c.f71584a
            goto L_0x067d
        L_0x067b:
            n04.i1$b$b r4 = n04.C25134i1.C25135b.C25137b.f71583a
        L_0x067d:
            n04.i1$b$c r11 = n04.C25134i1.C25135b.C25138c.f71584a
            boolean r11 = gy3.C87412m.m108589b(r4, r11)
            r12 = 1
            r11 = r11 ^ r12
            if (r11 == 0) goto L_0x0688
            goto L_0x068a
        L_0x0688:
            r4 = r16
        L_0x068a:
            if (r4 != 0) goto L_0x068d
            goto L_0x0652
        L_0x068d:
            q04.p r11 = r7.f71577c
            q04.n r5 = r11.mo52402e(r5)
            java.util.Collection r5 = r11.mo52428D(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x069b:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x0652
            java.lang.Object r11 = r5.next()
            q04.i r11 = (q04.C25526i) r11
            q04.k r11 = r4.mo52285a(r7, r11)
            q04.n r13 = r1.mo52402e(r11)
            boolean r13 = r1.mo52425A(r13)
            if (r13 == 0) goto L_0x06ba
            r27.mo52281a()
        L_0x06b8:
            r10 = 1
            goto L_0x06f7
        L_0x06ba:
            r2.add(r11)
            goto L_0x069b
        L_0x06be:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r0)
            r2.append(r8)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63
            r25 = 0
            r17 = r3
            java.lang.String r0 = sx3.C110818d0.m150921S(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x06f3:
            r27.mo52281a()
        L_0x06f6:
            r10 = 0
        L_0x06f7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n04.C25123h.m31901i(n04.h, n04.i1, q04.i, q04.i, boolean, int, java.lang.Object):boolean");
    }

    /* renamed from: c */
    public final List<C25528k> mo52262c(C25134i1 i1Var, C25528k kVar, C25530n nVar) {
        C25134i1.C25135b bVar;
        C25134i1 i1Var2 = i1Var;
        C25528k kVar2 = kVar;
        C25530n nVar2 = nVar;
        C35757b bVar2 = C35757b.FOR_SUBTYPING;
        C25532p pVar = i1Var2.f71577c;
        List<C25528k> s0 = pVar.mo52477s0(kVar2, nVar2);
        if (s0 != null) {
            return s0;
        }
        if (!pVar.mo52432I(nVar2) && pVar.mo52446X(kVar2)) {
            return C64186f0.f181907d;
        }
        if (!pVar.mo52453e0(nVar2)) {
            C26413e eVar = new C26413e();
            i1Var.mo52283c();
            ArrayDeque<C25528k> arrayDeque = i1Var2.f71581g;
            C87412m.m108591d(arrayDeque);
            Set<C25528k> set = i1Var2.f71582h;
            C87412m.m108591d(set);
            arrayDeque.push(kVar2);
            while (!arrayDeque.isEmpty()) {
                C22850f fVar = (C22850f) set;
                if (fVar.f65676e <= 1000) {
                    C25528k pop = arrayDeque.pop();
                    C87412m.m108593f(pop, "current");
                    if (fVar.add(pop)) {
                        C25528k E = pVar.mo52429E(pop, bVar2);
                        if (E == null) {
                            E = pop;
                        }
                        if (pVar.mo52431G(pVar.mo52402e(E), nVar2)) {
                            eVar.add(E);
                            bVar = C25134i1.C25135b.C25138c.f71584a;
                        } else {
                            bVar = pVar.mo52444V(E) == 0 ? C25134i1.C25135b.C25137b.f71583a : i1Var2.f71577c.mo52469o(E);
                        }
                        if (!(!C87412m.m108589b(bVar, C25134i1.C25135b.C25138c.f71584a))) {
                            bVar = null;
                        }
                        if (bVar != null) {
                            C25532p pVar2 = i1Var2.f71577c;
                            for (C25526i a : pVar2.mo52428D(pVar2.mo52402e(pop))) {
                                arrayDeque.add(bVar.mo52285a(i1Var2, a));
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException(("Too many supertypes for type: " + kVar2 + ". Supertypes = " + C110818d0.m150921S(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null)).toString());
                }
            }
            i1Var.mo52281a();
            return eVar;
        } else if (!pVar.mo52431G(pVar.mo52402e(kVar2), nVar2)) {
            return C64186f0.f181907d;
        } else {
            C25528k E2 = pVar.mo52429E(kVar2, bVar2);
            if (E2 == null) {
                E2 = kVar2;
            }
            return C26236u.m33719b(E2);
        }
    }

    /* renamed from: d */
    public final List<C25528k> mo52263d(C25134i1 i1Var, C25528k kVar, C25530n nVar) {
        List<C25528k> c = mo52262c(i1Var, kVar, nVar);
        C25532p pVar = i1Var.f71577c;
        if (c.size() < 2) {
            return c;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C35758l p = pVar.mo52471p((C25528k) next);
            int P = pVar.mo52439P(p);
            int i = 0;
            while (true) {
                if (i >= P) {
                    break;
                }
                if (!(pVar.mo52450b0(pVar.mo52466m(pVar.mo52467m0(p, i))) == null)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : c;
    }

    /* renamed from: e */
    public final boolean mo52264e(C25134i1 i1Var, C25526i iVar, C25526i iVar2) {
        C87412m.m108594g(i1Var, "state");
        C87412m.m108594g(iVar, "a");
        C87412m.m108594g(iVar2, "b");
        C25532p pVar = i1Var.f71577c;
        if (iVar == iVar2) {
            return true;
        }
        C25123h hVar = f71559a;
        if (hVar.mo52266g(pVar, iVar) && hVar.mo52266g(pVar, iVar2)) {
            C25526i d = i1Var.mo52284d(i1Var.f71579e.mo52294a(iVar));
            C25526i d2 = i1Var.mo52284d(i1Var.f71579e.mo52294a(iVar2));
            C25528k q0 = pVar.mo52474q0(d);
            if (!pVar.mo52431G(pVar.mo52485y(d), pVar.mo52485y(d2))) {
                return false;
            }
            if (pVar.mo52444V(q0) == 0) {
                return pVar.mo52483w(d) || pVar.mo52483w(d2) || pVar.mo52436M(q0) == pVar.mo52436M(pVar.mo52474q0(d2));
            }
        }
        return m31901i(hVar, i1Var, iVar, iVar2, false, 8, (Object) null) && m31901i(hVar, i1Var, iVar2, iVar, false, 8, (Object) null);
    }

    /* renamed from: f */
    public final C25531o mo52265f(C25532p pVar, C25526i iVar, C25526i iVar2) {
        C25526i m;
        int V = pVar.mo52444V(iVar);
        int i = 0;
        while (true) {
            C25529m mVar = null;
            if (i >= V) {
                return null;
            }
            C25529m t = pVar.mo52478t(iVar, i);
            boolean z = true;
            if (!pVar.mo52440Q(t)) {
                mVar = t;
            }
            if (!(mVar == null || (m = pVar.mo52466m(mVar)) == null)) {
                if (!pVar.mo52458h0(pVar.mo52474q0(m)) || !pVar.mo52458h0(pVar.mo52474q0(iVar2))) {
                    z = false;
                }
                if (!C87412m.m108589b(m, iVar2) && (!z || !C87412m.m108589b(pVar.mo52485y(m), pVar.mo52485y(iVar2)))) {
                    C25531o f = mo52265f(pVar, m, iVar2);
                    if (f != null) {
                        return f;
                    }
                }
            }
            i++;
        }
        return pVar.mo52427C(pVar.mo52485y(iVar), i);
    }

    /* renamed from: g */
    public final boolean mo52266g(C25532p pVar, C25526i iVar) {
        return pVar.mo52430F(pVar.mo52485y(iVar)) && !pVar.mo52457h(iVar) && !pVar.mo52426B(iVar) && !pVar.mo52438O(iVar) && C87412m.m108589b(pVar.mo52402e(pVar.mo52474q0(iVar)), pVar.mo52402e(pVar.mo52442S(iVar)));
    }

    /* renamed from: h */
    public final boolean mo52267h(C25134i1 i1Var, C35758l lVar, C25528k kVar) {
        boolean z;
        C25134i1 i1Var2 = i1Var;
        C35758l lVar2 = lVar;
        C25528k kVar2 = kVar;
        C87412m.m108594g(i1Var2, "<this>");
        C87412m.m108594g(lVar2, "capturedSubArguments");
        C87412m.m108594g(kVar2, "superType");
        C25532p pVar = i1Var2.f71577c;
        C25530n e = pVar.mo52402e(kVar2);
        int P = pVar.mo52439P(lVar2);
        int g0 = pVar.mo52456g0(e);
        if (P != g0 || P != pVar.mo52444V(kVar2)) {
            return false;
        }
        for (int i = 0; i < g0; i++) {
            C25529m t = pVar.mo52478t(kVar2, i);
            if (!pVar.mo52440Q(t)) {
                C25526i m = pVar.mo52466m(t);
                C25529m m0 = pVar.mo52467m0(lVar2, i);
                pVar.mo52441R(m0);
                C25536t tVar = C25536t.INV;
                C25526i m2 = pVar.mo52466m(m0);
                C25123h hVar = f71559a;
                C25536t i0 = pVar.mo52460i0(pVar.mo52427C(e, i));
                C25536t R = pVar.mo52441R(t);
                C87412m.m108594g(i0, "declared");
                C87412m.m108594g(R, "useSite");
                if (i0 == tVar) {
                    i0 = R;
                } else if (!(R == tVar || i0 == R)) {
                    i0 = null;
                }
                if (i0 == null) {
                    return i1Var2.f71575a;
                }
                if (!(i0 == tVar && (hVar.mo52268j(pVar, m2, m, e) || hVar.mo52268j(pVar, m, m2, e)))) {
                    int i2 = i1Var2.f71580f;
                    if (i2 <= 100) {
                        i1Var2.f71580f = i2 + 1;
                        int ordinal = i0.ordinal();
                        if (ordinal == 0) {
                            z = m31901i(hVar, i1Var, m, m2, false, 8, (Object) null);
                        } else if (ordinal == 1) {
                            z = m31901i(hVar, i1Var, m2, m, false, 8, (Object) null);
                        } else if (ordinal == 2) {
                            z = hVar.mo52264e(i1Var2, m2, m);
                        } else {
                            throw new C13603j();
                        }
                        i1Var2.f71580f--;
                        if (!z) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + m2).toString());
                    }
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo52268j(C25532p pVar, C25526i iVar, C25526i iVar2, C25530n nVar) {
        C25531o p0;
        C25528k a = pVar.mo52398a(iVar);
        if (!(a instanceof C25521d)) {
            return false;
        }
        C25521d dVar = (C25521d) a;
        if (pVar.mo52437N(dVar) || !pVar.mo52440Q(pVar.mo52459i(pVar.mo52449a0(dVar))) || pVar.mo52454f0(dVar) != C35757b.FOR_SUBTYPING) {
            return false;
        }
        C25530n y = pVar.mo52485y(iVar2);
        C25535s sVar = y instanceof C25535s ? (C25535s) y : null;
        return (sVar == null || (p0 = pVar.mo52472p0(sVar)) == null || !pVar.mo52447Y(p0, nVar)) ? false : true;
    }
}
