package fh1;

import sg1.C63880b;

/* renamed from: fh1.d */
public final class C59004d implements C63880b {

    /* renamed from: a */
    public final /* synthetic */ C58989a f168822a;

    public C59004d(C58989a aVar) {
        this.f168822a = aVar;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.tencent.mm.plugin.finder.live.view.b2] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        r6 = (r6 = (qj1.C12475jc) r6.getPlugin(r5)).f166287d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo79436a(te3.C64321dp2 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.String r3 = "info"
            gy3.C87412m.m108594g(r1, r3)
            fh1.a r3 = r0.f168822a
            com.tencent.mm.plugin.finder.live.view.b2 r3 = r3.f27261e
            if (r3 == 0) goto L_0x001e
            java.lang.Class<qj1.t4> r4 = qj1.C12669t4.class
            qj1.c r3 = r3.getPlugin(r4)
            qj1.t4 r3 = (qj1.C12669t4) r3
            if (r3 == 0) goto L_0x001e
            r3.mo12256l1(r1)
        L_0x001e:
            fh1.a r3 = r0.f168822a
            com.tencent.mm.plugin.finder.live.view.b2 r3 = r3.f27261e
            if (r3 == 0) goto L_0x0031
            java.lang.Class<qj1.o2> r4 = qj1.C62905o2.class
            qj1.c r3 = r3.getPlugin(r4)
            qj1.o2 r3 = (qj1.C62905o2) r3
            if (r3 == 0) goto L_0x0031
            r3.mo87697y0()
        L_0x0031:
            fh1.a r3 = r0.f168822a
            com.tencent.mm.plugin.finder.live.view.b2 r3 = r3.f27261e
            if (r3 == 0) goto L_0x0044
            java.lang.Class<qj1.v9> r4 = qj1.C63049v9.class
            qj1.c r3 = r3.getPlugin(r4)
            qj1.v9 r3 = (qj1.C63049v9) r3
            if (r3 == 0) goto L_0x0044
            r3.mo87697y0()
        L_0x0044:
            fh1.a r3 = r0.f168822a
            java.lang.Class<qj1.dg> r4 = qj1.C62741dg.class
            java.lang.Class<qj1.jc> r5 = qj1.C12475jc.class
            int r6 = r1.f182792e
            r7 = 0
            r8 = 1
            r9 = 0
            if (r6 > 0) goto L_0x0199
            com.tencent.mm.plugin.finder.live.view.b2 r6 = r3.f27261e
            if (r6 == 0) goto L_0x0069
            qj1.c r6 = r6.getPlugin(r5)
            qj1.jc r6 = (qj1.C12475jc) r6
            if (r6 == 0) goto L_0x0069
            android.view.ViewGroup r6 = r6.f166287d
            if (r6 == 0) goto L_0x0069
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0069
            r6 = 1
            goto L_0x006a
        L_0x0069:
            r6 = 0
        L_0x006a:
            r10 = 2131304376(0x7f091fb8, float:1.8226893E38)
            if (r6 == 0) goto L_0x00a9
            com.tencent.mm.plugin.finder.live.view.b2 r6 = r3.f27261e
            if (r6 == 0) goto L_0x0087
            qj1.c r6 = r6.getPlugin(r4)
            qj1.dg r6 = (qj1.C62741dg) r6
            if (r6 == 0) goto L_0x0087
            android.view.ViewGroup r6 = r6.f166287d
            if (r6 == 0) goto L_0x0087
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0087
            r6 = 1
            goto L_0x0088
        L_0x0087:
            r6 = 0
        L_0x0088:
            if (r6 == 0) goto L_0x00a9
            com.tencent.mm.plugin.finder.live.view.b2 r6 = r3.f27261e
            boolean r11 = r6 instanceof android.view.View
            if (r11 == 0) goto L_0x0093
            android.view.View r6 = (android.view.View) r6
            goto L_0x0094
        L_0x0093:
            r6 = r7
        L_0x0094:
            if (r6 == 0) goto L_0x00a4
            android.view.View r6 = r6.findViewById(r10)
            if (r6 == 0) goto L_0x00a4
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x00a4
            r6 = 1
            goto L_0x00a5
        L_0x00a4:
            r6 = 0
        L_0x00a5:
            if (r6 == 0) goto L_0x00a9
            r6 = 1
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            if (r6 == 0) goto L_0x0199
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            com.tencent.mm.plugin.finder.live.view.b2 r11 = r3.f27261e
            if (r11 == 0) goto L_0x00c0
            qj1.c r5 = r11.getPlugin(r5)
            qj1.jc r5 = (qj1.C12475jc) r5
            if (r5 == 0) goto L_0x00c0
            android.view.ViewGroup r5 = r5.f166287d
            goto L_0x00c1
        L_0x00c0:
            r5 = r7
        L_0x00c1:
            r6.add(r5)
            com.tencent.mm.plugin.finder.live.view.b2 r5 = r3.f27261e
            if (r5 == 0) goto L_0x00d3
            qj1.c r4 = r5.getPlugin(r4)
            qj1.dg r4 = (qj1.C62741dg) r4
            if (r4 == 0) goto L_0x00d3
            android.view.ViewGroup r4 = r4.f166287d
            goto L_0x00d4
        L_0x00d3:
            r4 = r7
        L_0x00d4:
            r6.add(r4)
            com.tencent.mm.plugin.finder.live.view.b2 r4 = r3.f27261e
            boolean r5 = r4 instanceof android.view.View
            if (r5 == 0) goto L_0x00e0
            android.view.View r4 = (android.view.View) r4
            goto L_0x00e1
        L_0x00e0:
            r4 = r7
        L_0x00e1:
            if (r4 == 0) goto L_0x00e8
            android.view.View r4 = r4.findViewById(r10)
            goto L_0x00e9
        L_0x00e8:
            r4 = r7
        L_0x00e9:
            r6.add(r4)
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L_0x00f4
            r4 = r7
            goto L_0x0131
        L_0x00f4:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.Iterator r5 = r6.iterator()
        L_0x00fd:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0131
            java.lang.Object r6 = r5.next()
            r11 = r6
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x00fd
            int r6 = r11.getHeight()
            if (r6 <= 0) goto L_0x00fd
            er1.z4 r6 = new er1.z4
            r12 = 1
            er1.a5 r13 = new er1.a5
            android.view.ViewGroup$LayoutParams r10 = r11.getLayoutParams()
            int r10 = r10.height
            int r14 = r11.getHeight()
            r13.<init>(r10, r14, r9)
            r14 = 0
            r15 = 8
            r16 = 0
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r4.add(r6)
            goto L_0x00fd
        L_0x0131:
            java.lang.String r5 = r3.f168783j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "startChargeLiveCountDown OutAnim size:"
            r6.append(r10)
            if (r4 == 0) goto L_0x0149
            int r10 = r4.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x014a
        L_0x0149:
            r10 = r7
        L_0x014a:
            r6.append(r10)
            r10 = 33
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            if (r4 == 0) goto L_0x0195
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0162
            goto L_0x0195
        L_0x0162:
            fh1.e r5 = new fh1.e
            r5.<init>(r3)
            r10 = 200(0xc8, double:9.9E-322)
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x017a
            r3 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r5.invoke(r3, r4)
            goto L_0x019c
        L_0x017a:
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 2
            float[] r6 = new float[r6]
            r6 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r6)
            r6.setDuration(r10)
            er1.b5 r10 = new er1.b5
            r10.<init>(r4, r5, r3)
            r6.addUpdateListener(r10)
            r6.start()
            goto L_0x019c
        L_0x0195:
            fh1.C58989a.m68901F3(r3)
            goto L_0x019c
        L_0x0199:
            fh1.C58989a.m68901F3(r3)
        L_0x019c:
            fh1.a r3 = r0.f168822a
            java.lang.Class<cl1.l> r4 = cl1.C0668l.class
            androidx.lifecycle.i0 r3 = r3.business(r4)
            cl1.l r3 = (cl1.C0668l) r3
            boolean r3 = r3.mo631g3()
            if (r3 == 0) goto L_0x0261
            int r3 = r1.f182792e
            if (r3 > 0) goto L_0x0249
            fh1.a r3 = r0.f168822a
            j50.a r3 = r3.mo84224n3()
            boolean r4 = r3 instanceof p50.C62197e
            if (r4 == 0) goto L_0x01bd
            p50.e r3 = (p50.C62197e) r3
            goto L_0x01be
        L_0x01bd:
            r3 = r7
        L_0x01be:
            r4 = 8
            if (r3 == 0) goto L_0x01de
            fh1.a r5 = r0.f168822a
            r50.f r6 = r3.f173028o
            com.tencent.mm.live.core.mini.AbsLiveMiniView r6 = r6.f179747g
            if (r6 == 0) goto L_0x01d7
            androidx.lifecycle.i0 r5 = r5.business(r2)
            cl1.o r5 = (cl1.C54991o) r5
            java.lang.String r5 = r5.mo75969L3()
            r6.setBgCoverUrl(r5)
        L_0x01d7:
            r3.mo85674O(r4)
            r3.mo87256C0(r8)
            goto L_0x01fb
        L_0x01de:
            fh1.a r3 = r0.f168822a
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r5.getClass()
            uk1.a r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159381i
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r5 = r5.f188207a
            if (r5 == 0) goto L_0x01fb
            androidx.lifecycle.i0 r3 = r3.business(r2)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.mo75969L3()
            r5.setBgCoverUrl(r3)
            r5.mo76394a(r4)
        L_0x01fb:
            fh1.a r3 = r0.f168822a
            com.tencent.mm.plugin.finder.live.view.b2 r3 = r3.f27261e
            if (r3 == 0) goto L_0x020e
            java.lang.Class<qj1.sf> r5 = qj1.C62979sf.class
            qj1.c r3 = r3.getPlugin(r5)
            qj1.sf r3 = (qj1.C62979sf) r3
            if (r3 == 0) goto L_0x020e
            r3.mo10792g(r4)
        L_0x020e:
            fh1.a r3 = r0.f168822a
            androidx.lifecycle.i0 r3 = r3.business(r2)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r3 = r3.f154286Z
            if (r3 == 0) goto L_0x0249
            fh1.a r3 = r0.f168822a
            androidx.lifecycle.i0 r3 = r3.business(r2)
            cl1.o r3 = (cl1.C54991o) r3
            r3.f154286Z = r9
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            fh1.a r4 = r0.f168822a
            androidx.lifecycle.i0 r2 = r4.business(r2)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154286Z
            java.lang.String r5 = "PARAM_FINDER_LIVE_SCREEN_CLEAR"
            r3.putBoolean(r5, r2)
            com.tencent.mm.plugin.finder.live.view.b2 r2 = r4.f27261e
            boolean r4 = r2 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
            if (r4 == 0) goto L_0x0241
            com.tencent.mm.plugin.finder.live.view.b r2 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r2
            goto L_0x0242
        L_0x0241:
            r2 = r7
        L_0x0242:
            if (r2 == 0) goto L_0x0249
            d60.b$b r4 = d60.C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN
            r2.statusChange(r4, r3)
        L_0x0249:
            fh1.a r2 = r0.f168822a
            com.tencent.mm.plugin.finder.live.view.b2 r2 = r2.f27261e
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
            if (r3 == 0) goto L_0x0254
            r7 = r2
            com.tencent.mm.plugin.finder.live.view.b r7 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r7
        L_0x0254:
            if (r7 == 0) goto L_0x0261
            il1.b9 r2 = r7.getWarnningCountWidget()
            if (r2 == 0) goto L_0x0261
            int r1 = r1.f182792e
            r2.mo85315a(r1)
        L_0x0261:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59004d.mo79436a(te3.dp2):void");
    }
}
