package vq1;

import u60.C65231j;

/* renamed from: vq1.x */
public final class C65868x implements C65231j<C65869y> {

    /* renamed from: a */
    public final /* synthetic */ C65866w f189415a;

    /* renamed from: b */
    public final /* synthetic */ C14961i f189416b;

    public C65868x(C65866w wVar, C14961i iVar) {
        this.f189415a = wVar;
        this.f189416b = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x008e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo539a(u60.C65220d r17, u60.C65234n r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r17
            vq1.y r2 = (vq1.C65869y) r2
            java.lang.String r3 = "task"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.String r3 = "status"
            gy3.C87412m.m108594g(r1, r3)
            vq1.w$a r3 = vq1.C65866w.f189406g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "task callback "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Finder.FinderLikeActionMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            u60.n r3 = u60.C65234n.OK
            if (r1 != r3) goto L_0x010d
            vq1.w r1 = r0.f189415a
            vq1.i r2 = r0.f189416b
            r1.getClass()
            boolean r3 = r2 instanceof vq1.C52984v
            r7 = 0
            if (r3 == 0) goto L_0x007f
            java.util.concurrent.ConcurrentLinkedQueue<vq1.i> r3 = r1.f189409b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0048:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x007d
            java.lang.Object r9 = r3.next()
            r10 = r9
            vq1.i r10 = (vq1.C14961i) r10
            boolean r11 = r10 instanceof vq1.C52984v
            if (r11 == 0) goto L_0x005d
            r11 = r10
            vq1.v r11 = (vq1.C52984v) r11
            goto L_0x005e
        L_0x005d:
            r11 = r7
        L_0x005e:
            if (r11 != 0) goto L_0x0061
            goto L_0x0076
        L_0x0061:
            long r11 = r11.f147888d
            r13 = r10
            vq1.v r13 = (vq1.C52984v) r13
            long r13 = r13.f147888d
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0076
            long r11 = r2.f41018b
            long r13 = r10.f41018b
            int r10 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x0076
            r10 = 1
            goto L_0x0077
        L_0x0076:
            r10 = 0
        L_0x0077:
            if (r10 == 0) goto L_0x0048
            r8.add(r9)
            goto L_0x0048
        L_0x007d:
            r7 = r8
            goto L_0x00d3
        L_0x007f:
            boolean r3 = r2 instanceof vq1.C52981a0
            if (r3 == 0) goto L_0x00d3
            java.util.concurrent.ConcurrentLinkedQueue<vq1.i> r3 = r1.f189409b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x008e:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x007d
            java.lang.Object r9 = r3.next()
            r10 = r9
            vq1.i r10 = (vq1.C14961i) r10
            boolean r11 = r10 instanceof vq1.C52981a0
            if (r11 == 0) goto L_0x00a3
            r11 = r10
            vq1.a0 r11 = (vq1.C52981a0) r11
            goto L_0x00a4
        L_0x00a3:
            r11 = r7
        L_0x00a4:
            if (r11 != 0) goto L_0x00a7
            goto L_0x00cc
        L_0x00a7:
            long r12 = r11.f147871c
            r14 = r10
            vq1.a0 r14 = (vq1.C52981a0) r14
            long r5 = r14.f147871c
            int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x00cc
            up1.w0 r5 = r11.f147873e
            long r5 = r5.mo89531n2()
            up1.w0 r11 = r14.f147873e
            long r11 = r11.mo89531n2()
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x00cc
            long r5 = r2.f41018b
            long r10 = r10.f41018b
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00cc
            r5 = 1
            goto L_0x00cd
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            if (r5 == 0) goto L_0x008e
            r8.add(r9)
            goto L_0x008e
        L_0x00d3:
            if (r7 == 0) goto L_0x0107
            java.util.Iterator r3 = r7.iterator()
        L_0x00d9:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0107
            java.lang.Object r5 = r3.next()
            vq1.i r5 = (vq1.C14961i) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "drop action now action "
            r6.append(r7)
            r6.append(r2)
            r7 = 32
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            java.util.concurrent.ConcurrentLinkedQueue<vq1.i> r6 = r1.f189409b
            r6.remove(r5)
            goto L_0x00d9
        L_0x0107:
            vq1.w r1 = r0.f189415a
            r1.mo89913l()
            goto L_0x012a
        L_0x010d:
            boolean r1 = r2.f189418g
            if (r1 == 0) goto L_0x011a
            vq1.w r1 = r0.f189415a
            java.util.concurrent.ConcurrentLinkedQueue<vq1.i> r1 = r1.f189409b
            vq1.i r2 = r2.f189417f
            r1.add(r2)
        L_0x011a:
            vq1.w r1 = r0.f189415a
            java.lang.Runnable r1 = r1.f189413f
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r1)
            vq1.w r1 = r0.f189415a
            java.lang.Runnable r1 = r1.f189413f
            long r2 = vq1.C14950a.f40991a
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r1, r2)
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vq1.C65868x.mo539a(u60.d, u60.n):void");
    }
}
