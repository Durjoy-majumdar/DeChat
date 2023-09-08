package nz3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fz3.C24498c;
import gy3.C8480h;
import gy3.C87412m;
import iz3.C24651h;
import java.util.ArrayList;
import java.util.Collection;
import n04.C25143j0;
import sx3.C36907w;
import wy3.C26436b;
import xy3.C26564a;

/* renamed from: nz3.s */
public final class C25304s {

    /* renamed from: a */
    public final C25264f f71796a;

    public C25304s(C25264f fVar) {
        C87412m.m108594g(fVar, "typeEnhancement");
        this.f71796a = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02bb, code lost:
        if ((r1 != null && r1.f70075c) != false) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0496, code lost:
        if (r1 != false) goto L_0x0498;
     */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x049d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n04.C25143j0 mo52386a(nz3.C25308u r26, n04.C25143j0 r27, java.util.List<? extends n04.C25143j0> r28, nz3.C25309w r29, boolean r30) {
        /*
            r25 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            nz3.j r3 = nz3.C25269j.FORCE_FLEXIBILITY
            nz3.j r4 = nz3.C25269j.NOT_NULL
            nz3.j r5 = nz3.C25269j.NULLABLE
            r6 = r25
            nz3.f r7 = r6.f71796a
            r26.getClass()
            nz3.h r8 = nz3.C117642h.MUTABLE
            nz3.h r9 = nz3.C117642h.READ_ONLY
            java.lang.String r10 = "<this>"
            gy3.C87412m.m108594g(r1, r10)
            java.lang.String r10 = "overrides"
            gy3.C87412m.m108594g(r2, r10)
            java.util.List r10 = r26.mo52377d(r27)
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = sx3.C36907w.m41090l(r2, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r28.iterator()
        L_0x0034:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0048
            java.lang.Object r13 = r12.next()
            q04.i r13 = (q04.C25526i) r13
            java.util.List r13 = r0.mo52377d(r13)
            r11.add(r13)
            goto L_0x0034
        L_0x0048:
            boolean r12 = r0.f71805b
            r14 = 1
            if (r12 == 0) goto L_0x007f
            boolean r12 = r28.isEmpty()
            if (r12 == 0) goto L_0x0054
            goto L_0x007a
        L_0x0054:
            java.util.Iterator r2 = r28.iterator()
        L_0x0058:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x007a
            java.lang.Object r12 = r2.next()
            q04.i r12 = (q04.C25526i) r12
            java.lang.String r15 = "other"
            gy3.C87412m.m108594g(r12, r15)
            iz3.h r15 = r0.f71806c
            iz3.c r15 = r15.f70290a
            o04.k r15 = r15.f70276u
            n04.j0 r12 = (n04.C25143j0) r12
            boolean r12 = r15.mo52404a(r1, r12)
            r12 = r12 ^ r14
            if (r12 == 0) goto L_0x0058
            r2 = 1
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            if (r2 == 0) goto L_0x007f
            r2 = 1
            goto L_0x0080
        L_0x007f:
            r2 = 0
        L_0x0080:
            if (r2 == 0) goto L_0x0084
            r2 = 1
            goto L_0x008b
        L_0x0084:
            r2 = r10
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
        L_0x008b:
            nz3.g[] r12 = new nz3.C25267g[r2]
            r15 = 0
        L_0x008e:
            if (r15 >= r2) goto L_0x04bc
            r13 = r10
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r13 = r13.get(r15)
            nz3.a$a r13 = (nz3.C25257a.C25258a) r13
            q04.i r14 = r13.f71727a
            if (r14 != 0) goto L_0x00bd
            o04.o r14 = o04.C25335o.f71846a
            q04.o r1 = r13.f71729c
            if (r1 == 0) goto L_0x00a8
            q04.t r1 = o04.C25315b.C25316a.m32222C(r14, r1)
            goto L_0x00a9
        L_0x00a8:
            r1 = 0
        L_0x00a9:
            q04.t r14 = q04.C25536t.IN
            if (r1 != r14) goto L_0x00bd
            nz3.g r1 = nz3.C25267g.f71742e
            r17 = r2
            r19 = r7
            r22 = r8
            r23 = r9
            r18 = r10
            r20 = r12
            goto L_0x0272
        L_0x00bd:
            q04.o r1 = r13.f71729c
            if (r1 != 0) goto L_0x00c3
            r1 = 1
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            q04.i r14 = r13.f71727a
            if (r14 == 0) goto L_0x00cf
            n04.j0 r14 = (n04.C25143j0) r14
            xy3.h r14 = r14.getAnnotations()
            goto L_0x00d1
        L_0x00cf:
            sx3.f0 r14 = sx3.C64186f0.f181907d
        L_0x00d1:
            r17 = r2
            o04.o r2 = o04.C25335o.f71846a
            q04.i r6 = r13.f71727a
            if (r6 == 0) goto L_0x00e4
            q04.n r6 = o04.C25315b.C25316a.m32269l0(r2, r6)
            if (r6 == 0) goto L_0x00e4
            q04.o r2 = o04.C25315b.C25316a.m32287y(r2, r6)
            goto L_0x00e5
        L_0x00e4:
            r2 = 0
        L_0x00e5:
            fz3.c r6 = r0.f71807d
            r18 = r10
            fz3.c r10 = fz3.C24498c.TYPE_PARAMETER_BOUNDS
            if (r6 != r10) goto L_0x00ef
            r6 = 1
            goto L_0x00f0
        L_0x00ef:
            r6 = 0
        L_0x00f0:
            if (r1 != 0) goto L_0x00fc
            r19 = r7
            r22 = r8
            r23 = r9
            r20 = r12
            goto L_0x01d6
        L_0x00fc:
            if (r6 != 0) goto L_0x01bd
            iz3.h r10 = r0.f71806c
            iz3.c r10 = r10.f70290a
            iz3.d r10 = r10.f70275t
            boolean r10 = r10.mo51475c()
            if (r10 == 0) goto L_0x01bd
            q04.i r10 = r13.f71727a
            if (r10 == 0) goto L_0x012a
            n04.j0 r10 = (n04.C25143j0) r10
            boolean r19 = ty3.C26336h.m33842z(r10)
            if (r19 != 0) goto L_0x0122
            boolean r10 = ty3.C26336h.m33830G(r10)
            if (r10 == 0) goto L_0x011d
            goto L_0x0122
        L_0x011d:
            r19 = r7
            r7 = 1
            r10 = 0
            goto L_0x0126
        L_0x0122:
            r19 = r7
            r7 = 1
            r10 = 1
        L_0x0126:
            if (r10 != r7) goto L_0x012c
            r7 = 1
            goto L_0x012d
        L_0x012a:
            r19 = r7
        L_0x012c:
            r7 = 0
        L_0x012d:
            if (r7 == 0) goto L_0x01bf
            xy3.a r7 = r0.f71804a
            if (r7 == 0) goto L_0x013a
            xy3.h r7 = r7.getAnnotations()
            if (r7 == 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            sx3.f0 r7 = sx3.C64186f0.f181907d
        L_0x013c:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0145:
            boolean r20 = r7.hasNext()
            if (r20 == 0) goto L_0x01b2
            r20 = r12
            java.lang.Object r12 = r7.next()
            r21 = r7
            iz3.h r7 = r0.f71806c
            iz3.c r7 = r7.f70290a
            fz3.e r7 = r7.f70272q
            r7.getClass()
            r22 = r8
            java.lang.String r8 = "annotation"
            gy3.C87412m.m108594g(r12, r8)
            vz3.c r8 = ty3.C26343l.C26344a.f73431u
            java.lang.Object r8 = r7.mo51184d(r12, r8)
            if (r8 != 0) goto L_0x016e
            r23 = r9
            goto L_0x019f
        L_0x016e:
            r23 = r9
            r9 = 0
            java.lang.Iterable r7 = r7.mo51181a(r8, r9)
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x017f
            goto L_0x019f
        L_0x017f:
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0185:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x019f
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.HashMap<java.lang.String, xy3.o> r9 = xy3.C26582o.f73966e
            java.lang.String r9 = "TYPE"
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x0185
            r7 = 1
            r16 = 1
            goto L_0x01a2
        L_0x019f:
            r7 = 1
            r16 = 0
        L_0x01a2:
            r8 = r16 ^ 1
            if (r8 == 0) goto L_0x01a9
            r10.add(r12)
        L_0x01a9:
            r12 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            goto L_0x0145
        L_0x01b2:
            r22 = r8
            r23 = r9
            r20 = r12
            java.util.List r14 = sx3.C110818d0.m150933e0(r10, r14)
            goto L_0x01d6
        L_0x01bd:
            r19 = r7
        L_0x01bf:
            r22 = r8
            r23 = r9
            r20 = r12
            xy3.a r7 = r0.f71804a
            if (r7 == 0) goto L_0x01d0
            xy3.h r7 = r7.getAnnotations()
            if (r7 == 0) goto L_0x01d0
            goto L_0x01d2
        L_0x01d0:
            sx3.f0 r7 = sx3.C64186f0.f181907d
        L_0x01d2:
            java.util.List r14 = sx3.C110818d0.m150931c0(r7, r14)
        L_0x01d6:
            iz3.h r7 = r0.f71806c
            iz3.c r7 = r7.f70290a
            fz3.e r7 = r7.f70272q
            r7.getClass()
            java.util.Iterator r8 = r14.iterator()
            r9 = 0
        L_0x01e4:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x020f
            java.lang.Object r10 = r8.next()
            vz3.c r10 = r7.mo51185e(r10)
            java.util.Set<vz3.c> r12 = fz3.C24504g0.f70059m
            boolean r12 = r12.contains(r10)
            if (r12 == 0) goto L_0x01fd
            r10 = r23
            goto L_0x0207
        L_0x01fd:
            java.util.Set<vz3.c> r12 = fz3.C24504g0.f70060n
            boolean r10 = r12.contains(r10)
            if (r10 == 0) goto L_0x01e4
            r10 = r22
        L_0x0207:
            if (r9 == 0) goto L_0x020d
            if (r9 == r10) goto L_0x020d
            r9 = 0
            goto L_0x020f
        L_0x020d:
            r9 = r10
            goto L_0x01e4
        L_0x020f:
            iz3.h r7 = r0.f71806c
            iz3.c r7 = r7.f70290a
            fz3.e r7 = r7.f70272q
            nz3.c r8 = new nz3.c
            r8.<init>(r0)
            r7.getClass()
            java.util.Iterator r10 = r14.iterator()
            r12 = 0
        L_0x0222:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x0260
            java.lang.Object r14 = r10.next()
            nz3.k r14 = r7.mo51183c(r14, r8)
            if (r12 != 0) goto L_0x0237
            r21 = r7
            r24 = r8
            goto L_0x0253
        L_0x0237:
            if (r14 == 0) goto L_0x0257
            boolean r21 = gy3.C87412m.m108589b(r14, r12)
            if (r21 == 0) goto L_0x0240
            goto L_0x0257
        L_0x0240:
            r21 = r7
            boolean r7 = r14.f71753b
            r24 = r8
            if (r7 == 0) goto L_0x024d
            boolean r8 = r12.f71753b
            if (r8 != 0) goto L_0x024d
            goto L_0x025b
        L_0x024d:
            if (r7 != 0) goto L_0x0255
            boolean r7 = r12.f71753b
            if (r7 == 0) goto L_0x0255
        L_0x0253:
            r12 = r14
            goto L_0x025b
        L_0x0255:
            r12 = 0
            goto L_0x0260
        L_0x0257:
            r21 = r7
            r24 = r8
        L_0x025b:
            r7 = r21
            r8 = r24
            goto L_0x0222
        L_0x0260:
            if (r12 == 0) goto L_0x0276
            nz3.g r1 = new nz3.g
            nz3.j r6 = r12.f71752a
            if (r6 != r4) goto L_0x026c
            if (r2 == 0) goto L_0x026c
            r2 = 1
            goto L_0x026d
        L_0x026c:
            r2 = 0
        L_0x026d:
            boolean r7 = r12.f71753b
            r1.<init>(r6, r9, r2, r7)
        L_0x0272:
            r6 = 0
            r10 = 1
            goto L_0x031d
        L_0x0276:
            if (r1 != 0) goto L_0x027e
            if (r6 == 0) goto L_0x027b
            goto L_0x027e
        L_0x027b:
            fz3.c r1 = fz3.C24498c.TYPE_USE
            goto L_0x0280
        L_0x027e:
            fz3.c r1 = r0.f71807d
        L_0x0280:
            fz3.b0 r6 = r13.f71728b
            if (r6 == 0) goto L_0x028d
            java.util.EnumMap<fz3.c, fz3.u> r6 = r6.f70009a
            java.lang.Object r1 = r6.get(r1)
            fz3.u r1 = (fz3.C24516u) r1
            goto L_0x028e
        L_0x028d:
            r1 = 0
        L_0x028e:
            if (r2 == 0) goto L_0x0295
            nz3.k r6 = r0.mo52375b(r2)
            goto L_0x0296
        L_0x0295:
            r6 = 0
        L_0x0296:
            r7 = 2
            if (r6 == 0) goto L_0x02a1
            r8 = 0
            r10 = 0
            nz3.k r12 = nz3.C25270k.m32202a(r6, r4, r10, r7, r8)
            r8 = r12
            goto L_0x02a7
        L_0x02a1:
            if (r1 == 0) goto L_0x02a6
            nz3.k r8 = r1.f70073a
            goto L_0x02a7
        L_0x02a6:
            r8 = 0
        L_0x02a7:
            if (r6 == 0) goto L_0x02ac
            nz3.j r6 = r6.f71752a
            goto L_0x02ad
        L_0x02ac:
            r6 = 0
        L_0x02ad:
            if (r6 == r4) goto L_0x02c0
            if (r2 == 0) goto L_0x02be
            if (r1 == 0) goto L_0x02ba
            boolean r1 = r1.f70075c
            r2 = 1
            if (r1 != r2) goto L_0x02ba
            r1 = 1
            goto L_0x02bb
        L_0x02ba:
            r1 = 0
        L_0x02bb:
            if (r1 == 0) goto L_0x02be
            goto L_0x02c0
        L_0x02be:
            r1 = 0
            goto L_0x02c1
        L_0x02c0:
            r1 = 1
        L_0x02c1:
            q04.o r2 = r13.f71729c
            if (r2 == 0) goto L_0x02d8
            nz3.k r2 = r0.mo52375b(r2)
            if (r2 == 0) goto L_0x02d8
            nz3.j r6 = r2.f71752a
            if (r6 != r5) goto L_0x02d6
            r6 = 0
            r10 = 0
            nz3.k r2 = nz3.C25270k.m32202a(r2, r3, r10, r7, r6)
            goto L_0x02da
        L_0x02d6:
            r6 = 0
            goto L_0x02da
        L_0x02d8:
            r6 = 0
            r2 = r6
        L_0x02da:
            if (r2 != 0) goto L_0x02dd
            goto L_0x0306
        L_0x02dd:
            if (r8 != 0) goto L_0x02e0
            goto L_0x0305
        L_0x02e0:
            boolean r7 = r2.f71753b
            if (r7 == 0) goto L_0x02e9
            boolean r10 = r8.f71753b
            if (r10 != 0) goto L_0x02e9
            goto L_0x0306
        L_0x02e9:
            if (r7 != 0) goto L_0x02f0
            boolean r7 = r8.f71753b
            if (r7 == 0) goto L_0x02f0
            goto L_0x0305
        L_0x02f0:
            nz3.j r7 = r2.f71752a
            nz3.j r10 = r8.f71752a
            int r7 = r7.compareTo(r10)
            if (r7 >= 0) goto L_0x02fb
            goto L_0x0306
        L_0x02fb:
            nz3.j r7 = r2.f71752a
            nz3.j r10 = r8.f71752a
            int r7 = r7.compareTo(r10)
            if (r7 <= 0) goto L_0x0306
        L_0x0305:
            r8 = r2
        L_0x0306:
            nz3.g r2 = new nz3.g
            if (r8 == 0) goto L_0x030d
            nz3.j r7 = r8.f71752a
            goto L_0x030e
        L_0x030d:
            r7 = r6
        L_0x030e:
            if (r8 == 0) goto L_0x0317
            boolean r8 = r8.f71753b
            r10 = 1
            if (r8 != r10) goto L_0x0318
            r8 = 1
            goto L_0x0319
        L_0x0317:
            r10 = 1
        L_0x0318:
            r8 = 0
        L_0x0319:
            r2.<init>(r7, r9, r1, r8)
            r1 = r2
        L_0x031d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r11.iterator()
        L_0x0326:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x03a9
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = sx3.C110818d0.m150917O(r8, r15)
            nz3.a$a r8 = (nz3.C25257a.C25258a) r8
            if (r8 == 0) goto L_0x03a0
            q04.i r8 = r8.f71727a
            if (r8 == 0) goto L_0x03a0
            nz3.j r9 = r0.mo52376c(r8)
            if (r9 != 0) goto L_0x0354
            r12 = r8
            n04.j0 r12 = (n04.C25143j0) r12
            n04.j0 r12 = n04.C25194x1.m32120a(r12)
            if (r12 == 0) goto L_0x0352
            nz3.j r12 = r0.mo52376c(r12)
            goto L_0x0355
        L_0x0352:
            r12 = r6
            goto L_0x0355
        L_0x0354:
            r12 = r9
        L_0x0355:
            o04.o r13 = o04.C25335o.f71846a
            vy3.c r14 = vy3.C26384c.f73585a
            q04.k r14 = o04.C25315b.C25316a.m32247a0(r13, r8)
            vz3.d r14 = r0.mo52393e(r14)
            java.util.HashMap<vz3.d, vz3.c> r6 = vy3.C26384c.f73596l
            boolean r6 = r6.containsKey(r14)
            if (r6 == 0) goto L_0x036c
            r6 = r23
            goto L_0x0380
        L_0x036c:
            q04.k r6 = o04.C25315b.C25316a.m32275o0(r13, r8)
            vz3.d r6 = r0.mo52393e(r6)
            java.util.HashMap<vz3.d, vz3.c> r14 = vy3.C26384c.f73595k
            boolean r6 = r14.containsKey(r6)
            if (r6 == 0) goto L_0x037f
            r6 = r22
            goto L_0x0380
        L_0x037f:
            r6 = 0
        L_0x0380:
            boolean r13 = o04.C25315b.C25316a.m32230K(r13, r8)
            if (r13 != 0) goto L_0x0393
            n04.j0 r8 = (n04.C25143j0) r8
            n04.y1 r8 = r8.mo52229N0()
            boolean r8 = r8 instanceof nz3.C25268i
            if (r8 == 0) goto L_0x0391
            goto L_0x0393
        L_0x0391:
            r8 = 0
            goto L_0x0394
        L_0x0393:
            r8 = 1
        L_0x0394:
            nz3.g r13 = new nz3.g
            if (r12 == r9) goto L_0x039a
            r9 = 1
            goto L_0x039b
        L_0x039a:
            r9 = 0
        L_0x039b:
            r13.<init>(r12, r6, r8, r9)
            r8 = r13
            goto L_0x03a1
        L_0x03a0:
            r8 = 0
        L_0x03a1:
            if (r8 == 0) goto L_0x03a6
            r2.add(r8)
        L_0x03a6:
            r6 = 0
            goto L_0x0326
        L_0x03a9:
            if (r15 != 0) goto L_0x03b1
            boolean r6 = r0.f71805b
            if (r6 == 0) goto L_0x03b1
            r7 = 1
            goto L_0x03b2
        L_0x03b1:
            r7 = 0
        L_0x03b2:
            if (r15 != 0) goto L_0x03c9
            xy3.a r6 = r0.f71804a
            boolean r8 = r6 instanceof wy3.C26463h1
            if (r8 == 0) goto L_0x03c4
            wy3.h1 r6 = (wy3.C26463h1) r6
            n04.j0 r6 = r6.mo53440S()
            if (r6 == 0) goto L_0x03c4
            r6 = 1
            goto L_0x03c5
        L_0x03c4:
            r6 = 0
        L_0x03c5:
            if (r6 == 0) goto L_0x03c9
            r6 = 1
            goto L_0x03ca
        L_0x03c9:
            r6 = 0
        L_0x03ca:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r2.iterator()
        L_0x03d3:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x03ed
            java.lang.Object r12 = r9.next()
            nz3.g r12 = (nz3.C25267g) r12
            boolean r13 = r12.f71746d
            if (r13 == 0) goto L_0x03e5
            r12 = 0
            goto L_0x03e7
        L_0x03e5:
            nz3.j r12 = r12.f71743a
        L_0x03e7:
            if (r12 == 0) goto L_0x03d3
            r8.add(r12)
            goto L_0x03d3
        L_0x03ed:
            java.util.Set r8 = sx3.C110818d0.m150904D0(r8)
            boolean r9 = r1.f71746d
            if (r9 == 0) goto L_0x03f7
            r9 = 0
            goto L_0x03f9
        L_0x03f7:
            nz3.j r9 = r1.f71743a
        L_0x03f9:
            if (r9 != r3) goto L_0x03fd
            r8 = r3
            goto L_0x0403
        L_0x03fd:
            java.lang.Object r8 = nz3.C21722y.m24675a(r8, r4, r5, r9, r7)
            nz3.j r8 = (nz3.C25269j) r8
        L_0x0403:
            if (r8 != 0) goto L_0x0433
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r12 = r2.iterator()
        L_0x040e:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0422
            java.lang.Object r13 = r12.next()
            nz3.g r13 = (nz3.C25267g) r13
            nz3.j r13 = r13.f71743a
            if (r13 == 0) goto L_0x040e
            r9.add(r13)
            goto L_0x040e
        L_0x0422:
            java.util.Set r9 = sx3.C110818d0.m150904D0(r9)
            nz3.j r12 = r1.f71743a
            if (r12 != r3) goto L_0x042c
            r9 = r3
            goto L_0x0434
        L_0x042c:
            java.lang.Object r9 = nz3.C21722y.m24675a(r9, r4, r5, r12, r7)
            nz3.j r9 = (nz3.C25269j) r9
            goto L_0x0434
        L_0x0433:
            r9 = r8
        L_0x0434:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r2.iterator()
        L_0x043d:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0451
            java.lang.Object r14 = r13.next()
            nz3.g r14 = (nz3.C25267g) r14
            nz3.h r14 = r14.f71744b
            if (r14 == 0) goto L_0x043d
            r12.add(r14)
            goto L_0x043d
        L_0x0451:
            java.util.Set r12 = sx3.C110818d0.m150904D0(r12)
            nz3.h r13 = r1.f71744b
            r14 = r22
            r10 = r23
            java.lang.Object r7 = nz3.C21722y.m24675a(r12, r14, r10, r13, r7)
            nz3.h r7 = (nz3.C117642h) r7
            if (r9 == 0) goto L_0x0471
            if (r30 != 0) goto L_0x046c
            if (r6 == 0) goto L_0x046a
            if (r9 != r5) goto L_0x046a
            goto L_0x046c
        L_0x046a:
            r6 = 0
            goto L_0x046d
        L_0x046c:
            r6 = 1
        L_0x046d:
            if (r6 != 0) goto L_0x0471
            r6 = r9
            goto L_0x0472
        L_0x0471:
            r6 = 0
        L_0x0472:
            if (r6 != r4) goto L_0x049a
            boolean r1 = r1.f71745c
            if (r1 != 0) goto L_0x0498
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x047f
            goto L_0x0495
        L_0x047f:
            java.util.Iterator r1 = r2.iterator()
        L_0x0483:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0495
            java.lang.Object r2 = r1.next()
            nz3.g r2 = (nz3.C25267g) r2
            boolean r2 = r2.f71745c
            if (r2 == 0) goto L_0x0483
            r1 = 1
            goto L_0x0496
        L_0x0495:
            r1 = 0
        L_0x0496:
            if (r1 == 0) goto L_0x049a
        L_0x0498:
            r1 = 1
            goto L_0x049b
        L_0x049a:
            r1 = 0
        L_0x049b:
            if (r6 == 0) goto L_0x04a1
            if (r8 == r9) goto L_0x04a1
            r2 = 1
            goto L_0x04a2
        L_0x04a1:
            r2 = 0
        L_0x04a2:
            nz3.g r8 = new nz3.g
            r8.<init>(r6, r7, r1, r2)
            r20[r15] = r8
            int r15 = r15 + 1
            r6 = r25
            r1 = r27
            r9 = r10
            r8 = r14
            r2 = r17
            r10 = r18
            r7 = r19
            r12 = r20
            r14 = 1
            goto L_0x008e
        L_0x04bc:
            r19 = r7
            r20 = r12
            nz3.b r1 = new nz3.b
            r2 = r29
            r3 = r20
            r1.<init>(r2, r3)
            boolean r0 = r0.f71808e
            r19.getClass()
            n04.y1 r2 = r27.mo52229N0()
            r3 = r19
            r4 = 0
            nz3.f$a r0 = r3.mo52381b(r2, r1, r4, r0)
            n04.j0 r0 = r0.f71737a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nz3.C25304s.mo52386a(nz3.u, n04.j0, java.util.List, nz3.w, boolean):n04.j0");
    }

    /* renamed from: b */
    public final C25143j0 mo52387b(C26436b bVar, C26564a aVar, boolean z, C24651h hVar, C24498c cVar, C25309w wVar, boolean z2, C32226l<? super C26436b, ? extends C25143j0> lVar) {
        C32226l<? super C26436b, ? extends C25143j0> lVar2 = lVar;
        C25308u uVar = new C25308u(aVar, z, hVar, cVar, false, 16, (C8480h) null);
        C26436b bVar2 = bVar;
        C25143j0 j0Var = (C25143j0) lVar2.invoke(bVar);
        Collection<? extends C26436b> e = bVar.mo52633e();
        C87412m.m108593f(e, "overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(e, 10));
        for (C26436b bVar3 : e) {
            C87412m.m108593f(bVar3, LocaleUtil.ITALIAN);
            arrayList.add((C25143j0) lVar2.invoke(bVar3));
        }
        return mo52386a(uVar, j0Var, arrayList, wVar, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: nz3.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: nz3.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: nz3.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: nz3.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: nz3.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: nz3.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: nz3.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: nz3.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: nz3.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: zy3.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: hz3.e} */
    /* JADX WARNING: type inference failed for: r9v1, types: [zy3.n, wy3.w] */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02ee, code lost:
        if (r9 == null) goto L_0x02f1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d9  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <D extends wy3.C26436b> java.util.Collection<D> mo52388c(iz3.C24651h r26, java.util.Collection<? extends D> r27) {
        /*
            r25 = this;
            r0 = r26
            r1 = r27
            fz3.c r10 = fz3.C24498c.VALUE_PARAMETER
            java.lang.String r2 = "c"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "platformSignatures"
            gy3.C87412m.m108594g(r1, r2)
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r2 = sx3.C36907w.m41090l(r1, r12)
            r11.<init>(r2)
            java.util.Iterator r13 = r27.iterator()
        L_0x001f:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0362
            java.lang.Object r1 = r13.next()
            r15 = r1
            wy3.b r15 = (wy3.C26436b) r15
            boolean r1 = r15 instanceof hz3.C24607a
            if (r1 != 0) goto L_0x0035
        L_0x0030:
            r23 = r13
            r4 = r15
            goto L_0x02f1
        L_0x0035:
            r1 = r15
            hz3.a r1 = (hz3.C24607a) r1
            wy3.b$a r2 = r1.mo52634f()
            wy3.b$a r3 = wy3.C26436b.C26437a.FAKE_OVERRIDE
            r14 = 1
            if (r2 != r3) goto L_0x0050
            wy3.b r1 = r1.mo36109a()
            java.util.Collection r1 = r1.mo52633e()
            int r1 = r1.size()
            if (r1 != r14) goto L_0x0050
            goto L_0x0030
        L_0x0050:
            wy3.h r1 = wy3.C26489q.m34174a(r15)
            r9 = 0
            r8 = 0
            if (r1 != 0) goto L_0x005e
            xy3.h r1 = r15.getAnnotations()
            goto L_0x00c3
        L_0x005e:
            boolean r2 = r1 instanceof jz3.C24803f
            if (r2 == 0) goto L_0x0065
            jz3.f r1 = (jz3.C24803f) r1
            goto L_0x0066
        L_0x0065:
            r1 = r9
        L_0x0066:
            if (r1 == 0) goto L_0x0073
            rx3.g r1 = r1.f70738r
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            goto L_0x0074
        L_0x0073:
            r1 = r9
        L_0x0074:
            if (r1 == 0) goto L_0x007f
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r2 = 0
            goto L_0x0080
        L_0x007f:
            r2 = 1
        L_0x0080:
            if (r2 == 0) goto L_0x0087
            xy3.h r1 = r15.getAnnotations()
            goto L_0x00c3
        L_0x0087:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = sx3.C36907w.m41090l(r1, r12)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0094:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00a9
            java.lang.Object r3 = r1.next()
            mz3.a r3 = (mz3.C25048a) r3
            jz3.e r4 = new jz3.e
            r4.<init>(r0, r3, r14)
            r2.add(r4)
            goto L_0x0094
        L_0x00a9:
            xy3.h r1 = r15.getAnnotations()
            java.util.List r1 = sx3.C110818d0.m150931c0(r1, r2)
            r2 = r1
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00bd
            xy3.h r1 = xy3.C26571h.C26572a.f73937a
            goto L_0x00c3
        L_0x00bd:
            xy3.i r2 = new xy3.i
            r2.<init>(r1)
            r1 = r2
        L_0x00c3:
            iz3.h r7 = iz3.C24641b.m30820b(r0, r1)
            boolean r1 = r15 instanceof hz3.C24614f
            if (r1 == 0) goto L_0x00e0
            r1 = r15
            hz3.f r1 = (hz3.C24614f) r1
            zy3.h0 r1 = r1.f74364D
            if (r1 == 0) goto L_0x00d8
            boolean r2 = r1.f74340h
            if (r2 != 0) goto L_0x00d8
            r2 = 1
            goto L_0x00d9
        L_0x00d8:
            r2 = 0
        L_0x00d9:
            if (r2 == 0) goto L_0x00e0
            gy3.C87412m.m108591d(r1)
            r6 = r1
            goto L_0x00e1
        L_0x00e0:
            r6 = r15
        L_0x00e1:
            r5 = r15
            hz3.a r5 = (hz3.C24607a) r5
            wy3.u0 r1 = r5.mo52627I()
            if (r1 == 0) goto L_0x0132
            boolean r1 = r6 instanceof wy3.C26516w
            if (r1 != 0) goto L_0x00f0
            r1 = r9
            goto L_0x00f1
        L_0x00f0:
            r1 = r6
        L_0x00f1:
            wy3.w r1 = (wy3.C26516w) r1
            if (r1 == 0) goto L_0x00ff
            wy3.a$a<wy3.h1> r2 = hz3.C24610e.f70207M
            java.lang.Object r1 = r1.mo51326V(r2)
            wy3.h1 r1 = (wy3.C26463h1) r1
            r3 = r1
            goto L_0x0100
        L_0x00ff:
            r3 = r9
        L_0x0100:
            r16 = 0
            r17 = 0
            nz3.o r18 = nz3.C25301o.f71793d
            if (r3 == 0) goto L_0x0113
            xy3.h r1 = r3.getAnnotations()
            iz3.h r1 = iz3.C24641b.m30820b(r7, r1)
            r19 = r1
            goto L_0x0115
        L_0x0113:
            r19 = r7
        L_0x0115:
            r4 = 0
            r1 = r25
            r2 = r15
            r27 = r5
            r5 = r19
            r19 = r6
            r6 = r10
            r14 = r7
            r7 = r16
            r12 = 0
            r8 = r17
            r23 = r13
            r13 = r9
            r9 = r18
            n04.j0 r9 = r1.mo52387b(r2, r3, r4, r5, r6, r7, r8, r9)
            r24 = r9
            goto L_0x013d
        L_0x0132:
            r27 = r5
            r19 = r6
            r14 = r7
            r23 = r13
            r12 = 0
            r13 = r9
            r24 = r13
        L_0x013d:
            boolean r1 = r15 instanceof hz3.C24610e
            if (r1 == 0) goto L_0x0145
            r9 = r15
            hz3.e r9 = (hz3.C24610e) r9
            goto L_0x0146
        L_0x0145:
            r9 = r13
        L_0x0146:
            if (r9 == 0) goto L_0x016c
            oz3.y r1 = oz3.C21911y.f61967a
            wy3.k r2 = r9.mo51892b()
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            gy3.C87412m.m108592e(r2, r3)
            wy3.e r2 = (wy3.C26447e) r2
            r3 = 3
            java.lang.String r3 = oz3.C25404v.m32595a(r9, r12, r12, r3, r13)
            java.lang.String r1 = oz3.C25403u.m32594a(r1, r2, r3)
            if (r1 == 0) goto L_0x016c
            java.util.Map<java.lang.String, nz3.m> r2 = nz3.C25271l.f71757d
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r1 = r2.get(r1)
            r9 = r1
            nz3.m r9 = (nz3.C25300m) r9
            goto L_0x016d
        L_0x016c:
            r9 = r13
        L_0x016d:
            if (r9 == 0) goto L_0x017b
            java.util.List<nz3.w> r1 = r9.f71792b
            r1.size()
            java.util.List r1 = r27.mo52639h()
            r1.size()
        L_0x017b:
            iz3.c r1 = r0.f70290a
            fz3.a0 r1 = r1.f70277v
            java.lang.String r2 = "javaTypeEnhancementState"
            gy3.C87412m.m108594g(r1, r2)
            fy3.l<vz3.c, fz3.k0> r1 = r1.f70003b
            vz3.c r2 = fz3.C24524y.f70081a
            java.lang.Object r1 = r1.invoke(r2)
            fz3.k0 r2 = fz3.C24507k0.STRICT
            if (r1 != r2) goto L_0x0192
            r8 = 1
            goto L_0x0193
        L_0x0192:
            r8 = 0
        L_0x0193:
            if (r8 != 0) goto L_0x019f
            iz3.c r1 = r14.f70290a
            iz3.d r1 = r1.f70275t
            boolean r1 = r1.mo51474b()
            if (r1 == 0) goto L_0x01b9
        L_0x019f:
            boolean r1 = r15 instanceof wy3.C26516w
            if (r1 == 0) goto L_0x01b3
            wy3.a$a<java.lang.Boolean> r1 = hz3.C24610e.f70208N
            java.lang.Object r1 = r15.mo51326V(r1)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 == 0) goto L_0x01b3
            r8 = 1
            goto L_0x01b4
        L_0x01b3:
            r8 = 0
        L_0x01b4:
            if (r8 == 0) goto L_0x01b9
            r16 = 1
            goto L_0x01bb
        L_0x01b9:
            r16 = 0
        L_0x01bb:
            java.util.List r1 = r19.mo52639h()
            java.lang.String r2 = "annotationOwnerForMember.valueParameters"
            gy3.C87412m.m108593f(r1, r2)
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r3 = sx3.C36907w.m41090l(r1, r2)
            r8.<init>(r3)
            java.util.Iterator r17 = r1.iterator()
        L_0x01d3:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x021e
            java.lang.Object r1 = r17.next()
            r3 = r1
            wy3.h1 r3 = (wy3.C26463h1) r3
            if (r9 == 0) goto L_0x01f2
            java.util.List<nz3.w> r1 = r9.f71792b
            if (r1 == 0) goto L_0x01f2
            int r2 = r3.getIndex()
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r2)
            nz3.w r1 = (nz3.C25309w) r1
            r7 = r1
            goto L_0x01f3
        L_0x01f2:
            r7 = r13
        L_0x01f3:
            nz3.q r6 = new nz3.q
            r6.<init>(r3)
            if (r3 == 0) goto L_0x0204
            xy3.h r1 = r3.getAnnotations()
            iz3.h r1 = iz3.C24641b.m30820b(r14, r1)
            r5 = r1
            goto L_0x0205
        L_0x0204:
            r5 = r14
        L_0x0205:
            r4 = 0
            r1 = r25
            r2 = r15
            r18 = r6
            r6 = r10
            r12 = r8
            r8 = r16
            r13 = r9
            r9 = r18
            n04.j0 r1 = r1.mo52387b(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.add(r1)
            r8 = r12
            r9 = r13
            r12 = 0
            r13 = 0
            goto L_0x01d3
        L_0x021e:
            r12 = r8
            r13 = r9
            r17 = 1
            boolean r1 = r15 instanceof wy3.C26504r0
            if (r1 != 0) goto L_0x0228
            r9 = 0
            goto L_0x0229
        L_0x0228:
            r9 = r15
        L_0x0229:
            wy3.r0 r9 = (wy3.C26504r0) r9
            if (r9 == 0) goto L_0x0236
            boolean r1 = jz3.C24796c.m31212a(r9)
            r2 = 1
            if (r1 != r2) goto L_0x0237
            r8 = 1
            goto L_0x0238
        L_0x0236:
            r2 = 1
        L_0x0237:
            r8 = 0
        L_0x0238:
            if (r8 == 0) goto L_0x023d
            fz3.c r1 = fz3.C24498c.FIELD
            goto L_0x023f
        L_0x023d:
            fz3.c r1 = fz3.C24498c.METHOD_RETURN_TYPE
        L_0x023f:
            if (r13 == 0) goto L_0x0246
            nz3.w r3 = r13.f71791a
            r20 = r3
            goto L_0x0248
        L_0x0246:
            r20 = 0
        L_0x0248:
            nz3.p r22 = nz3.C25302p.f71794d
            r21 = 0
            r3 = r14
            r14 = r25
            r4 = r15
            r16 = r19
            r18 = r3
            r19 = r1
            n04.j0 r1 = r14.mo52387b(r15, r16, r17, r18, r19, r20, r21, r22)
            n04.j0 r3 = r27.getReturnType()
            gy3.C87412m.m108591d(r3)
            nz3.n r5 = nz3.C21721n.f61496d
            boolean r3 = n04.C25187v1.m32083c(r3, r5)
            if (r3 != 0) goto L_0x02b6
            wy3.u0 r3 = r27.mo52627I()
            if (r3 == 0) goto L_0x027a
            n04.j0 r3 = r3.getType()
            if (r3 == 0) goto L_0x027a
            boolean r8 = n04.C25187v1.m32083c(r3, r5)
            goto L_0x027b
        L_0x027a:
            r8 = 0
        L_0x027b:
            if (r8 != 0) goto L_0x02b6
            java.util.List r3 = r27.mo52639h()
            java.lang.String r5 = "valueParameters"
            gy3.C87412m.m108593f(r3, r5)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x028d
            goto L_0x02b0
        L_0x028d:
            java.util.Iterator r3 = r3.iterator()
        L_0x0291:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x02b0
            java.lang.Object r5 = r3.next()
            wy3.h1 r5 = (wy3.C26463h1) r5
            n04.j0 r5 = r5.getType()
            java.lang.String r6 = "it.type"
            gy3.C87412m.m108593f(r5, r6)
            nz3.n r6 = nz3.C21721n.f61496d
            boolean r5 = n04.C25187v1.m32083c(r5, r6)
            if (r5 == 0) goto L_0x0291
            r14 = 1
            goto L_0x02b1
        L_0x02b0:
            r14 = 0
        L_0x02b1:
            if (r14 == 0) goto L_0x02b4
            goto L_0x02b6
        L_0x02b4:
            r14 = 0
            goto L_0x02b7
        L_0x02b6:
            r14 = 1
        L_0x02b7:
            if (r14 == 0) goto L_0x02c6
            wy3.a$a<c04.c> r3 = c04.C23687d.f67879a
            fz3.n r5 = new fz3.n
            r5.<init>(r4)
            rx3.l r9 = new rx3.l
            r9.<init>(r3, r5)
            goto L_0x02c7
        L_0x02c6:
            r9 = 0
        L_0x02c7:
            if (r24 != 0) goto L_0x02f5
            if (r1 != 0) goto L_0x02f5
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L_0x02d2
            goto L_0x02eb
        L_0x02d2:
            java.util.Iterator r3 = r12.iterator()
        L_0x02d6:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x02eb
            java.lang.Object r5 = r3.next()
            n04.j0 r5 = (n04.C25143j0) r5
            if (r5 == 0) goto L_0x02e6
            r14 = 1
            goto L_0x02e7
        L_0x02e6:
            r14 = 0
        L_0x02e7:
            if (r14 == 0) goto L_0x02d6
            r14 = 1
            goto L_0x02ec
        L_0x02eb:
            r14 = 0
        L_0x02ec:
            if (r14 != 0) goto L_0x02f5
            if (r9 == 0) goto L_0x02f1
            goto L_0x02f5
        L_0x02f1:
            r15 = r4
            r4 = 10
            goto L_0x0359
        L_0x02f5:
            if (r24 != 0) goto L_0x0304
            wy3.u0 r2 = r27.mo52627I()
            if (r2 == 0) goto L_0x0302
            n04.j0 r2 = r2.getType()
            goto L_0x0306
        L_0x0302:
            r2 = 0
            goto L_0x0306
        L_0x0304:
            r2 = r24
        L_0x0306:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r5 = sx3.C36907w.m41090l(r12, r4)
            r3.<init>(r5)
            java.util.Iterator r5 = r12.iterator()
            r8 = 0
        L_0x0316:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0345
            java.lang.Object r6 = r5.next()
            int r7 = r8 + 1
            if (r8 < 0) goto L_0x0340
            n04.j0 r6 = (n04.C25143j0) r6
            if (r6 != 0) goto L_0x033b
            java.util.List r6 = r27.mo52639h()
            java.lang.Object r6 = r6.get(r8)
            wy3.h1 r6 = (wy3.C26463h1) r6
            n04.j0 r6 = r6.getType()
            java.lang.String r8 = "valueParameters[index].type"
            gy3.C87412m.m108593f(r6, r8)
        L_0x033b:
            r3.add(r6)
            r8 = r7
            goto L_0x0316
        L_0x0340:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x0345:
            if (r1 != 0) goto L_0x034e
            n04.j0 r1 = r27.getReturnType()
            gy3.C87412m.m108591d(r1)
        L_0x034e:
            r15 = r27
            hz3.a r15 = r15.mo51315y0(r2, r3, r1, r9)
            java.lang.String r1 = "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature"
            gy3.C87412m.m108592e(r15, r1)
        L_0x0359:
            r11.add(r15)
            r13 = r23
            r12 = 10
            goto L_0x001f
        L_0x0362:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nz3.C25304s.mo52388c(iz3.h, java.util.Collection):java.util.Collection");
    }
}
