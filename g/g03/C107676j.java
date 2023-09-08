package g03;

import fy3.C32226l;
import gy3.C87413o;
import h03.C107989a;
import rx3.C13598b0;

/* renamed from: g03.j */
public final class C107676j extends C87413o implements C32226l<C107989a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107666c f322138d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107676j(C107666c cVar) {
        super(1);
        this.f322138d = cVar;
    }

    /* JADX WARNING: type inference failed for: r7v5, types: [android.graphics.SurfaceTexture] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0101, code lost:
        r10 = r10.f322148h;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            h03.a r1 = (h03.C107989a) r1
            g03.c$b r2 = g03.C107666c.C107668b.Started
            java.lang.String r3 = "it"
            gy3.C87412m.m108594g(r1, r3)
            g03.c r3 = r0.f322138d
            int r3 = g03.C107666c.m145844a(r3, r1)
            g03.c r4 = r0.f322138d
            java.lang.String r4 = r4.f322101g
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onPlayStarted, playerMediaIndex:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ", playStatus:"
            r5.append(r6)
            g03.c r6 = r0.f322138d
            g03.c$b r6 = r6.f322110p
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            g03.c r4 = r0.f322138d
            java.lang.String r5 = r4.f322101g
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "setPlayerSurface type:"
            r6.append(r7)
            h03.b r7 = r1.mo158381d()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            h03.b r5 = r1.mo158381d()
            h03.b r6 = h03.C107990b.Image
            r7 = 0
            r8 = 1
            r9 = 0
            if (r5 != r6) goto L_0x00ef
            r5 = r1
            h03.g r5 = (h03.C107994g) r5
            g03.m r6 = r1.f323390h
            if (r6 == 0) goto L_0x006b
            d03.a r6 = r6.f322148h
            if (r6 == 0) goto L_0x006b
            java.lang.String r7 = r6.f165947s
        L_0x006b:
            if (r7 != 0) goto L_0x006f
            goto L_0x01c3
        L_0x006f:
            android.graphics.Bitmap r6 = r5.f323414r
            if (r6 != 0) goto L_0x0075
            goto L_0x01c3
        L_0x0075:
            vp3.n$c r5 = r5.f323415s
            java.lang.String r10 = r4.f322101g
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "set imagePlayer surface key:"
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            vp3.n r10 = r4.f322102h
            r10.getClass()
            java.lang.String r11 = r10.f334078t
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "newBitmapInputTexture:"
            r12.append(r13)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            java.lang.Object[] r13 = new java.lang.Object[r9]
            yp3.C112478a.m153625c(r11, r12, r13)
            java.util.concurrent.ConcurrentLinkedDeque<vp3.n$a> r11 = r10.f334079u
            boolean r12 = r11 instanceof java.util.Collection
            if (r12 == 0) goto L_0x00b7
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x00b7
            goto L_0x00d1
        L_0x00b7:
            java.util.Iterator r11 = r11.iterator()
        L_0x00bb:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00d1
            java.lang.Object r12 = r11.next()
            vp3.n$a r12 = (vp3.C111601n.C111602a) r12
            java.lang.String r12 = r12.f334080a
            boolean r12 = gy3.C87412m.m108589b(r12, r7)
            if (r12 == 0) goto L_0x00bb
            r11 = 1
            goto L_0x00d2
        L_0x00d1:
            r11 = 0
        L_0x00d2:
            if (r11 == 0) goto L_0x00de
            java.lang.String r5 = r10.f334078t
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.String r9 = "newBitmapInputTexture, already contains same key"
            yp3.C112478a.m153625c(r5, r9, r6)
            goto L_0x00e6
        L_0x00de:
            vp3.o r9 = new vp3.o
            r9.<init>(r10, r6, r7, r5)
            r10.mo163269e(r9)
        L_0x00e6:
            r1.f323391i = r7
            r1.f323392j = r8
            r4.mo158089l()
            goto L_0x01c3
        L_0x00ef:
            r5 = r1
            h03.j r5 = (h03.C107999j) r5
            h03.i r6 = new h03.i
            int r10 = r5.f323433o
            int r11 = r5.f323434p
            int r12 = r5.f323435q
            r6.<init>(r10, r11, r12)
            g03.m r10 = r1.f323390h
            if (r10 == 0) goto L_0x0108
            d03.a r10 = r10.f322148h
            if (r10 == 0) goto L_0x0108
            java.lang.String r10 = r10.f165947s
            goto L_0x0109
        L_0x0108:
            r10 = r7
        L_0x0109:
            if (r10 != 0) goto L_0x010d
            goto L_0x01c3
        L_0x010d:
            java.lang.String r11 = r4.f322101g
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "set videoPlayer surface key:"
            r12.append(r13)
            r12.append(r10)
            java.lang.String r13 = ", video mediaInfo:"
            r12.append(r13)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            vp3.n r15 = r4.f322102h
            int r13 = r6.f323426a
            int r14 = r6.f323427b
            int r6 = r6.f323428c
            g03.h r12 = new g03.h
            r12.<init>(r4, r5, r1)
            r15.getClass()
            java.lang.String r4 = r15.f334078t
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "newVideoInputTexture:"
            r5.append(r11)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            yp3.C112478a.m153625c(r4, r5, r11)
            java.util.concurrent.ConcurrentLinkedDeque<vp3.n$a> r4 = r15.f334079u
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L_0x0160
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0160
            goto L_0x0179
        L_0x0160:
            java.util.Iterator r4 = r4.iterator()
        L_0x0164:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0179
            java.lang.Object r5 = r4.next()
            vp3.n$a r5 = (vp3.C111601n.C111602a) r5
            java.lang.String r5 = r5.f334080a
            boolean r5 = gy3.C87412m.m108589b(r5, r10)
            if (r5 == 0) goto L_0x0164
            goto L_0x017a
        L_0x0179:
            r8 = 0
        L_0x017a:
            if (r8 == 0) goto L_0x01b0
            java.lang.String r4 = r15.f334078t
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r6 = "newVideoInputTexture, already contains same key"
            yp3.C112478a.m153625c(r4, r6, r5)
            java.util.concurrent.ConcurrentLinkedDeque<vp3.n$a> r4 = r15.f334079u
            java.util.Iterator r4 = r4.iterator()
        L_0x018b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01a1
            java.lang.Object r5 = r4.next()
            r6 = r5
            vp3.n$a r6 = (vp3.C111601n.C111602a) r6
            java.lang.String r6 = r6.f334080a
            boolean r6 = gy3.C87412m.m108589b(r6, r10)
            if (r6 == 0) goto L_0x018b
            goto L_0x01a2
        L_0x01a1:
            r5 = r7
        L_0x01a2:
            vp3.n$a r5 = (vp3.C111601n.C111602a) r5
            if (r5 == 0) goto L_0x01ac
            vp3.n$b r4 = r5.f334081b
            if (r4 == 0) goto L_0x01ac
            android.graphics.SurfaceTexture r7 = r4.f334088f
        L_0x01ac:
            r12.invoke(r7)
            goto L_0x01c1
        L_0x01b0:
            vp3.r r4 = new vp3.r
            r11 = r4
            r5 = r12
            r12 = r15
            r7 = r15
            r15 = r6
            r16 = r10
            r17 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7.mo163269e(r4)
        L_0x01c1:
            r1.f323391i = r10
        L_0x01c3:
            g03.c r1 = r0.f322138d
            int r4 = r3 + 1
            r1.mo158081d(r4)
            g03.c r1 = r0.f322138d
            g03.c$b r1 = r1.f322110p
            g03.c$b r4 = g03.C107666c.C107668b.Seeking
            if (r1 != r4) goto L_0x01d6
            g03.c r1 = r0.f322138d
            r1.f322110p = r2
        L_0x01d6:
            g03.c r1 = r0.f322138d
            g03.c$b r1 = r1.f322110p
            if (r1 != r2) goto L_0x0216
            g03.c r1 = r0.f322138d
            if (r3 < 0) goto L_0x0213
            java.util.ArrayList<d03.a> r2 = r1.f322109o
            int r2 = r2.size()
            if (r3 >= r2) goto L_0x0216
            java.lang.String r2 = r1.f322101g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "callNextMediaChange index:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.util.ArrayList<d03.a> r2 = r1.f322109o
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r4 = "mediaList[currentMediaIndex]"
            gy3.C87412m.m108593f(r2, r4)
            d03.a r2 = (d03.C58010a) r2
            m03.m r1 = r1.f322096b
            if (r1 == 0) goto L_0x0216
            r1.mo80357a(r3, r2)
            goto L_0x0216
        L_0x0213:
            r1.getClass()
        L_0x0216:
            g03.c r1 = r0.f322138d
            boolean r2 = r1.f322097c
            if (r2 == 0) goto L_0x021f
            r1.mo158080c()
        L_0x021f:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g03.C107676j.invoke(java.lang.Object):java.lang.Object");
    }
}
