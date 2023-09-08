package hl1;

import d50.C58113g;
import hl1.C59988k;
import te3.C52005xq0;

/* renamed from: hl1.n */
public final class C60017n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59988k.C59990b f171303d;

    /* renamed from: e */
    public final /* synthetic */ boolean f171304e;

    /* renamed from: f */
    public final /* synthetic */ String f171305f;

    /* renamed from: g */
    public final /* synthetic */ String f171306g;

    /* renamed from: h */
    public final /* synthetic */ C52005xq0 f171307h;

    /* renamed from: i */
    public final /* synthetic */ C58113g f171308i;

    public C60017n(C59988k.C59990b bVar, boolean z, String str, String str2, C52005xq0 xq02, C58113g gVar) {
        this.f171303d = bVar;
        this.f171304e = z;
        this.f171305f = str;
        this.f171306g = str2;
        this.f171307h = xq02;
        this.f171308i = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0368  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r38 = this;
            r0 = r38
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            java.lang.Class<ak1.w> r3 = ak1.C54116w.class
            java.lang.Class<ak1.o> r4 = ak1.C54108o.class
            java.lang.Class<ht1.g4> r5 = ht1.C60172g4.class
            hl1.k$b r6 = r0.f171303d
            java.lang.ref.SoftReference<hl1.k> r6 = r6.f171258d
            if (r6 == 0) goto L_0x0389
            java.lang.Object r6 = r6.get()
            hl1.k r6 = (hl1.C59988k) r6
            if (r6 == 0) goto L_0x0389
            boolean r7 = r0.f171304e
            java.lang.String r8 = r0.f171305f
            java.lang.String r9 = r0.f171306g
            te3.xq0 r10 = r0.f171307h
            d50.g r11 = r0.f171308i
            bl3.r r12 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r13 = r6.f166847e
            bl3.r$a r13 = r12.mo62444c(r13)
            bl3.c r13 = r13.mo62447c(r5)
            ht1.g4 r13 = (ht1.C60172g4) r13
            java.lang.String r14 = "1"
            java.lang.String r15 = "0"
            if (r7 == 0) goto L_0x003a
            r7 = r14
            goto L_0x003b
        L_0x003a:
            r7 = r15
        L_0x003b:
            java.lang.String r0 = "is_mmbiz_live"
            r13.mo12837C3(r0, r7)
            androidx.appcompat.app.AppCompatActivity r0 = r6.f166847e
            bl3.r$a r0 = r12.mo62444c(r0)
            bl3.c r0 = r0.mo62447c(r5)
            ht1.g4 r0 = (ht1.C60172g4) r0
            java.lang.String r7 = "mmbiz_accountid"
            r0.mo12837C3(r7, r8)
            androidx.appcompat.app.AppCompatActivity r0 = r6.f166847e
            bl3.r$a r0 = r12.mo62444c(r0)
            bl3.c r0 = r0.mo62447c(r5)
            ht1.g4 r0 = (ht1.C60172g4) r0
            java.lang.String r7 = "mmbiz_nickname"
            r0.mo12837C3(r7, r9)
            t91.c$a r0 = t91.C64208c.f181951a
            if (r10 == 0) goto L_0x006d
            te3.c21 r0 = r10.f144846f
            if (r0 == 0) goto L_0x006d
            long r12 = r0.f182392d
            goto L_0x006f
        L_0x006d:
            r12 = 0
        L_0x006f:
            java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, java.lang.String>> r0 = t91.C64208c.f181947N
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
            java.lang.Object r0 = r0.get(r9)
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto L_0x00af
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0085:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x00af
            java.lang.Object r9 = r0.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            bl3.r r12 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r13 = r6.f166847e
            bl3.r$a r12 = r12.mo62444c(r13)
            bl3.c r12 = r12.mo62447c(r5)
            ht1.g4 r12 = (ht1.C60172g4) r12
            java.lang.Object r13 = r9.getKey()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            r12.mo12837C3(r13, r9)
            goto L_0x0085
        L_0x00af:
            cj1.b1$a r0 = cj1.C54738b1.f153409B
            androidx.appcompat.app.AppCompatActivity r9 = r6.f166847e
            android.content.Intent r9 = r9.getIntent()
            cj1.b1 r0 = r0.mo560b(r9)
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x00f3
            bl3.r r13 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r12 = r6.f166847e
            bl3.r$a r12 = r13.mo62444c(r12)
            bl3.c r12 = r12.mo62447c(r5)
            ht1.g4 r12 = (ht1.C60172g4) r12
            te3.eq2 r13 = r0.f153411A
            if (r13 == 0) goto L_0x00d4
            java.lang.String r13 = r13.f183025p
            goto L_0x00d5
        L_0x00d4:
            r13 = 0
        L_0x00d5:
            androidx.lifecycle.i0 r16 = r6.mo83051g(r1)
            r7 = r16
            cl1.o r7 = (cl1.C54991o) r7
            java.lang.String r7 = r7.f154345o
            boolean r7 = gy3.C87412m.m108589b(r13, r7)
            if (r7 == 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r14 = r15
        L_0x00e7:
            java.lang.String r7 = "is_pk_enter"
            r12.mo12837C3(r7, r14)
            te3.eq2 r0 = r0.f153411A
            if (r0 != 0) goto L_0x00f1
            goto L_0x00f3
        L_0x00f1:
            r0.f183025p = r9
        L_0x00f3:
            di3.d r0 = di3.C86312j.m106911c(r3)
            ak1.w r0 = (ak1.C54116w) r0
            androidx.lifecycle.i0 r7 = r6.mo83051g(r2)
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            long r7 = r7.f182392d
            di3.d r12 = di3.C86312j.m106911c(r4)
            ak1.o r12 = (ak1.C54108o) r12
            r12.getClass()
            ak1.f0 r12 = ak1.C54108o.f151869h
            java.lang.String r13 = r12.f151445a
            r0.getClass()
            java.lang.String r14 = "commentScene"
            gy3.C87412m.m108594g(r13, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "#markJoinResp "
            r14.append(r15)
            r14.append(r7)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct r0 = r0.xx0(r7)
            r0.f155490e = r7
            r7 = 1
            java.lang.String r8 = "commentSceneStr"
            java.lang.String r7 = r0.mo86045b(r8, r13, r7)
            r0.f155501p = r7
            long r7 = eb0.C31543z5.m39453c()
            r0.f155495j = r7
            androidx.lifecycle.i0 r0 = r6.mo83051g(r2)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            long r7 = r0.f182392d
            zt3.t r0 = zt3.C119157j.f356862d
            cj1.s5 r13 = new cj1.s5
            r13.<init>(r7)
            zt3.j r0 = (zt3.C119157j) r0
            java.lang.String r7 = "Finder.LiveExceptionMonitor"
            r0.mo183876g(r13, r7)
            di3.d r0 = di3.C86312j.m106911c(r4)
            r18 = r0
            ak1.o r18 = (ak1.C54108o) r18
            androidx.lifecycle.i0 r0 = r6.mo83051g(r2)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            long r7 = r0.f182392d
            java.lang.String r19 = java.lang.String.valueOf(r7)
            androidx.lifecycle.i0 r0 = r6.mo83051g(r1)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154301c3
            if (r0 == 0) goto L_0x017e
            r7 = 5
            goto L_0x0180
        L_0x017e:
            r7 = 3
        L_0x0180:
            r20 = r7
            fe1.d$b r0 = fe1.C58961d.f168673a
            androidx.lifecycle.i0 r7 = r6.mo83051g(r1)
            cl1.o r7 = (cl1.C54991o) r7
            java.lang.String r7 = r7.f154345o
            fe1.q r0 = r0.mo84155b(r7)
            if (r0 == 0) goto L_0x0199
            java.lang.String r0 = r0.getNickname()
            r22 = r0
            goto L_0x019b
        L_0x0199:
            r22 = 0
        L_0x019b:
            r23 = 0
            r18.Vx0(r19, r20, r22, r23)
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r7 = r6.f166847e
            bl3.r$a r7 = r0.mo62444c(r7)
            java.lang.Class<dk1.g> r8 = dk1.C58312g.class
            androidx.lifecycle.i0 r7 = r7.mo75002a(r8)
            java.lang.String r8 = "UICProvider.of(livingUIC…veSideBarUIC::class.java)"
            gy3.C87412m.m108593f(r7, r8)
            dk1.g r7 = (dk1.C58312g) r7
            androidx.appcompat.app.AppCompatActivity r8 = r6.f166847e
            bl3.r$a r8 = r0.mo62444c(r8)
            bl3.c r8 = r8.mo62447c(r5)
            ht1.g4 r8 = (ht1.C60172g4) r8
            java.lang.String r8 = r8.mo12868z3()
            boolean r13 = r7.f166967e
            if (r13 == 0) goto L_0x01e8
            dk1.g$a r7 = r7.f166971i
            rx3.l r7 = r7.mo83064b()
            A r8 = r7.f38555d
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            B r7 = r7.f38556e
            java.lang.String r7 = (java.lang.String) r7
            if (r8 == 0) goto L_0x01e5
            java.lang.String r8 = "temp_33"
            r21 = r7
            r20 = r8
            goto L_0x020e
        L_0x01e5:
            r21 = r7
            goto L_0x020c
        L_0x01e8:
            di3.d r7 = di3.C86312j.m106911c(r3)
            ak1.w r7 = (ak1.C54116w) r7
            r7.getClass()
            java.lang.String r13 = "value"
            gy3.C87412m.m108594g(r8, r13)
            java.lang.String r13 = ","
            r14 = 0
            boolean r15 = z04.C112550d0.m153801u(r8, r13, r14)
            if (r15 == 0) goto L_0x0207
            java.lang.String r15 = ";"
            java.lang.String r13 = z04.C112551y.m153814n(r8, r13, r15, r14)
            goto L_0x0208
        L_0x0207:
            r13 = r8
        L_0x0208:
            r7.f151907K = r13
            r21 = r8
        L_0x020c:
            r20 = r9
        L_0x020e:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            di3.d r8 = di3.C86312j.m106911c(r3)
            ak1.w r8 = (ak1.C54116w) r8
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r13 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r13.getClass()
            al1.i r13 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r13 == 0) goto L_0x0225
            android.os.Bundle r13 = r13.f151996k
            goto L_0x0226
        L_0x0225:
            r13 = 0
        L_0x0226:
            java.util.Map r8 = r8.wx0(r13)
            r13 = r8
            java.util.HashMap r13 = (java.util.HashMap) r13
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x0236
            r7.putAll(r8)
        L_0x0236:
            di3.d r8 = di3.C86312j.m106911c(r3)
            ak1.w r8 = (ak1.C54116w) r8
            ak1.f0$o r13 = ak1.C54067f0.C54075o.LIVE_LIVING
            r8.getClass()
            r8.f151918T = r13
            java.lang.Class<yk1.a> r8 = yk1.C66662a.class
            androidx.lifecycle.i0 r8 = r6.mo83051g(r8)
            r18 = r8
            yk1.a r18 = (yk1.C66662a) r18
            androidx.appcompat.app.AppCompatActivity r8 = r6.f166847e
            android.content.res.Resources r8 = r8.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r8 = r8.orientation
            r22 = 0
            r24 = 8
            r25 = 0
            r19 = r8
            r23 = r7
            yk1.C66662a.m78644c3(r18, r19, r20, r21, r22, r23, r24, r25)
            er1.g5 r26 = er1.C58730g5.f168158a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "RV_VISITOR_"
            r7.append(r8)
            androidx.lifecycle.i0 r8 = r6.mo83051g(r2)
            cl1.u r8 = (cl1.C55001u) r8
            te3.c21 r8 = r8.f154420q
            long r13 = r8.f182392d
            r7.append(r13)
            java.lang.String r27 = r7.toString()
            er1.e5$c r7 = er1.C58713e5.f168081i
            java.lang.String r7 = r7.f168101b
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 60
            r34 = 0
            r28 = r7
            er1.C58730g5.m68220e(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            di3.d r7 = di3.C86312j.m106911c(r4)
            r18 = r7
            ak1.o r18 = (ak1.C54108o) r18
            androidx.lifecycle.i0 r7 = r6.mo83051g(r2)
            cl1.u r7 = (cl1.C55001u) r7
            long r7 = r7.f154416j
            long r13 = r11.f166232b
            r16 = 0
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 > 0) goto L_0x02be
            if (r10 == 0) goto L_0x02bb
            te3.c21 r10 = r10.f144846f
            if (r10 == 0) goto L_0x02bb
            long r10 = r10.f182392d
            r21 = r10
            goto L_0x02c0
        L_0x02bb:
            r21 = 0
            goto L_0x02c0
        L_0x02be:
            r21 = r13
        L_0x02c0:
            androidx.lifecycle.i0 r10 = r6.mo83051g(r1)
            cl1.o r10 = (cl1.C54991o) r10
            java.lang.String r10 = r10.f154345o
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x02d7
            androidx.lifecycle.i0 r1 = r6.mo83051g(r1)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r1 = r1.f154345o
            goto L_0x02df
        L_0x02d7:
            androidx.lifecycle.i0 r1 = r6.mo83051g(r1)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r1 = r1.f154345o
        L_0x02df:
            r23 = r1
            di3.d r1 = di3.C86312j.m106911c(r4)
            ak1.o r1 = (ak1.C54108o) r1
            r1.getClass()
            long r10 = r12.f151447b
            java.lang.Class<cl1.e1> r1 = cl1.C0656e1.class
            androidx.lifecycle.i0 r1 = r6.mo83051g(r1)
            cl1.e1 r1 = (cl1.C0656e1) r1
            java.util.ArrayList<te3.hx0> r1 = r1.f1549f
            int r1 = r1.size()
            long r13 = (long) r1
            ak1.f0$q r28 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM_REAL
            di3.d r1 = di3.C86312j.m106911c(r4)
            ak1.o r1 = (ak1.C54108o) r1
            r1.getClass()
            java.lang.String r1 = r12.f151445a
            r30 = 1
            di3.d r15 = di3.C86312j.m106911c(r3)
            ak1.w r15 = (ak1.C54116w) r15
            r26 = r13
            long r13 = r15.f151950p
            r16 = 0
            int r15 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r15 > 0) goto L_0x031f
            long r13 = java.lang.System.currentTimeMillis()
            goto L_0x0327
        L_0x031f:
            di3.d r3 = di3.C86312j.m106911c(r3)
            ak1.w r3 = (ak1.C54116w) r3
            long r13 = r3.f151950p
        L_0x0327:
            r32 = r13
            di3.d r3 = di3.C86312j.m106911c(r4)
            ak1.o r3 = (ak1.C54108o) r3
            r3.getClass()
            ak1.f0$s0 r3 = r12.f151432N
            androidx.lifecycle.i0 r2 = r6.mo83051g(r2)
            cl1.u r2 = (cl1.C55001u) r2
            java.lang.String r2 = r2.f154424u
            androidx.appcompat.app.AppCompatActivity r12 = r6.f166847e
            bl3.r$a r12 = r0.mo62444c(r12)
            bl3.c r12 = r12.mo62447c(r5)
            ht1.g4 r12 = (ht1.C60172g4) r12
            java.lang.String r12 = r12.mo12839E3()
            if (r12 != 0) goto L_0x0351
            r36 = r9
            goto L_0x0353
        L_0x0351:
            r36 = r12
        L_0x0353:
            androidx.appcompat.app.AppCompatActivity r6 = r6.f166847e
            bl3.r$a r0 = r0.mo62444c(r6)
            bl3.c r0 = r0.mo62447c(r5)
            ht1.g4 r0 = (ht1.C60172g4) r0
            java.lang.String r0 = r0.mo12868z3()
            if (r0 != 0) goto L_0x0368
            r37 = r9
            goto L_0x036a
        L_0x0368:
            r37 = r0
        L_0x036a:
            r19 = r7
            r24 = r10
            r29 = r1
            r34 = r3
            r35 = r2
            r18.Hx0(r19, r21, r23, r24, r26, r28, r29, r30, r32, r34, r35, r36, r37)
            di3.d r0 = di3.C86312j.m106911c(r4)
            java.lang.String r1 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            ht1.j5 r0 = (ht1.C8777j5) r0
            ak1.f0$n r1 = ak1.C54067f0.C0066n.MORE
            r2 = 2
            r3 = 0
            ht1.C8777j5.C8778a.m8608i(r0, r1, r3, r2, r3)
        L_0x0389:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C60017n.run():void");
    }
}
