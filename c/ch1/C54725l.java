package ch1;

import yg1.C66639f;

/* renamed from: ch1.l */
public final class C54725l extends C66639f {
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0169  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo49b(yg1.C39014a.C39015a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "respWrapper"
            gy3.C87412m.m108594g(r11, r0)
            ok1.e r0 = ok1.C62042e.f176370a
            boolean r0 = r0.mo87027N0()
            if (r0 == 0) goto L_0x00b4
            te3.ao0 r0 = r11.f105072a
            if (r0 == 0) goto L_0x00b4
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            cj1.r1 r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159382j
            r1.getClass()
            java.util.List<is3.a> r2 = r1.f153636a
            java.lang.String r3 = "externalLiveCallbacks"
            gy3.C87412m.m108593f(r2, r3)
            monitor-enter(r2)
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x00b1 }
        L_0x0027:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00b1 }
            if (r4 == 0) goto L_0x00af
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00b1 }
            is3.a r4 = (is3.C60622a) r4     // Catch:{ all -> 0x00b1 }
            cj1.w3 r5 = cj1.C54843w3.f153747a     // Catch:{ all -> 0x00b1 }
            java.util.LinkedList<te3.r41> r6 = r0.f130677e     // Catch:{ all -> 0x00b1 }
            if (r6 != 0) goto L_0x003e
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch:{ all -> 0x00b1 }
            r6.<init>()     // Catch:{ all -> 0x00b1 }
        L_0x003e:
            java.util.LinkedList<te3.xs0> r7 = r0.f130689t     // Catch:{ all -> 0x00b1 }
            if (r7 != 0) goto L_0x0047
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ all -> 0x00b1 }
            r7.<init>()     // Catch:{ all -> 0x00b1 }
        L_0x0047:
            java.util.ArrayList r5 = r5.mo75794i(r6, r7)     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = "FinderLiveExternalHelper"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r7.<init>()     // Catch:{ all -> 0x00b1 }
            java.lang.String r8 = "onLiveInfoChanged curLikeCount:"
            r7.append(r8)     // Catch:{ all -> 0x00b1 }
            long r8 = r0.f130693x     // Catch:{ all -> 0x00b1 }
            r7.append(r8)     // Catch:{ all -> 0x00b1 }
            java.lang.String r8 = " participantCount:"
            r7.append(r8)     // Catch:{ all -> 0x00b1 }
            int r8 = r0.f130688s     // Catch:{ all -> 0x00b1 }
            long r8 = (long) r8     // Catch:{ all -> 0x00b1 }
            r7.append(r8)     // Catch:{ all -> 0x00b1 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x00b1 }
            java.util.ArrayList<te3.zs2> r6 = r1.f153640e     // Catch:{ all -> 0x00b1 }
            int r6 = r6.size()     // Catch:{ all -> 0x00b1 }
            if (r6 == 0) goto L_0x0080
            java.util.ArrayList<te3.zs2> r6 = r1.f153640e     // Catch:{ all -> 0x00b1 }
            r5.addAll(r6)     // Catch:{ all -> 0x00b1 }
            java.util.ArrayList<te3.zs2> r6 = r1.f153640e     // Catch:{ all -> 0x00b1 }
            r6.clear()     // Catch:{ all -> 0x00b1 }
        L_0x0080:
            te3.ys2 r6 = new te3.ys2     // Catch:{ all -> 0x00b1 }
            r6.<init>()     // Catch:{ all -> 0x00b1 }
            long r7 = r0.f130693x     // Catch:{ all -> 0x00b1 }
            r6.f186595d = r7     // Catch:{ all -> 0x00b1 }
            int r7 = r0.f130688s     // Catch:{ all -> 0x00b1 }
            long r7 = (long) r7     // Catch:{ all -> 0x00b1 }
            r6.f186596e = r7     // Catch:{ all -> 0x00b1 }
            te3.ey0 r7 = r1.f153637b     // Catch:{ all -> 0x00b1 }
            int r8 = r7.f183045d     // Catch:{ all -> 0x00b1 }
            r6.f186597f = r8     // Catch:{ all -> 0x00b1 }
            long r7 = r7.f183046e     // Catch:{ all -> 0x00b1 }
            r6.f186598g = r7     // Catch:{ all -> 0x00b1 }
            int r7 = r0.f130680h     // Catch:{ all -> 0x00b1 }
            long r7 = (long) r7     // Catch:{ all -> 0x00b1 }
            r6.f186599h = r7     // Catch:{ all -> 0x00b1 }
            te3.c21 r7 = r0.f130678f     // Catch:{ all -> 0x00b1 }
            if (r7 == 0) goto L_0x00a4
            long r7 = r7.f182377T0     // Catch:{ all -> 0x00b1 }
            goto L_0x00a6
        L_0x00a4:
            r7 = 0
        L_0x00a6:
            r6.f186600i = r7     // Catch:{ all -> 0x00b1 }
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00b1 }
            r4.mo85575b(r5, r6)     // Catch:{ all -> 0x00b1 }
            goto L_0x0027
        L_0x00af:
            monitor-exit(r2)
            goto L_0x00b4
        L_0x00b1:
            r11 = move-exception
            monitor-exit(r2)
            throw r11
        L_0x00b4:
            te3.ao0 r11 = r11.f105072a
            r0 = 1
            if (r11 == 0) goto L_0x019d
            te3.c21 r11 = r11.f130678f
            if (r11 == 0) goto L_0x019d
            te3.dy0 r11 = r11.f182399n
            if (r11 == 0) goto L_0x019d
            pe3.b r11 = r11.f132564d
            if (r11 == 0) goto L_0x019d
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            cj1.r1 r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159382j
            r1.getClass()
            te3.oo2 r2 = new te3.oo2
            r2.<init>()
            byte[] r11 = r11.f257327a
            r3 = 0
            r4 = 0
            if (r11 != 0) goto L_0x00db
            goto L_0x00eb
        L_0x00db:
            r2.parseFrom(r11)     // Catch:{ Exception -> 0x00df }
            goto L_0x00ec
        L_0x00df:
            r11 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r4] = r11
            java.lang.String r11 = "safeParser"
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r11, r5, r2)
        L_0x00eb:
            r2 = r3
        L_0x00ec:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r5 = "anchorStatusFlag:"
            r11.append(r5)
            if (r2 == 0) goto L_0x00ff
            long r5 = r2.f139284e
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L_0x0100
        L_0x00ff:
            r5 = r3
        L_0x0100:
            r11.append(r5)
            r5 = 32
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            java.lang.String r5 = "FinderLiveExternalHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
            if (r2 == 0) goto L_0x019d
            te3.wr1 r11 = r2.f139285f
            if (r11 == 0) goto L_0x019d
            int r11 = r11.f144237d
            te3.uy0 r2 = r1.f153639d
            int r6 = r2.f143181e
            if (r6 == r11) goto L_0x0121
            r2.f143181e = r11
        L_0x0121:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            fj1.b r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            if (r2 == 0) goto L_0x0134
            ok1.e r7 = ok1.C62042e.f176370a
            boolean r2 = r7.mo87035Q0(r2)
            if (r2 != r0) goto L_0x0134
            r2 = 1
            goto L_0x0135
        L_0x0134:
            r2 = 0
        L_0x0135:
            if (r2 == 0) goto L_0x019d
            if (r6 == r0) goto L_0x013f
            if (r6 == 0) goto L_0x013f
            if (r11 == r0) goto L_0x013f
            if (r11 != 0) goto L_0x019d
        L_0x013f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "appendMiniGameTeamModeTipForExternal:"
            r11.append(r2)
            te3.uy0 r2 = r1.f153639d
            if (r2 == 0) goto L_0x0153
            int r2 = r2.f143181e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
        L_0x0153:
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
            te3.uy0 r11 = r1.f153639d
            if (r11 == 0) goto L_0x0166
            int r11 = r11.f143181e
            if (r11 != 0) goto L_0x0166
            r4 = 1
        L_0x0166:
            if (r4 == 0) goto L_0x0169
            goto L_0x019d
        L_0x0169:
            te3.zs2 r11 = new te3.zs2
            r11.<init>()
            r2 = 5
            r11.f186858d = r2
            te3.uy0 r2 = r1.f153639d
            int r2 = r2.f143181e
            if (r2 != r0) goto L_0x0187
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131826764(0x7f11184c, float:1.9286422E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0196
        L_0x0187:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131826766(0x7f11184e, float:1.9286426E38)
            java.lang.String r2 = r2.getString(r3)
        L_0x0196:
            r11.f186860f = r2
            java.util.ArrayList<te3.zs2> r1 = r1.f153640e
            r1.add(r11)
        L_0x019d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch1.C54725l.mo49b(yg1.a$a):boolean");
    }
}
