package yk1;

import cl1.C39970c;
import fj1.C45795b;
import gy3.C87412m;

/* renamed from: yk1.a */
public final class C66662a extends C39970c<C45795b> {

    /* renamed from: f */
    public int f191682f = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66662a(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m78644c3(yk1.C66662a r29, int r30, java.lang.String r31, java.lang.String r32, boolean r33, java.util.Map r34, int r35, java.lang.Object r36) {
        /*
            r1 = r29
            r0 = r30
            r2 = r35 & 8
            r3 = 0
            if (r2 == 0) goto L_0x000b
            r2 = 0
            goto L_0x000d
        L_0x000b:
            r2 = r33
        L_0x000d:
            r4 = r35 & 16
            if (r4 == 0) goto L_0x0014
            sx3.g0 r4 = sx3.C36903g0.f97931d
            goto L_0x0016
        L_0x0014:
            r4 = r34
        L_0x0016:
            r29.getClass()
            java.lang.Class<kq.g> r5 = p185kq.C61130g.class
            java.lang.Class<ak1.o> r6 = ak1.C54108o.class
            java.lang.Class<cl1.u> r7 = cl1.C55001u.class
            java.lang.Class<ak1.w> r8 = ak1.C54116w.class
            java.lang.String r9 = "actionResult"
            gy3.C87412m.m108594g(r4, r9)
            java.lang.String r9 = "Finder.LiveReportSlice"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "reportJoinLive exitLive:"
            r10.append(r11)
            r10.append(r2)
            java.lang.String r11 = " joinStatus:"
            r10.append(r11)
            int r11 = r1.f191682f
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            r9 = 1
            if (r2 == 0) goto L_0x0177
            di3.d r0 = di3.C86312j.m106911c(r8)
            ak1.w r0 = (ak1.C54116w) r0
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            al1.i r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r2 == 0) goto L_0x005b
            android.os.Bundle r2 = r2.f151996k
            goto L_0x005c
        L_0x005b:
            r2 = 0
        L_0x005c:
            java.util.Map r0 = r0.wx0(r2)
            r2 = r0
            java.util.HashMap r2 = (java.util.HashMap) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00b0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0095 }
            r2.<init>()     // Catch:{ all -> 0x0095 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0095 }
            java.util.Set r4 = r0.keySet()     // Catch:{ all -> 0x0095 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0095 }
        L_0x0078:
            boolean r11 = r4.hasNext()     // Catch:{ all -> 0x0095 }
            if (r11 == 0) goto L_0x008e
            java.lang.Object r11 = r4.next()     // Catch:{ all -> 0x0095 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0095 }
            java.lang.Object r12 = r0.get(r11)     // Catch:{ all -> 0x0095 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0095 }
            r2.putOpt(r11, r12)     // Catch:{ all -> 0x0095 }
            goto L_0x0078
        L_0x008e:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0095 }
            r18 = r0
            goto L_0x00b2
        L_0x0095:
            r0 = move-exception
            java.lang.String r2 = "Finder.LiveReportSlice"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r11 = "err:"
            r4.append(r11)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
        L_0x00b0:
            r18 = 0
        L_0x00b2:
            int r0 = r1.f191682f
            if (r0 != r9) goto L_0x0419
            di3.d r0 = di3.C86312j.m106911c(r8)
            ak1.w r0 = (ak1.C54116w) r0
            androidx.lifecycle.i0 r2 = r1.business(r7)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r11 = r2.f182392d
            r0.f151937e = r11
            di3.d r0 = di3.C86312j.m106911c(r8)
            ak1.w r0 = (ak1.C54116w) r0
            androidx.lifecycle.i0 r2 = r1.business(r7)
            cl1.u r2 = (cl1.C55001u) r2
            long r11 = r2.f154416j
            r0.f151943h = r11
            di3.d r0 = di3.C86312j.m106911c(r8)
            ak1.w r0 = (ak1.C54116w) r0
            di3.d r2 = di3.C86312j.m106911c(r6)
            ak1.o r2 = (ak1.C54108o) r2
            r2.getClass()
            ak1.f0 r2 = ak1.C54108o.f151869h
            ak1.f0$s0 r2 = r2.f151432N
            int r2 = r2.f151689d
            r0.f151947j = r2
            di3.d r0 = di3.C86312j.m106911c(r8)
            ak1.w r0 = (ak1.C54116w) r0
            androidx.lifecycle.i0 r2 = r1.business(r7)
            cl1.u r2 = (cl1.C55001u) r2
            java.lang.String r2 = r2.f154424u
            java.lang.String r4 = ","
            java.lang.String r6 = ";"
            r7 = 0
            r9 = 4
            r11 = 0
            r30 = r2
            r31 = r4
            r32 = r6
            r33 = r7
            r34 = r9
            r35 = r11
            java.lang.String r2 = z04.C112551y.m153816p(r30, r31, r32, r33, r34, r35)
            r0.getClass()
            r0.f151954s = r2
            di3.d r0 = di3.C86312j.m106911c(r8)
            java.lang.String r2 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            r11 = r0
            ak1.w r11 = (ak1.C54116w) r11
            ak1.f0$o0 r12 = ak1.C54067f0.C54076o0.EXIT_BEFORE_JOIN_RESP
            r14 = 0
            java.lang.String r16 = ""
            di3.d r0 = di3.C86312j.m106911c(r5)
            kq.g r0 = (p185kq.C61130g) r0
            java.lang.String r17 = r0.mo33244gK()
            r19 = 0
            r20 = 0
            r21 = 196(0xc4, float:2.75E-43)
            r22 = 0
            r13 = r18
            ak1.C54116w.Ex0(r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22)
            di3.d r0 = di3.C86312j.m106911c(r8)
            java.lang.String r2 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            ak1.w r0 = (ak1.C54116w) r0
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            com.tencent.mm.plugin.finder.live.view.b r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r2 == 0) goto L_0x015b
            android.content.Context r10 = r2.getContext()
            goto L_0x015c
        L_0x015b:
            r10 = 0
        L_0x015c:
            ak1.f0$q0 r2 = ak1.C54067f0.C54079q0.CloseTypeSlide
            r4 = 0
            r5 = 1
            r6 = 4
            r7 = 0
            r30 = r0
            r31 = r10
            r32 = r2
            r33 = r4
            r34 = r5
            r35 = r6
            r36 = r7
            ak1.C54116w.wy0(r30, r31, r32, r33, r34, r35, r36)
            r1.f191682f = r3
            goto L_0x0419
        L_0x0177:
            int r2 = r1.f191682f
            r11 = 2
            if (r2 != r11) goto L_0x0419
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            com.tencent.mm.plugin.finder.live.view.b r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r2 == 0) goto L_0x018a
            android.content.Context r2 = r2.getContext()
            goto L_0x018b
        L_0x018a:
            r2 = 0
        L_0x018b:
            java.lang.String r12 = ""
            boolean r13 = r2 instanceof android.app.Activity
            if (r13 == 0) goto L_0x01d1
            bl3.r r13 = bl3.C39818r.f106831a
            bl3.r$a r2 = r13.mo62443b(r2)
            java.lang.Class<zk1.s0> r13 = zk1.C66880s0.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r13)
            java.lang.String r13 = "UICProvider.of(context).…torReportUIC::class.java)"
            gy3.C87412m.m108593f(r2, r13)
            zk1.s0 r2 = (zk1.C66880s0) r2
            r13 = r32
            java.lang.String r13 = r2.mo90875c3(r13)
            java.lang.String r14 = r2.f192144q
            int r14 = r14.length()
            if (r14 <= 0) goto L_0x01b4
            r14 = 1
            goto L_0x01b5
        L_0x01b4:
            r14 = 0
        L_0x01b5:
            if (r14 == 0) goto L_0x01d3
            int r2 = r2.f192143p
            if (r2 != r9) goto L_0x01bd
            r2 = 1
            goto L_0x01be
        L_0x01bd:
            r2 = 0
        L_0x01be:
            if (r2 == 0) goto L_0x01d3
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t1 r2 = (ht1.C60200t1) r2
            r12 = 31
            r14 = 65
            java.lang.String r12 = r2.mo76802R1(r12, r11, r14)
            goto L_0x01d3
        L_0x01d1:
            r13 = r32
        L_0x01d3:
            r21 = r13
            di3.d r2 = di3.C86312j.m106911c(r8)
            r14 = r2
            ak1.w r14 = (ak1.C54116w) r14
            fj1.b r2 = r1.f107146d
            ak1.f0$o0 r15 = ak1.C54067f0.C54076o0.EnterRoom
            r14.getClass()
            java.lang.Class<cl1.h1> r8 = cl1.C54979h1.class
            java.lang.String r13 = "liveData"
            gy3.C87412m.m108594g(r2, r13)
            java.lang.String r13 = "contextId"
            gy3.C87412m.m108594g(r12, r13)
            eb0.C31543z5.m39453c()
            androidx.lifecycle.i0 r13 = r2.mo71262a(r7)
            cl1.u r13 = (cl1.C55001u) r13
            te3.c21 r13 = r13.f154420q
            int r13 = r13.f182396h
            long r10 = (long) r13
            r16 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r16
            r14.f151935d = r10
            androidx.lifecycle.i0 r10 = r2.mo71262a(r7)
            cl1.u r10 = (cl1.C55001u) r10
            te3.c21 r10 = r10.f154420q
            long r10 = r10.f182392d
            r14.f151937e = r10
            java.lang.Class<cl1.o> r10 = cl1.C54991o.class
            androidx.lifecycle.i0 r10 = r2.mo71262a(r10)
            cl1.o r10 = (cl1.C54991o) r10
            java.lang.String r10 = r10.f154345o
            r14.f151939f = r10
            t91.c$a r11 = t91.C64208c.f181951a
            java.lang.String r11 = "<set-?>"
            gy3.C87412m.m108594g(r10, r11)
            java.lang.Class<cl1.z0> r10 = cl1.C0702z0.class
            androidx.lifecycle.i0 r10 = r2.mo71262a(r10)
            cl1.z0 r10 = (cl1.C0702z0) r10
            java.util.List<cj1.o5> r10 = r10.f1672f
            java.lang.String r11 = "liveData.business(LiveMs…lice::class.java).msgList"
            gy3.C87412m.m108593f(r10, r11)
            monitor-enter(r10)
            java.lang.Object r11 = sx3.C110818d0.m150916N(r10)     // Catch:{ all -> 0x0415 }
            monitor-exit(r10)
            cj1.o5 r11 = (cj1.C0581o5) r11
            if (r11 == 0) goto L_0x0241
            java.lang.String r10 = r11.getContent()
            if (r10 != 0) goto L_0x0243
        L_0x0241:
            java.lang.String r10 = ""
        L_0x0243:
            r14.f151941g = r10
            androidx.lifecycle.i0 r10 = r2.mo71262a(r7)
            cl1.u r10 = (cl1.C55001u) r10
            long r10 = r10.f154416j
            r14.f151943h = r10
            di3.d r5 = di3.C86312j.m106911c(r5)
            kq.g r5 = (p185kq.C61130g) r5
            java.lang.String r5 = r5.mo33244gK()
            if (r5 != 0) goto L_0x025d
            java.lang.String r5 = ""
        L_0x025d:
            r14.f151945i = r5
            java.lang.String r5 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "FinderLiveCommentScene get "
            r10.append(r11)
            java.lang.String r11 = r14.f151945i
            r10.append(r11)
            java.lang.String r11 = " when reportJoinLive"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            di3.d r5 = di3.C86312j.m106911c(r6)
            ak1.o r5 = (ak1.C54108o) r5
            r5.getClass()
            ak1.f0 r5 = ak1.C54108o.f151869h
            ak1.f0$s0 r10 = r5.f151432N
            int r10 = r10.f151689d
            r14.f151947j = r10
            di3.d r6 = di3.C86312j.m106911c(r6)
            ak1.o r6 = (ak1.C54108o) r6
            r6.getClass()
            java.lang.String r6 = r14.f151939f
            int r5 = r5.mo74762l(r6)
            r14.f151948n = r5
            java.lang.String r5 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "reportJoinLive: commentScene="
            r6.append(r10)
            java.lang.String r10 = r14.f151945i
            r6.append(r10)
            java.lang.String r10 = ", isPrivate="
            r6.append(r10)
            int r10 = r14.f151948n
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            androidx.lifecycle.i0 r5 = r2.mo71262a(r8)
            cl1.h1 r5 = (cl1.C54979h1) r5
            boolean r5 = r5.f154137i
            androidx.lifecycle.i0 r6 = r2.mo71262a(r8)
            cl1.h1 r6 = (cl1.C54979h1) r6
            boolean r6 = r6.f154134f
            androidx.lifecycle.i0 r5 = r2.mo71262a(r7)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            int r5 = r5.f182394f
            long r5 = r14.f151937e
            long r5 = r14.yx0(r5)
            r14.f151950p = r5
            androidx.lifecycle.i0 r5 = r2.mo71262a(r7)
            cl1.u r5 = (cl1.C55001u) r5
            java.lang.String r5 = r5.f154424u
            if (r5 == 0) goto L_0x02f5
            java.lang.String r6 = ","
            java.lang.String r8 = ";"
            java.lang.String r5 = z04.C112551y.m153814n(r5, r6, r8, r3)
            goto L_0x02f7
        L_0x02f5:
            java.lang.String r5 = ""
        L_0x02f7:
            r14.f151954s = r5
            r14.f151956u = r3
            r14.f151957v = r3
            r14.f151958w = r3
            r14.f151959x = r3
            r14.f151961y = r3
            r14.f151963z = r3
            java.util.ArrayList<java.lang.String> r5 = r14.f151897A
            r5.clear()
            r14.f151898B = r3
            r14.f151899C = r3
            r14.f151900D = r3
            r14.f151901E = r3
            r14.f151902F = r3
            r14.f151905I = r3
            ak1.f0$j0 r5 = ak1.C54067f0.C54072j0.LIVE_SCREEN_PORTRAIT
            if (r0 == r9) goto L_0x0320
            r6 = 2
            if (r0 == r6) goto L_0x031e
            goto L_0x0320
        L_0x031e:
            ak1.f0$j0 r5 = ak1.C54067f0.C54072j0.LIVE_SCREEN_HORIZONTAL
        L_0x0320:
            r14.f151922V = r5
            fe1.d$b r22 = fe1.C58961d.f168673a
            java.lang.String r0 = r14.f151939f
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 14
            r28 = 0
            r23 = r0
            boolean r0 = fe1.C58961d.C58963b.m68836h(r22, r23, r24, r25, r26, r27, r28)
            r14.f151903G = r0
            r14.f151904H = r0
            r14.f151906J = r3
            long r5 = r14.f151950p
            r14.f151908L = r5
            r5 = 0
            r14.f151909M = r5
            r14.f151910N = r5
            r14.f151911P = r5
            r14.f151912Q = r3
            r14.f151914R = r3
            java.lang.String r0 = ""
            r14.f151916S = r0
            ak1.f0$o r0 = ak1.C54067f0.C54075o.LIVE_LIVING
            r14.f151918T = r0
            r14.f151920U = r3
            r14.f151924W = r5
            r14.f151926X = r5
            r14.f151928Y = r5
            r14.f151930Z = r5
            r14.f151951p0 = r3
            r14.f151934c1 = r3
            java.lang.String r0 = ""
            r14.f151936d1 = r0
            r14.f151960x0 = r3
            r14.f151962y0 = r9
            r14.f151919T0 = r3
            r14.f151921U0 = r3
            ak1.f0$a0 r0 = ak1.C54067f0.C54068a0.VIDEO
            r14.f151923V0 = r0
            r14.f151913Q0 = r3
            r14.f151915R0 = r3
            java.util.ArrayList<op3.c<ak1.f0$a0, java.lang.Long, java.lang.Boolean>> r0 = r14.f151917S0
            r0.clear()
            r14.f151938e1 = r3
            r14.f151933b1 = r3
            r14.f151944h1 = r3
            r5 = 0
            t91.C64208c.f181956f = r5
            t91.C64208c.f181957g = r3
            java.lang.String r0 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "HABBYGE-MALI, reportJoinLive, liveId="
            r5.append(r6)
            long r8 = r14.f151937e
            r5.append(r8)
            java.lang.String r6 = ", feedId="
            r5.append(r6)
            long r8 = r14.f151943h
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            androidx.lifecycle.i0 r2 = r2.mo71262a(r7)
            cl1.u r2 = (cl1.C55001u) r2
            d50.h r2 = r2.f154421r
            if (r2 == 0) goto L_0x03c0
            d50.g r2 = r2.f166251b
            if (r2 == 0) goto L_0x03c0
            int r2 = r2.mo82868a()
            goto L_0x03c1
        L_0x03c0:
            r2 = 0
        L_0x03c1:
            java.lang.String r5 = "birate"
            r0.put(r5, r2)
            java.lang.String r2 = ""
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x03fd
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x03fd }
            r5.<init>()     // Catch:{ all -> 0x03fd }
            java.util.Set r6 = r4.keySet()     // Catch:{ all -> 0x03fd }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x03fd }
        L_0x03db:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x03fd }
            if (r7 == 0) goto L_0x03f1
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x03fd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x03fd }
            java.lang.Object r8 = r4.get(r7)     // Catch:{ all -> 0x03fd }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x03fd }
            r5.put(r7, r8)     // Catch:{ all -> 0x03fd }
            goto L_0x03db
        L_0x03f1:
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x03fd }
            java.lang.String r5 = "json2.toString()"
            gy3.C87412m.m108593f(r4, r5)     // Catch:{ all -> 0x03fd }
            r16 = r4
            goto L_0x03ff
        L_0x03fd:
            r16 = r2
        L_0x03ff:
            r17 = 0
            java.lang.String r19 = r0.toString()
            r22 = 0
            r24 = 68
            r25 = 0
            r20 = r31
            r23 = r12
            ak1.C54116w.Ex0(r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25)
            r1.f191682f = r3
            goto L_0x0419
        L_0x0415:
            r0 = move-exception
            r1 = r0
            monitor-exit(r10)
            throw r1
        L_0x0419:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk1.C66662a.m78644c3(yk1.a, int, java.lang.String, java.lang.String, boolean, java.util.Map, int, java.lang.Object):void");
    }

    public void onCleared() {
        this.f191682f = 0;
    }
}
