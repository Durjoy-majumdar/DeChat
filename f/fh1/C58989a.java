package fh1;

import a14.C0000n0;
import a14.C53934p0;
import android.content.Intent;
import android.view.ViewGroup;
import cl1.C0668l;
import cl1.C0702z0;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.view.C3206b2;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import d14.C58052j1;
import d14.C58087u0;
import d50.C58115i;
import fy3.C32224a;
import fy3.C32227p;
import gh1.C59440c;
import gh1.C8313a;
import gy3.C87412m;
import gy3.C87413o;
import il1.C60424h8;
import j50.C60735a;
import kotlin.ResultKt;
import nk1.C11207i;
import o40.C61926c;
import p50.C62193a;
import qj1.C12475jc;
import qj1.C62741dg;
import rx3.C13598b0;
import rx3.C13600d;
import sg1.C63881c;
import sg1.C63888h;
import te3.C49893it0;
import te3.C64390ga1;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: fh1.a */
public final class C58989a extends C8313a implements C59440c {

    /* renamed from: j */
    public final String f168783j = "Finder.ChargeLiveController";

    /* renamed from: n */
    public C63888h f168784n;

    /* renamed from: fh1.a$a */
    public static final class C58990a implements C0668l.C0669a {

        /* renamed from: a */
        public final /* synthetic */ C58989a f168785a;

        /* renamed from: fh1.a$a$a */
        public static final class C58991a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C58989a f168786d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58991a(C58989a aVar) {
                super(0);
                this.f168786d = aVar;
            }

            /* JADX WARNING: type inference failed for: r1v14, types: [j50.a] */
            /* JADX WARNING: type inference failed for: r3v29, types: [android.view.View] */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
                if (r3 != null) goto L_0x0036;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:112:0x01b7  */
            /* JADX WARNING: Removed duplicated region for block: B:156:0x027b  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x008f  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca  */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1  */
            /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
            /* JADX WARNING: Unknown variable types count: 2 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r17 = this;
                    r0 = r17
                    java.lang.Class<qj1.t4> r1 = qj1.C12669t4.class
                    fh1.a r2 = r0.f168786d
                    qj1.c r3 = r2.mo9307d3(r1)
                    qj1.t4 r3 = (qj1.C12669t4) r3
                    r4 = 1
                    r5 = 0
                    r6 = 0
                    if (r3 == 0) goto L_0x002a
                    boolean r7 = r2.mo9310g3()
                    if (r7 != 0) goto L_0x001f
                    int r7 = r3.mo14483f0()
                    if (r7 != 0) goto L_0x001f
                    r7 = 1
                    goto L_0x0020
                L_0x001f:
                    r7 = 0
                L_0x0020:
                    if (r7 == 0) goto L_0x0023
                    goto L_0x0024
                L_0x0023:
                    r3 = r6
                L_0x0024:
                    if (r3 == 0) goto L_0x002a
                    android.view.ViewGroup r3 = r3.f166287d
                    if (r3 != 0) goto L_0x0036
                L_0x002a:
                    java.lang.Class<qj1.jc> r3 = qj1.C12475jc.class
                    qj1.c r3 = r2.mo9307d3(r3)
                    qj1.jc r3 = (qj1.C12475jc) r3
                    if (r3 == 0) goto L_0x0038
                    android.view.ViewGroup r3 = r3.f166287d
                L_0x0036:
                    r14 = r3
                    goto L_0x0039
                L_0x0038:
                    r14 = r6
                L_0x0039:
                    java.lang.Class<qj1.e4> r3 = qj1.C12317e4.class
                    qj1.c r3 = r2.mo9307d3(r3)
                    r7 = r3
                    qj1.e4 r7 = (qj1.C12317e4) r7
                    if (r7 == 0) goto L_0x0075
                    qj1.e4$b r8 = qj1.C12317e4.C12319b.INCREASE_CHARGE_FREE_DURATION
                    r9 = 2147483647(0x7fffffff, float:NaN)
                    com.tencent.mm.plugin.finder.live.view.b2 r2 = r2.f27261e
                    boolean r3 = r2 instanceof android.view.View
                    if (r3 == 0) goto L_0x0052
                    android.view.View r2 = (android.view.View) r2
                    goto L_0x0053
                L_0x0052:
                    r2 = r6
                L_0x0053:
                    if (r2 == 0) goto L_0x006a
                    android.content.Context r2 = r2.getContext()
                    if (r2 == 0) goto L_0x006a
                    android.content.res.Resources r2 = r2.getResources()
                    if (r2 == 0) goto L_0x006a
                    r3 = 2131827451(0x7f111afb, float:1.9287815E38)
                    java.lang.String r2 = r2.getString(r3)
                    r10 = r2
                    goto L_0x006b
                L_0x006a:
                    r10 = r6
                L_0x006b:
                    r11 = 0
                    r12 = 0
                    r15 = 24
                    r16 = 0
                    qj1.C12317e4.m11869Z0(r7, r8, r9, r10, r11, r12, r14, r15, r16)
                L_0x0075:
                    fh1.a r2 = r0.f168786d
                    java.lang.Class<cl1.l> r3 = cl1.C0668l.class
                    androidx.lifecycle.i0 r3 = r2.business(r3)
                    cl1.l r3 = (cl1.C0668l) r3
                    java.lang.Class<cl1.u> r7 = cl1.C55001u.class
                    androidx.lifecycle.i0 r7 = r2.business(r7)
                    cl1.u r7 = (cl1.C55001u) r7
                    te3.c21 r7 = r7.f154420q
                    long r7 = r7.f182392d
                    sg1.h r9 = r2.f168784n
                    if (r9 == 0) goto L_0x00c6
                    te3.ga1 r10 = r3.f1577j
                    rx3.g r11 = r9.f181098l
                    rx3.n r11 = (rx3.C36570n) r11
                    java.lang.Object r11 = r11.getValue()
                    fy3.r r11 = (fy3.C32229r) r11
                    int r12 = r9.f181087a
                    java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                    long r13 = r9.f181088b
                    java.lang.Long r13 = java.lang.Long.valueOf(r13)
                    java.lang.String r14 = "update"
                    java.lang.Object r11 = r11.mo162I(r14, r12, r13, r10)
                    te3.dp2 r11 = (te3.C64321dp2) r11
                    r9.f181095i = r11
                    r9.mo88651b(r10)
                    te3.dp2 r10 = r9.f181095i
                    if (r10 == 0) goto L_0x00bc
                    int r11 = r10.f182793f
                    goto L_0x00bd
                L_0x00bc:
                    r11 = 0
                L_0x00bd:
                    if (r10 == 0) goto L_0x00c2
                    int r10 = r10.f182792e
                    goto L_0x00c3
                L_0x00c2:
                    r10 = 0
                L_0x00c3:
                    int r11 = r11 - r10
                    r9.f181096j = r11
                L_0x00c6:
                    sg1.h r9 = r2.f168784n
                    if (r9 == 0) goto L_0x00e1
                    boolean r10 = r9.f181097k
                    if (r10 != 0) goto L_0x00db
                    com.tencent.mm.sdk.platformtools.MTimerHandler r10 = r9.f181093g
                    if (r10 == 0) goto L_0x00d7
                    r11 = 1000(0x3e8, double:4.94E-321)
                    r10.startTimer(r11)
                L_0x00d7:
                    r9.f181097k = r4
                    r9 = 1
                    goto L_0x00dc
                L_0x00db:
                    r9 = 0
                L_0x00dc:
                    java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
                    goto L_0x00e2
                L_0x00e1:
                    r9 = r6
                L_0x00e2:
                    java.lang.Boolean r10 = java.lang.Boolean.TRUE
                    boolean r9 = gy3.C87412m.m108589b(r9, r10)
                    if (r9 == 0) goto L_0x00fd
                    qj1.c r1 = r2.mo9307d3(r1)
                    qj1.t4 r1 = (qj1.C12669t4) r1
                    if (r1 == 0) goto L_0x00fd
                    sg1.i r9 = sg1.C63889i.f181100a
                    te3.ga1 r10 = r3.f1577j
                    te3.dp2 r9 = r9.mo88654a(r7, r10)
                    r1.mo12252f1(r9, r5)
                L_0x00fd:
                    r9 = 0
                    int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                    if (r1 == 0) goto L_0x02ae
                    j50.a r1 = r2.mo84224n3()
                    boolean r1 = r1 instanceof p50.C62197e
                    if (r1 == 0) goto L_0x02ae
                    boolean r1 = cl1.C0668l.m589e3(r3, r6, r4, r6)
                    if (r1 == 0) goto L_0x02ae
                    j50.a r1 = r2.mo84224n3()
                    java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.live.core.core.visitor.LiveVisitorTRTCCore"
                    gy3.C87412m.m108592e(r1, r3)
                    p50.e r1 = (p50.C62197e) r1
                    boolean r1 = r1.mo87264x(r7)
                    if (r1 != 0) goto L_0x02ae
                    j50.a r1 = r2.mo84224n3()
                    gy3.C87412m.m108592e(r1, r3)
                    p50.e r1 = (p50.C62197e) r1
                    b50.g r1 = r1.f176822Y0
                    f50.d r1 = r1.f152627a
                    if (r1 == 0) goto L_0x0167
                    j50.a r1 = r2.mo84224n3()
                    gy3.C87412m.m108592e(r1, r3)
                    p50.e r1 = (p50.C62197e) r1
                    b50.g r1 = r1.f176822Y0
                    r1.getClass()
                    java.lang.String r3 = "MicroMsg.LiveCdnPlayerManager"
                    java.lang.String r7 = "resumePlay"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
                    f50.d r1 = r1.f152627a
                    if (r1 == 0) goto L_0x014d
                    r1.resume()
                L_0x014d:
                    com.tencent.mm.plugin.finder.live.view.b2 r1 = r2.f27261e
                    boolean r3 = r1 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
                    if (r3 == 0) goto L_0x0156
                    com.tencent.mm.plugin.finder.live.view.b r1 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r1
                    goto L_0x0157
                L_0x0156:
                    r1 = r6
                L_0x0157:
                    if (r1 == 0) goto L_0x015c
                    com.tencent.p014mm.plugin.finder.live.view.C56032b.hideLoadingLayer$default(r1, r5, r4, r6)
                L_0x015c:
                    java.lang.String r1 = r2.f168783j
                    java.lang.String r3 = "updateLiveChargeInfo cdnResumePlay!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    goto L_0x0168
                L_0x0167:
                    r1 = r6
                L_0x0168:
                    if (r1 != 0) goto L_0x0299
                    com.tencent.mm.plugin.finder.live.view.b2 r1 = r2.f27261e
                    boolean r3 = r1 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
                    if (r3 == 0) goto L_0x0173
                    com.tencent.mm.plugin.finder.live.view.b r1 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r1
                    goto L_0x0174
                L_0x0173:
                    r1 = r6
                L_0x0174:
                    if (r1 == 0) goto L_0x0179
                    com.tencent.p014mm.plugin.finder.live.view.C56032b.hideLoadingLayer$default(r1, r5, r4, r6)
                L_0x0179:
                    j50.a r1 = r2.mo84224n3()
                    boolean r3 = r1 instanceof p50.C62197e
                    if (r3 == 0) goto L_0x0184
                    p50.e r1 = (p50.C62197e) r1
                    goto L_0x0185
                L_0x0184:
                    r1 = r6
                L_0x0185:
                    if (r1 == 0) goto L_0x0291
                    j50.a r3 = r2.mo84224n3()
                    if (r3 == 0) goto L_0x0199
                    d50.i r3 = r3.f172989A
                    if (r3 == 0) goto L_0x0199
                    boolean r3 = r3.mo82881c()
                    if (r3 != r4) goto L_0x0199
                    r3 = 1
                    goto L_0x019a
                L_0x0199:
                    r3 = 0
                L_0x019a:
                    if (r3 != 0) goto L_0x01b4
                    j50.a r3 = r2.mo84224n3()
                    if (r3 == 0) goto L_0x01ae
                    d50.i r3 = r3.f172989A
                    if (r3 == 0) goto L_0x01ae
                    boolean r3 = r3.mo82888j()
                    if (r3 != r4) goto L_0x01ae
                    r3 = 1
                    goto L_0x01af
                L_0x01ae:
                    r3 = 0
                L_0x01af:
                    if (r3 == 0) goto L_0x01b2
                    goto L_0x01b4
                L_0x01b2:
                    r3 = 0
                    goto L_0x01b5
                L_0x01b4:
                    r3 = 1
                L_0x01b5:
                    if (r3 == 0) goto L_0x027b
                    j50.a r3 = r2.mo84224n3()
                    if (r3 == 0) goto L_0x01c9
                    d50.i r3 = r3.f172989A
                    if (r3 == 0) goto L_0x01c9
                    boolean r3 = r3.mo82881c()
                    if (r3 != r4) goto L_0x01c9
                    r3 = 1
                    goto L_0x01ca
                L_0x01c9:
                    r3 = 0
                L_0x01ca:
                    java.lang.String r7 = "getContext()"
                    if (r3 == 0) goto L_0x01ec
                    j50.a r3 = r2.mo84224n3()
                    if (r3 == 0) goto L_0x01d9
                    p50.e r3 = (p50.C62197e) r3
                    r50.f r3 = r3.f173028o
                    goto L_0x01da
                L_0x01d9:
                    r3 = r6
                L_0x01da:
                    com.tencent.mm.live.core.view.LiveVideoView r8 = new com.tencent.mm.live.core.view.LiveVideoView
                    android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    gy3.C87412m.m108593f(r9, r7)
                    r8.<init>(r9)
                    if (r3 == 0) goto L_0x024b
                    r3.mo88273c(r8)
                    goto L_0x024b
                L_0x01ec:
                    j50.a r3 = r2.mo84224n3()
                    if (r3 == 0) goto L_0x01fe
                    d50.i r3 = r3.f172989A
                    if (r3 == 0) goto L_0x01fe
                    boolean r3 = r3.mo82888j()
                    if (r3 != r4) goto L_0x01fe
                    r3 = 1
                    goto L_0x01ff
                L_0x01fe:
                    r3 = 0
                L_0x01ff:
                    if (r3 == 0) goto L_0x024a
                    java.lang.Class<fh1.p2> r3 = fh1.C59062p2.class
                    com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r3 = r2.controller(r3)
                    fh1.p2 r3 = (fh1.C59062p2) r3
                    if (r3 == 0) goto L_0x024a
                    boolean r8 = r3.mo84271I3()
                    if (r8 == 0) goto L_0x021a
                    java.lang.String r3 = r3.f168980j
                    java.lang.String r8 = "updateState not supportScrollSquare"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
                    goto L_0x024a
                L_0x021a:
                    gk1.a r8 = r3.mo84269F3()
                    android.widget.FrameLayout r8 = r8.f170125h
                    int r8 = r8.getChildCount()
                    r9 = 0
                L_0x0225:
                    if (r9 >= r8) goto L_0x024a
                    gk1.a r10 = r3.mo84269F3()
                    android.widget.FrameLayout r10 = r10.f170125h
                    android.view.View r10 = r10.getChildAt(r9)
                    boolean r10 = r10 instanceof com.tencent.rtmp.p899ui.TXCloudVideoView
                    if (r10 == 0) goto L_0x0247
                    gk1.a r3 = r3.mo84269F3()
                    android.widget.FrameLayout r3 = r3.f170125h
                    android.view.View r3 = r3.getChildAt(r9)
                    boolean r8 = r3 instanceof com.tencent.rtmp.p899ui.TXCloudVideoView
                    if (r8 == 0) goto L_0x024a
                    r8 = r3
                    com.tencent.rtmp.ui.TXCloudVideoView r8 = (com.tencent.rtmp.p899ui.TXCloudVideoView) r8
                    goto L_0x024b
                L_0x0247:
                    int r9 = r9 + 1
                    goto L_0x0225
                L_0x024a:
                    r8 = r6
                L_0x024b:
                    b50.g r3 = r1.f176822Y0
                    f50.d r3 = r3.f152627a
                    if (r3 != 0) goto L_0x0272
                    android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    gy3.C87412m.m108593f(r3, r7)
                    ok1.e r7 = ok1.C62042e.f176370a
                    com.tencent.rtmp.TXLivePlayConfig r7 = r7.mo87034Q()
                    fh1.b r9 = new fh1.b
                    r9.<init>()
                    java.lang.Class<cl1.o> r10 = cl1.C54991o.class
                    androidx.lifecycle.i0 r10 = r2.business(r10)
                    cl1.o r10 = (cl1.C54991o) r10
                    boolean r10 = r10.mo76007j4()
                    r1.mo87268G0(r3, r7, r9, r10)
                L_0x0272:
                    fh1.c r3 = new fh1.c
                    r3.<init>(r2)
                    r1.mo87255B0(r4, r8, r3)
                    goto L_0x0291
                L_0x027b:
                    com.tencent.mm.plugin.finder.live.view.b2 r1 = r2.f27261e
                    boolean r3 = r1 instanceof vk1.C65762c
                    if (r3 == 0) goto L_0x0284
                    vk1.c r1 = (vk1.C65762c) r1
                    goto L_0x0285
                L_0x0284:
                    r1 = r6
                L_0x0285:
                    if (r1 == 0) goto L_0x0291
                    hl1.k r1 = r1.getStartUIC()
                    if (r1 == 0) goto L_0x0291
                    r3 = 3
                    hl1.C59988k.m69862z(r1, r5, r5, r3, r6)
                L_0x0291:
                    java.lang.String r1 = r2.f168783j
                    java.lang.String r3 = "updateLiveChargeInfo restartLive!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
                L_0x0299:
                    j50.a r1 = r2.mo84224n3()
                    boolean r2 = r1 instanceof p50.C62197e
                    if (r2 == 0) goto L_0x02a4
                    r6 = r1
                    p50.e r6 = (p50.C62197e) r6
                L_0x02a4:
                    if (r6 == 0) goto L_0x02ae
                    r1 = 8
                    r6.mo85691j0(r1)
                    r6.mo85674O(r5)
                L_0x02ae:
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: fh1.C58989a.C58990a.C58991a.invoke():java.lang.Object");
            }
        }

        public C58990a(C58989a aVar) {
            this.f168785a = aVar;
        }

        /* renamed from: a */
        public void mo635a(boolean z, C64390ga1 ga12) {
            String str = this.f168785a.f168783j;
            Log.m105924i(str, "increaseChargeFreeTimeDuration:" + z + '!');
            if (z) {
                C61926c.m72668M(new C58991a(this.f168785a));
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.ChargeLiveController$onViewMount$1", mo125469f = "ChargeLiveController.kt", mo125470l = {87}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.a$b */
    public static final class C58992b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f168787d;

        /* renamed from: e */
        public final /* synthetic */ C58989a f168788e;

        /* renamed from: fh1.a$b$a */
        public static final class C58993a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C58989a f168789d;

            public C58993a(C58989a aVar) {
                this.f168789d = aVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C58115i iVar;
                C49893it0 it02 = (C49893it0) obj;
                C60735a n3 = this.f168789d.mo84224n3();
                boolean z = true;
                if (n3 == null || (iVar = n3.f172989A) == null || !iVar.mo82881c()) {
                    z = false;
                }
                String str = this.f168789d.f168783j;
                StringBuilder sb = new StringBuilder();
                sb.append("onViewMount audienceAction:");
                sb.append(it02 != null ? new Integer(it02.f135654d) : null);
                sb.append(",isFloatMode:");
                sb.append(z);
                sb.append('!');
                Log.m105924i(str, sb.toString());
                if (!z) {
                    this.f168789d.mo84223m3("audienceAction.collect");
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58992b(C58989a aVar, C15601d<? super C58992b> dVar) {
            super(2, dVar);
            this.f168788e = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C58992b(this.f168788e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C58992b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f168787d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i(this.f168788e.f168783j, "onViewMount audienceAction collect!");
                C58087u0<C49893it0> u0Var = ((C0702z0) this.f168788e.business(C0702z0.class)).f1685v;
                C58993a aVar2 = new C58993a(this.f168788e);
                this.f168787d = 1;
                if (((C58052j1) u0Var).mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58989a(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: F3 */
    public static final void m68901F3(C58989a aVar) {
        C60424h8 h8Var;
        C62741dg dgVar;
        C12475jc jcVar;
        C3206b2 b2Var = aVar.f27261e;
        if (!(b2Var == null || (jcVar = (C12475jc) b2Var.getPlugin(C12475jc.class)) == null)) {
            jcVar.mo87697y0();
        }
        C3206b2 b2Var2 = aVar.f27261e;
        if (!(b2Var2 == null || (dgVar = (C62741dg) b2Var2.getPlugin(C62741dg.class)) == null)) {
            dgVar.mo87697y0();
        }
        C3206b2 b2Var3 = aVar.f27261e;
        if (b2Var3 != null && (h8Var = (C60424h8) b2Var3.getPlugin(C60424h8.class)) != null) {
            h8Var.mo87697y0();
        }
    }

    /* renamed from: e */
    public boolean mo9121e() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
        return;
     */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo84223m3(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Class<cl1.z0> r0 = cl1.C0702z0.class
            monitor-enter(r4)
            java.lang.String r1 = r4.f168783j     // Catch:{ all -> 0x00aa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00aa }
            r2.<init>()     // Catch:{ all -> 0x00aa }
            r2.append(r5)     // Catch:{ all -> 0x00aa }
            java.lang.String r5 = " checkReJoinLive:"
            r2.append(r5)     // Catch:{ all -> 0x00aa }
            androidx.lifecycle.i0 r5 = r4.business(r0)     // Catch:{ all -> 0x00aa }
            cl1.z0 r5 = (cl1.C0702z0) r5     // Catch:{ all -> 0x00aa }
            d14.u0<te3.it0> r5 = r5.f1685v     // Catch:{ all -> 0x00aa }
            d14.j1 r5 = (d14.C58052j1) r5     // Catch:{ all -> 0x00aa }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x00aa }
            te3.it0 r5 = (te3.C49893it0) r5     // Catch:{ all -> 0x00aa }
            r3 = 0
            if (r5 == 0) goto L_0x002c
            int r5 = r5.f135654d     // Catch:{ all -> 0x00aa }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00aa }
            goto L_0x002d
        L_0x002c:
            r5 = r3
        L_0x002d:
            r2.append(r5)     // Catch:{ all -> 0x00aa }
            java.lang.String r5 = ",pluginLayout:"
            r2.append(r5)     // Catch:{ all -> 0x00aa }
            com.tencent.mm.plugin.finder.live.view.b2 r5 = r4.f27261e     // Catch:{ all -> 0x00aa }
            r2.append(r5)     // Catch:{ all -> 0x00aa }
            r5 = 33
            r2.append(r5)     // Catch:{ all -> 0x00aa }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x00aa }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)     // Catch:{ all -> 0x00aa }
            androidx.lifecycle.i0 r5 = r4.business(r0)     // Catch:{ all -> 0x00aa }
            cl1.z0 r5 = (cl1.C0702z0) r5     // Catch:{ all -> 0x00aa }
            d14.u0<te3.it0> r5 = r5.f1685v     // Catch:{ all -> 0x00aa }
            d14.j1 r5 = (d14.C58052j1) r5     // Catch:{ all -> 0x00aa }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x00aa }
            te3.it0 r5 = (te3.C49893it0) r5     // Catch:{ all -> 0x00aa }
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L_0x005f
            int r5 = r5.f135654d     // Catch:{ all -> 0x00aa }
            if (r5 != r1) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            if (r1 == 0) goto L_0x00a8
            androidx.lifecycle.i0 r5 = r4.business(r0)     // Catch:{ all -> 0x00aa }
            cl1.z0 r5 = (cl1.C0702z0) r5     // Catch:{ all -> 0x00aa }
            d14.u0<te3.it0> r5 = r5.f1685v     // Catch:{ all -> 0x00aa }
            d14.j1 r5 = (d14.C58052j1) r5     // Catch:{ all -> 0x00aa }
            r5.setValue(r3)     // Catch:{ all -> 0x00aa }
            java.lang.Class<cl1.l> r5 = cl1.C0668l.class
            androidx.lifecycle.i0 r5 = r4.business(r5)     // Catch:{ all -> 0x00aa }
            cl1.l r5 = (cl1.C0668l) r5     // Catch:{ all -> 0x00aa }
            boolean r5 = r5.mo631g3()     // Catch:{ all -> 0x00aa }
            if (r5 != 0) goto L_0x0086
            java.lang.String r5 = r4.f168783j     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "checkReJoinLive ReJoinLive but live is purchase!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)     // Catch:{ all -> 0x00aa }
            monitor-exit(r4)
            return
        L_0x0086:
            com.tencent.mm.plugin.finder.live.view.b2 r5 = r4.f27261e     // Catch:{ all -> 0x00aa }
            boolean r0 = r5 instanceof vk1.C65762c     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x008f
            vk1.c r5 = (vk1.C65762c) r5     // Catch:{ all -> 0x00aa }
            goto L_0x0090
        L_0x008f:
            r5 = r3
        L_0x0090:
            if (r5 == 0) goto L_0x009f
            hl1.k r5 = r5.getStartUIC()     // Catch:{ all -> 0x00aa }
            if (r5 == 0) goto L_0x009f
            hl1.h r0 = hl1.C59977h.f171128a     // Catch:{ all -> 0x00aa }
            r0.mo84862c(r5)     // Catch:{ all -> 0x00aa }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00aa }
        L_0x009f:
            if (r3 != 0) goto L_0x00a8
            java.lang.String r5 = r4.f168783j     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "checkReJoinLive but StartUIC is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)     // Catch:{ all -> 0x00aa }
        L_0x00a8:
            monitor-exit(r4)
            return
        L_0x00aa:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C58989a.mo84223m3(java.lang.String):void");
    }

    /* renamed from: n3 */
    public final C60735a mo84224n3() {
        return C62193a.f176816k1.mo87262c(((C55001u) business(C55001u.class)).f154420q.f182392d);
    }

    /* renamed from: o3 */
    public final void mo84225o3() {
        Log.m105924i(this.f168783j, "release!");
        C63888h hVar = this.f168784n;
        if (hVar != null) {
            C63881c.C63882a.m75104a(hVar, hVar.f181088b, true, false, 4, (Object) null);
            hVar.f181092f = null;
        }
        this.f168784n = null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onLiveActivate() {
        Log.m105924i(this.f168783j, "onLiveActivate!");
        ((C0668l) business(C0668l.class)).f1575h = new C58990a(this);
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        mo84225o3();
        ((C0668l) business(C0668l.class)).f1575h = null;
        Log.m105924i(this.f168783j, "onLiveDeactivate!");
    }

    public void onLiveStartFromWindow() {
        Log.m105924i(this.f168783j, "onLiveStartFromWindow!");
        mo84223m3("onLiveStartFromWindow");
    }

    public void onNewIntent(Intent intent) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C59440c.C8315a.m8366a(this, i, strArr, iArr);
    }

    public boolean onSwipeBack() {
        return false;
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        C11207i.m11071g(this, (C66212f) null, (C53934p0) null, new C58992b(this, (C15601d<? super C58992b>) null), 3, (Object) null);
    }

    public void resume() {
        mo84223m3("pluginLayoutResume");
    }

    /* renamed from: x0 */
    public void mo9131x0(boolean z, int i) {
    }
}
