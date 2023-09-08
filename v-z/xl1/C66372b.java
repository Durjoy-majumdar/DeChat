package xl1;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: xl1.b */
public final class C66372b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66368a f191084d;

    /* renamed from: e */
    public final /* synthetic */ long f191085e;

    /* renamed from: f */
    public final /* synthetic */ long f191086f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66372b(C66368a aVar, long j, long j2) {
        super(0);
        this.f191084d = aVar;
        this.f191085e = j;
        this.f191086f = j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r22 = this;
            r0 = r22
            xl1.a r1 = r0.f191084d
            boolean r2 = r1.f191073i
            if (r2 == 0) goto L_0x0117
            boolean r2 = r1.f191074j
            if (r2 != 0) goto L_0x0117
            long r2 = r1.f191072h
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0117
            long r6 = r1.f191071g
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0117
            long r2 = r0.f191085e
            r6 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r6
            long r2 = r2 / r6
            int r3 = (int) r2
            java.lang.String r2 = "checkLoadMore"
            r1.mo90469b(r3, r2)
            xl1.a r1 = r0.f191084d
            long r2 = r0.f191086f
            r1.getClass()
            long r6 = r2 / r6
            int r7 = (int) r6
            byte[] r6 = r1.f191076o
            int r8 = r6.length
            r9 = -1
            java.lang.String r11 = "FinderBulletLoader"
            r12 = 0
            r13 = 1
            if (r7 < r8) goto L_0x005c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getLoadMoreTimestamp: error currTimeSec="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = ", size="
            r2.append(r3)
            byte[] r1 = r1.f191076o
            int r1 = r1.length
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            goto L_0x00dc
        L_0x005c:
            if (r7 < 0) goto L_0x006a
            int r8 = r6.length
            int r8 = r8 + -1
            if (r7 > r8) goto L_0x006a
            byte r6 = r6[r7]
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            goto L_0x006b
        L_0x006a:
            r6 = r12
        L_0x006b:
            r8 = 0
            if (r6 == 0) goto L_0x0076
            byte r6 = r6.byteValue()
            if (r6 != 0) goto L_0x0076
            r6 = 1
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            if (r6 == 0) goto L_0x008e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "getLoadMoreTimestamp: case 1, load more time = "
            r1.append(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            goto L_0x00d6
        L_0x008e:
            byte[] r2 = r1.f191076o
            int r3 = r7 + 3
            java.lang.String r6 = "<this>"
            gy3.C87412m.m108594g(r2, r6)
            if (r3 < 0) goto L_0x00a5
            int r6 = r2.length
            int r6 = r6 + -1
            if (r3 > r6) goto L_0x00a5
            byte r2 = r2[r3]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            goto L_0x00a6
        L_0x00a5:
            r2 = r12
        L_0x00a6:
            if (r2 == 0) goto L_0x00af
            byte r2 = r2.byteValue()
            if (r2 != 0) goto L_0x00af
            r8 = 1
        L_0x00af:
            if (r8 == 0) goto L_0x00dc
            int r7 = r7 + r13
            byte[] r2 = r1.f191076o
            int r2 = r2.length
        L_0x00b5:
            if (r7 >= r2) goto L_0x00dc
            byte[] r3 = r1.f191076o
            byte r3 = r3[r7]
            if (r3 != 0) goto L_0x00d9
            long r1 = (long) r7
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r1 * r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "getLoadMoreTimestamp: case 2, load more time = "
            r1.append(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
        L_0x00d6:
            r17 = r2
            goto L_0x00de
        L_0x00d9:
            int r7 = r7 + 1
            goto L_0x00b5
        L_0x00dc:
            r17 = r9
        L_0x00de:
            int r1 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0117
            xl1.a r1 = r0.f191084d
            r1.f191074j = r13
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r1.mo90470c()
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            long r15 = r2.getId()
            pe3.b r2 = r1.f191069e
            android.content.Context r1 = r1.f191075n
            if (r1 == 0) goto L_0x0104
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            rs1.s8 r1 = r3.mo12873f(r1)
            if (r1 == 0) goto L_0x0104
            te3.hj1 r12 = r1.mo12861q3()
        L_0x0104:
            r20 = r12
            r21 = 2
            ie1.b r1 = new ie1.b
            r14 = r1
            r19 = r2
            r14.<init>(r15, r17, r19, r20, r21)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123460f(r1)
        L_0x0117:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xl1.C66372b.invoke():java.lang.Object");
    }
}
