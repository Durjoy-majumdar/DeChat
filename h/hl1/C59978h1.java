package hl1;

/* renamed from: hl1.h1 */
public final class C59978h1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171130d;

    public C59978h1(C59988k kVar) {
        this.f171130d = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        r10 = r10.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            hl1.k r0 = r1.f171130d
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.Class<cl1.d0> r3 = cl1.C54963d0.class
            java.lang.String r4 = r0.f171222i
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "restoreLinkMicUI: curLinkMicUser:"
            r5.append(r6)
            androidx.lifecycle.i0 r6 = r0.mo83051g(r3)
            cl1.d0 r6 = (cl1.C54963d0) r6
            al1.j r6 = r6.f154073p
            r5.append(r6)
            java.lang.String r6 = ", audienceLinkMicUserList:"
            r5.append(r6)
            androidx.lifecycle.i0 r6 = r0.mo83051g(r3)
            cl1.d0 r6 = (cl1.C54963d0) r6
            java.util.List<al1.j> r6 = r6.f154074q
            r5.append(r6)
            java.lang.String r6 = ", audienceMode:"
            r5.append(r6)
            androidx.lifecycle.i0 r6 = r0.mo83051g(r2)
            cl1.o r6 = (cl1.C54991o) r6
            int r6 = r6.mo75996d3()
            r5.append(r6)
            java.lang.String r6 = ", isRoomPk:"
            r5.append(r6)
            androidx.lifecycle.i0 r6 = r0.mo83051g(r3)
            cl1.d0 r6 = (cl1.C54963d0) r6
            boolean r6 = r6.f154053G
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            androidx.lifecycle.i0 r4 = r0.mo83051g(r3)
            cl1.d0 r4 = (cl1.C54963d0) r4
            boolean r4 = r4.mo75913U3()
            if (r4 == 0) goto L_0x0072
            qj1.gh r0 = r0.f171214d1
            if (r0 == 0) goto L_0x01fa
            qj1.mh r2 = new qj1.mh
            r2.<init>(r0)
            o40.C61926c.m72668M(r2)
            goto L_0x01fa
        L_0x0072:
            androidx.lifecycle.i0 r4 = r0.mo83051g(r3)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.util.List<al1.j> r4 = r4.f154074q
            java.lang.String r5 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r4, r5)
            monitor-enter(r4)
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x0207 }
        L_0x0084:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0207 }
            r7 = 0
            if (r6 == 0) goto L_0x00a5
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0207 }
            r8 = r6
            al1.j r8 = (al1.C54130j) r8     // Catch:{ all -> 0x0207 }
            java.lang.String r8 = r8.f151997a     // Catch:{ all -> 0x0207 }
            androidx.lifecycle.i0 r9 = r0.mo83051g(r2)     // Catch:{ all -> 0x0207 }
            cl1.o r9 = (cl1.C54991o) r9     // Catch:{ all -> 0x0207 }
            java.lang.String r9 = r9.mo76015n4()     // Catch:{ all -> 0x0207 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x0207 }
            if (r8 == 0) goto L_0x0084
            goto L_0x00a6
        L_0x00a5:
            r6 = r7
        L_0x00a6:
            monitor-exit(r4)
            al1.j r6 = (al1.C54130j) r6
            androidx.lifecycle.i0 r4 = r0.mo83051g(r3)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.util.List<al1.j> r4 = r4.f154074q
            java.lang.String r5 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r4, r5)
            monitor-enter(r4)
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x0204 }
        L_0x00bb:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x0204 }
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L_0x0170
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x0204 }
            al1.j r8 = (al1.C54130j) r8     // Catch:{ all -> 0x0204 }
            java.lang.String r11 = r8.f151997a     // Catch:{ all -> 0x0204 }
            androidx.lifecycle.i0 r12 = r0.mo83051g(r2)     // Catch:{ all -> 0x0204 }
            cl1.o r12 = (cl1.C54991o) r12     // Catch:{ all -> 0x0204 }
            java.lang.String r12 = r12.mo76015n4()     // Catch:{ all -> 0x0204 }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r11, (java.lang.String) r12)     // Catch:{ all -> 0x0204 }
            if (r11 == 0) goto L_0x011d
            qj1.ze r11 = r0.f171224j     // Catch:{ all -> 0x0204 }
            if (r11 == 0) goto L_0x00e2
            r11.mo88095h1(r10)     // Catch:{ all -> 0x0204 }
        L_0x00e2:
            qj1.ze r10 = r0.f171224j     // Catch:{ all -> 0x0204 }
            if (r10 == 0) goto L_0x00eb
            r11 = 8
            r10.mo10792g(r11)     // Catch:{ all -> 0x0204 }
        L_0x00eb:
            qj1.sh r10 = r0.f171229n     // Catch:{ all -> 0x0204 }
            if (r10 == 0) goto L_0x00f2
            r10.mo10792g(r9)     // Catch:{ all -> 0x0204 }
        L_0x00f2:
            qj1.sh r9 = r0.f171229n     // Catch:{ all -> 0x0204 }
            if (r9 == 0) goto L_0x00f9
            r9.mo87923d1()     // Catch:{ all -> 0x0204 }
        L_0x00f9:
            p50.e r9 = r0.mo84868C()     // Catch:{ all -> 0x0204 }
            if (r9 == 0) goto L_0x0110
            p50.e r10 = r0.mo84868C()     // Catch:{ all -> 0x0204 }
            if (r10 == 0) goto L_0x010c
            d50.i r10 = r10.f172989A     // Catch:{ all -> 0x0204 }
            if (r10 == 0) goto L_0x010c
            java.lang.String r10 = r10.f166260g     // Catch:{ all -> 0x0204 }
            goto L_0x010d
        L_0x010c:
            r10 = r7
        L_0x010d:
            r9.mo85706z0(r10)     // Catch:{ all -> 0x0204 }
        L_0x0110:
            int r8 = r8.f152001e     // Catch:{ all -> 0x0204 }
            r9 = 2
            if (r8 != r9) goto L_0x00bb
            qj1.sh r8 = r0.f171229n     // Catch:{ all -> 0x0204 }
            if (r8 == 0) goto L_0x00bb
            r8.mo87922c1()     // Catch:{ all -> 0x0204 }
            goto L_0x00bb
        L_0x011d:
            androidx.lifecycle.i0 r11 = r0.mo83051g(r2)     // Catch:{ all -> 0x0204 }
            cl1.o r11 = (cl1.C54991o) r11     // Catch:{ all -> 0x0204 }
            int r11 = r11.mo75996d3()     // Catch:{ all -> 0x0204 }
            if (r11 == 0) goto L_0x0137
            androidx.lifecycle.i0 r11 = r0.mo83051g(r2)     // Catch:{ all -> 0x0204 }
            cl1.o r11 = (cl1.C54991o) r11     // Catch:{ all -> 0x0204 }
            int r11 = r11.mo75996d3()     // Catch:{ all -> 0x0204 }
            if (r11 != r10) goto L_0x00bb
            if (r6 == 0) goto L_0x00bb
        L_0x0137:
            qj1.sh r10 = r0.f171229n     // Catch:{ all -> 0x0204 }
            if (r10 == 0) goto L_0x0145
            java.lang.String r11 = r8.f151997a     // Catch:{ all -> 0x0204 }
            qj1.vh r12 = new qj1.vh     // Catch:{ all -> 0x0204 }
            r12.<init>(r10, r11, r9)     // Catch:{ all -> 0x0204 }
            o40.C61926c.m72668M(r12)     // Catch:{ all -> 0x0204 }
        L_0x0145:
            qj1.sh r9 = r0.f171229n     // Catch:{ all -> 0x0204 }
            if (r9 == 0) goto L_0x014c
            r9.mo87923d1()     // Catch:{ all -> 0x0204 }
        L_0x014c:
            p50.e r9 = r0.mo84868C()     // Catch:{ all -> 0x0204 }
            if (r9 == 0) goto L_0x0163
            p50.e r10 = r0.mo84868C()     // Catch:{ all -> 0x0204 }
            if (r10 == 0) goto L_0x015f
            d50.i r10 = r10.f172989A     // Catch:{ all -> 0x0204 }
            if (r10 == 0) goto L_0x015f
            java.lang.String r10 = r10.f166260g     // Catch:{ all -> 0x0204 }
            goto L_0x0160
        L_0x015f:
            r10 = r7
        L_0x0160:
            r9.mo85706z0(r10)     // Catch:{ all -> 0x0204 }
        L_0x0163:
            p50.e r9 = r0.mo84868C()     // Catch:{ all -> 0x0204 }
            if (r9 == 0) goto L_0x00bb
            java.lang.String r8 = r8.f151997a     // Catch:{ all -> 0x0204 }
            r9.mo85706z0(r8)     // Catch:{ all -> 0x0204 }
            goto L_0x00bb
        L_0x0170:
            monitor-exit(r4)
            androidx.lifecycle.i0 r4 = r0.mo83051g(r3)
            cl1.d0 r4 = (cl1.C54963d0) r4
            boolean r4 = r4.f154053G
            if (r4 == 0) goto L_0x01e8
            androidx.lifecycle.i0 r4 = r0.mo83051g(r3)
            cl1.d0 r4 = (cl1.C54963d0) r4
            al1.j r4 = r4.f154073p
            if (r4 == 0) goto L_0x018b
            boolean r4 = r4.f152004h
            if (r4 != r10) goto L_0x018b
            r4 = 1
            goto L_0x018c
        L_0x018b:
            r4 = 0
        L_0x018c:
            if (r4 == 0) goto L_0x01e8
            androidx.lifecycle.i0 r4 = r0.mo83051g(r2)
            cl1.o r4 = (cl1.C54991o) r4
            int r4 = r4.mo75996d3()
            if (r4 == 0) goto L_0x01a8
            androidx.lifecycle.i0 r2 = r0.mo83051g(r2)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.mo75996d3()
            if (r2 != r10) goto L_0x01fa
            if (r6 == 0) goto L_0x01fa
        L_0x01a8:
            androidx.lifecycle.i0 r2 = r0.mo83051g(r3)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.f154073p
            if (r2 == 0) goto L_0x01fa
            qj1.sh r3 = r0.f171229n
            if (r3 == 0) goto L_0x01c0
            java.lang.String r4 = r2.f151997a
            qj1.vh r5 = new qj1.vh
            r5.<init>(r3, r4, r9)
            o40.C61926c.m72668M(r5)
        L_0x01c0:
            qj1.sh r3 = r0.f171229n
            if (r3 == 0) goto L_0x01c7
            r3.mo87923d1()
        L_0x01c7:
            p50.e r3 = r0.mo84868C()
            if (r3 == 0) goto L_0x01dc
            p50.e r4 = r0.mo84868C()
            if (r4 == 0) goto L_0x01d9
            d50.i r4 = r4.f172989A
            if (r4 == 0) goto L_0x01d9
            java.lang.String r7 = r4.f166260g
        L_0x01d9:
            r3.mo85706z0(r7)
        L_0x01dc:
            p50.e r0 = r0.mo84868C()
            if (r0 == 0) goto L_0x01fa
            java.lang.String r2 = r2.f151997a
            r0.mo85706z0(r2)
            goto L_0x01fa
        L_0x01e8:
            vk1.c r0 = r0.f166848f
            if (r0 == 0) goto L_0x01ef
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyAudienceMicUserChange$default(r0, r9, r10, r7)
        L_0x01ef:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r11 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r12 = 2
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r11, r12, r13, r14, r15, r16)
        L_0x01fa:
            hl1.k r0 = r1.f171130d
            qj1.dg r0 = r0.f171228m1
            if (r0 == 0) goto L_0x0203
            r0.mo87748a1()
        L_0x0203:
            return
        L_0x0204:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0207:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59978h1.run():void");
    }
}
