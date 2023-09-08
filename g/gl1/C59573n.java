package gl1;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C52005xq0;

/* renamed from: gl1.n */
public final class C59573n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170278d;

    /* renamed from: e */
    public final /* synthetic */ C52005xq0 f170279e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59573n(C59559k kVar, C52005xq0 xq02) {
        super(0);
        this.f170278d = kVar;
        this.f170279e = xq02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:180:0x04c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r45 = this;
            r0 = r45
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            cj1.w3 r3 = cj1.C54843w3.f153747a
            gl1.k r4 = r0.f170278d
            fj1.b r4 = r4.f166851d
            r3.mo75792g(r4)
            gl1.k r4 = r0.f170278d
            fj1.b r4 = r4.f166851d
            te3.xq0 r5 = r0.f170279e
            java.lang.String r5 = r5.f144823S
            r3.mo75793h(r4, r5)
            te3.xq0 r4 = r0.f170279e
            te3.c21 r4 = r4.f144846f
            r5 = 0
            if (r4 == 0) goto L_0x0024
            int r4 = r4.f182374S
            goto L_0x0025
        L_0x0024:
            r4 = 0
        L_0x0025:
            r6 = 64
            boolean r4 = o40.C61926c.m72696u(r4, r6)
            gl1.k r6 = r0.f170278d
            java.lang.String r6 = r6.f170243j
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#handleJoinResp.setAnchorStatus isBizMode="
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            if (r4 != 0) goto L_0x0050
            gl1.k r4 = r0.f170278d
            fj1.b r4 = r4.f166851d
            te3.xq0 r6 = r0.f170279e
            te3.wg0 r6 = r6.f144807D
            r3.mo75791f(r4, r6)
        L_0x0050:
            gl1.k r4 = r0.f170278d
            fj1.b r4 = r4.f166851d
            r3.mo75788c(r4)
            gl1.k r4 = r0.f170278d
            fj1.b r4 = r4.f166851d
            te3.xq0 r6 = r0.f170279e
            te3.cs1 r6 = r6.f144813J
            r3.mo75787b(r4, r6)
            gl1.k r3 = r0.f170278d
            r3.mo84606l(r5)
            gl1.k r3 = r0.f170278d
            androidx.lifecycle.i0 r3 = r3.mo83051g(r1)
            cl1.o r3 = (cl1.C54991o) r3
            long r6 = android.os.SystemClock.elapsedRealtimeNanos()
            r3.f154325i1 = r6
            gl1.k r3 = r0.f170278d
            vk1.b r3 = r3.f166842f
            r4 = 2
            r6 = 0
            if (r3 == 0) goto L_0x0082
            d60.b$b r7 = d60.C58124b.C58125b.START_LIVE
            d60.C58124b.C7172a.m7372a(r3, r7, r6, r4, r6)
        L_0x0082:
            gl1.k r3 = r0.f170278d
            vk1.b r3 = r3.f166842f
            if (r3 == 0) goto L_0x0099
            al1.h r3 = r3.getData()
            if (r3 == 0) goto L_0x0099
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r3 = r3.f151979f
            if (r3 == 0) goto L_0x0099
            gh1.j r7 = gh1.C59447j.f169870a
            te3.xq0 r8 = r0.f170279e
            r7.mo84556h(r3, r8)
        L_0x0099:
            com.tencent.mm.autogen.events.FeedLiveLifeEvent r3 = new com.tencent.mm.autogen.events.FeedLiveLifeEvent
            r3.<init>()
            r3.publish()
            er1.C58704c5.C58705a.f168049b = r4
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 1552(0x610, double:7.67E-321)
            r9 = 19
            r3.mo175912v(r7, r9)
            er1.c5 r3 = er1.C58704c5.f168044a
            java.lang.String r3 = "Finder.LiveAnchorFlowStats"
            java.lang.String r7 = "reportSecodarySuccLive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            er1.f5 r8 = er1.C58728f5.f168144a
            long r9 = eb0.C31543z5.m39451a()
            er1.C58728f5.f168146c = r9
            gl1.k r3 = r0.f170278d
            fj1.b r9 = r3.f166851d
            r10 = 19
            r11 = 0
            r13 = 0
            r14 = 16
            r15 = 0
            java.lang.String r12 = "secondarySuccLive"
            er1.C58728f5.m68216c(r8, r9, r10, r11, r12, r13, r14, r15)
            gl1.k r3 = r0.f170278d
            te3.xq0 r7 = r0.f170279e
            te3.m31 r7 = r7.f144848g
            r3.getClass()
            java.lang.Class<ak1.w> r8 = ak1.C54116w.class
            java.lang.Class<cl1.d0> r9 = cl1.C54963d0.class
            if (r7 == 0) goto L_0x00df
            java.util.LinkedList<te3.l31> r10 = r7.f137806j
            goto L_0x00e0
        L_0x00df:
            r10 = r6
        L_0x00e0:
            if (r10 != 0) goto L_0x00e7
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
        L_0x00e7:
            if (r7 == 0) goto L_0x00ec
            te3.o31 r11 = r7.f137807n
            goto L_0x00ed
        L_0x00ec:
            r11 = r6
        L_0x00ed:
            if (r7 == 0) goto L_0x00f2
            te3.iw0 r12 = r7.f137808o
            goto L_0x00f3
        L_0x00f2:
            r12 = r6
        L_0x00f3:
            java.lang.String r13 = r3.f170243j
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "checkLinkMicStateWhenJoin micUserList.size:"
            r14.append(r15)
            int r15 = r10.size()
            r14.append(r15)
            java.lang.String r15 = " micInfo:[sessionId:"
            r14.append(r15)
            if (r7 == 0) goto L_0x0110
            java.lang.String r7 = r7.f137800d
            goto L_0x0111
        L_0x0110:
            r7 = r6
        L_0x0111:
            r14.append(r7)
            java.lang.String r7 = ", micUserList:"
            r14.append(r7)
            r14.append(r10)
            java.lang.String r7 = "], micPkInfo:[sessionId:"
            r14.append(r7)
            if (r11 == 0) goto L_0x0126
            java.lang.String r7 = r11.f138922d
            goto L_0x0127
        L_0x0126:
            r7 = r6
        L_0x0127:
            r14.append(r7)
            java.lang.String r7 = ", seq:"
            r14.append(r7)
            if (r11 == 0) goto L_0x0138
            long r5 = r11.f138923e
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L_0x0139
        L_0x0138:
            r5 = 0
        L_0x0139:
            r14.append(r5)
            java.lang.String r5 = ", micNickname:"
            r14.append(r5)
            if (r11 == 0) goto L_0x014e
            te3.hx0 r5 = r11.f138925g
            if (r5 == 0) goto L_0x014e
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f134919d
            if (r5 == 0) goto L_0x014e
            java.lang.String r5 = r5.nickname
            goto L_0x014f
        L_0x014e:
            r5 = 0
        L_0x014f:
            r14.append(r5)
            java.lang.String r5 = ", status:"
            r14.append(r5)
            if (r11 == 0) goto L_0x0160
            int r5 = r11.f138926h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0161
        L_0x0160:
            r5 = 0
        L_0x0161:
            r14.append(r5)
            r5 = 93
            r14.append(r5)
            java.lang.String r5 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r5)
            java.lang.String r5 = "checkLinkMicStateWhenJoin has unfinished mic others. update mic status"
            r6 = 1
            if (r11 == 0) goto L_0x03e6
            java.lang.String r13 = r11.f138922d
            if (r13 == 0) goto L_0x0182
            int r13 = r13.length()
            if (r13 != 0) goto L_0x0180
            goto L_0x0182
        L_0x0180:
            r13 = 0
            goto L_0x0183
        L_0x0182:
            r13 = 1
        L_0x0183:
            if (r13 != 0) goto L_0x03e6
            java.lang.String r13 = r3.f170243j
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r7 = "checkLinkMicStateWhenJoin has unfinished mic pk status:"
            r14.append(r7)
            int r7 = r11.f138926h
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r14.append(r7)
            java.lang.String r7 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r7)
            te3.hx0 r7 = r11.f138925g
            if (r7 == 0) goto L_0x0345
            java.lang.String r7 = r11.f138924f
            androidx.lifecycle.i0 r1 = r3.mo83051g(r1)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r1 = r1.mo76015n4()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r1)
            if (r1 != 0) goto L_0x0345
            int r1 = r11.f138926h
            if (r1 != r6) goto L_0x01c3
            androidx.lifecycle.i0 r1 = r3.mo83051g(r9)
            cl1.d0 r1 = (cl1.C54963d0) r1
            goto L_0x0345
        L_0x01c3:
            if (r1 != r4) goto L_0x0345
            androidx.lifecycle.i0 r1 = r3.mo83051g(r9)
            cl1.d0 r1 = (cl1.C54963d0) r1
            long r13 = r11.f138923e
            r1.f154069i = r13
            al1.j r1 = new al1.j
            java.lang.String r7 = r11.f138924f
            te3.hx0 r13 = r11.f138925g
            if (r13 == 0) goto L_0x01e0
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r13.f134919d
            if (r14 == 0) goto L_0x01e0
            java.lang.String r14 = r14.headUrl
            r19 = r14
            goto L_0x01e2
        L_0x01e0:
            r19 = 0
        L_0x01e2:
            if (r13 == 0) goto L_0x01ed
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r13.f134919d
            if (r14 == 0) goto L_0x01ed
            java.lang.String r14 = r14.username
            r20 = r14
            goto L_0x01ef
        L_0x01ed:
            r20 = 0
        L_0x01ef:
            if (r13 == 0) goto L_0x01fa
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r13.f134919d
            if (r14 == 0) goto L_0x01fa
            java.lang.String r14 = r14.nickname
            r21 = r14
            goto L_0x01fc
        L_0x01fa:
            r21 = 0
        L_0x01fc:
            r22 = 2
            java.lang.String r14 = r11.f138922d
            r24 = 0
            r25 = 1
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            if (r13 == 0) goto L_0x0217
            java.lang.String r15 = r13.f134927o
            r32 = r15
            goto L_0x0219
        L_0x0217:
            r32 = 0
        L_0x0219:
            r33 = 0
            r34 = 0
            r37 = 0
            r38 = 0
            if (r13 == 0) goto L_0x0228
            te3.up2 r15 = r13.f134935w
            r39 = r15
            goto L_0x022a
        L_0x0228:
            r39 = 0
        L_0x022a:
            r40 = 0
            r41 = 0
            r42 = 7192320(0x6dbf00, float:1.0078587E-38)
            r43 = 0
            r17 = r1
            r18 = r7
            r23 = r14
            r36 = r13
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38, r39, r40, r41, r42, r43)
            androidx.lifecycle.i0 r7 = r3.mo83051g(r9)
            cl1.d0 r7 = (cl1.C54963d0) r7
            r7.mo75917Y3(r1)
            androidx.lifecycle.i0 r7 = r3.mo83051g(r9)
            cl1.d0 r7 = (cl1.C54963d0) r7
            r7.f154073p = r1
            androidx.lifecycle.i0 r1 = r3.mo83051g(r9)
            cl1.d0 r1 = (cl1.C54963d0) r1
            r7 = 4
            r1.f154078u = r7
            di3.d r1 = di3.C86312j.m106911c(r8)
            ak1.w r1 = (ak1.C54116w) r1
            androidx.lifecycle.i0 r7 = r3.mo83051g(r2)
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            long r13 = r7.f182392d
            r1.Ax0(r13, r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r3.mo84609o(r1)
            di3.d r1 = di3.C86312j.m106911c(r8)
            ak1.w r1 = (ak1.C54116w) r1
            androidx.lifecycle.i0 r6 = r3.mo83051g(r2)
            cl1.u r6 = (cl1.C55001u) r6
            te3.c21 r6 = r6.f154420q
            long r6 = r6.f182392d
            r1.Bx0(r6)
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L_0x032e
            java.lang.String r1 = r3.f170243j
            java.lang.String r6 = "checkLinkMicStateWhenJoin has self room audience mic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            java.util.Iterator r1 = r10.iterator()
        L_0x0296:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x032e
            java.lang.Object r6 = r1.next()
            te3.l31 r6 = (te3.C50209l31) r6
            if (r6 == 0) goto L_0x02a7
            te3.hx0 r15 = r6.f137145d
            goto L_0x02a8
        L_0x02a7:
            r15 = 0
        L_0x02a8:
            if (r15 == 0) goto L_0x0296
            java.lang.String r7 = r3.f170243j
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            androidx.lifecycle.i0 r7 = r3.mo83051g(r9)
            cl1.d0 r7 = (cl1.C54963d0) r7
            al1.j r8 = new al1.j
            java.lang.String r10 = r6.f137147f
            te3.hx0 r13 = r6.f137145d
            if (r13 == 0) goto L_0x02c6
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r13.f134919d
            if (r14 == 0) goto L_0x02c6
            java.lang.String r15 = r14.headUrl
            r19 = r15
            goto L_0x02c8
        L_0x02c6:
            r19 = 0
        L_0x02c8:
            if (r13 == 0) goto L_0x02d3
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r13.f134919d
            if (r14 == 0) goto L_0x02d3
            java.lang.String r15 = r14.username
            r20 = r15
            goto L_0x02d5
        L_0x02d3:
            r20 = 0
        L_0x02d5:
            if (r13 == 0) goto L_0x02e0
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r13.f134919d
            if (r14 == 0) goto L_0x02e0
            java.lang.String r15 = r14.nickname
            r21 = r15
            goto L_0x02e2
        L_0x02e0:
            r21 = 0
        L_0x02e2:
            int r14 = r6.f137146e
            java.lang.String r15 = r6.f137148g
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            if (r13 == 0) goto L_0x02f9
            int r4 = r13.f134923h
            r30 = r4
            goto L_0x02fb
        L_0x02f9:
            r30 = 0
        L_0x02fb:
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 8253376(0x7defc0, float:1.1565443E-38)
            r43 = 0
            r17 = r8
            r18 = r10
            r22 = r14
            r23 = r15
            r36 = r13
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38, r39, r40, r41, r42, r43)
            r7.mo75917Y3(r8)
            int r4 = r6.f137146e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.mo84609o(r4)
            r4 = 2
            goto L_0x0296
        L_0x032e:
            androidx.lifecycle.i0 r1 = r3.mo83051g(r9)
            cl1.d0 r1 = (cl1.C54963d0) r1
            java.util.LinkedList<te3.l31> r4 = r11.f138927i
            java.util.List r1 = r1.mo75920b4(r4)
            androidx.lifecycle.i0 r4 = r3.mo83051g(r9)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.lang.String r5 = r11.f138922d
            r4.mo75925g3(r1, r5)
        L_0x0345:
            if (r12 == 0) goto L_0x04b9
            java.lang.String r1 = r3.f170243j
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "battleInfo.status:"
            r4.append(r5)
            int r5 = r12.f135700f
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            int r1 = r12.f135700f
            r4 = 10
            java.lang.String r5 = "battleInfo.player_info"
            if (r1 == r4) goto L_0x03ac
            r4 = 20
            if (r1 == r4) goto L_0x036d
            goto L_0x04b9
        L_0x036d:
            androidx.lifecycle.i0 r1 = r3.mo83051g(r9)
            cl1.d0 r1 = (cl1.C54963d0) r1
            cj1.a1 r1 = r1.f154051E
            if (r1 == 0) goto L_0x037e
            int r4 = r12.f135703i
            r6 = 3
            r1.f153392e = r6
            r1.f153391d = r4
        L_0x037e:
            androidx.lifecycle.i0 r1 = r3.mo83051g(r9)
            cl1.d0 r1 = (cl1.C54963d0) r1
            cj1.a1 r1 = r1.f154051E
            if (r1 != 0) goto L_0x0389
            goto L_0x038d
        L_0x0389:
            int r4 = r12.f135701g
            r1.f153390c = r4
        L_0x038d:
            androidx.lifecycle.i0 r1 = r3.mo83051g(r9)
            cl1.d0 r1 = (cl1.C54963d0) r1
            cj1.a1 r1 = r1.f154051E
            if (r1 == 0) goto L_0x039f
            java.util.LinkedList<te3.ae3> r4 = r12.f135702h
            gy3.C87412m.m108593f(r4, r5)
            r1.mo75625d(r4)
        L_0x039f:
            vk1.b r1 = r3.f166842f
            if (r1 == 0) goto L_0x04b9
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_BATTLE_END
            r4 = 2
            r5 = 0
            d60.C58124b.C7172a.m7372a(r1, r3, r5, r4, r5)
            goto L_0x04b9
        L_0x03ac:
            androidx.lifecycle.i0 r1 = r3.mo83051g(r9)
            cl1.d0 r1 = (cl1.C54963d0) r1
            cj1.a1 r4 = new cj1.a1
            java.lang.String r6 = r12.f135698d
            long r7 = r12.f135699e
            int r9 = r12.f135701g
            r21 = -1
            r22 = 2
            r23 = 0
            r24 = 32
            r25 = 0
            r16 = r4
            r17 = r6
            r18 = r7
            r20 = r9
            r16.<init>(r17, r18, r20, r21, r22, r23, r24, r25)
            java.util.LinkedList<te3.ae3> r6 = r12.f135702h
            gy3.C87412m.m108593f(r6, r5)
            r4.mo75625d(r6)
            r1.f154051E = r4
            vk1.b r1 = r3.f166842f
            if (r1 == 0) goto L_0x04b9
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_BATTLE_START
            r4 = 0
            r5 = 2
            d60.C58124b.C7172a.m7372a(r1, r3, r4, r5, r4)
            goto L_0x04b9
        L_0x03e6:
            r4 = 0
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L_0x04b9
            java.lang.String r1 = r3.f170243j
            java.lang.String r7 = "checkLinkMicStateWhenJoin has unfinished mic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            java.util.Iterator r1 = r10.iterator()
        L_0x03f8:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0493
            java.lang.Object r7 = r1.next()
            te3.l31 r7 = (te3.C50209l31) r7
            if (r7 == 0) goto L_0x040b
            te3.hx0 r10 = r7.f137145d
            r44 = r10
            goto L_0x040d
        L_0x040b:
            r44 = r4
        L_0x040d:
            if (r44 == 0) goto L_0x03f8
            java.lang.String r10 = r3.f170243j
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            androidx.lifecycle.i0 r10 = r3.mo83051g(r9)
            cl1.d0 r10 = (cl1.C54963d0) r10
            al1.j r11 = new al1.j
            java.lang.String r12 = r7.f137147f
            te3.hx0 r13 = r7.f137145d
            if (r13 == 0) goto L_0x042b
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r13.f134919d
            if (r14 == 0) goto L_0x042b
            java.lang.String r14 = r14.headUrl
            r19 = r14
            goto L_0x042d
        L_0x042b:
            r19 = r4
        L_0x042d:
            if (r13 == 0) goto L_0x0438
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r13.f134919d
            if (r14 == 0) goto L_0x0438
            java.lang.String r14 = r14.username
            r20 = r14
            goto L_0x043a
        L_0x0438:
            r20 = r4
        L_0x043a:
            if (r13 == 0) goto L_0x0445
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r13.f134919d
            if (r14 == 0) goto L_0x0445
            java.lang.String r14 = r14.nickname
            r21 = r14
            goto L_0x0447
        L_0x0445:
            r21 = r4
        L_0x0447:
            int r14 = r7.f137146e
            java.lang.String r15 = r7.f137148g
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            if (r13 == 0) goto L_0x045e
            int r4 = r13.f134923h
            r30 = r4
            goto L_0x0460
        L_0x045e:
            r30 = 0
        L_0x0460:
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 8253376(0x7defc0, float:1.1565443E-38)
            r43 = 0
            r17 = r11
            r18 = r12
            r22 = r14
            r23 = r15
            r36 = r13
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38, r39, r40, r41, r42, r43)
            r10.mo75917Y3(r11)
            int r4 = r7.f137146e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.mo84609o(r4)
            r4 = 0
            goto L_0x03f8
        L_0x0493:
            di3.d r1 = di3.C86312j.m106911c(r8)
            ak1.w r1 = (ak1.C54116w) r1
            androidx.lifecycle.i0 r4 = r3.mo83051g(r2)
            cl1.u r4 = (cl1.C55001u) r4
            te3.c21 r4 = r4.f154420q
            long r4 = r4.f182392d
            r1.Ax0(r4, r6)
            di3.d r1 = di3.C86312j.m106911c(r8)
            ak1.w r1 = (ak1.C54116w) r1
            androidx.lifecycle.i0 r3 = r3.mo83051g(r2)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r3 = r3.f182392d
            r1.Bx0(r3)
        L_0x04b9:
            gl1.k r1 = r0.f170278d
            r1.getClass()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            cj1.n5 r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159396y
            if (r3 == 0) goto L_0x04ef
            gl1.k r1 = r0.f170278d
            androidx.lifecycle.i0 r1 = r1.mo83051g(r2)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r4 = r1.f182392d
            gl1.k r1 = r0.f170278d
            androidx.lifecycle.i0 r1 = r1.mo83051g(r2)
            cl1.u r1 = (cl1.C55001u) r1
            long r6 = r1.f154416j
            gl1.k r1 = r0.f170278d
            androidx.lifecycle.i0 r1 = r1.mo83051g(r2)
            cl1.u r1 = (cl1.C55001u) r1
            java.lang.String r8 = r1.f154423t
            r9 = 2
            r10 = 0
            r11 = 16
            r12 = 0
            cj1.C54795n5.C54796a.m61724b(r3, r4, r6, r8, r9, r10, r11, r12)
        L_0x04ef:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gl1.C59573n.invoke():java.lang.Object");
    }
}
