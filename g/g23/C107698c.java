package g23;

import android.graphics.Bitmap;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: g23.c */
public final class C107698c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107701f f322226d;

    /* renamed from: e */
    public final /* synthetic */ C107715p f322227e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f322228f;

    /* renamed from: g */
    public final /* synthetic */ boolean f322229g;

    /* renamed from: h */
    public final /* synthetic */ C32224a<C13598b0> f322230h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107698c(C107701f fVar, C107715p pVar, Bitmap bitmap, boolean z, C32224a<C13598b0> aVar) {
        super(0);
        this.f322226d = fVar;
        this.f322227e = pVar;
        this.f322228f = bitmap;
        this.f322229g = z;
        this.f322230h = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x012e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0130 A[LOOP:2: B:50:0x00f3->B:61:0x0130, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r25 = this;
            r0 = r25
            g23.f r1 = r0.f322226d
            long r2 = r1.f322247n
            int r4 = r1.f322248o
            long r4 = (long) r4
            r6 = 0
            java.lang.String r8 = "MicroMsg.VLogDirector"
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0067
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "videoDecodeEnd pts:"
            r2.append(r3)
            long r3 = r1.f322247n
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            fy3.l<? super java.lang.Long, rx3.b0> r2 = r1.f322242i
            if (r2 == 0) goto L_0x0035
            long r3 = r1.f322247n
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.invoke(r3)
        L_0x0035:
            boolean r2 = r1.f322236c
            if (r2 != 0) goto L_0x0041
            g23.p r2 = r1.f322240g
            if (r2 == 0) goto L_0x0043
            r2.mo158116b()
            goto L_0x0043
        L_0x0041:
            r1.f322247n = r6
        L_0x0043:
            g23.n r2 = r1.f322238e
            boolean r1 = r1.f322236c
            r2.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onPlayEnd, loop:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.VLogScriptReader"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r1 = r1 ^ 1
            r2.mo158123c(r1)
            goto L_0x0258
        L_0x0067:
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            g23.f r3 = r0.f322226d
            r3.getClass()
            g23.f r3 = r0.f322226d
            g23.n r9 = r3.f322238e
            long r13 = r3.f322247n
            g23.p r4 = r0.f322227e
            p80.c r4 = r4.f322299c
            if (r4 == 0) goto L_0x0080
            int r4 = r4.f329652e
            r12 = r4
            goto L_0x0082
        L_0x0080:
            r4 = -1
            r12 = -1
        L_0x0082:
            boolean r3 = r3.f322237d
            com.tencent.mm.plugin.vlog.model.v0 r4 = r9.f322283b
            if (r4 == 0) goto L_0x008b
            java.util.List<? extends com.tencent.mm.plugin.vlog.model.c0> r4 = r4.f282612b
            goto L_0x008c
        L_0x008b:
            r4 = 0
        L_0x008c:
            if (r4 != 0) goto L_0x0094
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L_0x00c4
        L_0x0094:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.tencent.mm.plugin.vlog.model.v0 r5 = r9.f322283b
            if (r5 == 0) goto L_0x00a0
            java.util.List<? extends com.tencent.mm.plugin.vlog.model.c0> r5 = r5.f282612b
            goto L_0x00a1
        L_0x00a0:
            r5 = 0
        L_0x00a1:
            gy3.C87412m.m108591d(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x00a8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00c4
            java.lang.Object r6 = r5.next()
            com.tencent.mm.plugin.vlog.model.c0 r6 = (com.tencent.p014mm.plugin.vlog.model.C96533c0) r6
            long r10 = r6.f282489a
            int r7 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r7 < 0) goto L_0x00a8
            long r10 = r6.f282490b
            int r7 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a8
            r4.add(r6)
            goto L_0x00a8
        L_0x00c4:
            boolean r5 = r4.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r4 = 0
        L_0x00ce:
            r10 = r4
            if (r10 == 0) goto L_0x01d9
            if (r3 == 0) goto L_0x01d1
            com.tencent.mm.plugin.vlog.model.v0 r3 = r9.f322283b
            if (r3 == 0) goto L_0x0177
            java.util.List<? extends com.tencent.mm.plugin.vlog.model.c0> r3 = r3.f282612b
            if (r3 == 0) goto L_0x0177
            int r4 = r3.size()
            r5 = 0
            r6 = 0
        L_0x00e1:
            if (r5 >= r4) goto L_0x0145
            boolean r7 = r10.isEmpty()
            if (r7 == 0) goto L_0x00ef
        L_0x00e9:
            r15 = r1
            r17 = r4
            r18 = r8
            goto L_0x0137
        L_0x00ef:
            java.util.Iterator r7 = r10.iterator()
        L_0x00f3:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x00e9
            java.lang.Object r11 = r7.next()
            com.tencent.mm.plugin.vlog.model.c0 r11 = (com.tencent.p014mm.plugin.vlog.model.C96533c0) r11
            java.lang.String r15 = r11.f282491c
            java.lang.Object r16 = r3.get(r5)
            r17 = r4
            r4 = r16
            com.tencent.mm.plugin.vlog.model.c0 r4 = (com.tencent.p014mm.plugin.vlog.model.C96533c0) r4
            java.lang.String r4 = r4.f282491c
            boolean r4 = gy3.C87412m.m108589b(r15, r4)
            if (r4 == 0) goto L_0x0127
            r15 = r1
            long r1 = r11.f282489a
            java.lang.Object r4 = r3.get(r5)
            com.tencent.mm.plugin.vlog.model.c0 r4 = (com.tencent.p014mm.plugin.vlog.model.C96533c0) r4
            r11 = r7
            r18 = r8
            long r7 = r4.f282489a
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x012b
            r1 = 1
            goto L_0x012c
        L_0x0127:
            r15 = r1
            r11 = r7
            r18 = r8
        L_0x012b:
            r1 = 0
        L_0x012c:
            if (r1 == 0) goto L_0x0130
            r1 = 1
            goto L_0x0138
        L_0x0130:
            r7 = r11
            r1 = r15
            r4 = r17
            r8 = r18
            goto L_0x00f3
        L_0x0137:
            r1 = 0
        L_0x0138:
            if (r1 == 0) goto L_0x013d
            if (r5 < r6) goto L_0x013d
            r6 = r5
        L_0x013d:
            int r5 = r5 + 1
            r1 = r15
            r4 = r17
            r8 = r18
            goto L_0x00e1
        L_0x0145:
            r15 = r1
            r18 = r8
            int r6 = r6 + 1
            int r1 = r3.size()
            if (r6 >= r1) goto L_0x017a
            java.lang.Object r1 = r3.get(r6)
            com.tencent.mm.plugin.vlog.model.c0 r1 = (com.tencent.p014mm.plugin.vlog.model.C96533c0) r1
            long r1 = r1.f282489a
            long r1 = r1 - r13
            r3 = 400(0x190, double:1.976E-321)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0167
            r3 = 601(0x259, double:2.97E-321)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0167
            r1 = 1
            goto L_0x0168
        L_0x0167:
            r1 = 0
        L_0x0168:
            if (r1 == 0) goto L_0x017a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1.add(r2)
            goto L_0x017b
        L_0x0177:
            r15 = r1
            r18 = r8
        L_0x017a:
            r1 = 0
        L_0x017b:
            if (r1 == 0) goto L_0x01cb
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0186:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01c9
            java.lang.Object r3 = r1.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.util.ArrayList<g23.b> r4 = r9.f322286e
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x01a7
            java.util.ArrayList<g23.b> r4 = r9.f322286e
            java.lang.Object r3 = r4.get(r3)
            g23.b r3 = (g23.C107697b) r3
            goto L_0x01a8
        L_0x01a7:
            r3 = 0
        L_0x01a8:
            if (r3 == 0) goto L_0x0186
            boolean r4 = r3.f322224n
            if (r4 != 0) goto L_0x0186
            a14.s1 r19 = a14.C0001s1.f0d
            a14.h0 r20 = a14.C53872d1.f151119c
            r21 = 0
            g23.m r4 = new g23.m
            r5 = 0
            r4.<init>(r3, r13, r5)
            r23 = 2
            r24 = 0
            r22 = r4
            a14.C53895h.m60466d(r19, r20, r21, r22, r23, r24)
            com.tencent.mm.plugin.vlog.model.c0 r3 = r3.f322214d
            r2.add(r3)
            goto L_0x0186
        L_0x01c9:
            r11 = r2
            goto L_0x01cd
        L_0x01cb:
            r1 = 0
            r11 = r1
        L_0x01cd:
            r9.mo158121a(r10, r11, r12, r13)
            goto L_0x01dc
        L_0x01d1:
            r15 = r1
            r18 = r8
            r11 = 0
            r9.mo158121a(r10, r11, r12, r13)
            goto L_0x01dc
        L_0x01d9:
            r15 = r1
            r18 = r8
        L_0x01dc:
            android.graphics.Bitmap r1 = r0.f322228f
            if (r1 == 0) goto L_0x01ec
            g23.f r2 = r0.f322226d
            u80.b r2 = r2.f322239f
            if (r2 == 0) goto L_0x01ec
            r3 = 2
            r4 = 0
            r5 = 0
            u80.C111140b.m151568v(r2, r1, r4, r3, r5)
        L_0x01ec:
            boolean r1 = r0.f322229g
            if (r1 == 0) goto L_0x0200
            java.lang.String r1 = "issue take snapshot"
            r2 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            g23.f r1 = r0.f322226d
            u80.b r1 = r1.f322239f
            if (r1 == 0) goto L_0x0200
            r2 = 1
            r1.f332766u = r2
        L_0x0200:
            g23.f r1 = r0.f322226d
            u80.b r1 = r1.f322239f
            if (r1 == 0) goto L_0x0209
            r1.mo162879m()
        L_0x0209:
            g23.p r1 = r0.f322227e
            g23.f r2 = r0.f322226d
            long r2 = r2.f322247n
            r1.mo158119e(r2)
            g23.f r1 = r0.f322226d
            fy3.p<? super java.lang.Long, ? super java.lang.Long, rx3.b0> r2 = r1.f322241h
            if (r2 == 0) goto L_0x022a
            long r3 = r1.f322247n
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            g23.f r3 = r0.f322226d
            int r3 = r3.f322248o
            long r3 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.invoke(r1, r3)
        L_0x022a:
            g23.f r1 = r0.f322226d
            long r2 = r1.f322247n
            g23.n r4 = r1.f322238e
            long r4 = r4.f322290i
            long r2 = r2 + r4
            r1.f322247n = r2
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r15)
            g23.f r3 = r0.f322226d
            boolean r4 = r3.f322237d
            if (r4 == 0) goto L_0x024a
            g23.n r4 = r3.f322238e
            long r4 = r4.f322290i
            long r4 = r4 - r1
            r1 = 0
            java.lang.Math.max(r4, r1)
            goto L_0x024e
        L_0x024a:
            g23.n r1 = r3.f322238e
            long r1 = r1.f322290i
        L_0x024e:
            r3.getClass()
            fy3.a<rx3.b0> r1 = r0.f322230h
            if (r1 == 0) goto L_0x0258
            r1.invoke()
        L_0x0258:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.C107698c.invoke():java.lang.Object");
    }
}
