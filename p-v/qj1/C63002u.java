package qj1;

import androidx.lifecycle.C0120a0;

/* renamed from: qj1.u */
public final class C63002u<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62898o f178764d;

    public C63002u(C62898o oVar) {
        this.f178764d = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0115 A[EDGE_INSN: B:115:0x0115->B:45:0x0115 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0111 A[LOOP:2: B:17:0x00c6->B:43:0x0111, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r23
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "startObserverAnchorTimeInSei anchorTime:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FinderLiveAdVideoPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r1 = r22
            qj1.o r3 = r1.f178764d
            java.lang.String r4 = "it"
            gy3.C87412m.m108593f(r0, r4)
            long r4 = r0.longValue()
            cl1.d$g r0 = cl1.C54951d.C54956g.IDLE
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0035
            r3.getClass()
            goto L_0x0308
        L_0x0035:
            java.lang.Class<cl1.d> r8 = cl1.C54951d.class
            androidx.lifecycle.i0 r8 = r3.mo87696x0(r8)
            cl1.d r8 = (cl1.C54951d) r8
            java.util.concurrent.CopyOnWriteArrayList<cl1.d$e> r8 = r8.f154002g
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r8.iterator()
        L_0x0048:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0062
            java.lang.Object r11 = r10.next()
            r14 = r11
            cl1.d$e r14 = (cl1.C54951d.C54955e) r14
            cl1.d$g r14 = r14.f154035a
            if (r14 != r0) goto L_0x005b
            r12 = 1
            goto L_0x005c
        L_0x005b:
            r12 = 0
        L_0x005c:
            if (r12 == 0) goto L_0x0048
            r9.add(r11)
            goto L_0x0048
        L_0x0062:
            java.util.Iterator r9 = r9.iterator()
        L_0x0066:
            boolean r10 = r9.hasNext()
            java.lang.String r11 = " duration:"
            if (r10 == 0) goto L_0x00c2
            java.lang.Object r10 = r9.next()
            cl1.d$e r10 = (cl1.C54951d.C54955e) r10
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "checkPlayInLiving id:"
            r14.append(r15)
            te3.na1 r15 = r10.f154036b
            java.lang.String r15 = r15.f138504d
            r14.append(r15)
            java.lang.String r15 = " diff:"
            r14.append(r15)
            te3.na1 r15 = r10.f154036b
            long r12 = r15.f138505e
            long r12 = r12 - r4
            r14.append(r12)
            java.lang.String r12 = " state:"
            r14.append(r12)
            cl1.d$g r12 = r10.f154035a
            r14.append(r12)
            java.lang.String r12 = " anchorT:"
            r14.append(r12)
            r14.append(r4)
            java.lang.String r12 = " statT:"
            r14.append(r12)
            te3.na1 r12 = r10.f154036b
            long r12 = r12.f138505e
            r14.append(r12)
            r14.append(r11)
            te3.na1 r10 = r10.f154036b
            long r10 = r10.f138506f
            r14.append(r10)
            java.lang.String r10 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            goto L_0x0066
        L_0x00c2:
            java.util.Iterator r9 = r8.iterator()
        L_0x00c6:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0114
            java.lang.Object r10 = r9.next()
            r13 = r10
            cl1.d$e r13 = (cl1.C54951d.C54955e) r13
            te3.na1 r14 = r13.f154036b
            r16 = r13
            long r12 = r14.f138505e
            long r6 = r14.f138506f
            long r6 = r6 + r12
            long r6 = r6 - r4
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x00e9
            r19 = 3000(0xbb8, double:1.482E-320)
            int r21 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r21 <= 0) goto L_0x00e9
            r6 = 1
            goto L_0x00ea
        L_0x00e9:
            r6 = 0
        L_0x00ea:
            long r12 = r12 - r4
            if (r14 > 0) goto L_0x0100
            r17 = 0
            int r7 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r7 > 0) goto L_0x00fb
            r19 = 1001(0x3e9, double:4.946E-321)
            int r7 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r7 >= 0) goto L_0x00fb
            r7 = 1
            goto L_0x00fc
        L_0x00fb:
            r7 = 0
        L_0x00fc:
            if (r7 == 0) goto L_0x0100
            r7 = 1
            goto L_0x0101
        L_0x0100:
            r7 = 0
        L_0x0101:
            if (r6 != 0) goto L_0x0105
            if (r7 == 0) goto L_0x010d
        L_0x0105:
            r6 = r16
            cl1.d$g r6 = r6.f154035a
            if (r6 != r0) goto L_0x010d
            r6 = 1
            goto L_0x010e
        L_0x010d:
            r6 = 0
        L_0x010e:
            if (r6 == 0) goto L_0x0111
            goto L_0x0115
        L_0x0111:
            r6 = 0
            goto L_0x00c6
        L_0x0114:
            r10 = 0
        L_0x0115:
            cl1.d$e r10 = (cl1.C54951d.C54955e) r10
            if (r10 == 0) goto L_0x01c2
            te3.na1 r0 = r10.f154036b
            long r6 = r0.f138505e
            long r8 = r0.f138506f
            long r6 = r6 + r8
            long r6 = r6 - r4
            long r8 = r8 - r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "startPlayLivingAdVideo id:"
            r0.append(r4)
            te3.na1 r4 = r10.f154036b
            java.lang.String r4 = r4.f138504d
            r0.append(r4)
            java.lang.String r4 = " left"
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = "  startPos:"
            r0.append(r4)
            r0.append(r8)
            r0.append(r11)
            te3.na1 r4 = r10.f154036b
            long r4 = r4.f138506f
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            te3.na1 r0 = r10.f154036b
            r3.mo87845e1(r0)
            r4 = 0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0163
            r6 = 0
            goto L_0x0164
        L_0x0163:
            r6 = r8
        L_0x0164:
            cl1.d$c r0 = r3.mo87843b1()
            if (r0 == 0) goto L_0x0177
            u62.d r0 = r0.getPlayer()
            boolean r0 = r0.isPlaying()
            r4 = 1
            if (r0 != r4) goto L_0x0177
            r13 = 1
            goto L_0x0178
        L_0x0177:
            r13 = 0
        L_0x0178:
            if (r13 == 0) goto L_0x0181
            java.lang.String r0 = "loadStartupVideo return for playing."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x0308
        L_0x0181:
            te3.na1 r0 = r10.f154036b
            qj1.j r2 = new qj1.j
            r2.<init>(r3, r10)
            boolean r0 = r3.mo87846f1(r0, r6, r2)
            if (r0 == 0) goto L_0x0308
            java.lang.Class<qj1.ze> r0 = qj1.C63170ze.class
            qj1.c r0 = r3.mo87687E0(r0)
            qj1.ze r0 = (qj1.C63170ze) r0
            r6 = 1
            if (r0 == 0) goto L_0x019c
            r0.mo88094f1(r6)
        L_0x019c:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            boolean r0 = r0.mo77644r()
            if (r0 == 0) goto L_0x01ad
            cl1.d$c r0 = r3.mo87843b1()
            if (r0 == 0) goto L_0x01ad
            r0.setMute(r6)
        L_0x01ad:
            cl1.d$a r0 = cl1.C54951d.C54952a.LIVING_VIDEO_PLAYING
            r3.mo87847g1(r0)
            cl1.d$g r0 = cl1.C54951d.C54956g.PLAYING
            r10.f154035a = r0
            android.widget.FrameLayout r0 = r3.f178498s
            qj1.e r2 = new qj1.e
            r2.<init>(r3)
            r0.setOnTouchListener(r2)
            goto L_0x0308
        L_0x01c2:
            r6 = 1
            java.util.Iterator r7 = r8.iterator()
        L_0x01c7:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01f5
            java.lang.Object r8 = r7.next()
            r9 = r8
            cl1.d$e r9 = (cl1.C54951d.C54955e) r9
            te3.na1 r10 = r9.f154036b
            long r10 = r10.f138505e
            long r10 = r10 - r4
            r12 = 1000(0x3e8, double:4.94E-321)
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 > 0) goto L_0x01e7
            r12 = 5001(0x1389, double:2.471E-320)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x01e7
            r10 = 1
            goto L_0x01e8
        L_0x01e7:
            r10 = 0
        L_0x01e8:
            if (r10 == 0) goto L_0x01f0
            cl1.d$g r9 = r9.f154035a
            if (r9 != r0) goto L_0x01f0
            r9 = 1
            goto L_0x01f1
        L_0x01f0:
            r9 = 0
        L_0x01f1:
            if (r9 == 0) goto L_0x01c7
            r12 = r8
            goto L_0x01f6
        L_0x01f5:
            r12 = 0
        L_0x01f6:
            cl1.d$e r12 = (cl1.C54951d.C54955e) r12
            if (r12 == 0) goto L_0x0308
            te3.na1 r0 = r12.f154036b
            long r6 = r0.f138505e
            long r6 = r6 - r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "startPlayAnimation id:"
            r0.append(r8)
            te3.na1 r8 = r12.f154036b
            java.lang.String r8 = r8.f138504d
            r0.append(r8)
            java.lang.String r8 = " animationDurationMs:"
            r0.append(r8)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            java.lang.Class<qj1.w> r0 = qj1.C63064w.class
            qj1.c r0 = r3.mo87687E0(r0)
            qj1.w r0 = (qj1.C63064w) r0
            if (r0 == 0) goto L_0x0308
            int r2 = (int) r4
            te3.na1 r3 = r12.f154036b
            long r3 = r3.f138505e
            int r4 = (int) r3
            android.animation.ValueAnimator r3 = r0.f178973w
            java.lang.String r5 = "FinderLiveAdVideoTimerPlugin"
            if (r3 == 0) goto L_0x023e
            java.lang.String r0 = "startAnimateProgress return for progressAnimator"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            goto L_0x0308
        L_0x023e:
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x025b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "startAnimateProgress return for durationMs:"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            goto L_0x0308
        L_0x025b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "startAnimateProgress startTimeMs:"
            r3.append(r8)
            r3.append(r4)
            java.lang.String r4 = " anchorTime:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " durationMs:"
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            java.lang.String r2 = "showPreTimerProgress"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            android.widget.TextView r2 = r0.f178968r
            r3 = 8
            r2.setVisibility(r3)
            android.view.View r2 = r0.f178969s
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r5)
            java.lang.Object[] r9 = r3.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoTimerPlugin"
            java.lang.String r11 = "showPreTimerProgress"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r2
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoTimerPlugin"
            java.lang.String r10 = "showPreTimerProgress"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            r2 = 0
            r0.mo10792g(r2)
            r2 = 2
            int[] r2 = new int[r2]
            r2 = {0, 100} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)
            r0.f178973w = r2
            if (r2 == 0) goto L_0x02ed
            qj1.y r3 = new qj1.y
            r3.<init>(r0)
            r2.addUpdateListener(r3)
        L_0x02ed:
            android.animation.ValueAnimator r2 = r0.f178973w
            if (r2 == 0) goto L_0x02f9
            qj1.z r3 = new qj1.z
            r3.<init>(r0)
            r2.addListener(r3)
        L_0x02f9:
            android.animation.ValueAnimator r2 = r0.f178973w
            if (r2 != 0) goto L_0x02fe
            goto L_0x0301
        L_0x02fe:
            r2.setDuration(r6)
        L_0x0301:
            android.animation.ValueAnimator r0 = r0.f178973w
            if (r0 == 0) goto L_0x0308
            r0.start()
        L_0x0308:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63002u.onChanged(java.lang.Object):void");
    }
}
