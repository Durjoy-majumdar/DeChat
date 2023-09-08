package fl1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54099m0;
import ak1.C54108o;
import al1.C54126g;
import al1.C54129i;
import al1.C54130j;
import al1.C54131l;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import b50.C54408d;
import bd1.C54446b;
import bl3.C39818r;
import c30.C26827e;
import c50.C54655b;
import ci1.C39952a;
import cj1.C0580o3;
import cj1.C0583p3;
import cj1.C0587q3;
import cj1.C0596s3;
import cj1.C0621t3;
import cj1.C0639y1;
import cj1.C28589s5;
import cj1.C54733a1;
import cj1.C54795n5;
import cj1.C54807r3;
import cl1.C0668l;
import cl1.C54946b0;
import cl1.C54963d0;
import cl1.C54979h1;
import cl1.C54985m;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveApplyLinkView;
import com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58110d;
import d50.C58113g;
import d50.C58114h;
import d60.C58124b;
import dh1.C58264a;
import di3.C7335d;
import di3.C86312j;
import dj1.C45341a;
import dj1.C45343b;
import dj1.C45350e;
import dj1.C45360g;
import dj1.C45364h;
import dj1.C45384r;
import dj1.C45391t;
import dj1.C45401y;
import eb0.C31543z5;
import er1.C58704c5;
import er1.C58713e5;
import er1.C58728f5;
import er1.C58739j4;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32230s;
import fy3.C32232u;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hq1.C60085d;
import ht1.C8777j5;
import ii1.C60291e;
import ij1.C60299b;
import il1.C46272x0;
import il1.C46275z0;
import il1.C60535v0;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import k50.C60971a;
import kotlin.ResultKt;
import m50.C61440d;
import n50.C61620c;
import nj3.C76912y0;
import nk1.C61791o;
import np1.C61817a;
import np1.C61882w;
import o40.C11348f;
import o40.C61926c;
import o40.C61937h;
import ob0.C89132b;
import ok1.C62042e;
import org.json.JSONObject;
import p185kq.C10383h;
import p185kq.C61130g;
import p40.C62192a;
import pe3.C89349b;
import qg1.C47826f;
import qg1.C47836x;
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
import qj1.C12482k1;
import qj1.C12490l0;
import qj1.C12503ld;
import qj1.C12522mf;
import qj1.C12611q7;
import qj1.C12625qe;
import qj1.C12632r2;
import qj1.C12657s2;
import qj1.C12690u1;
import qj1.C12693u2;
import qj1.C12703v1;
import qj1.C12707vb;
import qj1.C12733x3;
import qj1.C12765z2;
import qj1.C62627a3;
import qj1.C62631a4;
import qj1.C62632a6;
import qj1.C62638b0;
import qj1.C62642b3;
import qj1.C62660c;
import qj1.C62696d3;
import qj1.C62712dd;
import qj1.C62758ea;
import qj1.C62799h2;
import qj1.C62804h6;
import qj1.C62815i3;
import qj1.C62833je;
import qj1.C62861l1;
import qj1.C62868l6;
import qj1.C62877m3;
import qj1.C62889n0;
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
import qj1.C63068w1;
import qj1.C63081w3;
import qj1.C63100x2;
import qj1.C63108xd;
import qj1.C63111xe;
import qj1.C63118y3;
import qj1.C63129yc;
import qj1.C63151z0;
import qj1.C63155z3;
import qs1.C63325a;
import rl1.C13022d0;
import rx3.C13598b0;
import rx3.C13604l;
import sl1.C64039c;
import sx3.C110818d0;
import te3.C48779ay0;
import te3.C49199dx0;
import te3.C49291ej0;
import te3.C49430fj0;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C49778i01;
import te3.C49991jh0;
import te3.C50008jm0;
import te3.C50041jv0;
import te3.C50262lh0;
import te3.C50639o61;
import te3.C50820pf0;
import te3.C51532ue0;
import te3.C51601uv;
import te3.C51727vr0;
import te3.C51828wg0;
import te3.C52005xq0;
import te3.C52009xr0;
import te3.C52158yr0;
import te3.C52316zw0;
import te3.C64273c21;
import te3.C64337e61;
import te3.C64756up2;
import te3.C64760uw0;
import te3.C64889zo2;
import tf0.C64916p1;
import tl1.C13969d;
import ug1.C65348b;
import up1.C65426w0;
import vi1.C52931n;
import vk1.C65760a;
import wg1.C66093v1;
import wx3.C15601d;
import wx3.C66212f;
import xk1.C15718c2;
import xk1.C66297d2;
import xs1.C15883o;
import xs1.C66420d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66783a;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: fl1.f */
public final class C59161f extends C58264a {

    /* renamed from: A */
    public C62924pe f169186A;

    /* renamed from: B */
    public C12522mf f169187B;

    /* renamed from: C */
    public C12690u1 f169188C;

    /* renamed from: D */
    public C62889n0 f169189D;

    /* renamed from: E */
    public C62949r8 f169190E;

    /* renamed from: F */
    public C64039c f169191F;

    /* renamed from: G */
    public C13969d f169192G;

    /* renamed from: H */
    public C66420d f169193H;

    /* renamed from: I */
    public C15883o f169194I;

    /* renamed from: J */
    public C12238a0 f169195J;

    /* renamed from: K */
    public C62638b0 f169196K;

    /* renamed from: L */
    public C12611q7 f169197L;

    /* renamed from: M */
    public C63006u7 f169198M;

    /* renamed from: N */
    public C62799h2 f169199N;

    /* renamed from: P */
    public FinderLiveRandomMatchLinkMicStatePlugin f169200P;

    /* renamed from: Q */
    public C63068w1 f169201Q;

    /* renamed from: Q0 */
    public C63118y3 f169202Q0;

    /* renamed from: R */
    public C12490l0 f169203R;

    /* renamed from: R0 */
    public C12256bd f169204R0;

    /* renamed from: S */
    public C62758ea f169205S;

    /* renamed from: S0 */
    public C12377f1 f169206S0;

    /* renamed from: T */
    public C60291e f169207T;

    /* renamed from: T0 */
    public C12482k1 f169208T0;

    /* renamed from: U */
    public C63111xe f169209U;

    /* renamed from: U0 */
    public C12632r2 f169210U0;

    /* renamed from: V */
    public C63081w3 f169211V;

    /* renamed from: V0 */
    public C62804h6 f169212V0;

    /* renamed from: W */
    public C62987t2 f169213W;

    /* renamed from: W0 */
    public C12282d7 f169214W0;

    /* renamed from: X */
    public C62911o3 f169215X;

    /* renamed from: X0 */
    public C12693u2 f169216X0;

    /* renamed from: Y */
    public C62921p3 f169217Y;

    /* renamed from: Y0 */
    public C63100x2 f169218Y0;

    /* renamed from: Z */
    public C12657s2 f169219Z;

    /* renamed from: Z0 */
    public C62861l1 f169220Z0;

    /* renamed from: a1 */
    public C63108xd f169221a1;

    /* renamed from: b1 */
    public C63129yc f169222b1;

    /* renamed from: c1 */
    public C12503ld f169223c1;

    /* renamed from: d1 */
    public int f169224d1;

    /* renamed from: e1 */
    public LinearLayout f169225e1;

    /* renamed from: f1 */
    public MTimerHandler f169226f1 = new MTimerHandler("LiveCommonInfoPlugin::Timer", (MTimerHandler.CallBack) new C59186v(this), true);

    /* renamed from: g1 */
    public JSONObject f169227g1;

    /* renamed from: i */
    public final String f169228i = "FinderLiveAnchorStartUIC";

    /* renamed from: j */
    public FinderLiveAnchorExceptionPlugin f169229j;

    /* renamed from: n */
    public C62815i3 f169230n;

    /* renamed from: o */
    public C62833je f169231o;

    /* renamed from: p */
    public C12399ff f169232p;

    /* renamed from: p0 */
    public C12765z2 f169233p0;

    /* renamed from: q */
    public C62632a6 f169234q;

    /* renamed from: r */
    public C62905o2 f169235r;

    /* renamed from: s */
    public C60085d f169236s;

    /* renamed from: t */
    public C12322e5 f169237t;

    /* renamed from: u */
    public C62976sd f169238u;

    /* renamed from: v */
    public C63151z0 f169239v;

    /* renamed from: w */
    public C12389fa f169240w;

    /* renamed from: x */
    public C12707vb f169241x;

    /* renamed from: x0 */
    public C62627a3 f169242x0;

    /* renamed from: y */
    public C63049v9 f169243y;

    /* renamed from: y0 */
    public C62696d3 f169244y0;

    /* renamed from: z */
    public C62712dd f169245z;

    /* renamed from: fl1.f$e */
    public static final class C32064e extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59161f f85313d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32064e(C59161f fVar) {
            super(1);
            this.f85313d = fVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                AppCompatActivity appCompatActivity = this.f85313d.f166836e;
                C76912y0.makeText((Context) appCompatActivity, (CharSequence) appCompatActivity.getString(C0966R.string.dr6), 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fl1.f$l */
    public static final class C32065l extends C87413o implements C32230s<Boolean, Integer, Integer, String, C50262lh0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59161f f85314d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32065l(C59161f fVar) {
            super(5);
            this.f85314d = fVar;
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).intValue();
            ((Number) obj3).intValue();
            C50262lh0 lh02 = (C50262lh0) obj5;
            C87412m.m108594g((String) obj4, "errMsg");
            String str = this.f85314d.f169228i;
            Log.m105924i(str, "close live result:" + booleanValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fl1.f$o */
    public static final class C32066o extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59161f f85315d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32066o(C59161f fVar) {
            super(1);
            this.f85315d = fVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                AppCompatActivity appCompatActivity = this.f85315d.f166836e;
                C76912y0.makeText((Context) appCompatActivity, (CharSequence) appCompatActivity.getString(C0966R.string.dr6), 0).show();
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C54067f0 f0Var = C54108o.f151869h;
                ((C54108o) c).Kx0(14, (String) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fl1.f$a */
    public static final class C59162a implements C47836x.C47837a {

        /* renamed from: a */
        public final /* synthetic */ C59161f f169246a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f169247b;

        public C59162a(C59161f fVar, C32226l<? super Boolean, C13598b0> lVar) {
            this.f169246a = fVar;
            this.f169247b = lVar;
        }

        /* renamed from: a */
        public void mo72580a(int i, int i2, String str, C50639o61 o612) {
            C87412m.m108594g(o612, "resp");
            String str2 = this.f169246a.f169228i;
            Log.m105924i(str2, "cancel random match: errType=" + i + ", errCode=" + i2 + ", errMsg=" + str);
            if (i == 0 && i2 == 0) {
                C59161f.m69117n(this.f169246a);
                C32226l<Boolean, C13598b0> lVar = this.f169247b;
                if (lVar != null) {
                    lVar.invoke(Boolean.TRUE);
                    return;
                }
                return;
            }
            ((C54963d0) this.f169246a.mo83051g(C54963d0.class)).f154078u = 0;
            FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin = this.f169246a.f169200P;
            if (finderLiveRandomMatchLinkMicStatePlugin != null) {
                finderLiveRandomMatchLinkMicStatePlugin.mo3220a1();
            }
            long j = ((C55001u) this.f169246a.mo83051g(C55001u.class)).f154420q.f182392d;
            Log.m105924i("FinderLiveMicWatcher", "onCloseRandomMatchMicFail errCode: " + i2 + " errType: " + i + " liveId: " + j);
            C11348f.C11349a.m11178b(C59319a.f169618b, "micpk_anchorCloseRandomMatchMicFail", false, (C11348f.C11352b) null, false, false, new C0621t3(i2, i, j), 28, (Object) null);
            C32226l<Boolean, C13598b0> lVar2 = this.f169247b;
            if (lVar2 != null) {
                lVar2.invoke(Boolean.FALSE);
            }
        }
    }

    /* renamed from: fl1.f$b */
    public static final class C59163b extends C87413o implements C32226l<C89132b.C89134c<C50008jm0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59161f f169248d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59163b(C59161f fVar) {
            super(1);
            this.f169248d = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
            if (r8.f182392d == 0) goto L_0x0058;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r8) {
            /*
                r7 = this;
                ob0.b$c r8 = (ob0.C89132b.C89134c) r8
                java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                java.lang.String r1 = "result"
                gy3.C87412m.m108594g(r8, r1)
                int r1 = r8.f256793a
                if (r1 != 0) goto L_0x0011
                int r2 = r8.f256794b
                if (r2 == 0) goto L_0x001b
            L_0x0011:
                er1.j4 r2 = er1.C58739j4.f168176a
                int r3 = r8.f256794b
                boolean r1 = r2.mo83681J(r1, r3)
                if (r1 == 0) goto L_0x00a6
            L_0x001b:
                T r8 = r8.f256796d
                te3.jm0 r8 = (te3.C50008jm0) r8
                com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f136184e
                if (r8 == 0) goto L_0x00a6
                fl1.f r1 = r7.f169248d
                androidx.lifecycle.i0 r2 = r1.mo83051g(r0)
                cl1.o r2 = (cl1.C54991o) r2
                r2.mo76026x4(r8)
                androidx.lifecycle.i0 r8 = r1.mo83051g(r0)
                cl1.o r8 = (cl1.C54991o) r8
                com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f154341n
                r2 = 0
                if (r8 == 0) goto L_0x003c
                te3.c21 r8 = r8.liveInfo
                goto L_0x003d
            L_0x003c:
                r8 = r2
            L_0x003d:
                if (r8 == 0) goto L_0x0058
                androidx.lifecycle.i0 r8 = r1.mo83051g(r0)
                cl1.o r8 = (cl1.C54991o) r8
                com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f154341n
                if (r8 == 0) goto L_0x004c
                te3.c21 r8 = r8.liveInfo
                goto L_0x004d
            L_0x004c:
                r8 = r2
            L_0x004d:
                gy3.C87412m.m108591d(r8)
                long r3 = r8.f182392d
                r5 = 0
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 != 0) goto L_0x006f
            L_0x0058:
                androidx.lifecycle.i0 r8 = r1.mo83051g(r0)
                cl1.o r8 = (cl1.C54991o) r8
                com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f154341n
                if (r8 != 0) goto L_0x0063
                goto L_0x006f
            L_0x0063:
                java.lang.Class<cl1.u> r3 = cl1.C55001u.class
                androidx.lifecycle.i0 r3 = r1.mo83051g(r3)
                cl1.u r3 = (cl1.C55001u) r3
                te3.c21 r3 = r3.f154420q
                r8.liveInfo = r3
            L_0x006f:
                qj1.ff r8 = r1.f169232p
                r3 = 0
                if (r8 == 0) goto L_0x0078
                r4 = 3
                qj1.C12399ff.m11974v1(r8, r2, r3, r4, r2)
            L_0x0078:
                qj1.ff r8 = r1.f169232p
                if (r8 == 0) goto L_0x007f
                r8.mo12093s1()
            L_0x007f:
                androidx.lifecycle.i0 r8 = r1.mo83051g(r0)
                cl1.o r8 = (cl1.C54991o) r8
                com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f154341n
                r4 = 1
                if (r8 == 0) goto L_0x0093
                te3.c21 r8 = r8.liveInfo
                if (r8 == 0) goto L_0x0093
                int r8 = r8.f182410x
                if (r8 != r4) goto L_0x0093
                goto L_0x0094
            L_0x0093:
                r4 = 0
            L_0x0094:
                if (r4 == 0) goto L_0x00a6
                vk1.a r8 = r1.f166837f
                if (r8 == 0) goto L_0x00a6
                androidx.lifecycle.i0 r0 = r1.mo83051g(r0)
                cl1.o r0 = (cl1.C54991o) r0
                java.lang.String r0 = r0.f154345o
                r1 = 2
                com.tencent.p014mm.plugin.finder.live.view.C56032b.fillBlurBg$default(r8, r0, r3, r1, r2)
            L_0x00a6:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fl1.C59161f.C59163b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.anchor.FinderLiveAnchorLivingUIC$createLiveWhenSecurityDataReady$1$1", mo125469f = "FinderLiveAnchorLivingUIC.kt", mo125470l = {1495}, mo125471m = "invokeSuspend")
    /* renamed from: fl1.f$c */
    public static final class C59164c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f169249d;

        /* renamed from: e */
        public final /* synthetic */ C45795b f169250e;

        /* renamed from: f */
        public final /* synthetic */ C59161f f169251f;

        /* renamed from: fl1.f$c$a */
        public static final class C59165a extends C87413o implements C32226l<byte[], C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59161f f169252d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59165a(C59161f fVar) {
                super(1);
                this.f169252d = fVar;
            }

            public Object invoke(Object obj) {
                byte[] bArr = (byte[]) obj;
                C59161f fVar = this.f169252d;
                C54795n5 k = fVar.mo83042k();
                if (k != null) {
                    k.mo75720X(new C59201k(fVar));
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59164c(C45795b bVar, C59161f fVar, C15601d<? super C59164c> dVar) {
            super(2, dVar);
            this.f169250e = bVar;
            this.f169251f = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59164c(this.f169250e, this.f169251f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59164c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f169249d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C62042e eVar = C62042e.f176370a;
                C45795b bVar = this.f169250e;
                C59165a aVar2 = new C59165a(this.f169251f);
                this.f169249d = 1;
                if (eVar.mo87107p1(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fl1.f$d */
    public static final class C59166d extends C87413o implements C32232u<Boolean, Integer, Integer, String, C58113g, TRTCCloudDef.TRTCParams, C52005xq0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59161f f169253d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59166d(C59161f fVar) {
            super(7);
            this.f169253d = fVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            C65760a aVar;
            C54795n5 k;
            int i;
            long j;
            C63325a aVar2;
            C58114h hVar;
            C58113g gVar;
            C58114h hVar2;
            C58113g gVar2;
            C64273c21 c212;
            LinkedList<C51601uv> linkedList;
            LinkedList<C51601uv> linkedList2;
            LinkedList<C51601uv> linkedList3;
            LinkedList<C51601uv> linkedList4;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int intValue = ((Number) obj2).intValue();
            int intValue2 = ((Number) obj3).intValue();
            String str = (String) obj4;
            C58113g gVar3 = (C58113g) obj5;
            TRTCCloudDef.TRTCParams tRTCParams = (TRTCCloudDef.TRTCParams) obj6;
            C52005xq0 xq02 = (C52005xq0) obj7;
            C87412m.m108594g(str, "errMsg");
            C87412m.m108594g(gVar3, "liveRoomInfo");
            C87412m.m108594g(tRTCParams, "trtcParams");
            C87412m.m108594g(xq02, "resp");
            boolean z = ((C54946b0) this.f169253d.mo83051g(C54946b0.class)).f153983g;
            String str2 = this.f169253d.f169228i;
            StringBuilder sb = new StringBuilder();
            sb.append("joinLive success:");
            sb.append(booleanValue);
            sb.append(", errCode:");
            sb.append(intValue);
            sb.append(" isDestroyed:");
            C65760a aVar3 = this.f169253d.f166837f;
            sb.append(aVar3 != null ? Boolean.valueOf(aVar3.isDestroyed()) : null);
            sb.append(" cliBuff:");
            sb.append(xq02.f144868w);
            sb.append(", isVerifying:");
            sb.append(z);
            Log.m105924i(str2, sb.toString());
            C65760a aVar4 = this.f169253d.f166837f;
            if (!(aVar4 != null && aVar4.isDestroyed()) || z) {
                C59161f fVar = this.f169253d;
                fVar.getClass();
                Class cls = C54108o.class;
                Class cls2 = C54991o.class;
                Class cls3 = C55001u.class;
                if (booleanValue) {
                    int netType = NetStatusUtil.getNetType(MMApplicationContext.getContext());
                    if (!(netType == 0 || netType == -1)) {
                        C61926c.m72668M(new C32068h(fVar));
                    }
                    String str3 = ((C54991o) fVar.mo83051g(cls2)).f154345o;
                    long j2 = ((C55001u) fVar.mo83051g(cls3)).f154420q.f182392d;
                    long j3 = ((C55001u) fVar.mo83051g(cls3)).f154416j;
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C54067f0 f0Var = C54108o.f151869h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    f0Var.f151426H = str3;
                    f0Var.f151427I = C61926c.m72691p(j2);
                    f0Var.f151428J = C61926c.m72691p(j3);
                    ((C119157j) C119157j.f356862d).mo183876g(new C28589s5(((C55001u) fVar.mo83051g(cls3)).f154420q.f182392d), "Finder.LiveExceptionMonitor");
                    Class cls4 = C54979h1.class;
                    C62042e eVar = C62042e.f176370a;
                    if (eVar.mo87027N0()) {
                        boolean z2 = xq02.f144806C != 1;
                        boolean z3 = ((C54979h1) fVar.mo83051g(cls4)).f154134f;
                        String str4 = fVar.f169228i;
                        Log.m105924i(str4, "handleJoinLiveWxshopResponse haveBindShop:" + z3 + ", shopping_not_available:" + xq02.f144806C + ", canShowShopEntrance:" + z2);
                        if (z2) {
                            if (!z3) {
                                ((C54979h1) fVar.mo83051g(cls4)).mo75943j3(true);
                                C7335d c = C86312j.m106911c(C64916p1.class);
                                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                                C64916p1.C64917a.m76437d((C64916p1) c, 14, (C32226l) null, 2, (Object) null);
                            }
                            if (fVar.f169186A == null) {
                                fVar.mo84390z(((C54979h1) fVar.mo83051g(cls4)).f154134f);
                            }
                        }
                    }
                    LinkedList linkedList5 = new LinkedList();
                    C64760uw0 uw02 = xq02.f144812I;
                    LinkedList<C51601uv> linkedList6 = uw02 != null ? uw02.f185795d : null;
                    if (!(linkedList6 == null || linkedList6.isEmpty())) {
                        String str5 = fVar.f169228i;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("handleCheerIconsInfo custom cheer info:");
                        C64760uw0 uw03 = xq02.f144812I;
                        sb4.append((uw03 == null || (linkedList4 = uw03.f185795d) == null) ? null : Integer.valueOf(linkedList4.size()));
                        Log.m105924i(str5, sb4.toString());
                        C64760uw0 uw04 = xq02.f144812I;
                        if (uw04 == null || (linkedList3 = uw04.f185795d) == null) {
                            i = 0;
                        } else {
                            linkedList5.addAll(linkedList3);
                            C64760uw0 uw05 = xq02.f144812I;
                            i = uw05 != null ? uw05.f185797f : 0;
                            ((C54991o) fVar.mo83051g(cls2)).f154278X1.f1589e = 0;
                        }
                        C64760uw0 uw06 = xq02.f144812I;
                        if (uw06 != null) {
                            ((C54991o) fVar.mo83051g(cls2)).f154283Y1 = new C54991o.C54992b(uw06.f185799h, uw06.f185800i);
                        }
                    } else {
                        C52158yr0 yr02 = xq02.f144871y;
                        LinkedList<C51601uv> linkedList7 = yr02 != null ? yr02.f145477d : null;
                        if (!(linkedList7 == null || linkedList7.isEmpty())) {
                            String str6 = fVar.f169228i;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("handleCheerIconsInfo custom ad cheer info:");
                            C52158yr0 yr03 = xq02.f144871y;
                            sb5.append((yr03 == null || (linkedList2 = yr03.f145477d) == null) ? null : Integer.valueOf(linkedList2.size()));
                            Log.m105924i(str6, sb5.toString());
                            C52158yr0 yr04 = xq02.f144871y;
                            if (!(yr04 == null || (linkedList = yr04.f145477d) == null)) {
                                linkedList5.addAll(linkedList);
                                ((C54991o) fVar.mo83051g(cls2)).f154278X1.f1589e = 1;
                                i = 1;
                            }
                        } else {
                            Log.m105924i(fVar.f169228i, "handleCheerIconsInfo skip, no custom cheer info.");
                        }
                        i = 0;
                    }
                    C54991o oVar = (C54991o) fVar.mo83051g(cls2);
                    C64760uw0 uw07 = xq02.f144812I;
                    oVar.mo75972M4(linkedList5, uw07 != null ? uw07.f185796e : null, i);
                    C54985m mVar = (C54985m) fVar.mo83051g(C54985m.class);
                    C64760uw0 uw08 = xq02.f144812I;
                    mVar.mo75950d3(new C54985m.C0671b(linkedList5, uw08 != null ? uw08.f185796e : null, i), uw08 != null ? uw08.f185798g : null);
                    C63049v9 v9Var = fVar.f169243y;
                    if (v9Var != null) {
                        v9Var.mo87991f1(((C54991o) fVar.mo83051g(cls2)).f154278X1.f1586b);
                    }
                    C12690u1 u1Var = fVar.f169188C;
                    if (u1Var != null) {
                        u1Var.mo12262a1(((C54991o) fVar.mo83051g(cls2)).f154278X1.f1587c);
                    }
                    ((C13022d0) fVar.mo83051g(C13022d0.class)).mo12538d3(false);
                    ((C54991o) fVar.mo83051g(cls2)).f154376v2.f513a.clear();
                    ((C54991o) fVar.mo83051g(cls2)).f154376v2.f513a.addAll(xq02.f144869x);
                    ((C54991o) fVar.mo83051g(cls2)).f154376v2.f514b = xq02.f144868w;
                    ((C54991o) fVar.mo83051g(cls2)).mo76022t4(true);
                    if (((C55001u) fVar.mo83051g(cls3)).f154421r == null) {
                        ((C55001u) fVar.mo83051g(cls3)).mo76043n3(new C58114h(tRTCParams, gVar3, new C58110d("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI")));
                    } else {
                        C58114h hVar3 = ((C55001u) fVar.mo83051g(cls3)).f154421r;
                        if (hVar3 != null) {
                            hVar3.f166250a = tRTCParams;
                        }
                        C58114h hVar4 = ((C55001u) fVar.mo83051g(cls3)).f154421r;
                        if (hVar4 != null) {
                            hVar4.f166251b = gVar3;
                        }
                        C58114h hVar5 = ((C55001u) fVar.mo83051g(cls3)).f154421r;
                        if (hVar5 != null) {
                            hVar5.f166252c = new C58110d("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI");
                        }
                    }
                    C58114h hVar6 = ((C55001u) fVar.mo83051g(cls3)).f154421r;
                    if (hVar6 != null) {
                        C54655b bVar = fVar.f166839h;
                        if (bVar != null) {
                            C54408d.C54409a.m61122b(bVar, hVar6, false, C32444a.f86172m2.mo60266n().intValue() == 0, 2, (Object) null);
                        }
                        C58704c5.m68184a(C58704c5.f168044a, C58713e5.f168097y.f168101b, (C89349b) null, false, false, 14, (Object) null);
                        eVar.mo87038R1(fVar.f166839h);
                        C54655b bVar2 = fVar.f166839h;
                        if (bVar2 != null) {
                            bVar2.mo75218i(new C59206m(fVar, xq02));
                        }
                    }
                    C65760a aVar5 = fVar.f166837f;
                    if (aVar5 != null) {
                        eVar.mo87124v1(fVar.f166851d, aVar5);
                    }
                    Class cls5 = C10383h.class;
                    C45795b bVar3 = C45795b.f123698n;
                    long j4 = -1;
                    if (bVar3 == null || (c212 = ((C55001u) bVar3.mo71262a(cls3)).f154420q) == null) {
                        C54655b bVar4 = fVar.f166839h;
                        j = (bVar4 == null || (hVar2 = bVar4.f173042z) == null || (gVar2 = hVar2.f166251b) == null) ? -1 : gVar2.f166232b;
                    } else {
                        j = c212.f182392d;
                    }
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C54099m0 m0Var = f0Var.f151443Y;
                    String XQ = ((C10383h) C86312j.m106911c(cls5)).mo10700XQ(j);
                    C87412m.m108593f(XQ, "getService(IHellHoundUti…ng2UnsignedString(liveId)");
                    m0Var.getClass();
                    m0Var.f151824a = XQ;
                    C45795b bVar5 = C45795b.f123698n;
                    long j5 = ((C55001u) (bVar5 != null ? bVar5.mo71262a(cls3) : fVar.mo83051g(cls3))).f154416j;
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C54099m0 m0Var2 = f0Var.f151443Y;
                    String XQ2 = ((C10383h) C86312j.m106911c(cls5)).mo10700XQ(j5);
                    C87412m.m108593f(XQ2, "getService(IHellHoundUti…ng2UnsignedString(feedId)");
                    m0Var2.getClass();
                    m0Var2.f151825b = XQ2;
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    f0Var.f151443Y.f151827d = System.currentTimeMillis();
                    C54446b c2 = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
                    int i2 = c2 != null ? c2.mo75251m2().f132484A : 0;
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    f0Var.f151443Y.f151829f = (long) i2;
                    JSONObject jSONObject = new JSONObject();
                    C54655b bVar6 = fVar.f166839h;
                    if (!(bVar6 == null || (hVar = bVar6.f173042z) == null || (gVar = hVar.f166251b) == null)) {
                        j4 = gVar.f166232b;
                    }
                    jSONObject.put("liveid", j4);
                    jSONObject.put("feedid", ((C10383h) C86312j.m106911c(cls5)).mo10700XQ(((C55001u) fVar.mo83051g(cls3)).f154416j));
                    C7335d c3 = C86312j.m106911c(cls);
                    C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8600a((C8777j5) c3, 12, jSONObject.toString(), (String) null, 4, (Object) null);
                    ((C54108o) C86312j.m106911c(cls)).Gx0(C54067f0.C54077p.LIVE_EXIT_OK);
                    C58728f5 f5Var = C58728f5.f168144a;
                    C58728f5.f168147d = C31543z5.m39451a();
                    C54108o oVar2 = (C54108o) C86312j.m106911c(cls);
                    String valueOf = String.valueOf(((C55001u) fVar.mo83051g(cls3)).f154420q.f182392d);
                    long j6 = ((C54991o) fVar.mo83051g(cls2)).f154301c3 ? 4 : 1;
                    C58969q b = C58961d.f168673a.mo84155b(((C54991o) fVar.mo83051g(cls2)).f154345o);
                    oVar2.Vx0(valueOf, j6, b != null ? b.getNickname() : null, true);
                    C61926c.m72666K(200, new C59211n(fVar));
                    C65760a aVar6 = fVar.f166837f;
                    if (aVar6 != null) {
                        C64273c21 c213 = xq02.f144846f;
                        aVar6.processFinderLiveLayerShowInfo(c213 != null ? c213.f182360F : null);
                    }
                    ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.MORE, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
                    C65760a aVar7 = fVar.f166837f;
                    if (!(aVar7 == null || (aVar2 = (C63325a) aVar7.business(C63325a.class)) == null)) {
                        aVar2.mo88229f3(new C59188g(fVar));
                    }
                    C12490l0 l0Var = fVar.f169203R;
                    if (l0Var != null) {
                        l0Var.mo12143c1();
                    }
                    C54991o oVar3 = (C54991o) fVar.mo83051g(cls2);
                    C51828wg0 wg02 = xq02.f144807D;
                    oVar3.f154377v3 = wg02 != null ? wg02.f144033e : null;
                } else {
                    C58704c5 c5Var = C58704c5.f168044a;
                    String str7 = C58713e5.f168096x.f168101b;
                    C58739j4 j4Var = C58739j4.f168176a;
                    C64889zo2 zo22 = new C64889zo2();
                    zo22.f186779e = intValue;
                    zo22.f186780f = str;
                    C13598b0 b0Var = C13598b0.f38549a;
                    C58704c5.m68184a(c5Var, str7, j4Var.mo83710g0(zo22), false, true, 4, (Object) null);
                    if (!(intValue == -100038 || (k = fVar.mo83042k()) == null)) {
                        C54795n5.C54796a.m61723a(k, 0, new C32071o(fVar), 1, (Object) null);
                    }
                    C48779ay0 ay02 = xq02.f144808E;
                    int i3 = intValue;
                    C59161f.m69118y(fVar, intValue2, i3, str, (C49291ej0) null, ay02, 8, (Object) null);
                    C58728f5.m68215a(C58728f5.f168144a, "joinLive", i3, intValue2, str, fVar.f166851d, (String) null, 32, (Object) null);
                }
                C59161f fVar2 = this.f169253d;
                fVar2.getClass();
                C61926c.m72668M(new C59214n2(fVar2));
                if (((Boolean) C32444a.f86183p1.mo60266n()).booleanValue() && (aVar = this.f169253d.f166837f) != null) {
                    aVar.postDelayed(C32062b2.f85311d, 3000);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fl1.f$f */
    public static final class C59167f implements C45350e.C45351a {

        /* renamed from: a */
        public final /* synthetic */ C59161f f169254a;

        /* renamed from: b */
        public final /* synthetic */ C49765hx0 f169255b;

        public C59167f(C59161f fVar, C49765hx0 hx02) {
            this.f169254a = fVar;
            this.f169255b = hx02;
        }

        /* renamed from: a */
        public void mo70887a(int i, int i2, String str, C50820pf0 pf02) {
            C87412m.m108594g(pf02, "resp");
            this.f169254a.mo84389x(i, i2, str, pf02, this.f169255b, false);
        }
    }

    /* renamed from: fl1.f$g */
    public static final class C59168g implements C45343b.C45344a {

        /* renamed from: a */
        public final /* synthetic */ C59161f f169256a;

        public C59168g(C59161f fVar) {
            this.f169256a = fVar;
        }

        /* renamed from: a */
        public void mo70885a(int i, int i2, String str, C51532ue0 ue02) {
            C87412m.m108594g(ue02, "resp");
            this.f169256a.mo84388w(i, i2, str, ue02, false);
        }
    }

    /* renamed from: fl1.f$h */
    public static final class C59169h extends C87413o implements C32226l<C54130j, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C54130j f169257d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59169h(C54130j jVar) {
            super(1);
            this.f169257d = jVar;
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(Util.isEqual(((C54130j) obj).f151997a, this.f169257d.f151997a));
        }
    }

    /* renamed from: fl1.f$i */
    public static final class C59170i implements C45391t.C45392a {

        /* renamed from: a */
        public final /* synthetic */ C59161f f169258a;

        /* renamed from: b */
        public final /* synthetic */ C49765hx0 f169259b;

        public C59170i(C59161f fVar, C49765hx0 hx02) {
            this.f169258a = fVar;
            this.f169259b = hx02;
        }

        /* renamed from: a */
        public void mo70899a(int i, int i2, String str, C50041jv0 jv02) {
            int i3 = i;
            int i4 = i2;
            String str2 = str;
            C50041jv0 jv03 = jv02;
            C87412m.m108594g(jv03, "resp");
            String str3 = this.f169258a.f169228i;
            Log.m105924i(str3, "[Battle] apply battle. errType:" + i3 + ' ' + i4 + ' ' + str2);
            C59161f fVar = this.f169258a;
            C49765hx0 hx02 = this.f169259b;
            C0073g0 g0Var = C0073g0.ANCHOR_BATTLE;
            Class cls = C54108o.class;
            boolean z = true;
            String str4 = null;
            if (i3 == 0 && i4 == 0) {
                String str5 = fVar.f169228i;
                StringBuilder sb = new StringBuilder();
                sb.append("[Battle] apply battle success. toContact:[");
                FinderContact finderContact = hx02.f134919d;
                sb.append(finderContact != null ? finderContact.nickname : null);
                sb.append(']');
                Log.m105924i(str5, sb.toString());
                C54963d0 d0Var = (C54963d0) fVar.mo83051g(C54963d0.class);
                C54733a1 a1Var = new C54733a1(jv03.f136351f, 0, 0, 0, 0, (List) null, 46, (C8480h) null);
                List<C54126g> list = a1Var.f153393f;
                FinderContact finderContact2 = hx02.f134919d;
                if (finderContact2 != null) {
                    str4 = finderContact2.username;
                }
                C0073g0 g0Var2 = g0Var;
                String str6 = "type";
                list.add(new C54126g(str4, 0, 0));
                d0Var.f154051E = a1Var;
                C63118y3 y3Var = fVar.f169202Q0;
                if (y3Var != null) {
                    y3Var.mo88049f1();
                }
                C63068w1 w1Var = fVar.f169201Q;
                if (w1Var != null) {
                    w1Var.mo88007d1(1);
                }
                C60299b bVar = C60299b.f171929a;
                Log.m105924i("Finder.LinkMicTimeoutTimer", "startApplyBattleTimer delay:60000");
                MMHandlerThread.postToMainThreadDelayed(C60299b.f171934f, 60000);
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(str6, 2);
                jSONObject.putOpt("result", jv03.f136351f);
                C13598b0 b0Var = C13598b0.f38549a;
                C8777j5.C8778a.m8605f((C8777j5) c, g0Var2, jSONObject.toString(), (String) null, 4, (Object) null);
                return;
            }
            C0073g0 g0Var3 = g0Var;
            String str7 = "type";
            String str8 = fVar.f169228i;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[Battle] apply battle fail. toContact:[");
            FinderContact finderContact3 = hx02.f134919d;
            sb4.append(finderContact3 != null ? finderContact3.nickname : null);
            sb4.append(']');
            Log.m105924i(str8, sb4.toString());
            C63068w1 w1Var2 = fVar.f169201Q;
            if (w1Var2 != null) {
                w1Var2.mo88006c1(1);
            }
            if (!(str2 == null || str.length() == 0)) {
                z = false;
            }
            if (!z) {
                str4 = str2;
            }
            if (i4 == -200110) {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(str7, 10);
                C13598b0 b0Var2 = C13598b0.f38549a;
                C8777j5.C8778a.m8605f((C8777j5) c2, g0Var3, jSONObject2.toString(), (String) null, 4, (Object) null);
                AppCompatActivity appCompatActivity = fVar.f166836e;
                if (str4 == null) {
                    str4 = appCompatActivity.getResources().getString(C0966R.string.f360538dh1);
                    C87412m.m108593f(str4, "context.resources.getStr…attle_apply_fail_version)");
                }
                C76912y0.makeText((Context) appCompatActivity, (CharSequence) str4, 0).show();
                return;
            }
            AppCompatActivity appCompatActivity2 = fVar.f166836e;
            if (str4 == null) {
                str4 = appCompatActivity2.getResources().getString(C0966R.string.f360537dh0);
                C87412m.m108593f(str4, "context.resources.getStr…r_live_battle_apply_fail)");
            }
            C76912y0.makeText((Context) appCompatActivity2, (CharSequence) str4, 0).show();
        }
    }

    /* renamed from: fl1.f$j */
    public static final class C59171j implements C45384r.C45385a {

        /* renamed from: a */
        public final /* synthetic */ C59161f f169260a;

        /* renamed from: b */
        public final /* synthetic */ C49765hx0 f169261b;

        public C59171j(C59161f fVar, C49765hx0 hx02) {
            this.f169260a = fVar;
            this.f169261b = hx02;
        }

        /* renamed from: a */
        public void mo70898a(int i, int i2, String str, C51727vr0 vr02) {
            int i3 = i;
            int i4 = i2;
            String str2 = str;
            C87412m.m108594g(vr02, "resp");
            String str3 = this.f169260a.f169228i;
            Log.m105924i(str3, "[Battle] accept battle. errType:" + i3 + ' ' + i4 + ' ' + str2);
            C59161f fVar = this.f169260a;
            C49765hx0 hx02 = this.f169261b;
            String str4 = null;
            if (i3 == 0 && i4 == 0) {
                String str5 = fVar.f169228i;
                StringBuilder sb = new StringBuilder();
                sb.append("[Battle] accept battle success. toContact:[");
                FinderContact finderContact = hx02.f134919d;
                sb.append(finderContact != null ? finderContact.nickname : null);
                sb.append(']');
                Log.m105924i(str5, sb.toString());
                C63118y3 y3Var = fVar.f169202Q0;
                if (y3Var != null) {
                    C60535v0 v0Var = y3Var.f179112r;
                    View view = v0Var.f172553g;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget", "onBattleAcceptSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget", "onBattleAcceptSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view3 = v0Var.f172552f;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget", "onBattleAcceptSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget", "onBattleAcceptSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C61926c.m72668M(new C46272x0(v0Var, (C32224a<C13598b0>) null));
                }
                C63118y3 y3Var2 = fVar.f169202Q0;
                if (y3Var2 != null) {
                    y3Var2.mo10792g(0);
                    y3Var2.f179112r.mo85502a(0);
                    C60535v0 v0Var2 = y3Var2.f179112r;
                    C63155z3 z3Var = new C63155z3(y3Var2);
                    v0Var2.getClass();
                    C61926c.m72668M(new C46272x0(v0Var2, z3Var));
                    y3Var2.f179113s.mo85317a(8);
                }
                C63068w1 w1Var = fVar.f169201Q;
                if (w1Var != null) {
                    w1Var.mo88007d1(2);
                    return;
                }
                return;
            }
            String str6 = fVar.f169228i;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[Battle] accept battle fail. toContact:[");
            FinderContact finderContact2 = hx02.f134919d;
            sb4.append(finderContact2 != null ? finderContact2.nickname : null);
            sb4.append(']');
            Log.m105924i(str6, sb4.toString());
            C63118y3 y3Var3 = fVar.f169202Q0;
            if (y3Var3 != null) {
                C60535v0 v0Var3 = y3Var3.f179112r;
                View view5 = v0Var3.f172553g;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget", "onBattleAcceptFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget", "onBattleAcceptFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = v0Var3.f172552f;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget", "onBattleAcceptFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget", "onBattleAcceptFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C63068w1 w1Var2 = fVar.f169201Q;
            if (w1Var2 != null) {
                w1Var2.mo88006c1(2);
            }
            if (!(str2 == null || str.length() == 0)) {
                str4 = str2;
            }
            AppCompatActivity appCompatActivity = fVar.f166836e;
            if (str4 == null) {
                str4 = appCompatActivity.getResources().getString(C0966R.string.dgz);
                C87412m.m108593f(str4, "context.resources.getStr…_live_battle_accept_fail)");
            }
            C76912y0.makeText((Context) appCompatActivity, (CharSequence) str4, 0).show();
        }
    }

    /* renamed from: fl1.f$k */
    public static final class C59172k implements C45401y.C45402a {

        /* renamed from: a */
        public final /* synthetic */ C59161f f169262a;

        /* renamed from: b */
        public final /* synthetic */ C49765hx0 f169263b;

        public C59172k(C59161f fVar, C49765hx0 hx02) {
            this.f169262a = fVar;
            this.f169263b = hx02;
        }

        /* renamed from: a */
        public void mo70903a(int i, int i2, String str, C52316zw0 zw02) {
            C87412m.m108594g(zw02, "resp");
            Log.m105924i(this.f169262a.f169228i, "[Battle] close battle. errType:" + i + ' ' + i2 + ' ' + str);
            C59161f fVar = this.f169262a;
            C49765hx0 hx02 = this.f169263b;
            String str2 = null;
            if (i == 0 && i2 == 0) {
                String str3 = fVar.f169228i;
                StringBuilder sb = new StringBuilder();
                sb.append("[Battle] close battle success. toContact:[");
                FinderContact finderContact = hx02.f134919d;
                sb.append(finderContact != null ? finderContact.nickname : null);
                sb.append(']');
                Log.m105924i(str3, sb.toString());
                ((C54963d0) fVar.mo83051g(C54963d0.class)).f154051E = null;
                C63118y3 y3Var = fVar.f169202Q0;
                if (y3Var != null) {
                    y3Var.mo10792g(0);
                    y3Var.f179112r.mo85502a(0);
                    C60535v0 v0Var = y3Var.f179112r;
                    C62631a4 a4Var = new C62631a4(y3Var);
                    v0Var.getClass();
                    C61926c.m72668M(new C46275z0(v0Var, a4Var));
                    y3Var.f179113s.mo85317a(8);
                }
                C63068w1 w1Var = fVar.f169201Q;
                if (w1Var != null) {
                    w1Var.mo88007d1(0);
                }
                if (str == null || str.length() == 0) {
                    str = null;
                }
                AppCompatActivity appCompatActivity = fVar.f166836e;
                if (str == null) {
                    str = appCompatActivity.getResources().getString(C0966R.string.f360539dh3);
                    C87412m.m108593f(str, "context.resources.getStr…der_live_battle_close_pk)");
                }
                C76912y0.makeText((Context) appCompatActivity, (CharSequence) str, 0).show();
                return;
            }
            String str4 = fVar.f169228i;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[Battle] close battle fail. toContact:[");
            FinderContact finderContact2 = hx02.f134919d;
            if (finderContact2 != null) {
                str2 = finderContact2.nickname;
            }
            sb4.append(str2);
            sb4.append(']');
            Log.m105924i(str4, sb4.toString());
            C63068w1 w1Var2 = fVar.f169201Q;
            if (w1Var2 != null) {
                w1Var2.mo88006c1(0);
            }
        }
    }

    /* renamed from: fl1.f$m */
    public static final class C59173m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bundle f169264d;

        /* renamed from: e */
        public final /* synthetic */ C59161f f169265e;

        /* renamed from: f */
        public final /* synthetic */ C12322e5 f169266f;

        public C59173m(Bundle bundle, C59161f fVar, C12322e5 e5Var) {
            this.f169264d = bundle;
            this.f169265e = fVar;
            this.f169266f = e5Var;
        }

        public final void run() {
            Bundle bundle = this.f169264d;
            boolean z = true;
            int i = 0;
            if (bundle == null || !bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
                z = false;
            }
            C12322e5 e5Var = null;
            if (z) {
                C59161f fVar = this.f169265e;
                C62949r8 r8Var = fVar.f169190E;
                if (r8Var != null) {
                    e5Var = r8Var.f178624D;
                }
                if (e5Var == null) {
                    ViewGroup.LayoutParams layoutParams = this.f169266f.f166287d.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    fVar.f169224d1 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }
                C59161f fVar2 = this.f169265e;
                C62949r8 r8Var2 = fVar2.f169190E;
                if (r8Var2 != null) {
                    r8Var2.f178624D = fVar2.f169237t;
                }
                ViewGroup.LayoutParams layoutParams2 = this.f169266f.f166287d.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                layoutParams3.addRule(12);
                layoutParams3.removeRule(2);
                return;
            }
            C62949r8 r8Var3 = this.f169265e.f169190E;
            if (r8Var3 != null) {
                r8Var3.f178624D = null;
            }
            ViewGroup.LayoutParams layoutParams4 = this.f169266f.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
            layoutParams5.removeRule(12);
            LinearLayout linearLayout = this.f169265e.f169225e1;
            if (linearLayout != null) {
                i = linearLayout.getId();
            }
            layoutParams5.addRule(2, i);
            ViewGroup.LayoutParams layoutParams6 = this.f169266f.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = this.f169265e.f169224d1;
            this.f169266f.f166287d.requestLayout();
        }
    }

    /* renamed from: fl1.f$n */
    public static final class C59174n implements C45341a.C45342a {

        /* renamed from: a */
        public final /* synthetic */ C59161f f169267a;

        /* renamed from: b */
        public final /* synthetic */ C54130j f169268b;

        /* renamed from: c */
        public final /* synthetic */ C49765hx0 f169269c;

        /* renamed from: d */
        public final /* synthetic */ String f169270d;

        /* renamed from: fl1.f$n$a */
        public static final class C59175a extends C87413o implements C32226l<C54130j, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ String f169271d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59175a(String str) {
                super(1);
                this.f169271d = str;
            }

            public Object invoke(Object obj) {
                return Boolean.valueOf(Util.isEqual(((C54130j) obj).f152002f, this.f169271d));
            }
        }

        /* renamed from: fl1.f$n$b */
        public static final class C59176b extends C87413o implements C32226l<C54130j, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ String f169272d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59176b(String str) {
                super(1);
                this.f169272d = str;
            }

            public Object invoke(Object obj) {
                return Boolean.valueOf(Util.isEqual(((C54130j) obj).f152002f, this.f169272d));
            }
        }

        /* renamed from: fl1.f$n$c */
        public static final class C59177c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59161f f169273d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59177c(C59161f fVar) {
                super(0);
                this.f169273d = fVar;
            }

            public Object invoke() {
                FinderLiveApplyLinkView finderLiveApplyLinkView;
                C63068w1 w1Var = this.f169273d.f169201Q;
                if (!(w1Var == null || w1Var.mo14483f0() != 0 || (finderLiveApplyLinkView = (FinderLiveApplyLinkView) C110818d0.m150916N(w1Var.f178984H)) == null)) {
                    finderLiveApplyLinkView.mo77775j();
                }
                return C13598b0.f38549a;
            }
        }

        public C59174n(C59161f fVar, C54130j jVar, C49765hx0 hx02, String str) {
            this.f169267a = fVar;
            this.f169268b = jVar;
            this.f169269c = hx02;
            this.f169270d = str;
        }

        /* renamed from: a */
        public void mo70884a(int i, int i2, String str, C52009xr0 xr02) {
            C54655b bVar;
            int i3 = i;
            int i4 = i2;
            String str2 = str;
            Class cls = C54991o.class;
            Class cls2 = C54108o.class;
            Class cls3 = C54963d0.class;
            C87412m.m108594g(xr02, "resp");
            Log.m105924i(this.f169267a.f169228i, "acceptLinkMic " + this.f169268b.f152000d + ' ' + this.f169268b.f151997a + " errCode:" + i4 + " errType:" + i3 + " errMsg:" + str2);
            boolean z = true;
            if (i4 == 0 && i3 == 0) {
                C58704c5 c5Var = C58704c5.f168044a;
                C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 60);
                String str3 = "";
                if (this.f169268b.f152001e == 1) {
                    ((C54108o) C86312j.m106911c(cls2)).Xx0(C54067f0.C54087y.CONNECT_VOICE_TO_LINKMIC, str3, -1, -1);
                } else {
                    ((C54108o) C86312j.m106911c(cls2)).Xx0(C54067f0.C54087y.CONNECT_VIDEO_TO_LINKMIC, str3, -1, -1);
                }
                FinderLiveErrorReportStruct finderLiveErrorReportStruct = new FinderLiveErrorReportStruct();
                finderLiveErrorReportStruct.f155539e = 1003;
                finderLiveErrorReportStruct.mo76263s(str3);
                Log.m105924i("FinderLiveMicReportUtil", "reportMicPv " + 1003 + " msg: " + str3);
                finderLiveErrorReportStruct.mo86054n();
                C54108o oVar = (C54108o) C86312j.m106911c(cls2);
                C54067f0.C54087y yVar = C54067f0.C54087y.LINKMIC_CONNECT_SUCCESS;
                FinderContact finderContact = this.f169269c.f134919d;
                oVar.Xx0(yVar, finderContact != null ? finderContact.username : null, 2, 2);
                C62815i3 i3Var = this.f169267a.f169230n;
                if (i3Var != null) {
                    C61926c.m72668M(new C62877m3(i3Var, this.f169268b.f151997a, 0));
                }
                C62042e eVar = C62042e.f176370a;
                String str4 = this.f169268b.f151997a;
                if (str4 != null) {
                    str3 = str4;
                }
                int m4 = ((C54991o) this.f169267a.mo83051g(cls)).mo76013m4();
                C54130j jVar = ((C54963d0) this.f169267a.mo83051g(cls3)).f154073p;
                boolean Y1 = eVar.mo87058Y1(str3, m4, false, jVar != null ? jVar.f152002f : null);
                if (!((C54963d0) this.f169267a.mo83051g(cls3)).f154053G) {
                    this.f169268b.mo74948o();
                    ((C54991o) this.f169267a.mo83051g(cls)).mo76009k4(this.f169268b);
                    C65760a aVar = this.f169267a.f166837f;
                    if (aVar != null) {
                        C56032b.notifyAudienceMicUserChange$default(aVar, false, 1, (Object) null);
                    }
                } else if (Y1 && (bVar = this.f169267a.f166839h) != null) {
                    bVar.mo85680X().mo86572o(false);
                }
                ((C54963d0) this.f169267a.mo83051g(cls3)).f154072o.clear();
                C12490l0 l0Var = this.f169267a.f169203R;
                if (l0Var != null) {
                    l0Var.mo12140Z0();
                }
            } else {
                if (!(str2 == null || str.length() == 0)) {
                    z = false;
                }
                if (z) {
                    str2 = null;
                }
                if (i4 == -200074) {
                    AppCompatActivity appCompatActivity = this.f169267a.f166836e;
                    if (str2 == null) {
                        str2 = appCompatActivity.getResources().getString(C0966R.string.dq8);
                        C87412m.m108593f(str2, "context.resources.getStr…k_accept_pk_tip_canceled)");
                    }
                    C76912y0.makeText((Context) appCompatActivity, (CharSequence) str2, 0).show();
                } else {
                    C64273c21 c212 = ((C55001u) this.f169267a.mo83051g(C55001u.class)).f154420q;
                    long j = c212 != null ? c212.f182392d : 0;
                    Log.m105924i("FinderLiveMicWatcher", "onAnchorAcceptMicFail errCode: " + i4 + " errType: " + i3 + " liveId: " + j);
                    C58704c5 c5Var2 = C58704c5.f168044a;
                    C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 62);
                    C11348f.C11349a.m11178b(C59319a.f169618b, "mic_anchorAcceptMicFail", false, (C11348f.C11352b) null, false, false, new C0580o3(i4, i3, j), 28, (Object) null);
                }
                List<C54130j> list = ((C54963d0) this.f169267a.mo83051g(cls3)).f154076s;
                C87412m.m108593f(list, "business(LiveLinkMicSlic…java).linkMicUserInfoList");
                C61926c.m72700y(list, new C59175a(this.f169270d));
                List<C54130j> list2 = ((C54963d0) this.f169267a.mo83051g(cls3)).f154071n;
                if (list2 != null) {
                    C61926c.m72700y(list2, new C59176b(this.f169270d));
                }
                this.f169268b.f152008l = 0;
            }
            C61926c.m72668M(new C59177c(this.f169267a));
        }
    }

    /* renamed from: fl1.f$p */
    public static final class C59178p extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59161f f169274d;

        /* renamed from: e */
        public final /* synthetic */ C54130j f169275e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59178p(C59161f fVar, C54130j jVar) {
            super(1);
            this.f169274d = fVar;
            this.f169275e = jVar;
        }

        public Object invoke(Object obj) {
            C54130j jVar;
            FinderLiveApplyLinkView finderLiveApplyLinkView;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C63068w1 w1Var = this.f169274d.f169201Q;
            if (!(w1Var == null || (jVar = this.f169275e) == null || jVar.f152004h || (finderLiveApplyLinkView = (FinderLiveApplyLinkView) C110818d0.m150917O(w1Var.f178984H, 0)) == null)) {
                finderLiveApplyLinkView.mo77776k(booleanValue, jVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fl1.f$q */
    public static final class C59179q extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59161f f169276d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59179q(C59161f fVar) {
            super(1);
            this.f169276d = fVar;
        }

        public Object invoke(Object obj) {
            C54130j jVar;
            FinderLiveApplyLinkView finderLiveApplyLinkView;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C59161f fVar = this.f169276d;
            C63068w1 w1Var = fVar.f169201Q;
            if (!(w1Var == null || (jVar = ((C54963d0) fVar.mo83051g(C54963d0.class)).f154073p) == null || jVar.f152004h || (finderLiveApplyLinkView = (FinderLiveApplyLinkView) C110818d0.m150917O(w1Var.f178984H, 0)) == null)) {
                finderLiveApplyLinkView.mo77776k(booleanValue, jVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fl1.f$r */
    public static final class C59180r implements C45360g.C45361a {

        /* renamed from: a */
        public final /* synthetic */ C59161f f169277a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f169278b;

        /* renamed from: c */
        public final /* synthetic */ C54130j f169279c;

        /* renamed from: d */
        public final /* synthetic */ C54130j f169280d;

        /* renamed from: fl1.f$r$a */
        public static final class C59181a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59161f f169281d;

            /* renamed from: e */
            public final /* synthetic */ int f169282e;

            /* renamed from: f */
            public final /* synthetic */ int f169283f;

            /* renamed from: g */
            public final /* synthetic */ String f169284g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<Boolean, C13598b0> f169285h;

            /* renamed from: i */
            public final /* synthetic */ C54130j f169286i;

            /* renamed from: j */
            public final /* synthetic */ C54130j f169287j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59181a(C59161f fVar, int i, int i2, String str, C32226l<? super Boolean, C13598b0> lVar, C54130j jVar, C54130j jVar2) {
                super(0);
                this.f169281d = fVar;
                this.f169282e = i;
                this.f169283f = i2;
                this.f169284g = str;
                this.f169285h = lVar;
                this.f169286i = jVar;
                this.f169287j = jVar2;
            }

            public Object invoke() {
                FinderLiveApplyLinkView finderLiveApplyLinkView;
                C65760a aVar;
                Class cls = C54108o.class;
                Class cls2 = C54963d0.class;
                String str = this.f169281d.f169228i;
                Log.m105924i(str, "postCloseLinkMsg errCode:" + this.f169282e + ", errType:" + this.f169283f + ", errMsg:" + this.f169284g);
                int i = this.f169282e;
                if (i == 0 && this.f169283f == 0) {
                    C58704c5 c5Var = C58704c5.f168044a;
                    C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 63);
                    C54130j jVar = ((C54963d0) this.f169281d.mo83051g(cls2)).f154073p;
                    if (jVar != null && jVar.f152001e == 1) {
                        ((C54108o) C86312j.m106911c(cls)).Xx0(C54067f0.C54087y.DISCONNECT_VOICE_TO_LINKMIC, "", -1, -1);
                    } else {
                        C54130j jVar2 = ((C54963d0) this.f169281d.mo83051g(cls2)).f154073p;
                        if (jVar2 != null && jVar2.f152001e == 2) {
                            ((C54108o) C86312j.m106911c(cls)).Xx0(C54067f0.C54087y.DISCONNECT_VIDEO_TO_LINKMIC, "", -1, -1);
                        }
                    }
                    List<C54130j> list = ((C54963d0) this.f169281d.mo83051g(cls2)).f154071n;
                    C87412m.m108593f(list, "business(LiveLinkMicSlic…ass.java).linkMicUserList");
                    C61926c.m72700y(list, new C59232u2(this.f169287j));
                    List<C54130j> list2 = ((C54963d0) this.f169281d.mo83051g(cls2)).f154074q;
                    C87412m.m108593f(list2, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
                    C61926c.m72700y(list2, new C59235v2(this.f169287j));
                    List<C54130j> list3 = ((C54963d0) this.f169281d.mo83051g(cls2)).f154076s;
                    C87412m.m108593f(list3, "business(LiveLinkMicSlic…java).linkMicUserInfoList");
                    C61926c.m72700y(list3, new C59238w2(this.f169287j));
                    if (!((C54963d0) this.f169281d.mo83051g(cls2)).f154053G && (aVar = this.f169281d.f166837f) != null) {
                        C56032b.notifyAudienceMicUserChange$default(aVar, false, 1, (Object) null);
                    }
                    C32226l<Boolean, C13598b0> lVar = this.f169285h;
                    if (lVar != null) {
                        lVar.invoke(Boolean.TRUE);
                    }
                } else {
                    C54807r3.f153641a.mo75769a(true, i, this.f169283f, ((C55001u) this.f169281d.mo83051g(C55001u.class)).f154420q.f182392d);
                    C32226l<Boolean, C13598b0> lVar2 = this.f169285h;
                    if (lVar2 != null) {
                        lVar2.invoke(Boolean.FALSE);
                    }
                }
                this.f169286i.f152008l = 0;
                C12490l0 l0Var = this.f169281d.f169203R;
                if (l0Var != null) {
                    l0Var.mo12140Z0();
                }
                C63068w1 w1Var = this.f169281d.f169201Q;
                if (!(w1Var == null || w1Var.mo14483f0() != 0 || (finderLiveApplyLinkView = (FinderLiveApplyLinkView) C110818d0.m150916N(w1Var.f178984H)) == null)) {
                    finderLiveApplyLinkView.mo77775j();
                }
                return C13598b0.f38549a;
            }
        }

        public C59180r(C59161f fVar, C32226l<? super Boolean, C13598b0> lVar, C54130j jVar, C54130j jVar2) {
            this.f169277a = fVar;
            this.f169278b = lVar;
            this.f169279c = jVar;
            this.f169280d = jVar2;
        }

        /* renamed from: a */
        public void mo62564a(int i, int i2, String str, C49199dx0 dx02) {
            C87412m.m108594g(dx02, "resp");
            C61926c.m72668M(new C59181a(this.f169277a, i2, i, str, this.f169278b, this.f169279c, this.f169280d));
        }
    }

    /* renamed from: fl1.f$s */
    public static final class C59182s implements C45364h.C45365a {

        /* renamed from: a */
        public final /* synthetic */ C59161f f169288a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f169289b;

        /* renamed from: fl1.f$s$a */
        public static final class C59183a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59161f f169290d;

            /* renamed from: e */
            public final /* synthetic */ int f169291e;

            /* renamed from: f */
            public final /* synthetic */ int f169292f;

            /* renamed from: g */
            public final /* synthetic */ String f169293g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<Boolean, C13598b0> f169294h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59183a(C59161f fVar, int i, int i2, String str, C32226l<? super Boolean, C13598b0> lVar) {
                super(0);
                this.f169290d = fVar;
                this.f169291e = i;
                this.f169292f = i2;
                this.f169293g = str;
                this.f169294h = lVar;
            }

            public Object invoke() {
                String str = this.f169290d.f169228i;
                Log.m105924i(str, "postCloseLinkPkMsg errCode:" + this.f169291e + ", errType:" + this.f169292f + ", errMsg:" + this.f169293g);
                int i = this.f169291e;
                if (i == 0 && this.f169292f == 0) {
                    C59161f.m69117n(this.f169290d);
                    C58704c5 c5Var = C58704c5.f168044a;
                    C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 63);
                    ((C54108o) C86312j.m106911c(C54108o.class)).Xx0(C54067f0.C54087y.STOP_LINKMIC_WHEN_WAITING_CONNECT, "", -1, -1);
                    C32226l<Boolean, C13598b0> lVar = this.f169294h;
                    if (lVar != null) {
                        lVar.invoke(Boolean.TRUE);
                    }
                } else {
                    int i2 = this.f169292f;
                    long j = ((C55001u) this.f169290d.mo83051g(C55001u.class)).f154420q.f182392d;
                    Log.m105924i("FinderLiveMicWatcher", "onCloseMicPkFail errCode: " + i + " errType: " + i2 + " liveId: " + j);
                    C11348f.C11349a.m11178b(C59319a.f169618b, "micpk_anchorCloseMicFail", false, (C11348f.C11352b) null, false, false, new C0596s3(i, i2, j), 28, (Object) null);
                    C32226l<Boolean, C13598b0> lVar2 = this.f169294h;
                    if (lVar2 != null) {
                        lVar2.invoke(Boolean.FALSE);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C59182s(C59161f fVar, C32226l<? super Boolean, C13598b0> lVar) {
            this.f169288a = fVar;
            this.f169289b = lVar;
        }

        /* renamed from: a */
        public void mo70890a(int i, int i2, String str, C49991jh0 jh02) {
            C87412m.m108594g(jh02, "resp");
            C61926c.m72668M(new C59183a(this.f169288a, i2, i, str, this.f169289b));
        }
    }

    /* renamed from: fl1.f$t */
    public static final class C59184t extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59161f f169295d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59184t(C59161f fVar) {
            super(1);
            this.f169295d = fVar;
        }

        public Object invoke(Object obj) {
            C62924pe peVar;
            C61817a aVar;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Class cls = C54979h1.class;
            String str = this.f169295d.f169228i;
            StringBuilder sb = new StringBuilder();
            sb.append("prepare shopping:");
            sb.append(booleanValue);
            sb.append(",list empty:");
            C62192a<C0740i2> aVar2 = ((C54979h1) this.f169295d.mo83051g(cls)).f154140o;
            sb.append(aVar2 != null ? Boolean.valueOf(aVar2.mo87254e()) : null);
            Log.m105924i(str, sb.toString());
            if (booleanValue) {
                if (!(!((C54979h1) this.f169295d.mo83051g(cls)).mo75938d3() || (peVar = this.f169295d.f169186A) == null || (aVar = peVar.f178556r) == null)) {
                    aVar.mo86768x();
                }
                C61882w wVar = C61882w.f175962a;
                C59161f fVar = this.f169295d;
                wVar.mo86816c(fVar.f166851d, C62042e.f176370a.mo87017K(((C54979h1) fVar.mo83051g(cls)).f154139n), false);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fl1.f$u */
    public static final class C59185u implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59161f f169296d;

        public C59185u(C59161f fVar) {
            this.f169296d = fVar;
        }

        public final void run() {
            this.f169296d.mo84380o();
        }
    }

    /* renamed from: fl1.f$v */
    public static final class C59186v implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C59161f f169297d;

        public C59186v(C59161f fVar) {
            this.f169297d = fVar;
        }

        public final boolean onTimerExpired() {
            C62627a3 a3Var;
            C59161f fVar;
            C12690u1 u1Var;
            Class cls = C54991o.class;
            C62632a6 a6Var = this.f169297d.f169234q;
            boolean z = false;
            if (a6Var != null && a6Var.mo14483f0() == 0) {
                C59161f fVar2 = this.f169297d;
                C62632a6 a6Var2 = fVar2.f169234q;
                if (a6Var2 != null) {
                    a6Var2.mo87667a1(((C55001u) fVar2.mo83051g(C55001u.class)).f154420q.f182396h);
                }
                C62632a6 a6Var3 = this.f169297d.f169234q;
                if (a6Var3 != null) {
                    a6Var3.mo87668b1();
                }
                LinkedList linkedList = new LinkedList();
                C59161f fVar3 = this.f169297d;
                if (C62042e.f176370a.mo87090j1(fVar3.f166851d)) {
                    linkedList.add(new C13604l(6, null));
                } else if (C0668l.m589e3((C0668l) fVar3.mo83051g(C0668l.class), (C64337e61) null, 1, (Object) null)) {
                    linkedList.add(new C13604l(1, null));
                } else {
                    linkedList.add(new C13604l(2, null));
                }
                linkedList.add(new C13604l(3, null));
                if (((C54991o) fVar3.mo83051g(cls)).f154243Q1 && ((C54991o) fVar3.mo83051g(cls)).mo75963I3()) {
                    linkedList.add(new C13604l(4, null));
                }
                C62632a6 a6Var4 = fVar3.f169234q;
                if (a6Var4 != null) {
                    a6Var4.mo87672f1(linkedList, true, false);
                }
            }
            C12690u1 u1Var2 = this.f169297d.f169188C;
            if ((u1Var2 != null && u1Var2.mo14483f0() == 0) && (u1Var = fVar.f169188C) != null) {
                C61926c.m72668M(new C12703v1(u1Var, ((C54991o) (fVar = this.f169297d).mo83051g(cls)).f154276X));
            }
            C62627a3 a3Var2 = this.f169297d.f169242x0;
            if (a3Var2 != null && a3Var2.mo14483f0() == 0) {
                z = true;
            }
            if (z && (a3Var = this.f169297d.f169242x0) != null) {
                C61926c.m72668M(new C62642b3(a3Var));
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59161f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, "context");
    }

    /* renamed from: F */
    public static /* synthetic */ void m69115F(C59161f fVar, C54130j jVar, C32226l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        fVar.mo84371E(jVar, lVar);
    }

    /* renamed from: H */
    public static /* synthetic */ void m69116H(C59161f fVar, C32226l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        fVar.mo84372G(lVar);
    }

    /* renamed from: n */
    public static final void m69117n(C59161f fVar) {
        Class cls = C54963d0.class;
        if (((C54963d0) fVar.mo83051g(cls)).mo75913U3()) {
            C62799h2 h2Var = fVar.f169199N;
            if (h2Var != null) {
                h2Var.mo87790Z0();
            }
            FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin = fVar.f169200P;
            if (finderLiveRandomMatchLinkMicStatePlugin != null) {
                finderLiveRandomMatchLinkMicStatePlugin.mo3220a1();
            }
        }
        ((C54963d0) fVar.mo83051g(cls)).f154078u = 0;
        ((C54963d0) fVar.mo83051g(cls)).f154073p = null;
        C61620c.C61622b.f175234a.mo86556d((String) null);
        ((C54963d0) fVar.mo83051g(cls)).mo75928k3();
        C12490l0 l0Var = fVar.f169203R;
        if (l0Var != null) {
            l0Var.mo12140Z0();
        }
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.mo77620W();
        finderLiveService.mo77610M();
        fVar.mo84369C();
    }

    /* renamed from: y */
    public static void m69118y(C59161f fVar, int i, int i2, String str, C49291ej0 ej02, C48779ay0 ay02, int i3, Object obj) {
        C49430fj0 fj02;
        if ((i3 & 8) != 0) {
            ej02 = null;
        }
        if ((i3 & 16) != 0) {
            ay02 = null;
        }
        Class cls = C54108o.class;
        Log.m105924i(fVar.f169228i, "handleLiveErr errCode:" + i2 + " errMsg:" + str);
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c, 4, String.valueOf(1), (String) null, 4, (Object) null);
        ((C54108o) C86312j.m106911c(cls)).getClass();
        C54108o.f151869h.f151437S = i2;
        ((C54108o) C86312j.m106911c(cls)).ay0(C54067f0.C54077p.LIVE_EXIT_ERROR);
        if (C62042e.f176370a.mo87015J0(i, i2, ej02 != null ? ej02.f132952f : null, new C59217p(fVar))) {
            return;
        }
        if (i2 != -200196) {
            if (i2 != -100038) {
                switch (i2) {
                    case -200018:
                    case -200017:
                        break;
                    default:
                        switch (i2) {
                            case MMLISTEN_ERR_INVALID_ALBUM_VALUE:
                                break;
                            case MMLISTEN_ERR_INVALID_BROADCAST_VALUE:
                            case -200011:
                                AppCompatActivity appCompatActivity = fVar.f166836e;
                                C76912y0.makeText((Context) appCompatActivity, (CharSequence) appCompatActivity.getResources().getString(C0966R.string.dkm), 0).show();
                                C65760a aVar = fVar.f166837f;
                                if (aVar != null) {
                                    C58124b.C7172a.m7372a(aVar, C58124b.C58125b.LIVE_HAS_FINISHED, (Bundle) null, 2, (Object) null);
                                    return;
                                }
                                return;
                            case MMLISTEN_ERR_INVALID_FEEDBUF_VALUE:
                                AppCompatActivity appCompatActivity2 = fVar.f166836e;
                                C76912y0.makeText((Context) appCompatActivity2, (CharSequence) appCompatActivity2.getResources().getString(C0966R.string.dfj), 0).show();
                                C65760a aVar2 = fVar.f166837f;
                                if (aVar2 != null) {
                                    C58124b.C7172a.m7372a(aVar2, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
                                    return;
                                }
                                return;
                            case -200009:
                                AppCompatActivity appCompatActivity3 = fVar.f166836e;
                                C76912y0.makeText((Context) appCompatActivity3, (CharSequence) appCompatActivity3.getResources().getString(C0966R.string.d0r), 0).show();
                                C65760a aVar3 = fVar.f166837f;
                                if (aVar3 != null) {
                                    C58124b.C7172a.m7372a(aVar3, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
                                    return;
                                }
                                return;
                            default:
                                AppCompatActivity appCompatActivity4 = fVar.f166836e;
                                C76912y0.makeText((Context) appCompatActivity4, (CharSequence) appCompatActivity4.getResources().getString(C0966R.string.d0q), 0).show();
                                C65760a aVar4 = fVar.f166837f;
                                if (aVar4 != null) {
                                    C58124b.C7172a.m7372a(aVar4, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
                                    return;
                                }
                                return;
                        }
                }
                Bundle bundle = new Bundle();
                if (ay02 != null) {
                    bundle.putByteArray("PARAM_FINDER_LIVE_ERROR_PAGE", ay02.toByteArray());
                    bundle.putInt("PARAM_FINDER_LIVE_ERROR_CODE", i2);
                }
                C65760a aVar5 = fVar.f166837f;
                if (aVar5 != null) {
                    aVar5.statusChange(C58124b.C58125b.FINDER_LIVE_FORCE_QUIT, bundle);
                    return;
                }
                return;
            }
            C65760a aVar6 = fVar.f166837f;
            if (aVar6 != null) {
                C58124b.C7172a.m7372a(aVar6, C58124b.C58125b.LIVE_HAS_FINISHED, (Bundle) null, 2, (Object) null);
            }
        } else if (ej02 != null && (fj02 = ej02.f132955i) != null) {
            Log.m105924i(fVar.f169228i, "warn_page = " + C61937h.m72709h(fj02));
            fVar.mo84386u(((C15718c2) C39818r.f106831a.mo62444c(fVar.f166836e).mo75002a(C15718c2.class)).mo14443c3(fj02, new C59220q(fVar, fj02)), fj02);
            if (fj02.f133530d == 3) {
                fVar.mo84376L(3);
            }
        }
    }

    /* renamed from: A */
    public final void mo84367A() {
        Class cls = C54108o.class;
        Class cls2 = C54963d0.class;
        Class cls3 = C55001u.class;
        Class cls4 = C54991o.class;
        C58969q qVar = ((C54991o) mo83051g(cls4)).f154259T2;
        ((C54991o) mo83051g(cls4)).mo75976O4(qVar != null ? qVar.field_liveSwitchFlag : 0);
        ((C54991o) mo83051g(cls4)).f154354q = (int) (qVar != null ? qVar.field_liveAnchorStatusFlag : 0);
        ((C54963d0) mo83051g(cls2)).f154048B.f144323d = (long) (((int) ((C54963d0) mo83051g(cls2)).f154048B.f144323d) & -97);
        C54795n5 k = mo83042k();
        if (k != null) {
            C54795n5.C54796a.m61726d(k, ((C55001u) mo83051g(cls3)).f154420q.f182392d, ((C55001u) mo83051g(cls3)).f154416j, ((C54991o) mo83051g(cls4)).f154354q, 0, (C47826f.C47827a) null, 24, (Object) null);
        }
        C0639y1.f1510a.mo617i();
        C66093v1.f189992n.mo61526a(((C55001u) mo83051g(cls3)).f154420q.f182392d);
        String str = this.f169228i;
        StringBuilder sb = new StringBuilder();
        sb.append("joinLive anchorStatusFlag:");
        sb.append(((C54991o) mo83051g(cls4)).f154354q);
        sb.append(" switchFlag:");
        sb.append(qVar != null ? Long.valueOf(qVar.field_liveSwitchFlag) : null);
        sb.append(" giftFuncEnabel:");
        sb.append(((C54991o) mo83051g(cls4)).f154243Q1);
        sb.append(" linkMicFuncEnabel:");
        sb.append(((C54963d0) mo83051g(cls2)).f154080w);
        Log.m105924i(str, sb.toString());
        C61791o.f175673a.mo86722d("joinLive", ((C54991o) mo83051g(cls4)).f154354q);
        ((C54108o) C86312j.m106911c(cls)).getClass();
        C54067f0 f0Var = C54108o.f151869h;
        C26827e eVar = new C26827e();
        f0Var.getClass();
        f0Var.f151468l0 = eVar;
        ((C54108o) C86312j.m106911c(cls)).getClass();
        f0Var.f151466k0 = 0;
        C54795n5 k2 = mo83042k();
        if (k2 != null) {
            k2.mo75734f0(this.f166836e, ((C55001u) mo83051g(cls3)).f154420q.f182392d, 1, new C59166d(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r1 = r1.f172999K;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84368B(java.util.List<com.tencent.p014mm.live.core.core.model.UserVolumeInfo> r5) {
        /*
            r4 = this;
            monitor-enter(r5)
            java.util.Iterator r0 = r5.iterator()     // Catch:{ all -> 0x0075 }
        L_0x0005:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0075 }
            r2 = r1
            com.tencent.mm.live.core.core.model.UserVolumeInfo r2 = (com.tencent.p014mm.live.core.core.model.UserVolumeInfo) r2     // Catch:{ all -> 0x0075 }
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r3 = r4.mo83051g(r3)     // Catch:{ all -> 0x0075 }
            cl1.u r3 = (cl1.C55001u) r3     // Catch:{ all -> 0x0075 }
            te3.bq2 r3 = r3.f154419p     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = r3.f182319n     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = r2.f157117d     // Catch:{ all -> 0x0075 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0005
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            monitor-exit(r5)
            com.tencent.mm.live.core.core.model.UserVolumeInfo r1 = (com.tencent.p014mm.live.core.core.model.UserVolumeInfo) r1
            r5 = 0
            if (r1 == 0) goto L_0x005a
            int r0 = r1.f157118e
            c50.b r1 = r4.f166839h
            if (r1 == 0) goto L_0x003b
            d50.c r1 = r1.f172999K
            if (r1 == 0) goto L_0x003b
            int r1 = r1.f83322a
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            if (r0 <= r1) goto L_0x005a
            qj1.o2 r5 = r4.f169235r
            r0 = 1
            if (r5 == 0) goto L_0x004b
            qj1.p2 r1 = new qj1.p2
            r1.<init>(r5, r0)
            o40.C61926c.m72668M(r1)
        L_0x004b:
            ii1.e r5 = r4.f169207T
            if (r5 == 0) goto L_0x0052
            r5.mo85278b1(r0)
        L_0x0052:
            qj1.w3 r5 = r4.f169211V
            if (r5 == 0) goto L_0x0074
            r5.mo88016c1(r0)
            goto L_0x0074
        L_0x005a:
            qj1.o2 r0 = r4.f169235r
            if (r0 == 0) goto L_0x0066
            qj1.p2 r1 = new qj1.p2
            r1.<init>(r0, r5)
            o40.C61926c.m72668M(r1)
        L_0x0066:
            ii1.e r0 = r4.f169207T
            if (r0 == 0) goto L_0x006d
            r0.mo85278b1(r5)
        L_0x006d:
            qj1.w3 r0 = r4.f169211V
            if (r0 == 0) goto L_0x0074
            r0.mo88016c1(r5)
        L_0x0074:
            return
        L_0x0075:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fl1.C59161f.mo84368B(java.util.List):void");
    }

    /* renamed from: C */
    public final void mo84369C() {
        Class cls = C54963d0.class;
        String str = this.f169228i;
        Log.m105924i(str, "notifyUIAfterCloseLinkPk: roomPk=" + ((C54963d0) mo83051g(cls)).f154053G + ", audienceLinkMicUserList=" + ((C54963d0) mo83051g(cls)).f154074q);
        JSONObject jSONObject = null;
        if (!((C54963d0) mo83051g(cls)).f154053G) {
            List<C54130j> list = ((C54963d0) mo83051g(cls)).f154074q;
            C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
            if (!(!list.isEmpty())) {
                C65760a aVar = this.f166837f;
                if (aVar != null) {
                    C56032b.notifyPKMicUserChange$default(aVar, false, 1, (Object) null);
                    return;
                }
                return;
            }
        }
        C65760a aVar2 = this.f166837f;
        if (aVar2 != null) {
            aVar2.setLastPkMicUser((C54130j) null);
        }
        List<C54130j> list2 = ((C54963d0) mo83051g(cls)).f154074q;
        C87412m.m108593f(list2, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
        if (!list2.isEmpty()) {
            C65760a aVar3 = this.f166837f;
            if (aVar3 != null) {
                aVar3.notifyAudienceMicUserChange(false);
                return;
            }
            return;
        }
        C65760a aVar4 = this.f166837f;
        if (aVar4 != null) {
            C54655b bVar = this.f166839h;
            if (bVar != null) {
                jSONObject = bVar.mo85677T();
            }
            C56032b.notifySEIMicUserChange$default(aVar4, jSONObject, false, (C13604l) null, 6, (Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: al1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r12v18, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r12v21 */
    /* JADX WARNING: type inference failed for: r12v23 */
    /* JADX WARNING: type inference failed for: r12v24 */
    /* JADX WARNING: type inference failed for: r12v25 */
    /* JADX WARNING: type inference failed for: r12v26 */
    /* JADX WARNING: type inference failed for: r12v27 */
    /* JADX WARNING: type inference failed for: r12v28 */
    /* JADX WARNING: type inference failed for: r12v29 */
    /* JADX WARNING: type inference failed for: r12v30 */
    /* JADX WARNING: type inference failed for: r12v31 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x08b0  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x08b7  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x08e7  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x08f0  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x08f9  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0902  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x090b  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0914  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x091d  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0926  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x092f  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0938  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0941  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x094a  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0953  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x095c  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0965  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x096e  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0977  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0980  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0989  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0992  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x099b  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x09a4  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x09ad  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x09b6  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x09bf  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x09c8  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x09d1  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0a15  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0a30  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0a3b  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0a47  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0a93  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0a9a  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0a9d  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0aa9  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0ab4  */
    /* JADX WARNING: Removed duplicated region for block: B:608:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:624:? A[RETURN, SYNTHETIC] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84370D(d60.C58124b.C58125b r35, android.os.Bundle r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            java.lang.Class<com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice> r0 = com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class
            ak1.f0$a r5 = ak1.C54067f0.C0048a.LIVE_BTN_CLICK
            java.lang.Class<cl1.b0> r6 = cl1.C54946b0.class
            java.lang.Class<ak1.o> r7 = ak1.C54108o.class
            java.lang.Class<cl1.u> r8 = cl1.C55001u.class
            java.lang.Class<cl1.d0> r9 = cl1.C54963d0.class
            java.lang.String r10 = "status"
            gy3.C87412m.m108594g(r2, r10)
            int r10 = r35.ordinal()
            r13 = 0
            r14 = 1
            r15 = 5
            r11 = 8
            r12 = 0
            switch(r10) {
                case 7: goto L_0x0db5;
                case 9: goto L_0x0d38;
                case 21: goto L_0x0c36;
                case 27: goto L_0x0c14;
                case 39: goto L_0x0c02;
                case 52: goto L_0x0be4;
                case 54: goto L_0x0b49;
                case 59: goto L_0x0b42;
                case 60: goto L_0x0abb;
                case 116: goto L_0x0a6f;
                case 117: goto L_0x088c;
                case 124: goto L_0x0877;
                case 129: goto L_0x0838;
                case 132: goto L_0x088c;
                case 149: goto L_0x082d;
                case 150: goto L_0x073a;
                case 151: goto L_0x0622;
                case 154: goto L_0x0594;
                case 159: goto L_0x04d9;
                case 160: goto L_0x039c;
                case 161: goto L_0x0325;
                case 170: goto L_0x031a;
                case 173: goto L_0x02ea;
                case 182: goto L_0x025a;
                case 183: goto L_0x0196;
                case 184: goto L_0x00b6;
                case 190: goto L_0x0050;
                case 201: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x0f66
        L_0x0029:
            vk1.a r0 = r34.mo83040i()
            if (r0 == 0) goto L_0x0f68
            al1.h r0 = r0.getData()
            if (r0 == 0) goto L_0x0f68
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r0.mo74917a()
            if (r0 == 0) goto L_0x0f68
            java.lang.Class<ih1.a> r2 = ih1.C60284a.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r0.controller(r2)
            ih1.a r0 = (ih1.C60284a) r0
            if (r0 == 0) goto L_0x0f68
            c50.b r2 = r34.mo83043l()
            r0.mo85274n3(r3, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0050:
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.mo75901G3()
            if (r0 == 0) goto L_0x0062
            d60.b$b r0 = d60.C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK
            r1.mo84370D(r0, r12)
            goto L_0x00b2
        L_0x0062:
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List r0 = r0.mo75932o3()
            if (r0 == 0) goto L_0x0076
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r14
            if (r0 != r14) goto L_0x0076
            r13 = 1
        L_0x0076:
            if (r13 == 0) goto L_0x00b2
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List r2 = r0.mo75932o3()
            if (r2 == 0) goto L_0x00b2
            monitor-enter(r2)
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x00af }
        L_0x0089:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x00af }
            if (r3 == 0) goto L_0x00ab
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x00af }
            al1.j r3 = (al1.C54130j) r3     // Catch:{ all -> 0x00af }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x00af }
            r4.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r5 = "PARAM_FINDER_LIVE_MIC_ID"
            java.lang.String r3 = r3.mo74942i()     // Catch:{ all -> 0x00af }
            r4.putString(r5, r3)     // Catch:{ all -> 0x00af }
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK     // Catch:{ all -> 0x00af }
            r1.mo84370D(r3, r4)     // Catch:{ all -> 0x00af }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00af }
            goto L_0x0089
        L_0x00ab:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00af }
            monitor-exit(r2)
            goto L_0x00b2
        L_0x00af:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00b2:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x00b6:
            java.lang.String r0 = r1.f169228i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CANCEL_BATTLE curBattle:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r1.mo83051g(r9)
            cl1.d0 r3 = (cl1.C54963d0) r3
            cj1.a1 r3 = r3.mo75900F3()
            r2.append(r3)
            java.lang.String r3 = " curPkUser:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r1.mo83051g(r9)
            cl1.d0 r3 = (cl1.C54963d0) r3
            al1.j r3 = r3.mo75901G3()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.mo75901G3()
            if (r0 == 0) goto L_0x0f68
            androidx.lifecycle.i0 r2 = r1.mo83051g(r9)
            cl1.d0 r2 = (cl1.C54963d0) r2
            cj1.a1 r2 = r2.mo75900F3()
            if (r2 == 0) goto L_0x010f
            androidx.lifecycle.i0 r3 = r1.mo83051g(r4)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.mo76012m3()
            al1.g r2 = r2.mo75623b(r3)
            goto L_0x0110
        L_0x010f:
            r2 = r12
        L_0x0110:
            java.lang.String r3 = r0.mo74943j()
            if (r2 == 0) goto L_0x011b
            java.lang.String r2 = r2.mo74913a()
            goto L_0x011c
        L_0x011b:
            r2 = r12
        L_0x011c:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r2)
            if (r2 == 0) goto L_0x0192
            te3.hx0 r2 = new te3.hx0
            r2.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r3 = new com.tencent.mm.protocal.protobuf.FinderContact
            r3.<init>()
            java.lang.String r4 = r0.mo74936e()
            r3.nickname = r4
            java.lang.String r4 = r0.mo74943j()
            r3.username = r4
            java.lang.String r0 = r0.mo74933b()
            r3.headUrl = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r2.f134919d = r3
            cj1.n5 r13 = r34.mo83042k()
            if (r13 == 0) goto L_0x0192
            androidx.lifecycle.i0 r0 = r1.mo83051g(r8)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.mo76035e3()
            long r14 = r0.f182392d
            androidx.lifecycle.i0 r0 = r1.mo83051g(r8)
            cl1.u r0 = (cl1.C55001u) r0
            long r16 = r0.mo76037g3()
            androidx.lifecycle.i0 r0 = r1.mo83051g(r8)
            cl1.u r0 = (cl1.C55001u) r0
            java.lang.String r18 = r0.mo76036f3()
            androidx.lifecycle.i0 r0 = r1.mo83051g(r8)
            cl1.u r0 = (cl1.C55001u) r0
            byte[] r19 = r0.mo76034d3()
            r20 = 1
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            cj1.a1 r0 = r0.mo75900F3()
            if (r0 == 0) goto L_0x0184
            java.lang.String r12 = r0.mo75622a()
        L_0x0184:
            r22 = r12
            fl1.f$k r0 = new fl1.f$k
            r0.<init>(r1, r2)
            r21 = r2
            r23 = r0
            r13.mo75736g0(r14, r16, r18, r19, r20, r21, r22, r23)
        L_0x0192:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0196:
            java.lang.String r0 = r1.f169228i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ACCEPT_BATTLE liveData.business(LiveLinkMicSlice::class.java).curBattle:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r1.mo83051g(r9)
            cl1.d0 r3 = (cl1.C54963d0) r3
            cj1.a1 r3 = r3.mo75900F3()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            cj1.a1 r0 = r0.mo75900F3()
            if (r0 == 0) goto L_0x0f68
            androidx.lifecycle.i0 r2 = r1.mo83051g(r4)
            cl1.o r2 = (cl1.C54991o) r2
            java.lang.String r2 = r2.mo76012m3()
            al1.g r2 = r0.mo75623b(r2)
            te3.hx0 r3 = new te3.hx0
            r3.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r4 = new com.tencent.mm.protocal.protobuf.FinderContact
            r4.<init>()
            androidx.lifecycle.i0 r5 = r1.mo83051g(r9)
            cl1.d0 r5 = (cl1.C54963d0) r5
            al1.j r5 = r5.mo75901G3()
            if (r5 == 0) goto L_0x01ec
            java.lang.String r5 = r5.mo74936e()
            if (r5 != 0) goto L_0x01ee
        L_0x01ec:
            java.lang.String r5 = ""
        L_0x01ee:
            r4.nickname = r5
            if (r2 == 0) goto L_0x01f8
            java.lang.String r2 = r2.mo74913a()
            if (r2 != 0) goto L_0x01fa
        L_0x01f8:
            java.lang.String r2 = ""
        L_0x01fa:
            r4.username = r2
            androidx.lifecycle.i0 r2 = r1.mo83051g(r9)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.mo75901G3()
            if (r2 == 0) goto L_0x020e
            java.lang.String r2 = r2.mo74933b()
            if (r2 != 0) goto L_0x0210
        L_0x020e:
            java.lang.String r2 = ""
        L_0x0210:
            r4.headUrl = r2
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r3.f134919d = r4
            cj1.n5 r10 = r34.mo83042k()
            if (r10 == 0) goto L_0x0f68
            androidx.lifecycle.i0 r2 = r1.mo83051g(r8)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.mo76035e3()
            long r11 = r2.f182392d
            androidx.lifecycle.i0 r2 = r1.mo83051g(r8)
            cl1.u r2 = (cl1.C55001u) r2
            long r13 = r2.mo76037g3()
            androidx.lifecycle.i0 r2 = r1.mo83051g(r8)
            cl1.u r2 = (cl1.C55001u) r2
            java.lang.String r15 = r2.mo76036f3()
            androidx.lifecycle.i0 r2 = r1.mo83051g(r8)
            cl1.u r2 = (cl1.C55001u) r2
            byte[] r16 = r2.mo76034d3()
            r17 = 1
            java.lang.String r19 = r0.mo75622a()
            fl1.f$j r0 = new fl1.f$j
            r0.<init>(r1, r3)
            r18 = r3
            r20 = r0
            r10.mo75744l(r11, r13, r15, r16, r17, r18, r19, r20)
            goto L_0x0f68
        L_0x025a:
            java.lang.String r0 = r1.f169228i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[Battle] apply battle. curLinkMicUser:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r1.mo83051g(r9)
            cl1.d0 r3 = (cl1.C54963d0) r3
            al1.j r3 = r3.mo75901G3()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.mo75901G3()
            if (r0 == 0) goto L_0x0f68
            te3.hx0 r2 = new te3.hx0
            r2.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r3 = new com.tencent.mm.protocal.protobuf.FinderContact
            r3.<init>()
            java.lang.String r4 = r0.mo74936e()
            r3.nickname = r4
            java.lang.String r4 = r0.mo74943j()
            r3.username = r4
            java.lang.String r4 = r0.mo74933b()
            r3.headUrl = r4
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r2.f134919d = r3
            cj1.n5 r9 = r34.mo83042k()
            if (r9 == 0) goto L_0x0f68
            androidx.lifecycle.i0 r3 = r1.mo83051g(r8)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.mo76035e3()
            long r10 = r3.f182392d
            androidx.lifecycle.i0 r3 = r1.mo83051g(r8)
            cl1.u r3 = (cl1.C55001u) r3
            long r12 = r3.mo76037g3()
            androidx.lifecycle.i0 r3 = r1.mo83051g(r8)
            cl1.u r3 = (cl1.C55001u) r3
            java.lang.String r14 = r3.mo76036f3()
            androidx.lifecycle.i0 r3 = r1.mo83051g(r8)
            cl1.u r3 = (cl1.C55001u) r3
            byte[] r15 = r3.mo76034d3()
            r16 = 1
            java.lang.String r18 = r0.mo74942i()
            fl1.f$i r0 = new fl1.f$i
            r0.<init>(r1, r2)
            r17 = r2
            r19 = r0
            r9.mo75754v(r10, r12, r14, r15, r16, r17, r18, r19)
            goto L_0x0f68
        L_0x02ea:
            if (r3 == 0) goto L_0x02f3
            java.lang.String r0 = "PARAM_FINDER_LIVE_IS_MUTE_MIC"
            boolean r0 = r3.getBoolean(r0, r13)
            goto L_0x02f4
        L_0x02f3:
            r0 = 0
        L_0x02f4:
            androidx.lifecycle.i0 r2 = r1.mo83051g(r4)
            cl1.o r2 = (cl1.C54991o) r2
            r2.mo75956D4(r0)
            if (r0 == 0) goto L_0x030b
            c50.b r0 = r34.mo83043l()
            if (r0 == 0) goto L_0x0316
            r0.mo85687d0(r14)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0316
        L_0x030b:
            c50.b r0 = r34.mo83043l()
            if (r0 == 0) goto L_0x0316
            r0.mo85687d0(r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0316:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x031a:
            qj1.xe r0 = r1.f169209U
            if (r0 == 0) goto L_0x0f68
            r0.mo88040Z0()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0325:
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            r0.mo75919a4(r15)
            te3.o61 r0 = new te3.o61
            r0.<init>()
            if (r3 == 0) goto L_0x033c
            java.lang.String r2 = "PARAM_FINDER_LIVE_RANDOM_MATCH_LINK_MIC_CONTACT_LIST"
            byte[] r2 = r3.getByteArray(r2)
            goto L_0x033d
        L_0x033c:
            r2 = r12
        L_0x033d:
            if (r2 != 0) goto L_0x0340
            goto L_0x0351
        L_0x0340:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x0344 }
            goto L_0x0352
        L_0x0344:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "safeParser"
            java.lang.String r3 = ""
            java.lang.Object[] r4 = new java.lang.Object[r14]
            r4[r13] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r3, r4)
        L_0x0351:
            r0 = r12
        L_0x0352:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin r2 = r1.f169200P
            if (r2 == 0) goto L_0x035f
            if (r0 == 0) goto L_0x035a
            java.util.LinkedList<te3.hx0> r12 = r0.f138979d
        L_0x035a:
            r2.mo3221b1(r12)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x035f:
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            int r0 = r0.mo75910Q3()
            if (r0 <= 0) goto L_0x0376
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            int r0 = r0.mo75910Q3()
            goto L_0x0378
        L_0x0376:
            r0 = 20
        L_0x0378:
            java.lang.String r2 = r1.f169228i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[LinkMicPk] launch random link mic pk, timeout:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            ij1.b r2 = ij1.C60299b.f171929a
            long r3 = (long) r0
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r2.mo85286b(r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x039c:
            java.lang.String r0 = r1.f169228i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[LinkMicPk] accept anchor link mic pk. curPkUser:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r1.mo83051g(r9)
            cl1.d0 r3 = (cl1.C54963d0) r3
            al1.j r3 = r3.mo75901G3()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.mo75901G3()
            if (r0 == 0) goto L_0x0f68
            androidx.lifecycle.i0 r2 = r1.mo83051g(r9)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List r2 = r2.mo75905L3()
            java.lang.String r3 = "business(LiveLinkMicSlic…ass.java).linkMicUserList"
            gy3.C87412m.m108593f(r2, r3)
            monitor-enter(r2)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x04d6 }
            r3.<init>()     // Catch:{ all -> 0x04d6 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x04d6 }
        L_0x03e1:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x04d6 }
            if (r5 == 0) goto L_0x0400
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x04d6 }
            r6 = r5
            al1.j r6 = (al1.C54130j) r6     // Catch:{ all -> 0x04d6 }
            java.lang.String r6 = r6.mo74943j()     // Catch:{ all -> 0x04d6 }
            java.lang.String r7 = r0.mo74943j()     // Catch:{ all -> 0x04d6 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x04d6 }
            if (r6 == 0) goto L_0x03e1
            r3.add(r5)     // Catch:{ all -> 0x04d6 }
            goto L_0x03e1
        L_0x0400:
            monitor-exit(r2)
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0419
            java.lang.String r0 = r1.f169228i
            java.lang.String r2 = "[LinkMicPk] accept anchor link mic pk, but apply user has cancel. skip accept"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            r0.mo75918Z3(r12)
            goto L_0x04d2
        L_0x0419:
            te3.hx0 r2 = new te3.hx0
            r2.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r3 = new com.tencent.mm.protocal.protobuf.FinderContact
            r3.<init>()
            java.lang.String r4 = r0.mo74943j()
            r3.username = r4
            java.lang.String r4 = r0.mo74936e()
            r3.nickname = r4
            java.lang.String r4 = r0.mo74933b()
            r3.headUrl = r4
            te3.up2 r4 = r0.mo74934c()
            r3.live_room_img = r4
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r2.f134919d = r3
            java.lang.String r3 = r0.mo74932a()
            r2.f134927o = r3
            te3.up2 r3 = r0.mo74934c()
            r2.f134935w = r3
            androidx.lifecycle.i0 r3 = r1.mo83051g(r9)
            cl1.d0 r3 = (cl1.C54963d0) r3
            r4 = 2
            r3.mo75919a4(r4)
            qj1.h2 r3 = r1.f169199N
            if (r3 == 0) goto L_0x0461
            qj1.m2 r4 = new qj1.m2
            r4.<init>(r3)
            o40.C61926c.m72668M(r4)
        L_0x0461:
            ij1.b r3 = ij1.C60299b.f171929a
            r3 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r5 = "startAcceptPkMicTimer delay:15000"
            java.lang.String r6 = "Finder.LinkMicTimeoutTimer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            ij1.b$a r5 = ij1.C60299b.f171933e
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r5, r3)
            cj1.n5 r13 = r34.mo83042k()
            if (r13 == 0) goto L_0x04be
            androidx.lifecycle.i0 r3 = r1.mo83051g(r8)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.mo76035e3()
            long r14 = r3.f182392d
            androidx.lifecycle.i0 r3 = r1.mo83051g(r8)
            cl1.u r3 = (cl1.C55001u) r3
            long r16 = r3.mo76037g3()
            androidx.lifecycle.i0 r3 = r1.mo83051g(r8)
            cl1.u r3 = (cl1.C55001u) r3
            java.lang.String r18 = r3.mo76036f3()
            androidx.lifecycle.i0 r3 = r1.mo83051g(r8)
            cl1.u r3 = (cl1.C55001u) r3
            byte[] r19 = r3.mo76034d3()
            r20 = 1
            java.lang.String r22 = r0.mo74939g()
            int r23 = r0.mo74938f()
            java.lang.String r24 = r0.mo74942i()
            r25 = 0
            fl1.f$g r3 = new fl1.f$g
            r3.<init>(r1)
            r21 = r2
            r26 = r3
            r13.mo75723a(r14, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x04be:
            androidx.lifecycle.i0 r2 = r1.mo83051g(r9)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List r2 = r2.mo75905L3()
            if (r2 == 0) goto L_0x04d2
            fl1.f$h r3 = new fl1.f$h
            r3.<init>(r0)
            o40.C61926c.m72700y(r2, r3)
        L_0x04d2:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x04d6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x04d9:
            if (r3 == 0) goto L_0x04e2
            java.lang.String r0 = "PARAM_FINDER_LIVE_BYTES_DATA"
            byte[] r0 = r3.getByteArray(r0)
            goto L_0x04e3
        L_0x04e2:
            r0 = r12
        L_0x04e3:
            te3.hx0 r2 = new te3.hx0
            r2.<init>()
            if (r0 != 0) goto L_0x04eb
            goto L_0x04fc
        L_0x04eb:
            r2.parseFrom(r0)     // Catch:{ Exception -> 0x04ef }
            goto L_0x04fd
        L_0x04ef:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "safeParser"
            java.lang.String r3 = ""
            java.lang.Object[] r5 = new java.lang.Object[r14]
            r5[r13] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r3, r5)
        L_0x04fc:
            r2 = r12
        L_0x04fd:
            java.lang.String r0 = r1.f169228i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "[LinkMicPk] apply anchor link mic pk. toContact:["
            r3.append(r5)
            if (r2 == 0) goto L_0x0511
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r2.f134919d
            if (r5 == 0) goto L_0x0511
            java.lang.String r12 = r5.nickname
        L_0x0511:
            r3.append(r12)
            r5 = 93
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            if (r2 == 0) goto L_0x0f68
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            r3 = 2
            r0.mo75919a4(r3)
            qj1.h2 r0 = r1.f169199N
            if (r0 == 0) goto L_0x053a
            qj1.m2 r3 = new qj1.m2
            r3.<init>(r0)
            o40.C61926c.m72668M(r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x053a:
            cj1.n5 r21 = r34.mo83042k()
            if (r21 == 0) goto L_0x0f68
            androidx.lifecycle.i0 r0 = r1.mo83051g(r8)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.mo76035e3()
            long r5 = r0.f182392d
            androidx.lifecycle.i0 r0 = r1.mo83051g(r8)
            cl1.u r0 = (cl1.C55001u) r0
            long r24 = r0.mo76037g3()
            androidx.lifecycle.i0 r0 = r1.mo83051g(r8)
            cl1.u r0 = (cl1.C55001u) r0
            java.lang.String r26 = r0.mo76036f3()
            androidx.lifecycle.i0 r0 = r1.mo83051g(r8)
            cl1.u r0 = (cl1.C55001u) r0
            byte[] r27 = r0.mo76034d3()
            r28 = 1
            androidx.lifecycle.i0 r0 = r1.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r30 = r0.mo76015n4()
            androidx.lifecycle.i0 r0 = r1.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            int r31 = r0.mo76013m4()
            r32 = 0
            fl1.f$f r0 = new fl1.f$f
            r0.<init>(r1, r2)
            r22 = r5
            r29 = r2
            r33 = r0
            r21.mo75707K(r22, r24, r26, r27, r28, r29, r30, r31, r32, r33)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0594:
            if (r3 == 0) goto L_0x059d
            java.lang.String r0 = "PARAM_FINDER_LIVE_LINK_MIC_ENABLE"
            boolean r0 = r3.getBoolean(r0)
            goto L_0x059e
        L_0x059d:
            r0 = 1
        L_0x059e:
            if (r0 != 0) goto L_0x0603
            androidx.lifecycle.i0 r2 = r1.mo83051g(r9)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.mo75901G3()
            if (r2 == 0) goto L_0x0603
            androidx.lifecycle.i0 r2 = r1.mo83051g(r9)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.mo75901G3()
            if (r2 == 0) goto L_0x05bf
            boolean r2 = r2.mo74944k()
            if (r2 != r14) goto L_0x05bf
            r13 = 1
        L_0x05bf:
            if (r13 == 0) goto L_0x05ca
            ij1.b r2 = ij1.C60299b.f171929a
            r2.mo85288d()
            m69116H(r1, r12, r14, r12)
            goto L_0x0603
        L_0x05ca:
            androidx.lifecycle.i0 r2 = r1.mo83051g(r9)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List r2 = r2.mo75932o3()
            java.lang.String r3 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r2, r3)
            monitor-enter(r2)
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0600 }
        L_0x05de:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0600 }
            if (r4 == 0) goto L_0x05ef
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0600 }
            al1.j r4 = (al1.C54130j) r4     // Catch:{ all -> 0x0600 }
            r5 = 2
            m69115F(r1, r4, r12, r5, r12)     // Catch:{ all -> 0x0600 }
            goto L_0x05de
        L_0x05ef:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0600 }
            monitor-exit(r2)
            androidx.lifecycle.i0 r2 = r1.mo83051g(r9)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List r2 = r2.mo75932o3()
            r2.clear()
            goto L_0x0603
        L_0x0600:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0603:
            if (r0 != 0) goto L_0x061e
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            int r0 = r0.mo75903J3()
            if (r0 != r15) goto L_0x061e
            ij1.b r0 = ij1.C60299b.f171929a
            r0.mo85290f()
            fl1.f$e r0 = new fl1.f$e
            r0.<init>(r1)
            r1.mo84381p(r0)
        L_0x061e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0622:
            java.lang.String r0 = r1.f169228i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "closeLinkMic: curLinkUser:"
            r2.append(r4)
            androidx.lifecycle.i0 r4 = r1.mo83051g(r9)
            cl1.d0 r4 = (cl1.C54963d0) r4
            al1.j r4 = r4.mo75901G3()
            r2.append(r4)
            java.lang.String r4 = ", audienceLinkMicUserList:"
            r2.append(r4)
            androidx.lifecycle.i0 r4 = r1.mo83051g(r9)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.util.List r4 = r4.mo75932o3()
            r2.append(r4)
            java.lang.String r4 = ", linkMicState:"
            r2.append(r4)
            androidx.lifecycle.i0 r4 = r1.mo83051g(r9)
            cl1.d0 r4 = (cl1.C54963d0) r4
            int r4 = r4.mo75903J3()
            r2.append(r4)
            java.lang.String r4 = ", roomPk:"
            r2.append(r4)
            androidx.lifecycle.i0 r4 = r1.mo83051g(r9)
            cl1.d0 r4 = (cl1.C54963d0) r4
            boolean r4 = r4.mo75911R3()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            int r0 = r0.mo75903J3()
            if (r0 != r15) goto L_0x0692
            ij1.b r0 = ij1.C60299b.f171929a
            r0.mo85290f()
            fl1.f$o r0 = new fl1.f$o
            r0.<init>(r1)
            r1.mo84381p(r0)
            return
        L_0x0692:
            if (r3 == 0) goto L_0x069b
            java.lang.String r0 = "PARAM_FINDER_LIVE_MIC_ID"
            java.lang.String r0 = r3.getString(r0)
            goto L_0x069c
        L_0x069b:
            r0 = r12
        L_0x069c:
            androidx.lifecycle.i0 r2 = r1.mo83051g(r9)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.mo75931n3(r0)
            java.lang.String r3 = r1.f169228i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "closeLinkMic: micId:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " micUser:"
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            if (r2 == 0) goto L_0x06d0
            fl1.f$p r0 = new fl1.f$p
            r0.<init>(r1, r2)
            r1.mo84371E(r2, r0)
            rx3.b0 r12 = rx3.C13598b0.f38549a
        L_0x06d0:
            if (r12 != 0) goto L_0x0736
            androidx.lifecycle.i0 r0 = r1.mo83051g(r9)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.mo75901G3()
            if (r0 == 0) goto L_0x06e5
            boolean r0 = r0.mo74944k()
            if (r0 != r14) goto L_0x06e5
            r13 = 1
        L_0x06e5:
            if (r13 == 0) goto L_0x072d
            ij1.b r0 = ij1.C60299b.f171929a
            r0.mo85288d()
            fl1.f$q r0 = new fl1.f$q
            r0.<init>(r1)
            r1.mo84372G(r0)
            di3.d r0 = di3.C86312j.m106911c(r7)
            java.lang.String r2 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            r3 = r0
            ht1.j5 r3 = (ht1.C8777j5) r3
            ak1.g0 r4 = ak1.C0073g0.ANCHOR_BATTLE
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "type"
            ak1.f0$d r5 = ak1.C54067f0.C0052d.BATTLE_ACTION_PK_END_MIC_BREAK
            int r5 = r5.getType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.putOpt(r2, r5)
            java.lang.String r2 = "result"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r0.putOpt(r2, r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.String r5 = r0.toString()
            r6 = 0
            r7 = 4
            r8 = 0
            ht1.C8777j5.C8778a.m8605f(r3, r4, r5, r6, r7, r8)
            goto L_0x0734
        L_0x072d:
            java.lang.String r0 = r1.f169228i
            java.lang.String r2 = "closeLinkMic: no one to close!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x0734:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0736:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x073a:
            if (r3 == 0) goto L_0x0744
            java.lang.String r0 = "PARAM_FINDER_LIVE_MIC_ID"
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x0746
        L_0x0744:
            java.lang.String r0 = ""
        L_0x0746:
            androidx.lifecycle.i0 r2 = r1.mo83051g(r9)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List r2 = r2.mo75904K3()
            if (r2 == 0) goto L_0x0776
            monitor-enter(r2)
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0773 }
        L_0x0757:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0773 }
            if (r4 == 0) goto L_0x076f
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0773 }
            r5 = r4
            al1.j r5 = (al1.C54130j) r5     // Catch:{ all -> 0x0773 }
            java.lang.String r5 = r5.mo74942i()     // Catch:{ all -> 0x0773 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r0)     // Catch:{ all -> 0x0773 }
            if (r5 == 0) goto L_0x0757
            r12 = r4
        L_0x076f:
            monitor-exit(r2)
            al1.j r12 = (al1.C54130j) r12
            goto L_0x0776
        L_0x0773:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0776:
            java.lang.String r2 = r1.f169228i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "anchor start accept link mic micId: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " curLinkUser: "
            r3.append(r4)
            r3.append(r12)
            java.lang.String r4 = " size: "
            r3.append(r4)
            androidx.lifecycle.i0 r4 = r1.mo83051g(r9)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.util.List r4 = r4.mo75904K3()
            int r4 = r4.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            if (r12 == 0) goto L_0x0f68
            te3.hx0 r2 = new te3.hx0
            r2.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r3 = new com.tencent.mm.protocal.protobuf.FinderContact
            r3.<init>()
            java.lang.String r4 = r12.mo74943j()
            r3.username = r4
            java.lang.String r4 = r12.mo74936e()
            r3.nickname = r4
            java.lang.String r4 = r12.mo74933b()
            r3.headUrl = r4
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r2.f134919d = r3
            ij1.b r3 = ij1.C60299b.f171929a
            java.lang.String r4 = r12.mo74942i()
            r5 = 10000(0x2710, double:4.9407E-320)
            r3.mo85285a(r4, r5)
            cj1.n5 r13 = r34.mo83042k()
            if (r13 == 0) goto L_0x0f68
            androidx.lifecycle.i0 r3 = r1.mo83051g(r8)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.mo76035e3()
            long r14 = r3.f182392d
            androidx.lifecycle.i0 r3 = r1.mo83051g(r8)
            cl1.u r3 = (cl1.C55001u) r3
            long r16 = r3.mo76037g3()
            androidx.lifecycle.i0 r3 = r1.mo83051g(r8)
            cl1.u r3 = (cl1.C55001u) r3
            java.lang.String r18 = r3.mo76036f3()
            androidx.lifecycle.i0 r3 = r1.mo83051g(r8)
            cl1.u r3 = (cl1.C55001u) r3
            byte[] r19 = r3.mo76034d3()
            r20 = 1
            int r22 = r12.mo74935d()
            java.lang.String r23 = r12.mo74939g()
            java.lang.String r3 = r12.mo74942i()
            if (r3 != 0) goto L_0x0819
            java.lang.String r3 = ""
        L_0x0819:
            r24 = r3
            int r25 = r12.mo74940h()
            fl1.f$n r3 = new fl1.f$n
            r3.<init>(r1, r12, r2, r0)
            r21 = r2
            r26 = r3
            r13.mo75741j(r14, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0f68
        L_0x082d:
            qj1.l0 r0 = r1.f169203R
            if (r0 == 0) goto L_0x0f68
            r0.mo12145e1()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0838:
            if (r3 == 0) goto L_0x0f68
            java.lang.String r0 = "PARAM_FINDER_LIVE_TOP_COMMENT"
            byte[] r0 = r3.getByteArray(r0)
            if (r0 == 0) goto L_0x0f68
            te3.r41 r2 = new te3.r41
            r2.<init>()
            r2.parseFrom(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            qj1.mf r2 = r1.f169187B
            if (r2 == 0) goto L_0x085b
            r2.mo12155e1(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x085b:
            di3.d r0 = di3.C86312j.m106911c(r7)
            ak1.o r0 = (ak1.C54108o) r0
            ak1.f0 r0 = r0.getConfig()
            ak1.m0 r0 = r0.mo74757g()
            long r2 = r0.mo74785b()
            r4 = 1
            long r2 = r2 + r4
            r0.mo74787d(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0877:
            if (r3 == 0) goto L_0x087f
            java.lang.String r0 = "PARAM_FINDER_LIVE_SCREEN_CLEAR"
            boolean r13 = r3.getBoolean(r0)
        L_0x087f:
            vk1.a r0 = r34.mo83040i()
            if (r0 == 0) goto L_0x0f68
            r0.onScreenClear(r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x088c:
            if (r3 == 0) goto L_0x08ad
            java.lang.String r0 = "PARAM_FINDER_LIVE_ERROR_PAGE"
            byte[] r0 = r3.getByteArray(r0)
            if (r0 == 0) goto L_0x08ad
            te3.ay0 r5 = new te3.ay0
            r5.<init>()
            r5.parseFrom(r0)     // Catch:{ all -> 0x089f }
            goto L_0x08ae
        L_0x089f:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = r1.f169228i
            java.lang.String r7 = "statusChange:"
            java.lang.Object[] r8 = new java.lang.Object[r14]
            r8[r13] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r7, r8)
        L_0x08ad:
            r5 = r12
        L_0x08ae:
            if (r3 == 0) goto L_0x08b7
            java.lang.String r0 = "PARAM_FINDER_LIVE_ERROR_CODE"
            int r0 = r3.getInt(r0)
            goto L_0x08b8
        L_0x08b7:
            r0 = 0
        L_0x08b8:
            vk1.a r3 = r34.mo83040i()
            if (r3 == 0) goto L_0x08e1
            al1.h r3 = r3.getData()
            if (r3 == 0) goto L_0x08e1
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r3 = r3.mo74917a()
            if (r3 == 0) goto L_0x08e1
            java.lang.Class<fh1.t2> r7 = fh1.C8083t2.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r3 = r3.controller(r7)
            fh1.t2 r3 = (fh1.C8083t2) r3
            if (r3 == 0) goto L_0x08df
            gh1.p r3 = r3.mo9169o3()
            if (r3 == 0) goto L_0x08df
            r3.mo84560c(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x08df:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x08e1:
            vk1.a r3 = r34.mo83040i()
            if (r3 == 0) goto L_0x08ec
            com.tencent.p014mm.plugin.finder.live.view.C56032b.hideLoadingLayer$default(r3, r13, r14, r12)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x08ec:
            qj1.je r3 = r1.f169231o
            if (r3 == 0) goto L_0x08f5
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x08f5:
            qj1.i3 r3 = r1.f169230n
            if (r3 == 0) goto L_0x08fe
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x08fe:
            qj1.ff r3 = r1.f169232p
            if (r3 == 0) goto L_0x0907
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0907:
            qj1.a6 r3 = r1.f169234q
            if (r3 == 0) goto L_0x0910
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0910:
            qj1.sd r3 = r1.f169238u
            if (r3 == 0) goto L_0x0919
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0919:
            qj1.e5 r3 = r1.f169237t
            if (r3 == 0) goto L_0x0922
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0922:
            qj1.z0 r3 = r1.f169239v
            if (r3 == 0) goto L_0x092b
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x092b:
            qj1.fa r3 = r1.f169240w
            if (r3 == 0) goto L_0x0934
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0934:
            qj1.vb r3 = r1.f169241x
            if (r3 == 0) goto L_0x093d
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x093d:
            qj1.v9 r3 = r1.f169243y
            if (r3 == 0) goto L_0x0946
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0946:
            qj1.mf r3 = r1.f169187B
            if (r3 == 0) goto L_0x094f
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x094f:
            qj1.u1 r3 = r1.f169188C
            if (r3 == 0) goto L_0x0958
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0958:
            qj1.dd r3 = r1.f169245z
            if (r3 == 0) goto L_0x0961
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0961:
            qj1.pe r3 = r1.f169186A
            if (r3 == 0) goto L_0x096a
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x096a:
            qj1.h2 r3 = r1.f169199N
            if (r3 == 0) goto L_0x0973
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0973:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin r3 = r1.f169200P
            if (r3 == 0) goto L_0x097c
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x097c:
            qj1.w1 r3 = r1.f169201Q
            if (r3 == 0) goto L_0x0985
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0985:
            ii1.e r3 = r1.f169207T
            if (r3 == 0) goto L_0x098e
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x098e:
            qj1.n0 r3 = r1.f169189D
            if (r3 == 0) goto L_0x0997
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0997:
            qj1.q7 r3 = r1.f169197L
            if (r3 == 0) goto L_0x09a0
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x09a0:
            qj1.u7 r3 = r1.f169198M
            if (r3 == 0) goto L_0x09a9
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x09a9:
            qj1.l0 r3 = r1.f169203R
            if (r3 == 0) goto L_0x09b2
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x09b2:
            qj1.yc r3 = r1.f169222b1
            if (r3 == 0) goto L_0x09bb
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x09bb:
            qj1.ld r3 = r1.f169223c1
            if (r3 == 0) goto L_0x09c4
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x09c4:
            qj1.h6 r3 = r1.f169212V0
            if (r3 == 0) goto L_0x09cd
            r3.mo10792g(r11)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x09cd:
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_FORCE_QUIT
            if (r2 != r3) goto L_0x0a15
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin r2 = r34.mo84387v()
            if (r2 == 0) goto L_0x09e6
            androidx.lifecycle.i0 r3 = r1.mo83051g(r4)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.mo76012m3()
            r2.mo77686a1(r3, r5, r0)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x09e6:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin r2 = r34.mo84387v()
            if (r2 == 0) goto L_0x0a2a
            java.lang.String r2 = r1.f169228i
            java.lang.String r3 = "live end by force quit!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.b0 r2 = (cl1.C54946b0) r2
            r2.mo75861e3(r14)
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.b0 r2 = (cl1.C54946b0) r2
            r2.mo75860d3(r5)
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.b0 r2 = (cl1.C54946b0) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.mo75859c3(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a2a
        L_0x0a15:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin r2 = r34.mo84387v()
            if (r2 == 0) goto L_0x0a2a
            androidx.lifecycle.i0 r3 = r1.mo83051g(r4)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.mo76012m3()
            r2.mo77687b1(r3, r5, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0a2a:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin r0 = r34.mo84387v()
            if (r0 == 0) goto L_0x0a35
            r0.mo10792g(r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0a35:
            c50.b r0 = r34.mo83043l()
            if (r0 == 0) goto L_0x0a41
            r2 = 4
            r0.mo85674O(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0a41:
            cj1.n5 r0 = r34.mo83042k()
            if (r0 == 0) goto L_0x0a51
            fl1.f$l r2 = new fl1.f$l
            r2.<init>(r1)
            r0.mo75748p(r14, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0a51:
            cj1.r0 r2 = cj1.C54804r0.f153631a
            androidx.appcompat.app.AppCompatActivity r3 = r34.mo83041j()
            fj1.b r4 = r34.mo83052h()
            r5 = 0
            r6 = 4
            r7 = 0
            cj1.C54804r0.m61728d(r2, r3, r4, r5, r6, r7)
            cj1.i5 r0 = cj1.C54773i5.f153520a
            r0.mo75679b()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.mo77646t()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0a6f:
            if (r3 == 0) goto L_0x0a90
            java.lang.String r0 = "PARAM_FINDER_LIVE_ERROR_PAGE"
            byte[] r0 = r3.getByteArray(r0)
            if (r0 == 0) goto L_0x0a90
            te3.ay0 r2 = new te3.ay0
            r2.<init>()
            r2.parseFrom(r0)     // Catch:{ all -> 0x0a82 }
            goto L_0x0a91
        L_0x0a82:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = r1.f169228i
            java.lang.String r4 = "statusChange:"
            java.lang.Object[] r5 = new java.lang.Object[r14]
            r5[r13] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r5)
        L_0x0a90:
            r2 = r12
        L_0x0a91:
            if (r3 == 0) goto L_0x0a9a
            java.lang.String r0 = "PARAM_FINDER_LIVE_FACE_VERIFY_URL"
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0a9b
        L_0x0a9a:
            r0 = r12
        L_0x0a9b:
            if (r3 == 0) goto L_0x0aa3
            java.lang.String r4 = "PARAM_FINDER_LIVE_USERNAME"
            java.lang.String r12 = r3.getString(r4)
        L_0x0aa3:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin r3 = r34.mo84387v()
            if (r3 == 0) goto L_0x0aae
            r3.mo77688c1(r0, r12, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0aae:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin r0 = r34.mo84387v()
            if (r0 == 0) goto L_0x0f68
            r0.mo10792g(r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0abb:
            if (r3 == 0) goto L_0x0ac8
            java.lang.String r0 = "PARAM_FINDER_LIVE_POST_AFTER_FACE_VERIFY"
            boolean r0 = r3.getBoolean(r0, r13)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0ac9
        L_0x0ac8:
            r0 = r12
        L_0x0ac9:
            java.lang.String r2 = r1.f169228i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "createLive afterFaceVerify:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 == 0) goto L_0x0aeb
            r34.mo84385t()
            goto L_0x0b3e
        L_0x0aeb:
            if (r3 == 0) goto L_0x0af3
            java.lang.String r0 = "PARAM_KEY_POST_OBJECT_DESC"
            byte[] r12 = r3.getByteArray(r0)
        L_0x0af3:
            if (r12 == 0) goto L_0x0b3e
            androidx.lifecycle.i0 r0 = r1.mo83051g(r8)
            cl1.u r0 = (cl1.C55001u) r0
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = new com.tencent.mm.protocal.protobuf.FinderObjectDesc
            r2.<init>()
            r2.parseFrom(r12)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r0.mo76040k3(r2)
            er1.c5 r0 = er1.C58704c5.f168044a
            er1.e5$b r2 = er1.C58713e5.f168073a
            er1.e5$c r3 = r2.mo83624b()
            java.lang.String r5 = r3.mo83625a()
            r3 = 0
            r7 = 1
            r11 = 0
            r9 = 10
            r12 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r4 = r0
            er1.C58704c5.m68184a(r4, r5, r6, r7, r8, r9, r10)
            er1.e5$c r2 = r2.mo83623a()
            java.lang.String r5 = r2.mo83625a()
            r7 = 0
            r9 = 14
            r6 = r3
            r8 = r11
            r10 = r12
            er1.C58704c5.m68184a(r4, r5, r6, r7, r8, r9, r10)
            er1.f5 r0 = er1.C58728f5.f168144a
            long r2 = eb0.C31543z5.m39451a()
            r0.mo83646d(r2)
            r34.mo84385t()
        L_0x0b3e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0b42:
            r34.mo84367A()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0b49:
            java.lang.String r0 = r1.f169228i
            java.lang.String r2 = "start live failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            androidx.lifecycle.i0 r0 = r1.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.mo75997d4()
            if (r0 != 0) goto L_0x0ba1
            qj1.sd r0 = r1.f169238u
            if (r0 == 0) goto L_0x0b66
            r0.mo10792g(r11)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0b66:
            qj1.i3 r0 = r1.f169230n
            if (r0 == 0) goto L_0x0b6f
            r0.mo10792g(r11)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0b6f:
            qj1.w3 r0 = r1.f169211V
            if (r0 == 0) goto L_0x0b78
            r0.mo10792g(r11)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0b78:
            vk1.a r0 = r34.mo83040i()
            if (r0 == 0) goto L_0x0ba1
            androidx.lifecycle.i0 r2 = r1.mo83051g(r4)
            cl1.o r2 = (cl1.C54991o) r2
            java.lang.String r2 = r2.mo76012m3()
            androidx.appcompat.app.AppCompatActivity r4 = r34.mo83041j()
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131832052(0x7f112cf4, float:1.9297147E38)
            java.lang.String r4 = r4.getString(r6)
            java.lang.String r6 = "context.resources.getStr…_local_network_error_tip)"
            gy3.C87412m.m108593f(r4, r6)
            r0.showTipWithBlurBg(r2, r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0ba1:
            di3.d r0 = di3.C86312j.m106911c(r7)
            java.lang.String r2 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            r14 = r0
            ht1.j5 r14 = (ht1.C8777j5) r14
            long r15 = r5.mo56a()
            ak1.f0$m0 r0 = ak1.C54067f0.C0065m0.LIVE_START_NETWORK_ERROR
            int r0 = r0.getType()
            java.lang.String r17 = java.lang.String.valueOf(r0)
            r18 = 0
            r19 = 4
            r20 = 0
            ht1.C8777j5.C8778a.m8600a(r14, r15, r17, r18, r19, r20)
            di3.d r0 = di3.C86312j.m106911c(r7)
            ak1.o r0 = (ak1.C54108o) r0
            if (r3 == 0) goto L_0x0bd2
            java.lang.String r2 = "live_user_exit_reason"
            int r13 = r3.getInt(r2, r13)
        L_0x0bd2:
            r0.dy0(r13)
            di3.d r0 = di3.C86312j.m106911c(r7)
            ak1.o r0 = (ak1.C54108o) r0
            ak1.f0$p r2 = ak1.C54067f0.C54077p.LIVE_EXIT_ERROR
            r0.ay0(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0be4:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r2 = r1.mo83051g(r8)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.mo76035e3()
            long r2 = r2.f182392d
            r4 = 0
            r0.mo77639m(r4, r2)
            cj1.i r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159384o
            if (r0 == 0) goto L_0x0bfe
            r0.mo75676e(r14)
        L_0x0bfe:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0c02:
            qj1.e5 r0 = r1.f169237t
            if (r0 == 0) goto L_0x0f66
            android.view.ViewGroup r2 = r0.mo82892e0()
            fl1.f$m r4 = new fl1.f$m
            r4.<init>(r3, r1, r0)
            r2.post(r4)
            goto L_0x0f66
        L_0x0c14:
            c50.b r0 = r34.mo83043l()
            if (r0 == 0) goto L_0x0c27
            d50.i r0 = r0.getLiveStatus()
            if (r0 == 0) goto L_0x0c27
            boolean r0 = r0.mo82887i()
            if (r0 != r14) goto L_0x0c27
            r13 = 1
        L_0x0c27:
            if (r13 == 0) goto L_0x0c32
            qj1.i3 r0 = r1.f169230n
            if (r0 == 0) goto L_0x0c32
            r0.mo87799f1()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0c32:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0c36:
            if (r3 == 0) goto L_0x0c43
            java.lang.String r0 = "PARAM_FINDER_LIVE_FORCE_TASK"
            boolean r0 = r3.getBoolean(r0, r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0c44
        L_0x0c43:
            r0 = r12
        L_0x0c44:
            if (r3 == 0) goto L_0x0c4f
            java.lang.String r2 = "PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE"
            int r2 = r3.getInt(r2, r13)
            r22 = r2
            goto L_0x0c51
        L_0x0c4f:
            r22 = 0
        L_0x0c51:
            if (r3 == 0) goto L_0x0c58
            java.lang.String r2 = "PARAM_LIVE_MINI_WINDOW_OP_TYPE"
            r3.getInt(r2, r13)
        L_0x0c58:
            c50.b r2 = r34.mo83043l()
            if (r2 == 0) goto L_0x0c6c
            d50.i r2 = r2.getLiveStatus()
            if (r2 == 0) goto L_0x0c6c
            boolean r2 = r2.mo82881c()
            if (r2 != 0) goto L_0x0c6c
            r2 = 1
            goto L_0x0c6d
        L_0x0c6c:
            r2 = 0
        L_0x0c6d:
            if (r2 == 0) goto L_0x0d11
            c50.b r2 = r34.mo83043l()
            if (r2 == 0) goto L_0x0c83
            d50.i r2 = r2.getLiveStatus()
            if (r2 == 0) goto L_0x0c83
            boolean r2 = r2.mo82887i()
            if (r2 != r14) goto L_0x0c83
            r2 = 1
            goto L_0x0c84
        L_0x0c83:
            r2 = 0
        L_0x0c84:
            if (r2 == 0) goto L_0x0c91
            c50.b r2 = r34.mo83043l()
            if (r2 == 0) goto L_0x0cb0
            android.graphics.Bitmap r12 = r2.mo85678V()
            goto L_0x0cb0
        L_0x0c91:
            c50.b r2 = r34.mo83043l()
            if (r2 == 0) goto L_0x0ca4
            d50.i r2 = r2.getLiveStatus()
            if (r2 == 0) goto L_0x0ca4
            boolean r2 = r2.mo82880b()
            if (r2 != r14) goto L_0x0ca4
            r13 = 1
        L_0x0ca4:
            if (r13 == 0) goto L_0x0cb0
            androidx.lifecycle.i0 r2 = r1.mo83051g(r4)
            cl1.o r2 = (cl1.C54991o) r2
            android.graphics.Bitmap r12 = r2.mo75975O3()
        L_0x0cb0:
            r24 = r12
            zt3.t r2 = zt3.C119157j.f356862d
            cj1.v5 r3 = cj1.C28593v5.f78481d
            zt3.j r2 = (zt3.C119157j) r2
            java.lang.String r5 = "Finder.LiveExceptionMonitor"
            r2.mo183876g(r3, r5)
            c50.b r18 = r34.mo83043l()
            if (r18 == 0) goto L_0x0ce1
            androidx.appcompat.app.AppCompatActivity r19 = r34.mo83041j()
            if (r0 == 0) goto L_0x0cd0
            boolean r14 = r0.booleanValue()
            r20 = r14
            goto L_0x0cd2
        L_0x0cd0:
            r20 = 1
        L_0x0cd2:
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 208(0xd0, float:2.91E-43)
            r28 = 0
            b50.C54408d.C54409a.m61121a(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0ce1:
            vk1.a r0 = r34.mo83040i()
            if (r0 == 0) goto L_0x0cfa
            al1.h r0 = r0.getData()
            if (r0 == 0) goto L_0x0cfa
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r0.mo74917a()
            if (r0 == 0) goto L_0x0cfa
            gh1.j r2 = gh1.C59447j.f169870a
            r2.mo84550b(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0cfa:
            androidx.lifecycle.i0 r0 = r1.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.mo75984T3()
            r2 = 524288(0x80000, float:7.34684E-40)
            boolean r0 = o40.C61926c.m72696u(r0, r2)
            if (r0 == 0) goto L_0x0d11
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.mo77611N()
        L_0x0d11:
            di3.d r0 = di3.C86312j.m106911c(r7)
            ak1.o r0 = (ak1.C54108o) r0
            ak1.f0 r0 = r0.getConfig()
            ak1.m0 r0 = r0.mo74757g()
            long r2 = r0.mo74784a()
            r4 = 1
            long r2 = r2 + r4
            r0.mo74786c(r2)
            java.lang.Class<cl1.a1> r0 = cl1.C54943a1.class
            androidx.lifecycle.i0 r0 = r1.mo83051g(r0)
            cl1.a1 r0 = (cl1.C54943a1) r0
            r0.mo75855c3()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0d38:
            androidx.lifecycle.i0 r0 = r1.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154295b1
            if (r0 != 0) goto L_0x0d43
            r13 = 1
        L_0x0d43:
            if (r13 != 0) goto L_0x0d9d
            ok1.e r0 = ok1.C62042e.f176370a
            fj1.b r2 = r34.mo83052h()
            boolean r0 = r0.mo86991B(r2)
            if (r0 == 0) goto L_0x0d9d
            androidx.lifecycle.i0 r0 = r1.mo83051g(r8)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.mo76035e3()
            long r2 = r0.f182392d
            androidx.lifecycle.i0 r0 = r1.mo83051g(r8)
            cl1.u r0 = (cl1.C55001u) r0
            byte[] r0 = r0.mo76034d3()
            zc1.b r5 = zc1.C66785b.f191882e
            java.lang.String r5 = r5.mo90662O5()
            androidx.lifecycle.i0 r6 = r1.mo83051g(r8)
            cl1.u r6 = (cl1.C55001u) r6
            long r6 = r6.mo76037g3()
            androidx.lifecycle.i0 r4 = r1.mo83051g(r4)
            cl1.o r4 = (cl1.C54991o) r4
            cj1.f r4 = r4.mo76008k3()
            te3.zv0 r4 = r4.mo75648e()
            r17 = 0
            dj1.o0 r8 = new dj1.o0
            kk1.a r18 = new kk1.a
            r9 = r18
            r10 = r2
            r12 = r0
            r13 = r5
            r14 = r6
            r16 = r4
            r9.<init>(r10, r12, r13, r14, r16)
            r9 = r8
            r9.<init>(r10, r12, r13, r14, r16, r17, r18)
            r8.mo9225i()
        L_0x0d9d:
            c50.b r0 = r34.mo83043l()
            if (r0 == 0) goto L_0x0da8
            r0.mo85693l0()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0da8:
            vk1.a r0 = r34.mo83040i()
            if (r0 == 0) goto L_0x0f68
            r0.finish()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0db5:
            if (r3 == 0) goto L_0x0dbd
            java.lang.String r2 = "PARAM_FINDER_LIVE_START_BY_MINI_WINDOW"
            boolean r13 = r3.getBoolean(r2)
        L_0x0dbd:
            r34.mo84382q()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.mo77647u()
            androidx.lifecycle.i0 r3 = r1.mo83051g(r8)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.mo76035e3()
            long r8 = r3.f182392d
            r10 = 0
            r2.mo77639m(r10, r8)
            c50.b r3 = r34.mo83043l()
            if (r3 == 0) goto L_0x0ddf
            r3.mo75212E()
        L_0x0ddf:
            androidx.lifecycle.i0 r3 = r1.mo83051g(r4)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r3 = r3.mo75960G3()
            if (r3 == 0) goto L_0x0e0f
            c50.b r3 = r34.mo83043l()
            if (r3 == 0) goto L_0x0e1a
            androidx.appcompat.app.AppCompatActivity r6 = r34.mo83041j()
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131233614(0x7f080b4e, float:1.808337E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r8)
            java.lang.String r8 = "context.resources.getDra…le.live_audio_mode_frame)"
            gy3.C87412m.m108593f(r6, r8)
            android.graphics.Bitmap r6 = o40.C61926c.m72686k(r6)
            r3.mo75215a(r6)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0e1a
        L_0x0e0f:
            c50.b r3 = r34.mo83043l()
            if (r3 == 0) goto L_0x0e1a
            r3.mo85705x0()
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0e1a:
            sl1.c r3 = r1.f169191F
            if (r3 == 0) goto L_0x0e28
            sl1.d r6 = new sl1.d
            r6.<init>(r3)
            o40.C61926c.m72668M(r6)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0e28:
            xs1.d r3 = r1.f169193H
            if (r3 == 0) goto L_0x0e3d
            boolean r6 = r3.mo90514a1()
            if (r6 == 0) goto L_0x0e33
            goto L_0x0e3b
        L_0x0e33:
            xs1.c r6 = new xs1.c
            r6.<init>(r3)
            o40.C61926c.m72668M(r6)
        L_0x0e3b:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0e3d:
            qj1.ea r3 = r1.f169205S
            if (r3 == 0) goto L_0x0e46
            r3.mo87760d1()
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0e46:
            qj1.s2 r3 = r1.f169219Z
            if (r3 == 0) goto L_0x0e4f
            r3.mo12242Z0()
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0e4f:
            androidx.lifecycle.i0 r3 = r1.mo83051g(r4)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r3 = r3.mo75999e4()
            if (r3 == 0) goto L_0x0e67
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r1.f169226f1
            r3.stopTimer()
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r1.f169226f1
            r8 = 1000(0x3e8, double:4.94E-321)
            r3.startTimer(r8)
        L_0x0e67:
            r34.mo84374J()
            r34.mo84373I()
            ok1.e r3 = ok1.C62042e.f176370a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r3.mo87106p0()
            java.lang.String r4 = "live_status_flag"
            r3.putInt(r4, r14)
            vk1.a r3 = r34.mo83040i()
            if (r3 == 0) goto L_0x0e83
            r3.checkPauseStateWhenLiveStart()
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0e83:
            cj1.i r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159384o
            if (r3 == 0) goto L_0x0e8a
            r3.mo75676e(r14)
        L_0x0e8a:
            di3.d r3 = di3.C86312j.m106911c(r7)
            ak1.o r3 = (ak1.C54108o) r3
            ak1.f0 r3 = r3.getConfig()
            boolean r3 = r3.mo74760j()
            if (r3 != 0) goto L_0x0eb4
            di3.d r3 = di3.C86312j.m106911c(r7)
            java.lang.String r4 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r3, r4)
            r20 = r3
            ht1.j5 r20 = (ht1.C8777j5) r20
            ak1.g0 r21 = ak1.C0073g0.LIVE_ANCHOR_ACTION_BEGIN
            java.lang.String r22 = ""
            r23 = 0
            r24 = 4
            r25 = 0
            ht1.C8777j5.C8778a.m8605f(r20, r21, r22, r23, r24, r25)
        L_0x0eb4:
            java.lang.Class<cl1.h1> r3 = cl1.C54979h1.class
            androidx.lifecycle.i0 r3 = r2.mo77630e(r3)
            cl1.h1 r3 = (cl1.C54979h1) r3
            if (r3 == 0) goto L_0x0eec
            te3.gj1 r3 = r3.mo75939e3()
            if (r3 == 0) goto L_0x0eec
            int r4 = r3.f183343d
            if (r4 != 0) goto L_0x0ecc
            r3 = 3
            r22 = 3
            goto L_0x0ed0
        L_0x0ecc:
            int r3 = r3.f183344e
            r22 = r3
        L_0x0ed0:
            di3.d r3 = di3.C86312j.m106911c(r7)
            java.lang.String r4 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r3, r4)
            r20 = r3
            ak1.o r20 = (ak1.C54108o) r20
            r21 = 8
            r23 = 0
            r25 = 0
            r26 = 12
            r27 = 0
            ak1.C54108o.Ux0(r20, r21, r22, r23, r25, r26, r27)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0eec:
            java.lang.String r3 = "activeMicHeartBeat"
            hj1.b r2 = r2.mo77638l(r3)
            if (r2 == 0) goto L_0x0efb
            r3 = 20000(0x4e20, double:9.8813E-320)
            r2.mo58874c(r3)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0efb:
            androidx.lifecycle.i0 r2 = r1.mo83051g(r0)
            com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice r2 = (com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) r2
            int r2 = r2.mo78215d3()
            androidx.lifecycle.i0 r0 = r1.mo83051g(r0)
            com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice r0 = (com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) r0
            long r3 = r0.mo78214c3()
            if (r2 == 0) goto L_0x0f2b
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0f2b
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r6 = "entrance_type"
            r0.put(r6, r2)
            java.lang.String r2 = "entrance_id"
            r0.put(r2, r3)
            java.lang.String r0 = r0.toString()
            goto L_0x0f2d
        L_0x0f2b:
            java.lang.String r0 = ""
        L_0x0f2d:
            java.lang.String r2 = "if (entranceType != 0 &&…     \"\"\n                }"
            gy3.C87412m.m108593f(r0, r2)
            di3.d r2 = di3.C86312j.m106911c(r7)
            java.lang.String r3 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            r14 = r2
            ht1.j5 r14 = (ht1.C8777j5) r14
            long r15 = r5.mo56a()
            r18 = 0
            r19 = 4
            r20 = 0
            r17 = r0
            ht1.C8777j5.C8778a.m8600a(r14, r15, r17, r18, r19, r20)
            java.lang.String r0 = r1.f169228i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "START_LIVE byMiniWin:"
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f68
        L_0x0f66:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0f68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fl1.C59161f.mo84370D(d60.b$b, android.os.Bundle):void");
    }

    /* renamed from: E */
    public final void mo84371E(C54130j jVar, C32226l<? super Boolean, C13598b0> lVar) {
        C54795n5 k;
        String str = this.f169228i;
        Log.m105924i(str, "postCloseLinkMsg linkMicUser:" + jVar);
        if (jVar != null && (k = mo83042k()) != null) {
            k.mo75700D(1, (C49765hx0) null, jVar.f151997a, jVar.f152002f, new C59180r(this, lVar, jVar, jVar));
        }
    }

    /* renamed from: G */
    public final void mo84372G(C32226l<? super Boolean, C13598b0> lVar) {
        String str;
        Class cls = C54963d0.class;
        String str2 = this.f169228i;
        Log.m105924i(str2, "postCloseLinkPkMsg curLinkUser:" + ((C54963d0) mo83051g(cls)).f154073p);
        C49765hx0 hx02 = new C49765hx0();
        FinderContact finderContact = new FinderContact();
        C54130j jVar = ((C54963d0) mo83051g(cls)).f154073p;
        String str3 = null;
        finderContact.username = jVar != null ? jVar.f151999c : null;
        C54130j jVar2 = ((C54963d0) mo83051g(cls)).f154073p;
        finderContact.nickname = jVar2 != null ? jVar2.f152000d : null;
        C54130j jVar3 = ((C54963d0) mo83051g(cls)).f154073p;
        if (jVar3 != null) {
            str3 = jVar3.f151998b;
        }
        finderContact.headUrl = str3;
        hx02.f134919d = finderContact;
        C54130j jVar4 = ((C54963d0) mo83051g(cls)).f154073p;
        String str4 = (jVar4 == null || (str = jVar4.f152002f) == null) ? ((C54963d0) mo83051g(cls)).f154070j : str;
        C54795n5 k = mo83042k();
        if (k != null) {
            k.mo75740i0(1, ((C54991o) mo83051g(C54991o.class)).mo76015n4(), str4, 1, hx02, new C59182s(this, lVar));
        }
    }

    /* renamed from: I */
    public final void mo84373I() {
        C62042e.f176370a.mo86993B1(this.f166851d, "preloadLeadsComponetList-livingUIC", (C32226l<? super C49778i01, C13598b0>) null);
    }

    /* renamed from: J */
    public final void mo84374J() {
        Class cls = C55001u.class;
        if (((C54979h1) mo83051g(C54979h1.class)).f154134f) {
            C12490l0 l0Var = this.f169203R;
            if (l0Var != null) {
                l0Var.mo12142b1();
            }
            C54795n5 k = mo83042k();
            if (k != null) {
                AppCompatActivity appCompatActivity = this.f166836e;
                C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                k.mo75746n((MMActivity) appCompatActivity, ((C55001u) mo83051g(cls)).f154420q.f182392d, ((C55001u) mo83051g(cls)).f154416j, C66785b.f191882e.mo90662O5(), ((C55001u) mo83051g(cls)).f154417n, (String) null, 1, ((C54991o) mo83051g(C54991o.class)).f154357q3, new C59184t(this));
            }
        }
    }

    /* renamed from: K */
    public final void mo84375K() {
        String valueOf;
        Class cls = C54108o.class;
        ((C54108o) C86312j.m106911c(cls)).getClass();
        C54067f0 f0Var = C54108o.f151869h;
        if (f0Var.f151452d0) {
            valueOf = String.valueOf(4);
            ((C54108o) C86312j.m106911c(cls)).getClass();
            f0Var.f151452d0 = false;
        } else {
            ((C54108o) C86312j.m106911c(cls)).getClass();
            if (!f0Var.f151455f) {
                ((C54108o) C86312j.m106911c(cls)).getClass();
                if (!f0Var.f151457g) {
                    valueOf = ((C61130g) C86312j.m106911c(C61130g.class)).mo33248vG() ? String.valueOf(5) : String.valueOf(3);
                }
            }
            valueOf = String.valueOf(6);
        }
        String str = valueOf;
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_ACTION_MINIMIZE, str, (String) null, 4, (Object) null);
    }

    /* renamed from: L */
    public final void mo84376L(int i) {
        Class cls = LiveAnchorSlice.class;
        int i2 = ((LiveAnchorSlice) mo83051g(cls)).f160032h;
        long j = ((LiveAnchorSlice) mo83051g(cls)).f160033i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", 12);
        jSONObject.put("entrance_type", i2);
        jSONObject.put("entrance_id", j);
        jSONObject.put("result", i);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c, 36, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: M */
    public final <T extends C62660c> T mo84377M(C32224a<? extends T> aVar) {
        try {
            return (C62660c) aVar.invoke();
        } catch (Throwable th) {
            Log.m105921e(this.f169228i, "safetyInflate exception", th);
            C62042e eVar = C62042e.f176370a;
            eVar.mo87120u("onSelected exception msg: " + th.getMessage());
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (ok1.C62042e.f176371b != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r4 = r4.f172989A;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c1  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84378N(boolean r13) {
        /*
            r12 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.Class<cl1.d0> r1 = cl1.C54963d0.class
            r2 = 0
            r3 = 1
            if (r13 != 0) goto L_0x0027
            c50.b r4 = r12.f166839h
            if (r4 == 0) goto L_0x0018
            d50.i r4 = r4.f172989A
            if (r4 == 0) goto L_0x0018
            boolean r4 = r4.mo82881c()
            if (r4 != r3) goto L_0x0018
            r4 = 1
            goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            if (r4 == 0) goto L_0x0025
            ok1.e r4 = ok1.C62042e.f176370a
            r4.getClass()
            boolean r4 = ok1.C62042e.f176371b
            if (r4 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r4 = 0
            goto L_0x0028
        L_0x0027:
            r4 = 1
        L_0x0028:
            java.lang.String r5 = r12.f169228i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "startLiveVideo,float mode:"
            r6.append(r7)
            c50.b r7 = r12.f166839h
            r8 = 0
            if (r7 == 0) goto L_0x0047
            d50.i r7 = r7.f172989A
            if (r7 == 0) goto L_0x0047
            boolean r7 = r7.mo82881c()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x0048
        L_0x0047:
            r7 = r8
        L_0x0048:
            r6.append(r7)
            java.lang.String r7 = ", normal mode:"
            r6.append(r7)
            c50.b r7 = r12.f166839h
            if (r7 == 0) goto L_0x0060
            d50.i r7 = r7.f172989A
            if (r7 == 0) goto L_0x0060
            boolean r7 = r7.mo82886h()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
        L_0x0060:
            r6.append(r8)
            java.lang.String r7 = ", liveData.enableAudioMode:"
            r6.append(r7)
            androidx.lifecycle.i0 r7 = r12.mo83051g(r0)
            cl1.o r7 = (cl1.C54991o) r7
            boolean r7 = r7.mo75960G3()
            r6.append(r7)
            java.lang.String r7 = ", pkMicUser:"
            r6.append(r7)
            androidx.lifecycle.i0 r7 = r12.mo83051g(r1)
            cl1.d0 r7 = (cl1.C54963d0) r7
            al1.j r7 = r7.f154073p
            r6.append(r7)
            java.lang.String r7 = ",fromMiniWindow:"
            r6.append(r7)
            r6.append(r13)
            java.lang.String r13 = ",directorStartFromMiniW:"
            r6.append(r13)
            ok1.e r13 = ok1.C62042e.f176370a
            r13.getClass()
            boolean r13 = ok1.C62042e.f176371b
            r6.append(r13)
            java.lang.String r13 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            c50.b r13 = r12.f166839h
            if (r13 == 0) goto L_0x00b3
            d50.i r13 = r13.f172989A
            if (r13 == 0) goto L_0x00b3
            boolean r13 = r13.mo82881c()
            if (r13 != r3) goto L_0x00b3
            r13 = 1
            goto L_0x00b4
        L_0x00b3:
            r13 = 0
        L_0x00b4:
            if (r13 == 0) goto L_0x00f5
            zt3.t r13 = zt3.C119157j.f356862d
            cj1.w5 r5 = cj1.C28594w5.f78482d
            zt3.j r13 = (zt3.C119157j) r13
            java.lang.String r6 = "Finder.LiveExceptionMonitor"
            r13.mo183876g(r5, r6)
            c50.b r13 = r12.f166839h
            if (r13 == 0) goto L_0x00c8
            r13.mo75580f0()
        L_0x00c8:
            vk1.a r13 = r12.f166837f
            if (r13 == 0) goto L_0x00db
            al1.h r13 = r13.getData()
            if (r13 == 0) goto L_0x00db
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r13 = r13.f151979f
            if (r13 == 0) goto L_0x00db
            gh1.j r5 = gh1.C59447j.f169870a
            r5.mo84553e(r13)
        L_0x00db:
            java.lang.Class<ak1.o> r13 = ak1.C54108o.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            java.lang.String r5 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r13, r5)
            r6 = r13
            ht1.j5 r6 = (ht1.C8777j5) r6
            ak1.g0 r7 = ak1.C0073g0.LIVE_ANCHOR_ACTION_MINIMIZE
            java.lang.String r8 = java.lang.String.valueOf(r3)
            r9 = 0
            r10 = 4
            r11 = 0
            ht1.C8777j5.C8778a.m8605f(r6, r7, r8, r9, r10, r11)
        L_0x00f5:
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r5 = "PARAM_FINDER_LIVE_SWITCH_MODE_FROM_MINIWINDOW"
            r13.putBoolean(r5, r4)
            java.lang.String r4 = "PARAM_FINDER_LIVE_AUDIO_MODE"
            androidx.lifecycle.i0 r5 = r12.mo83051g(r0)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.mo75960G3()
            r13.putBoolean(r4, r5)
            java.lang.String r4 = "PARAM_FINDER_LIVE_IS_SHARE_MODE"
            c50.b r5 = r12.f166839h
            if (r5 == 0) goto L_0x011b
            d50.i r5 = r5.f172989A
            if (r5 == 0) goto L_0x011b
            boolean r5 = r5.f166264k
            goto L_0x011c
        L_0x011b:
            r5 = 0
        L_0x011c:
            r13.putBoolean(r4, r5)
            vk1.a r4 = r12.f166837f
            if (r4 == 0) goto L_0x0128
            d60.b$b r5 = d60.C58124b.C58125b.FINDER_LIVE_MODE_SWITCH
            r4.statusChange(r5, r13)
        L_0x0128:
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r4 = "PARAM_FINDER_LIVE_IS_MUTE_MIC"
            androidx.lifecycle.i0 r0 = r12.mo83051g(r0)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154274W2
            r13.putBoolean(r4, r0)
            vk1.a r0 = r12.f166837f
            if (r0 == 0) goto L_0x0143
            d60.b$b r4 = d60.C58124b.C58125b.FINDER_LIVE_MUTE_MIC
            r0.statusChange(r4, r13)
        L_0x0143:
            c50.b r13 = r12.f166839h
            if (r13 == 0) goto L_0x01b7
            androidx.lifecycle.i0 r13 = r12.mo83051g(r1)
            cl1.d0 r13 = (cl1.C54963d0) r13
            al1.j r13 = r13.f154073p
            if (r13 == 0) goto L_0x016b
            c50.b r13 = r12.f166839h
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.live.core.core.anchor.LiveAnchorTRTCCore"
            gy3.C87412m.m108592e(r13, r0)
            androidx.lifecycle.i0 r0 = r12.mo83051g(r1)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.f154073p
            if (r0 == 0) goto L_0x0166
            java.lang.String r0 = r0.f151997a
            if (r0 != 0) goto L_0x0168
        L_0x0166:
            java.lang.String r0 = ""
        L_0x0168:
            r13.mo75572E0(r0)
        L_0x016b:
            androidx.lifecycle.i0 r13 = r12.mo83051g(r1)
            cl1.d0 r13 = (cl1.C54963d0) r13
            java.util.List<al1.j> r13 = r13.f154074q
            if (r13 == 0) goto L_0x017b
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x017c
        L_0x017b:
            r2 = 1
        L_0x017c:
            if (r2 != 0) goto L_0x01b7
            androidx.lifecycle.i0 r13 = r12.mo83051g(r1)
            cl1.d0 r13 = (cl1.C54963d0) r13
            java.util.List<al1.j> r13 = r13.f154074q
            java.lang.String r0 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r13, r0)
            monitor-enter(r13)
            java.util.Iterator r0 = r13.iterator()     // Catch:{ all -> 0x01b4 }
        L_0x0190:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x01b4 }
            if (r2 == 0) goto L_0x01b2
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x01b4 }
            al1.j r2 = (al1.C54130j) r2     // Catch:{ all -> 0x01b4 }
            int r3 = r2.f152001e     // Catch:{ all -> 0x01b4 }
            r4 = 2
            if (r3 != r4) goto L_0x0190
            c50.b r3 = r12.f166839h     // Catch:{ all -> 0x01b4 }
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.live.core.core.anchor.LiveAnchorTRTCCore"
            gy3.C87412m.m108592e(r3, r4)     // Catch:{ all -> 0x01b4 }
            java.lang.String r2 = r2.f151997a     // Catch:{ all -> 0x01b4 }
            if (r2 != 0) goto L_0x01ae
            java.lang.String r2 = ""
        L_0x01ae:
            r3.mo75572E0(r2)     // Catch:{ all -> 0x01b4 }
            goto L_0x0190
        L_0x01b2:
            monitor-exit(r13)
            goto L_0x01b7
        L_0x01b4:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x01b7:
            androidx.lifecycle.i0 r13 = r12.mo83051g(r1)
            cl1.d0 r13 = (cl1.C54963d0) r13
            al1.j r13 = r13.f154073p
            if (r13 == 0) goto L_0x01d8
            ii1.e r0 = r12.f169207T
            if (r0 == 0) goto L_0x01ca
            java.lang.String r13 = r13.f151997a
            r0.mo85280d1(r13)
        L_0x01ca:
            qj1.o2 r13 = r12.f169235r
            if (r13 == 0) goto L_0x01d1
            r13.mo87850a1()
        L_0x01d1:
            qj1.o2 r13 = r12.f169235r
            if (r13 == 0) goto L_0x01d8
            r13.mo87851b1()
        L_0x01d8:
            vk1.a r13 = r12.f166837f
            if (r13 == 0) goto L_0x01e4
            fl1.f$u r0 = new fl1.f$u
            r0.<init>(r12)
            r13.post(r0)
        L_0x01e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fl1.C59161f.mo84378N(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r4 = r4.f172989A;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84379O() {
        /*
            r8 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            vk1.a r1 = r8.f166837f
            if (r1 == 0) goto L_0x014f
            java.lang.String r2 = r8.f169228i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "stopLiveVideo,float mode:"
            r3.append(r4)
            c50.b r4 = r8.f166839h
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
            c50.b r4 = r8.f166839h
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
            boolean r4 = r1.isLiveFinished()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            boolean r2 = r1.isManualClosed()
            if (r2 != 0) goto L_0x014f
            boolean r2 = r1.isLiveStarted()
            if (r2 == 0) goto L_0x014f
            boolean r2 = r1.isLiveFinished()
            if (r2 != 0) goto L_0x014f
            c50.b r2 = r8.f166839h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x00a2
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x00a2
            boolean r2 = r2.mo82886h()
            if (r2 != r3) goto L_0x00a2
            r2 = 1
            goto L_0x00a3
        L_0x00a2:
            r2 = 0
        L_0x00a3:
            if (r2 == 0) goto L_0x014f
            boolean r1 = r1.needMiniWindow()
            if (r1 == 0) goto L_0x014f
            androidx.lifecycle.i0 r0 = r8.mo83051g(r0)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = o40.C61926c.m72696u(r0, r1)
            if (r0 != 0) goto L_0x014f
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            vk1.a r1 = r8.f166837f
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r1.needRemoveActivity()
            goto L_0x00ca
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            java.lang.String r2 = "PARAM_FINDER_LIVE_FORCE_TASK"
            r0.putBoolean(r2, r1)
            vk1.a r1 = r8.f166837f
            if (r1 == 0) goto L_0x00db
            boolean r1 = r1.isSwipeBack()
            if (r1 != r3) goto L_0x00db
            r1 = 1
            goto L_0x00dc
        L_0x00db:
            r1 = 0
        L_0x00dc:
            if (r1 == 0) goto L_0x00e0
            r1 = 1
            goto L_0x00e1
        L_0x00e0:
            r1 = 3
        L_0x00e1:
            java.lang.String r2 = "PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE"
            r0.putInt(r2, r1)
            r1 = 13
            java.lang.String r2 = "PARAM_LIVE_MINI_WINDOW_OP_TYPE"
            r0.putInt(r2, r1)
            java.lang.Class<aw.d> r1 = p447aw.C103918d.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            aw.d r1 = (p447aw.C103918d) r1
            androidx.appcompat.app.AppCompatActivity r2 = r8.f166836e
            r6 = 21
            boolean r1 = r1.mo125776TW(r2, r6)
            if (r1 != 0) goto L_0x013b
            java.lang.String r0 = r8.f169228i
            java.lang.String r1 = "showVideoTalking, permission denied"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            vk1.a r0 = r8.f166837f
            if (r0 != 0) goto L_0x010c
            goto L_0x010f
        L_0x010c:
            r0.setMiniWinPermission(r3)
        L_0x010f:
            vk1.a r0 = r8.f166837f
            if (r0 == 0) goto L_0x0119
            d60.b$b r1 = d60.C58124b.C58125b.MINI_WINDOW_PERMISSION
            r2 = 2
            d60.C58124b.C7172a.m7372a(r0, r1, r5, r2, r5)
        L_0x0119:
            java.lang.Class<aw.c> r0 = p447aw.C54369c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            aw.c r1 = (p447aw.C54369c) r1
            androidx.appcompat.app.AppCompatActivity r2 = r8.f166836e
            r3 = 21
            r0 = 2131832150(0x7f112d56, float:1.9297346E38)
            java.lang.String r4 = r2.getString(r0)
            fl1.e2 r5 = new fl1.e2
            r5.<init>(r8)
            r6 = 0
            java.lang.String r7 = vc3.C78382a.m94650b()
            r1.ff0(r2, r3, r4, r5, r6, r7)
            goto L_0x014f
        L_0x013b:
            vk1.a r1 = r8.f166837f
            if (r1 != 0) goto L_0x0140
            goto L_0x0143
        L_0x0140:
            r1.setMiniWinPermission(r4)
        L_0x0143:
            vk1.a r1 = r8.f166837f
            if (r1 == 0) goto L_0x014c
            d60.b$b r2 = d60.C58124b.C58125b.MINI_WINDOW
            r1.statusChange(r2, r0)
        L_0x014c:
            r8.mo84375K()
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fl1.C59161f.mo84379O():void");
    }

    /* renamed from: m */
    public void mo83044m(C65760a aVar) {
        ViewStub viewStub;
        ViewStub viewStub2;
        C87412m.m108594g(aVar, "baseRouter");
        super.mo83044m(aVar);
        C65760a aVar2 = this.f166837f;
        if (aVar2 != null) {
            this.f169230n = (C62815i3) mo84377M(new C59150a0(aVar2));
            this.f169231o = (C62833je) mo84377M(new C59204l0(aVar2));
            this.f169191F = (C64039c) mo84377M(new C59237w0(aVar2));
            this.f169193H = (C66420d) mo84377M(new C59191h1(aVar2));
            this.f169194I = (C15883o) mo84377M(new C8122s1(aVar2));
            this.f169195J = (C12238a0) mo84377M(new C8127x1(aVar2));
            this.f169196K = (C62638b0) mo84377M(new C59243y1(aVar2));
            this.f169232p = (C12399ff) mo84377M(new C8130z1(aVar2));
            this.f169234q = (C62632a6) mo84377M(new C8103a2(aVar2));
            ViewGroup viewGroup = (ViewGroup) aVar2.findViewById(C0966R.C0970id.n5r);
            this.f169236s = viewGroup != null ? new C60085d(viewGroup, aVar2) : null;
            C52931n nVar = (C52931n) mo84377M(new C45803r(aVar2));
            this.f169238u = (C62976sd) mo84377M(new C59225s(aVar2));
            this.f169237t = (C12322e5) mo84377M(new C8123t(aVar2));
            this.f169239v = (C63151z0) mo84377M(new C59229u(aVar2));
            this.f169240w = (C12389fa) mo84377M(new C8125v(aVar2));
            this.f169241x = (C12707vb) mo84377M(new C59236w(aVar2, this));
            this.f169243y = (C63049v9) mo84377M(new C59239x(aVar2));
            this.f169229j = (FinderLiveAnchorExceptionPlugin) mo84377M(new C59242y(aVar2));
            this.f169197L = (C12611q7) mo84377M(new C8129z(aVar2));
            this.f169198M = (C63006u7) mo84377M(new C59153b0(aVar2, this));
            this.f169187B = (C12522mf) mo84377M(new C8104c0(aVar2));
            this.f169188C = (C12690u1) mo84377M(new C8106d0(aVar2));
            this.f169189D = (C62889n0) mo84377M(new C8108e0(aVar2));
            this.f169190E = (C62949r8) mo84377M(new C8110f0(aVar2));
            this.f169192G = (C13969d) mo84377M(new C8112g0(aVar2));
            this.f169199N = (C62799h2) mo84377M(new C59190h0(aVar2));
            this.f169200P = (FinderLiveRandomMatchLinkMicStatePlugin) mo84377M(new C8113i0(aVar2));
            this.f169201Q = (C63068w1) mo84377M(new C59198j0(aVar2));
            this.f169207T = (C60291e) mo84377M(new C59202k0(aVar2));
            this.f169203R = (C12490l0) mo84377M(new C8116m0(aVar2));
            this.f169209U = (C63111xe) mo84377M(new C59212n0(aVar2));
            this.f169211V = (C63081w3) mo84377M(new C59215o0(aVar2));
            this.f169213W = (C62987t2) mo84377M(new C59218p0(aVar2));
            this.f169215X = (C62911o3) mo84377M(new C59221q0(aVar2));
            this.f169217Y = (C62921p3) mo84377M(new C59222r0(aVar2));
            this.f169219Z = (C12657s2) mo84377M(new C8121s0(aVar2));
            this.f169233p0 = (C12765z2) mo84377M(new C8124t0(aVar2));
            this.f169242x0 = (C62627a3) mo84377M(new C59230u0(aVar2));
            this.f169244y0 = (C62696d3) mo84377M(new C59233v0(aVar2));
            this.f169202Q0 = (C63118y3) mo84377M(new C59240x0(aVar2));
            C12733x3 x3Var = (C12733x3) mo84377M(new C8128y0(aVar2));
            C62993t9 t9Var = (C62993t9) mo84377M(new C59245z0(aVar2));
            this.f169205S = (C62758ea) mo84377M(new C59151a1(aVar2));
            this.f169235r = (C62905o2) mo84377M(new C59154b1(aVar2));
            this.f169204R0 = (C12256bd) mo84377M(new C8105c1(aVar2));
            this.f169206S0 = (C12377f1) mo84377M(new C8107d1(aVar2));
            this.f169208T0 = (C12482k1) mo84377M(new C8109e1(aVar2));
            this.f169210U0 = (C12632r2) mo84377M(new C8111f1(aVar2));
            C12469j1 j1Var = (C12469j1) mo84377M(new C59189g1(this, aVar2));
            this.f169212V0 = (C62804h6) mo84377M(new C59194i1(aVar2));
            this.f169214W0 = (C12282d7) mo84377M(new C59199j1(this, aVar2));
            C12282d7 d7Var = this.f169214W0;
            if (d7Var != null) {
                d7Var.mo10792g(8);
            }
            this.f169216X0 = (C12693u2) mo84377M(new C8114k1(aVar2));
            this.f169218Y0 = (C63100x2) mo84377M(new C8115l1(aVar2));
            this.f169220Z0 = (C62861l1) mo84377M(new C59210m1(aVar2));
            C62868l6 l6Var = (C62868l6) mo84377M(new C59213n1(aVar2));
            C12429gi giVar = (C12429gi) mo84377M(new C8118o1(aVar2));
            C12625qe qeVar = (C12625qe) mo84377M(new C8119p1(aVar2));
            C12453ii iiVar = (C12453ii) mo84377M(new C8120q1(aVar2));
            C65348b bVar = (C65348b) mo84377M(new C59223r1(this, aVar2));
            C63108xd xdVar = this.f169221a1;
            if (xdVar == null) {
                xdVar = (C63108xd) mo84377M(new C59227t1(aVar2));
            }
            this.f169221a1 = xdVar;
            if (this.f169245z == null) {
                this.f169245z = (C62712dd) mo84377M(new C59231u1(aVar2));
                C62712dd ddVar = this.f169245z;
                if (ddVar != null) {
                    ddVar.mo10792g(8);
                }
            }
            if (this.f169222b1 == null && (viewStub2 = (ViewStub) aVar2.findViewById(C0966R.C0970id.nuu)) != null) {
                this.f169222b1 = (C63129yc) mo84377M(new C59234v1(viewStub2, aVar2));
                C63129yc ycVar = this.f169222b1;
                if (ycVar != null) {
                    ycVar.mo10792g(8);
                }
            }
            if (this.f169223c1 == null && (viewStub = (ViewStub) aVar2.findViewById(C0966R.C0970id.odh)) != null) {
                C12503ld ldVar = (C12503ld) mo84377M(new C8126w1(viewStub, aVar2));
                this.f169223c1 = ldVar;
                if (ldVar != null) {
                    ldVar.mo10792g(8);
                }
            }
            this.f169225e1 = (LinearLayout) aVar2.findViewById(C0966R.C0970id.dyp);
            mo84390z(true);
            C56032b.hideLoadingLayer$default(aVar2, false, 1, (Object) null);
            C62815i3 i3Var = this.f169230n;
            if (i3Var != null) {
                i3Var.mo10792g(0);
            }
            C62833je jeVar = this.f169231o;
            if (jeVar != null) {
                jeVar.mo10792g(8);
            }
            C12399ff ffVar = this.f169232p;
            if (ffVar != null) {
                ffVar.mo10792g(8);
            }
            C62632a6 a6Var = this.f169234q;
            if (a6Var != null) {
                a6Var.mo10792g(8);
            }
            C60085d dVar = this.f169236s;
            if (dVar != null) {
                dVar.mo10792g(8);
            }
            C62976sd sdVar = this.f169238u;
            if (sdVar != null) {
                sdVar.mo10792g(8);
            }
            C12322e5 e5Var = this.f169237t;
            if (e5Var != null) {
                e5Var.mo10792g(8);
            }
            C63151z0 z0Var = this.f169239v;
            if (z0Var != null) {
                z0Var.mo10792g(8);
            }
            C12389fa faVar = this.f169240w;
            if (faVar != null) {
                faVar.mo10792g(8);
            }
            C12707vb vbVar = this.f169241x;
            if (vbVar != null) {
                vbVar.mo10792g(8);
            }
            C63049v9 v9Var = this.f169243y;
            if (v9Var != null) {
                v9Var.mo10792g(8);
            }
            C12690u1 u1Var = this.f169188C;
            if (u1Var != null) {
                u1Var.mo10792g(8);
            }
            C62712dd ddVar2 = this.f169245z;
            if (ddVar2 != null) {
                ddVar2.mo10792g(8);
            }
            C62924pe peVar = this.f169186A;
            if (peVar != null) {
                peVar.mo10792g(8);
            }
            FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin = this.f169229j;
            if (finderLiveAnchorExceptionPlugin != null) {
                finderLiveAnchorExceptionPlugin.mo10792g(8);
            }
            C12611q7 q7Var = this.f169197L;
            if (q7Var != null) {
                q7Var.mo10792g(8);
            }
            C63006u7 u7Var = this.f169198M;
            if (u7Var != null) {
                u7Var.mo10792g(8);
            }
            C62889n0 n0Var = this.f169189D;
            if (n0Var != null) {
                n0Var.mo10792g(8);
            }
            C62949r8 r8Var = this.f169190E;
            if (r8Var != null) {
                r8Var.mo10792g(8);
            }
            C62799h2 h2Var = this.f169199N;
            if (h2Var != null) {
                h2Var.mo10792g(8);
            }
            FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin = this.f169200P;
            if (finderLiveRandomMatchLinkMicStatePlugin != null) {
                finderLiveRandomMatchLinkMicStatePlugin.mo10792g(8);
            }
            C63068w1 w1Var = this.f169201Q;
            if (w1Var != null) {
                w1Var.mo10792g(8);
            }
            C60291e eVar = this.f169207T;
            if (eVar != null) {
                eVar.mo10792g(8);
            }
            C62987t2 t2Var = this.f169213W;
            if (t2Var != null) {
                t2Var.mo10792g(8);
            }
            C12693u2 u2Var = this.f169216X0;
            if (u2Var != null) {
                u2Var.mo10792g(8);
            }
            C63100x2 x2Var = this.f169218Y0;
            if (x2Var != null) {
                x2Var.mo10792g(8);
            }
            C62861l1 l1Var = this.f169220Z0;
            if (l1Var != null) {
                l1Var.mo10792g(8);
            }
            C62911o3 o3Var = this.f169215X;
            if (o3Var != null) {
                o3Var.mo10792g(8);
            }
            C62921p3 p3Var = this.f169217Y;
            if (p3Var != null) {
                p3Var.mo10792g(8);
            }
            C12657s2 s2Var = this.f169219Z;
            if (s2Var != null) {
                s2Var.mo10792g(8);
            }
            C12765z2 z2Var = this.f169233p0;
            if (z2Var != null) {
                z2Var.mo10792g(8);
            }
            C62627a3 a3Var = this.f169242x0;
            if (a3Var != null) {
                a3Var.mo10792g(8);
            }
            C62696d3 d3Var = this.f169244y0;
            if (d3Var != null) {
                d3Var.mo10792g(8);
            }
            C64039c cVar = this.f169191F;
            if (cVar != null) {
                cVar.mo10792g(8);
            }
            C13969d dVar2 = this.f169192G;
            if (dVar2 != null) {
                dVar2.mo10792g(8);
            }
            C66420d dVar3 = this.f169193H;
            if (dVar3 != null) {
                dVar3.mo10792g(8);
            }
            C15883o oVar = this.f169194I;
            if (oVar != null) {
                oVar.mo10792g(8);
            }
            C12238a0 a0Var = this.f169195J;
            if (a0Var != null) {
                a0Var.mo10792g(8);
            }
            C62638b0 b0Var = this.f169196K;
            if (b0Var != null) {
                b0Var.mo10792g(8);
            }
            C12490l0 l0Var = this.f169203R;
            if (l0Var != null) {
                l0Var.mo10792g(8);
            }
            C63129yc ycVar2 = this.f169222b1;
            if (ycVar2 != null) {
                ycVar2.mo10792g(8);
            }
            C12503ld ldVar2 = this.f169223c1;
            if (ldVar2 != null) {
                ldVar2.mo10792g(8);
            }
            C62758ea eaVar = this.f169205S;
            if (eaVar != null) {
                eaVar.mo10792g(8);
            }
            C12377f1 f1Var = this.f169206S0;
            if (f1Var != null) {
                f1Var.mo10792g(8);
            }
            C12482k1 k1Var = this.f169208T0;
            if (k1Var != null) {
                k1Var.mo10792g(8);
            }
            C63118y3 y3Var = this.f169202Q0;
            if (y3Var != null) {
                y3Var.mo10792g(8);
            }
            C12256bd bdVar = this.f169204R0;
            if (bdVar != null) {
                bdVar.mo10792g(8);
            }
            C12632r2 r2Var = this.f169210U0;
            if (r2Var != null) {
                r2Var.mo10792g(8);
            }
            C62804h6 h6Var = this.f169212V0;
            if (h6Var != null) {
                h6Var.mo10792g(8);
            }
            C63049v9 v9Var2 = this.f169243y;
            if (v9Var2 != null) {
                v9Var2.mo87990e1();
            }
            aVar2.showProgressWithBlurBg(((C54991o) mo83051g(C54991o.class)).f154345o);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r1v17, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r1v25, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r1v29, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84380o() {
        /*
            r15 = this;
            qj1.i3 r0 = r15.f169230n
            if (r0 == 0) goto L_0x0176
            java.lang.Class<cl1.d0> r1 = cl1.C54963d0.class
            android.content.Context r2 = r0.f178292q
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
            int r2 = r2.x
            float r2 = (float) r2
            android.content.Context r3 = r0.f178292q
            android.graphics.Point r3 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r3)
            int r3 = r3.y
            float r3 = (float) r3
            android.content.Context r4 = r0.f178292q
            int r4 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r4)
            android.view.ViewGroup r5 = r0.f166287d
            android.content.Context r5 = r5.getContext()
            r6 = 16
            int r5 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r5, r6)
            float r5 = (float) r5
            android.content.Context r6 = r0.f178292q
            r7 = 80
            int r6 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r6, r7)
            android.content.Context r7 = r0.f178292q
            int r7 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r7)
            int r6 = r6 + r7
            r7 = 1071877689(0x3fe38e39, float:1.7777778)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "adjustPreviewByScreen screenW:"
            r8.append(r9)
            r8.append(r2)
            java.lang.String r9 = " screenH:"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = " factor:"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r9 = " statusBarH:"
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.LiveCoreAnchor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            androidx.lifecycle.i0 r8 = r0.mo87696x0(r1)
            cl1.d0 r8 = (cl1.C54963d0) r8
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r8 = r8.f154077t
            java.lang.Object r8 = r8.getValue()
            gi1.c r8 = (gi1.C59464c) r8
            r10 = 0
            if (r8 == 0) goto L_0x007f
            int r8 = r8.f169898c
            goto L_0x0080
        L_0x007f:
            r8 = 0
        L_0x0080:
            androidx.lifecycle.i0 r11 = r0.mo87696x0(r1)
            cl1.d0 r11 = (cl1.C54963d0) r11
            al1.j r11 = r11.f154073p
            java.lang.String r12 = "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundCornerRelativeLayout"
            r13 = 0
            r14 = 0
            if (r11 != 0) goto L_0x0150
            androidx.lifecycle.i0 r1 = r0.mo87696x0(r1)
            cl1.d0 r1 = (cl1.C54963d0) r1
            java.util.List<al1.j> r1 = r1.f154074q
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0150
            if (r8 != 0) goto L_0x0150
            float r1 = r3 / r2
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x00cc
            android.view.ViewGroup r1 = r0.f166287d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            if (r2 == 0) goto L_0x00b1
            r13 = r1
            android.widget.RelativeLayout$LayoutParams r13 = (android.widget.RelativeLayout.LayoutParams) r13
        L_0x00b1:
            if (r13 == 0) goto L_0x00b7
            r13.topMargin = r10
            r13.bottomMargin = r10
        L_0x00b7:
            android.view.ViewGroup r1 = r0.f166287d
            boolean r2 = r1 instanceof com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout
            if (r2 == 0) goto L_0x00c5
            gy3.C87412m.m108592e(r1, r12)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r1 = (com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout) r1
            r1.mo82317c(r14, r14, r14, r14)
        L_0x00c5:
            java.lang.String r1 = "adjustPreviewByScreen fill screen"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            goto L_0x014a
        L_0x00cc:
            float r2 = r2 * r7
            float r3 = r3 - r2
            float r1 = (float) r4
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x00f6
            android.view.ViewGroup r1 = r0.f166287d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r7 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x00e1
            r13 = r1
            android.widget.RelativeLayout$LayoutParams r13 = (android.widget.RelativeLayout.LayoutParams) r13
        L_0x00e1:
            if (r13 == 0) goto L_0x00e7
            r13.topMargin = r4
            r13.bottomMargin = r10
        L_0x00e7:
            android.view.ViewGroup r1 = r0.f166287d
            boolean r7 = r1 instanceof com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout
            if (r7 == 0) goto L_0x011c
            gy3.C87412m.m108592e(r1, r12)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r1 = (com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout) r1
            r1.mo82317c(r5, r5, r14, r14)
            goto L_0x011c
        L_0x00f6:
            android.view.ViewGroup r1 = r0.f166287d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r7 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x0103
            r13 = r1
            android.widget.RelativeLayout$LayoutParams r13 = (android.widget.RelativeLayout.LayoutParams) r13
        L_0x0103:
            if (r13 == 0) goto L_0x010e
            r13.topMargin = r4
            int r1 = (int) r3
            int r1 = r1 - r4
            if (r1 <= r6) goto L_0x010c
            r1 = r6
        L_0x010c:
            r13.bottomMargin = r1
        L_0x010e:
            android.view.ViewGroup r1 = r0.f166287d
            boolean r7 = r1 instanceof com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout
            if (r7 == 0) goto L_0x011c
            gy3.C87412m.m108592e(r1, r12)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r1 = (com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout) r1
            r1.mo82317c(r5, r5, r5, r5)
        L_0x011c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "adjustPreviewByScreen fit screen, targetH:"
            r1.append(r5)
            r1.append(r2)
            java.lang.String r2 = " offsetH:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " realBottomMargin:"
            r1.append(r2)
            int r2 = (int) r3
            int r2 = r2 - r4
            r1.append(r2)
            java.lang.String r2 = " mostBottomMargin:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
        L_0x014a:
            android.view.ViewGroup r1 = r0.f166287d
            r0.mo87689H0(r1, r9)
            goto L_0x0171
        L_0x0150:
            android.view.ViewGroup r1 = r0.f166287d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            if (r2 == 0) goto L_0x015d
            r13 = r1
            android.widget.RelativeLayout$LayoutParams r13 = (android.widget.RelativeLayout.LayoutParams) r13
        L_0x015d:
            if (r13 == 0) goto L_0x0163
            r13.topMargin = r10
            r13.bottomMargin = r10
        L_0x0163:
            android.view.ViewGroup r1 = r0.f166287d
            boolean r2 = r1 instanceof com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout
            if (r2 == 0) goto L_0x0171
            gy3.C87412m.m108592e(r1, r12)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r1 = (com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout) r1
            r1.mo82317c(r14, r14, r14, r14)
        L_0x0171:
            android.view.ViewGroup r0 = r0.f166287d
            r0.requestLayout()
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fl1.C59161f.mo84380o():void");
    }

    /* renamed from: p */
    public final void mo84381p(C32226l<? super Boolean, C13598b0> lVar) {
        Class cls = C55001u.class;
        C54795n5 k = mo83042k();
        if (k != null) {
            k.mo75709M(((C55001u) this.f166851d.mo71262a(cls)).f154417n, ((C55001u) this.f166851d.mo71262a(cls)).f154420q.f182392d, ((C55001u) this.f166851d.mo71262a(cls)).f154416j, ((C55001u) this.f166851d.mo71262a(cls)).f154423t, C66785b.f191882e.mo90662O5(), 2, new C59162a(this, lVar));
        }
    }

    /* renamed from: q */
    public final void mo84382q() {
        C54131l lVar;
        C54131l lVar2;
        Class cls = C54991o.class;
        Class cls2 = C55001u.class;
        String str = this.f169228i;
        StringBuilder sb = new StringBuilder();
        sb.append("checkFinderObject id:");
        FinderObject finderObject = ((C54991o) mo83051g(cls)).f154341n;
        sb.append(finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
        sb.append(", nonceId:");
        sb.append(((C55001u) mo83051g(cls2)).f154423t);
        Log.m105924i(str, sb.toString());
        int i = 0;
        if (((C54991o) mo83051g(cls)).f154341n != null) {
            FinderObject finderObject2 = ((C54991o) mo83051g(cls)).f154341n;
            if (!(finderObject2 != null && finderObject2.f164794id == 0)) {
                return;
            }
        }
        if (!Util.isNullOrNil(((C55001u) mo83051g(cls2)).f154423t)) {
            C49712hj1 hj12 = new C49712hj1();
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            C54129i iVar = FinderLiveService.f159398z;
            hj12.f134677n = (iVar == null || (lVar2 = iVar.f151988c) == null) ? 0 : lVar2.f152031k;
            finderLiveService.getClass();
            C54129i iVar2 = FinderLiveService.f159398z;
            if (!(iVar2 == null || (lVar = iVar2.f151988c) == null)) {
                i = lVar.f152031k;
            }
            hj12.f134675i = i;
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            AppCompatActivity appCompatActivity = this.f166836e;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            long j = ((C55001u) mo83051g(cls2)).f154416j;
            String str2 = ((C55001u) mo83051g(cls2)).f154423t;
            C59163b bVar = r2;
            C59163b bVar2 = new C59163b(this);
            C64916p1.C64917a.m76436c((C64916p1) c, (MMActivity) appCompatActivity, j, str2, 0, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, hj12, false, 0, bVar, 114560, (Object) null);
        }
    }

    /* renamed from: r */
    public final void mo84383r() {
        String str = this.f169228i;
        StringBuilder sb = new StringBuilder();
        sb.append("checkMiniWindow:");
        C65760a aVar = this.f166837f;
        sb.append(aVar != null ? Boolean.valueOf(aVar.getCheckMiniWin()) : null);
        Log.m105924i(str, sb.toString());
        C65760a aVar2 = this.f166837f;
        boolean z = false;
        if (aVar2 != null && !aVar2.getCheckMiniWin()) {
            z = true;
        }
        if (z) {
            mo84379O();
            this.f169226f1.stopTimer();
            C65760a aVar3 = this.f166837f;
            if (aVar3 != null) {
                aVar3.setCheckMiniWin(true);
            }
        }
    }

    /* renamed from: s */
    public final void mo84384s(int i) {
        Class cls = C54963d0.class;
        String str = ((C54963d0) mo83051g(cls)).f154048B.f144325f;
        if (!(str == null || str.length() == 0) && i == 0) {
            Class cls2 = C55001u.class;
            Log.m105924i(this.f169228i, "start setFocusMicSetting focusUserId: ");
            C54795n5 k = mo83042k();
            if (k != null) {
                k.mo75728c0(((C55001u) mo83051g(cls2)).f154420q.f182392d, ((C55001u) mo83051g(cls2)).f154416j, ((C54963d0) mo83051g(cls)).f154048B.f144323d, "", new C59241x2(this, ""));
            }
        }
    }

    /* renamed from: t */
    public final void mo84385t() {
        C39952a checkActiveAndGet;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        if (bVar != null) {
            finderLiveService.getClass();
            C56032b bVar2 = FinderLiveService.f159379g;
            if (bVar2 != null && (checkActiveAndGet = bVar2.checkActiveAndGet()) != null) {
                C53895h.m60466d(checkActiveAndGet, (C66212f) null, (C53934p0) null, new C59164c(bVar, this, (C15601d<? super C59164c>) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: u */
    public final void mo84386u(boolean z, C49430fj0 fj02) {
        if (z) {
            if (fj02.f133530d == 1) {
                ((C54991o) this.f166851d.mo71262a(C54991o.class)).f154209H3 = true;
            }
            ((C66297d2) C39818r.f106831a.mo62444c(this.f166836e).mo75002a(C66297d2.class)).mo90419j3();
            return;
        }
        View view = ((C66297d2) C39818r.f106831a.mo62444c(this.f166836e).mo75002a(C66297d2.class)).f190861t;
        if (view != null) {
            view.setEnabled(true);
        }
        C65760a aVar = this.f166837f;
        if (aVar != null) {
            C58124b.C7172a.m7372a(aVar, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: v */
    public FinderLiveAnchorExceptionPlugin mo84387v() {
        return this.f169229j;
    }

    /* renamed from: w */
    public final void mo84388w(int i, int i2, String str, C51532ue0 ue02, boolean z) {
        C54655b bVar;
        int i3 = i;
        int i4 = i2;
        Class cls = C54108o.class;
        Class cls2 = C54963d0.class;
        C62799h2 h2Var = this.f169199N;
        if (h2Var != null) {
            h2Var.mo87790Z0();
        }
        long j = 0;
        String str2 = null;
        boolean z2 = true;
        if (i3 == 0 && i4 == 0) {
            Log.m105924i(this.f169228i, "[LinkMicPk] accept anchor link mic pk success");
            C54130j jVar = ((C54963d0) mo83051g(cls2)).f154073p;
            if (jVar != null) {
                C87412m.m108592e(this.f166839h, "null cannot be cast to non-null type com.tencent.mm.live.core.core.anchor.LiveAnchorTRTCCore");
                String valueOf = String.valueOf(jVar.f152005i);
                String str3 = jVar.f151997a;
                C61440d c = C60971a.C60973b.f173670a.mo85946c();
                if (c != null) {
                    c.f174706e = str3;
                    c.f174707f = true;
                    c.f174705d = valueOf;
                }
                C54655b bVar2 = this.f166839h;
                C87412m.m108592e(bVar2, "null cannot be cast to non-null type com.tencent.mm.live.core.core.anchor.LiveAnchorTRTCCore");
                bVar2.mo75577I0(String.valueOf(jVar.f152005i), String.valueOf(((C54991o) mo83051g(C54991o.class)).mo76013m4()), "", jVar.f151997a);
                C61620c.C61622b.f175234a.mo86556d(jVar.f152002f);
                C62042e eVar = C62042e.f176370a;
                String str4 = jVar.f151997a;
                if (str4 == null) {
                    str4 = "";
                }
                if (eVar.mo87058Y1(str4, jVar.f152005i, true, jVar.f152002f) && (bVar = this.f166839h) != null) {
                    bVar.mo85680X().mo86572o(false);
                }
                jVar.f152020x = true;
            }
            ((C54963d0) mo83051g(cls2)).f154072o.clear();
            C12490l0 l0Var = this.f169203R;
            if (l0Var != null) {
                l0Var.mo12140Z0();
            }
            FinderLiveService.f159376d.mo77624a(0);
            FinderLiveErrorReportStruct finderLiveErrorReportStruct = new FinderLiveErrorReportStruct();
            finderLiveErrorReportStruct.f155539e = 1001;
            finderLiveErrorReportStruct.mo76263s("");
            Log.m105924i("FinderLiveMicReportUtil", "reportMicPv " + 1001 + " msg: " + "");
            finderLiveErrorReportStruct.mo86054n();
            C54108o oVar = (C54108o) C86312j.m106911c(cls);
            C54067f0.C54087y yVar = C54067f0.C54087y.LINKMIC_CONNECT_SUCCESS;
            C54130j jVar2 = ((C54963d0) mo83051g(cls2)).f154073p;
            if (jVar2 != null) {
                str2 = jVar2.f151999c;
            }
            oVar.Xx0(yVar, str2, 1, 2);
            if (z) {
                ((C54108o) C86312j.m106911c(cls)).Kx0(13, ue02.f142796f);
                return;
            }
            return;
        }
        C60299b bVar3 = C60299b.f171929a;
        Log.m105924i("Finder.LinkMicTimeoutTimer", "stopAcceptPkMicTimer");
        MMHandlerThread.removeRunnable(C60299b.f171933e);
        Log.m105924i(this.f169228i, "[LinkMicPk] accept anchor link mic pk fail");
        ((C54963d0) mo83051g(cls2)).f154073p = null;
        C61620c.C61622b.f175234a.mo86556d((String) null);
        ((C54963d0) mo83051g(cls2)).f154078u = 0;
        if (!(str == null || str.length() == 0)) {
            z2 = false;
        }
        if (!z2) {
            str2 = str;
        }
        if (i4 == -200074) {
            AppCompatActivity appCompatActivity = this.f166836e;
            if (str2 == null) {
                str2 = appCompatActivity.getResources().getString(C0966R.string.dq8);
                C87412m.m108593f(str2, "context.resources.getStr…k_accept_pk_tip_canceled)");
            }
            C76912y0.makeText((Context) appCompatActivity, (CharSequence) str2, 0).show();
            ((C54108o) C86312j.m106911c(cls)).Xx0(C54067f0.C54087y.LINKMIC_FAILURE_WHEN_EXCEPTION_TOAST_SHOW, this.f166836e.getResources().getString(C0966R.string.dq8), -1, -1);
            return;
        }
        AppCompatActivity appCompatActivity2 = this.f166836e;
        if (str2 == null) {
            str2 = appCompatActivity2.getResources().getString(C0966R.string.dwc);
            C87412m.m108593f(str2, "context.resources.getStr…ring.finder_live_mic_err)");
        }
        C76912y0.makeText((Context) appCompatActivity2, (CharSequence) str2, 0).show();
        C64273c21 c212 = ((C55001u) mo83051g(C55001u.class)).f154420q;
        if (c212 != null) {
            j = c212.f182392d;
        }
        Log.m105924i("FinderLiveMicWatcher", "onAnchorAcceptMicPkFail errCode: " + i4 + " errType: " + i3 + " liveId: " + j);
        C11348f.C11349a.m11178b(C59319a.f169618b, "micpk_anchorAcceptMicFail", false, (C11348f.C11352b) null, false, false, new C0583p3(i4, i3, j), 28, (Object) null);
    }

    /* renamed from: x */
    public final void mo84389x(int i, int i2, String str, C50820pf0 pf02, C49765hx0 hx02, boolean z) {
        int i3 = i;
        int i4 = i2;
        C50820pf0 pf03 = pf02;
        C49765hx0 hx03 = hx02;
        Class cls = C54963d0.class;
        C54067f0.C54087y yVar = C54067f0.C54087y.LINKMIC_FAILURE_WHEN_EXCEPTION_TOAST_SHOW;
        Class cls2 = C54108o.class;
        String str2 = null;
        if (i3 == 0 && i4 == 0) {
            String str3 = this.f169228i;
            StringBuilder sb = new StringBuilder();
            sb.append("[LinkMicPk] apply anchor link mic pk success. toContact:[");
            FinderContact finderContact = hx03.f134919d;
            sb.append(finderContact != null ? finderContact.nickname : null);
            sb.append(']');
            Log.m105924i(str3, sb.toString());
            C54963d0 d0Var = (C54963d0) mo83051g(cls);
            String str4 = pf03.f139742f;
            if (str4 == null) {
                str4 = "";
            }
            d0Var.f154070j = str4;
            C54963d0 d0Var2 = (C54963d0) mo83051g(cls);
            FinderContact finderContact2 = hx03.f134919d;
            String str5 = finderContact2 != null ? finderContact2.headUrl : null;
            String str6 = finderContact2 != null ? finderContact2.username : null;
            String str7 = finderContact2 != null ? finderContact2.nickname : null;
            String str8 = pf03.f139742f;
            C49765hx0 hx04 = hx03;
            d0Var2.f154073p = new C54130j("", str5, str6, str7, 2, str8, (C89349b) null, true, 0, (FinderAuthInfo) null, (String) null, 0, 0, false, (String) null, false, 0, hx02, z, (Boolean) null, (C64756up2) null, 0, 0, 7994368, (C8480h) null);
            C60299b bVar = C60299b.f171929a;
            Log.m105924i("Finder.LinkMicTimeoutTimer", "startApplyMicPkTimer delay:60000");
            MMHandlerThread.postToMainThreadDelayed(C60299b.f171932d, 60000);
            return;
        }
        C49765hx0 hx05 = hx03;
        String str9 = this.f169228i;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("[LinkMicPk] apply anchor link mic pk fail. toContact:[");
        FinderContact finderContact3 = hx05.f134919d;
        sb4.append(finderContact3 != null ? finderContact3.nickname : null);
        sb4.append(']');
        Log.m105924i(str9, sb4.toString());
        C62799h2 h2Var = this.f169199N;
        if (h2Var != null) {
            h2Var.mo87790Z0();
        }
        ((C54963d0) mo83051g(cls)).f154078u = 0;
        if (!(str == null || str.length() == 0)) {
            str2 = str;
        }
        switch (i4) {
            case -200075:
                AppCompatActivity appCompatActivity = this.f166836e;
                if (str2 == null) {
                    str2 = appCompatActivity.getResources().getString(C0966R.string.dqa);
                    C87412m.m108593f(str2, "context.resources.getStr…link_apply_pk_tip_closed)");
                }
                C76912y0.makeText((Context) appCompatActivity, (CharSequence) str2, 0).show();
                ((C54108o) C86312j.m106911c(cls2)).Xx0(yVar, this.f166836e.getResources().getString(C0966R.string.dqa), -1, -1);
                return;
            case -200073:
                AppCompatActivity appCompatActivity2 = this.f166836e;
                if (str2 == null) {
                    str2 = appCompatActivity2.getResources().getString(C0966R.string.dq_);
                    C87412m.m108593f(str2, "context.resources.getStr…e_link_apply_pk_tip_busy)");
                }
                C76912y0.makeText((Context) appCompatActivity2, (CharSequence) str2, 0).show();
                ((C54108o) C86312j.m106911c(cls2)).Xx0(yVar, this.f166836e.getResources().getString(C0966R.string.dq_), -1, -1);
                return;
            case -200072:
                AppCompatActivity appCompatActivity3 = this.f166836e;
                if (str2 == null) {
                    str2 = appCompatActivity3.getResources().getString(C0966R.string.dqb);
                    C87412m.m108593f(str2, "context.resources.getStr…ink_apply_pk_tip_disable)");
                }
                C76912y0.makeText((Context) appCompatActivity3, (CharSequence) str2, 0).show();
                ((C54108o) C86312j.m106911c(cls2)).Xx0(yVar, this.f166836e.getResources().getString(C0966R.string.dqb), -1, -1);
                return;
            case -200071:
                AppCompatActivity appCompatActivity4 = this.f166836e;
                if (str2 == null) {
                    str2 = appCompatActivity4.getResources().getString(C0966R.string.dqd);
                    C87412m.m108593f(str2, "context.resources.getStr…ink_apply_pk_tip_version)");
                }
                C76912y0.makeText((Context) appCompatActivity4, (CharSequence) str2, 0).show();
                ((C54108o) C86312j.m106911c(cls2)).Xx0(yVar, this.f166836e.getResources().getString(C0966R.string.dqd), -1, -1);
                return;
            case -200070:
                AppCompatActivity appCompatActivity5 = this.f166836e;
                if (str2 == null) {
                    str2 = appCompatActivity5.getResources().getString(C0966R.string.dqc);
                    C87412m.m108593f(str2, "context.resources.getStr…e_link_apply_pk_tip_self)");
                }
                C76912y0.makeText((Context) appCompatActivity5, (CharSequence) str2, 0).show();
                ((C54108o) C86312j.m106911c(cls2)).Xx0(yVar, this.f166836e.getResources().getString(C0966R.string.dqc), -1, -1);
                return;
            default:
                AppCompatActivity appCompatActivity6 = this.f166836e;
                if (str2 == null) {
                    str2 = appCompatActivity6.getResources().getString(C0966R.string.dwc);
                    C87412m.m108593f(str2, "context.resources.getStr…ring.finder_live_mic_err)");
                }
                C76912y0.makeText((Context) appCompatActivity6, (CharSequence) str2, 0).show();
                long j = ((C55001u) mo83051g(C55001u.class)).f154420q.f182392d;
                Log.m105924i("FinderLiveMicWatcher", "onAnchorApplyMicPkFail errCode: " + i4 + " errType: " + i3 + " liveId: " + j);
                C11348f.C11349a.m11178b(C59319a.f169618b, "micpk_anchorApplyMicFail", false, (C11348f.C11352b) null, false, false, new C0587q3(i4, i3, j), 28, (Object) null);
                return;
        }
    }

    /* renamed from: z */
    public final void mo84390z(boolean z) {
        String str = this.f169228i;
        Log.m105924i(str, "initShoppingPlugins,user:" + ((C54991o) mo83051g(C54991o.class)).f154345o + ",bind shop:" + ((C54979h1) mo83051g(C54979h1.class)).f154134f + ", init:" + z);
        C65760a aVar = this.f166837f;
        if (aVar != null && z) {
            View findViewById = aVar.findViewById(C0966R.C0970id.dz7);
            C87412m.m108593f(findViewById, "router.findViewById(R.id…_live_shopping_list_root)");
            this.f169186A = new C62924pe((ViewGroup) findViewById, aVar);
        }
    }
}
