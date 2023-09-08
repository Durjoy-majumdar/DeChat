package cj1;

import android.os.Bundle;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fj1.C45795b;
import fy3.C32224a;
import gh1.C59447j;
import gy3.C87413o;
import ls3.C61398h;
import lu3.C34379c;
import rx3.C13598b0;
import te3.C64273c21;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: cj1.t4 */
public final class C54834t4 implements C61398h.C61400b {

    /* renamed from: a */
    public final /* synthetic */ C55001u f153736a;

    /* renamed from: cj1.t4$a */
    public static final class C54835a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C54835a f153737d = new C54835a();

        public C54835a() {
            super(0);
        }

        public Object invoke() {
            C28574j6 j6Var = FinderLiveService.f159386p0;
            if (j6Var != null) {
                j6Var.mo56066b();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t4$b */
    public static final class C54836b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C54836b f153738d = new C54836b();

        public C54836b() {
            super(0);
        }

        public Object invoke() {
            C28574j6 j6Var = FinderLiveService.f159386p0;
            if (j6Var != null) {
                j6Var.mo56065a();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t4$c */
    public static final class C54837c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C54837c f153739d = new C54837c();

        public C54837c() {
            super(0);
        }

        public Object invoke() {
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (bVar != null) {
                C58124b.C58125b bVar2 = C58124b.C58125b.LIVE_HAS_FINISHED;
                Bundle bundle = new Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_IF_CLOSE_LIVE", true);
                bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL", false);
                C13598b0 b0Var = C13598b0.f38549a;
                bVar.statusChange(bVar2, bundle);
            }
            LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
            if (liveRoomControllerStore != null) {
                C59447j.f169870a.mo84549a(liveRoomControllerStore);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t4$d */
    public static final class C54838d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C54838d f153740d = new C54838d();

        public C54838d() {
            super(0);
        }

        public Object invoke() {
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (bVar != null) {
                C58124b.C7172a.m7372a(bVar, C58124b.C58125b.LIVE_STATUS_VISITOR_KICKED, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t4$e */
    public static final class C54839e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C54839e f153741d = new C54839e();

        public C54839e() {
            super(0);
        }

        public Object invoke() {
            Class cls = C54991o.class;
            C45795b bVar = C45795b.f123698n;
            if (bVar != null) {
                C55001u uVar = (C55001u) bVar.mo71262a(C55001u.class);
                StringBuilder sb = new StringBuilder();
                sb.append("heartBeatGuard it.isLiveStarted():");
                sb.append(((C54991o) uVar.business(cls)).mo75999e4());
                sb.append(" heartbeatGuardEnable:");
                long j = 0;
                boolean z = true;
                sb.append(C54749e2.f153457a > 0);
                sb.append(" liveId:");
                C64273c21 c212 = uVar.f154420q;
                sb.append(c212 != null ? Long.valueOf(c212.f182392d) : null);
                sb.append(" HEART_BEAT_GUARD_INTERVAL:");
                sb.append(C54749e2.f153457a);
                Log.m105924i("FinderLiveGuard", sb.toString());
                if (C54749e2.f153457a <= 0) {
                    z = false;
                }
                if (z) {
                    if (((C54991o) uVar.business(cls)).mo75999e4()) {
                        C64273c21 c213 = uVar.f154420q;
                        if (c213 != null) {
                            j = c213.f182392d;
                        }
                        FinderLiveService.C29960c cVar = new FinderLiveService.C29960c(j);
                        C34379c<?> cVar2 = C54749e2.f153458b;
                        if (cVar2 != null) {
                            cVar2.cancel(false);
                        }
                        C119179t tVar = C119157j.f356862d;
                        long j2 = C54749e2.f153457a;
                        C119157j jVar = (C119157j) tVar;
                        jVar.getClass();
                        C54749e2.f153458b = jVar.mo183892w(cVar, j2, false);
                    } else {
                        C34379c<?> cVar3 = C54749e2.f153458b;
                        if (cVar3 != null) {
                            cVar3.cancel(false);
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C54834t4(C55001u uVar) {
        this.f153736a = uVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0303, code lost:
        if (((java.lang.Boolean) up1.C37521f.f99409g8.mo60266n()).booleanValue() == false) goto L_0x0305;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75426a(int r18, int r19, java.lang.String r20, te3.C48742ao0 r21, int r22, java.lang.String r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            r5 = r23
            java.lang.Class<cl1.u> r6 = cl1.C55001u.class
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            java.lang.String r8 = "resp"
            gy3.C87412m.m108594g(r3, r8)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r8.getClass()
            boolean r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159356I
            java.lang.String r10 = "Finder.FinderLiveService"
            if (r9 == 0) goto L_0x0037
            cl1.u r9 = r0.f153736a
            androidx.lifecycle.i0 r9 = r9.business(r7)
            cl1.o r9 = (cl1.C54991o) r9
            boolean r9 = r9.f154186C
            if (r9 != 0) goto L_0x0037
            java.lang.String r1 = "handleLiveMsgResp result false, liveCookies is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            cj1.t4$a r1 = cj1.C54834t4.C54835a.f153737d
            o40.C61926c.m72668M(r1)
            return
        L_0x0037:
            boolean r9 = r8.mo77642p(r5)
            if (r9 == 0) goto L_0x0068
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleLiveMsgResp uniqueId is not eqauls! onCgiBack-uniqueId = "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ", currentId = "
            r1.append(r2)
            androidx.lifecycle.i0 r2 = r8.mo77630e(r6)
            cl1.u r2 = (cl1.C55001u) r2
            if (r2 == 0) goto L_0x005b
            java.lang.String r2 = r2.f154426w
            if (r2 != 0) goto L_0x005d
        L_0x005b:
            java.lang.String r2 = "null"
        L_0x005d:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            return
        L_0x0068:
            int r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159366R0
            r11 = 1
            int r9 = r9 + r11
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159366R0 = r9
            java.lang.Class<cl1.v> r9 = cl1.C55002v.class
            androidx.lifecycle.i0 r9 = r8.mo77630e(r9)
            cl1.v r9 = (cl1.C55002v) r9
            if (r9 != 0) goto L_0x0079
            goto L_0x007d
        L_0x0079:
            int r12 = r3.f130680h
            r9.f154431g = r12
        L_0x007d:
            androidx.lifecycle.i0 r9 = r8.mo77630e(r7)
            cl1.o r9 = (cl1.C54991o) r9
            if (r9 == 0) goto L_0x00bb
            pe1.c<java.lang.Integer> r15 = gg1.C32444a.f86157j
            java.lang.Object r16 = r15.mo60266n()
            java.lang.Number r16 = (java.lang.Number) r16
            int r16 = r16.intValue()
            if (r16 == 0) goto L_0x00ab
            er1.j4 r16 = er1.C58739j4.f168176a
            boolean r16 = r16.mo83692U()
            if (r16 == 0) goto L_0x00ab
            java.lang.Object r15 = r15.mo60266n()
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            if (r15 != r11) goto L_0x00a9
            r12 = 1
            goto L_0x00b9
        L_0x00a9:
            r12 = 0
            goto L_0x00b9
        L_0x00ab:
            te3.cy0 r15 = r3.f130675M
            if (r15 == 0) goto L_0x00b2
            long r12 = r15.f132019d
            goto L_0x00b4
        L_0x00b2:
            r12 = 0
        L_0x00b4:
            long r14 = (long) r11
            boolean r12 = o40.C61926c.m72697v(r12, r14)
        L_0x00b9:
            r9.f154273W1 = r12
        L_0x00bb:
            zt3.t r9 = zt3.C119157j.f356862d
            cj1.u5 r12 = cj1.C80042u5.f234481d
            zt3.j r9 = (zt3.C119157j) r9
            java.lang.String r13 = "Finder.LiveExceptionMonitor"
            r9.mo183876g(r12, r13)
            r8.getClass()
            fj1.b r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            te3.uv0 r12 = r3.f130671I
            java.lang.String r13 = "livemsg"
            if (r9 == 0) goto L_0x00f9
            if (r12 == 0) goto L_0x00f9
            androidx.lifecycle.i0 r9 = r9.mo71262a(r7)
            cl1.o r9 = (cl1.C54991o) r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = "processAudienceEventInfo "
            r9.append(r14)
            r9.append(r13)
            java.lang.String r14 = ", token:"
            r9.append(r14)
            java.lang.String r12 = r12.f143154d
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            java.lang.String r12 = "Finder.OlympicsLiveRoomUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
        L_0x00f9:
            fj1.b r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            te3.c21 r12 = r3.f130678f
            if (r12 == 0) goto L_0x0102
            te3.by0 r12 = r12.f182402p0
            goto L_0x0103
        L_0x0102:
            r12 = 0
        L_0x0103:
            if (r9 == 0) goto L_0x0112
            if (r12 == 0) goto L_0x0112
            er1.e1 r15 = er1.C45681e1.f123485a
            androidx.lifecycle.i0 r9 = r9.mo71262a(r7)
            cl1.o r9 = (cl1.C54991o) r9
            r15.mo71179a(r9, r13, r12)
        L_0x0112:
            java.lang.Class<yg1.e> r9 = yg1.C66636e.class
            androidx.lifecycle.i0 r9 = r8.mo77630e(r9)
            yg1.e r9 = (yg1.C66636e) r9
            if (r9 == 0) goto L_0x0131
            yg1.a r12 = new yg1.a
            r12.<init>()
            r12.f105068a = r2
            r12.f105069b = r1
            yg1.a$a r13 = new yg1.a$a
            r13.<init>(r3, r4)
            r12.f105070c = r13
            r12.f105071d = r5
            r9.mo89859e3(r12)
        L_0x0131:
            androidx.lifecycle.i0 r9 = r8.mo77630e(r7)
            cl1.o r9 = (cl1.C54991o) r9
            if (r9 == 0) goto L_0x0269
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "cur liveId:"
            r12.append(r13)
            androidx.lifecycle.i0 r13 = r9.business(r6)
            cl1.u r13 = (cl1.C55001u) r13
            te3.c21 r13 = r13.f154420q
            long r14 = r13.f182392d
            r12.append(r14)
            java.lang.String r13 = ",remote liveId:"
            r12.append(r13)
            te3.c21 r13 = r3.f130678f
            if (r13 == 0) goto L_0x0160
            long r13 = r13.f182392d
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            goto L_0x0161
        L_0x0160:
            r13 = 0
        L_0x0161:
            r12.append(r13)
            java.lang.String r13 = ",likeCnt:"
            r12.append(r13)
            androidx.lifecycle.i0 r13 = r9.business(r6)
            cl1.u r13 = (cl1.C55001u) r13
            te3.c21 r13 = r13.f154420q
            long r13 = r13.f182414z
            r12.append(r13)
            java.lang.String r13 = ",show like Cnt:"
            r12.append(r13)
            long r13 = r9.f154276X
            r12.append(r13)
            java.lang.String r13 = ", remoteLikeCnt:"
            r12.append(r13)
            te3.c21 r13 = r3.f130678f
            if (r13 == 0) goto L_0x0190
            long r13 = r13.f182414z
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            goto L_0x0191
        L_0x0190:
            r13 = 0
        L_0x0191:
            r12.append(r13)
            java.lang.String r13 = ", onlineCount:"
            r12.append(r13)
            androidx.lifecycle.i0 r13 = r9.business(r6)
            cl1.u r13 = (cl1.C55001u) r13
            te3.c21 r13 = r13.f154420q
            int r13 = r13.f182393e
            r12.append(r13)
            java.lang.String r13 = ",reward_total_amount_in_heat:"
            r12.append(r13)
            androidx.lifecycle.i0 r13 = r9.business(r6)
            cl1.u r13 = (cl1.C55001u) r13
            te3.c21 r13 = r13.f154420q
            long r13 = r13.f182407u
            r12.append(r13)
            java.lang.String r13 = ", live_heat_value:"
            r12.append(r13)
            androidx.lifecycle.i0 r13 = r9.business(r6)
            cl1.u r13 = (cl1.C55001u) r13
            te3.c21 r13 = r13.f154420q
            long r13 = r13.f182377T0
            r12.append(r13)
            java.lang.String r13 = ", remoteMsgSize:"
            r12.append(r13)
            java.util.LinkedList<te3.r41> r13 = r3.f130677e
            if (r13 == 0) goto L_0x01dc
            int r13 = r13.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x01dd
        L_0x01dc:
            r13 = 0
        L_0x01dd:
            r12.append(r13)
            java.lang.String r13 = ", msgSize:"
            r12.append(r13)
            java.lang.Class<cl1.z0> r13 = cl1.C0702z0.class
            androidx.lifecycle.i0 r13 = r9.business(r13)
            cl1.z0 r13 = (cl1.C0702z0) r13
            java.util.List<cj1.o5> r13 = r13.f1672f
            int r13 = r13.size()
            r12.append(r13)
            java.lang.String r13 = ", remoteExtFlag:"
            r12.append(r13)
            int r13 = r3.f130686q
            r12.append(r13)
            java.lang.String r13 = ", participantCnt:"
            r12.append(r13)
            int r13 = r3.f130688s
            r12.append(r13)
            java.lang.String r13 = ", qosControl:"
            r12.append(r13)
            boolean r13 = r9.f154300c2
            r12.append(r13)
            java.lang.String r13 = ", localExtFlag"
            r12.append(r13)
            androidx.lifecycle.i0 r13 = r9.business(r7)
            cl1.o r13 = (cl1.C54991o) r13
            int r13 = r13.f154388y0
            r12.append(r13)
            java.lang.String r13 = ",heat_value:"
            r12.append(r13)
            androidx.lifecycle.i0 r9 = r9.business(r6)
            cl1.u r9 = (cl1.C55001u) r9
            te3.c21 r9 = r9.f154420q
            long r13 = r9.f182355A
            r12.append(r13)
            java.lang.String r9 = ",layer_show_info:"
            r12.append(r9)
            te3.c21 r9 = r3.f130678f
            if (r9 == 0) goto L_0x024a
            te3.l21 r9 = r9.f182360F
            if (r9 == 0) goto L_0x024a
            int r9 = r9.f184023d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x024b
        L_0x024a:
            r9 = 0
        L_0x024b:
            r12.append(r9)
            java.lang.String r9 = ",liveCharge:"
            r12.append(r9)
            te3.c21 r9 = r3.f130678f
            if (r9 == 0) goto L_0x025e
            sk1.a r13 = sk1.C63947a.f181274a
            java.lang.String r9 = r13.mo88736v(r9)
            goto L_0x025f
        L_0x025e:
            r9 = 0
        L_0x025f:
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
        L_0x0269:
            cj1.j6 r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159386p0
            if (r9 == 0) goto L_0x0273
            boolean r9 = r9.f78440b
            if (r9 != r11) goto L_0x0273
            r9 = 1
            goto L_0x0274
        L_0x0273:
            r9 = 0
        L_0x0274:
            r9 = r9 ^ r11
            cj1.t4$b r12 = cj1.C54834t4.C54836b.f153738d
            o40.C61926c.m72668M(r12)
            androidx.lifecycle.i0 r12 = r8.mo77630e(r7)
            cl1.o r12 = (cl1.C54991o) r12
            if (r1 != 0) goto L_0x0298
            if (r2 == 0) goto L_0x0285
            goto L_0x0298
        L_0x0285:
            r8.getClass()
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
            if (r1 == 0) goto L_0x0296
            gh1.j r12 = gh1.C59447j.f169870a
            gh1.k r13 = new gh1.k
            r13.<init>(r1, r3)
            r12.mo84557i(r1, r13)
        L_0x0296:
            r1 = 1
            goto L_0x0299
        L_0x0298:
            r1 = 0
        L_0x0299:
            int r12 = r3.f130682j
            if (r12 <= 0) goto L_0x029f
            r12 = 1
            goto L_0x02a0
        L_0x029f:
            r12 = 0
        L_0x02a0:
            if (r12 != 0) goto L_0x0423
            androidx.lifecycle.i0 r12 = r8.mo77630e(r7)
            cl1.o r12 = (cl1.C54991o) r12
            if (r12 == 0) goto L_0x02b2
            boolean r12 = r12.mo75997d4()
            if (r12 != r11) goto L_0x02b2
            r12 = 1
            goto L_0x02b3
        L_0x02b2:
            r12 = 0
        L_0x02b3:
            if (r12 == 0) goto L_0x02b7
            goto L_0x0423
        L_0x02b7:
            r12 = -100020(0xfffffffffffe794c, float:NaN)
            if (r2 != r12) goto L_0x02bd
            goto L_0x02be
        L_0x02bd:
            r11 = 0
        L_0x02be:
            if (r11 == 0) goto L_0x02d8
            java.lang.String r1 = "cookie invaild!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            androidx.lifecycle.i0 r1 = r8.mo77630e(r7)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 != 0) goto L_0x02ce
            goto L_0x02d2
        L_0x02ce:
            r2 = 0
            r1.mo76028z4(r2)
        L_0x02d2:
            r11 = 0
            r8.mo77645s(r11)
            return
        L_0x02d8:
            r11 = 0
            r13 = -200001(0xfffffffffffcf2bf, float:NaN)
            if (r2 != r13) goto L_0x02e4
            cj1.t4$d r2 = cj1.C54834t4.C54838d.f153740d
            o40.C61926c.m72668M(r2)
        L_0x02e4:
            boolean r2 = r8.mo77642p(r5)
            if (r2 != 0) goto L_0x0361
            er1.j4 r2 = er1.C58739j4.f168176a
            boolean r2 = r2.mo83692U()
            if (r2 == 0) goto L_0x0305
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            re1.a r2 = up1.C37521f.f99409g8
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0361
        L_0x0305:
            pe3.b r2 = r3.f130679g
            if (r2 == 0) goto L_0x0361
            androidx.lifecycle.i0 r13 = r8.mo77630e(r7)
            cl1.o r13 = (cl1.C54991o) r13
            if (r13 == 0) goto L_0x031e
            te3.fs0 r13 = r13.mo75986U3()
            if (r13 == 0) goto L_0x031e
            int r13 = r13.f183215f
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x031f
        L_0x031e:
            r13 = 0
        L_0x031f:
            if (r13 == 0) goto L_0x0353
            int r13 = r13.intValue()
            if (r4 != r13) goto L_0x0328
            goto L_0x0353
        L_0x0328:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "getLiveMsg wrong roleType:"
            r2.append(r4)
            androidx.lifecycle.i0 r4 = r8.mo77630e(r7)
            cl1.o r4 = (cl1.C54991o) r4
            if (r4 == 0) goto L_0x0347
            te3.fs0 r4 = r4.mo75986U3()
            if (r4 == 0) goto L_0x0347
            int r4 = r4.f183215f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0348
        L_0x0347:
            r4 = 0
        L_0x0348:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            goto L_0x0361
        L_0x0353:
            androidx.lifecycle.i0 r4 = r8.mo77630e(r6)
            cl1.u r4 = (cl1.C55001u) r4
            if (r4 != 0) goto L_0x035c
            goto L_0x0361
        L_0x035c:
            byte[] r2 = r2.f257327a
            r4.mo76041l3(r2)
        L_0x0361:
            int r2 = r3.f130692w
            if (r2 <= 0) goto L_0x0368
            int r2 = r2 * 1000
            goto L_0x037b
        L_0x0368:
            if (r1 == 0) goto L_0x0379
            gg1.a r2 = gg1.C32444a.f86121a
            pe1.c<java.lang.Integer> r2 = gg1.C32444a.f86131c1
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            goto L_0x037b
        L_0x0379:
            r2 = 5000(0x1388, float:7.006E-42)
        L_0x037b:
            if (r1 == 0) goto L_0x038b
            long r1 = (long) r2
            te3.c21 r3 = r3.f130678f
            if (r3 == 0) goto L_0x0385
            long r12 = r3.f182392d
            goto L_0x0386
        L_0x0385:
            r12 = r11
        L_0x0386:
            r8.mo77639m(r1, r12)
            goto L_0x041d
        L_0x038b:
            cl1.u r1 = r0.f153736a
            androidx.lifecycle.i0 r1 = r1.business(r7)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75997d4()
            if (r1 != 0) goto L_0x03f5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "handleLiveMsgResp result false, will retry heartbeat delay:"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = ". localLiveId:"
            r1.append(r3)
            androidx.lifecycle.i0 r3 = r8.mo77630e(r6)
            cl1.u r3 = (cl1.C55001u) r3
            if (r3 == 0) goto L_0x03be
            te3.c21 r3 = r3.f154420q
            if (r3 == 0) goto L_0x03be
            long r3 = r3.f182392d
            java.lang.Long r14 = java.lang.Long.valueOf(r3)
            goto L_0x03bf
        L_0x03be:
            r14 = 0
        L_0x03bf:
            r1.append(r14)
            java.lang.String r3 = ", haveHeartTaskRunning:"
            r1.append(r3)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r8.getClass()
            boolean r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159356I
            if (r1 == 0) goto L_0x03e0
            boolean r1 = r8.mo77642p(r5)
            if (r1 == 0) goto L_0x03e0
            if (r9 != 0) goto L_0x041d
        L_0x03e0:
            long r1 = (long) r2
            androidx.lifecycle.i0 r3 = r8.mo77630e(r6)
            cl1.u r3 = (cl1.C55001u) r3
            if (r3 == 0) goto L_0x03f0
            te3.c21 r3 = r3.f154420q
            if (r3 == 0) goto L_0x03f0
            long r12 = r3.f182392d
            goto L_0x03f1
        L_0x03f0:
            r12 = r11
        L_0x03f1:
            r8.mo77639m(r1, r12)
            goto L_0x041d
        L_0x03f5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleLiveMsgResp result false and live is finished. localLiveId:"
            r1.append(r2)
            androidx.lifecycle.i0 r2 = r8.mo77630e(r6)
            cl1.u r2 = (cl1.C55001u) r2
            if (r2 == 0) goto L_0x0412
            te3.c21 r2 = r2.f154420q
            if (r2 == 0) goto L_0x0412
            long r2 = r2.f182392d
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
            goto L_0x0413
        L_0x0412:
            r14 = 0
        L_0x0413:
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
        L_0x041d:
            cj1.t4$e r1 = cj1.C54834t4.C54839e.f153741d
            o40.C61926c.m72668M(r1)
            return
        L_0x0423:
            java.lang.String r1 = "get live msg close live!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            androidx.lifecycle.i0 r1 = r8.mo77630e(r7)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 != 0) goto L_0x0431
            goto L_0x0434
        L_0x0431:
            r1.mo76027y4(r11)
        L_0x0434:
            r8.getClass()
            j50.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r1 == 0) goto L_0x043f
            r2 = 4
            r1.mo85697p0(r2)
        L_0x043f:
            cj1.t4$c r1 = cj1.C54834t4.C54837c.f153739d
            o40.C61926c.m72668M(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54834t4.mo75426a(int, int, java.lang.String, te3.ao0, int, java.lang.String):void");
    }
}
