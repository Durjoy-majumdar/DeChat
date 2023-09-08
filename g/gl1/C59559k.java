package gl1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import al1.C54130j;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.app.AppCompatActivity;
import cj1.C0639y1;
import cj1.C54795n5;
import cj1.C54820t;
import cl1.C0668l;
import cl1.C54963d0;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58113g;
import d60.C58124b;
import dh1.C58266c;
import di3.C7335d;
import di3.C86312j;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32232u;
import gy3.C87412m;
import gy3.C87413o;
import hq1.C60085d;
import ht1.C8777j5;
import ii1.C60291e;
import java.util.LinkedList;
import nk1.C61791o;
import o40.C61926c;
import ok1.C62042e;
import p185kq.C61130g;
import p671qy.C63344h;
import qj1.C12238a0;
import qj1.C12256bd;
import qj1.C12282d7;
import qj1.C12322e5;
import qj1.C12377f1;
import qj1.C12389fa;
import qj1.C12399ff;
import qj1.C12429gi;
import qj1.C12453ii;
import qj1.C12469j1;
import qj1.C12475jc;
import qj1.C12482k1;
import qj1.C12490l0;
import qj1.C12503ld;
import qj1.C12522mf;
import qj1.C12611q7;
import qj1.C12625qe;
import qj1.C12632r2;
import qj1.C12690u1;
import qj1.C12693u2;
import qj1.C12703v1;
import qj1.C12707vb;
import qj1.C12733x3;
import qj1.C47844c7;
import qj1.C62632a6;
import qj1.C62638b0;
import qj1.C62647ba;
import qj1.C62660c;
import qj1.C62668c4;
import qj1.C62705da;
import qj1.C62707db;
import qj1.C62712dd;
import qj1.C62758ea;
import qj1.C62772fb;
import qj1.C62804h6;
import qj1.C62833je;
import qj1.C62843kb;
import qj1.C62861l1;
import qj1.C62905o2;
import qj1.C62911o3;
import qj1.C62921p3;
import qj1.C62924pe;
import qj1.C62949r8;
import qj1.C62976sd;
import qj1.C62987t2;
import qj1.C62993t9;
import qj1.C63006u7;
import qj1.C63049v9;
import qj1.C63081w3;
import qj1.C63100x2;
import qj1.C63108xd;
import qj1.C63118y3;
import qj1.C63129yc;
import qj1.C63151z0;
import qj1.C63170ze;
import rx3.C13598b0;
import rx3.C13604l;
import sl1.C64039c;
import te3.C52005xq0;
import te3.C64337e61;
import tl1.C13969d;
import ug1.C65348b;
import vk1.C65761b;
import wg1.C66093v1;
import xs1.C15883o;
import xs1.C66420d;
import zc1.C66785b;

/* renamed from: gl1.k */
public final class C59559k extends C58266c {

    /* renamed from: A */
    public C62712dd f170199A;

    /* renamed from: B */
    public C62924pe f170200B;

    /* renamed from: C */
    public C12522mf f170201C;

    /* renamed from: D */
    public C12690u1 f170202D;

    /* renamed from: E */
    public C62949r8 f170203E;

    /* renamed from: F */
    public C12475jc f170204F;

    /* renamed from: G */
    public C62707db f170205G;

    /* renamed from: H */
    public C62772fb f170206H;

    /* renamed from: I */
    public C62843kb f170207I;

    /* renamed from: J */
    public C62705da f170208J;

    /* renamed from: K */
    public C62647ba f170209K;

    /* renamed from: L */
    public C62647ba f170210L;

    /* renamed from: M */
    public C64039c f170211M;

    /* renamed from: N */
    public C13969d f170212N;

    /* renamed from: P */
    public C66420d f170213P;

    /* renamed from: Q */
    public C15883o f170214Q;

    /* renamed from: Q0 */
    public C63081w3 f170215Q0;

    /* renamed from: R */
    public C12238a0 f170216R;

    /* renamed from: R0 */
    public C12256bd f170217R0;

    /* renamed from: S */
    public C62638b0 f170218S;

    /* renamed from: S0 */
    public C12377f1 f170219S0;

    /* renamed from: T */
    public C12282d7 f170220T;

    /* renamed from: T0 */
    public C12632r2 f170221T0;

    /* renamed from: U */
    public C12611q7 f170222U;

    /* renamed from: U0 */
    public C12482k1 f170223U0;

    /* renamed from: V */
    public C12693u2 f170224V;

    /* renamed from: V0 */
    public C62804h6 f170225V0;

    /* renamed from: W */
    public C63100x2 f170226W;

    /* renamed from: W0 */
    public int f170227W0;

    /* renamed from: X */
    public C62861l1 f170228X;

    /* renamed from: X0 */
    public View f170229X0;

    /* renamed from: Y */
    public C63006u7 f170230Y;

    /* renamed from: Y0 */
    public C62911o3 f170231Y0;

    /* renamed from: Z */
    public C47844c7 f170232Z;

    /* renamed from: Z0 */
    public C60291e f170233Z0;

    /* renamed from: a1 */
    public C63118y3 f170234a1;

    /* renamed from: b1 */
    public C62987t2 f170235b1;

    /* renamed from: c1 */
    public C62921p3 f170236c1;

    /* renamed from: d1 */
    public C63108xd f170237d1;

    /* renamed from: e1 */
    public C12503ld f170238e1;

    /* renamed from: f1 */
    public boolean f170239f1;

    /* renamed from: g1 */
    public boolean f170240g1;

    /* renamed from: h1 */
    public int f170241h1;

    /* renamed from: i1 */
    public MTimerHandler f170242i1 = new MTimerHandler("LiveCommonInfoPlugin::Timer", (MTimerHandler.CallBack) new C59563d(this), true);

    /* renamed from: j */
    public final String f170243j = "FinderLiveSecondaryStartUIC";

    /* renamed from: n */
    public C63170ze f170244n;

    /* renamed from: o */
    public FinderLiveAnchorExceptionPlugin f170245o;

    /* renamed from: p */
    public C62833je f170246p;

    /* renamed from: p0 */
    public C12490l0 f170247p0;

    /* renamed from: q */
    public C12399ff f170248q;

    /* renamed from: r */
    public C62632a6 f170249r;

    /* renamed from: s */
    public C62905o2 f170250s;

    /* renamed from: t */
    public C60085d f170251t;

    /* renamed from: u */
    public C12322e5 f170252u;

    /* renamed from: v */
    public C62976sd f170253v;

    /* renamed from: w */
    public C63151z0 f170254w;

    /* renamed from: x */
    public C12389fa f170255x;

    /* renamed from: x0 */
    public C63129yc f170256x0;

    /* renamed from: y */
    public C12707vb f170257y;

    /* renamed from: y0 */
    public C62758ea f170258y0;

    /* renamed from: z */
    public C63049v9 f170259z;

    /* renamed from: gl1.k$a */
    public static final class C59560a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f170260d;

        /* renamed from: e */
        public final /* synthetic */ C59559k f170261e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59560a(boolean z, C59559k kVar) {
            super(1);
            this.f170260d = z;
            this.f170261e = kVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                Bundle bundle = new Bundle();
                boolean z = this.f170260d;
                C59559k kVar = this.f170261e;
                bundle.putBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW", z);
                C65761b bVar = kVar.f166842f;
                if (bVar != null) {
                    bVar.statusChange(C58124b.C58125b.START_LIVE, bundle);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gl1.k$b */
    public static final class C59561b extends C87413o implements C32224a<C62924pe> {

        /* renamed from: d */
        public final /* synthetic */ C65761b f170262d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59561b(C65761b bVar) {
            super(0);
            this.f170262d = bVar;
        }

        public Object invoke() {
            View findViewById = this.f170262d.findViewById(C0966R.C0970id.dz7);
            C87412m.m108593f(findViewById, "router.findViewById(R.id…_live_shopping_list_root)");
            return new C62924pe((ViewGroup) findViewById, this.f170262d);
        }
    }

    /* renamed from: gl1.k$c */
    public static final class C59562c extends C87413o implements C32232u<Boolean, Integer, Integer, String, C58113g, TRTCCloudDef.TRTCParams, C52005xq0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59559k f170263d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59562c(C59559k kVar) {
            super(7);
            this.f170263d = kVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:202:0x0545  */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x0557  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r29, java.lang.Object r30, java.lang.Object r31, java.lang.Object r32, java.lang.Object r33, java.lang.Object r34, java.lang.Object r35) {
            /*
                r28 = this;
                r0 = r28
                r1 = r29
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r2 = r30
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                r3 = r31
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                r4 = r32
                java.lang.String r4 = (java.lang.String) r4
                r5 = r33
                d50.g r5 = (d50.C58113g) r5
                r6 = r34
                com.tencent.trtc.TRTCCloudDef$TRTCParams r6 = (com.tencent.trtc.TRTCCloudDef.TRTCParams) r6
                r7 = r35
                te3.xq0 r7 = (te3.C52005xq0) r7
                java.lang.String r8 = "errMsg"
                gy3.C87412m.m108594g(r4, r8)
                java.lang.String r8 = "liveRoomInfo"
                gy3.C87412m.m108594g(r5, r8)
                java.lang.String r8 = "trtcParams"
                gy3.C87412m.m108594g(r6, r8)
                java.lang.String r8 = "resp"
                gy3.C87412m.m108594g(r7, r8)
                gl1.k r8 = r0.f170263d
                java.lang.Class<cl1.b0> r9 = cl1.C54946b0.class
                androidx.lifecycle.i0 r8 = r8.mo83051g(r9)
                cl1.b0 r8 = (cl1.C54946b0) r8
                boolean r8 = r8.f153983g
                gl1.k r9 = r0.f170263d
                java.lang.String r9 = r9.f170243j
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "joinLive success:"
                r10.append(r11)
                r10.append(r1)
                java.lang.String r11 = ", errCode:"
                r10.append(r11)
                r10.append(r2)
                java.lang.String r11 = " isDestroyed:"
                r10.append(r11)
                gl1.k r11 = r0.f170263d
                vk1.b r11 = r11.f166842f
                if (r11 == 0) goto L_0x0078
                boolean r11 = r11.isDestroyed()
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
                goto L_0x0079
            L_0x0078:
                r11 = 0
            L_0x0079:
                r10.append(r11)
                java.lang.String r11 = ", isVerifying:"
                r10.append(r11)
                r10.append(r8)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
                gl1.k r9 = r0.f170263d
                vk1.b r9 = r9.f166842f
                r10 = 1
                if (r9 == 0) goto L_0x009a
                boolean r9 = r9.isDestroyed()
                if (r9 != r10) goto L_0x009a
                r9 = 1
                goto L_0x009b
            L_0x009a:
                r9 = 0
            L_0x009b:
                if (r9 == 0) goto L_0x00a1
                if (r8 != 0) goto L_0x00a1
                goto L_0x057d
            L_0x00a1:
                gl1.k r8 = r0.f170263d
                java.lang.Class<cl1.u> r9 = cl1.C55001u.class
                java.lang.Class<ak1.o> r13 = ak1.C54108o.class
                java.lang.Class<cl1.o> r14 = cl1.C54991o.class
                if (r1 == 0) goto L_0x0426
                androidx.lifecycle.i0 r1 = r8.mo83051g(r14)
                cl1.o r1 = (cl1.C54991o) r1
                te3.c21 r2 = r7.f144846f
                if (r2 == 0) goto L_0x00b9
                long r2 = r2.f182367M
                int r3 = (int) r2
                goto L_0x00ba
            L_0x00b9:
                r3 = 0
            L_0x00ba:
                r1.f154354q = r3
                androidx.lifecycle.i0 r1 = r8.mo83051g(r9)
                cl1.u r1 = (cl1.C55001u) r1
                te3.c21 r1 = r1.f154420q
                long r1 = r1.f182392d
                zt3.t r3 = zt3.C119157j.f356862d
                cj1.s5 r4 = new cj1.s5
                r4.<init>(r1)
                zt3.j r3 = (zt3.C119157j) r3
                java.lang.String r1 = "Finder.LiveExceptionMonitor"
                r3.mo183876g(r4, r1)
                java.lang.Class<cl1.h1> r1 = cl1.C54979h1.class
                ok1.e r2 = ok1.C62042e.f176370a
                boolean r3 = r2.mo87027N0()
                if (r3 != 0) goto L_0x00df
                goto L_0x013e
            L_0x00df:
                int r3 = r7.f144806C
                if (r3 == r10) goto L_0x00e5
                r3 = 1
                goto L_0x00e6
            L_0x00e5:
                r3 = 0
            L_0x00e6:
                androidx.lifecycle.i0 r4 = r8.mo83051g(r1)
                cl1.h1 r4 = (cl1.C54979h1) r4
                boolean r4 = r4.f154134f
                java.lang.String r11 = r8.f170243j
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r15 = "handleJoinLiveWxshopResponse haveBindShop:"
                r12.append(r15)
                r12.append(r4)
                java.lang.String r15 = ", shopping_not_available:"
                r12.append(r15)
                int r15 = r7.f144806C
                r12.append(r15)
                java.lang.String r15 = ", canShowShopEntrance:"
                r12.append(r15)
                r12.append(r3)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
                if (r3 == 0) goto L_0x013e
                if (r4 != 0) goto L_0x0137
                androidx.lifecycle.i0 r1 = r8.mo83051g(r1)
                cl1.h1 r1 = (cl1.C54979h1) r1
                r1.mo75943j3(r10)
                java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                java.lang.String r3 = "getService(IFinderCommon…atureService::class.java)"
                gy3.C87412m.m108593f(r1, r3)
                tf0.p1 r1 = (tf0.C64916p1) r1
                r3 = 14
                r4 = 2
                r11 = 0
                tf0.C64916p1.C64917a.m76437d(r1, r3, r11, r4, r11)
            L_0x0137:
                qj1.pe r1 = r8.f170200B
                if (r1 != 0) goto L_0x013e
                r8.mo84607m()
            L_0x013e:
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                te3.uw0 r3 = r7.f144812I
                if (r3 == 0) goto L_0x014a
                java.util.LinkedList<te3.uv> r3 = r3.f185795d
                goto L_0x014b
            L_0x014a:
                r3 = 0
            L_0x014b:
                if (r3 == 0) goto L_0x0156
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0154
                goto L_0x0156
            L_0x0154:
                r3 = 0
                goto L_0x0157
            L_0x0156:
                r3 = 1
            L_0x0157:
                if (r3 != 0) goto L_0x01b7
                java.lang.String r3 = r8.f170243j
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r11 = "handleCheerIconsInfo custom cheer info:"
                r4.append(r11)
                te3.uw0 r11 = r7.f144812I
                if (r11 == 0) goto L_0x0176
                java.util.LinkedList<te3.uv> r11 = r11.f185795d
                if (r11 == 0) goto L_0x0176
                int r11 = r11.size()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                goto L_0x0177
            L_0x0176:
                r11 = 0
            L_0x0177:
                r4.append(r11)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                te3.uw0 r3 = r7.f144812I
                if (r3 == 0) goto L_0x01a0
                java.util.LinkedList<te3.uv> r3 = r3.f185795d
                if (r3 == 0) goto L_0x01a0
                r1.addAll(r3)
                te3.uw0 r3 = r7.f144812I
                if (r3 == 0) goto L_0x0193
                int r3 = r3.f185797f
                goto L_0x0194
            L_0x0193:
                r3 = 0
            L_0x0194:
                androidx.lifecycle.i0 r4 = r8.mo83051g(r14)
                cl1.o r4 = (cl1.C54991o) r4
                cl1.o$a r4 = r4.f154278X1
                r11 = 0
                r4.f1589e = r11
                goto L_0x01a1
            L_0x01a0:
                r3 = 0
            L_0x01a1:
                te3.uw0 r4 = r7.f144812I
                if (r4 == 0) goto L_0x0214
                androidx.lifecycle.i0 r11 = r8.mo83051g(r14)
                cl1.o r11 = (cl1.C54991o) r11
                cl1.o$b r12 = new cl1.o$b
                java.lang.String r15 = r4.f185799h
                int r4 = r4.f185800i
                r12.<init>(r15, r4)
                r11.f154283Y1 = r12
                goto L_0x0214
            L_0x01b7:
                te3.yr0 r3 = r7.f144871y
                if (r3 == 0) goto L_0x01be
                java.util.LinkedList<te3.uv> r3 = r3.f145477d
                goto L_0x01bf
            L_0x01be:
                r3 = 0
            L_0x01bf:
                if (r3 == 0) goto L_0x01ca
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x01c8
                goto L_0x01ca
            L_0x01c8:
                r3 = 0
                goto L_0x01cb
            L_0x01ca:
                r3 = 1
            L_0x01cb:
                if (r3 != 0) goto L_0x020c
                java.lang.String r3 = r8.f170243j
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r11 = "handleCheerIconsInfo custom ad cheer info:"
                r4.append(r11)
                te3.yr0 r11 = r7.f144871y
                if (r11 == 0) goto L_0x01ea
                java.util.LinkedList<te3.uv> r11 = r11.f145477d
                if (r11 == 0) goto L_0x01ea
                int r11 = r11.size()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                goto L_0x01eb
            L_0x01ea:
                r11 = 0
            L_0x01eb:
                r4.append(r11)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                te3.yr0 r3 = r7.f144871y
                if (r3 == 0) goto L_0x0213
                java.util.LinkedList<te3.uv> r3 = r3.f145477d
                if (r3 == 0) goto L_0x0213
                r1.addAll(r3)
                androidx.lifecycle.i0 r3 = r8.mo83051g(r14)
                cl1.o r3 = (cl1.C54991o) r3
                cl1.o$a r3 = r3.f154278X1
                r3.f1589e = r10
                r3 = 1
                goto L_0x0214
            L_0x020c:
                java.lang.String r3 = r8.f170243j
                java.lang.String r4 = "handleCheerIconsInfo skip, no custom cheer info."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            L_0x0213:
                r3 = 0
            L_0x0214:
                androidx.lifecycle.i0 r4 = r8.mo83051g(r14)
                cl1.o r4 = (cl1.C54991o) r4
                te3.uw0 r11 = r7.f144812I
                if (r11 == 0) goto L_0x0221
                java.lang.String r11 = r11.f185796e
                goto L_0x0222
            L_0x0221:
                r11 = 0
            L_0x0222:
                r4.mo75972M4(r1, r11, r3)
                java.lang.Class<cl1.m> r4 = cl1.C54985m.class
                androidx.lifecycle.i0 r4 = r8.mo83051g(r4)
                cl1.m r4 = (cl1.C54985m) r4
                cl1.m$b r11 = new cl1.m$b
                te3.uw0 r12 = r7.f144812I
                if (r12 == 0) goto L_0x0236
                java.lang.String r15 = r12.f185796e
                goto L_0x0237
            L_0x0236:
                r15 = 0
            L_0x0237:
                r11.<init>(r1, r15, r3)
                if (r12 == 0) goto L_0x023f
                java.util.LinkedList<te3.tw0> r1 = r12.f185798g
                goto L_0x0240
            L_0x023f:
                r1 = 0
            L_0x0240:
                r4.mo75950d3(r11, r1)
                qj1.v9 r1 = r8.f170259z
                if (r1 == 0) goto L_0x0254
                androidx.lifecycle.i0 r3 = r8.mo83051g(r14)
                cl1.o r3 = (cl1.C54991o) r3
                cl1.o$a r3 = r3.f154278X1
                java.util.List<te3.uv> r3 = r3.f1586b
                r1.mo87991f1(r3)
            L_0x0254:
                qj1.u1 r1 = r8.f170202D
                if (r1 == 0) goto L_0x0265
                androidx.lifecycle.i0 r3 = r8.mo83051g(r14)
                cl1.o r3 = (cl1.C54991o) r3
                cl1.o$a r3 = r3.f154278X1
                java.lang.String r3 = r3.f1587c
                r1.mo12262a1(r3)
            L_0x0265:
                androidx.lifecycle.i0 r1 = r8.mo83051g(r14)
                cl1.o r1 = (cl1.C54991o) r1
                al1.r r1 = r1.f154376v2
                java.util.LinkedList<java.lang.String> r1 = r1.f513a
                r1.clear()
                androidx.lifecycle.i0 r1 = r8.mo83051g(r14)
                cl1.o r1 = (cl1.C54991o) r1
                al1.r r1 = r1.f154376v2
                java.util.LinkedList<java.lang.String> r1 = r1.f513a
                java.util.LinkedList<java.lang.String> r3 = r7.f144869x
                r1.addAll(r3)
                androidx.lifecycle.i0 r1 = r8.mo83051g(r14)
                cl1.o r1 = (cl1.C54991o) r1
                al1.r r1 = r1.f154376v2
                java.lang.String r3 = r7.f144868w
                r1.f514b = r3
                androidx.lifecycle.i0 r1 = r8.mo83051g(r14)
                cl1.o r1 = (cl1.C54991o) r1
                r1.mo76022t4(r10)
                androidx.lifecycle.i0 r1 = r8.mo83051g(r9)
                cl1.u r1 = (cl1.C55001u) r1
                d50.d r3 = new d50.d
                androidx.appcompat.app.AppCompatActivity r4 = r8.f166841e
                java.lang.Class r4 = r4.getClass()
                java.lang.String r4 = r4.getName()
                r3.<init>(r4)
                d50.h r4 = new d50.h
                r4.<init>(r6, r5, r3)
                r1.mo76043n3(r4)
                androidx.lifecycle.i0 r1 = r8.mo83051g(r14)
                cl1.o r1 = (cl1.C54991o) r1
                boolean r1 = r1.f154301c3
                if (r1 == 0) goto L_0x02d9
                androidx.lifecycle.i0 r1 = r8.mo83051g(r14)
                cl1.o r1 = (cl1.C54991o) r1
                te3.c21 r3 = r7.f144846f
                if (r3 == 0) goto L_0x02ca
                int r11 = r3.f182369P
                goto L_0x02cb
            L_0x02ca:
                r11 = 0
            L_0x02cb:
                r1.f154314f3 = r11
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                gl1.m r3 = new gl1.m
                r3.<init>(r8, r7)
                r1.mo77633g(r3)
                goto L_0x039e
            L_0x02d9:
                androidx.lifecycle.i0 r1 = r8.mo83051g(r9)
                cl1.u r1 = (cl1.C55001u) r1
                d50.h r1 = r1.f154421r
                if (r1 == 0) goto L_0x039e
                androidx.lifecycle.i0 r3 = r8.mo83051g(r14)
                cl1.o r3 = (cl1.C54991o) r3
                boolean r3 = r3.mo76007j4()
                androidx.lifecycle.i0 r4 = r8.mo83051g(r14)
                cl1.o r4 = (cl1.C54991o) r4
                te3.c21 r5 = r7.f144846f
                if (r5 == 0) goto L_0x02fa
                int r6 = r5.f182384X
                goto L_0x02fb
            L_0x02fa:
                r6 = 0
            L_0x02fb:
                r4.f154181A3 = r6
                if (r5 == 0) goto L_0x0305
                int r4 = r5.f182384X
                if (r4 != r10) goto L_0x0305
                r4 = 1
                goto L_0x0306
            L_0x0305:
                r4 = 0
            L_0x0306:
                if (r3 != 0) goto L_0x0351
                if (r4 == 0) goto L_0x0351
                androidx.lifecycle.i0 r3 = r8.mo83051g(r14)
                cl1.o r3 = (cl1.C54991o) r3
                int r3 = r3.mo75996d3()
                if (r3 != r10) goto L_0x0351
                qj1.ze r3 = r8.f170244n
                if (r3 == 0) goto L_0x031d
                r3.mo88096i1()
            L_0x031d:
                r3 = 0
                gl1.C59559k.m69435j(r8, r3, r10, r3)
                j50.a r3 = r8.f166844h
                boolean r4 = r3 instanceof i50.C60251a
                if (r4 == 0) goto L_0x032a
                i50.a r3 = (i50.C60251a) r3
                goto L_0x032b
            L_0x032a:
                r3 = 0
            L_0x032b:
                if (r3 == 0) goto L_0x0351
                al1.h r4 = r8.f166845i
                if (r4 == 0) goto L_0x0338
                com.tencent.mm.live.api.LiveConfig r4 = r4.f151977d
                if (r4 == 0) goto L_0x0338
                long r4 = r4.f157064e
                goto L_0x033a
            L_0x0338:
                r4 = 0
            L_0x033a:
                qj1.ze r6 = r8.f170244n
                if (r6 == 0) goto L_0x0343
                f50.d r6 = r6.mo88091c1()
                goto L_0x0344
            L_0x0343:
                r6 = 0
            L_0x0344:
                qj1.ze r10 = r8.f170244n
                if (r10 == 0) goto L_0x034d
                com.tencent.rtmp.ui.TXCloudVideoView r10 = r10.mo88092d1()
                goto L_0x034e
            L_0x034d:
                r10 = 0
            L_0x034e:
                r3.mo87270J0(r4, r6, r10)
            L_0x0351:
                qj1.ze r3 = r8.f170244n
                if (r3 == 0) goto L_0x0370
                f50.d r3 = r3.mo88091c1()
                if (r3 == 0) goto L_0x0370
                fj1.b r4 = r8.f166851d
                vk1.b r5 = r8.f166842f
                if (r5 == 0) goto L_0x0366
                boolean r11 = r5.isLandscape()
                goto L_0x0367
            L_0x0366:
                r11 = 0
            L_0x0367:
                boolean r5 = r8.f170240g1
                int r4 = r2.mo87123v0(r4, r11, r5)
                r3.setRenderMode(r4)
            L_0x0370:
                j50.a r15 = r8.f166844h
                if (r15 == 0) goto L_0x0381
                r17 = 0
                r18 = 0
                r19 = 6
                r20 = 0
                r16 = r1
                b50.C54408d.C54409a.m61122b(r15, r16, r17, r18, r19, r20)
            L_0x0381:
                er1.c5 r21 = er1.C58704c5.f168044a
                er1.e5$c r1 = er1.C58713e5.f168097y
                java.lang.String r1 = r1.f168101b
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 14
                r27 = 0
                r22 = r1
                er1.C58704c5.m68184a(r21, r22, r23, r24, r25, r26, r27)
                gl1.n r1 = new gl1.n
                r1.<init>(r8, r7)
                o40.C61926c.m72668M(r1)
            L_0x039e:
                vk1.b r1 = r8.f166842f
                if (r1 == 0) goto L_0x03a7
                fj1.b r3 = r8.f166851d
                r2.mo87124v1(r3, r1)
            L_0x03a7:
                vk1.b r1 = r8.f166842f
                if (r1 == 0) goto L_0x03b6
                te3.c21 r2 = r7.f144846f
                if (r2 == 0) goto L_0x03b2
                te3.l21 r2 = r2.f182360F
                goto L_0x03b3
            L_0x03b2:
                r2 = 0
            L_0x03b3:
                r1.processFinderLiveLayerShowInfo(r2)
            L_0x03b6:
                er1.f5 r1 = er1.C58728f5.f168144a
                long r1 = eb0.C31543z5.m39451a()
                er1.C58728f5.f168147d = r1
                di3.d r1 = di3.C86312j.m106911c(r13)
                ak1.o r1 = (ak1.C54108o) r1
                ak1.f0$n r2 = ak1.C54067f0.C0066n.MORE
                di3.d r3 = di3.C86312j.m106911c(r13)
                ak1.o r3 = (ak1.C54108o) r3
                ak1.f0$l r4 = ak1.C54067f0.C0062l.LIVING
                java.util.Map r3 = r3.Ex0(r4)
                r1.mo9602Jz(r2, r3)
                di3.d r1 = di3.C86312j.m106911c(r13)
                r2 = r1
                ak1.o r2 = (ak1.C54108o) r2
                androidx.lifecycle.i0 r1 = r8.mo83051g(r9)
                cl1.u r1 = (cl1.C55001u) r1
                te3.c21 r1 = r1.f154420q
                long r3 = r1.f182392d
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r4 = 2
                fe1.d$b r1 = fe1.C58961d.f168673a
                androidx.lifecycle.i0 r6 = r8.mo83051g(r14)
                cl1.o r6 = (cl1.C54991o) r6
                java.lang.String r6 = r6.f154345o
                fe1.q r1 = r1.mo84155b(r6)
                if (r1 == 0) goto L_0x0402
                java.lang.String r12 = r1.getNickname()
                r6 = r12
                goto L_0x0403
            L_0x0402:
                r6 = 0
            L_0x0403:
                r7 = 1
                r2.Vx0(r3, r4, r6, r7)
                vk1.b r1 = r8.f166842f
                if (r1 == 0) goto L_0x041d
                java.lang.Class<qs1.a> r2 = qs1.C63325a.class
                androidx.lifecycle.i0 r1 = r1.business(r2)
                qs1.a r1 = (qs1.C63325a) r1
                if (r1 == 0) goto L_0x041d
                gl1.i r2 = new gl1.i
                r2.<init>(r8)
                r1.mo88229f3(r2)
            L_0x041d:
                qj1.l0 r1 = r8.f170247p0
                if (r1 == 0) goto L_0x0570
                r1.mo12143c1()
                goto L_0x0570
            L_0x0426:
                r8.getClass()
                er1.c5 r14 = er1.C58704c5.f168044a
                er1.e5$c r1 = er1.C58713e5.f168096x
                java.lang.String r15 = r1.f168101b
                er1.j4 r1 = er1.C58739j4.f168176a
                te3.zo2 r5 = new te3.zo2
                r5.<init>()
                r5.f186779e = r2
                r5.f186780f = r4
                rx3.b0 r6 = rx3.C13598b0.f38549a
                pe3.b r16 = r1.mo83710g0(r5)
                r17 = 0
                r18 = 1
                r24 = 4
                r25 = 0
                r19 = 4
                r20 = 0
                er1.C58704c5.m68184a(r14, r15, r16, r17, r18, r19, r20)
                te3.ay0 r1 = r7.f144808E
                java.lang.String r5 = r8.f170243j
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "handleLiveErr errCode:"
                r6.append(r7)
                r6.append(r2)
                java.lang.String r7 = " errMsg:"
                r6.append(r7)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
                di3.d r4 = di3.C86312j.m106911c(r13)
                java.lang.String r5 = "getService(HellLiveReport::class.java)"
                gy3.C87412m.m108593f(r4, r5)
                r19 = r4
                ht1.j5 r19 = (ht1.C8777j5) r19
                r20 = 4
                java.lang.String r22 = java.lang.String.valueOf(r10)
                r23 = 0
                ht1.C8777j5.C8778a.m8600a(r19, r20, r22, r23, r24, r25)
                di3.d r4 = di3.C86312j.m106911c(r13)
                ak1.o r4 = (ak1.C54108o) r4
                r4.getClass()
                ak1.f0 r4 = ak1.C54108o.f151869h
                r4.f151437S = r2
                di3.d r4 = di3.C86312j.m106911c(r13)
                ak1.o r4 = (ak1.C54108o) r4
                ak1.f0$p r5 = ak1.C54067f0.C54077p.LIVE_EXIT_ERROR
                r4.ay0(r5)
                ok1.e r4 = ok1.C62042e.f176370a
                gl1.o r5 = new gl1.o
                r5.<init>(r8)
                r6 = 0
                boolean r3 = r4.mo87015J0(r3, r2, r6, r5)
                if (r3 != 0) goto L_0x0570
                r3 = -100038(0xfffffffffffe793a, float:NaN)
                if (r2 == r3) goto L_0x055d
                switch(r2) {
                    case -200018: goto L_0x053e;
                    case -200017: goto L_0x053e;
                    default: goto L_0x04b5;
                }
            L_0x04b5:
                switch(r2) {
                    case -200013: goto L_0x053e;
                    case -200012: goto L_0x051d;
                    case -200011: goto L_0x051d;
                    case -200010: goto L_0x04fc;
                    case -200009: goto L_0x04da;
                    default: goto L_0x04b8;
                }
            L_0x04b8:
                androidx.appcompat.app.AppCompatActivity r1 = r8.f166841e
                android.content.res.Resources r2 = r1.getResources()
                r3 = 2131826157(0x7f1115ed, float:1.928519E38)
                java.lang.String r2 = r2.getString(r3)
                r3 = 0
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r3)
                r1.show()
                vk1.b r1 = r8.f166842f
                if (r1 == 0) goto L_0x0570
                d60.b$b r2 = d60.C58124b.C58125b.BEFORE_LIVE
                r3 = 2
                r4 = 0
                d60.C58124b.C7172a.m7372a(r1, r2, r4, r3, r4)
                goto L_0x0570
            L_0x04da:
                androidx.appcompat.app.AppCompatActivity r1 = r8.f166841e
                android.content.res.Resources r2 = r1.getResources()
                r3 = 2131826158(0x7f1115ee, float:1.9285192E38)
                java.lang.String r2 = r2.getString(r3)
                r3 = 0
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r3)
                r1.show()
                vk1.b r1 = r8.f166842f
                if (r1 == 0) goto L_0x0570
                d60.b$b r2 = d60.C58124b.C58125b.BEFORE_LIVE
                r3 = 2
                r4 = 0
                d60.C58124b.C7172a.m7372a(r1, r2, r4, r3, r4)
                goto L_0x0570
            L_0x04fc:
                androidx.appcompat.app.AppCompatActivity r1 = r8.f166841e
                android.content.res.Resources r2 = r1.getResources()
                r3 = 2131826981(0x7f111925, float:1.9286862E38)
                java.lang.String r2 = r2.getString(r3)
                r3 = 0
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r3)
                r1.show()
                vk1.b r1 = r8.f166842f
                if (r1 == 0) goto L_0x0570
                d60.b$b r2 = d60.C58124b.C58125b.BEFORE_LIVE
                r3 = 2
                r4 = 0
                d60.C58124b.C7172a.m7372a(r1, r2, r4, r3, r4)
                goto L_0x0570
            L_0x051d:
                androidx.appcompat.app.AppCompatActivity r1 = r8.f166841e
                android.content.res.Resources r2 = r1.getResources()
                r3 = 2131827297(0x7f111a61, float:1.9287503E38)
                java.lang.String r2 = r2.getString(r3)
                r3 = 0
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r3)
                r1.show()
                vk1.b r1 = r8.f166842f
                if (r1 == 0) goto L_0x0570
                d60.b$b r2 = d60.C58124b.C58125b.LIVE_HAS_FINISHED
                r3 = 2
                r4 = 0
                d60.C58124b.C7172a.m7372a(r1, r2, r4, r3, r4)
                goto L_0x0570
            L_0x053e:
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                if (r1 == 0) goto L_0x0553
                byte[] r1 = r1.toByteArray()
                java.lang.String r4 = "PARAM_FINDER_LIVE_ERROR_PAGE"
                r3.putByteArray(r4, r1)
                java.lang.String r1 = "PARAM_FINDER_LIVE_ERROR_CODE"
                r3.putInt(r1, r2)
            L_0x0553:
                vk1.b r1 = r8.f166842f
                if (r1 == 0) goto L_0x0570
                d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_FORCE_QUIT
                r1.statusChange(r2, r3)
                goto L_0x0570
            L_0x055d:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.lang.String r2 = "PARAM_FINDER_LIVE_LIVE_FINISH_IF_CLOSE_LIVE"
                r1.putBoolean(r2, r10)
                vk1.b r2 = r8.f166842f
                if (r2 == 0) goto L_0x0570
                d60.b$b r3 = d60.C58124b.C58125b.LIVE_HAS_FINISHED
                r2.statusChange(r3, r1)
            L_0x0570:
                gl1.k r1 = r0.f170263d
                r1.getClass()
                gl1.e2 r2 = new gl1.e2
                r2.<init>(r1)
                o40.C61926c.m72668M(r2)
            L_0x057d:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: gl1.C59559k.C59562c.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: gl1.k$d */
    public static final class C59563d implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C59559k f170264d;

        public C59563d(C59559k kVar) {
            this.f170264d = kVar;
        }

        public final boolean onTimerExpired() {
            C59559k kVar;
            C12690u1 u1Var;
            Class cls = C54991o.class;
            C62632a6 a6Var = this.f170264d.f170249r;
            boolean z = false;
            if (a6Var != null && a6Var.mo14483f0() == 0) {
                C59559k kVar2 = this.f170264d;
                C62632a6 a6Var2 = kVar2.f170249r;
                if (a6Var2 != null) {
                    a6Var2.mo87667a1(((C55001u) kVar2.mo83051g(C55001u.class)).f154420q.f182396h);
                }
                C62632a6 a6Var3 = this.f170264d.f170249r;
                if (a6Var3 != null) {
                    a6Var3.mo87668b1();
                }
                LinkedList linkedList = new LinkedList();
                C59559k kVar3 = this.f170264d;
                if (C62042e.f176370a.mo87090j1(kVar3.f166851d)) {
                    linkedList.add(new C13604l(6, null));
                } else if (C0668l.m589e3((C0668l) kVar3.mo83051g(C0668l.class), (C64337e61) null, 1, (Object) null)) {
                    linkedList.add(new C13604l(1, null));
                } else {
                    linkedList.add(new C13604l(2, null));
                }
                if (((C54991o) kVar3.mo83051g(cls)).f154243Q1 && ((C54991o) kVar3.mo83051g(cls)).mo75963I3()) {
                    linkedList.add(new C13604l(4, null));
                }
                linkedList.add(new C13604l(3, null));
                C62632a6 a6Var4 = kVar3.f170249r;
                if (a6Var4 != null) {
                    a6Var4.mo87672f1(linkedList, true, false);
                }
            }
            C12690u1 u1Var2 = this.f170264d.f170202D;
            if (u1Var2 != null && u1Var2.mo14483f0() == 0) {
                z = true;
            }
            if (z && (u1Var = kVar.f170202D) != null) {
                C61926c.m72668M(new C12703v1(u1Var, ((C54991o) (kVar = this.f170264d).mo83051g(cls)).f154276X));
            }
            this.f170264d.getClass();
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59559k(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x025d  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m69435j(gl1.C59559k r19, android.view.View r20, int r21, java.lang.Object r22) {
        /*
            r0 = r19
            r1 = 1
            r2 = r21 & 1
            if (r2 == 0) goto L_0x0012
            qj1.ze r2 = r0.f170244n
            if (r2 == 0) goto L_0x0010
            com.tencent.rtmp.ui.TXCloudVideoView r2 = r2.mo88092d1()
            goto L_0x0014
        L_0x0010:
            r2 = 0
            goto L_0x0014
        L_0x0012:
            r2 = r20
        L_0x0014:
            java.lang.Class<cl1.o> r12 = cl1.C54991o.class
            androidx.lifecycle.i0 r4 = r0.mo83051g(r12)
            cl1.o r4 = (cl1.C54991o) r4
            int r13 = r4.f154338m1
            androidx.lifecycle.i0 r4 = r0.mo83051g(r12)
            cl1.o r4 = (cl1.C54991o) r4
            int r14 = r4.f154335l1
            r11 = 0
            if (r13 == 0) goto L_0x0269
            if (r14 != 0) goto L_0x002d
            goto L_0x0269
        L_0x002d:
            if (r2 != 0) goto L_0x0031
            r15 = 0
            goto L_0x0079
        L_0x0031:
            r4 = 1065353216(0x3f800000, float:1.0)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r10.mo10233c(r4)
            java.lang.Object[] r5 = r10.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/viewmodel/state/secondary/FinderLiveSecondaryLivingUIC"
            java.lang.String r7 = "adjustLayoutCDN"
            java.lang.String r8 = "(Landroid/view/View;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r16 = "setAlpha"
            java.lang.String r17 = "(F)V"
            r4 = r2
            r3 = r10
            r10 = r16
            r15 = 0
            r11 = r17
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r3 = r3.mo10231a(r15)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.setAlpha(r3)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/viewmodel/state/secondary/FinderLiveSecondaryLivingUIC"
            java.lang.String r6 = "adjustLayoutCDN"
            java.lang.String r7 = "(Landroid/view/View;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setAlpha"
            java.lang.String r10 = "(F)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x0079:
            if (r2 == 0) goto L_0x0080
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            goto L_0x0081
        L_0x0080:
            r3 = 0
        L_0x0081:
            boolean r4 = r3 instanceof android.widget.RelativeLayout.LayoutParams
            if (r4 == 0) goto L_0x0088
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            goto L_0x0089
        L_0x0088:
            r3 = 0
        L_0x0089:
            vk1.b r4 = r0.f166842f
            if (r4 == 0) goto L_0x0098
            android.widget.RelativeLayout r4 = r4.getPreviewRoot()
            if (r4 == 0) goto L_0x0098
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            goto L_0x0099
        L_0x0098:
            r4 = 0
        L_0x0099:
            boolean r5 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r5 == 0) goto L_0x00a0
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            androidx.appcompat.app.AppCompatActivity r5 = r0.f166841e
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            androidx.lifecycle.i0 r6 = r0.mo83051g(r12)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.mo75992a4()
            androidx.lifecycle.i0 r7 = r0.mo83051g(r12)
            cl1.o r7 = (cl1.C54991o) r7
            boolean r7 = r7.mo75985T4()
            ok1.e r8 = ok1.C62042e.f176370a
            androidx.appcompat.app.AppCompatActivity r9 = r0.f166841e
            rx3.l r9 = r8.mo87086i0(r9)
            A r10 = r9.f38555d
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            B r9 = r9.f38556e
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            if (r6 == 0) goto L_0x016e
            androidx.lifecycle.i0 r11 = r0.mo83051g(r12)
            cl1.o r11 = (cl1.C54991o) r11
            boolean r11 = r11.mo76007j4()
            if (r11 != 0) goto L_0x016e
            if (r1 != r5) goto L_0x016e
            if (r7 == 0) goto L_0x016e
            androidx.lifecycle.i0 r1 = r0.mo83051g(r12)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75993b4()
            if (r1 == 0) goto L_0x0104
            int r11 = r8.mo87089j0(r14, r13)
            int r13 = r13 * r10
            int r9 = r13 / r14
            r8 = r11
            r1 = 0
            r10 = 0
            r11 = r9
            goto L_0x0178
        L_0x0104:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
            int r1 = r1.x
            float r1 = (float) r1
            androidx.lifecycle.i0 r10 = r0.mo83051g(r12)
            cl1.o r10 = (cl1.C54991o) r10
            int r10 = r10.f154338m1
            float r10 = (float) r10
            androidx.lifecycle.i0 r11 = r0.mo83051g(r12)
            cl1.o r11 = (cl1.C54991o) r11
            int r11 = r11.f154335l1
            float r11 = (float) r11
            float r10 = r10 / r11
            float r1 = r1 * r10
            int r11 = (int) r1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
            int r1 = r1.y
            float r1 = (float) r1
            r10 = 1060118724(0x3f3020c4, float:0.68799996)
            float r1 = r1 * r10
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r9 = 2131166453(0x7f0704f5, float:1.7947152E38)
            float r9 = r10.getDimension(r9)
            float r10 = (float) r11
            r15 = 16
            int r17 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r17 > 0) goto L_0x0166
            int r8 = r8.mo87089j0(r14, r13)
            int r10 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r10 >= 0) goto L_0x0161
            int r10 = (int) r9
            if (r3 == 0) goto L_0x0159
            r3.addRule(r15)
        L_0x0159:
            r15 = r11
            r18 = r10
            r10 = r1
            r1 = r9
            r9 = r18
            goto L_0x0178
        L_0x0161:
            r10 = r1
            r1 = r9
            r9 = r11
            r15 = r9
            goto L_0x0178
        L_0x0166:
            if (r3 == 0) goto L_0x016b
            r3.addRule(r15)
        L_0x016b:
            r15 = r9
            r9 = r11
            goto L_0x0172
        L_0x016e:
            r1 = 0
            r9 = -1
            r11 = 0
            r15 = 0
        L_0x0172:
            r10 = r1
            r1 = r15
            r8 = 0
            r15 = r11
            r11 = r9
            r9 = -1
        L_0x0178:
            if (r4 != 0) goto L_0x017b
            goto L_0x017d
        L_0x017b:
            r4.topMargin = r8
        L_0x017d:
            if (r4 != 0) goto L_0x0180
            goto L_0x0182
        L_0x0180:
            r4.height = r9
        L_0x0182:
            if (r3 != 0) goto L_0x0185
            goto L_0x0187
        L_0x0185:
            r3.height = r11
        L_0x0187:
            vk1.b r11 = r0.f166842f
            if (r11 == 0) goto L_0x0190
            android.widget.RelativeLayout r11 = r11.getPreviewRoot()
            goto L_0x0191
        L_0x0190:
            r11 = 0
        L_0x0191:
            if (r11 != 0) goto L_0x0194
            goto L_0x0197
        L_0x0194:
            r11.setLayoutParams(r4)
        L_0x0197:
            vk1.b r11 = r0.f166842f
            if (r11 == 0) goto L_0x01a6
            android.view.ViewGroup r11 = r11.getCommonTopContentRoot()
            if (r11 == 0) goto L_0x01a6
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            goto L_0x01a7
        L_0x01a6:
            r11 = 0
        L_0x01a7:
            boolean r13 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r13 == 0) goto L_0x01ae
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            goto L_0x01af
        L_0x01ae:
            r11 = 0
        L_0x01af:
            if (r11 == 0) goto L_0x01b5
            r11.height = r9
            r11.topMargin = r8
        L_0x01b5:
            if (r2 != 0) goto L_0x01b8
            goto L_0x01bb
        L_0x01b8:
            r2.setLayoutParams(r3)
        L_0x01bb:
            if (r2 == 0) goto L_0x01c7
            gl1.h r8 = new gl1.h
            r8.<init>(r2, r0)
            r13 = 100
            r2.postDelayed(r8, r13)
        L_0x01c7:
            qj1.ze r2 = r0.f170244n
            if (r2 == 0) goto L_0x01d4
            com.tencent.rtmp.ui.TXCloudVideoView r8 = r2.mo88092d1()
            java.lang.String r9 = r0.f170243j
            r2.mo87689H0(r8, r9)
        L_0x01d4:
            java.lang.String r2 = r0.f170243j
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "adjustLayoutCDN fitLandscapeVideo:"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = ",curOrientation:"
            r8.append(r6)
            r8.append(r5)
            java.lang.String r5 = ",videoSizeValid:"
            r8.append(r5)
            r8.append(r7)
            java.lang.String r5 = ",uiState:"
            r8.append(r5)
            androidx.lifecycle.i0 r0 = r0.mo83051g(r12)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r8.append(r0)
            java.lang.String r0 = ",videoScaleHeight:"
            r8.append(r0)
            r8.append(r15)
            java.lang.String r0 = ",limitHeight:"
            r8.append(r0)
            r8.append(r10)
            java.lang.String r0 = ",landscapePlayerMiniHeight:"
            r8.append(r0)
            r8.append(r1)
            java.lang.String r0 = ",parentLp height:"
            r8.append(r0)
            if (r4 == 0) goto L_0x0229
            int r0 = r4.height
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x022a
        L_0x0229:
            r0 = 0
        L_0x022a:
            r8.append(r0)
            java.lang.String r0 = ",top:"
            r8.append(r0)
            if (r4 == 0) goto L_0x023b
            int r1 = r4.topMargin
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x023c
        L_0x023b:
            r1 = 0
        L_0x023c:
            r8.append(r1)
            java.lang.String r1 = ", height:"
            r8.append(r1)
            if (r3 == 0) goto L_0x024d
            int r1 = r3.height
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x024e
        L_0x024d:
            r1 = 0
        L_0x024e:
            r8.append(r1)
            r8.append(r0)
            if (r3 == 0) goto L_0x025d
            int r0 = r3.topMargin
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L_0x025e
        L_0x025d:
            r3 = 0
        L_0x025e:
            r8.append(r3)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x02b5
        L_0x0269:
            if (r2 != 0) goto L_0x026c
            goto L_0x02ae
        L_0x026c:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r1.mo10233c(r3)
            java.lang.Object[] r5 = r1.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/viewmodel/state/secondary/FinderLiveSecondaryLivingUIC"
            java.lang.String r7 = "adjustLayoutCDN"
            java.lang.String r8 = "(Landroid/view/View;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setAlpha"
            java.lang.String r11 = "(F)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r2.setAlpha(r1)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/viewmodel/state/secondary/FinderLiveSecondaryLivingUIC"
            java.lang.String r6 = "adjustLayoutCDN"
            java.lang.String r7 = "(Landroid/view/View;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setAlpha"
            java.lang.String r10 = "(F)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x02ae:
            java.lang.String r0 = r0.f170243j
            java.lang.String r1 = "adjustLayoutCDN video size = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x02b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl1.C59559k.m69435j(gl1.k, android.view.View, int, java.lang.Object):void");
    }

    /* renamed from: i */
    public void mo83045i(C65761b bVar) {
        FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView;
        ViewStub viewStub;
        ViewStub viewStub2;
        Class cls = C54991o.class;
        C87412m.m108594g(bVar, "baseRouter");
        super.mo83045i(bVar);
        String O5 = C66785b.f191882e.mo90662O5();
        C87412m.m108594g(O5, "<set-?>");
        ((C54991o) mo83051g(cls)).f154345o = O5;
        C56032b.fillBlurBg$default(bVar, ((C54991o) mo83051g(cls)).f154345o, false, 2, (Object) null);
        C65761b bVar2 = this.f166842f;
        if (bVar2 != null) {
            this.f170244n = (C63170ze) mo84611q(new C59593y(bVar2));
            this.f170207I = (C62843kb) mo84611q(new C59557j0(this, bVar2));
            this.f170206H = (C62772fb) mo84611q(new C59586u0(this, bVar2));
            this.f170205G = (C62707db) mo84611q(new C59545f1(this, bVar2));
            this.f170246p = (C62833je) mo84611q(new C59581q1(bVar2));
            this.f170211M = (C64039c) mo84611q(new C59588v1(bVar2));
            this.f170213P = (C66420d) mo84611q(new C59591w1(bVar2));
            this.f170214Q = (C15883o) mo84611q(new C8355x1(bVar2));
            this.f170216R = (C12238a0) mo84611q(new C8356y1(bVar2));
            this.f170218S = (C62638b0) mo84611q(new C59577p(bVar2));
            this.f170248q = (C12399ff) mo84611q(new C8347q(bVar2));
            this.f170249r = (C62632a6) mo84611q(new C8348r(bVar2));
            ViewGroup viewGroup = (ViewGroup) bVar2.findViewById(C0966R.C0970id.n5r);
            this.f170251t = viewGroup != null ? new C60085d(viewGroup, bVar2) : null;
            this.f170253v = (C62976sd) mo84611q(new C59582s(bVar2));
            this.f170252u = (C12322e5) mo84611q(new C8351t(bVar2));
            this.f170241h1 = C0966R.C0970id.f358112dh1;
            C63151z0 z0Var = (C63151z0) mo84611q(new C59585u(bVar2));
            this.f170254w = z0Var;
            if (z0Var != null) {
                C62042e eVar = C62042e.f176370a;
                z0Var.f179195s = eVar.mo87073d1(this.f166851d) || eVar.mo87035Q0(this.f166851d);
            }
            this.f170255x = (C12389fa) mo84611q(new C8352v(bVar2));
            this.f170257y = (C12707vb) mo84611q(new C59589w(bVar2, this));
            this.f170259z = (C63049v9) mo84611q(new C59592x(bVar2));
            C12733x3 x3Var = (C12733x3) mo84611q(new C8357z(bVar2));
            C62993t9 t9Var = (C62993t9) mo84611q(new C59530a0(bVar2));
            this.f170250s = (C62905o2) mo84611q(new C59533b0(bVar2));
            this.f170258y0 = (C62758ea) mo84611q(new C59536c0(bVar2));
            this.f170203E = (C62949r8) mo84611q(new C8336d0(bVar2));
            this.f170204F = (C12475jc) mo84611q(new C8337e0(bVar2));
            C62668c4 c4Var = (C62668c4) mo84611q(new C59544f0(bVar2));
            this.f170202D = (C12690u1) mo84611q(new C8339g0(bVar2));
            this.f170245o = (FinderLiveAnchorExceptionPlugin) mo84611q(new C59551h0(bVar2));
            this.f170201C = (C12522mf) mo84611q(new C8340i0(bVar2));
            this.f170212N = (C13969d) mo84611q(new C8343k0(bVar2));
            this.f170222U = (C12611q7) mo84611q(new C8344l0(bVar2));
            this.f170230Y = (C63006u7) mo84611q(new C59570m0(bVar2, this));
            this.f170247p0 = (C12490l0) mo84611q(new C8345n0(bVar2));
            this.f170215Q0 = (C63081w3) mo84611q(new C59575o0(bVar2));
            this.f170235b1 = (C62987t2) mo84611q(new C59578p0(bVar2));
            this.f170236c1 = (C62921p3) mo84611q(new C59580q0(bVar2));
            this.f170217R0 = (C12256bd) mo84611q(new C8349r0(bVar2));
            this.f170221T0 = (C12632r2) mo84611q(new C8350s0(bVar2));
            this.f170231Y0 = (C62911o3) mo84611q(new C59584t0(bVar2));
            this.f170219S0 = (C12377f1) mo84611q(new C8353v0(bVar2));
            C12469j1 j1Var = (C12469j1) mo84611q(new C59590w0(this, bVar2));
            this.f170223U0 = (C12482k1) mo84611q(new C8354x0(bVar2));
            this.f170225V0 = (C62804h6) mo84611q(new C59594y0(bVar2));
            this.f170233Z0 = (C60291e) mo84611q(new C59595z0(bVar2));
            C12429gi giVar = (C12429gi) mo84611q(new C8334a1(bVar2));
            C12625qe qeVar = (C12625qe) mo84611q(new C8335b1(bVar2));
            this.f170237d1 = (C63108xd) mo84611q(new C59537c1(bVar2));
            if (bVar2.isLandscape()) {
                finderLiveGameWelfareTaskProgressView = (FinderLiveGameWelfareTaskProgressView) bVar2.findViewById(C0966R.C0970id.dly);
            } else {
                C62632a6 a6Var = this.f170249r;
                finderLiveGameWelfareTaskProgressView = a6Var != null ? (FinderLiveGameWelfareTaskProgressView) a6Var.f166287d.findViewById(C0966R.C0970id.dly) : null;
            }
            this.f170232Z = (C47844c7) mo84611q(new C45935d1(bVar2, finderLiveGameWelfareTaskProgressView));
            C12453ii iiVar = (C12453ii) mo84611q(new C8338e1(bVar2));
            this.f170220T = (C12282d7) mo84611q(new C59548g1(this, bVar2));
            C12282d7 d7Var = this.f170220T;
            if (d7Var != null) {
                d7Var.mo10792g(8);
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C65348b bVar3 = (C65348b) mo84611q(new C59552h1(this, bVar2));
            this.f170224V = (C12693u2) mo84611q(new C8341i1(bVar2));
            this.f170226W = (C63100x2) mo84611q(new C8342j1(bVar2));
            ((C63344h) C86312j.m106911c(C63344h.class)).mo88249xp();
            this.f170228X = (C62861l1) mo84611q(new C59564k1(bVar2));
            this.f170229X0 = bVar2.findViewById(C0966R.C0970id.dxg);
            C12475jc jcVar = this.f170204F;
            if (jcVar != null) {
                jcVar.mo10792g(4);
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
            if (this.f170199A == null) {
                this.f170199A = (C62712dd) mo84611q(new C59567l1(bVar2));
                C62712dd ddVar = this.f170199A;
                if (ddVar != null) {
                    ddVar.mo10792g(8);
                    C13598b0 b0Var3 = C13598b0.f38549a;
                }
            }
            if (this.f170256x0 == null && (viewStub2 = (ViewStub) bVar2.findViewById(C0966R.C0970id.nuu)) != null) {
                this.f170256x0 = (C63129yc) mo84611q(new C59571m1(viewStub2, bVar2));
                C63129yc ycVar = this.f170256x0;
                if (ycVar != null) {
                    ycVar.mo10792g(8);
                    C13598b0 b0Var4 = C13598b0.f38549a;
                }
            }
            if (this.f170238e1 == null && (viewStub = (ViewStub) bVar2.findViewById(C0966R.C0970id.odh)) != null) {
                C12503ld ldVar = (C12503ld) mo84611q(new C8346n1(viewStub, bVar2));
                this.f170238e1 = ldVar;
                if (ldVar != null) {
                    ldVar.mo10792g(8);
                    C13598b0 b0Var5 = C13598b0.f38549a;
                }
            }
            this.f170234a1 = (C63118y3) mo84611q(new C59576o1(bVar2));
            mo84607m();
            C56032b.hideLoadingLayer$default(bVar2, false, 1, (Object) null);
            C62833je jeVar = this.f170246p;
            if (jeVar != null) {
                jeVar.mo10792g(8);
                C13598b0 b0Var6 = C13598b0.f38549a;
            }
            C12399ff ffVar = this.f170248q;
            if (ffVar != null) {
                ffVar.mo10792g(8);
                C13598b0 b0Var7 = C13598b0.f38549a;
            }
            C62632a6 a6Var2 = this.f170249r;
            if (a6Var2 != null) {
                a6Var2.mo10792g(8);
                C13598b0 b0Var8 = C13598b0.f38549a;
            }
            C60085d dVar = this.f170251t;
            if (dVar != null) {
                dVar.mo10792g(8);
                C13598b0 b0Var9 = C13598b0.f38549a;
            }
            C62976sd sdVar = this.f170253v;
            if (sdVar != null) {
                sdVar.mo10792g(8);
                C13598b0 b0Var10 = C13598b0.f38549a;
            }
            C12322e5 e5Var = this.f170252u;
            if (e5Var != null) {
                e5Var.mo10792g(8);
                C13598b0 b0Var11 = C13598b0.f38549a;
            }
            C63151z0 z0Var2 = this.f170254w;
            if (z0Var2 != null) {
                z0Var2.mo10792g(8);
                C13598b0 b0Var12 = C13598b0.f38549a;
            }
            C12389fa faVar = this.f170255x;
            if (faVar != null) {
                faVar.mo10792g(8);
                C13598b0 b0Var13 = C13598b0.f38549a;
            }
            C12707vb vbVar = this.f170257y;
            if (vbVar != null) {
                vbVar.mo10792g(8);
                C13598b0 b0Var14 = C13598b0.f38549a;
            }
            C63049v9 v9Var = this.f170259z;
            if (v9Var != null) {
                v9Var.mo10792g(8);
                C13598b0 b0Var15 = C13598b0.f38549a;
            }
            C62949r8 r8Var = this.f170203E;
            if (r8Var != null) {
                r8Var.mo10792g(8);
                C13598b0 b0Var16 = C13598b0.f38549a;
            }
            C12690u1 u1Var = this.f170202D;
            if (u1Var != null) {
                u1Var.mo10792g(8);
                C13598b0 b0Var17 = C13598b0.f38549a;
            }
            C62712dd ddVar2 = this.f170199A;
            if (ddVar2 != null) {
                ddVar2.mo10792g(8);
                C13598b0 b0Var18 = C13598b0.f38549a;
            }
            C62924pe peVar = this.f170200B;
            if (peVar != null) {
                peVar.mo10792g(8);
                C13598b0 b0Var19 = C13598b0.f38549a;
            }
            FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin = this.f170245o;
            if (finderLiveAnchorExceptionPlugin != null) {
                finderLiveAnchorExceptionPlugin.mo10792g(8);
                C13598b0 b0Var20 = C13598b0.f38549a;
            }
            C64039c cVar = this.f170211M;
            if (cVar != null) {
                cVar.mo10792g(8);
                C13598b0 b0Var21 = C13598b0.f38549a;
            }
            C13969d dVar2 = this.f170212N;
            if (dVar2 != null) {
                dVar2.mo10792g(8);
                C13598b0 b0Var22 = C13598b0.f38549a;
            }
            C66420d dVar3 = this.f170213P;
            if (dVar3 != null) {
                dVar3.mo10792g(8);
                C13598b0 b0Var23 = C13598b0.f38549a;
            }
            C15883o oVar = this.f170214Q;
            if (oVar != null) {
                oVar.mo10792g(8);
                C13598b0 b0Var24 = C13598b0.f38549a;
            }
            C12238a0 a0Var = this.f170216R;
            if (a0Var != null) {
                a0Var.mo10792g(8);
                C13598b0 b0Var25 = C13598b0.f38549a;
            }
            C62638b0 b0Var26 = this.f170218S;
            if (b0Var26 != null) {
                b0Var26.mo10792g(8);
                C13598b0 b0Var27 = C13598b0.f38549a;
            }
            C47844c7 c7Var = this.f170232Z;
            if (c7Var != null) {
                c7Var.mo10792g(8);
                C13598b0 b0Var28 = C13598b0.f38549a;
            }
            C12490l0 l0Var = this.f170247p0;
            if (l0Var != null) {
                l0Var.mo10792g(8);
                C13598b0 b0Var29 = C13598b0.f38549a;
            }
            C63129yc ycVar2 = this.f170256x0;
            if (ycVar2 != null) {
                ycVar2.mo10792g(8);
                C13598b0 b0Var30 = C13598b0.f38549a;
            }
            C63081w3 w3Var = this.f170215Q0;
            if (w3Var != null) {
                w3Var.mo10792g(8);
                C13598b0 b0Var31 = C13598b0.f38549a;
            }
            C62987t2 t2Var = this.f170235b1;
            if (t2Var != null) {
                t2Var.mo10792g(8);
                C13598b0 b0Var32 = C13598b0.f38549a;
            }
            C62921p3 p3Var = this.f170236c1;
            if (p3Var != null) {
                p3Var.mo10792g(8);
                C13598b0 b0Var33 = C13598b0.f38549a;
            }
            C12693u2 u2Var = this.f170224V;
            if (u2Var != null) {
                u2Var.mo10792g(8);
                C13598b0 b0Var34 = C13598b0.f38549a;
            }
            C63100x2 x2Var = this.f170226W;
            if (x2Var != null) {
                x2Var.mo10792g(8);
                C13598b0 b0Var35 = C13598b0.f38549a;
            }
            C62861l1 l1Var = this.f170228X;
            if (l1Var != null) {
                l1Var.mo10792g(8);
                C13598b0 b0Var36 = C13598b0.f38549a;
            }
            C12611q7 q7Var = this.f170222U;
            if (q7Var != null) {
                q7Var.mo10792g(8);
                C13598b0 b0Var37 = C13598b0.f38549a;
            }
            C63006u7 u7Var = this.f170230Y;
            if (u7Var != null) {
                u7Var.mo10792g(8);
                C13598b0 b0Var38 = C13598b0.f38549a;
            }
            C12256bd bdVar = this.f170217R0;
            if (bdVar != null) {
                bdVar.mo10792g(8);
                C13598b0 b0Var39 = C13598b0.f38549a;
            }
            C12632r2 r2Var = this.f170221T0;
            if (r2Var != null) {
                r2Var.mo10792g(8);
                C13598b0 b0Var40 = C13598b0.f38549a;
            }
            C62911o3 o3Var = this.f170231Y0;
            if (o3Var != null) {
                o3Var.mo10792g(8);
                C13598b0 b0Var41 = C13598b0.f38549a;
            }
            C63049v9 v9Var2 = this.f170259z;
            if (v9Var2 != null) {
                v9Var2.mo87990e1();
                C13598b0 b0Var42 = C13598b0.f38549a;
            }
            if (this.f170249r != null) {
                C13598b0 b0Var43 = C13598b0.f38549a;
            }
            C62758ea eaVar = this.f170258y0;
            if (eaVar != null) {
                eaVar.mo10792g(8);
                C13598b0 b0Var44 = C13598b0.f38549a;
            }
            C12377f1 f1Var = this.f170219S0;
            if (f1Var != null) {
                f1Var.mo10792g(8);
                C13598b0 b0Var45 = C13598b0.f38549a;
            }
            C12482k1 k1Var = this.f170223U0;
            if (k1Var != null) {
                k1Var.mo10792g(8);
                C13598b0 b0Var46 = C13598b0.f38549a;
            }
            C62804h6 h6Var = this.f170225V0;
            if (h6Var != null) {
                h6Var.mo10792g(8);
                C13598b0 b0Var47 = C13598b0.f38549a;
            }
            C60291e eVar2 = this.f170233Z0;
            if (eVar2 != null) {
                eVar2.mo10792g(8);
                C13598b0 b0Var48 = C13598b0.f38549a;
            }
            C63118y3 y3Var = this.f170234a1;
            if (y3Var != null) {
                y3Var.mo10792g(8);
                C13598b0 b0Var49 = C13598b0.f38549a;
            }
            C12503ld ldVar2 = this.f170238e1;
            if (ldVar2 != null) {
                ldVar2.mo10792g(8);
                C13598b0 b0Var50 = C13598b0.f38549a;
            }
            if (this.f170208J == null) {
                C62705da daVar = (C62705da) mo84611q(new C59579p1(bVar2));
                this.f170208J = daVar;
                if (daVar != null) {
                    daVar.mo10792g(8);
                    C13598b0 b0Var51 = C13598b0.f38549a;
                }
            }
            if (this.f170209K == null) {
                this.f170209K = (C62647ba) mo84611q(new C59583s1((ViewGroup) bVar2.findViewById(C0966R.C0970id.mrn), bVar2));
                C62647ba baVar = this.f170209K;
                if (baVar != null) {
                    baVar.mo10792g(8);
                    C13598b0 b0Var52 = C13598b0.f38549a;
                }
            }
            if (this.f170210L == null) {
                C62647ba baVar2 = (C62647ba) mo84611q(new C59587u1((ViewGroup) bVar2.findViewById(C0966R.C0970id.mqp), bVar2));
                this.f170210L = baVar2;
                if (baVar2 != null) {
                    baVar2.mo10792g(8);
                    C13598b0 b0Var53 = C13598b0.f38549a;
                }
            }
            C65761b bVar4 = this.f166842f;
            if (bVar4 != null) {
                bVar4.showProgressWithBlurBg(((C54991o) mo83051g(cls)).f154345o);
                C13598b0 b0Var54 = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: k */
    public final void mo84605k() {
        C65761b bVar = this.f166842f;
        if (bVar != null) {
            String str = this.f170243j;
            Log.m105924i(str, "checkMiniWindow:" + bVar + ".checkMiniWin");
            if (!bVar.getCheckMiniWin()) {
                mo84612r();
                this.f170242i1.stopTimer();
                bVar.setCheckMiniWin(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r5 = r5.getRootView();
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84606l(boolean r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L_0x002e
            vk1.b r5 = r0.f166842f
            if (r5 == 0) goto L_0x0019
            android.view.View r5 = r5.getRootView()
            if (r5 == 0) goto L_0x0019
            android.content.Context r5 = r5.getContext()
            goto L_0x001a
        L_0x0019:
            r5 = r4
        L_0x001a:
            androidx.appcompat.app.AppCompatActivity r6 = r0.f166841e
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131828752(0x7f112010, float:1.9290454E38)
            java.lang.String r6 = r6.getString(r7)
            android.widget.Toast r5 = nj3.C76912y0.makeText((android.content.Context) r5, (java.lang.CharSequence) r6, (int) r3)
            r5.show()
        L_0x002e:
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            androidx.lifecycle.i0 r5 = r0.mo83051g(r5)
            cl1.o r5 = (cl1.C54991o) r5
            int r5 = r5.mo75996d3()
            r6 = 1
            if (r5 != r6) goto L_0x0120
            java.lang.String r5 = r0.f170243j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "chooseAudienceMode CDN fromMiniWin:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = ", liveRoomModel:"
            r6.append(r7)
            androidx.lifecycle.i0 r7 = r0.mo83051g(r2)
            cl1.u r7 = (cl1.C55001u) r7
            d50.h r7 = r7.f154421r
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            androidx.lifecycle.i0 r5 = r0.mo83051g(r2)
            cl1.u r5 = (cl1.C55001u) r5
            d50.h r5 = r5.f154421r
            if (r5 == 0) goto L_0x0120
            j50.a r6 = r0.f166844h
            if (r6 == 0) goto L_0x0079
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r7 = r5
            b50.C54408d.C54409a.m61122b(r6, r7, r8, r9, r10, r11)
        L_0x0079:
            j50.a r6 = r0.f166844h
            boolean r7 = r6 instanceof p50.C62197e
            if (r7 == 0) goto L_0x0082
            p50.e r6 = (p50.C62197e) r6
            goto L_0x0083
        L_0x0082:
            r6 = r4
        L_0x0083:
            if (r6 == 0) goto L_0x008a
            d50.g r5 = r5.f166251b
            r6.mo87274Q0(r5)
        L_0x008a:
            qj1.ze r5 = r0.f170244n
            if (r5 == 0) goto L_0x0091
            r5.mo88095h1(r3)
        L_0x0091:
            er1.g5 r6 = er1.C58730g5.f168158a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "RV_VISITOR_"
            r5.append(r7)
            androidx.lifecycle.i0 r7 = r0.mo83051g(r2)
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            long r7 = r7.f182392d
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            er1.e5$b r5 = er1.C58713e5.f168073a
            er1.e5$c r5 = er1.C58713e5.f168082j
            java.lang.String r8 = r5.f168101b
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 60
            r14 = 0
            er1.C58730g5.m68220e(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            qj1.ze r15 = r0.f170244n
            if (r15 == 0) goto L_0x00ee
            r16 = 0
            ok1.e r5 = ok1.C62042e.f176370a
            com.tencent.rtmp.TXLivePlayConfig r17 = r5.mo87034Q()
            fj1.b r6 = r0.f166851d
            vk1.b r7 = r0.f166842f
            if (r7 == 0) goto L_0x00d5
            boolean r7 = r7.isLandscape()
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            boolean r8 = r0.f170240g1
            int r18 = r5.mo87123v0(r6, r7, r8)
            r19 = 0
            r20 = 0
            gl1.k$a r5 = new gl1.k$a
            r5.<init>(r1, r0)
            r22 = 25
            r23 = 0
            r21 = r5
            qj1.C63170ze.m74522g1(r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x00ee:
            qj1.ze r1 = r0.f170244n
            if (r1 == 0) goto L_0x00f5
            r1.mo10792g(r3)
        L_0x00f5:
            j50.a r1 = r0.f166844h
            boolean r3 = r1 instanceof i50.C60251a
            if (r3 == 0) goto L_0x00fe
            i50.a r1 = (i50.C60251a) r1
            goto L_0x00ff
        L_0x00fe:
            r1 = r4
        L_0x00ff:
            if (r1 == 0) goto L_0x0120
            androidx.lifecycle.i0 r2 = r0.mo83051g(r2)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r2 = r2.f182392d
            qj1.ze r5 = r0.f170244n
            if (r5 == 0) goto L_0x0114
            f50.d r5 = r5.mo88091c1()
            goto L_0x0115
        L_0x0114:
            r5 = r4
        L_0x0115:
            qj1.ze r6 = r0.f170244n
            if (r6 == 0) goto L_0x011d
            com.tencent.rtmp.ui.TXCloudVideoView r4 = r6.mo88092d1()
        L_0x011d:
            r1.mo87270J0(r2, r5, r4)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl1.C59559k.mo84606l(boolean):void");
    }

    /* renamed from: m */
    public final void mo84607m() {
        Class cls = C54979h1.class;
        C65761b bVar = this.f166842f;
        if (bVar != null) {
            String str = this.f170243j;
            Log.m105924i(str, "user:" + ((C54991o) mo83051g(C54991o.class)).f154345o + ",bind shop:" + ((C54979h1) mo83051g(cls)).f154134f);
            if (this.f170247p0 != null && ((C54979h1) mo83051g(cls)).f154134f) {
                C62924pe peVar = (C62924pe) mo84611q(new C59561b(bVar));
                this.f170200B = peVar;
                if (peVar != null) {
                    peVar.mo8357i0();
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo84608n() {
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
        ((C54991o) mo83051g(cls2)).mo75976O4(b != null ? b.field_liveSwitchFlag : 0);
        C0639y1.f1510a.mo617i();
        C66093v1.f189992n.mo61526a(((C55001u) mo83051g(cls)).f154420q.f182392d);
        String str = this.f170243j;
        StringBuilder sb = new StringBuilder();
        sb.append("joinLive anchorStatusFlag:");
        sb.append(((C54991o) mo83051g(cls2)).f154354q);
        sb.append(" switchFlag:");
        sb.append(b != null ? Long.valueOf(b.field_liveSwitchFlag) : null);
        sb.append(" giftFuncEnabel:");
        sb.append(((C54991o) mo83051g(cls2)).f154243Q1);
        sb.append(" linkMicFuncEnabel:");
        sb.append(((C54963d0) mo83051g(C54963d0.class)).f154080w);
        Log.m105924i(str, sb.toString());
        C61791o.f175673a.mo86722d("secondary_joinLive", ((C54991o) mo83051g(cls2)).f154354q);
        FinderLiveService.f159376d.getClass();
        C54795n5 n5Var = FinderLiveService.f159396y;
        if (n5Var != null) {
            ((C54820t) n5Var).mo75734f0(this.f166841e, ((C55001u) mo83051g(cls)).f154420q.f182392d, 1, new C59562c(this));
        }
    }

    /* renamed from: o */
    public final void mo84609o(Integer num) {
        Class cls = C54963d0.class;
        String str = this.f170243j;
        Log.m105924i(str, "onAcceptLinkMicOthers curLinkState:" + ((C54963d0) mo83051g(cls)).f154078u + " curLiveUser:" + ((C54963d0) mo83051g(cls)).f154073p + " audienceLinkMicUserList:" + ((C54963d0) mo83051g(cls)).f154074q + " audienceMode:" + ((C54991o) mo83051g(C54991o.class)).mo75996d3());
        C54130j jVar = ((C54963d0) mo83051g(cls)).f154073p;
        C12490l0 l0Var = this.f170247p0;
        if (l0Var != null) {
            l0Var.mo12140Z0();
        }
    }

    /* renamed from: p */
    public final void mo84610p() {
        String valueOf;
        Class cls = C54108o.class;
        ((C54108o) C86312j.m106911c(cls)).getClass();
        C54067f0 f0Var = C54108o.f151869h;
        if (f0Var.f151452d0) {
            valueOf = String.valueOf(4);
            ((C54108o) C86312j.m106911c(cls)).getClass();
            f0Var.f151452d0 = false;
        } else {
            valueOf = ((C61130g) C86312j.m106911c(C61130g.class)).mo33248vG() ? String.valueOf(5) : String.valueOf(3);
        }
        String str = valueOf;
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_ACTION_MINIMIZE, str, (String) null, 4, (Object) null);
    }

    /* renamed from: q */
    public final <T extends C62660c> T mo84611q(C32224a<? extends T> aVar) {
        try {
            return (C62660c) aVar.invoke();
        } catch (Throwable th) {
            Log.m105921e(this.f170243j, "safetyInflate exception", th);
            C62042e eVar = C62042e.f176370a;
            eVar.mo87120u("onSelected exception msg: " + th.getMessage());
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [j50.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r4 = r4.f172989A;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84612r() {
        /*
            r8 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            vk1.b r1 = r8.f166842f
            if (r1 == 0) goto L_0x017e
            java.lang.String r2 = r8.f170243j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "stopLiveVideo,float mode:"
            r3.append(r4)
            j50.a r4 = r8.f166844h
            r5 = 0
            if (r4 == 0) goto L_0x0025
            d50.i r4 = r4.f172989A
            if (r4 == 0) goto L_0x0025
            boolean r4 = r4.mo82881c()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x0026
        L_0x0025:
            r4 = r5
        L_0x0026:
            r3.append(r4)
            java.lang.String r4 = ", normal mode:"
            r3.append(r4)
            j50.a r4 = r8.f166844h
            if (r4 == 0) goto L_0x003f
            d50.i r4 = r4.f172989A
            if (r4 == 0) goto L_0x003f
            boolean r4 = r4.mo82886h()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x0040
        L_0x003f:
            r4 = r5
        L_0x0040:
            r3.append(r4)
            java.lang.String r4 = ",manual closed:"
            r3.append(r4)
            boolean r4 = r1.isManualClosed()
            r3.append(r4)
            java.lang.String r4 = ", needMiniWindow:"
            r3.append(r4)
            androidx.lifecycle.i0 r4 = r8.mo83051g(r0)
            cl1.o r4 = (cl1.C54991o) r4
            boolean r4 = r4.f154350p0
            r3.append(r4)
            java.lang.String r4 = ", start:"
            r3.append(r4)
            boolean r4 = r1.isLiveStarted()
            r3.append(r4)
            java.lang.String r4 = ",finish:"
            r3.append(r4)
            vk1.b r4 = r8.f166842f
            if (r4 == 0) goto L_0x007d
            boolean r4 = r4.isLiveFinished()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x007e
        L_0x007d:
            r4 = r5
        L_0x007e:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            boolean r2 = r1.isManualClosed()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x015a
            boolean r2 = r1.isLiveStarted()
            if (r2 == 0) goto L_0x015a
            boolean r2 = r1.isLiveFinished()
            if (r2 != 0) goto L_0x015a
            j50.a r2 = r8.f166844h
            if (r2 == 0) goto L_0x00ac
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x00ac
            boolean r2 = r2.mo82886h()
            if (r2 != r3) goto L_0x00ac
            r2 = 1
            goto L_0x00ad
        L_0x00ac:
            r2 = 0
        L_0x00ad:
            if (r2 == 0) goto L_0x017e
            boolean r1 = r1.needMiniWindow()
            if (r1 == 0) goto L_0x017e
            androidx.lifecycle.i0 r0 = r8.mo83051g(r0)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = o40.C61926c.m72696u(r0, r1)
            if (r0 != 0) goto L_0x017e
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            vk1.b r1 = r8.f166842f
            if (r1 == 0) goto L_0x00d3
            boolean r1 = r1.needRemoveActivity()
            goto L_0x00d4
        L_0x00d3:
            r1 = 0
        L_0x00d4:
            java.lang.String r2 = "PARAM_FINDER_LIVE_FORCE_TASK"
            r0.putBoolean(r2, r1)
            vk1.b r1 = r8.f166842f
            if (r1 == 0) goto L_0x00e5
            boolean r1 = r1.isSwipeBack()
            if (r1 != r3) goto L_0x00e5
            r1 = 1
            goto L_0x00e6
        L_0x00e5:
            r1 = 0
        L_0x00e6:
            if (r1 == 0) goto L_0x00ea
            r1 = 1
            goto L_0x00eb
        L_0x00ea:
            r1 = 3
        L_0x00eb:
            java.lang.String r2 = "PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE"
            r0.putInt(r2, r1)
            r1 = 13
            java.lang.String r2 = "PARAM_LIVE_MINI_WINDOW_OP_TYPE"
            r0.putInt(r2, r1)
            java.lang.Class<aw.d> r1 = p447aw.C103918d.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            aw.d r1 = (p447aw.C103918d) r1
            androidx.appcompat.app.AppCompatActivity r2 = r8.f166841e
            r6 = 21
            boolean r1 = r1.mo125776TW(r2, r6)
            if (r1 != 0) goto L_0x0145
            java.lang.String r0 = r8.f170243j
            java.lang.String r1 = "showVideoTalking, permission denied"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            vk1.b r0 = r8.f166842f
            if (r0 != 0) goto L_0x0116
            goto L_0x0119
        L_0x0116:
            r0.setMiniWinPermission(r3)
        L_0x0119:
            vk1.b r0 = r8.f166842f
            if (r0 == 0) goto L_0x0123
            d60.b$b r1 = d60.C58124b.C58125b.MINI_WINDOW_PERMISSION
            r2 = 2
            d60.C58124b.C7172a.m7372a(r0, r1, r5, r2, r5)
        L_0x0123:
            java.lang.Class<aw.c> r0 = p447aw.C54369c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            aw.c r1 = (p447aw.C54369c) r1
            androidx.appcompat.app.AppCompatActivity r2 = r8.f166841e
            r3 = 21
            r0 = 2131832150(0x7f112d56, float:1.9297346E38)
            java.lang.String r4 = r2.getString(r0)
            gl1.z1 r5 = new gl1.z1
            r5.<init>(r8)
            r6 = 0
            java.lang.String r7 = vc3.C78382a.m94650b()
            r1.ff0(r2, r3, r4, r5, r6, r7)
            goto L_0x017e
        L_0x0145:
            vk1.b r1 = r8.f166842f
            if (r1 != 0) goto L_0x014a
            goto L_0x014d
        L_0x014a:
            r1.setMiniWinPermission(r4)
        L_0x014d:
            vk1.b r1 = r8.f166842f
            if (r1 == 0) goto L_0x0156
            d60.b$b r2 = d60.C58124b.C58125b.MINI_WINDOW
            r1.statusChange(r2, r0)
        L_0x0156:
            r8.mo84610p()
            goto L_0x017e
        L_0x015a:
            j50.a r0 = r8.f166844h
            if (r0 == 0) goto L_0x0169
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0169
            boolean r0 = r0.mo82886h()
            if (r0 != r3) goto L_0x0169
            goto L_0x016a
        L_0x0169:
            r3 = 0
        L_0x016a:
            if (r3 == 0) goto L_0x017e
            j50.a r0 = r8.f166844h
            boolean r1 = r0 instanceof i50.C60251a
            if (r1 == 0) goto L_0x017e
            boolean r1 = r0 instanceof i50.C60251a
            if (r1 == 0) goto L_0x0179
            r5 = r0
            i50.a r5 = (i50.C60251a) r5
        L_0x0179:
            if (r5 == 0) goto L_0x017e
            r5.mo87271L0()
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl1.C59559k.mo84612r():void");
    }
}
