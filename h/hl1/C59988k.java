package hl1;

import ak1.C54067f0;
import ak1.C54116w;
import al1.C54127h;
import al1.C54129i;
import al1.C54130j;
import al1.C54131l;
import am3.C54139a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import b50.C54408d;
import b50.C54410e;
import c30.C104289g;
import cj1.C54733a1;
import cj1.C54766h4;
import cj1.C54795n5;
import cj1.C54807r3;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C54998r0;
import cl1.C55000s0;
import cl1.C55001u;
import cl1.C55004v1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGameInfoView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58107a;
import d50.C58110d;
import d50.C58113g;
import d50.C58114h;
import d50.C58115i;
import d50.C7170j;
import d60.C58124b;
import dh1.C58268d;
import di3.C7335d;
import di3.C86312j;
import dj1.C45360g;
import dp1.C58358d0;
import dp1.C58418z1;
import eb0.C31543z5;
import er1.C58713e5;
import er1.C58730g5;
import f50.C58924d;
import fh1.C8083t2;
import fj1.C45795b;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32232u;
import gg1.C32444a;
import gh1.C59453p;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hq1.C60085d;
import ii1.C60291e;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jj1.C60874a;
import l31.C61212e;
import lg1.C10509e;
import lg1.C46854h;
import o40.C11348f;
import o40.C61926c;
import ok1.C11471u;
import ok1.C62042e;
import org.json.JSONObject;
import p165hr.C60106t;
import p185kq.C61130g;
import p447aw.C103918d;
import p50.C62193a;
import p50.C62197e;
import p682rz.C36594q;
import pe3.C47465a;
import pe3.C89349b;
import q31.C118148a;
import qj1.C12238a0;
import qj1.C12264c0;
import qj1.C12271ch;
import qj1.C12282d7;
import qj1.C12322e5;
import qj1.C12360e8;
import qj1.C12377f1;
import qj1.C12382f6;
import qj1.C12389fa;
import qj1.C12399ff;
import qj1.C12429gi;
import qj1.C12453ii;
import qj1.C12475jc;
import qj1.C12482k1;
import qj1.C12522mf;
import qj1.C12543n6;
import qj1.C12583oh;
import qj1.C12611q7;
import qj1.C12625qe;
import qj1.C12669t4;
import qj1.C12677tg;
import qj1.C12690u1;
import qj1.C12707vb;
import qj1.C12733x3;
import qj1.C12767z5;
import qj1.C12772zc;
import qj1.C35912rh;
import qj1.C47844c7;
import qj1.C47851k4;
import qj1.C62632a6;
import qj1.C62638b0;
import qj1.C62647ba;
import qj1.C62660c;
import qj1.C62668c4;
import qj1.C62699d4;
import qj1.C62705da;
import qj1.C62707db;
import qj1.C62712dd;
import qj1.C62741dg;
import qj1.C62750di;
import qj1.C62758ea;
import qj1.C62772fb;
import qj1.C62777fg;
import qj1.C62795gh;
import qj1.C62804h6;
import qj1.C62833je;
import qj1.C62843kb;
import qj1.C62868l6;
import qj1.C62878m4;
import qj1.C62880m6;
import qj1.C62898o;
import qj1.C62905o2;
import qj1.C62917og;
import qj1.C62924pe;
import qj1.C62927ph;
import qj1.C62938qb;
import qj1.C62943qh;
import qj1.C62949r8;
import qj1.C62972s6;
import qj1.C62979sf;
import qj1.C62981sg;
import qj1.C62983sh;
import qj1.C62993t9;
import qj1.C63005u6;
import qj1.C63006u7;
import qj1.C63032ue;
import qj1.C63046v6;
import qj1.C63049v9;
import qj1.C63064w;
import qj1.C63081w3;
import qj1.C63084w6;
import qj1.C63102x6;
import qj1.C63108xd;
import qj1.C63118y3;
import qj1.C63129yc;
import qj1.C63144yg;
import qj1.C63163zd;
import qj1.C63170ze;
import qj1.C63176zg;
import qs1.C63325a;
import qt1.C63329b;
import r50.C63367f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import s50.C63698a0;
import s50.C63714v;
import sl1.C64039c;
import sx3.C90363p0;
import te3.C48701ae3;
import te3.C49199dx0;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C49906iw0;
import te3.C50209l31;
import te3.C50347m31;
import te3.C50629o31;
import te3.C52005xq0;
import te3.C64265bq2;
import te3.C64273c21;
import te3.C64293cq2;
import te3.C64412h61;
import te3.C64733to;
import te3.C64756up2;
import te3.C64890zp2;
import tf0.C64916p1;
import tl1.C13969d;
import tl1.C13988m;
import tl1.C13998p;
import ug1.C65348b;
import up1.C65426w0;
import vi1.C52931n;
import vi1.C65750a;
import vk1.C65762c;
import wj1.C15410a;
import xs1.C15883o;
import xs1.C66420d;

/* renamed from: hl1.k */
public final class C59988k extends C58268d implements C54410e, C60874a {

    /* renamed from: g2 */
    public static final C59989a f171146g2 = new C59989a((C8480h) null);

    /* renamed from: A */
    public C62668c4 f171147A;

    /* renamed from: A1 */
    public boolean f171148A1;

    /* renamed from: B */
    public C62949r8 f171149B;

    /* renamed from: B1 */
    public final C13601g f171150B1 = C36568h.m40985a(new C60000q(this));

    /* renamed from: C */
    public C62917og f171151C;

    /* renamed from: C1 */
    public C62938qb f171152C1;

    /* renamed from: D */
    public C12583oh f171153D;

    /* renamed from: D1 */
    public C63032ue f171154D1;

    /* renamed from: E */
    public C63049v9 f171155E;

    /* renamed from: E1 */
    public C63118y3 f171156E1;

    /* renamed from: F */
    public C65348b f171157F;

    /* renamed from: F1 */
    public C12543n6 f171158F1;

    /* renamed from: G */
    public C15410a f171159G;

    /* renamed from: G1 */
    public C12707vb f171160G1;

    /* renamed from: H */
    public C12429gi f171161H;

    /* renamed from: H1 */
    public C12677tg f171162H1;

    /* renamed from: I */
    public C12453ii f171163I;

    /* renamed from: I1 */
    public C62750di f171164I1;

    /* renamed from: J */
    public C12377f1 f171165J;

    /* renamed from: J1 */
    public C62707db f171166J1;

    /* renamed from: K */
    public C12482k1 f171167K;

    /* renamed from: K1 */
    public C63176zg f171168K1;

    /* renamed from: L */
    public C12690u1 f171169L;

    /* renamed from: L1 */
    public C12669t4 f171170L1;

    /* renamed from: M */
    public C62712dd f171171M;

    /* renamed from: M1 */
    public C62804h6 f171172M1;

    /* renamed from: N */
    public C62924pe f171173N;

    /* renamed from: N1 */
    public C12382f6 f171174N1;

    /* renamed from: O1 */
    public C62880m6 f171175O1;

    /* renamed from: P */
    public final C13601g f171176P = C36568h.m40985a(C8560h.f27639d);

    /* renamed from: P1 */
    public int f171177P1;

    /* renamed from: Q */
    public C54139a f171178Q;

    /* renamed from: Q0 */
    public C62979sf f171179Q0;

    /* renamed from: Q1 */
    public int f171180Q1;

    /* renamed from: R */
    public C63163zd f171181R;

    /* renamed from: R0 */
    public C62705da f171182R0;

    /* renamed from: R1 */
    public Boolean f171183R1;

    /* renamed from: S */
    public C63102x6 f171184S;

    /* renamed from: S0 */
    public C62647ba f171185S0;

    /* renamed from: S1 */
    public boolean f171186S1;

    /* renamed from: T */
    public C63046v6 f171187T;

    /* renamed from: T0 */
    public C62647ba f171188T0;

    /* renamed from: T1 */
    public int f171189T1;

    /* renamed from: U */
    public C63005u6 f171190U;

    /* renamed from: U0 */
    public C62777fg f171191U0;

    /* renamed from: U1 */
    public int f171192U1;

    /* renamed from: V */
    public C62868l6 f171193V;

    /* renamed from: V0 */
    public C64039c f171194V0;

    /* renamed from: V1 */
    public boolean f171195V1;

    /* renamed from: W */
    public C62981sg f171196W;

    /* renamed from: W0 */
    public C13988m f171197W0;

    /* renamed from: W1 */
    public C59969e4 f171198W1 = new C59969e4(this, "Finder.LOOP_LiveVisitorPluginLayout@" + hashCode(), this.f166851d);

    /* renamed from: X */
    public C12282d7 f171199X;

    /* renamed from: X0 */
    public C66420d f171200X0;

    /* renamed from: X1 */
    public MTimerHandler f171201X1 = new MTimerHandler("LiveCommonInfoPlugin::Timer", (MTimerHandler.CallBack) this.f171198W1, true);

    /* renamed from: Y */
    public C12611q7 f171202Y;

    /* renamed from: Y0 */
    public C15883o f171203Y0;

    /* renamed from: Y1 */
    public boolean f171204Y1;

    /* renamed from: Z */
    public C12360e8 f171205Z;

    /* renamed from: Z0 */
    public C12238a0 f171206Z0;

    /* renamed from: Z1 */
    public int f171207Z1;

    /* renamed from: a1 */
    public C62638b0 f171208a1;

    /* renamed from: a2 */
    public C46854h f171209a2;

    /* renamed from: b1 */
    public C12264c0 f171210b1;

    /* renamed from: b2 */
    public C10509e f171211b2;

    /* renamed from: c1 */
    public C47844c7 f171212c1;

    /* renamed from: c2 */
    public final C13601g f171213c2 = C36568h.m40985a(new C8561i(this));

    /* renamed from: d1 */
    public C62795gh f171214d1;

    /* renamed from: d2 */
    public final C13601g f171215d2 = C36568h.m40985a(new C8562j(this));

    /* renamed from: e1 */
    public C52931n f171216e1;

    /* renamed from: e2 */
    public final C13601g f171217e2 = C36568h.m40985a(new C59995k(this));

    /* renamed from: f1 */
    public C65750a f171218f1;

    /* renamed from: f2 */
    public final C118148a f171219f2 = C8559g.f27638a;

    /* renamed from: g1 */
    public C63108xd f171220g1;

    /* renamed from: h1 */
    public C12772zc f171221h1;

    /* renamed from: i */
    public final String f171222i = ("FinderLiveVisitorStartUIC@" + hashCode());

    /* renamed from: i1 */
    public C63129yc f171223i1;

    /* renamed from: j */
    public C63170ze f171224j;

    /* renamed from: j1 */
    public boolean f171225j1;

    /* renamed from: k1 */
    public final C13601g f171226k1 = C36568h.m40985a(new C8563p(this));

    /* renamed from: l1 */
    public C63006u7 f171227l1;

    /* renamed from: m1 */
    public C62741dg f171228m1;

    /* renamed from: n */
    public C62983sh f171229n;

    /* renamed from: n1 */
    public C63084w6 f171230n1;

    /* renamed from: o */
    public C62898o f171231o;

    /* renamed from: o1 */
    public ConstraintLayout f171232o1;

    /* renamed from: p */
    public C63064w f171233p;

    /* renamed from: p0 */
    public C12522mf f171234p0;

    /* renamed from: p1 */
    public C12389fa f171235p1;

    /* renamed from: q */
    public C62772fb f171236q;

    /* renamed from: q1 */
    public C62758ea f171237q1;

    /* renamed from: r */
    public C62843kb f171238r;

    /* renamed from: r1 */
    public C62943qh f171239r1;

    /* renamed from: s */
    public C47851k4 f171240s;

    /* renamed from: s1 */
    public C12625qe f171241s1;

    /* renamed from: t */
    public C62833je f171242t;

    /* renamed from: t1 */
    public C63144yg f171243t1;

    /* renamed from: u */
    public C12399ff f171244u;

    /* renamed from: u1 */
    public C60085d f171245u1;

    /* renamed from: v */
    public C62632a6 f171246v;

    /* renamed from: v1 */
    public boolean f171247v1;

    /* renamed from: w */
    public C62905o2 f171248w;

    /* renamed from: w1 */
    public final C13601g f171249w1 = C36568h.m40985a(new C59994f(this));

    /* renamed from: x */
    public C12322e5 f171250x;

    /* renamed from: x0 */
    public C12733x3 f171251x0;

    /* renamed from: x1 */
    public C60291e f171252x1;

    /* renamed from: y */
    public int f171253y;

    /* renamed from: y0 */
    public C62993t9 f171254y0;

    /* renamed from: y1 */
    public C62878m4 f171255y1;

    /* renamed from: z */
    public C12475jc f171256z;

    /* renamed from: z1 */
    public C63081w3 f171257z1;

    /* renamed from: hl1.k$g */
    public static final class C8559g implements C118148a {

        /* renamed from: a */
        public static final C8559g f27638a = new C8559g();

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            return C59988k.f171146g2.mo84902a();
        }
    }

    /* renamed from: hl1.k$h */
    public static final class C8560h extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C8560h f27639d = new C8560h();

        public C8560h() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C32444a.f86041C0.mo60266n().intValue() == 0);
        }
    }

    /* renamed from: hl1.k$i */
    public static final class C8561i extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C59988k f27640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8561i(C59988k kVar) {
            super(0);
            this.f27640d = kVar;
        }

        public Object invoke() {
            C65762c cVar = this.f27640d.f166848f;
            View findViewById = cVar != null ? cVar.findViewById(C0966R.C0970id.dqi) : null;
            if (findViewById != null) {
                C85875k4.m106189j0(((TextView) findViewById.findViewById(C0966R.C0970id.dqk)).getPaint(), 0.8f);
            }
            return findViewById;
        }
    }

    /* renamed from: hl1.k$j */
    public static final class C8562j extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C59988k f27641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8562j(C59988k kVar) {
            super(0);
            this.f27641d = kVar;
        }

        public Object invoke() {
            C65762c cVar = this.f27641d.f166848f;
            View findViewById = cVar != null ? cVar.findViewById(C0966R.C0970id.dy6) : null;
            if (findViewById != null) {
                C85875k4.m106189j0(((TextView) findViewById.findViewById(C0966R.C0970id.dy8)).getPaint(), 0.8f);
            }
            return findViewById;
        }
    }

    /* renamed from: hl1.k$p */
    public static final class C8563p extends C87413o implements C32224a<C12271ch> {

        /* renamed from: d */
        public final /* synthetic */ C59988k f27642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8563p(C59988k kVar) {
            super(0);
            this.f27642d = kVar;
        }

        public Object invoke() {
            C59988k kVar = this.f27642d;
            C65762c cVar = kVar.f166848f;
            if (cVar == null) {
                return null;
            }
            C12271ch chVar = new C12271ch((ViewGroup) kVar.mo83046i(C0966R.C0970id.f358099de3, cVar), cVar);
            kVar.f171225j1 = true;
            chVar.mo10792g(8);
            chVar.mo8357i0();
            return chVar;
        }
    }

    /* renamed from: hl1.k$r */
    public static final class C8564r implements C56032b.C3204b {

        /* renamed from: a */
        public final /* synthetic */ C59988k f27643a;

        /* renamed from: b */
        public final /* synthetic */ C65762c f27644b;

        /* renamed from: c */
        public final /* synthetic */ C49712hj1 f27645c;

        public C8564r(C59988k kVar, C65762c cVar, C49712hj1 hj12) {
            this.f27643a = kVar;
            this.f27644b = cVar;
            this.f27645c = hj12;
        }

        /* renamed from: a */
        public void mo3372a(C58124b.C58125b bVar, Bundle bundle) {
            C87412m.m108594g(bVar, "status");
            int ordinal = bVar.ordinal();
            if (ordinal != 39) {
                if (ordinal == 46) {
                    C59988k kVar = this.f27643a;
                    C12707vb vbVar = kVar.f171160G1;
                    if (vbVar == null) {
                        vbVar = new C12707vb((ViewGroup) kVar.mo83046i(C0966R.C0970id.dr_, this.f27644b), this.f27644b, this.f27645c);
                    }
                    kVar.f171160G1 = vbVar;
                    C12707vb vbVar2 = this.f27643a.f171160G1;
                    if (vbVar2 != null) {
                        vbVar2.mo10792g(8);
                    }
                    C12707vb vbVar3 = this.f27643a.f171160G1;
                    if (vbVar3 != null) {
                        vbVar3.mo8357i0();
                        return;
                    }
                    return;
                } else if (ordinal == 79) {
                    C59988k kVar2 = this.f27643a;
                    C65762c cVar = kVar2.f166848f;
                    if (cVar != null && kVar2.f171235p1 == null) {
                        AppCompatActivity appCompatActivity = kVar2.f166847e;
                        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type android.app.Activity");
                        FrameLayout frameLayout = (FrameLayout) appCompatActivity.findViewById(C0966R.C0970id.f358130dk2);
                        C11471u.C11473b bVar2 = !C85875k4.m106211z() ? C11471u.C11473b.FORCE_DARK : C11471u.C11473b.AUTO;
                        C11471u uVar = C11471u.f33728a;
                        LayoutInflater layoutInflater = appCompatActivity.getLayoutInflater();
                        C87412m.m108593f(layoutInflater, "activity.layoutInflater");
                        ViewGroup viewGroup = (ViewGroup) uVar.mo11443b(C0966R.C0971layout.cww, frameLayout, false, bVar2, appCompatActivity, layoutInflater);
                        if (frameLayout != null) {
                            frameLayout.addView(viewGroup);
                        }
                        C12389fa faVar = new C12389fa(viewGroup, bVar2, cVar);
                        kVar2.f171235p1 = faVar;
                        faVar.mo10792g(8);
                        C12389fa faVar2 = kVar2.f171235p1;
                        if (faVar2 != null) {
                            faVar2.mo8357i0();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (ordinal == 81 || ordinal == 84) {
                    C59988k kVar3 = this.f27643a;
                    AppCompatActivity appCompatActivity2 = kVar3.f166847e;
                    C87412m.m108592e(appCompatActivity2, "null cannot be cast to non-null type android.app.Activity");
                    C59955b4.m69853b(kVar3, appCompatActivity2);
                    return;
                } else if (ordinal != 121) {
                    if (ordinal == 137) {
                        C59988k kVar4 = this.f27643a;
                        if (kVar4.f171197W0 == null) {
                            kVar4.f171197W0 = ((C54991o) kVar4.mo83051g(C54991o.class)).f154190D ? new C13969d((ViewGroup) this.f27643a.mo83046i(C0966R.C0970id.m9m, this.f27644b), this.f27644b) : new C13998p((ViewGroup) this.f27643a.mo83046i(C0966R.C0970id.e1h, this.f27644b), this.f27644b);
                            C13988m mVar = this.f27643a.f171197W0;
                            if (mVar != null) {
                                mVar.mo10792g(8);
                            }
                            C13988m mVar2 = this.f27643a.f171197W0;
                            if (mVar2 != null) {
                                mVar2.mo8357i0();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ordinal == 166) {
                        C59988k kVar5 = this.f27643a;
                        if (kVar5.f171255y1 == null) {
                            kVar5.f171255y1 = new C62878m4((ViewGroup) kVar5.mo83046i(C0966R.C0970id.f358124dj3, this.f27644b), this.f27644b);
                            C62878m4 m4Var = this.f27643a.f171255y1;
                            if (m4Var != null) {
                                m4Var.mo10792g(8);
                            }
                            C62878m4 m4Var2 = this.f27643a.f171255y1;
                            if (m4Var2 != null) {
                                m4Var2.mo8357i0();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ordinal == 171) {
                        C59988k kVar6 = this.f27643a;
                        if (kVar6.f171152C1 == null) {
                            kVar6.f171152C1 = new C62938qb((ViewGroup) kVar6.mo83046i(C0966R.C0970id.du4, this.f27644b), this.f27644b);
                            C62938qb qbVar = this.f27643a.f171152C1;
                            if (qbVar != null) {
                                qbVar.mo10792g(8);
                            }
                            C62938qb qbVar2 = this.f27643a.f171152C1;
                            if (qbVar2 != null) {
                                qbVar2.mo8357i0();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ordinal == 188) {
                        C59988k kVar7 = this.f27643a;
                        if (kVar7.f171158F1 == null) {
                            kVar7.f171158F1 = new C12543n6((ViewGroup) kVar7.mo83046i(C0966R.C0970id.dkp, this.f27644b), this.f27644b, (C49712hj1) null, 4, (C8480h) null);
                            C12543n6 n6Var = this.f27643a.f171158F1;
                            if (n6Var != null) {
                                n6Var.mo10792g(8);
                            }
                            C12543n6 n6Var2 = this.f27643a.f171158F1;
                            if (n6Var2 != null) {
                                n6Var2.mo8357i0();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ordinal == 68) {
                        C59988k kVar8 = this.f27643a;
                        if (kVar8.f171199X == null) {
                            kVar8.f171199X = new C12282d7((ViewGroup) this.f27643a.mo83046i(C0966R.C0970id.dms, this.f27644b), this.f27644b, (C12282d7.C12288c) null, 4, (C8480h) null);
                            C12282d7 d7Var = this.f27643a.f171199X;
                            if (d7Var != null) {
                                d7Var.mo10792g(8);
                            }
                            C12282d7 d7Var2 = this.f27643a.f171199X;
                            if (d7Var2 != null) {
                                d7Var2.mo8357i0();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ordinal == 69) {
                        C59988k kVar9 = this.f27643a;
                        if (kVar9.f171199X == null) {
                            kVar9.f171199X = new C12282d7((ViewGroup) this.f27643a.mo83046i(C0966R.C0970id.dms, this.f27644b), this.f27644b, (C12282d7.C12288c) null, 4, (C8480h) null);
                            C12282d7 d7Var3 = this.f27643a.f171199X;
                            if (d7Var3 != null) {
                                d7Var3.mo10792g(8);
                            }
                            C12282d7 d7Var4 = this.f27643a.f171199X;
                            if (d7Var4 != null) {
                                d7Var4.mo8357i0();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
            C59988k kVar10 = this.f27643a;
            if (kVar10.f171149B == null) {
                this.f27643a.f171149B = new C62949r8((ViewGroup) kVar10.mo83046i(C0966R.C0970id.fuq, this.f27644b), this.f27644b);
                C62949r8 r8Var = this.f27643a.f171149B;
                if (r8Var != null) {
                    r8Var.mo10792g(8);
                }
                C62949r8 r8Var2 = this.f27643a.f171149B;
                if (r8Var2 != null) {
                    r8Var2.mo8357i0();
                }
            }
        }
    }

    /* renamed from: hl1.k$a */
    public static final class C59989a {
        public C59989a(C8480h hVar) {
        }

        /* renamed from: a */
        public final Map<String, Object> mo84902a() {
            Class cls = C54116w.class;
            String gK = ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("live_id", C61926c.m72691p(((C54116w) C86312j.m106911c(cls)).f151937e));
            linkedHashMap.put("feed_id", C61926c.m72691p(((C54116w) C86312j.m106911c(cls)).f151943h));
            linkedHashMap.put("live_start_time", Long.valueOf(((C54116w) C86312j.m106911c(cls)).f151935d));
            linkedHashMap.put("enter_session_id", Long.valueOf(((C54116w) C86312j.m106911c(cls)).f151950p));
            linkedHashMap.put("finder_username", ((C54116w) C86312j.m106911c(cls)).f151939f);
            long j = ((C54116w) C86312j.m106911c(cls)).f151943h;
            C87412m.m108593f(gK, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            linkedHashMap.put("session_buffer", ((C54116w) C86312j.m106911c(cls)).zx0(j, gK));
            C54116w wVar = (C54116w) C86312j.m106911c(cls);
            wVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = wVar.f151935d;
            linkedHashMap.put("live_time", Long.valueOf(currentTimeMillis > j2 ? currentTimeMillis - j2 : 0));
            return linkedHashMap;
        }
    }

    /* renamed from: hl1.k$b */
    public static final class C59990b implements C32232u<Boolean, Integer, Integer, String, C58113g, TRTCCloudDef.TRTCParams, C52005xq0, C13598b0> {

        /* renamed from: d */
        public SoftReference<C59988k> f171258d;

        /* renamed from: e */
        public final String f171259e;

        public C59990b(SoftReference<C59988k> softReference, String str) {
            C87412m.m108594g(str, "tag");
            this.f171258d = softReference;
            this.f171259e = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:178:0x049f, code lost:
            if (r5.mo87015J0(4, -200046, r14, (fy3.C32224a<rx3.C13598b0>) null) != false) goto L_0x0b18;
         */
        /* JADX WARNING: Removed duplicated region for block: B:243:0x060d  */
        /* JADX WARNING: Removed duplicated region for block: B:267:0x064e  */
        /* JADX WARNING: Removed duplicated region for block: B:270:0x0696  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:280:0x06eb  */
        /* JADX WARNING: Removed duplicated region for block: B:287:0x0711  */
        /* JADX WARNING: Removed duplicated region for block: B:288:0x0716  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:297:0x077b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x011d  */
        /* JADX WARNING: Removed duplicated region for block: B:310:0x07b7  */
        /* JADX WARNING: Removed duplicated region for block: B:311:0x07ba  */
        /* JADX WARNING: Removed duplicated region for block: B:313:0x07be  */
        /* JADX WARNING: Removed duplicated region for block: B:318:0x07e9  */
        /* JADX WARNING: Removed duplicated region for block: B:319:0x07ec  */
        /* JADX WARNING: Removed duplicated region for block: B:324:0x080a  */
        /* JADX WARNING: Removed duplicated region for block: B:327:0x0814  */
        /* JADX WARNING: Removed duplicated region for block: B:330:0x081f  */
        /* JADX WARNING: Removed duplicated region for block: B:333:0x0830  */
        /* JADX WARNING: Removed duplicated region for block: B:336:0x0837  */
        /* JADX WARNING: Removed duplicated region for block: B:339:0x084c  */
        /* JADX WARNING: Removed duplicated region for block: B:346:0x085e  */
        /* JADX WARNING: Removed duplicated region for block: B:349:0x087c  */
        /* JADX WARNING: Removed duplicated region for block: B:350:0x087f  */
        /* JADX WARNING: Removed duplicated region for block: B:411:0x0b04  */
        /* JADX WARNING: Removed duplicated region for block: B:412:0x0b0d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r55, java.lang.Object r56, java.lang.Object r57, java.lang.Object r58, java.lang.Object r59, java.lang.Object r60, java.lang.Object r61) {
            /*
                r54 = this;
                r0 = r54
                r1 = r55
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r2 = r56
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                r3 = r57
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                r4 = r58
                java.lang.String r4 = (java.lang.String) r4
                r5 = r59
                d50.g r5 = (d50.C58113g) r5
                r6 = r60
                com.tencent.trtc.TRTCCloudDef$TRTCParams r6 = (com.tencent.trtc.TRTCCloudDef.TRTCParams) r6
                r7 = r61
                te3.xq0 r7 = (te3.C52005xq0) r7
                java.lang.Class<ak1.o> r8 = ak1.C54108o.class
                java.lang.Class<cl1.b> r9 = cl1.C0654b.class
                java.lang.Class<cl1.u> r10 = cl1.C55001u.class
                java.lang.Class<cl1.o> r11 = cl1.C54991o.class
                java.lang.String r12 = "errMsg"
                gy3.C87412m.m108594g(r4, r12)
                java.lang.String r12 = "liveRoomInfo"
                gy3.C87412m.m108594g(r5, r12)
                java.lang.String r12 = "trtcParams"
                gy3.C87412m.m108594g(r6, r12)
                java.lang.String r12 = "resp"
                gy3.C87412m.m108594g(r7, r12)
                java.lang.ref.SoftReference<hl1.k> r12 = r0.f171258d
                if (r12 == 0) goto L_0x0b18
                java.lang.Object r12 = r12.get()
                hl1.k r12 = (hl1.C59988k) r12
                if (r12 == 0) goto L_0x0b18
                qt1.c r13 = nk1.C61794r.f175689a
                java.lang.String r14 = "handleJoinLive start"
                r13.mo12481a(r14)
                vk1.c r14 = r12.f166848f
                if (r14 != 0) goto L_0x005f
                goto L_0x0064
            L_0x005f:
                r15 = 1065353216(0x3f800000, float:1.0)
                r14.setAlpha(r15)
            L_0x0064:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "join live room success:"
                r14.append(r15)
                r14.append(r1)
                java.lang.String r15 = " errCode:"
                r14.append(r15)
                r14.append(r2)
                java.lang.String r15 = " errMsg:"
                r14.append(r15)
                r14.append(r4)
                r55 = r3
                java.lang.String r3 = " isDestroyed:"
                r14.append(r3)
                vk1.c r3 = r12.f166848f
                r56 = r15
                if (r3 == 0) goto L_0x0097
                boolean r3 = r3.isDestroyed()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                goto L_0x0098
            L_0x0097:
                r3 = 0
            L_0x0098:
                r14.append(r3)
                java.lang.String r3 = r14.toString()
                java.lang.String r14 = r0.f171259e
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
                qt1.b r14 = qt1.C63329b.f179694a
                java.lang.String r15 = r0.f171259e
                r14.mo88233d(r15, r3)
                androidx.appcompat.app.AppCompatActivity r3 = r12.f166847e
                android.content.Intent r3 = r3.getIntent()
                java.lang.String r14 = "KEY_TASK_ID"
                java.lang.String r3 = r3.getStringExtra(r14)
                java.lang.String r14 = ""
                if (r3 != 0) goto L_0x00bc
                r3 = r14
            L_0x00bc:
                java.lang.String r15 = ht1.C8785n.f28042a
                boolean r15 = gy3.C87412m.m108589b(r15, r3)
                r57 = r4
                r4 = 0
                if (r15 == 0) goto L_0x010b
                int r15 = r3.length()
                if (r15 <= 0) goto L_0x00cf
                r15 = 1
                goto L_0x00d0
            L_0x00cf:
                r15 = 0
            L_0x00d0:
                if (r15 == 0) goto L_0x010b
                ht1.C8785n.f28042a = r14
                com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r18 = r2
                r2 = 6
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r4] = r3
                java.lang.String r3 = "live_join"
                r19 = 1
                r2[r19] = r3
                long r20 = java.lang.System.currentTimeMillis()
                long r22 = ht1.C8785n.f28044c
                long r20 = r20 - r22
                java.lang.Long r3 = java.lang.Long.valueOf(r20)
                r17 = 2
                r2[r17] = r3
                r3 = 3
                r2[r3] = r14
                java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
                r19 = 4
                r2[r19] = r3
                r3 = 5
                java.lang.Integer r19 = java.lang.Integer.valueOf(r17)
                r2[r3] = r19
                r3 = 23669(0x5c75, float:3.3167E-41)
                r15.mo160131h(r3, r2)
                goto L_0x010d
            L_0x010b:
                r18 = r2
            L_0x010d:
                vk1.c r2 = r12.f166848f
                if (r2 == 0) goto L_0x011a
                boolean r2 = r2.isDestroyed()
                r3 = 1
                if (r2 != r3) goto L_0x011a
                r2 = 1
                goto L_0x011b
            L_0x011a:
                r2 = 0
            L_0x011b:
                if (r2 != 0) goto L_0x0af2
                java.lang.String r2 = r5.f166234d
                if (r2 != 0) goto L_0x0122
                r2 = r14
            L_0x0122:
                androidx.lifecycle.i0 r3 = r12.mo83051g(r10)
                cl1.u r3 = (cl1.C55001u) r3
                d50.h r3 = r3.f154421r
                if (r3 == 0) goto L_0x0133
                d50.g r3 = r3.f166251b
                if (r3 == 0) goto L_0x0133
                java.lang.String r3 = r3.f166234d
                goto L_0x0134
            L_0x0133:
                r3 = 0
            L_0x0134:
                java.lang.String r15 = r12.f171222i
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r61 = r14
                java.lang.String r14 = "localAnchorUserId:"
                r4.append(r14)
                r4.append(r3)
                java.lang.String r14 = ", respAnchorUserId:"
                r4.append(r14)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r4)
                if (r3 == 0) goto L_0x015f
                int r4 = r3.length()
                if (r4 != 0) goto L_0x015d
                goto L_0x015f
            L_0x015d:
                r4 = 0
                goto L_0x0160
            L_0x015f:
                r4 = 1
            L_0x0160:
                if (r4 != 0) goto L_0x016a
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r3)
                if (r2 == 0) goto L_0x016a
                r2 = 1
                goto L_0x016b
            L_0x016a:
                r2 = 0
            L_0x016b:
                if (r2 == 0) goto L_0x016f
                goto L_0x0af2
            L_0x016f:
                vk1.c r2 = r12.f166848f
                if (r2 == 0) goto L_0x0189
                java.lang.Class<yk1.a> r3 = yk1.C66662a.class
                androidx.lifecycle.i0 r2 = r2.business(r3)
                yk1.a r2 = (yk1.C66662a) r2
                if (r2 == 0) goto L_0x0189
                java.lang.String r3 = "Finder.LiveReportSlice"
                java.lang.String r4 = "markJoinStatusRecResp"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                r3 = 2
                r2.f191682f = r3
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x0189:
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                te3.uw0 r3 = r7.f144812I
                if (r3 == 0) goto L_0x0195
                java.util.LinkedList<te3.uv> r3 = r3.f185795d
                goto L_0x0196
            L_0x0195:
                r3 = 0
            L_0x0196:
                if (r3 == 0) goto L_0x01a1
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x019f
                goto L_0x01a1
            L_0x019f:
                r3 = 0
                goto L_0x01a2
            L_0x01a1:
                r3 = 1
            L_0x01a2:
                if (r3 != 0) goto L_0x0209
                java.lang.String r3 = r12.f171222i
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r14 = "handleCheerIconsInfo custom cheer info:"
                r4.append(r14)
                te3.uw0 r14 = r7.f144812I
                if (r14 == 0) goto L_0x01c1
                java.util.LinkedList<te3.uv> r14 = r14.f185795d
                if (r14 == 0) goto L_0x01c1
                int r14 = r14.size()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                goto L_0x01c2
            L_0x01c1:
                r14 = 0
            L_0x01c2:
                r4.append(r14)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                te3.uw0 r3 = r7.f144812I
                if (r3 == 0) goto L_0x01eb
                java.util.LinkedList<te3.uv> r3 = r3.f185795d
                if (r3 == 0) goto L_0x01eb
                r2.addAll(r3)
                te3.uw0 r3 = r7.f144812I
                if (r3 == 0) goto L_0x01de
                int r3 = r3.f185797f
                goto L_0x01df
            L_0x01de:
                r3 = 0
            L_0x01df:
                androidx.lifecycle.i0 r4 = r12.mo83051g(r11)
                cl1.o r4 = (cl1.C54991o) r4
                cl1.o$a r4 = r4.f154278X1
                r14 = 0
                r4.f1589e = r14
                goto L_0x01ec
            L_0x01eb:
                r3 = 0
            L_0x01ec:
                te3.uw0 r4 = r7.f144812I
                if (r4 == 0) goto L_0x0204
                androidx.lifecycle.i0 r14 = r12.mo83051g(r11)
                cl1.o r14 = (cl1.C54991o) r14
                cl1.o$b r15 = new cl1.o$b
                r20 = r3
                java.lang.String r3 = r4.f185799h
                int r4 = r4.f185800i
                r15.<init>(r3, r4)
                r14.f154283Y1 = r15
                goto L_0x0206
            L_0x0204:
                r20 = r3
            L_0x0206:
                r3 = r20
                goto L_0x0267
            L_0x0209:
                te3.yr0 r3 = r7.f144871y
                if (r3 == 0) goto L_0x0210
                java.util.LinkedList<te3.uv> r3 = r3.f145477d
                goto L_0x0211
            L_0x0210:
                r3 = 0
            L_0x0211:
                if (r3 == 0) goto L_0x021c
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x021a
                goto L_0x021c
            L_0x021a:
                r3 = 0
                goto L_0x021d
            L_0x021c:
                r3 = 1
            L_0x021d:
                if (r3 != 0) goto L_0x025f
                java.lang.String r3 = r12.f171222i
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r14 = "handleCheerIconsInfo custom ad cheer info:"
                r4.append(r14)
                te3.yr0 r14 = r7.f144871y
                if (r14 == 0) goto L_0x023c
                java.util.LinkedList<te3.uv> r14 = r14.f145477d
                if (r14 == 0) goto L_0x023c
                int r14 = r14.size()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                goto L_0x023d
            L_0x023c:
                r14 = 0
            L_0x023d:
                r4.append(r14)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                te3.yr0 r3 = r7.f144871y
                if (r3 == 0) goto L_0x0266
                java.util.LinkedList<te3.uv> r3 = r3.f145477d
                if (r3 == 0) goto L_0x0266
                r2.addAll(r3)
                androidx.lifecycle.i0 r3 = r12.mo83051g(r11)
                cl1.o r3 = (cl1.C54991o) r3
                cl1.o$a r3 = r3.f154278X1
                r4 = 1
                r3.f1589e = r4
                r3 = 1
                goto L_0x0267
            L_0x025f:
                java.lang.String r3 = r12.f171222i
                java.lang.String r4 = "handleCheerIconsInfo skip, no custom cheer info."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            L_0x0266:
                r3 = 0
            L_0x0267:
                androidx.lifecycle.i0 r4 = r12.mo83051g(r11)
                cl1.o r4 = (cl1.C54991o) r4
                te3.uw0 r14 = r7.f144812I
                if (r14 == 0) goto L_0x0274
                java.lang.String r14 = r14.f185796e
                goto L_0x0275
            L_0x0274:
                r14 = 0
            L_0x0275:
                r4.mo75972M4(r2, r14, r3)
                java.lang.Class<cl1.m> r4 = cl1.C54985m.class
                androidx.lifecycle.i0 r4 = r12.mo83051g(r4)
                cl1.m r4 = (cl1.C54985m) r4
                cl1.m$b r14 = new cl1.m$b
                te3.uw0 r15 = r7.f144812I
                r20 = r13
                if (r15 == 0) goto L_0x028b
                java.lang.String r13 = r15.f185796e
                goto L_0x028c
            L_0x028b:
                r13 = 0
            L_0x028c:
                r14.<init>(r2, r13, r3)
                if (r15 == 0) goto L_0x0294
                java.util.LinkedList<te3.tw0> r2 = r15.f185798g
                goto L_0x0295
            L_0x0294:
                r2 = 0
            L_0x0295:
                r4.mo75950d3(r14, r2)
                qj1.v9 r2 = r12.f171155E
                if (r2 == 0) goto L_0x02a9
                androidx.lifecycle.i0 r3 = r12.mo83051g(r11)
                cl1.o r3 = (cl1.C54991o) r3
                cl1.o$a r3 = r3.f154278X1
                java.util.List<te3.uv> r3 = r3.f1586b
                r2.mo87991f1(r3)
            L_0x02a9:
                qj1.dg r2 = r12.f171228m1
                if (r2 == 0) goto L_0x02b1
                r3 = 0
                r2.mo87747Z0(r3)
            L_0x02b1:
                androidx.lifecycle.i0 r2 = r12.mo83051g(r11)
                cl1.o r2 = (cl1.C54991o) r2
                al1.r r3 = r2.f154376v2
                java.util.LinkedList<java.lang.String> r3 = r3.f513a
                java.util.LinkedList<java.lang.String> r4 = r7.f144869x
                r3.addAll(r4)
                al1.r r3 = r2.f154376v2
                java.lang.String r4 = r7.f144868w
                r3.f514b = r4
                te3.hx0 r3 = r7.f144854j
                if (r3 == 0) goto L_0x02cd
                int r3 = r3.f134923h
                goto L_0x02ce
            L_0x02cd:
                r3 = 0
            L_0x02ce:
                long r3 = (long) r3
                java.lang.Class<cl1.d0> r13 = cl1.C54963d0.class
                androidx.lifecycle.i0 r13 = r2.business(r13)
                cl1.d0 r13 = (cl1.C54963d0) r13
                int r14 = (int) r3
                r21 = r8
                r15 = 2
                boolean r8 = o40.C61926c.m72696u(r14, r15)
                r13.f154080w = r8
                r8 = 8
                boolean r8 = o40.C61926c.m72696u(r14, r8)
                java.lang.String r13 = r2.f154311f
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r22 = r5
                java.lang.String r5 = "set enableVisitorGiftSwitch:"
                r15.append(r5)
                r15.append(r8)
                java.lang.String r5 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r5)
                r2.f154248R1 = r8
                androidx.lifecycle.i0 r5 = r2.business(r11)
                cl1.o r5 = (cl1.C54991o) r5
                boolean r5 = r5.f154190D
                if (r5 != 0) goto L_0x03b5
                r5 = 1
                boolean r8 = o40.C61926c.m72696u(r14, r5)
                java.lang.Class<ky2.i> r5 = ky2.C10432i.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                ky2.i r5 = (ky2.C10432i) r5
                boolean r5 = r5.mo10750e()
                er1.j4 r13 = er1.C58739j4.f168176a
                r13.getClass()
                f40.o r13 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r13 = r13.mo121142i()
                r14 = 274436(0x43004, float:3.84567E-40)
                r15 = 0
                java.lang.Object r13 = r13.mo119684e(r14, r15)
                boolean r14 = r13 instanceof java.lang.String
                if (r14 == 0) goto L_0x0339
                java.lang.String r13 = (java.lang.String) r13
                goto L_0x033a
            L_0x0339:
                r13 = 0
            L_0x033a:
                java.lang.String r14 = "CN"
                java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r13, (java.lang.String) r14)
                r15 = 1
                boolean r14 = z04.C112551y.m153809i(r14, r13, r15)
                java.lang.String r15 = er1.C58739j4.f168177b
                r23 = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r24 = r9
                java.lang.String r9 = "isRegInChina, regCountryIsoCode:"
                r6.append(r9)
                r6.append(r13)
                java.lang.String r9 = " isChinaReg:"
                r6.append(r9)
                r6.append(r14)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r6)
                java.lang.Class<tf0.p1> r6 = tf0.C64916p1.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                tf0.p1 r6 = (tf0.C64916p1) r6
                boolean r6 = r6.mo76656D0()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r13 = "giftFuncEnableByContactFlag isTeenMode:"
                r9.append(r13)
                r9.append(r5)
                java.lang.String r13 = " pagEnable:"
                r9.append(r13)
                r9.append(r6)
                java.lang.String r13 = " enableGiftByContactFlag:"
                r9.append(r13)
                r9.append(r8)
                java.lang.String r13 = " regChina:"
                r9.append(r13)
                r9.append(r14)
                java.lang.String r13 = " switchFlag:"
                r9.append(r13)
                r9.append(r3)
                java.lang.String r3 = r9.toString()
                java.lang.String r4 = "LiveUtil"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                if (r8 == 0) goto L_0x03b1
                if (r5 != 0) goto L_0x03b1
                if (r6 == 0) goto L_0x03b1
                r3 = 1
                goto L_0x03b2
            L_0x03b1:
                r3 = 0
            L_0x03b2:
                r2.f154243Q1 = r3
                goto L_0x03b9
            L_0x03b5:
                r23 = r6
                r24 = r9
            L_0x03b9:
                r2.mo76022t4(r1)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                androidx.lifecycle.i0 r2 = r12.mo83051g(r11)
                cl1.o r2 = (cl1.C54991o) r2
                te3.c21 r3 = r7.f144846f
                if (r3 == 0) goto L_0x03cb
                long r8 = r3.f182367M
                goto L_0x03cd
            L_0x03cb:
                r8 = 0
            L_0x03cd:
                r2.mo75988W3(r8)
                er1.g5 r2 = er1.C58730g5.f168158a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r6 = "RV_VISITOR_"
                r3.append(r6)
                androidx.lifecycle.i0 r8 = r12.mo83051g(r10)
                cl1.u r8 = (cl1.C55001u) r8
                te3.c21 r8 = r8.f154420q
                long r8 = r8.f182392d
                r3.append(r8)
                java.lang.String r26 = r3.toString()
                er1.e5$c r3 = er1.C58713e5.f168080h
                java.lang.String r3 = r3.f168101b
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 60
                r33 = 0
                r25 = r2
                r27 = r3
                er1.C58730g5.m68220e(r25, r26, r27, r28, r29, r30, r31, r32, r33)
                te3.c21 r3 = r7.f144846f
                if (r3 == 0) goto L_0x040b
                int r3 = r3.f182374S
                goto L_0x040c
            L_0x040b:
                r3 = 0
            L_0x040c:
                r8 = 64
                boolean r3 = o40.C61926c.m72696u(r3, r8)
                te3.c21 r8 = r7.f144846f
                if (r8 == 0) goto L_0x041e
                te3.wg0 r9 = r8.f182380V
                if (r9 == 0) goto L_0x041e
                java.lang.String r9 = r9.f144033e
                if (r9 != 0) goto L_0x0420
            L_0x041e:
                r9 = r61
            L_0x0420:
                if (r8 == 0) goto L_0x042a
                te3.wg0 r13 = r8.f182380V
                if (r13 == 0) goto L_0x042a
                java.lang.String r13 = r13.f144032d
                if (r13 != 0) goto L_0x042c
            L_0x042a:
                r13 = r61
            L_0x042c:
                if (r8 == 0) goto L_0x0435
                te3.wg0 r8 = r8.f182380V
                if (r8 == 0) goto L_0x0435
                int r8 = r8.f144034f
                goto L_0x0436
            L_0x0435:
                r8 = 0
            L_0x0436:
                java.lang.String r14 = r0.f171259e
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r4 = "#handleJoinResp.setAnchorStatus isBizMode="
                r15.append(r4)
                r15.append(r3)
                java.lang.String r4 = " bizUsername="
                r15.append(r4)
                r15.append(r9)
                java.lang.String r4 = " bizNickname="
                r15.append(r4)
                r15.append(r13)
                java.lang.String r4 = " friendFollowCount="
                r15.append(r4)
                r15.append(r8)
                java.lang.String r4 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
                r4 = r24
                if (r3 == 0) goto L_0x0472
                androidx.lifecycle.i0 r5 = r12.mo83051g(r4)
                cl1.b r5 = (cl1.C0654b) r5
                r14 = 1
                r5.mo624d3(r14, r9, r13, r8)
            L_0x0472:
                re1.a r5 = gg1.C32444a.f86212w2
                java.lang.Object r5 = r5.mo60266n()
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x04a3
                ok1.e r5 = ok1.C62042e.f176370a
                r8 = -200046(0xfffffffffffcf292, float:NaN)
                te3.ay0 r14 = new te3.ay0
                r14.<init>()
                r15 = 2
                r14.f130840d = r15
                java.lang.String r15 = "测试title"
                r14.f130842f = r15
                java.lang.String r15 = "测试wording"
                r14.f130841e = r15
                r24 = r2
                r2 = 0
                r15 = 4
                boolean r5 = r5.mo87015J0(r15, r8, r14, r2)
                if (r5 == 0) goto L_0x04a5
                goto L_0x0b18
            L_0x04a3:
                r24 = r2
            L_0x04a5:
                if (r1 == 0) goto L_0x0884
                androidx.lifecycle.i0 r1 = r12.mo83051g(r10)
                cl1.u r1 = (cl1.C55001u) r1
                d50.d r2 = new d50.d
                androidx.appcompat.app.AppCompatActivity r5 = r12.f166847e
                java.lang.Class r5 = r5.getClass()
                java.lang.String r5 = r5.getName()
                r2.<init>(r5)
                d50.h r5 = new d50.h
                r6 = r22
                r8 = r23
                r5.<init>(r8, r6, r2)
                r1.mo76043n3(r5)
                p50.e r1 = r12.mo84868C()
                if (r1 == 0) goto L_0x04db
                b50.g r1 = r1.f176822Y0
                if (r1 == 0) goto L_0x04db
                boolean r1 = r1.mo75229c()
                r2 = 1
                if (r1 != r2) goto L_0x04db
                r1 = 1
                goto L_0x04dc
            L_0x04db:
                r1 = 0
            L_0x04dc:
                if (r1 != 0) goto L_0x050b
                java.lang.Class<cl1.l> r1 = cl1.C0668l.class
                androidx.lifecycle.i0 r1 = r12.mo83051g(r1)
                cl1.l r1 = (cl1.C0668l) r1
                boolean r1 = r1.mo631g3()
                if (r1 == 0) goto L_0x0504
                androidx.lifecycle.i0 r1 = r12.mo83051g(r10)
                cl1.u r1 = (cl1.C55001u) r1
                te3.c21 r1 = r1.f154420q
                long r1 = r1.f182392d
                boolean r1 = r12.mo84896t(r1)
                if (r1 != 0) goto L_0x0504
                java.lang.String r1 = r12.f171222i
                java.lang.String r2 = "chooseAudienModeAfterJoinLive is unpurchase charge live and can't preload live!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                goto L_0x056c
            L_0x0504:
                r1 = 3
                r2 = 0
                r5 = 0
                hl1.C59988k.m69862z(r12, r2, r2, r1, r5)
                goto L_0x056c
            L_0x050b:
                java.lang.String r1 = r12.f171222i
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "chooseAudienModeAfterJoinLive liveRoomModel:"
                r2.append(r5)
                androidx.lifecycle.i0 r5 = r12.mo83051g(r10)
                cl1.u r5 = (cl1.C55001u) r5
                d50.h r5 = r5.f154421r
                r2.append(r5)
                java.lang.String r5 = ", liveExtFlag:"
                r2.append(r5)
                androidx.lifecycle.i0 r5 = r12.mo83051g(r11)
                cl1.o r5 = (cl1.C54991o) r5
                int r5 = r5.f154388y0
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                androidx.lifecycle.i0 r1 = r12.mo83051g(r10)
                cl1.u r1 = (cl1.C55001u) r1
                d50.h r1 = r1.f154421r
                if (r1 == 0) goto L_0x056c
                p50.e r2 = r12.mo84868C()
                if (r2 == 0) goto L_0x056c
                b50.g r2 = r2.f176822Y0
                if (r2 == 0) goto L_0x056c
                d50.g r1 = r1.f166251b
                java.lang.Class<ir.n> r5 = p565ir.C60606n.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                ir.n r5 = (p565ir.C60606n) r5
                androidx.lifecycle.i0 r8 = r12.mo83051g(r10)
                cl1.u r8 = (cl1.C55001u) r8
                te3.c21 r8 = r8.f154420q
                boolean r5 = r5.mo85008I1(r8)
                ok1.e r8 = ok1.C62042e.f176370a
                com.tencent.rtmp.TXLivePlayConfig r8 = r8.mo87034Q()
                r2.mo75234j(r1, r5, r8)
            L_0x056c:
                r12.mo84871F()
                java.lang.Class<cl1.t0> r1 = cl1.C39981t0.class
                androidx.lifecycle.i0 r1 = r12.mo83051g(r1)
                cl1.t0 r1 = (cl1.C39981t0) r1
                te3.c21 r2 = r7.f144846f
                if (r2 == 0) goto L_0x057e
                te3.li2 r2 = r2.f182375S0
                goto L_0x057f
            L_0x057e:
                r2 = 0
            L_0x057f:
                r1.mo62588e3(r2)
                androidx.lifecycle.i0 r1 = r12.mo83051g(r11)
                cl1.o r1 = (cl1.C54991o) r1
                te3.c21 r2 = r7.f144846f
                if (r2 == 0) goto L_0x058f
                int r5 = r2.f182384X
                goto L_0x0590
            L_0x058f:
                r5 = 0
            L_0x0590:
                r1.f154181A3 = r5
                if (r2 == 0) goto L_0x05a5
                te3.by0 r1 = r2.f182402p0
                if (r1 == 0) goto L_0x05a5
                er1.e1 r2 = er1.C45681e1.f123485a
                androidx.lifecycle.i0 r5 = r12.mo83051g(r11)
                cl1.o r5 = (cl1.C54991o) r5
                java.lang.String r8 = "joinLiveResp"
                r2.mo71179a(r5, r8, r1)
            L_0x05a5:
                androidx.lifecycle.i0 r1 = r12.mo83051g(r11)
                cl1.o r1 = (cl1.C54991o) r1
                boolean r1 = r1.mo76007j4()
                qj1.ze r2 = r12.f171224j
                if (r2 == 0) goto L_0x05b8
                f50.d r2 = r2.mo88091c1()
                goto L_0x05b9
            L_0x05b8:
                r2 = 0
            L_0x05b9:
                boolean r2 = r2 instanceof g50.C59364c
                if (r2 == 0) goto L_0x05dd
                qj1.ze r2 = r12.f171224j
                if (r2 == 0) goto L_0x05c6
                f50.d r2 = r2.mo88091c1()
                goto L_0x05c7
            L_0x05c6:
                r2 = 0
            L_0x05c7:
                boolean r5 = r2 instanceof g50.C59364c
                if (r5 == 0) goto L_0x05ce
                g50.c r2 = (g50.C59364c) r2
                goto L_0x05cf
            L_0x05ce:
                r2 = 0
            L_0x05cf:
                if (r2 == 0) goto L_0x05d8
                int r2 = r2.f169679r
                r5 = 1
                if (r2 != r5) goto L_0x05d8
                r2 = 1
                goto L_0x05d9
            L_0x05d8:
                r2 = 0
            L_0x05d9:
                if (r2 == 0) goto L_0x05dd
                r2 = 1
                goto L_0x05de
            L_0x05dd:
                r2 = 0
            L_0x05de:
                java.lang.String r5 = r0.f171259e
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r14 = "isVrLive:"
                r8.append(r14)
                r8.append(r1)
                java.lang.String r14 = ",isVrPlayer:"
                r8.append(r14)
                r8.append(r2)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
                if (r1 == 0) goto L_0x066e
                if (r2 != 0) goto L_0x066e
                androidx.lifecycle.i0 r1 = r12.mo83051g(r11)
                cl1.o r1 = (cl1.C54991o) r1
                int r1 = r1.mo75996d3()
                r2 = 1
                if (r1 != r2) goto L_0x064e
                qj1.ze r1 = r12.f171224j
                if (r1 == 0) goto L_0x0614
                r1.mo88096i1()
            L_0x0614:
                qj1.ze r1 = r12.f171224j
                if (r1 == 0) goto L_0x061d
                com.tencent.rtmp.ui.TXCloudVideoView r1 = r1.mo88092d1()
                goto L_0x061e
            L_0x061d:
                r1 = 0
            L_0x061e:
                r2 = 0
                r5 = 0
                r12.mo84894r(r1, r5, r2)
                p50.e r1 = r12.mo84868C()
                if (r1 == 0) goto L_0x066e
                al1.h r2 = r12.f166849g
                if (r2 == 0) goto L_0x0634
                com.tencent.mm.live.api.LiveConfig r2 = r2.f151977d
                if (r2 == 0) goto L_0x0634
                long r14 = r2.f157064e
                goto L_0x0636
            L_0x0634:
                r14 = 0
            L_0x0636:
                qj1.ze r2 = r12.f171224j
                if (r2 == 0) goto L_0x063f
                f50.d r2 = r2.mo88091c1()
                goto L_0x0640
            L_0x063f:
                r2 = 0
            L_0x0640:
                qj1.ze r5 = r12.f171224j
                if (r5 == 0) goto L_0x0649
                com.tencent.rtmp.ui.TXCloudVideoView r5 = r5.mo88092d1()
                goto L_0x064a
            L_0x0649:
                r5 = 0
            L_0x064a:
                r1.mo87270J0(r14, r2, r5)
                goto L_0x066e
            L_0x064e:
                java.lang.String r1 = r12.f171222i
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "restartCDNPlayer error, audienMode:"
                r2.append(r5)
                androidx.lifecycle.i0 r5 = r12.mo83051g(r11)
                cl1.o r5 = (cl1.C54991o) r5
                int r5 = r5.mo75996d3()
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            L_0x066e:
                di3.d r1 = di3.C86312j.m106911c(r21)
                ak1.o r1 = (ak1.C54108o) r1
                androidx.lifecycle.i0 r2 = r12.mo83051g(r11)
                cl1.o r2 = (cl1.C54991o) r2
                java.lang.String r2 = r2.f154345o
                androidx.lifecycle.i0 r5 = r12.mo83051g(r10)
                cl1.u r5 = (cl1.C55001u) r5
                te3.c21 r5 = r5.f154420q
                long r14 = r5.f182392d
                androidx.lifecycle.i0 r5 = r12.mo83051g(r10)
                cl1.u r5 = (cl1.C55001u) r5
                r8 = r4
                long r4 = r5.f154416j
                r1.getClass()
                ak1.f0 r1 = ak1.C54108o.f151869h
                if (r2 != 0) goto L_0x0698
                r2 = r61
            L_0x0698:
                r1.f151426H = r2
                java.lang.String r2 = o40.C61926c.m72691p(r14)
                r1.f151427I = r2
                java.lang.String r2 = o40.C61926c.m72691p(r4)
                r1.f151428J = r2
                zt3.t r1 = zt3.C119157j.f356862d
                hl1.n r2 = new hl1.n
                r55 = r2
                r56 = r54
                r57 = r3
                r58 = r9
                r59 = r13
                r60 = r7
                r61 = r6
                r55.<init>(r56, r57, r58, r59, r60, r61)
                java.lang.String r4 = r0.f171259e
                zt3.j r1 = (zt3.C119157j) r1
                r1.mo183876g(r2, r4)
                r1 = 0
                r12.mo84879N(r1)
                vk1.c r1 = r12.f166848f
                if (r1 == 0) goto L_0x06d9
                al1.h r1 = r1.getData()
                if (r1 == 0) goto L_0x06d9
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = r1.f151979f
                if (r1 == 0) goto L_0x06d9
                gh1.j r2 = gh1.C59447j.f169870a
                r2.mo84556h(r1, r7)
            L_0x06d9:
                bl3.r r1 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r2 = r12.f166847e
                bl3.r$a r1 = r1.mo62444c(r2)
                java.lang.Class<zk1.r0> r2 = zk1.C66879r0.class
                bl3.t r1 = r1.mo62449e(r2)
                zk1.r0 r1 = (zk1.C66879r0) r1
                if (r1 == 0) goto L_0x06ee
                r1.mo90874e3(r7)
            L_0x06ee:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                androidx.lifecycle.i0 r2 = r12.mo83051g(r10)
                cl1.u r2 = (cl1.C55001u) r2
                te3.c21 r2 = r2.f154420q
                long r4 = r2.f182392d
                r13 = 0
                r1.mo77639m(r13, r4)
                qj1.ze r1 = r12.f171224j
                if (r1 == 0) goto L_0x0720
                f50.d r1 = r1.mo88091c1()
                if (r1 == 0) goto L_0x0720
                ok1.e r2 = ok1.C62042e.f176370a
                fj1.b r4 = r12.f166851d
                vk1.c r5 = r12.f166848f
                if (r5 == 0) goto L_0x0716
                boolean r5 = r5.isLandscape()
                goto L_0x0717
            L_0x0716:
                r5 = 0
            L_0x0717:
                boolean r9 = r12.f171186S1
                int r2 = r2.mo87123v0(r4, r5, r9)
                r1.setRenderMode(r2)
            L_0x0720:
                java.lang.String r1 = r0.f171259e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "join live "
                r2.append(r4)
                androidx.lifecycle.i0 r4 = r12.mo83051g(r11)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                java.lang.String r1 = "setup begin"
                r4 = r20
                r4.mo12482c(r1)
                androidx.lifecycle.i0 r1 = r12.mo83051g(r10)
                cl1.u r1 = (cl1.C55001u) r1
                d50.h r1 = r1.f154421r
                if (r1 == 0) goto L_0x0765
                p50.e r2 = r12.mo84868C()
                if (r2 == 0) goto L_0x0765
                r5 = 0
                r9 = 0
                r13 = 4
                r14 = 0
                r55 = r2
                r56 = r1
                r57 = r5
                r58 = r9
                r59 = r13
                r60 = r14
                b50.C54408d.C54409a.m61122b(r55, r56, r57, r58, r59, r60)
            L_0x0765:
                java.lang.String r1 = "setup end"
                r4.mo12482c(r1)
                cj1.w3 r1 = cj1.C54843w3.f153747a
                fj1.b r2 = r12.f166851d
                r1.mo75792g(r2)
                fj1.b r2 = r12.f166851d
                java.lang.String r5 = r7.f144823S
                r1.mo75793h(r2, r5)
                if (r3 != 0) goto L_0x07a1
                fj1.b r2 = r12.f166851d
                te3.wg0 r3 = r7.f144807D
                r1.mo75791f(r2, r3)
                r2 = r8
                androidx.lifecycle.i0 r2 = r12.mo83051g(r2)
                cl1.b r2 = (cl1.C0654b) r2
                te3.wg0 r3 = r7.f144807D
                if (r3 == 0) goto L_0x0790
                java.lang.String r5 = r3.f144033e
                goto L_0x0791
            L_0x0790:
                r5 = 0
            L_0x0791:
                if (r3 == 0) goto L_0x0796
                java.lang.String r8 = r3.f144032d
                goto L_0x0797
            L_0x0796:
                r8 = 0
            L_0x0797:
                if (r3 == 0) goto L_0x079c
                int r3 = r3.f144034f
                goto L_0x079d
            L_0x079c:
                r3 = 0
            L_0x079d:
                r9 = 0
                r2.mo624d3(r9, r5, r8, r3)
            L_0x07a1:
                fj1.b r2 = r12.f166851d
                r1.mo75788c(r2)
                fj1.b r2 = r12.f166851d
                te3.cs1 r3 = r7.f144813J
                r1.mo75787b(r2, r3)
                androidx.lifecycle.i0 r1 = r12.mo83051g(r10)
                cl1.u r1 = (cl1.C55001u) r1
                d50.h r1 = r1.f154421r
                if (r1 == 0) goto L_0x07ba
                com.tencent.trtc.TRTCCloudDef$TRTCParams r1 = r1.f166250a
                goto L_0x07bb
            L_0x07ba:
                r1 = 0
            L_0x07bb:
                if (r1 != 0) goto L_0x07be
                goto L_0x07c2
            L_0x07be:
                r2 = 21
                r1.role = r2
            L_0x07c2:
                androidx.lifecycle.i0 r1 = r12.mo83051g(r11)
                cl1.o r1 = (cl1.C54991o) r1
                long r2 = android.os.SystemClock.elapsedRealtimeNanos()
                r1.f154325i1 = r2
                androidx.lifecycle.i0 r1 = r12.mo83051g(r11)
                cl1.o r1 = (cl1.C54991o) r1
                long r2 = android.os.SystemClock.elapsedRealtime()
                r1.mo75964I4(r2)
                androidx.lifecycle.i0 r1 = r12.mo83051g(r10)
                cl1.u r1 = (cl1.C55001u) r1
                d50.h r1 = r1.f154421r
                if (r1 == 0) goto L_0x07ec
                d50.g r1 = r1.f166251b
                if (r1 == 0) goto L_0x07ec
                int r1 = r1.f166233c
                goto L_0x07ed
            L_0x07ec:
                r1 = 0
            L_0x07ed:
                long r2 = r6.f166232b
                t50.C64204a.f181932a = r1
                t50.C64204a.f181933b = r2
                te3.m31 r1 = r7.f144848g
                r12.mo84899w(r1)
                ok1.e r1 = ok1.C62042e.f176370a
                fj1.b r2 = r12.f166851d
                boolean r2 = r1.mo87070c1(r2)
                if (r2 != 0) goto L_0x0814
                fj1.b r2 = r12.f166851d
                boolean r2 = r1.mo87094l1(r2)
                if (r2 != 0) goto L_0x0814
                vk1.c r2 = r12.f166848f
                if (r2 == 0) goto L_0x081b
                fj1.b r3 = r12.f166851d
                r1.mo87124v1(r3, r2)
                goto L_0x081b
            L_0x0814:
                java.lang.String r1 = r0.f171259e
                java.lang.String r2 = "redpacket got ,no notify"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            L_0x081b:
                qj1.sf r1 = r12.f171179Q0
                if (r1 == 0) goto L_0x082c
                androidx.lifecycle.i0 r2 = r12.mo83051g(r11)
                cl1.o r2 = (cl1.C54991o) r2
                boolean r2 = r2.mo75966J4()
                r1.mo87915d1(r2)
            L_0x082c:
                qj1.ue r1 = r12.f171154D1
                if (r1 == 0) goto L_0x0833
                r1.mo87970b1()
            L_0x0833:
                vk1.c r1 = r12.f166848f
                if (r1 == 0) goto L_0x083e
                d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_JOIN_LIVE_SUCCESS
                r3 = 2
                r5 = 0
                d60.C58124b.C7172a.m7372a(r1, r2, r5, r3, r5)
            L_0x083e:
                r1 = 200(0xc8, double:9.9E-322)
                hl1.l r3 = new hl1.l
                r3.<init>(r12)
                o40.C61926c.m72666K(r1, r3)
                vk1.c r1 = r12.f166848f
                if (r1 == 0) goto L_0x0857
                te3.c21 r2 = r7.f144846f
                if (r2 == 0) goto L_0x0853
                te3.l21 r2 = r2.f182360F
                goto L_0x0854
            L_0x0853:
                r2 = 0
            L_0x0854:
                r1.processFinderLiveLayerShowInfo(r2)
            L_0x0857:
                hl1.C59988k.m69860o(r12)
                vk1.c r1 = r12.f166848f
                if (r1 == 0) goto L_0x0866
                hl1.m r2 = new hl1.m
                r2.<init>(r12)
                r1.post(r2)
            L_0x0866:
                hl1.C59988k.m69859n(r12)
                androidx.lifecycle.i0 r1 = r12.mo83051g(r10)
                cl1.u r1 = (cl1.C55001u) r1
                r1.mo76033c3()
                androidx.lifecycle.i0 r1 = r12.mo83051g(r11)
                cl1.o r1 = (cl1.C54991o) r1
                te3.h51 r2 = r7.f144845e1
                if (r2 == 0) goto L_0x087f
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r15 = r2.f134449d
                goto L_0x0880
            L_0x087f:
                r15 = 0
            L_0x0880:
                r1.f154270V3 = r15
                goto L_0x0ae4
            L_0x0884:
                r4 = r20
                r2 = 1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                androidx.lifecycle.i0 r3 = r12.mo83051g(r10)
                cl1.u r3 = (cl1.C55001u) r3
                te3.c21 r3 = r3.f154420q
                long r5 = r3.f182392d
                r1.append(r5)
                java.lang.String r26 = r1.toString()
                er1.e5$c r1 = er1.C58713e5.f168083k
                java.lang.String r1 = r1.f168101b
                er1.j4 r3 = er1.C58739j4.f168176a
                te3.zo2 r5 = new te3.zo2
                r5.<init>()
                r6 = r18
                r5.f186779e = r6
                r8 = r57
                r5.f186780f = r8
                pe3.b r28 = r3.mo83710g0(r5)
                r29 = 0
                r30 = 1
                r31 = 0
                r32 = 40
                r33 = 0
                r25 = r24
                r27 = r1
                er1.C58730g5.m68220e(r25, r26, r27, r28, r29, r30, r31, r32, r33)
                vk1.c r1 = r12.f166848f
                if (r1 == 0) goto L_0x08cf
                r1.disableRatation()
            L_0x08cf:
                te3.ay0 r1 = r7.f144808E
                java.lang.Class<ht1.g4> r5 = ht1.C60172g4.class
                ak1.f0$o r7 = ak1.C54067f0.C54075o.LIVE_STOPPED
                java.lang.Class<ak1.w> r9 = ak1.C54116w.class
                java.lang.String r13 = r12.f171222i
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "join live room errCode:"
                r14.append(r15)
                r14.append(r6)
                r15 = r56
                r14.append(r15)
                r14.append(r8)
                java.lang.String r15 = "， errPage:"
                r14.append(r15)
                if (r1 == 0) goto L_0x08fb
                org.json.JSONObject r15 = o40.C61937h.m72709h(r1)
                goto L_0x08fd
            L_0x08fb:
                java.lang.String r15 = "null"
            L_0x08fd:
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
                ok1.e r13 = ok1.C62042e.f176370a
                r14 = r55
                r15 = 0
                boolean r13 = r13.mo87015J0(r14, r6, r1, r15)
                if (r13 == 0) goto L_0x0914
                goto L_0x0ae4
            L_0x0914:
                switch(r6) {
                    case -200173: goto L_0x097b;
                    case -200030: goto L_0x096c;
                    case -200001: goto L_0x095d;
                    case -100038: goto L_0x0919;
                    default: goto L_0x0917;
                }
            L_0x0917:
                goto L_0x0997
            L_0x0919:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.lang.String r2 = "PARAM_KEY_LIVE_END_WITH_ANIMATION"
                r3 = 0
                r1.putBoolean(r2, r3)
                vk1.c r2 = r12.f166848f
                if (r2 == 0) goto L_0x092d
                d60.b$b r3 = d60.C58124b.C58125b.LIVE_HAS_FINISHED
                r2.statusChange(r3, r1)
            L_0x092d:
                androidx.lifecycle.i0 r1 = r12.mo83051g(r11)
                cl1.o r1 = (cl1.C54991o) r1
                boolean r1 = r1.f154200F2
                if (r1 == 0) goto L_0x09fb
                di3.d r1 = di3.C86312j.m106911c(r9)
                ak1.w r1 = (ak1.C54116w) r1
                androidx.lifecycle.i0 r2 = r12.mo83051g(r10)
                cl1.u r2 = (cl1.C55001u) r2
                long r2 = r2.f154416j
                java.lang.String r2 = java.lang.String.valueOf(r2)
                androidx.lifecycle.i0 r3 = r12.mo83051g(r10)
                cl1.u r3 = (cl1.C55001u) r3
                te3.c21 r3 = r3.f154420q
                long r13 = r3.f182392d
                java.lang.String r3 = java.lang.String.valueOf(r13)
                r6 = 4
                r1.Fx0(r6, r2, r3)
                goto L_0x09fb
            L_0x095d:
                vk1.c r1 = r12.f166848f
                if (r1 == 0) goto L_0x0968
                d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_VISITOR_KICKED
                r3 = 2
                r6 = 0
                d60.C58124b.C7172a.m7372a(r1, r2, r6, r3, r6)
            L_0x0968:
                ak1.f0$o r7 = ak1.C54067f0.C54075o.LIVE_IN_BLACK_LIST
                goto L_0x09fb
            L_0x096c:
                r3 = 2
                r6 = 0
                vk1.c r1 = r12.f166848f
                if (r1 == 0) goto L_0x0977
                d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_VISITOR_PRIVATE_PERMISSION
                d60.C58124b.C7172a.m7372a(r1, r2, r6, r3, r6)
            L_0x0977:
                ak1.f0$o r7 = ak1.C54067f0.C54075o.LIVE_NO_ACCESS_PERMISSION
                goto L_0x09fb
            L_0x097b:
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                if (r1 == 0) goto L_0x098b
                byte[] r1 = r1.toByteArray()
                java.lang.String r3 = "PARAM_FINDER_LIVE_JOIN_ERR_PAGE"
                r2.putByteArray(r3, r1)
            L_0x098b:
                vk1.c r1 = r12.f166848f
                if (r1 == 0) goto L_0x0994
                d60.b$b r3 = d60.C58124b.C58125b.LIVE_STATUS_VISITOR_OVERLOAD_LIMITED
                r1.statusChange(r3, r2)
            L_0x0994:
                ak1.f0$o r7 = ak1.C54067f0.C54075o.LIVE_OVERLOAD
                goto L_0x09fb
            L_0x0997:
                qo3.q r1 = new qo3.q
                androidx.appcompat.app.AppCompatActivity r6 = r12.f166847e
                r1.<init>(r6)
                int r6 = r8.length()
                if (r6 != 0) goto L_0x09a5
                goto L_0x09a6
            L_0x09a5:
                r2 = 0
            L_0x09a6:
                if (r2 == 0) goto L_0x09b6
                androidx.appcompat.app.AppCompatActivity r2 = r12.f166847e
                android.content.res.Resources r2 = r2.getResources()
                r6 = 2131832041(0x7f112ce9, float:1.9297125E38)
                java.lang.String r2 = r2.getString(r6)
                r8 = r2
            L_0x09b6:
                java.lang.String r2 = "if (errMsg.isNullOrEmpty…         errMsg\n        }"
                gy3.C87412m.m108593f(r8, r2)
                r1.mo107595g(r8)
                androidx.appcompat.app.AppCompatActivity r2 = r12.f166847e
                android.content.res.Resources r2 = r2.getResources()
                r6 = 2131826955(0x7f11190b, float:1.928681E38)
                java.lang.String r2 = r2.getString(r6)
                r1.mo107602n(r2)
                hl1.w3 r2 = new hl1.w3
                r2.<init>(r12)
                r1.mo107600l(r2)
                r1.mo107603o()
                r12.mo84866A()
                boolean r1 = r3.mo83692U()
                if (r1 == 0) goto L_0x09fb
                androidx.appcompat.app.AppCompatActivity r1 = r12.f166847e
                android.content.res.Resources r2 = r1.getResources()
                r3 = 2131830088(0x7f112548, float:1.9293163E38)
                java.lang.String r2 = r2.getString(r3)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r3 = 0
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r3)
                r1.show()
            L_0x09fb:
                di3.d r1 = di3.C86312j.m106911c(r9)
                ak1.w r1 = (ak1.C54116w) r1
                r1.getClass()
                r1.f151918T = r7
                di3.d r1 = di3.C86312j.m106911c(r21)
                r34 = r1
                ak1.o r34 = (ak1.C54108o) r34
                androidx.lifecycle.i0 r1 = r12.mo83051g(r10)
                cl1.u r1 = (cl1.C55001u) r1
                long r1 = r1.f154416j
                androidx.lifecycle.i0 r3 = r12.mo83051g(r10)
                cl1.u r3 = (cl1.C55001u) r3
                te3.c21 r3 = r3.f154420q
                long r13 = r3.f182392d
                androidx.lifecycle.i0 r3 = r12.mo83051g(r11)
                cl1.o r3 = (cl1.C54991o) r3
                java.lang.String r3 = r3.f154345o
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto L_0x0a37
                androidx.lifecycle.i0 r3 = r12.mo83051g(r11)
                cl1.o r3 = (cl1.C54991o) r3
                java.lang.String r3 = r3.f154345o
                goto L_0x0a3f
            L_0x0a37:
                androidx.lifecycle.i0 r3 = r12.mo83051g(r11)
                cl1.o r3 = (cl1.C54991o) r3
                java.lang.String r3 = r3.f154345o
            L_0x0a3f:
                r39 = r3
                di3.d r3 = di3.C86312j.m106911c(r21)
                ak1.o r3 = (ak1.C54108o) r3
                r3.getClass()
                ak1.f0 r3 = ak1.C54108o.f151869h
                r15 = r13
                long r13 = r3.f151447b
                java.lang.Class<cl1.e1> r6 = cl1.C0656e1.class
                androidx.lifecycle.i0 r6 = r12.mo83051g(r6)
                cl1.e1 r6 = (cl1.C0656e1) r6
                java.util.ArrayList<te3.hx0> r6 = r6.f1549f
                int r6 = r6.size()
                r17 = r13
                long r13 = (long) r6
                ak1.f0$q r44 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM_REAL
                di3.d r6 = di3.C86312j.m106911c(r21)
                ak1.o r6 = (ak1.C54108o) r6
                r6.getClass()
                java.lang.String r6 = r3.f151445a
                long r7 = r7.f151523d
                di3.d r11 = di3.C86312j.m106911c(r9)
                ak1.w r11 = (ak1.C54116w) r11
                r19 = r7
                long r7 = r11.f151950p
                r22 = 0
                int r11 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
                if (r11 > 0) goto L_0x0a84
                long r7 = java.lang.System.currentTimeMillis()
                goto L_0x0a8c
            L_0x0a84:
                di3.d r7 = di3.C86312j.m106911c(r9)
                ak1.w r7 = (ak1.C54116w) r7
                long r7 = r7.f151950p
            L_0x0a8c:
                r48 = r7
                di3.d r7 = di3.C86312j.m106911c(r21)
                ak1.o r7 = (ak1.C54108o) r7
                r7.getClass()
                ak1.f0$s0 r3 = r3.f151432N
                androidx.lifecycle.i0 r7 = r12.mo83051g(r10)
                cl1.u r7 = (cl1.C55001u) r7
                java.lang.String r7 = r7.f154424u
                bl3.r r8 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r9 = r12.f166847e
                bl3.r$a r9 = r8.mo62444c(r9)
                bl3.c r9 = r9.mo62447c(r5)
                ht1.g4 r9 = (ht1.C60172g4) r9
                java.lang.String r9 = r9.mo12839E3()
                if (r9 != 0) goto L_0x0ab8
                r52 = r61
                goto L_0x0aba
            L_0x0ab8:
                r52 = r9
            L_0x0aba:
                androidx.appcompat.app.AppCompatActivity r9 = r12.f166847e
                bl3.r$a r8 = r8.mo62444c(r9)
                bl3.c r5 = r8.mo62447c(r5)
                ht1.g4 r5 = (ht1.C60172g4) r5
                java.lang.String r5 = r5.mo12868z3()
                if (r5 != 0) goto L_0x0acf
                r53 = r61
                goto L_0x0ad1
            L_0x0acf:
                r53 = r5
            L_0x0ad1:
                r35 = r1
                r37 = r15
                r40 = r17
                r42 = r13
                r45 = r6
                r46 = r19
                r50 = r3
                r51 = r7
                r34.Hx0(r35, r37, r39, r40, r42, r44, r45, r46, r48, r50, r51, r52, r53)
            L_0x0ae4:
                hl1.b3 r1 = new hl1.b3
                r1.<init>(r12)
                o40.C61926c.m72668M(r1)
                java.lang.String r1 = "handleJoinLive end"
                r4.mo11310b(r1)
                goto L_0x0b18
            L_0x0af2:
                r6 = 0
                java.lang.String r1 = r0.f171259e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "skip this join resp, baseRouter?.isDestroyed():"
                r2.append(r3)
                vk1.c r3 = r12.f166848f
                if (r3 == 0) goto L_0x0b0d
                boolean r3 = r3.isDestroyed()
                java.lang.Boolean r15 = java.lang.Boolean.valueOf(r3)
                goto L_0x0b0e
            L_0x0b0d:
                r15 = r6
            L_0x0b0e:
                r2.append(r15)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            L_0x0b18:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.C59990b.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: hl1.k$c */
    public static final class C59991c implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public SoftReference<C59988k> f171260d;

        /* renamed from: e */
        public final String f171261e;

        public C59991c(SoftReference<C59988k> softReference, String str) {
            C87412m.m108594g(str, "tag");
            this.f171260d = softReference;
            this.f171261e = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
            r4 = ((cl1.C54979h1) r2.mo71262a(r0)).f154139n;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                java.lang.Class<cl1.h1> r0 = cl1.C54979h1.class
                java.lang.ref.SoftReference<hl1.k> r1 = r12.f171260d
                if (r1 == 0) goto L_0x015f
                java.lang.Object r1 = r1.get()
                hl1.k r1 = (hl1.C59988k) r1
                if (r1 == 0) goto L_0x015f
                java.lang.String r2 = r12.f171261e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "prepare shopping:"
                r3.append(r4)
                r3.append(r13)
                java.lang.String r4 = ",list empty:"
                r3.append(r4)
                androidx.lifecycle.i0 r4 = r1.mo83051g(r0)
                cl1.h1 r4 = (cl1.C54979h1) r4
                p40.a<cm1.i2> r4 = r4.f154140o
                boolean r4 = r4.mo87254e()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                if (r13 == 0) goto L_0x015f
                np1.w r13 = np1.C61882w.f175962a
                fj1.b r2 = r1.f166851d
                r13.getClass()
                ok1.e r13 = ok1.C62042e.f176370a
                r3 = 0
                if (r2 == 0) goto L_0x0059
                androidx.lifecycle.i0 r4 = r2.mo71262a(r0)
                cl1.h1 r4 = (cl1.C54979h1) r4
                te3.i11 r4 = r4.f154139n
                if (r4 == 0) goto L_0x0059
                te3.bb1 r4 = r4.f183578h
                goto L_0x005a
            L_0x0059:
                r4 = r3
            L_0x005a:
                java.util.List r13 = r13.mo87121u0(r4)
                r4 = 0
                java.util.ArrayList r13 = (java.util.ArrayList) r13
                java.util.Iterator r13 = r13.iterator()
            L_0x0065:
                boolean r5 = r13.hasNext()
                if (r5 == 0) goto L_0x00f0
                java.lang.Object r5 = r13.next()
                int r6 = r4 + 1
                if (r4 < 0) goto L_0x00ec
                di0.o r5 = (di0.C86299o) r5
                java.lang.String r7 = r5.f250930b
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                java.lang.String r8 = "[checkPreRender] index:"
                if (r7 == 0) goto L_0x009e
                java.lang.String r13 = np1.C61882w.f175963b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r3 = " fail, appId:"
                r2.append(r3)
                java.lang.String r3 = r5.f250930b
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
                goto L_0x00fb
            L_0x009e:
                java.lang.Class<kr0.x0> r7 = kr0.C76630x0.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                kr0.x0 r7 = (kr0.C76630x0) r7
                java.lang.String r9 = r5.f250930b
                er1.j4 r10 = er1.C58739j4.f168176a
                int r10 = r10.mo83673A()
                boolean r7 = r7.mo106899ud(r9, r10)
                java.lang.String r9 = np1.C61882w.f175963b
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r8)
                r10.append(r4)
                java.lang.String r4 = " hasInstance:"
                r10.append(r4)
                r10.append(r7)
                java.lang.String r4 = ",appId:"
                r10.append(r4)
                java.lang.String r4 = r5.f250930b
                r10.append(r4)
                java.lang.String r4 = ",patch:"
                r10.append(r4)
                java.lang.String r4 = r5.f250934f
                r10.append(r4)
                java.lang.String r4 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
                if (r7 != 0) goto L_0x00e9
                np1.w r4 = np1.C61882w.f175962a
                r4.mo86814a(r2, r5)
            L_0x00e9:
                r4 = r6
                goto L_0x0065
            L_0x00ec:
                sx3.C64197v.m75542k()
                throw r3
            L_0x00f0:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                if (r13 != 0) goto L_0x00fb
                java.lang.String r13 = np1.C61882w.f175963b
                java.lang.String r2 = "[checkPreRender] preRenderList is empty!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            L_0x00fb:
                fj1.b r13 = r1.f166851d
                java.lang.String r1 = "liveData"
                gy3.C87412m.m108594g(r13, r1)
                java.lang.Class<ht1.f4> r1 = ht1.C60169f4.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                r2 = r1
                ht1.f4 r2 = (ht1.C60169f4) r2
                if (r2 == 0) goto L_0x015f
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r1 = "getContext()"
                gy3.C87412m.m108593f(r3, r1)
                androidx.lifecycle.i0 r0 = r13.mo71262a(r0)
                cl1.h1 r0 = (cl1.C54979h1) r0
                te3.i11 r0 = r0.f154139n
                if (r0 == 0) goto L_0x0128
                te3.bb1 r0 = r0.f183578h
                if (r0 == 0) goto L_0x0128
                java.lang.String r0 = r0.f131034d
                if (r0 != 0) goto L_0x012a
            L_0x0128:
                java.lang.String r0 = ""
            L_0x012a:
                r5 = r0
                np1.w r0 = np1.C61882w.f175962a
                r0.getClass()
                boolean r6 = np1.C61882w.f175964c
                boolean r7 = np1.C61882w.f175965d
                java.lang.Class<cl1.u> r0 = cl1.C55001u.class
                androidx.lifecycle.i0 r0 = r13.mo71262a(r0)
                cl1.u r0 = (cl1.C55001u) r0
                te3.c21 r0 = r0.f154420q
                long r0 = r0.f182392d
                java.lang.String r8 = java.lang.String.valueOf(r0)
                zc1.b r0 = zc1.C66785b.f191882e
                java.lang.String r9 = r0.mo90662O5()
                java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                androidx.lifecycle.i0 r13 = r13.mo71262a(r0)
                cl1.o r13 = (cl1.C54991o) r13
                long r0 = r13.f154325i1
                java.lang.String r11 = java.lang.String.valueOf(r0)
                java.lang.String r4 = ""
                java.lang.String r10 = ""
                r2.w30(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            L_0x015f:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.C59991c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: hl1.k$d */
    public static final class C59992d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Bundle f171262d;

        /* renamed from: e */
        public final /* synthetic */ C59988k f171263e;

        /* renamed from: f */
        public final /* synthetic */ C46854h f171264f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59992d(Bundle bundle, C59988k kVar, C46854h hVar) {
            super(0);
            this.f171262d = bundle;
            this.f171263e = kVar;
            this.f171264f = hVar;
        }

        public Object invoke() {
            Bundle bundle = this.f171262d;
            boolean z = true;
            int i = 0;
            if (bundle == null || !bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
                z = false;
            }
            if (z) {
                C59988k kVar = this.f171263e;
                if (kVar.f171180Q1 == 0) {
                    ViewGroup.LayoutParams layoutParams = this.f171264f.f166287d.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    kVar.f171180Q1 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    String str = this.f171263e.f171222i;
                    Log.m105924i(str, "lxltest2 originCommentViewPagerBottomMargin:" + this.f171263e.f171180Q1);
                }
                ViewGroup.LayoutParams layoutParams2 = this.f171264f.f166287d.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                layoutParams3.addRule(12);
                layoutParams3.removeRule(2);
            } else {
                ViewGroup.LayoutParams layoutParams4 = this.f171264f.f166287d.getLayoutParams();
                C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
                C59988k kVar2 = this.f171263e;
                layoutParams5.removeRule(12);
                ConstraintLayout constraintLayout = kVar2.f171232o1;
                if (constraintLayout != null) {
                    i = constraintLayout.getId();
                }
                layoutParams5.addRule(2, i);
                layoutParams5.bottomMargin = kVar2.f171180Q1;
                this.f171264f.f166287d.requestLayout();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hl1.k$e */
    public static final class C59993e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59988k f171265d;

        /* renamed from: e */
        public final /* synthetic */ View f171266e;

        /* renamed from: f */
        public final /* synthetic */ boolean f171267f;

        /* renamed from: g */
        public final /* synthetic */ C8478d0 f171268g;

        /* renamed from: h */
        public final /* synthetic */ C8478d0 f171269h;

        public C59993e(C59988k kVar, View view, boolean z, C8478d0 d0Var, C8478d0 d0Var2) {
            this.f171265d = kVar;
            this.f171266e = view;
            this.f171267f = z;
            this.f171268g = d0Var;
            this.f171269h = d0Var2;
        }

        public final void run() {
            this.f171265d.mo84876K(this.f171266e, this.f171267f, this.f171268g.f27483d, this.f171269h.f27483d);
        }
    }

    /* renamed from: hl1.k$f */
    public static final class C59994f extends C87413o implements C32224a<C62699d4> {

        /* renamed from: d */
        public final /* synthetic */ C59988k f171270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59994f(C59988k kVar) {
            super(0);
            this.f171270d = kVar;
        }

        public Object invoke() {
            C59988k kVar = this.f171270d;
            C65762c cVar = kVar.f166848f;
            if (cVar == null) {
                return null;
            }
            C62699d4 d4Var = new C62699d4((ViewGroup) kVar.mo83046i(C0966R.C0970id.dgz, cVar), cVar);
            kVar.f171247v1 = true;
            d4Var.mo10792g(8);
            d4Var.mo8357i0();
            return d4Var;
        }
    }

    /* renamed from: hl1.k$k */
    public static final class C59995k extends C87413o implements C32224a<C60034u> {

        /* renamed from: d */
        public final /* synthetic */ C59988k f171271d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59995k(C59988k kVar) {
            super(0);
            this.f171271d = kVar;
        }

        public Object invoke() {
            return new C60034u(this.f171271d);
        }
    }

    /* renamed from: hl1.k$l */
    public static final class C59996l extends C87413o implements C32224a<C63102x6> {

        /* renamed from: d */
        public final /* synthetic */ C65762c f171272d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59996l(C65762c cVar) {
            super(0);
            this.f171272d = cVar;
        }

        public Object invoke() {
            View findViewById = this.f171272d.findViewById(C0966R.C0970id.fzo);
            C87412m.m108593f(findViewById, "router.findViewById(R.id.live_tx_game_info_view)");
            return new C63102x6((FinderLiveGameInfoView) findViewById, this.f171272d);
        }
    }

    /* renamed from: hl1.k$m */
    public static final class C59997m extends C87413o implements C32224a<C63046v6> {

        /* renamed from: d */
        public final /* synthetic */ C65762c f171273d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59997m(C65762c cVar) {
            super(0);
            this.f171273d = cVar;
        }

        public Object invoke() {
            View findViewById = this.f171273d.findViewById(C0966R.C0970id.dkv);
            C87412m.m108593f(findViewById, "router.findViewById(R.id…ayer_frame_set_container)");
            return new C63046v6((ViewGroup) findViewById, this.f171273d);
        }
    }

    /* renamed from: hl1.k$n */
    public static final class C59998n extends C87413o implements C32224a<C63005u6> {

        /* renamed from: d */
        public final /* synthetic */ C65762c f171274d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59998n(C65762c cVar) {
            super(0);
            this.f171274d = cVar;
        }

        public Object invoke() {
            View findViewById = this.f171274d.findViewById(C0966R.C0970id.dku);
            C87412m.m108593f(findViewById, "router.findViewById(R.id…rate_frame_set_container)");
            return new C63005u6((ViewGroup) findViewById, this.f171274d);
        }
    }

    /* renamed from: hl1.k$o */
    public static final class C59999o extends C87413o implements C32224a<C62868l6> {

        /* renamed from: d */
        public final /* synthetic */ C65762c f171275d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59999o(C65762c cVar) {
            super(0);
            this.f171275d = cVar;
        }

        public Object invoke() {
            View findViewById = this.f171275d.findViewById(C0966R.C0970id.e1v);
            C87412m.m108593f(findViewById, "router.findViewById(R.id…der_live_visitor_ui_root)");
            return new C62868l6((ViewGroup) findViewById, this.f171275d);
        }
    }

    /* renamed from: hl1.k$q */
    public static final class C60000q extends C87413o implements C32224a<C62927ph> {

        /* renamed from: d */
        public final /* synthetic */ C59988k f171276d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60000q(C59988k kVar) {
            super(0);
            this.f171276d = kVar;
        }

        public Object invoke() {
            C59988k kVar = this.f171276d;
            C65762c cVar = kVar.f166848f;
            if (cVar == null) {
                return null;
            }
            C62927ph phVar = new C62927ph((ViewGroup) kVar.mo83046i(C0966R.C0970id.e1k, cVar), cVar);
            kVar.f171148A1 = true;
            phVar.mo10792g(8);
            phVar.mo8357i0();
            return phVar;
        }
    }

    /* renamed from: hl1.k$s */
    public static final class C60001s extends C87413o implements C32226l<C54130j, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f171277d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60001s(String str) {
            super(1);
            this.f171277d = str;
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(Util.isEqual(((C54130j) obj).f151997a, this.f171277d));
        }
    }

    /* renamed from: hl1.k$t */
    public static final class C60002t extends C87413o implements C32226l<C54130j, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f171278d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60002t(String str) {
            super(1);
            this.f171278d = str;
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(Util.isEqual(((C54130j) obj).f151997a, this.f171278d));
        }
    }

    /* renamed from: hl1.k$u */
    public static final class C60003u implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59988k f171279d;

        /* renamed from: e */
        public final /* synthetic */ C54130j f171280e;

        public C60003u(C59988k kVar, C54130j jVar) {
            this.f171279d = kVar;
            this.f171280e = jVar;
        }

        public final void run() {
            ArrayList<C54130j> lastMicUserList;
            Class cls = C54963d0.class;
            C65762c cVar = this.f171279d.f166848f;
            if (!(cVar == null || (lastMicUserList = cVar.getLastMicUserList()) == null)) {
                lastMicUserList.clear();
            }
            ((C54963d0) this.f171279d.mo83051g(cls)).mo75917Y3(this.f171280e);
            if (!((C54963d0) this.f171279d.mo83051g(cls)).f154053G) {
                C65762c cVar2 = this.f171279d.f166848f;
                if (cVar2 != null) {
                    C56032b.notifyAudienceMicUserChange$default(cVar2, false, 1, (Object) null);
                }
                FinderLiveService.m63769b0(FinderLiveService.f159376d, 2, (JSONObject) null, false, 6, (Object) null);
            }
            C62983sh shVar = this.f171279d.f171229n;
            if (shVar != null) {
                shVar.mo87922c1();
            }
            C62983sh shVar2 = this.f171279d.f171229n;
            if (shVar2 != null) {
                shVar2.f178711r.mo76420c();
            }
        }
    }

    /* renamed from: hl1.k$v */
    public static final class C60004v implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59988k f171281d;

        /* renamed from: e */
        public final /* synthetic */ C54130j f171282e;

        public C60004v(C59988k kVar, C54130j jVar) {
            this.f171281d = kVar;
            this.f171282e = jVar;
        }

        public final void run() {
            C65762c cVar;
            Class cls = C54963d0.class;
            ((C54963d0) this.f171281d.mo83051g(cls)).mo75917Y3(this.f171282e);
            if (!((C54963d0) this.f171281d.mo83051g(cls)).f154053G && (cVar = this.f171281d.f166848f) != null) {
                C56032b.notifyAudienceMicUserChange$default(cVar, false, 1, (Object) null);
            }
        }
    }

    /* renamed from: hl1.k$w */
    public static final class C60005w implements C45360g.C45361a {

        /* renamed from: a */
        public final /* synthetic */ C59988k f171283a;

        /* renamed from: b */
        public final /* synthetic */ String f171284b;

        /* renamed from: hl1.k$w$a */
        public static final class C60006a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59988k f171285d;

            /* renamed from: e */
            public final /* synthetic */ int f171286e;

            /* renamed from: f */
            public final /* synthetic */ int f171287f;

            /* renamed from: g */
            public final /* synthetic */ String f171288g;

            /* renamed from: h */
            public final /* synthetic */ String f171289h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60006a(C59988k kVar, int i, int i2, String str, String str2) {
                super(0);
                this.f171285d = kVar;
                this.f171286e = i;
                this.f171287f = i2;
                this.f171288g = str;
                this.f171289h = str2;
            }

            public Object invoke() {
                Class cls = C61212e.class;
                Class cls2 = C54116w.class;
                Class cls3 = C54991o.class;
                Class cls4 = C54963d0.class;
                String str = this.f171285d.f171222i;
                StringBuilder sb = new StringBuilder();
                sb.append("postCloseLinkMsg errCode:");
                sb.append(this.f171286e);
                sb.append(", errType:");
                sb.append(this.f171287f);
                sb.append(", errMsg:");
                sb.append(this.f171288g);
                sb.append(", audienceMode:");
                sb.append(((C54991o) this.f171285d.mo83051g(cls3)).mo75996d3());
                sb.append(", micType:");
                C54130j jVar = ((C54963d0) this.f171285d.mo83051g(cls4)).f154073p;
                T t = null;
                sb.append(jVar != null ? Integer.valueOf(jVar.f152001e) : null);
                Log.m105924i(str, sb.toString());
                int i = this.f171286e;
                if (i == 0 && this.f171287f == 0) {
                    C58730g5 g5Var = C58730g5.f168158a;
                    C115669n.INSTANCE.mo175912v(C58730g5.f168165h, 72);
                    FinderLiveService finderLiveService = FinderLiveService.f159376d;
                    finderLiveService.mo77621X();
                    finderLiveService.mo77609L();
                    List<C54130j> list = ((C54963d0) this.f171285d.mo83051g(cls4)).f154074q;
                    C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
                    C59988k kVar = this.f171285d;
                    synchronized (list) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (Util.isEqual(((C54130j) next).f151997a, ((C54991o) kVar.mo83051g(cls3)).mo76015n4())) {
                                t = next;
                                break;
                            }
                        }
                    }
                    C54130j jVar2 = (C54130j) t;
                    if (jVar2 != null && jVar2.f152001e == 1) {
                        C62795gh ghVar = this.f171285d.f171214d1;
                        if (ghVar != null) {
                            ghVar.mo87788a1();
                        }
                        C7335d c = C86312j.m106911c(cls2);
                        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                        C54116w.oy0((C54116w) c, C54067f0.C54085u0.ACTIVE_STOP_AUDIO_LINKMIC, (C54067f0.C54068a0) null, 0, 6, (Object) null);
                        ((C61212e) C86312j.m106911c(cls)).mo86153W7("finder_live_close_link_event", this.f171285d.f166848f, C90363p0.m113143b(new C13604l("link_type", 0)), 25561);
                    } else {
                        if (jVar2 != null && jVar2.f152001e == 2) {
                            C62197e C = this.f171285d.mo84868C();
                            if (C != null) {
                                C.mo85702u0();
                            }
                            C7335d c2 = C86312j.m106911c(cls2);
                            C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                            C54116w.oy0((C54116w) c2, C54067f0.C54085u0.ACTIVE_STOP_VIDEO_LINKMIC, (C54067f0.C54068a0) null, 0, 6, (Object) null);
                            ((C61212e) C86312j.m106911c(cls)).mo86153W7("finder_live_close_link_event", this.f171285d.f166848f, C90363p0.m113143b(new C13604l("link_type", 1)), 25561);
                        }
                    }
                    String str2 = this.f171289h;
                    List<C54130j> list2 = ((C54963d0) this.f171285d.mo83051g(cls4)).f154074q;
                    C87412m.m108593f(list2, "audienceLinkMicUserList");
                    C61926c.m72700y(list2, new C54998r0(str2));
                    String str3 = this.f171289h;
                    List<C54130j> list3 = ((C54963d0) this.f171285d.mo83051g(cls4)).f154076s;
                    C87412m.m108593f(list3, "linkMicUserInfoList");
                    C61926c.m72700y(list3, new C55000s0(str3));
                    if (!((C54963d0) this.f171285d.mo83051g(cls4)).f154053G) {
                        C65762c cVar = this.f171285d.f166848f;
                        if (cVar != null) {
                            C56032b.notifySEIMicUserChange$default(cVar, new C104289g(), true, (C13604l) null, 4, (Object) null);
                        }
                        FinderLiveService.m63769b0(FinderLiveService.f159376d, 2, (JSONObject) null, false, 6, (Object) null);
                    }
                    if (((C54991o) this.f171285d.mo83051g(cls3)).mo75996d3() == 1) {
                        C62983sh shVar = this.f171285d.f171229n;
                        if (shVar != null) {
                            shVar.mo87919Z0();
                        }
                        C62983sh shVar2 = this.f171285d.f171229n;
                        if (shVar2 != null) {
                            shVar2.mo10792g(8);
                        }
                        C63170ze zeVar = this.f171285d.f171224j;
                        if (zeVar != null) {
                            zeVar.mo10792g(0);
                        }
                        C63170ze zeVar2 = this.f171285d.f171224j;
                        if (zeVar2 != null) {
                            C62042e eVar = C62042e.f176370a;
                            TXLivePlayConfig Q = eVar.mo87034Q();
                            C59988k kVar2 = this.f171285d;
                            C45795b bVar = kVar2.f166851d;
                            C65762c cVar2 = kVar2.f166848f;
                            C63170ze.m74522g1(zeVar2, 0, Q, C62042e.m72810w0(eVar, bVar, cVar2 != null ? cVar2.isLandscape() : false, false, 4, (Object) null), false, false, C8584s3.f27672d, 9, (Object) null);
                        }
                    }
                    ((C54963d0) this.f171285d.mo83051g(cls4)).f154078u = 0;
                    C62741dg dgVar = this.f171285d.f171228m1;
                    if (dgVar != null) {
                        dgVar.mo87748a1();
                    }
                    this.f171285d.f171207Z1 = 0;
                } else {
                    C54807r3.f153641a.mo75769a(false, i, this.f171287f, ((C55001u) this.f171285d.mo83051g(C55001u.class)).f154420q.f182392d);
                }
                return C13598b0.f38549a;
            }
        }

        public C60005w(C59988k kVar, String str) {
            this.f171283a = kVar;
            this.f171284b = str;
        }

        /* renamed from: a */
        public void mo62564a(int i, int i2, String str, C49199dx0 dx02) {
            C87412m.m108594g(dx02, "resp");
            C61926c.m72668M(new C60006a(this.f171283a, i2, i, str, this.f171284b));
        }
    }

    /* renamed from: hl1.k$x */
    public static final class C60007x implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f171290d;

        public C60007x(C32224a aVar) {
            this.f171290d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f171290d.invoke();
        }
    }

    /* renamed from: hl1.k$y */
    public static final class C60008y extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59988k f171291d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60008y(C59988k kVar) {
            super(1);
            this.f171291d = kVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0056, code lost:
            r6 = r4.f151988c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L_0x009f
                hl1.k r9 = r8.f171291d
                qj1.r8 r0 = r9.f171149B
                if (r0 == 0) goto L_0x009f
                java.lang.Class<cl1.z0> r1 = cl1.C0702z0.class
                androidx.lifecycle.i0 r9 = r9.mo83051g(r1)
                cl1.z0 r9 = (cl1.C0702z0) r9
                int r9 = r9.mo671e3()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "resend comment:"
                r1.append(r2)
                java.lang.String r2 = r0.f178630J
                r1.append(r2)
                java.lang.String r2 = ",floatType:"
                r1.append(r2)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "Finder.LiveInputPlugin"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                java.lang.String r1 = r0.f178630J
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x009f
                te3.hx0 r1 = r0.f178631K
                r2 = 0
                if (r1 == 0) goto L_0x008b
                te3.hj1 r3 = new te3.hj1
                r3.<init>()
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r4.getClass()
                al1.i r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
                r5 = 0
                if (r4 == 0) goto L_0x005d
                al1.l r6 = r4.f151988c
                if (r6 == 0) goto L_0x005d
                int r6 = r6.f152031k
                goto L_0x005e
            L_0x005d:
                r6 = 0
            L_0x005e:
                r3.f134677n = r6
                if (r4 == 0) goto L_0x0068
                al1.l r4 = r4.f151988c
                if (r4 == 0) goto L_0x0068
                int r5 = r4.f152031k
            L_0x0068:
                r3.f134675i = r5
                qg1.c0 r4 = new qg1.c0
                qg1.c0$a r5 = qg1.C47824c0.f128387v
                java.lang.String r6 = r0.f178630J
                b50.j r7 = b50.C54424j.f152652a
                d50.e r7 = r7.mo75237a()
                if (r7 == 0) goto L_0x007b
                java.lang.String r7 = r7.f166192B
                goto L_0x007c
            L_0x007b:
                r7 = r2
            L_0x007c:
                te3.xs0 r9 = r5.mo72575a(r1, r6, r7, r9)
                fj1.b r0 = r0.mo87684A0()
                r4.<init>(r9, r0, r3, r2)
                r4.mo9225i()
                goto L_0x009f
            L_0x008b:
                cj1.r0 r1 = cj1.C54804r0.f153631a
                android.content.Context r3 = r0.f178626F
                fj1.b r4 = r0.mo87684A0()
                dj1.z$b r5 = dj1.C58294z.f166917x
                java.lang.String r0 = r0.f178630J
                r6 = 1
                te3.r41 r9 = r5.mo8522a(r0, r6, r9)
                r1.mo75763e(r3, r4, r9, r2)
            L_0x009f:
                rx3.b0 r9 = rx3.C13598b0.f38549a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.C60008y.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59988k(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, "context");
    }

    /* renamed from: n */
    public static final void m69859n(C59988k kVar) {
        C63325a aVar;
        C65762c cVar = kVar.f166848f;
        if (cVar != null && (aVar = (C63325a) cVar.business(C63325a.class)) != null) {
            aVar.mo88229f3(new C60020o(kVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r3 = r3.getPrepareUIC();
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m69860o(hl1.C59988k r9) {
        /*
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.String r1 = r9.f171222i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkShowGameRankGuide showVisitorGuide:"
            r2.append(r3)
            vk1.c r3 = r9.f166848f
            r4 = 0
            if (r3 == 0) goto L_0x0020
            hl1.x3 r3 = r3.getPrepareUIC()
            if (r3 == 0) goto L_0x0020
            boolean r3 = r3.f171365n
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0021
        L_0x0020:
            r3 = r4
        L_0x0021:
            r2.append(r3)
            java.lang.String r3 = ", hasCheckGameRankGuide:"
            r2.append(r3)
            boolean r3 = r9.f171195V1
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            vk1.c r1 = r9.f166848f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0047
            hl1.x3 r1 = r1.getPrepareUIC()
            if (r1 == 0) goto L_0x0047
            boolean r1 = r1.f171365n
            if (r1 != 0) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            if (r1 == 0) goto L_0x01bb
            boolean r1 = r9.f171195V1
            if (r1 != 0) goto L_0x01bb
            r9.f171195V1 = r2
            androidx.lifecycle.i0 r1 = r9.mo83051g(r0)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r5 = r1.f154311f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "canShowGameRankGuide "
            r6.append(r7)
            te3.is1 r7 = r1.f154231N1
            if (r7 == 0) goto L_0x006d
            int r7 = r7.f135634e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x006e
        L_0x006d:
            r7 = r4
        L_0x006e:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            te3.is1 r1 = r1.f154231N1
            if (r1 == 0) goto L_0x007f
            int r1 = r1.f135634e
            goto L_0x0080
        L_0x007f:
            r1 = 0
        L_0x0080:
            if (r1 != r2) goto L_0x0084
            r1 = 1
            goto L_0x0085
        L_0x0084:
            r1 = 0
        L_0x0085:
            if (r1 != 0) goto L_0x0098
            re1.a r1 = gg1.C32444a.f86136d2
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r1 = 0
            goto L_0x0099
        L_0x0098:
            r1 = 1
        L_0x0099:
            androidx.lifecycle.i0 r0 = r9.mo83051g(r0)
            cl1.o r0 = (cl1.C54991o) r0
            te3.hs1 r0 = r0.mo75958F3()
            if (r0 == 0) goto L_0x00ac
            int r0 = r0.f134841f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00ad
        L_0x00ac:
            r0 = r4
        L_0x00ad:
            java.lang.String r5 = r9.f171222i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "checkShowGameRankGuide, canShow:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = ", isEnable:"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            if (r1 == 0) goto L_0x01bb
            if (r0 == 0) goto L_0x01bb
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x01bb
            qj1.zg r0 = r9.f171168K1
            if (r0 != 0) goto L_0x0113
            vk1.c r0 = r9.f166848f
            te3.hj1 r1 = r9.f166850h
            if (r0 == 0) goto L_0x0110
            android.content.Context r5 = r0.getContext()
            java.lang.String r6 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r5, r6)
            android.app.Activity r5 = (android.app.Activity) r5
            r6 = 2131303420(0x7f091bfc, float:1.8224954E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            android.view.LayoutInflater r7 = r5.getLayoutInflater()
            r8 = 2131495259(0x7f0c095b, float:1.861405E38)
            android.view.View r7 = r7.inflate(r8, r6, r3)
            java.lang.String r8 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r7, r8)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r6 == 0) goto L_0x010a
            r6.addView(r7)
        L_0x010a:
            qj1.zg r6 = new qj1.zg
            r6.<init>(r7, r0, r5, r1)
            goto L_0x0111
        L_0x0110:
            r6 = r4
        L_0x0111:
            r9.f171168K1 = r6
        L_0x0113:
            qj1.zg r9 = r9.f171168K1
            if (r9 == 0) goto L_0x01bb
            zc1.b r0 = zc1.C66785b.f191882e
            bd1.e r0 = r0.mo90673n0()
            te3.sq2 r0 = r0.mo62398d()
            te3.is1 r0 = r0.f141686r
            if (r0 == 0) goto L_0x012a
            byte[] r0 = r0.toByteArray()
            goto L_0x012b
        L_0x012a:
            r0 = r4
        L_0x012b:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x01af
            te3.is1 r1 = new te3.is1
            r1.<init>()
            byte[] r0 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r0)
            if (r0 != 0) goto L_0x0141
            goto L_0x0152
        L_0x0141:
            r1.parseFrom(r0)     // Catch:{ Exception -> 0x0146 }
            r4 = r1
            goto L_0x0152
        L_0x0146:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r0
            java.lang.String r0 = "safeParser"
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r2, r1)
        L_0x0152:
            r9.f179262w = r4
            if (r4 == 0) goto L_0x01af
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.f179256q
            r0.append(r1)
            java.lang.String r1 = "_get"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TAG"
            gy3.C87412m.m108594g(r0, r1)
            java.util.LinkedList<te3.hs1> r1 = r4.f135633d
            if (r1 == 0) goto L_0x01af
            java.util.Iterator r1 = r1.iterator()
        L_0x0176:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01af
            java.lang.Object r2 = r1.next()
            te3.hs1 r2 = (te3.C49747hs1) r2
            if (r2 == 0) goto L_0x0176
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "GameRankSwitch appid:"
            r3.append(r4)
            java.lang.String r4 = r2.f134839d
            r3.append(r4)
            java.lang.String r4 = ", name:"
            r3.append(r4)
            java.lang.String r4 = r2.f134840e
            r3.append(r4)
            java.lang.String r4 = ", enable:"
            r3.append(r4)
            int r2 = r2.f134841f
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x0176
        L_0x01af:
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = r9.f179258s
            if (r0 == 0) goto L_0x01bb
            qj1.bh r1 = new qj1.bh
            r1.<init>(r9)
            r0.post(r1)
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.m69860o(hl1.k):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (((r1 == null || (r1 = r1.f172989A) == null || !r1.mo82888j()) ? false : true) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r1 = r1.f172989A;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m69861q(hl1.C59988k r9, rx3.C13604l r10, boolean r11, int r12, java.lang.Object r13) {
        /*
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0006
            r10 = r0
        L_0x0006:
            r12 = r12 & 2
            r13 = 0
            if (r12 == 0) goto L_0x000c
            r11 = 0
        L_0x000c:
            java.lang.Class<cl1.o> r12 = cl1.C54991o.class
            p50.e r1 = r9.mo84868C()
            r2 = 1
            if (r1 == 0) goto L_0x0021
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0021
            boolean r1 = r1.mo82881c()
            if (r1 != r2) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            if (r1 != 0) goto L_0x003c
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            j50.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r1 == 0) goto L_0x0039
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0039
            boolean r1 = r1.mo82888j()
            if (r1 != r2) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            if (r1 == 0) goto L_0x005b
        L_0x003c:
            androidx.appcompat.app.AppCompatActivity r1 = r9.f166847e
            boolean r3 = r1 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r1 = r0
        L_0x0044:
            if (r1 == 0) goto L_0x004e
            boolean r1 = r1.isFinishing()
            if (r1 != r2) goto L_0x004e
            r1 = 1
            goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            if (r1 == 0) goto L_0x005b
            java.lang.String r9 = r9.f171222i
            java.lang.String r10 = "skip adjustLayout, now is floatMode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            goto L_0x0189
        L_0x005b:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            j50.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r1 == 0) goto L_0x006c
            boolean r1 = r1.mo85682Z()
            if (r1 != r2) goto L_0x006c
            r1 = 1
            goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            if (r1 == 0) goto L_0x0151
            java.lang.Class<cl1.d0> r11 = cl1.C54963d0.class
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r12 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r12)
            int r12 = r12.x
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
            int r1 = r1.y
            if (r10 == 0) goto L_0x0090
            A r3 = r10.f38555d
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            goto L_0x0091
        L_0x0090:
            r3 = r12
        L_0x0091:
            ok1.e r4 = ok1.C62042e.f176370a
            r5 = 3
            int r4 = ok1.C62042e.m72807k0(r4, r13, r13, r5, r0)
            androidx.lifecycle.i0 r5 = r9.mo83051g(r11)
            cl1.d0 r5 = (cl1.C54963d0) r5
            java.util.List r5 = r5.mo75929l3()
            int r5 = r5.size()
            java.lang.String r6 = r9.f171222i
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "adjustLayoutTRTC allMicSize: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r8 = " screenSize: "
            r7.append(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            vk1.c r6 = r9.f166848f
            if (r6 == 0) goto L_0x00d3
            android.widget.RelativeLayout r6 = r6.getPreviewRoot()
            if (r6 == 0) goto L_0x00d3
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x00d4
        L_0x00d3:
            r6 = r0
        L_0x00d4:
            boolean r7 = r6 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x00db
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            goto L_0x00dc
        L_0x00db:
            r6 = r0
        L_0x00dc:
            if (r6 == 0) goto L_0x0128
            androidx.lifecycle.i0 r11 = r9.mo83051g(r11)
            cl1.d0 r11 = (cl1.C54963d0) r11
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r11 = r11.f154077t
            java.lang.Object r11 = r11.getValue()
            gi1.c r11 = (gi1.C59464c) r11
            if (r11 == 0) goto L_0x00f4
            int r11 = r11.f169898c
            if (r11 != r2) goto L_0x00f4
            r11 = 1
            goto L_0x00f5
        L_0x00f4:
            r11 = 0
        L_0x00f5:
            r7 = -1
            if (r11 == 0) goto L_0x010e
            if (r10 == 0) goto L_0x0102
            A r11 = r10.f38555d
            java.lang.Number r11 = (java.lang.Number) r11
            int r12 = r11.intValue()
        L_0x0102:
            if (r10 == 0) goto L_0x010c
            B r11 = r10.f38556e
            java.lang.Number r11 = (java.lang.Number) r11
            int r1 = r11.intValue()
        L_0x010c:
            r3 = r12
            goto L_0x0121
        L_0x010e:
            if (r5 == 0) goto L_0x011f
            float r11 = (float) r3
            if (r5 == r2) goto L_0x0117
            r12 = 1066060689(0x3f8acb91, float:1.0843374)
            goto L_0x011a
        L_0x0117:
            r12 = 1067236373(0x3f9cbc15, float:1.2244898)
        L_0x011a:
            float r11 = r11 / r12
            int r11 = (int) r11
            r1 = r11
            r13 = r4
            goto L_0x0121
        L_0x011f:
            r1 = -1
            r3 = -1
        L_0x0121:
            r6.height = r1
            r6.topMargin = r13
            r6.width = r3
            r4 = r13
        L_0x0128:
            ii1.e r11 = r9.f171252x1
            if (r11 == 0) goto L_0x0135
            android.view.ViewGroup r11 = r11.f166287d
            if (r11 == 0) goto L_0x0135
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            goto L_0x0136
        L_0x0135:
            r11 = r0
        L_0x0136:
            boolean r12 = r11 instanceof android.widget.RelativeLayout.LayoutParams
            if (r12 == 0) goto L_0x013d
            r0 = r11
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
        L_0x013d:
            if (r0 == 0) goto L_0x0145
            r0.height = r1
            r0.topMargin = r4
            r0.width = r3
        L_0x0145:
            vk1.c r9 = r9.f166848f
            if (r9 == 0) goto L_0x0189
            org.json.JSONObject r11 = r9.getCurrentMicData()
            r9.notifySEIMicUserChange(r11, r2, r10)
            goto L_0x0189
        L_0x0151:
            androidx.lifecycle.i0 r13 = r9.mo83051g(r12)
            cl1.o r13 = (cl1.C54991o) r13
            int r13 = r13.mo75996d3()
            if (r13 != r2) goto L_0x0169
            qj1.ze r12 = r9.f171224j
            if (r12 == 0) goto L_0x0165
            com.tencent.rtmp.ui.TXCloudVideoView r0 = r12.mo88092d1()
        L_0x0165:
            r9.mo84894r(r0, r10, r11)
            goto L_0x0189
        L_0x0169:
            java.lang.String r10 = r9.f171222i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "invalid audience mode:"
            r11.append(r13)
            androidx.lifecycle.i0 r9 = r9.mo83051g(r12)
            cl1.o r9 = (cl1.C54991o) r9
            int r9 = r9.mo75996d3()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
        L_0x0189:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.m69861q(hl1.k, rx3.l, boolean, int, java.lang.Object):void");
    }

    /* renamed from: z */
    public static void m69862z(C59988k kVar, boolean z, boolean z2, int i, Object obj) {
        int i2;
        C62197e eVar;
        LiveConfig liveConfig;
        C62197e a1;
        C62983sh shVar;
        C62197e a15;
        C59988k kVar2 = kVar;
        boolean z3 = (i & 1) != 0 ? false : z;
        boolean z4 = (i & 2) != 0 ? false : z2;
        Class cls = C54116w.class;
        Class cls2 = C54991o.class;
        Class cls3 = C55001u.class;
        int d3 = ((C54991o) kVar2.mo83051g(cls2)).mo75996d3();
        if (d3 == 0) {
            C58730g5 g5Var = C58730g5.f168158a;
            C58730g5.m68220e(g5Var, "RV_VISITOR_" + ((C55001u) kVar2.mo83051g(cls3)).f154420q.f182392d, C58713e5.f168082j.f168101b, (C89349b) null, false, false, false, 60, (Object) null);
            String str = kVar2.f171222i;
            Log.m105924i(str, "chooseAudienceMode TRTC fromMiniWin:" + z3 + ", mute:" + z4 + ", liveRoomModel:" + ((C55001u) kVar2.mo83051g(cls3)).f154421r + ", liveExtFlag:" + ((C54991o) kVar2.mo83051g(cls2)).f154388y0 + ", lastScreenShareMode:" + kVar2.f171186S1);
            C62197e C = kVar.mo84868C();
            if (C != null) {
                C62042e eVar2 = C62042e.f176370a;
                C45795b bVar = kVar2.f166851d;
                C65762c cVar = kVar2.f166848f;
                int v0 = eVar2.mo87123v0(bVar, cVar != null ? cVar.isLandscape() : false, kVar2.f171186S1);
                C63714v f = C.mo85680X().mo86563f(C.f172989A.f166260g);
                if (f != null) {
                    f.mo88555a(new C63698a0(f, v0));
                }
            }
            if (z3) {
                C62983sh shVar2 = kVar2.f171229n;
                if (!(shVar2 == null || (a15 = shVar2.mo87920a1()) == null)) {
                    a15.f173033s = shVar2.f178711r;
                }
                C62197e C2 = kVar.mo84868C();
                if (C2 != null) {
                    C2.mo87272N0();
                }
            } else {
                C58114h hVar = ((C55001u) kVar2.mo83051g(cls3)).f154421r;
                if (!(hVar == null || (shVar = kVar2.f171229n) == null)) {
                    C8574p pVar = C8574p.f27660d;
                    C87412m.m108594g(pVar, "action");
                    C62197e a16 = shVar.mo87920a1();
                    if (a16 != null) {
                        C54408d.C54409a.m61122b(a16, hVar, false, false, 6, (Object) null);
                    }
                    C62042e.f176370a.mo87038R1(shVar.mo87920a1());
                    C62197e a17 = shVar.mo87920a1();
                    if (a17 != null) {
                        LivePreviewView livePreviewView = shVar.f178711r;
                        C35912rh rhVar = new C35912rh(shVar, pVar);
                        if (livePreviewView != null) {
                            a17.f173033s = livePreviewView;
                        }
                        a17.mo75218i(rhVar);
                    }
                }
            }
            C62983sh shVar3 = kVar2.f171229n;
            if (shVar3 != null) {
                shVar3.mo10792g(0);
            }
            C62197e C3 = kVar.mo84868C();
            if (C3 != null) {
                C3.f173038x = kVar2;
            }
            C62197e C4 = kVar.mo84868C();
            if (C4 != null) {
                C60034u uVar = (C60034u) ((C36570n) kVar2.f171217e2).getValue();
                C87412m.m108594g(uVar, "callback");
                C4.f173040y = uVar;
            }
        } else if (d3 == 1) {
            String str2 = kVar2.f171222i;
            Log.m105924i(str2, "chooseAudienceMode CDN fromMiniWin:" + z3 + ", mute:" + z4 + ", liveRoomModel:" + ((C55001u) kVar2.mo83051g(cls3)).f154421r + ", liveExtFlag:" + ((C54991o) kVar2.mo83051g(cls2)).f154388y0);
            C58114h hVar2 = ((C55001u) kVar2.mo83051g(cls3)).f154421r;
            C65762c cVar2 = kVar2.f166848f;
            C62197e C5 = kVar.mo84868C();
            if (hVar2 != null && cVar2 != null && C5 != null) {
                C63170ze zeVar = kVar2.f171224j;
                if (zeVar == null) {
                    View findViewById = cVar2.findViewById(C0966R.C0970id.fzq);
                    C87412m.m108593f(findViewById, "_router.findViewById(\n  …e_tx_live_player_ui_root)");
                    zeVar = new C63170ze((ViewGroup) findViewById, cVar2);
                }
                kVar2.f171224j = zeVar;
                C5.mo85698q0(1);
                C62983sh shVar4 = kVar2.f171229n;
                if (!(shVar4 == null || (a1 = shVar4.mo87920a1()) == null)) {
                    a1.f173033s = shVar4.f178711r;
                }
                C5.mo87274Q0(hVar2.f166251b);
                C58418z1.C58419a aVar = C58418z1.f167360a;
                if ((aVar != null && aVar.f167365e == 0) && aVar != null) {
                    aVar.f167365e = System.currentTimeMillis();
                }
                C58358d0.m67594f(C58358d0.f167115a, false, 1, (Object) null);
                C63170ze zeVar2 = kVar2.f171224j;
                if (zeVar2 != null) {
                    C62042e eVar3 = C62042e.f176370a;
                    TXLivePlayConfig Q = eVar3.mo87034Q();
                    C45795b bVar2 = kVar2.f166851d;
                    C65762c cVar3 = kVar2.f166848f;
                    boolean isLandscape = cVar3 != null ? cVar3.isLandscape() : false;
                    eVar = C5;
                    i2 = 1;
                    C63170ze.m74522g1(zeVar2, 0, Q, eVar3.mo87123v0(bVar2, isLandscape, kVar2.f171186S1), z4, !((C54991o) kVar2.mo83051g(cls2)).mo76007j4(), C8578q.f27664d, 1, (Object) null);
                } else {
                    eVar = C5;
                    i2 = 1;
                }
                C62197e C6 = kVar.mo84868C();
                if (C6 != null) {
                    C6.f173007R0 = Integer.valueOf(i2);
                }
                C63170ze zeVar3 = kVar2.f171224j;
                if (zeVar3 != null) {
                    zeVar3.mo10792g(0);
                }
                if (!z3) {
                    C54116w wVar = (C54116w) C86312j.m106911c(cls);
                    long j = ((C55001u) kVar2.mo83051g(cls3)).f154420q.f182392d;
                    wVar.getClass();
                    Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markStartCdnPlay " + j);
                    FinderLiveCdnUserEnterLiveTimeCostStruct xx02 = wVar.xx0(j);
                    xx02.f155490e = j;
                    xx02.f155492g = C31543z5.m39453c();
                    C54116w wVar2 = (C54116w) C86312j.m106911c(cls);
                    long j2 = ((C55001u) kVar2.mo83051g(cls3)).f154420q.f182392d;
                    wVar2.getClass();
                    Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markShowCdnPlayerView " + j2);
                    FinderLiveCdnUserEnterLiveTimeCostStruct xx03 = wVar2.xx0(j2);
                    xx03.f155490e = j2;
                    xx03.f155500o = C31543z5.m39453c();
                }
                C54127h hVar3 = kVar2.f166849g;
                long j3 = (hVar3 == null || (liveConfig = hVar3.f151977d) == null) ? 0 : liveConfig.f157064e;
                C63170ze zeVar4 = kVar2.f171224j;
                C58924d c1 = zeVar4 != null ? zeVar4.mo88091c1() : null;
                C63170ze zeVar5 = kVar2.f171224j;
                eVar.mo87270J0(j3, c1, zeVar5 != null ? zeVar5.mo88092d1() : null);
                C58730g5 g5Var2 = C58730g5.f168158a;
                C58730g5.m68220e(g5Var2, "RV_VISITOR_" + ((C55001u) kVar2.mo83051g(cls3)).f154420q.f182392d, C58713e5.f168082j.f168101b, (C89349b) null, false, false, false, 60, (Object) null);
                eVar.f173038x = kVar2;
                C62197e C7 = kVar.mo84868C();
                if (C7 != null) {
                    C60034u uVar2 = (C60034u) ((C36570n) kVar2.f171217e2).getValue();
                    C87412m.m108594g(uVar2, "callback");
                    C7.f173040y = uVar2;
                }
            }
        }
    }

    /* renamed from: A */
    public final void mo84866A() {
        if (((C54991o) mo83051g(C54991o.class)).mo75996d3() == 0 || ((C54963d0) mo83051g(C54963d0.class)).mo75914V3()) {
            C62197e C = mo84868C();
            if (C != null) {
                C.mo87271L0();
            }
            C62983sh shVar = this.f171229n;
            if (shVar != null) {
                shVar.mo87919Z0();
                return;
            }
            return;
        }
        C63170ze zeVar = this.f171224j;
        if (zeVar != null) {
            zeVar.mo88095h1(false);
        }
    }

    /* renamed from: B */
    public final C62699d4 mo84867B() {
        return (C62699d4) ((C36570n) this.f171249w1).getValue();
    }

    /* renamed from: C */
    public final C62197e mo84868C() {
        C54127h hVar = this.f166849g;
        if (hVar != null) {
            return C62193a.f176816k1.mo87262c(hVar.f151977d.f157064e);
        }
        return null;
    }

    /* renamed from: D */
    public final void mo84869D() {
        C62924pe peVar = this.f171173N;
        if (peVar != null) {
            peVar.mo10792g(8);
        }
        C62712dd ddVar = this.f171171M;
        if (ddVar != null) {
            ddVar.mo10792g(8);
        }
        C63049v9 v9Var = this.f171155E;
        if (v9Var != null) {
            v9Var.mo10792g(8);
        }
        C62949r8 r8Var = this.f171149B;
        if (r8Var != null) {
            r8Var.mo10792g(8);
        }
        C12475jc jcVar = this.f171256z;
        if (jcVar != null) {
            jcVar.mo10792g(8);
        }
        C12322e5 e5Var = this.f171250x;
        if (e5Var != null) {
            e5Var.mo10792g(8);
        }
        C12522mf mfVar = this.f171234p0;
        if (mfVar != null) {
            mfVar.mo10792g(8);
        }
        C12271ch chVar = (C12271ch) ((C36570n) this.f171226k1).getValue();
        if (chVar != null) {
            chVar.mo10792g(8);
        }
        C13988m mVar = this.f171197W0;
        if (mVar != null) {
            mVar.mo10792g(8);
        }
        C12360e8 e8Var = this.f171205Z;
        if (e8Var != null) {
            e8Var.mo10792g(8);
        }
        C62741dg dgVar = this.f171228m1;
        if (dgVar != null) {
            dgVar.mo10792g(8);
        }
        C63084w6 w6Var = this.f171230n1;
        if (w6Var != null) {
            w6Var.mo10792g(8);
        }
        C62795gh ghVar = this.f171214d1;
        if (ghVar != null) {
            ghVar.mo10792g(8);
        }
        C62878m4 m4Var = this.f171255y1;
        if (m4Var != null) {
            m4Var.mo10792g(8);
        }
        C63118y3 y3Var = this.f171156E1;
        if (y3Var != null) {
            y3Var.mo10792g(8);
        }
        C12707vb vbVar = this.f171160G1;
        if (vbVar != null) {
            vbVar.mo10792g(8);
        }
    }

    /* renamed from: E */
    public final void mo84870E() {
        C62927ph phVar;
        C62699d4 B;
        C12271ch chVar;
        C54127h data;
        LiveRoomControllerStore liveRoomControllerStore;
        C8083t2 t2Var;
        C59453p pVar;
        C65762c cVar = this.f166848f;
        if (!(cVar == null || (data = cVar.getData()) == null || (liveRoomControllerStore = data.f151979f) == null || (t2Var = (C8083t2) liveRoomControllerStore.controller(C8083t2.class)) == null || (pVar = t2Var.f26903j) == null)) {
            pVar.mo84560c(8);
        }
        C62983sh shVar = this.f171229n;
        if (shVar != null) {
            shVar.mo10792g(8);
        }
        C62833je jeVar = this.f171242t;
        if (jeVar != null) {
            jeVar.mo10792g(8);
        }
        C12399ff ffVar = this.f171244u;
        if (ffVar != null) {
            ffVar.mo10792g(4);
        }
        C62632a6 a6Var = this.f171246v;
        if (a6Var != null) {
            a6Var.mo10792g(8);
        }
        C12322e5 e5Var = this.f171250x;
        if (e5Var != null) {
            e5Var.mo10792g(8);
        }
        C12522mf mfVar = this.f171234p0;
        if (mfVar != null) {
            mfVar.mo10792g(8);
        }
        C12475jc jcVar = this.f171256z;
        if (jcVar != null) {
            jcVar.mo10792g(8);
        }
        C62917og ogVar = this.f171151C;
        if (ogVar != null) {
            ogVar.mo10792g(8);
        }
        C12583oh ohVar = this.f171153D;
        if (ohVar != null) {
            ohVar.mo10792g(8);
        }
        C63049v9 v9Var = this.f171155E;
        if (v9Var != null) {
            v9Var.mo10792g(8);
        }
        C12377f1 f1Var = this.f171165J;
        if (f1Var != null) {
            f1Var.mo10792g(8);
        }
        C12482k1 k1Var = this.f171167K;
        if (k1Var != null) {
            k1Var.mo10792g(8);
        }
        C63163zd zdVar = this.f171181R;
        if (zdVar != null) {
            zdVar.mo10792g(8);
        }
        C63102x6 x6Var = this.f171184S;
        if (x6Var != null) {
            x6Var.mo10792g(8);
        }
        C63046v6 v6Var = this.f171187T;
        if (v6Var != null) {
            v6Var.mo10792g(8);
        }
        C63046v6 v6Var2 = this.f171187T;
        if (v6Var2 != null) {
            Iterator<C62972s6> it = v6Var2.f178732u.iterator();
            while (it.hasNext()) {
                it.next().mo10792g(8);
            }
        }
        C63005u6 u6Var = this.f171190U;
        if (u6Var != null) {
            u6Var.mo10792g(8);
        }
        C63005u6 u6Var2 = this.f171190U;
        if (u6Var2 != null) {
            Iterator<C62972s6> it4 = u6Var2.f178732u.iterator();
            while (it4.hasNext()) {
                it4.next().mo10792g(8);
            }
        }
        C62981sg sgVar = this.f171196W;
        if (sgVar != null) {
            sgVar.mo10792g(8);
        }
        C62979sf sfVar = this.f171179Q0;
        if (sfVar != null) {
            sfVar.mo10792g(8);
        }
        C62705da daVar = this.f171182R0;
        if (daVar != null) {
            daVar.mo10792g(8);
        }
        C62647ba baVar = this.f171185S0;
        if (baVar != null) {
            baVar.mo10792g(8);
        }
        C62647ba baVar2 = this.f171188T0;
        if (baVar2 != null) {
            baVar2.mo10792g(8);
        }
        C64039c cVar2 = this.f171194V0;
        if (cVar2 != null) {
            cVar2.mo10792g(8);
        }
        C66420d dVar = this.f171200X0;
        if (dVar != null) {
            dVar.mo10792g(8);
        }
        C15883o oVar = this.f171203Y0;
        if (oVar != null) {
            oVar.mo10792g(8);
        }
        C60085d dVar2 = this.f171245u1;
        if (dVar2 != null) {
            dVar2.mo10792g(8);
        }
        C13988m mVar = this.f171197W0;
        if (mVar != null) {
            mVar.mo10792g(8);
        }
        C12238a0 a0Var = this.f171206Z0;
        if (a0Var != null) {
            a0Var.mo10792g(8);
        }
        C62638b0 b0Var = this.f171208a1;
        if (b0Var != null) {
            b0Var.mo10792g(8);
        }
        C12264c0 c0Var = this.f171210b1;
        if (c0Var != null) {
            c0Var.mo10792g(8);
        }
        C47844c7 c7Var = this.f171212c1;
        if (c7Var != null) {
            c7Var.mo10792g(8);
        }
        C52931n nVar = this.f171216e1;
        if (nVar != null) {
            nVar.mo10792g(8);
        }
        C65750a aVar = this.f171218f1;
        if (aVar != null) {
            aVar.mo10792g(8);
        }
        C12772zc zcVar = this.f171221h1;
        if (zcVar != null) {
            zcVar.mo10792g(8);
        }
        C63129yc ycVar = this.f171223i1;
        if (ycVar != null) {
            ycVar.mo10792g(8);
        }
        C62795gh ghVar = this.f171214d1;
        if (ghVar != null) {
            ghVar.mo10792g(8);
        }
        C60291e eVar = this.f171252x1;
        if (eVar != null) {
            eVar.mo10792g(8);
        }
        C63081w3 w3Var = this.f171257z1;
        if (w3Var != null) {
            w3Var.mo10792g(4);
        }
        if (this.f171225j1 && (chVar = (C12271ch) ((C36570n) this.f171226k1).getValue()) != null) {
            chVar.mo10792g(8);
        }
        C12611q7 q7Var = this.f171202Y;
        if (q7Var != null) {
            q7Var.mo10792g(8);
        }
        C62741dg dgVar = this.f171228m1;
        if (dgVar != null) {
            dgVar.mo10792g(8);
        }
        C62712dd ddVar = this.f171171M;
        if (ddVar != null) {
            ddVar.mo10792g(8);
        }
        C63084w6 w6Var = this.f171230n1;
        if (w6Var != null) {
            w6Var.mo10792g(8);
        }
        C12389fa faVar = this.f171235p1;
        if (faVar != null) {
            faVar.mo10792g(8);
        }
        C62758ea eaVar = this.f171237q1;
        if (eaVar != null) {
            eaVar.mo10792g(8);
        }
        if (this.f171247v1 && (B = mo84867B()) != null) {
            B.mo10792g(8);
        }
        C62878m4 m4Var = this.f171255y1;
        if (m4Var != null) {
            m4Var.mo10792g(8);
        }
        if (this.f171148A1 && (phVar = (C62927ph) ((C36570n) this.f171150B1).getValue()) != null) {
            phVar.mo10792g(8);
        }
        C63032ue ueVar = this.f171154D1;
        if (ueVar != null) {
            ueVar.mo10792g(8);
        }
        C63118y3 y3Var = this.f171156E1;
        if (y3Var != null) {
            y3Var.mo10792g(8);
        }
        C12543n6 n6Var = this.f171158F1;
        if (n6Var != null) {
            n6Var.mo10792g(8);
        }
        C12707vb vbVar = this.f171160G1;
        if (vbVar != null) {
            vbVar.mo10792g(8);
        }
        C62804h6 h6Var = this.f171172M1;
        if (h6Var != null) {
            h6Var.mo10792g(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r1.f184867e;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84871F() {
        /*
            r8 = this;
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r8.mo83051g(r0)
            cl1.u r1 = (cl1.C55001u) r1
            te3.po2 r1 = r1.f154413g
            r2 = 0
            if (r1 == 0) goto L_0x0014
            te3.c21 r1 = r1.f184867e
            if (r1 == 0) goto L_0x0014
            int r1 = r1.f182406t
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            androidx.lifecycle.i0 r0 = r8.mo83051g(r0)
            cl1.u r0 = (cl1.C55001u) r0
            te3.po2 r0 = r0.f154413g
            if (r0 == 0) goto L_0x0022
            te3.c21 r0 = r0.f184867e
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r3 = 1
            if (r0 != 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r4 = r1 & 8
            if (r4 > 0) goto L_0x0032
            if (r0 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r4 = 0
            goto L_0x0033
        L_0x0032:
            r4 = 1
        L_0x0033:
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            androidx.lifecycle.i0 r5 = r8.mo83051g(r5)
            cl1.o r5 = (cl1.C54991o) r5
            te3.ty0 r5 = r5.f154179A1
            if (r5 == 0) goto L_0x0042
            int r5 = r5.f142469d
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            if (r5 <= 0) goto L_0x0046
            r2 = 1
        L_0x0046:
            java.lang.String r5 = r8.f171222i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "finderExtFlag:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = " isLiveInfoNull:"
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = " gameInfoSupport:"
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = " plugin:"
            r6.append(r0)
            qj1.x6 r0 = r8.f171184S
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            if (r4 != 0) goto L_0x007b
            if (r2 != 0) goto L_0x007b
            return
        L_0x007b:
            vk1.c r0 = r8.f166848f
            if (r0 != 0) goto L_0x0080
            return
        L_0x0080:
            qj1.x6 r1 = r8.f171184S
            if (r1 == 0) goto L_0x0085
            return
        L_0x0085:
            gj1.c r1 = new gj1.c
            r1.<init>()
            boolean r2 = r1.f169939b
            java.lang.String r4 = "Finder.FinderLiveFrameSetSurfaceMgr"
            if (r2 == 0) goto L_0x0096
            java.lang.String r2 = "isInitialized"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            goto L_0x00aa
        L_0x0096:
            java.lang.String r2 = "initConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            r1.f169939b = r3
            java.lang.Class<qy.h> r2 = p671qy.C63344h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            qy.h r2 = (p671qy.C63344h) r2
            java.lang.String r3 = r1.f169938a
            r2.mo88250zf(r3)
        L_0x00aa:
            hl1.k$l r2 = new hl1.k$l
            r2.<init>(r0)
            qj1.c r2 = r8.mo84880O(r2)
            qj1.x6 r2 = (qj1.C63102x6) r2
            r8.f171184S = r2
            r3 = 8
            if (r2 == 0) goto L_0x00be
            r2.mo10792g(r3)
        L_0x00be:
            qj1.x6 r2 = r8.f171184S
            if (r2 == 0) goto L_0x00d5
            com.tencent.mm.plugin.finder.live.view.FinderLiveGameInfoView r2 = r2.f179066p
            java.lang.String r2 = r2.getFrameSetName()
            if (r2 == 0) goto L_0x00d5
            java.lang.Class<qy.g> r4 = p671qy.C63343g.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            qy.g r4 = (p671qy.C63343g) r4
            r4.oo0(r2)
        L_0x00d5:
            qj1.x6 r2 = r8.f171184S
            if (r2 != 0) goto L_0x00da
            goto L_0x00dc
        L_0x00da:
            r2.f179071u = r1
        L_0x00dc:
            qj1.v6 r2 = r8.f171187T
            if (r2 != 0) goto L_0x00f2
            hl1.k$m r2 = new hl1.k$m
            r2.<init>(r0)
            qj1.c r2 = r8.mo84880O(r2)
            qj1.v6 r2 = (qj1.C63046v6) r2
            r8.f171187T = r2
            if (r2 == 0) goto L_0x00f2
            r2.mo10792g(r3)
        L_0x00f2:
            qj1.v6 r2 = r8.f171187T
            if (r2 != 0) goto L_0x00f7
            goto L_0x00f9
        L_0x00f7:
            r2.f178735x = r1
        L_0x00f9:
            qj1.u6 r2 = r8.f171190U
            if (r2 != 0) goto L_0x010f
            hl1.k$n r2 = new hl1.k$n
            r2.<init>(r0)
            qj1.c r2 = r8.mo84880O(r2)
            qj1.u6 r2 = (qj1.C63005u6) r2
            r8.f171190U = r2
            if (r2 == 0) goto L_0x010f
            r2.mo10792g(r3)
        L_0x010f:
            qj1.u6 r2 = r8.f171190U
            if (r2 != 0) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            r2.f178735x = r1
        L_0x0116:
            qj1.l6 r1 = r8.f171193V
            if (r1 != 0) goto L_0x0127
            hl1.k$o r1 = new hl1.k$o
            r1.<init>(r0)
            qj1.c r0 = r8.mo84880O(r1)
            qj1.l6 r0 = (qj1.C62868l6) r0
            r8.f171193V = r0
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.mo84871F():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f172989A;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo84872G() {
        /*
            r3 = this;
            p50.e r0 = r3.mo84868C()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0013
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.mo82881c()
            if (r0 != r1) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.mo84872G():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f172989A;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo84873H() {
        /*
            r3 = this;
            p50.e r0 = r3.mo84868C()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0013
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.mo82886h()
            if (r0 != r1) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.mo84873H():boolean");
    }

    /* renamed from: I */
    public final void mo84874I(Integer num) {
        Class cls = C54963d0.class;
        String str = this.f171222i;
        Log.m105924i(str, "onAcceptLinkMicOthers curLinkState:" + ((C54963d0) mo83051g(cls)).f154078u + " curLiveUser:" + ((C54963d0) mo83051g(cls)).f154073p + " audienceLinkMicUserList:" + ((C54963d0) mo83051g(cls)).f154074q + " audienceMode:" + ((C54991o) mo83051g(C54991o.class)).mo75996d3());
        C54130j jVar = ((C54963d0) mo83051g(cls)).f154073p;
        C62741dg dgVar = this.f171228m1;
        if (dgVar != null) {
            dgVar.mo87748a1();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: org.json.JSONObject} */
    /* JADX WARNING: type inference failed for: r13v13, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r13v17 */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01cf  */
    /* renamed from: J */
    public final void mo84875J(int r39, android.os.Bundle r40) {
        /*
            r38 = this;
            r1 = r38
            r0 = r39
            r2 = r40
            java.lang.Class<cl1.t0> r3 = cl1.C39981t0.class
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            java.lang.Class<cl1.d0> r6 = cl1.C54963d0.class
            vk1.c r7 = r1.f166848f
            if (r7 == 0) goto L_0x0028
            al1.h r7 = r7.getData()
            if (r7 == 0) goto L_0x0028
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r7 = r7.f151979f
            if (r7 == 0) goto L_0x0028
            gh1.j r8 = gh1.C59447j.f169870a
            hh1.i r9 = new hh1.i
            r9.<init>(r7, r0, r2)
            r8.mo84557i(r7, r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0028:
            r7 = 7
            r8 = 2
            r9 = 0
            r10 = 0
            if (r0 != r7) goto L_0x00dc
            java.lang.String r0 = r1.f171222i
            java.lang.String r3 = "first I frame"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            if (r2 == 0) goto L_0x003e
            java.lang.String r0 = "live_user_id"
            java.lang.String r0 = r2.getString(r0)
            goto L_0x003f
        L_0x003e:
            r0 = r9
        L_0x003f:
            androidx.lifecycle.i0 r3 = r1.mo83051g(r4)
            cl1.u r3 = (cl1.C55001u) r3
            te3.bq2 r3 = r3.f154419p
            java.lang.String r3 = r3.f182319n
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r3)
            if (r0 == 0) goto L_0x09e2
            er1.g5 r11 = er1.C58730g5.f168158a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "RV_VISITOR_"
            r0.append(r3)
            androidx.lifecycle.i0 r3 = r1.mo83051g(r4)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r3 = r3.f182392d
            r0.append(r3)
            java.lang.String r12 = r0.toString()
            er1.e5$b r0 = er1.C58713e5.f168073a
            er1.e5$c r0 = er1.C58713e5.f168085m
            java.lang.String r13 = r0.f168101b
            r14 = 0
            r15 = 0
            r16 = 1
            r17 = 0
            r18 = 44
            r19 = 0
            er1.C58730g5.m68220e(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            vk1.c r0 = r1.f166848f
            if (r0 == 0) goto L_0x008a
            d60.b$b r3 = d60.C58124b.C58125b.LIVE_STATUS_FIRST_I_FRAME
            d60.C58124b.C7172a.m7372a(r0, r3, r9, r8, r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x008a:
            androidx.lifecycle.i0 r0 = r1.mo83051g(r5)
            cl1.o r0 = (cl1.C54991o) r0
            if (r2 == 0) goto L_0x0099
            java.lang.String r3 = "live_first_frame_width"
            int r3 = r2.getInt(r3)
            goto L_0x009a
        L_0x0099:
            r3 = 0
        L_0x009a:
            r0.f154335l1 = r3
            androidx.lifecycle.i0 r0 = r1.mo83051g(r5)
            cl1.o r0 = (cl1.C54991o) r0
            if (r2 == 0) goto L_0x00aa
            java.lang.String r3 = "live_first_frame_height"
            int r10 = r2.getInt(r3)
        L_0x00aa:
            r0.f154338m1 = r10
            java.lang.String r0 = r1.f171222i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "EVENT_RENDER_FIRST_I_FRAME videoWidth:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r1.mo83051g(r5)
            cl1.o r3 = (cl1.C54991o) r3
            int r3 = r3.f154335l1
            r2.append(r3)
            java.lang.String r3 = ",videoHeight:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r1.mo83051g(r5)
            cl1.o r3 = (cl1.C54991o) r3
            int r3 = r3.f154338m1
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x09e2
        L_0x00dc:
            r7 = 1
            if (r0 != r7) goto L_0x026d
            if (r2 == 0) goto L_0x09e2
            java.lang.String r0 = "live_user_id"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r11 = "live_user_exit_reason"
            int r2 = r2.getInt(r11)
            java.lang.String r11 = r1.f171222i
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "user exit sdkUid:"
            r12.append(r13)
            r12.append(r0)
            java.lang.String r13 = ",reason:"
            r12.append(r13)
            r12.append(r2)
            java.lang.String r2 = " linkState:"
            r12.append(r2)
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            int r2 = r2.f154078u
            r12.append(r2)
            java.lang.String r2 = " curLinkMic:"
            r12.append(r2)
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.f154073p
            r12.append(r2)
            java.lang.String r2 = " audienceLinkMicUserList:"
            r12.append(r2)
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154074q
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            androidx.lifecycle.i0 r2 = r1.mo83051g(r4)
            cl1.u r2 = (cl1.C55001u) r2
            te3.bq2 r2 = r2.f154419p
            java.lang.String r2 = r2.f182319n
            boolean r2 = gy3.C87412m.m108589b(r0, r2)
            if (r2 == 0) goto L_0x01a1
            vk1.c r2 = r1.f166848f
            if (r2 == 0) goto L_0x0157
            d60.b$b r4 = d60.C58124b.C58125b.LIVE_STATUS_ANCHOR_EXCEPTION
            d60.C58124b.C7172a.m7372a(r2, r4, r9, r8, r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0157:
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154074q
            java.lang.String r4 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r2, r4)
            monitor-enter(r2)
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x019e }
        L_0x0169:
            boolean r8 = r4.hasNext()     // Catch:{ all -> 0x019e }
            if (r8 == 0) goto L_0x0189
            java.lang.Object r8 = r4.next()     // Catch:{ all -> 0x019e }
            r11 = r8
            al1.j r11 = (al1.C54130j) r11     // Catch:{ all -> 0x019e }
            java.lang.String r11 = r11.f151997a     // Catch:{ all -> 0x019e }
            androidx.lifecycle.i0 r12 = r1.mo83051g(r5)     // Catch:{ all -> 0x019e }
            cl1.o r12 = (cl1.C54991o) r12     // Catch:{ all -> 0x019e }
            java.lang.String r12 = r12.mo76015n4()     // Catch:{ all -> 0x019e }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r11, (java.lang.String) r12)     // Catch:{ all -> 0x019e }
            if (r11 == 0) goto L_0x0169
            goto L_0x018a
        L_0x0189:
            r8 = r9
        L_0x018a:
            monitor-exit(r2)
            if (r8 == 0) goto L_0x0195
            ij1.b r2 = ij1.C60299b.f171929a
            r2.mo85289e()
            r38.mo84878M()
        L_0x0195:
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            r2.f154053G = r10
            goto L_0x01a1
        L_0x019e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01a1:
            if (r0 == 0) goto L_0x01b9
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.f154073p
            if (r2 == 0) goto L_0x01b0
            java.lang.String r2 = r2.f151997a
            goto L_0x01b1
        L_0x01b0:
            r2 = r9
        L_0x01b1:
            boolean r2 = r0.equals(r2)
            if (r2 != r7) goto L_0x01b9
            r2 = 1
            goto L_0x01ba
        L_0x01b9:
            r2 = 0
        L_0x01ba:
            if (r2 == 0) goto L_0x01c4
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            r2.f154073p = r9
        L_0x01c4:
            androidx.lifecycle.i0 r2 = r1.mo83051g(r3)
            cl1.t0 r2 = (cl1.C39981t0) r2
            if (r0 != 0) goto L_0x01cf
            java.lang.String r3 = ""
            goto L_0x01d0
        L_0x01cf:
            r3 = r0
        L_0x01d0:
            cl1.t0$a r4 = cl1.C39981t0.C39982a.SEI
            java.util.List r4 = r2.mo62587d3(r4)
            cl1.u0 r5 = new cl1.u0
            r5.<init>(r3)
            o40.C61926c.m72700y(r4, r5)
            cl1.t0$a r4 = cl1.C39981t0.C39982a.LIST
            java.util.List r4 = r2.mo62587d3(r4)
            cl1.u0 r5 = new cl1.u0
            r5.<init>(r3)
            o40.C61926c.m72700y(r4, r5)
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<java.util.ArrayList<al1.s>> r3 = r2.f107197i
            java.util.ArrayList<al1.s> r2 = r2.f107196h
            r3.postValue(r2)
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154074q
            java.lang.String r3 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r2, r3)
            monitor-enter(r2)
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x026a }
        L_0x0205:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x026a }
            if (r4 == 0) goto L_0x021b
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x026a }
            r5 = r4
            al1.j r5 = (al1.C54130j) r5     // Catch:{ all -> 0x026a }
            java.lang.String r5 = r5.f151997a     // Catch:{ all -> 0x026a }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r0)     // Catch:{ all -> 0x026a }
            if (r5 == 0) goto L_0x0205
            goto L_0x021c
        L_0x021b:
            r4 = r9
        L_0x021c:
            monitor-exit(r2)
            if (r4 == 0) goto L_0x0266
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154074q
            java.lang.String r3 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r2, r3)
            hl1.k$s r3 = new hl1.k$s
            r3.<init>(r0)
            o40.C61926c.m72700y(r2, r3)
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154076s
            java.lang.String r3 = "business(LiveLinkMicSlic…java).linkMicUserInfoList"
            gy3.C87412m.m108593f(r2, r3)
            hl1.k$t r3 = new hl1.k$t
            r3.<init>(r0)
            o40.C61926c.m72700y(r2, r3)
            androidx.lifecycle.i0 r0 = r1.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            boolean r0 = r0.f154053G
            if (r0 != 0) goto L_0x0266
            vk1.c r0 = r1.f166848f
            if (r0 == 0) goto L_0x025c
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyAudienceMicUserChange$default(r0, r10, r7, r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x025c:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r2, r3, r4, r5, r6, r7)
        L_0x0266:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x09e2
        L_0x026a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x026d:
            r11 = 3
            if (r0 != r11) goto L_0x02f1
            vk1.c r0 = r1.f166848f
            if (r0 == 0) goto L_0x09e2
            int r2 = r0.getCurNetworkQuality()
            p50.e r3 = r38.mo84868C()
            if (r3 == 0) goto L_0x0284
            d50.i r3 = r3.f172989A
            if (r3 == 0) goto L_0x0284
            int r7 = r3.f166265l
        L_0x0284:
            r0.setCurNetworkQuality(r7)
            if (r2 == r11) goto L_0x0295
            int r3 = r0.getCurNetworkQuality()
            if (r3 != r11) goto L_0x0295
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_DISCONNECT
            d60.C58124b.C7172a.m7372a(r0, r2, r9, r8, r9)
            goto L_0x02b5
        L_0x0295:
            if (r2 != r11) goto L_0x02b5
            int r2 = r0.getCurNetworkQuality()
            if (r2 == r11) goto L_0x02b5
            vk1.c r2 = r1.f166848f
            if (r2 == 0) goto L_0x02b0
            al1.h r2 = r2.getData()
            if (r2 == 0) goto L_0x02b0
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r2 = r2.f151979f
            if (r2 == 0) goto L_0x02b0
            hh1.C59899h.m69793a(r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x02b0:
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_CONNECT_SUCC
            d60.C58124b.C7172a.m7372a(r0, r2, r9, r8, r9)
        L_0x02b5:
            int r2 = r0.getCurNetworkType()
            p50.e r3 = r38.mo84868C()
            r4 = -1
            if (r3 == 0) goto L_0x02c7
            d50.i r3 = r3.f172989A
            if (r3 == 0) goto L_0x02c7
            int r3 = r3.f166266m
            goto L_0x02c8
        L_0x02c7:
            r3 = -1
        L_0x02c8:
            r0.setCurNetworkType(r3)
            if (r2 != 0) goto L_0x02ed
            int r2 = r0.getCurNetworkType()
            if (r2 == 0) goto L_0x02ed
            int r0 = r0.getCurNetworkType()
            if (r0 == r4) goto L_0x02ed
            androidx.appcompat.app.AppCompatActivity r0 = r1.f166847e
            android.content.res.Resources r2 = r0.getResources()
            r3 = 2131827756(0x7f111c2c, float:1.9288434E38)
            java.lang.String r2 = r2.getString(r3)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r10)
            r0.show()
        L_0x02ed:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x09e2
        L_0x02f1:
            r11 = 30
            if (r0 != r11) goto L_0x0306
            ak1.o0 r0 = ak1.C54109o0.f151877a
            androidx.lifecycle.i0 r2 = r1.mo83051g(r4)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r2 = r2.f182392d
            r0.mo74840a(r2, r7)
            goto L_0x09e2
        L_0x0306:
            r11 = 12
            if (r0 != r11) goto L_0x0317
            vk1.c r0 = r1.f166848f
            if (r0 == 0) goto L_0x09e2
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_STATISTC_EVENT
            r0.statusChange(r3, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x09e2
        L_0x0317:
            r11 = 13
            if (r0 != r11) goto L_0x0350
            java.lang.Class<ak1.w> r0 = ak1.C54116w.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ak1.w r0 = (ak1.C54116w) r0
            androidx.lifecycle.i0 r2 = r1.mo83051g(r4)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r2 = r2.f182392d
            r0.Cx0(r2)
            vk1.c r0 = r1.f166848f
            if (r0 == 0) goto L_0x033b
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_CONNECT_SUCC
            d60.C58124b.C7172a.m7372a(r0, r2, r9, r8, r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x033b:
            vk1.c r0 = r1.f166848f
            if (r0 == 0) goto L_0x09e2
            al1.h r0 = r0.getData()
            if (r0 == 0) goto L_0x09e2
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r0.f151979f
            if (r0 == 0) goto L_0x09e2
            hh1.C59899h.m69793a(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x09e2
        L_0x0350:
            r11 = 14
            if (r0 != r11) goto L_0x0361
            vk1.c r0 = r1.f166848f
            if (r0 == 0) goto L_0x09e2
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_RECONNECT
            d60.C58124b.C7172a.m7372a(r0, r2, r9, r8, r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x09e2
        L_0x0361:
            r11 = 15
            if (r0 != r11) goto L_0x0372
            vk1.c r0 = r1.f166848f
            if (r0 == 0) goto L_0x09e2
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_DISCONNECT
            d60.C58124b.C7172a.m7372a(r0, r2, r9, r8, r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x09e2
        L_0x0372:
            r11 = 26
            if (r0 != r11) goto L_0x0377
            goto L_0x037b
        L_0x0377:
            r12 = 27
            if (r0 != r12) goto L_0x037d
        L_0x037b:
            r12 = 1
            goto L_0x037e
        L_0x037d:
            r12 = 0
        L_0x037e:
            if (r12 == 0) goto L_0x0381
            goto L_0x0385
        L_0x0381:
            r12 = 25
            if (r0 != r12) goto L_0x0387
        L_0x0385:
            r12 = 1
            goto L_0x0388
        L_0x0387:
            r12 = 0
        L_0x0388:
            if (r12 == 0) goto L_0x03b2
            hl1.h r2 = hl1.C59977h.f171128a
            r2.mo84860a(r1)
            if (r0 != r11) goto L_0x09e2
            ak1.n0 r0 = ak1.C54101n0.f151856a
            androidx.lifecycle.i0 r2 = r1.mo83051g(r4)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r2 = r2.f182392d
            androidx.lifecycle.i0 r4 = r1.mo83051g(r5)
            cl1.o r4 = (cl1.C54991o) r4
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.f154341n
            if (r4 == 0) goto L_0x03ab
            java.lang.String r4 = r4.nickname
            if (r4 != 0) goto L_0x03ad
        L_0x03ab:
            java.lang.String r4 = ""
        L_0x03ad:
            r0.mo74794a(r2, r4, r7)
            goto L_0x09e2
        L_0x03b2:
            r11 = 16
            if (r0 != r11) goto L_0x03c3
            vk1.c r0 = r1.f166848f
            if (r0 == 0) goto L_0x09e2
            d60.b$b r3 = d60.C58124b.C58125b.LIVE_STATUS_RESOLUTION
            r0.statusChange(r3, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x09e2
        L_0x03c3:
            if (r0 != r8) goto L_0x04fe
            if (r2 == 0) goto L_0x03cf
            java.lang.String r0 = "live_user_id"
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L_0x03d1
        L_0x03cf:
            java.lang.String r0 = ""
        L_0x03d1:
            if (r2 == 0) goto L_0x03da
            java.lang.String r3 = "live_media_enable"
            boolean r2 = r2.getBoolean(r3)
            goto L_0x03db
        L_0x03da:
            r2 = 0
        L_0x03db:
            if (r2 == 0) goto L_0x04ae
            qj1.sh r3 = r1.f171229n
            if (r3 == 0) goto L_0x03eb
            qj1.vh r4 = new qj1.vh
            r4.<init>(r3, r0, r10)
            o40.C61926c.m72668M(r4)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x03eb:
            androidx.lifecycle.i0 r3 = r1.mo83051g(r6)
            cl1.d0 r3 = (cl1.C54963d0) r3
            java.util.List<al1.j> r3 = r3.f154076s
            java.lang.String r4 = "business(LiveLinkMicSlic…java).linkMicUserInfoList"
            gy3.C87412m.m108593f(r3, r4)
            monitor-enter(r3)
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x04ab }
        L_0x03fd:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x04ab }
            if (r5 == 0) goto L_0x0413
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x04ab }
            r8 = r5
            al1.j r8 = (al1.C54130j) r8     // Catch:{ all -> 0x04ab }
            java.lang.String r8 = r8.f151997a     // Catch:{ all -> 0x04ab }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r0)     // Catch:{ all -> 0x04ab }
            if (r8 == 0) goto L_0x03fd
            goto L_0x0414
        L_0x0413:
            r5 = r9
        L_0x0414:
            monitor-exit(r3)
            al1.j r5 = (al1.C54130j) r5
            if (r5 == 0) goto L_0x046a
            boolean r3 = r5.f152004h
            if (r3 == 0) goto L_0x0443
            androidx.lifecycle.i0 r3 = r1.mo83051g(r6)
            cl1.d0 r3 = (cl1.C54963d0) r3
            r3.f154073p = r5
            androidx.lifecycle.i0 r3 = r1.mo83051g(r6)
            cl1.d0 r3 = (cl1.C54963d0) r3
            boolean r3 = r3.f154053G
            if (r3 != 0) goto L_0x04ae
            vk1.c r3 = r1.f166848f
            if (r3 == 0) goto L_0x0438
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyPKMicUserChange$default(r3, r10, r7, r9)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0438:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r7, r8, r9, r10, r11, r12)
            goto L_0x04ae
        L_0x0443:
            androidx.lifecycle.i0 r3 = r1.mo83051g(r6)
            cl1.d0 r3 = (cl1.C54963d0) r3
            r3.mo75917Y3(r5)
            androidx.lifecycle.i0 r3 = r1.mo83051g(r6)
            cl1.d0 r3 = (cl1.C54963d0) r3
            boolean r3 = r3.f154053G
            if (r3 != 0) goto L_0x04ae
            vk1.c r3 = r1.f166848f
            if (r3 == 0) goto L_0x045f
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyAudienceMicUserChange$default(r3, r10, r7, r9)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x045f:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r8 = 2
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r7, r8, r9, r10, r11, r12)
            goto L_0x04ae
        L_0x046a:
            androidx.lifecycle.i0 r3 = r1.mo83051g(r6)
            cl1.d0 r3 = (cl1.C54963d0) r3
            java.util.List<al1.j> r3 = r3.f154047A
            al1.j r4 = new al1.j
            r11 = r4
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 8388544(0x7fffc0, float:1.1754854E-38)
            r37 = 0
            r12 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37)
            r3.add(r4)
            goto L_0x04ae
        L_0x04ab:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x04ae:
            java.lang.String r3 = r1.f171222i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "EVENT_ROOM_USER_AUDIO_STATE linkState:"
            r4.append(r5)
            androidx.lifecycle.i0 r5 = r1.mo83051g(r6)
            cl1.d0 r5 = (cl1.C54963d0) r5
            int r5 = r5.f154078u
            r4.append(r5)
            java.lang.String r5 = " curLinkMic:"
            r4.append(r5)
            androidx.lifecycle.i0 r5 = r1.mo83051g(r6)
            cl1.d0 r5 = (cl1.C54963d0) r5
            al1.j r5 = r5.f154073p
            r4.append(r5)
            java.lang.String r5 = " audienceLinkMicUserList:"
            r4.append(r5)
            androidx.lifecycle.i0 r5 = r1.mo83051g(r6)
            cl1.d0 r5 = (cl1.C54963d0) r5
            java.util.List<al1.j> r5 = r5.f154074q
            r4.append(r5)
            java.lang.String r5 = " userId:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " enable:"
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x09e2
        L_0x04fe:
            if (r0 != 0) goto L_0x05de
            if (r2 == 0) goto L_0x050a
            java.lang.String r0 = "live_user_id"
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L_0x050c
        L_0x050a:
            java.lang.String r0 = ""
        L_0x050c:
            androidx.lifecycle.i0 r2 = r1.mo83051g(r5)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.mo75996d3()
            if (r2 != r7) goto L_0x0596
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154076s
            java.lang.String r3 = "business(LiveLinkMicSlic…java).linkMicUserInfoList"
            gy3.C87412m.m108593f(r2, r3)
            monitor-enter(r2)
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0593 }
        L_0x052a:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0593 }
            if (r4 == 0) goto L_0x054a
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0593 }
            r7 = r4
            al1.j r7 = (al1.C54130j) r7     // Catch:{ all -> 0x0593 }
            java.lang.String r7 = r7.f151997a     // Catch:{ all -> 0x0593 }
            androidx.lifecycle.i0 r10 = r1.mo83051g(r5)     // Catch:{ all -> 0x0593 }
            cl1.o r10 = (cl1.C54991o) r10     // Catch:{ all -> 0x0593 }
            java.lang.String r10 = r10.mo76015n4()     // Catch:{ all -> 0x0593 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r10)     // Catch:{ all -> 0x0593 }
            if (r7 == 0) goto L_0x052a
            goto L_0x054b
        L_0x054a:
            r4 = r9
        L_0x054b:
            monitor-exit(r2)
            al1.j r4 = (al1.C54130j) r4
            if (r4 == 0) goto L_0x0596
            p50.e r2 = r38.mo84868C()
            if (r2 == 0) goto L_0x055c
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x055c
            java.lang.String r9 = r2.f166260g
        L_0x055c:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r9, (java.lang.String) r0)
            if (r2 == 0) goto L_0x0596
            int r2 = r4.f152001e
            if (r2 != r8) goto L_0x057c
            vk1.c r2 = r1.f166848f
            if (r2 == 0) goto L_0x0572
            hl1.k$u r3 = new hl1.k$u
            r3.<init>(r1, r4)
            r2.post(r3)
        L_0x0572:
            p50.e r2 = r38.mo84868C()
            if (r2 == 0) goto L_0x0596
            r2.mo75212E()
            goto L_0x0596
        L_0x057c:
            vk1.c r2 = r1.f166848f
            if (r2 == 0) goto L_0x0588
            hl1.k$v r3 = new hl1.k$v
            r3.<init>(r1, r4)
            r2.post(r3)
        L_0x0588:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r8 = 2
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r7, r8, r9, r10, r11, r12)
            goto L_0x0596
        L_0x0593:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0596:
            java.lang.String r2 = r1.f171222i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "EVENT_USER_VIDEO_AVAILABLE linkState:"
            r3.append(r4)
            androidx.lifecycle.i0 r4 = r1.mo83051g(r6)
            cl1.d0 r4 = (cl1.C54963d0) r4
            int r4 = r4.f154078u
            r3.append(r4)
            java.lang.String r4 = " curLinkMic:"
            r3.append(r4)
            androidx.lifecycle.i0 r4 = r1.mo83051g(r6)
            cl1.d0 r4 = (cl1.C54963d0) r4
            al1.j r4 = r4.f154073p
            r3.append(r4)
            java.lang.String r4 = " audienceLinkMicUserList:"
            r3.append(r4)
            androidx.lifecycle.i0 r4 = r1.mo83051g(r6)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.util.List<al1.j> r4 = r4.f154074q
            r3.append(r4)
            java.lang.String r4 = " userId:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x09e2
        L_0x05de:
            r11 = 17
            if (r0 != r11) goto L_0x05e9
            cj1.h4 r0 = cj1.C54766h4.f153491a
            r0.mo75671b()
            goto L_0x09e2
        L_0x05e9:
            r11 = 29
            if (r0 != r11) goto L_0x0605
            if (r2 == 0) goto L_0x05f6
            java.lang.String r0 = "live_cdn_sei_msg_time"
            long r2 = r2.getLong(r0)
            goto L_0x05f8
        L_0x05f6:
            r2 = 0
        L_0x05f8:
            java.lang.Class<cl1.d> r0 = cl1.C54951d.class
            androidx.lifecycle.i0 r0 = r1.mo83051g(r0)
            cl1.d r0 = (cl1.C54951d) r0
            r0.mo75871g3(r2)
            goto L_0x09e2
        L_0x0605:
            r11 = 28
            if (r0 != r11) goto L_0x0625
            androidx.lifecycle.i0 r0 = r1.mo83051g(r3)
            cl1.t0 r0 = (cl1.C39981t0) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<android.os.Bundle> r0 = r0.f107200o
            r0.postValue(r2)
            if (r2 == 0) goto L_0x061c
            java.lang.String r0 = "live_cdn_sei_msg"
            java.lang.String r9 = r2.getString(r0)
        L_0x061c:
            if (r9 == 0) goto L_0x09e2
            r1.mo84877L(r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x09e2
        L_0x0625:
            r11 = 20
            if (r0 != r11) goto L_0x0932
            if (r2 == 0) goto L_0x0632
            java.lang.String r0 = "live_cdn_sei_msg"
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0633
        L_0x0632:
            r0 = r9
        L_0x0633:
            if (r0 == 0) goto L_0x09e2
            c30.g r3 = new c30.g
            r3.<init>((java.lang.String) r0)
            java.lang.String r11 = "userId"
            java.lang.String r11 = r3.optString(r11)
            if (r11 != 0) goto L_0x0645
            java.lang.String r11 = ""
        L_0x0645:
            java.lang.String r12 = "userStatus"
            int r12 = r3.optInt(r12)
            java.lang.String r13 = "songId"
            r3.optInt(r13)
            java.lang.String r13 = "playStatus"
            r3.optInt(r13)
            java.lang.String r13 = "st"
            long r13 = r3.optLong(r13)
            r1.mo84901y(r13, r11)
            r1.mo84877L(r0)
            androidx.lifecycle.i0 r0 = r1.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.f154073p
            if (r0 == 0) goto L_0x06b9
            java.lang.String r3 = r0.f151997a
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r11)
            if (r3 == 0) goto L_0x06b7
            boolean r3 = o40.C61926c.m72696u(r12, r8)
            boolean r8 = r0.f152012p
            if (r8 == r3) goto L_0x06a4
            java.lang.String r8 = r0.f152011o
            if (r8 == 0) goto L_0x068b
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0689
            goto L_0x068b
        L_0x0689:
            r8 = 0
            goto L_0x068c
        L_0x068b:
            r8 = 1
        L_0x068c:
            if (r8 != 0) goto L_0x06a4
            r0.f152012p = r3
            ii1.e r3 = r1.f171252x1
            if (r3 == 0) goto L_0x069b
            java.lang.String r8 = r0.f151997a
            r3.mo85280d1(r8)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x069b:
            qj1.o2 r3 = r1.f171248w
            if (r3 == 0) goto L_0x06a4
            r3.mo87850a1()
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x06a4:
            boolean r3 = o40.C61926c.m72696u(r12, r7)
            boolean r8 = r0.f152010n
            if (r8 == r3) goto L_0x06b7
            r0.f152010n = r3
            qj1.o2 r0 = r1.f171248w
            if (r0 == 0) goto L_0x06b7
            r0.mo87851b1()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x06b7:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x06b9:
            androidx.lifecycle.i0 r0 = r1.mo83051g(r4)
            cl1.u r0 = (cl1.C55001u) r0
            te3.bq2 r0 = r0.f154419p
            java.lang.String r0 = r0.f182319n
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x092e
            java.lang.String r0 = "live_link_mic_info_in_anchor_sei_msg"
            java.lang.String r0 = r2.getString(r0)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x0701
            java.lang.String r2 = r1.f171222i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "EVENT_CDN_SEI_MESSAGE_ANCHOR_INFO: linkMicInfo empty, linkMicInfo:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", roomPk:"
            r3.append(r0)
            androidx.lifecycle.i0 r0 = r1.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            boolean r0 = r0.f154053G
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L_0x070d
        L_0x0701:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0708 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0708 }
            r0 = r2
            goto L_0x070d
        L_0x0708:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x070d:
            java.lang.String r2 = r1.f171222i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "EVENT_CDN_SEI_MESSAGE_ANCHOR_INFO: micData:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)
            java.lang.String r2 = "list"
            org.json.JSONArray r2 = r0.optJSONArray(r2)
            vk1.c r3 = r1.f166848f
            if (r3 != 0) goto L_0x072e
            goto L_0x0731
        L_0x072e:
            r3.setCurrentMicData(r0)
        L_0x0731:
            if (r2 == 0) goto L_0x0738
            int r3 = r2.length()
            goto L_0x0739
        L_0x0738:
            r3 = 0
        L_0x0739:
            if (r3 != 0) goto L_0x0770
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            r2.f154053G = r10
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            r2.f154073p = r9
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154074q
            r2.clear()
            vk1.c r11 = r1.f166848f
            if (r11 == 0) goto L_0x0763
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r12 = r0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifySEIMicUserChange$default(r11, r12, r13, r14, r15, r16)
        L_0x0763:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r11 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r12 = 3
            r14 = 0
            r15 = 4
            r16 = 0
            r13 = r0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r11, r12, r13, r14, r15, r16)
            goto L_0x092e
        L_0x0770:
            androidx.lifecycle.i0 r3 = r1.mo83051g(r6)
            cl1.d0 r3 = (cl1.C54963d0) r3
            r3.f154053G = r7
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            if (r2 == 0) goto L_0x0784
            int r4 = r2.length()
            goto L_0x0785
        L_0x0784:
            r4 = 0
        L_0x0785:
            r12 = r9
            r8 = 0
            r11 = 1
        L_0x0788:
            if (r8 >= r4) goto L_0x0821
            if (r2 == 0) goto L_0x0791
            org.json.JSONObject r13 = r2.optJSONObject(r8)
            goto L_0x0792
        L_0x0791:
            r13 = r9
        L_0x0792:
            if (r13 == 0) goto L_0x079c
            java.lang.String r14 = "uId"
            java.lang.String r14 = r13.optString(r14)
            goto L_0x079d
        L_0x079c:
            r14 = r9
        L_0x079d:
            androidx.lifecycle.i0 r15 = r1.mo83051g(r6)
            cl1.d0 r15 = (cl1.C54963d0) r15
            java.util.List<al1.j> r15 = r15.f154076s
            java.lang.String r9 = "business(LiveLinkMicSlic…java).linkMicUserInfoList"
            gy3.C87412m.m108593f(r15, r9)
            monitor-enter(r15)
            java.util.Iterator r9 = r15.iterator()     // Catch:{ all -> 0x081e }
        L_0x07af:
            boolean r17 = r9.hasNext()     // Catch:{ all -> 0x081e }
            if (r17 == 0) goto L_0x07ca
            java.lang.Object r17 = r9.next()     // Catch:{ all -> 0x081e }
            r18 = r17
            al1.j r18 = (al1.C54130j) r18     // Catch:{ all -> 0x081e }
            java.lang.String r10 = r18.mo74939g()     // Catch:{ all -> 0x081e }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r14)     // Catch:{ all -> 0x081e }
            if (r10 == 0) goto L_0x07c8
            goto L_0x07cc
        L_0x07c8:
            r10 = 0
            goto L_0x07af
        L_0x07ca:
            r17 = 0
        L_0x07cc:
            monitor-exit(r15)
            r9 = r17
            al1.j r9 = (al1.C54130j) r9
            if (r9 != 0) goto L_0x07eb
            java.lang.String r9 = r1.f171222i
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "EVENT_CDN_SEI_MESSAGE_ANCHOR_INFO: can't find user info, userId:"
            r10.append(r11)
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            r11 = 0
            goto L_0x0818
        L_0x07eb:
            if (r13 == 0) goto L_0x07f5
            java.lang.String r10 = "us"
            int r10 = r13.optInt(r10)
            goto L_0x07f6
        L_0x07f5:
            r10 = 0
        L_0x07f6:
            boolean r13 = o40.C61926c.m72696u(r10, r7)
            r9.mo74945l(r13)
            r9.mo74947n(r10)
            boolean r13 = r9.mo74944k()
            if (r13 == 0) goto L_0x0808
            r12 = r9
            goto L_0x0818
        L_0x0808:
            r13 = 8
            boolean r10 = o40.C61926c.m72696u(r10, r13)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9.mo74946m(r10)
            r3.add(r9)
        L_0x0818:
            int r8 = r8 + 1
            r9 = 0
            r10 = 0
            goto L_0x0788
        L_0x081e:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0821:
            hl1.t2 r4 = new hl1.t2
            r4.<init>(r1)
            o40.C61926c.m72668M(r4)
            if (r2 == 0) goto L_0x0830
            int r4 = r2.length()
            goto L_0x0831
        L_0x0830:
            r4 = 0
        L_0x0831:
            r8 = 0
            r9 = 0
        L_0x0833:
            if (r8 >= r4) goto L_0x085c
            if (r2 == 0) goto L_0x083c
            org.json.JSONObject r10 = r2.optJSONObject(r8)
            goto L_0x083d
        L_0x083c:
            r10 = 0
        L_0x083d:
            if (r10 == 0) goto L_0x0847
            java.lang.String r13 = "uId"
            java.lang.String r10 = r10.optString(r13)
            goto L_0x0848
        L_0x0847:
            r10 = 0
        L_0x0848:
            androidx.lifecycle.i0 r13 = r1.mo83051g(r5)
            cl1.o r13 = (cl1.C54991o) r13
            java.lang.String r13 = r13.mo76015n4()
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r13)
            if (r10 == 0) goto L_0x0859
            r9 = 1
        L_0x0859:
            int r8 = r8 + 1
            goto L_0x0833
        L_0x085c:
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154074q
            java.lang.String r4 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r2, r4)
            monitor-enter(r2)
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x092b }
        L_0x086e:
            boolean r8 = r4.hasNext()     // Catch:{ all -> 0x092b }
            if (r8 == 0) goto L_0x0890
            java.lang.Object r8 = r4.next()     // Catch:{ all -> 0x092b }
            r10 = r8
            al1.j r10 = (al1.C54130j) r10     // Catch:{ all -> 0x092b }
            java.lang.String r10 = r10.f151997a     // Catch:{ all -> 0x092b }
            androidx.lifecycle.i0 r13 = r1.mo83051g(r5)     // Catch:{ all -> 0x092b }
            cl1.o r13 = (cl1.C54991o) r13     // Catch:{ all -> 0x092b }
            java.lang.String r13 = r13.mo76015n4()     // Catch:{ all -> 0x092b }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r13)     // Catch:{ all -> 0x092b }
            if (r10 == 0) goto L_0x086e
            r16 = r8
            goto L_0x0892
        L_0x0890:
            r16 = 0
        L_0x0892:
            monitor-exit(r2)
            if (r16 == 0) goto L_0x0897
            r2 = 1
            goto L_0x0898
        L_0x0897:
            r2 = 0
        L_0x0898:
            if (r2 == 0) goto L_0x08db
            if (r9 != 0) goto L_0x08db
            int r4 = r1.f171207Z1
            int r4 = r4 + r7
            r1.f171207Z1 = r4
            java.lang.String r4 = r1.f171222i
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "EVENT_CDN_SEI_MESSAGE_ANCHOR_INFO: isMicingByLocal:"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = ", isMicingBySei:"
            r7.append(r2)
            r7.append(r9)
            java.lang.String r2 = ", autoCloseLinkMicSelfCount:"
            r7.append(r2)
            int r2 = r1.f171207Z1
            r7.append(r2)
            java.lang.String r2 = ", maybe postCloseLinkMsg"
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            int r2 = r1.f171207Z1
            r4 = 10
            if (r2 < r4) goto L_0x08de
            r38.mo84878M()
            r4 = 0
            r1.f171207Z1 = r4
            goto L_0x08de
        L_0x08db:
            r4 = 0
            r1.f171207Z1 = r4
        L_0x08de:
            if (r11 == 0) goto L_0x092e
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            r2.mo75918Z3(r12)
            androidx.lifecycle.i0 r2 = r1.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List r2 = r2.mo75932o3()
            r2.clear()
            java.util.Iterator r2 = r3.iterator()
        L_0x08fa:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0910
            java.lang.Object r3 = r2.next()
            al1.j r3 = (al1.C54130j) r3
            androidx.lifecycle.i0 r4 = r1.mo83051g(r5)
            cl1.o r4 = (cl1.C54991o) r4
            r4.mo76009k4(r3)
            goto L_0x08fa
        L_0x0910:
            vk1.c r11 = r38.mo83047j()
            if (r11 == 0) goto L_0x091f
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r12 = r0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifySEIMicUserChange$default(r11, r12, r13, r14, r15, r16)
        L_0x091f:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r11 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r12 = 3
            r14 = 0
            r15 = 4
            r16 = 0
            r13 = r0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r11, r12, r13, r14, r15, r16)
            goto L_0x092e
        L_0x092b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x092e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x09e2
        L_0x0932:
            r4 = 0
            r5 = 19
            if (r0 != r5) goto L_0x09ba
            if (r2 == 0) goto L_0x0941
            java.lang.String r0 = "live_user_volume_info"
            java.util.ArrayList r0 = r2.getParcelableArrayList(r0)
            r2 = r0
            goto L_0x0942
        L_0x0941:
            r2 = 0
        L_0x0942:
            androidx.lifecycle.i0 r0 = r1.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r5 = r0.f154074q
            java.lang.String r0 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r5, r0)
            monitor-enter(r5)
            java.util.Iterator r0 = r5.iterator()     // Catch:{ all -> 0x09b7 }
        L_0x0954:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x09b7 }
            if (r6 == 0) goto L_0x09a2
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x09b7 }
            al1.j r6 = (al1.C54130j) r6     // Catch:{ all -> 0x09b7 }
            if (r2 == 0) goto L_0x098b
            monitor-enter(r2)     // Catch:{ all -> 0x09b7 }
            java.util.Iterator r8 = r2.iterator()     // Catch:{ all -> 0x0988 }
        L_0x0967:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0988 }
            if (r9 == 0) goto L_0x097f
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0988 }
            r10 = r9
            com.tencent.mm.live.core.core.model.UserVolumeInfo r10 = (com.tencent.p014mm.live.core.core.model.UserVolumeInfo) r10     // Catch:{ all -> 0x0988 }
            java.lang.String r10 = r10.f157117d     // Catch:{ all -> 0x0988 }
            java.lang.String r11 = r6.f151997a     // Catch:{ all -> 0x0988 }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r11)     // Catch:{ all -> 0x0988 }
            if (r10 == 0) goto L_0x0967
            goto L_0x0980
        L_0x097f:
            r9 = 0
        L_0x0980:
            monitor-exit(r2)     // Catch:{ all -> 0x09b7 }
            com.tencent.mm.live.core.core.model.UserVolumeInfo r9 = (com.tencent.p014mm.live.core.core.model.UserVolumeInfo) r9     // Catch:{ all -> 0x09b7 }
            if (r9 == 0) goto L_0x098b
            int r8 = r9.f157118e     // Catch:{ all -> 0x09b7 }
            goto L_0x098c
        L_0x0988:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x09b7 }
            throw r0     // Catch:{ all -> 0x09b7 }
        L_0x098b:
            r8 = 0
        L_0x098c:
            p50.e r9 = r38.mo84868C()     // Catch:{ all -> 0x09b7 }
            if (r9 == 0) goto L_0x0999
            d50.c r9 = r9.f172999K     // Catch:{ all -> 0x09b7 }
            if (r9 == 0) goto L_0x0999
            int r9 = r9.f83322a     // Catch:{ all -> 0x09b7 }
            goto L_0x099a
        L_0x0999:
            r9 = 0
        L_0x099a:
            if (r8 > r9) goto L_0x099e
            r8 = 1
            goto L_0x099f
        L_0x099e:
            r8 = 0
        L_0x099f:
            r6.f152010n = r8     // Catch:{ all -> 0x09b7 }
            goto L_0x0954
        L_0x09a2:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x09b7 }
            monitor-exit(r5)
            androidx.lifecycle.i0 r0 = r1.mo83051g(r3)
            cl1.t0 r0 = (cl1.C39981t0) r0
            r0.mo62590g3(r2)
            hl1.t2 r0 = new hl1.t2
            r0.<init>(r1)
            o40.C61926c.m72668M(r0)
            goto L_0x09e2
        L_0x09b7:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x09ba:
            r3 = 21
            if (r0 != r3) goto L_0x09d2
            qj1.ue r0 = r1.f171154D1
            if (r0 == 0) goto L_0x09e2
            if (r2 == 0) goto L_0x09cb
            java.lang.String r3 = "live_cdn_sei_msg"
            java.lang.String r9 = r2.getString(r3)
            goto L_0x09cc
        L_0x09cb:
            r9 = 0
        L_0x09cc:
            r0.mo87979l1(r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x09e2
        L_0x09d2:
            r2 = 22
            if (r0 != r2) goto L_0x09e2
            vk1.c r0 = r1.f166848f
            if (r0 == 0) goto L_0x09e2
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_CLOSE_SWITCH_SUCCESS
            r3 = 0
            d60.C58124b.C7172a.m7372a(r0, r2, r3, r8, r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x09e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.mo84875J(int, android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r2 = (fh1.C59079s2) (r2 = (r2 = r2.getData()).f151979f).controller(fh1.C59079s2.class);
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84876K(android.view.View r9, boolean r10, int r11, int r12) {
        /*
            r8 = this;
            int r0 = r9.getWidth()
            if (r0 == 0) goto L_0x017e
            int r0 = r9.getHeight()
            if (r0 == 0) goto L_0x017e
            r0 = 2
            int[] r1 = new int[r0]
            r9.getLocationOnScreen(r1)
            vk1.c r2 = r8.f166848f
            r3 = 0
            if (r2 == 0) goto L_0x002e
            al1.h r2 = r2.getData()
            if (r2 == 0) goto L_0x002e
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r2 = r2.f151979f
            if (r2 == 0) goto L_0x002e
            java.lang.Class<fh1.s2> r4 = fh1.C59079s2.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r2 = r2.controller(r4)
            fh1.s2 r2 = (fh1.C59079s2) r2
            if (r2 == 0) goto L_0x002e
            int r2 = r2.f169030q
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r4 = 1
            if (r10 == 0) goto L_0x0036
            if (r2 == 0) goto L_0x0036
            r1[r4] = r2
        L_0x0036:
            java.lang.String r5 = r8.f171222i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onPreviewViewLocationChange isFromTransitionAnimate: "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r10 = " videoAnimateY:"
            r6.append(r10)
            r6.append(r2)
            java.lang.String r10 = " newY: "
            r6.append(r10)
            r10 = r1[r4]
            r6.append(r10)
            r10 = 32
            r6.append(r10)
            java.lang.String r10 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            qj1.kb r10 = r8.f171238r
            if (r10 == 0) goto L_0x00a4
            com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget r10 = r10.mo87804b1()
            com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView r2 = r10.f159429b
            int r2 = r2.getChildCount()
            if (r2 < 0) goto L_0x00a4
            r5 = 0
        L_0x0074:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "multistream updateLayoutParams pos: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MultiStreamWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView r6 = r10.f159429b
            android.view.View r6 = r6.getChildAt(r5)
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout
            if (r7 == 0) goto L_0x0097
            com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout r6 = (com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout) r6
            goto L_0x0098
        L_0x0097:
            r6 = 0
        L_0x0098:
            if (r6 == 0) goto L_0x009f
            int r7 = com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout.f159421i
            r6.mo77670f(r3)
        L_0x009f:
            if (r5 == r2) goto L_0x00a4
            int r5 = r5 + 1
            goto L_0x0074
        L_0x00a4:
            qj1.sf r10 = r8.f171179Q0
            if (r10 == 0) goto L_0x00b3
            r2 = r1[r3]
            r5 = r1[r4]
            int r6 = r9.getHeight()
            r10.mo87914b1(r2, r5, r6)
        L_0x00b3:
            qj1.fb r10 = r8.f171236q
            if (r10 == 0) goto L_0x00c2
            r2 = r1[r3]
            r5 = r1[r4]
            int r6 = r9.getHeight()
            r10.mo87772a1(r2, r5, r6)
        L_0x00c2:
            qj1.ba r10 = r8.f171185S0
            if (r10 == 0) goto L_0x00cb
            r2 = r1[r4]
            r10.mo87676Z0(r2)
        L_0x00cb:
            qj1.ba r10 = r8.f171188T0
            if (r10 == 0) goto L_0x00d4
            r2 = r1[r4]
            r10.mo87676Z0(r2)
        L_0x00d4:
            qj1.ue r10 = r8.f171154D1
            if (r10 == 0) goto L_0x00e3
            r2 = r1[r3]
            r5 = r1[r4]
            int r6 = r9.getHeight()
            r10.mo87976h1(r2, r5, r6)
        L_0x00e3:
            qj1.x6 r10 = r8.f171184S
            if (r10 == 0) goto L_0x00ec
            r2 = r1[r4]
            r10.mo88034b1(r2, r9, r11)
        L_0x00ec:
            qj1.v6 r10 = r8.f171187T
            if (r10 == 0) goto L_0x017e
            r11 = r1[r3]
            r1 = r1[r4]
            android.view.ViewGroup r2 = r10.f166287d
            android.content.res.Resources r2 = r2.getResources()
            if (r2 == 0) goto L_0x00ff
            r2.getDisplayMetrics()
        L_0x00ff:
            android.view.ViewGroup r2 = r10.f166287d
            android.content.Context r2 = r2.getContext()
            com.tencent.p014mm.p136ui.C75044y4.m89994f(r2)
            android.view.ViewGroup r2 = r10.f178911C
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r5 = r10.mo82893g0()
            java.lang.String r6 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            if (r5 != 0) goto L_0x0168
            gy3.C87412m.m108592e(r2, r6)
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            int r5 = r9.getWidth()
            r2.width = r5
            int r9 = r9.getHeight()
            r2.height = r9
            if (r12 <= 0) goto L_0x012c
            r2.topMargin = r12
            goto L_0x012e
        L_0x012c:
            r2.topMargin = r1
        L_0x012e:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r9[r3] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r9[r4] = r12
            java.lang.String r12 = "FinderLiveGameDynamicPlayerFrameSetPlugin"
            java.lang.String r0 = "topMarginPreviewParent:%d, y:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r9)
            r2.leftMargin = r11
            r2.rightMargin = r3
            r2.bottomMargin = r3
            android.view.ViewGroup r9 = r10.f178911C
            r9.setLayoutParams(r2)
            int r9 = r2.width
            if (r9 == 0) goto L_0x0157
            int r9 = r2.height
            if (r9 != 0) goto L_0x015d
        L_0x0157:
            java.lang.String r9 = "width or height is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
        L_0x015d:
            int r9 = r2.topMargin
            if (r9 != 0) goto L_0x017e
            java.lang.String r9 = "topMargin is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
            goto L_0x017e
        L_0x0168:
            gy3.C87412m.m108592e(r2, r6)
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            int r11 = r9.getWidth()
            r2.width = r11
            int r9 = r9.getHeight()
            r2.height = r9
            android.view.ViewGroup r9 = r10.f178911C
            r9.setLayoutParams(r2)
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.mo84876K(android.view.View, boolean, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0077, code lost:
        r7 = (r7 = r7.objectDesc).liveDesc;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84877L(java.lang.String r11) {
        /*
            r10 = this;
            c30.g r0 = new c30.g
            r0.<init>((java.lang.String) r11)
            java.lang.String r11 = "userId"
            java.lang.String r11 = r0.optString(r11)
            java.lang.String r1 = ""
            if (r11 != 0) goto L_0x0011
            r11 = r1
        L_0x0011:
            java.lang.String r2 = "userStatus"
            int r2 = r0.optInt(r2)
            java.lang.String r3 = "songId"
            int r3 = r0.optInt(r3)
            java.lang.String r4 = "playStatus"
            int r0 = r0.optInt(r4)
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            java.lang.String r5 = r10.f171222i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "notityAnchorInfoBySei anchorUserId:"
            r6.append(r7)
            r6.append(r11)
            java.lang.String r7 = " lastAudioMode:"
            r6.append(r7)
            java.lang.Boolean r7 = r10.f171183R1
            r6.append(r7)
            java.lang.String r7 = " lastScreenShareMode:"
            r6.append(r7)
            boolean r7 = r10.f171186S1
            r6.append(r7)
            java.lang.String r7 = "userStatus:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = " songId:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = ", playStatus:"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = " coverUrl:"
            r6.append(r7)
            androidx.lifecycle.i0 r7 = r10.mo83051g(r4)
            cl1.o r7 = (cl1.C54991o) r7
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.f154341n
            r8 = 0
            if (r7 == 0) goto L_0x007e
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r7.objectDesc
            if (r7 == 0) goto L_0x007e
            te3.px0 r7 = r7.liveDesc
            if (r7 == 0) goto L_0x007e
            java.lang.String r7 = r7.f184911d
            goto L_0x007f
        L_0x007e:
            r7 = r8
        L_0x007f:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.lang.Class<cl1.u> r5 = cl1.C55001u.class
            androidx.lifecycle.i0 r5 = r10.mo83051g(r5)
            cl1.u r5 = (cl1.C55001u) r5
            te3.bq2 r5 = r5.f154419p
            if (r5 == 0) goto L_0x0098
            java.lang.String r5 = r5.f182319n
            goto L_0x0099
        L_0x0098:
            r5 = r8
        L_0x0099:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r11, (java.lang.String) r5)
            if (r11 == 0) goto L_0x0259
            hl1.u2 r11 = new hl1.u2
            r11.<init>(r10, r3, r0)
            o40.C61926c.m72668M(r11)
            r11 = 4
            boolean r0 = o40.C61926c.m72696u(r2, r11)
            boolean r3 = r10.f171186S1
            r5 = 0
            r6 = 1
            if (r3 == r0) goto L_0x010c
            r10.f171186S1 = r0
            if (r0 == 0) goto L_0x00db
            p50.e r0 = r10.mo84868C()
            if (r0 == 0) goto L_0x00c2
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x00c2
            r0.f166264k = r6
        L_0x00c2:
            qj1.ze r0 = r10.f171224j
            if (r0 == 0) goto L_0x00cf
            f50.d r0 = r0.mo88091c1()
            if (r0 == 0) goto L_0x00cf
            r0.setRenderMode(r6)
        L_0x00cf:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.f171183R1 = r0
            qj1.w3 r0 = r10.f171257z1
            if (r0 == 0) goto L_0x010c
            r0.mo10792g(r11)
            goto L_0x010c
        L_0x00db:
            p50.e r11 = r10.mo84868C()
            if (r11 == 0) goto L_0x00e7
            d50.i r11 = r11.f172989A
            if (r11 == 0) goto L_0x00e7
            r11.f166264k = r5
        L_0x00e7:
            qj1.ze r11 = r10.f171224j
            if (r11 == 0) goto L_0x0108
            f50.d r11 = r11.mo88091c1()
            if (r11 == 0) goto L_0x0108
            ok1.e r0 = ok1.C62042e.f176370a
            fj1.b r3 = r10.f166851d
            vk1.c r7 = r10.f166848f
            if (r7 == 0) goto L_0x00fe
            boolean r7 = r7.isLandscape()
            goto L_0x00ff
        L_0x00fe:
            r7 = 0
        L_0x00ff:
            boolean r9 = r10.f171186S1
            int r0 = r0.mo87123v0(r3, r7, r9)
            r11.setRenderMode(r0)
        L_0x0108:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.f171183R1 = r11
        L_0x010c:
            androidx.lifecycle.i0 r11 = r10.mo83051g(r4)
            cl1.o r11 = (cl1.C54991o) r11
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.f154341n
            if (r11 == 0) goto L_0x0121
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r11 = r11.objectDesc
            if (r11 == 0) goto L_0x0121
            te3.px0 r11 = r11.liveDesc
            if (r11 == 0) goto L_0x0121
            java.lang.String r11 = r11.f184911d
            goto L_0x0122
        L_0x0121:
            r11 = r8
        L_0x0122:
            if (r11 == 0) goto L_0x012d
            int r0 = r11.length()
            if (r0 != 0) goto L_0x012b
            goto L_0x012d
        L_0x012b:
            r0 = 0
            goto L_0x012e
        L_0x012d:
            r0 = 1
        L_0x012e:
            if (r0 == 0) goto L_0x014f
            androidx.lifecycle.i0 r11 = r10.mo83051g(r4)
            cl1.o r11 = (cl1.C54991o) r11
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.f154341n
            if (r11 == 0) goto L_0x0150
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r11 = r11.objectDesc
            if (r11 == 0) goto L_0x0150
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r11 = r11.media
            if (r11 == 0) goto L_0x0150
            java.lang.Object r11 = sx3.C110818d0.m150916N(r11)
            com.tencent.mm.protocal.protobuf.FinderMedia r11 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r11
            if (r11 == 0) goto L_0x0150
            java.lang.String r11 = r11.url
            if (r11 != 0) goto L_0x014f
            goto L_0x0150
        L_0x014f:
            r1 = r11
        L_0x0150:
            r11 = 2
            boolean r0 = o40.C61926c.m72696u(r2, r11)
            java.lang.Boolean r3 = r10.f171183R1
            if (r3 == 0) goto L_0x0163
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 != 0) goto L_0x01e2
        L_0x0163:
            if (r1 == 0) goto L_0x016e
            int r1 = r1.length()
            if (r1 != 0) goto L_0x016c
            goto L_0x016e
        L_0x016c:
            r1 = 0
            goto L_0x016f
        L_0x016e:
            r1 = 1
        L_0x016f:
            if (r1 != 0) goto L_0x01e2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.f171183R1 = r0
            boolean r0 = o40.C61926c.m72696u(r2, r11)
            if (r0 == 0) goto L_0x018b
            p50.e r1 = r10.mo84868C()
            if (r1 == 0) goto L_0x0198
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0198
            r1.mo82889k()
            goto L_0x0198
        L_0x018b:
            p50.e r1 = r10.mo84868C()
            if (r1 == 0) goto L_0x0198
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0198
            r1.mo82890l()
        L_0x0198:
            fj1.b r1 = r10.f166851d
            java.lang.Class<cl1.d0> r3 = cl1.C54963d0.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
            cl1.d0 r1 = (cl1.C54963d0) r1
            al1.j r1 = r1.mo75930m3()
            r1.f152012p = r0
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            uk1.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159381i
            r1.getClass()
            uk1.b r3 = new uk1.b
            r3.<init>(r1, r0)
            o40.C61926c.m72668M(r3)
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
            if (r1 == 0) goto L_0x01c8
            gh1.j r3 = gh1.C59447j.f169870a
            hh1.b r4 = new hh1.b
            r4.<init>(r1, r0)
            r3.mo84557i(r1, r4)
        L_0x01c8:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "PARAM_FINDER_LIVE_AUDIO_MODE"
            r1.putBoolean(r3, r0)
            boolean r0 = r10.f171186S1
            java.lang.String r3 = "PARAM_FINDER_LIVE_IS_SHARE_MODE"
            r1.putBoolean(r3, r0)
            vk1.c r0 = r10.f166848f
            if (r0 == 0) goto L_0x01e2
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_MODE_SWITCH
            r0.statusChange(r3, r1)
        L_0x01e2:
            boolean r0 = o40.C61926c.m72696u(r2, r6)
            r0 = r0 ^ r6
            qj1.o2 r1 = r10.f171248w
            if (r1 == 0) goto L_0x01f3
            qj1.p2 r3 = new qj1.p2
            r3.<init>(r1, r0)
            o40.C61926c.m72668M(r3)
        L_0x01f3:
            ii1.e r1 = r10.f171252x1
            if (r1 == 0) goto L_0x024b
            boolean r11 = o40.C61926c.m72696u(r2, r11)
            li1.b r1 = r1.f171918t
            boolean r2 = r1.mo85558f()
            if (r2 != 0) goto L_0x0204
            goto L_0x024b
        L_0x0204:
            com.tencent.mm.view.ratio.RatioLayout r2 = r1.mo85556d()
            int r2 = r2.getChildCount()
        L_0x020c:
            if (r5 >= r2) goto L_0x024b
            com.tencent.mm.view.ratio.RatioLayout r3 = r1.mo85556d()
            android.view.View r3 = r3.getChildAt(r5)
            boolean r4 = r3 instanceof pi1.C62305h
            if (r4 == 0) goto L_0x021d
            pi1.h r3 = (pi1.C62305h) r3
            goto L_0x021e
        L_0x021d:
            r3 = r8
        L_0x021e:
            if (r3 == 0) goto L_0x0248
            boolean r1 = r3.f177119q
            if (r1 == r11) goto L_0x024b
            r3.setAudioMode(r11)
            java.lang.String r1 = r3.getTAG()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "notifyAnchorAudioModeChange "
            r2.append(r4)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            pi1.f r1 = new pi1.f
            r1.<init>(r3, r11)
            o40.C61926c.m72668M(r1)
            goto L_0x024b
        L_0x0248:
            int r5 = r5 + 1
            goto L_0x020c
        L_0x024b:
            ii1.e r11 = r10.f171252x1
            if (r11 == 0) goto L_0x0252
            r11.mo85278b1(r0)
        L_0x0252:
            qj1.w3 r11 = r10.f171257z1
            if (r11 == 0) goto L_0x0259
            r11.mo88016c1(r0)
        L_0x0259:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.mo84877L(java.lang.String):void");
    }

    /* renamed from: M */
    public final void mo84878M() {
        String n4 = ((C54991o) mo83051g(C54991o.class)).mo76015n4();
        String str = ((C54963d0) mo83051g(C54963d0.class)).f154070j;
        C54795n5 k = mo83048k();
        if (k != null) {
            k.mo75700D(2, (C49765hx0) null, n4, str, new C60005w(this, str));
        }
    }

    /* renamed from: N */
    public final void mo84879N(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW", z);
        C65762c cVar = this.f166848f;
        if (cVar != null) {
            cVar.statusChange(C58124b.C58125b.START_LIVE, bundle);
        }
    }

    /* renamed from: O */
    public final <T extends C62660c> T mo84880O(C32224a<? extends T> aVar) {
        try {
            return (C62660c) aVar.invoke();
        } catch (Throwable th) {
            Log.m105921e(this.f171222i, "safetyInflate exception", th);
            C62042e eVar = C62042e.f176370a;
            eVar.mo87120u("onSelected exception msg: " + th.getMessage());
            throw null;
        }
    }

    /* renamed from: P */
    public final void mo84881P() {
        Class cls = C54991o.class;
        if (((C54991o) mo83051g(cls)).f154301c3) {
            C65762c cVar = this.f166848f;
            if (cVar != null) {
                String str = ((C54991o) mo83051g(cls)).f154345o;
                String string = this.f166847e.getResources().getString(C0966R.string.e1p);
                C87412m.m108593f(string, "context.resources.getStr…live_pause_mini_game_tip)");
                cVar.showBlurBgWithTimeCount(str, string);
                return;
            }
            return;
        }
        C65762c cVar2 = this.f166848f;
        if (cVar2 != null) {
            String str2 = ((C54991o) mo83051g(cls)).f154345o;
            String str3 = ((C54991o) mo83051g(cls)).f154297b3;
            if (str3 == null) {
                str3 = this.f166847e.getResources().getString(C0966R.string.dfi);
                C87412m.m108593f(str3, "context.resources.getStr…er_live_anchor_exception)");
            }
            cVar2.showBlurBgWithTimeCount(str2, str3);
        }
    }

    /* renamed from: Q */
    public final void mo84882Q(String str) {
        C87412m.m108594g(str, "realNameUrl");
        C65762c cVar = this.f166848f;
        if (cVar != null) {
            new C12767z5(new FinderLiveCommentPostRealNamePanel(this.f166847e), cVar).mo12316Z0(str, new C60008y(this));
        }
    }

    /* renamed from: R */
    public final void mo84883R() {
        T t;
        Class cls = C54963d0.class;
        List<C54130j> list = ((C54963d0) mo83051g(cls)).f154074q;
        C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Util.isEqual(((C54130j) t).f151997a, ((C54991o) mo83051g(C54991o.class)).mo76015n4())) {
                break;
            }
        }
        C54130j jVar = (C54130j) t;
        String str = this.f171222i;
        Log.m105924i(str, "startLiveVideo,float mode:" + mo84872G() + ", normal mode:" + mo84873H() + ", selfMicUser:" + jVar + " liveData.business(LiveCommonSlice::class.java).audienceLinkMicUserList:" + ((C54963d0) mo83051g(cls)).f154074q);
        if (mo84873H() && jVar != null && jVar.f152001e == 2) {
            C62983sh shVar = this.f171229n;
            if (shVar != null) {
                shVar.mo87922c1();
            }
            C62983sh shVar2 = this.f171229n;
            if (shVar2 != null) {
                shVar2.f178711r.mo76420c();
            }
        }
    }

    /* renamed from: S */
    public final void mo84884S() {
        if (!((C54991o) mo83051g(C54991o.class)).mo75997d4()) {
            this.f171201X1.stopTimer();
            this.f171201X1.startTimer(1000);
            C62632a6 a6Var = this.f171246v;
            if (a6Var != null) {
                a6Var.f177863N = 1;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r3 = r3.getIntent();
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84885T() {
        /*
            r12 = this;
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            vk1.c r2 = r12.f166848f
            if (r2 == 0) goto L_0x025d
            androidx.appcompat.app.AppCompatActivity r3 = r12.f166847e
            boolean r4 = r3 instanceof android.app.Activity
            r5 = 0
            if (r4 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r3 = r5
        L_0x0011:
            r4 = 0
            if (r3 == 0) goto L_0x0021
            android.content.Intent r3 = r3.getIntent()
            if (r3 == 0) goto L_0x0021
            java.lang.String r6 = "KEY_PARAMS_FROM_SPLIT_SCREEN"
            boolean r3 = r3.getBooleanExtra(r6, r4)
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            java.lang.String r6 = r12.f171222i
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "stopLiveVideo,float mode:"
            r7.append(r8)
            boolean r8 = r12.mo84872G()
            r7.append(r8)
            java.lang.String r8 = ", normal mode:"
            r7.append(r8)
            boolean r8 = r12.mo84873H()
            r7.append(r8)
            java.lang.String r8 = ",manual closed:"
            r7.append(r8)
            boolean r8 = r2.isManualClosed()
            r7.append(r8)
            java.lang.String r8 = ", start:"
            r7.append(r8)
            boolean r8 = r2.isLiveStarted()
            r7.append(r8)
            java.lang.String r8 = ",finish:"
            r7.append(r8)
            boolean r8 = r2.isLiveFinished()
            r7.append(r8)
            java.lang.String r8 = ", needMiniWindow:"
            r7.append(r8)
            androidx.lifecycle.i0 r8 = r12.mo83051g(r1)
            cl1.o r8 = (cl1.C54991o) r8
            boolean r8 = r8.f154350p0
            r7.append(r8)
            java.lang.String r8 = " isFromSplitScreen: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = " isUseByFluentDirector: "
            r7.append(r8)
            boolean r8 = r12.f171204Y1
            r7.append(r8)
            java.lang.String r8 = " isBackGroundClose: "
            r7.append(r8)
            di3.d r8 = di3.C86312j.m106911c(r0)
            aw.d r8 = (p447aw.C103918d) r8
            androidx.appcompat.app.AppCompatActivity r9 = r12.f166847e
            boolean r8 = r8.mo125772Jn(r9)
            r9 = 1
            if (r8 != 0) goto L_0x00a4
            com.tencent.mm.app.AppForegroundDelegate r8 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            boolean r8 = r8.f343454n
            if (r8 != 0) goto L_0x00a4
            r8 = 1
            goto L_0x00a5
        L_0x00a4:
            r8 = 0
        L_0x00a5:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            boolean r6 = r2.isManualClosed()
            if (r6 != 0) goto L_0x0234
            boolean r6 = r12.f171204Y1
            if (r6 != 0) goto L_0x0234
            boolean r6 = r2.isLiveStarted()
            if (r6 == 0) goto L_0x0234
            boolean r6 = r2.isLiveFinished()
            if (r6 != 0) goto L_0x0234
            boolean r6 = r12.mo84873H()
            if (r6 == 0) goto L_0x0205
            boolean r2 = r2.needMiniWindow()
            if (r2 == 0) goto L_0x0205
            androidx.lifecycle.i0 r1 = r12.mo83051g(r1)
            cl1.o r1 = (cl1.C54991o) r1
            int r1 = r1.f154291a1
            r2 = 2048(0x800, float:2.87E-42)
            boolean r1 = o40.C61926c.m72696u(r1, r2)
            if (r1 != 0) goto L_0x0205
            if (r3 != 0) goto L_0x0205
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            boolean r1 = r1.mo77644r()
            if (r1 != 0) goto L_0x0205
            java.lang.Class<ht1.t3> r1 = ht1.C60204t3.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            aw.d r0 = (p447aw.C103918d) r0
            androidx.appcompat.app.AppCompatActivity r2 = r12.f166847e
            r3 = 21
            boolean r0 = r0.mo125776TW(r2, r3)
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = r12.f171222i
            java.lang.String r2 = "showVideoTalking, permission denied"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            vk1.c r0 = r12.f166848f
            if (r0 != 0) goto L_0x010a
            goto L_0x010d
        L_0x010a:
            r0.setMiniWinPermission(r9)
        L_0x010d:
            vk1.c r0 = r12.f166848f
            if (r0 == 0) goto L_0x0117
            d60.b$b r2 = d60.C58124b.C58125b.MINI_WINDOW_PERMISSION
            r3 = 2
            d60.C58124b.C7172a.m7372a(r0, r2, r5, r3, r5)
        L_0x0117:
            ph1.i r0 = ph1.C62293i.f177081a
            r0.mo87358c()
            java.lang.ref.WeakReference r0 = com.tencent.p014mm.app.AppForegroundDelegate.m161224g()
            if (r0 == 0) goto L_0x012a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto L_0x013a
        L_0x012a:
            com.tencent.mm.app.AppForegroundDelegate r0 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            java.lang.ref.WeakReference r0 = r0.mo174212f()
            if (r0 == 0) goto L_0x0139
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x013a
        L_0x0139:
            r0 = r5
        L_0x013a:
            if (r0 == 0) goto L_0x01df
            boolean r2 = r0.isFinishing()
            if (r2 == 0) goto L_0x01b8
            di3.d r2 = di3.C86312j.m106911c(r1)
            ht1.t3 r2 = (ht1.C60204t3) r2
            boolean r2 = r2.iu0(r0)
            if (r2 == 0) goto L_0x01b8
            di3.d r2 = di3.C86312j.m106911c(r1)
            ht1.t3 r2 = (ht1.C60204t3) r2
            java.util.Set r2 = r2.mo78750c5()
            java.util.Iterator r2 = r2.iterator()
            r3 = r5
        L_0x015d:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0183
            java.lang.Object r6 = r2.next()
            r7 = r6
            android.app.Activity r7 = (android.app.Activity) r7
            di3.d r8 = di3.C86312j.m106911c(r1)
            ht1.t3 r8 = (ht1.C60204t3) r8
            boolean r8 = r8.iu0(r7)
            if (r8 == 0) goto L_0x017e
            boolean r7 = gy3.C87412m.m108589b(r7, r0)
            if (r7 != 0) goto L_0x017e
            r7 = 1
            goto L_0x017f
        L_0x017e:
            r7 = 0
        L_0x017f:
            if (r7 == 0) goto L_0x015d
            r3 = r6
            goto L_0x015d
        L_0x0183:
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r1 = r12.f171222i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "ShowWarningAlert lastFinderActivity:"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r4 = ", topActivity:"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            if (r3 != 0) goto L_0x01a6
            goto L_0x01a7
        L_0x01a6:
            r0 = r3
        L_0x01a7:
            a14.s1 r6 = a14.C0001s1.f0d
            a14.h0 r7 = a14.C53872d1.f151118b
            r8 = 0
            hl1.r r9 = new hl1.r
            r9.<init>(r0, r12, r5)
            r10 = 2
            r11 = 0
            a14.C53895h.m60466d(r6, r7, r8, r9, r10, r11)
            goto L_0x025d
        L_0x01b8:
            java.lang.String r1 = r12.f171222i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ShowWarningAlert topActivity:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            a14.s1 r6 = a14.C0001s1.f0d
            a14.h0 r7 = a14.C53872d1.f151118b
            r8 = 0
            hl1.r r9 = new hl1.r
            r9.<init>(r0, r12, r5)
            r10 = 2
            r11 = 0
            a14.C53895h.m60466d(r6, r7, r8, r9, r10, r11)
            goto L_0x025d
        L_0x01df:
            java.lang.String r0 = r12.f171222i
            java.lang.String r1 = "ShowWarningAlert without topActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            vk1.c r0 = r12.f166848f
            if (r0 != 0) goto L_0x01eb
            goto L_0x01ee
        L_0x01eb:
            r0.setMiniWinPermission(r4)
        L_0x01ee:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            vk1.c r1 = r12.f166848f
            if (r1 == 0) goto L_0x025d
            d60.b$b r2 = d60.C58124b.C58125b.MINI_WINDOW_CANCEL
            r1.statusChange(r2, r0)
            goto L_0x025d
        L_0x01fd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r12.mo84887b(r4, r0)
            goto L_0x025d
        L_0x0205:
            di3.d r0 = di3.C86312j.m106911c(r0)
            aw.d r0 = (p447aw.C103918d) r0
            androidx.appcompat.app.AppCompatActivity r1 = r12.f166847e
            boolean r0 = r0.mo125772Jn(r1)
            if (r0 != 0) goto L_0x021a
            com.tencent.mm.app.AppForegroundDelegate r0 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            boolean r0 = r0.f343454n
            if (r0 != 0) goto L_0x021a
            goto L_0x021b
        L_0x021a:
            r9 = 0
        L_0x021b:
            if (r9 == 0) goto L_0x025d
            vk1.c r0 = r12.f166848f
            if (r0 != 0) goto L_0x0222
            goto L_0x0225
        L_0x0222:
            r0.setMiniWinPermission(r4)
        L_0x0225:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            vk1.c r1 = r12.f166848f
            if (r1 == 0) goto L_0x025d
            d60.b$b r2 = d60.C58124b.C58125b.MINI_WINDOW_CANCEL
            r1.statusChange(r2, r0)
            goto L_0x025d
        L_0x0234:
            boolean r0 = r12.mo84873H()
            if (r0 == 0) goto L_0x025d
            androidx.lifecycle.i0 r0 = r12.mo83051g(r1)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.mo75996d3()
            if (r0 == 0) goto L_0x0254
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            androidx.lifecycle.i0 r0 = r12.mo83051g(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            boolean r0 = r0.mo75914V3()
            if (r0 == 0) goto L_0x025d
        L_0x0254:
            p50.e r0 = r12.mo84868C()
            if (r0 == 0) goto L_0x025d
            r0.mo87271L0()
        L_0x025d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.mo84885T():void");
    }

    /* renamed from: a */
    public void mo84886a(boolean z) {
        if (((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(this.f166847e, 21)) {
            this.f171204Y1 = z;
        }
    }

    /* renamed from: b */
    public void mo84887b(boolean z, Integer num) {
        int i;
        Class cls = C54116w.class;
        Bundle bundle = new Bundle();
        C65762c cVar = this.f166848f;
        boolean z2 = false;
        bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", cVar != null ? cVar.needRemoveActivity() : false);
        bundle.putBoolean("PARAM_FINDER_LIVE_FLUENT_EXIT", z);
        if (num != null) {
            i = num.intValue();
        } else {
            C65762c cVar2 = this.f166848f;
            i = cVar2 != null && cVar2.isSwipeBack() ? 1 : 3;
        }
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", i);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
        C65762c cVar3 = this.f166848f;
        if (cVar3 != null) {
            cVar3.setMiniWinPermission(false);
        }
        C65762c cVar4 = this.f166848f;
        if (cVar4 != null && cVar4.isSwipeBack()) {
            z2 = true;
        }
        C54067f0.C54084t tVar = z2 ? C54067f0.C54084t.LIVE_FLOAT_ACTION_MINIMIZE_INTERACTIVE : ((C54116w) C86312j.m106911c(cls)).f151960x0 ? C54067f0.C54084t.VISITOR_CLICK_ENTER_LOTTERY_RECORD : C54067f0.C54084t.LIVE_FLOAT_ACTION_MINIMIZE_FOR_BG;
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("finder_live_to_mini_window_event", (Object) null, f171146g2.mo84902a(), 25561);
        ((C54116w) C86312j.m106911c(cls)).Zx0(true, tVar);
        C65762c cVar5 = this.f166848f;
        if (cVar5 != null) {
            cVar5.statusChange(C58124b.C58125b.MINI_WINDOW, bundle);
        }
    }

    /* renamed from: c */
    public C63367f mo84888c() {
        C62197e liveCore;
        C65762c cVar = this.f166848f;
        if (cVar == null || (liveCore = cVar.getLiveCore()) == null) {
            return null;
        }
        return liveCore.f173028o;
    }

    public void callback(int i, Bundle bundle) {
        mo84875J(i, bundle);
    }

    /* renamed from: d */
    public boolean mo84889d() {
        C62197e C = mo84868C();
        if (C != null) {
            return C.mo87269I0();
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo84890e() {
        C65762c cVar = this.f166848f;
        if (cVar == null) {
            return false;
        }
        boolean u = C61926c.m72696u(((C54991o) mo83051g(C54991o.class)).f154291a1, 2048);
        String str = this.f171222i;
        Log.m105924i(str, "preOpenMiniWindow, isManualClosed: " + cVar.isManualClosed() + " isLiveStarted: " + cVar.isLiveStarted() + " isLiveFinished: " + cVar.isLiveFinished() + " isNormalMode: " + mo84873H() + " needMiniWindow: " + cVar.needMiniWindow() + " windowPermission: " + ((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(this.f166847e, 21) + " opMiniWindowPermission: " + u);
        return !cVar.isManualClosed() && cVar.isLiveStarted() && !cVar.isLiveFinished() && mo84873H() && cVar.needMiniWindow() && !u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = (r0 = r0.getLiveCore()).mo85236P(r2.f166847e);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Point mo84891f() {
        /*
            r2 = this;
            vk1.c r0 = r2.f166848f
            if (r0 == 0) goto L_0x0012
            p50.e r0 = r0.getLiveCore()
            if (r0 == 0) goto L_0x0012
            androidx.appcompat.app.AppCompatActivity r1 = r2.f166847e
            android.graphics.Point r0 = r0.mo85236P(r1)
            if (r0 != 0) goto L_0x0017
        L_0x0012:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.mo84891f():android.graphics.Point");
    }

    public C58115i getLiveStatus() {
        C62197e C = mo84868C();
        if (C != null) {
            return C.f172989A;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        if ((r7 == null || r7.length() == 0) != false) goto L_0x006d;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo83049l(vk1.C65762c r28, te3.C49712hj1 r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            java.lang.Class<kq.h> r3 = p185kq.C10383h.class
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            java.lang.Class<l31.e> r5 = l31.C61212e.class
            java.lang.String r6 = "baseRouter"
            gy3.C87412m.m108594g(r1, r6)
            super.mo83049l(r28, r29)
            qt1.c r6 = nk1.C61794r.f175689a
            qt1.c r6 = nk1.C61794r.f175689a
            java.lang.String r7 = "onBindData start"
            r6.mo12481a(r7)
            java.lang.String r7 = r0.f171222i
            java.lang.String r8 = "onBindData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            hl1.k$r r7 = new hl1.k$r
            r7.<init>(r0, r1, r2)
            r1.setExternalCallback(r7)
            boolean r7 = r28.getAudienPreloadCDNLiveConfig()
            r10 = 1
            if (r7 == 0) goto L_0x00ad
            fe1.d$b r7 = fe1.C58961d.f168673a
            androidx.lifecycle.i0 r11 = r0.mo83051g(r4)
            cl1.o r11 = (cl1.C54991o) r11
            java.lang.String r11 = r11.f154345o
            fe1.q r7 = r7.mo84155b(r11)
            if (r7 == 0) goto L_0x0048
            java.lang.String r11 = r7.getAvatarUrl()
            goto L_0x0049
        L_0x0048:
            r11 = 0
        L_0x0049:
            if (r11 == 0) goto L_0x0054
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r11 = 0
            goto L_0x0055
        L_0x0054:
            r11 = 1
        L_0x0055:
            if (r11 != 0) goto L_0x006d
            if (r7 == 0) goto L_0x005e
            java.lang.String r7 = r7.getNickname()
            goto L_0x005f
        L_0x005e:
            r7 = 0
        L_0x005f:
            if (r7 == 0) goto L_0x006a
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r7 = 0
            goto L_0x006b
        L_0x006a:
            r7 = 1
        L_0x006b:
            if (r7 == 0) goto L_0x00ad
        L_0x006d:
            java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            java.lang.String r11 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r7, r11)
            r12 = r7
            ht1.t1 r12 = (ht1.C60200t1) r12
            androidx.lifecycle.i0 r4 = r0.mo83051g(r4)
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.String r4 = r4.f154345o
            if (r4 != 0) goto L_0x0087
            java.lang.String r4 = ""
        L_0x0087:
            r13 = r4
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 1
            r23 = 0
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            androidx.lifecycle.i0 r4 = r0.mo83051g(r4)
            cl1.u r4 = (cl1.C55001u) r4
            long r8 = r4.f154416j
            java.lang.Long r24 = java.lang.Long.valueOf(r8)
            r25 = 360(0x168, float:5.04E-43)
            r26 = 0
            ht1.C60200t1.C60201a.m70363a(r12, r13, r14, r16, r17, r18, r19, r20, r22, r23, r24, r25, r26)
        L_0x00ad:
            java.lang.String r4 = "initStaticPlugins start"
            r6.mo12481a(r4)
            vk1.c r4 = r0.f166848f
            r8 = 4
            r9 = 2
            if (r4 == 0) goto L_0x034c
            java.lang.String r12 = r0.f171222i
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "initStaticPlugins thisCode: "
            r13.append(r14)
            int r14 = r27.hashCode()
            r13.append(r14)
            java.lang.String r14 = " isLandscape: "
            r13.append(r14)
            boolean r14 = r4.isLandscape()
            r13.append(r14)
            java.lang.String r14 = " context: "
            r13.append(r14)
            androidx.appcompat.app.AppCompatActivity r14 = r0.f166847e
            r13.append(r14)
            java.lang.String r14 = " basePlugin: "
            r13.append(r14)
            r13.append(r4)
            java.lang.String r14 = " hashCode: "
            r13.append(r14)
            androidx.appcompat.app.AppCompatActivity r14 = r0.f166847e
            android.content.res.Resources r14 = r14.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            int r14 = r14.hashCode()
            r13.append(r14)
            java.lang.String r14 = " configuration: "
            r13.append(r14)
            androidx.appcompat.app.AppCompatActivity r14 = r0.f166847e
            android.content.res.Resources r14 = r14.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            r13.append(r14)
            java.lang.String r14 = " contextLandScape: "
            r13.append(r14)
            androidx.appcompat.app.AppCompatActivity r14 = r0.f166847e
            android.content.res.Resources r14 = r14.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            int r14 = r14.orientation
            if (r14 != r9) goto L_0x0126
            r14 = 1
            goto L_0x0127
        L_0x0126:
            r14 = 0
        L_0x0127:
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            hl1.x0 r12 = new hl1.x0
            r12.<init>(r0, r4)
            qj1.c r12 = r0.mo84880O(r12)
            qj1.ze r12 = (qj1.C63170ze) r12
            r0.f171224j = r12
            hl1.y0 r12 = new hl1.y0
            r12.<init>(r0, r4)
            qj1.c r12 = r0.mo84880O(r12)
            qj1.kb r12 = (qj1.C62843kb) r12
            r0.f171238r = r12
            hl1.z0 r12 = new hl1.z0
            r12.<init>(r0, r4)
            qj1.c r12 = r0.mo84880O(r12)
            qj1.fb r12 = (qj1.C62772fb) r12
            r0.f171236q = r12
            hl1.a1 r12 = new hl1.a1
            r12.<init>(r4)
            qj1.c r12 = r0.mo84880O(r12)
            qj1.sh r12 = (qj1.C62983sh) r12
            r0.f171229n = r12
            r13 = 8
            if (r12 == 0) goto L_0x016c
            r12.mo10792g(r13)
        L_0x016c:
            qj1.o r12 = r0.f171231o
            if (r12 != 0) goto L_0x017d
            hl1.b1 r12 = new hl1.b1
            r12.<init>(r4)
            qj1.c r12 = r0.mo84880O(r12)
            qj1.o r12 = (qj1.C62898o) r12
            r0.f171231o = r12
        L_0x017d:
            qj1.je r12 = r0.f171242t
            if (r12 != 0) goto L_0x0193
            hl1.c1 r12 = new hl1.c1
            r12.<init>(r4)
            qj1.c r12 = r0.mo84880O(r12)
            qj1.je r12 = (qj1.C62833je) r12
            r0.f171242t = r12
            if (r12 == 0) goto L_0x0193
            r12.mo10792g(r13)
        L_0x0193:
            qj1.ff r12 = r0.f171244u
            if (r12 != 0) goto L_0x01a9
            hl1.d1 r12 = new hl1.d1
            r12.<init>(r4, r0)
            qj1.c r12 = r0.mo84880O(r12)
            qj1.ff r12 = (qj1.C12399ff) r12
            r0.f171244u = r12
            if (r12 == 0) goto L_0x01a9
            r12.mo10792g(r8)
        L_0x01a9:
            qj1.og r12 = r0.f171151C
            if (r12 != 0) goto L_0x01bf
            hl1.e1 r12 = new hl1.e1
            r12.<init>(r4)
            qj1.c r12 = r0.mo84880O(r12)
            qj1.og r12 = (qj1.C62917og) r12
            r0.f171151C = r12
            if (r12 == 0) goto L_0x01bf
            r12.mo10792g(r13)
        L_0x01bf:
            qj1.sf r12 = r0.f171179Q0
            if (r12 != 0) goto L_0x01de
            r12 = 2131304364(0x7f091fac, float:1.8226869E38)
            android.view.View r12 = r0.mo83046i(r12, r4)
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            hl1.f1 r14 = new hl1.f1
            r14.<init>(r12, r4)
            qj1.c r12 = r0.mo84880O(r14)
            qj1.sf r12 = (qj1.C62979sf) r12
            r0.f171179Q0 = r12
            if (r12 == 0) goto L_0x01de
            r12.mo10792g(r13)
        L_0x01de:
            qj1.oh r12 = r0.f171153D
            if (r12 != 0) goto L_0x01f4
            hl1.n0 r12 = new hl1.n0
            r12.<init>(r4)
            qj1.c r12 = r0.mo84880O(r12)
            qj1.oh r12 = (qj1.C12583oh) r12
            r0.f171153D = r12
            if (r12 == 0) goto L_0x01f4
            r12.mo10792g(r13)
        L_0x01f4:
            qj1.f1 r12 = r0.f171165J
            if (r12 != 0) goto L_0x020a
            hl1.o0 r12 = new hl1.o0
            r12.<init>(r4)
            qj1.c r12 = r0.mo84880O(r12)
            qj1.f1 r12 = (qj1.C12377f1) r12
            r0.f171165J = r12
            if (r12 == 0) goto L_0x020a
            r12.mo10792g(r13)
        L_0x020a:
            qj1.k1 r12 = r0.f171167K
            if (r12 != 0) goto L_0x0220
            hl1.p0 r12 = new hl1.p0
            r12.<init>(r4)
            qj1.c r12 = r0.mo84880O(r12)
            qj1.k1 r12 = (qj1.C12482k1) r12
            r0.f171167K = r12
            if (r12 == 0) goto L_0x0220
            r12.mo10792g(r13)
        L_0x0220:
            qj1.e5 r12 = r0.f171250x
            if (r12 != 0) goto L_0x023b
            hl1.q0 r12 = new hl1.q0
            r12.<init>(r0, r4)
            qj1.c r12 = r0.mo84880O(r12)
            qj1.e5 r12 = (qj1.C12322e5) r12
            r0.f171250x = r12
            r14 = 2131303836(0x7f091d9c, float:1.8225798E38)
            r0.f171253y = r14
            if (r12 == 0) goto L_0x023b
            r12.mo10792g(r13)
        L_0x023b:
            lg1.h r12 = r0.f171209a2
            if (r12 != 0) goto L_0x02af
            r12 = 2131304367(0x7f091faf, float:1.8226875E38)
            android.view.View r12 = r4.findViewById(r12)
            android.view.ViewStub r12 = (android.view.ViewStub) r12
            if (r12 == 0) goto L_0x02af
            hl1.r0 r14 = new hl1.r0
            r14.<init>(r0, r12, r4)
            qj1.c r12 = r0.mo84880O(r14)
            lg1.h r12 = (lg1.C46854h) r12
            r0.f171209a2 = r12
            if (r12 == 0) goto L_0x02a8
            qj1.e5 r14 = r0.f171250x
            r12.f126033u = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "bindCommentPlugin isBoxLive: "
            r14.append(r15)
            fj1.b r12 = r12.mo87684A0()
            java.lang.String r15 = "<this>"
            gy3.C87412m.m108594g(r12, r15)
            up1.f r12 = up1.C37521f.f99374d
            r12.getClass()
            pe1.c<java.lang.Integer> r12 = up1.C37521f.f99245O1
            java.lang.Object r12 = r12.mo60266n()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            if (r12 != r10) goto L_0x0285
            r12 = 1
            goto L_0x0286
        L_0x0285:
            r12 = 0
        L_0x0286:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r7 = "local enable:"
            r15.append(r7)
            r15.append(r12)
            java.lang.String r7 = r15.toString()
            java.lang.String r15 = "Finder.BoxCommon"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r7)
            r14.append(r12)
            java.lang.String r7 = r14.toString()
            java.lang.String r12 = "FinderLiveViewPagerComm"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
        L_0x02a8:
            lg1.h r7 = r0.f171209a2
            if (r7 == 0) goto L_0x02af
            r7.mo10792g(r13)
        L_0x02af:
            qj1.w3 r7 = r0.f171257z1
            if (r7 != 0) goto L_0x02c5
            hl1.s0 r7 = new hl1.s0
            r7.<init>(r0, r4)
            qj1.c r7 = r0.mo84880O(r7)
            qj1.w3 r7 = (qj1.C63081w3) r7
            r0.f171257z1 = r7
            if (r7 == 0) goto L_0x02c5
            r7.mo10792g(r8)
        L_0x02c5:
            hl1.t0 r7 = new hl1.t0
            r7.<init>(r0, r4)
            qj1.c r7 = r0.mo84880O(r7)
            qj1.t4 r7 = (qj1.C12669t4) r7
            r0.f171170L1 = r7
            if (r7 == 0) goto L_0x02d7
            r7.mo10792g(r13)
        L_0x02d7:
            hl1.u0 r7 = new hl1.u0
            r7.<init>(r0, r4)
            qj1.c r7 = r0.mo84880O(r7)
            qj1.tg r7 = (qj1.C12677tg) r7
            r0.f171162H1 = r7
            qj1.f6 r7 = r0.f171174N1
            if (r7 != 0) goto L_0x033f
            hl1.v0 r7 = new hl1.v0
            r7.<init>(r0, r4)
            qj1.c r7 = r0.mo84880O(r7)
            qj1.f6 r7 = (qj1.C12382f6) r7
            r0.f171174N1 = r7
            if (r7 == 0) goto L_0x033f
            android.view.View r12 = r7.f35644q
            qj1.g6 r13 = new qj1.g6
            r13.<init>(r7)
            r12.setOnClickListener(r13)
            java.lang.Class<cl1.t> r12 = cl1.C0689t.class
            androidx.lifecycle.i0 r12 = r7.mo87696x0(r12)
            cl1.t r12 = (cl1.C0689t) r12
            boolean r12 = r12.f1625g
            if (r12 == 0) goto L_0x0310
            r7.mo12066a1()
        L_0x0310:
            boolean r12 = r7.mo82893g0()
            if (r12 == 0) goto L_0x0321
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r13 = 1118044160(0x42a40000, float:82.0)
            int r12 = zp3.C79406f.m96347a(r12, r13)
            goto L_0x032b
        L_0x0321:
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r13 = 1120665600(0x42cc0000, float:102.0)
            int r12 = zp3.C79406f.m96347a(r12, r13)
        L_0x032b:
            android.view.ViewGroup r13 = r7.f166287d
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            java.lang.String r14 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r13, r14)
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            r13.bottomMargin = r12
            android.view.ViewGroup r7 = r7.f166287d
            r7.setLayoutParams(r13)
        L_0x033f:
            hl1.w0 r7 = new hl1.w0
            r7.<init>(r0, r4)
            qj1.c r4 = r0.mo84880O(r7)
            qj1.m6 r4 = (qj1.C62880m6) r4
            r0.f171175O1 = r4
        L_0x034c:
            java.lang.String r4 = "initStaticPlugins end"
            r6.mo11310b(r4)
            di3.d r4 = di3.C86312j.m106911c(r5)
            l31.e r4 = (l31.C61212e) r4
            androidx.appcompat.app.AppCompatActivity r7 = r0.f166847e
            r4.mo86131CH(r7)
            di3.d r4 = di3.C86312j.m106911c(r5)
            l31.e r4 = (l31.C61212e) r4
            androidx.appcompat.app.AppCompatActivity r7 = r0.f166847e
            rx3.l[] r8 = new rx3.C13604l[r8]
            java.lang.Class<kq.g> r12 = p185kq.C61130g.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            kq.g r12 = (p185kq.C61130g) r12
            java.lang.String r12 = r12.mo33244gK()
            rx3.l r13 = new rx3.l
            java.lang.String r14 = "comment_scene"
            r13.<init>(r14, r12)
            r11 = 0
            r8[r11] = r13
            if (r2 == 0) goto L_0x0381
            java.lang.String r2 = r2.f134670d
            goto L_0x0382
        L_0x0381:
            r2 = 0
        L_0x0382:
            rx3.l r11 = new rx3.l
            java.lang.String r12 = "behaviour_session_id"
            r11.<init>(r12, r2)
            r8[r10] = r11
            di3.d r2 = di3.C86312j.m106911c(r3)
            kq.h r2 = (p185kq.C10383h) r2
            java.lang.String r2 = r2.mo10696E()
            rx3.l r10 = new rx3.l
            java.lang.String r11 = "finder_context_id"
            r10.<init>(r11, r2)
            r8[r9] = r10
            r2 = 3
            di3.d r3 = di3.C86312j.m106911c(r3)
            kq.h r3 = (p185kq.C10383h) r3
            java.lang.String r3 = r3.mo10698S0()
            rx3.l r9 = new rx3.l
            java.lang.String r10 = "finder_tab_context_id"
            r9.<init>(r10, r3)
            r8[r2] = r9
            java.util.Map r2 = sx3.C90364q0.m113147f(r8)
            r4.Yt0(r7, r2)
            di3.d r2 = di3.C86312j.m106911c(r5)
            l31.e r2 = (l31.C61212e) r2
            java.lang.String r3 = "finder_live_item_view"
            r2.o30(r1, r3)
            di3.d r2 = di3.C86312j.m106911c(r5)
            l31.e r2 = (l31.C61212e) r2
            q31.a r3 = r0.f171219f2
            r2.E60(r1, r3)
            java.lang.String r1 = "onBindData end"
            r6.mo11310b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.mo83049l(vk1.c, te3.hj1):void");
    }

    /* renamed from: p */
    public final void mo84893p(Bundle bundle) {
        C46854h hVar = this.f171209a2;
        if (hVar != null) {
            C61926c.m72668M(new C59992d(bundle, this, hVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0227  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84894r(android.view.View r23, rx3.C13604l<java.lang.Integer, java.lang.Integer> r24, boolean r25) {
        /*
            r22 = this;
            r6 = r22
            r15 = r23
            r5 = r24
            r3 = r25
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r6.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154338m1
            androidx.lifecycle.i0 r1 = r6.mo83051g(r4)
            cl1.o r1 = (cl1.C54991o) r1
            int r1 = r1.f154335l1
            r14 = 0
            if (r0 == 0) goto L_0x031e
            if (r1 != 0) goto L_0x0021
            goto L_0x031e
        L_0x0021:
            java.lang.Class<cl1.d> r7 = cl1.C54951d.class
            androidx.lifecycle.i0 r7 = r6.mo83051g(r7)
            cl1.d r7 = (cl1.C54951d) r7
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<cl1.d$a> r7 = r7.f154007o
            java.lang.Object r7 = r7.getValue()
            cl1.d$a r7 = (cl1.C54951d.C54952a) r7
            cl1.d$a r8 = cl1.C54951d.C54952a.STARTUP_VIDEO_PLAYING
            r13 = 1
            if (r7 != r8) goto L_0x0038
            r7 = 1
            goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            if (r15 != 0) goto L_0x003d
            r3 = 0
            goto L_0x008d
        L_0x003d:
            if (r7 == 0) goto L_0x0041
            r7 = 0
            goto L_0x0043
        L_0x0041:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x0043:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r12.mo10233c(r7)
            java.lang.Object[] r8 = r12.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC"
            java.lang.String r10 = "adjustLayoutCDN"
            java.lang.String r11 = "(Landroid/view/View;Lkotlin/Pair;Z)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setAlpha"
            java.lang.String r18 = "(F)V"
            r7 = r23
            r2 = r12
            r12 = r16
            r3 = 1
            r13 = r17
            r3 = 0
            r14 = r18
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r15.setAlpha(r2)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC"
            java.lang.String r9 = "adjustLayoutCDN"
            java.lang.String r10 = "(Landroid/view/View;Lkotlin/Pair;Z)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setAlpha"
            java.lang.String r13 = "(F)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x008d:
            if (r15 == 0) goto L_0x0094
            android.view.ViewGroup$LayoutParams r2 = r23.getLayoutParams()
            goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            boolean r8 = r2 instanceof android.widget.RelativeLayout.LayoutParams
            if (r8 == 0) goto L_0x009d
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            r8 = r2
            goto L_0x009e
        L_0x009d:
            r8 = 0
        L_0x009e:
            vk1.c r2 = r6.f166848f
            if (r2 == 0) goto L_0x00ad
            android.widget.RelativeLayout r2 = r2.getPreviewRoot()
            if (r2 == 0) goto L_0x00ad
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            goto L_0x00ae
        L_0x00ad:
            r2 = 0
        L_0x00ae:
            boolean r9 = r2 instanceof android.widget.RelativeLayout.LayoutParams
            if (r9 == 0) goto L_0x00b6
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            r9 = r2
            goto L_0x00b7
        L_0x00b6:
            r9 = 0
        L_0x00b7:
            if (r8 == 0) goto L_0x0316
            if (r9 != 0) goto L_0x00bd
            goto L_0x0316
        L_0x00bd:
            gy3.d0 r10 = new gy3.d0
            r10.<init>()
            androidx.appcompat.app.AppCompatActivity r2 = r6.f166847e
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
            int r2 = r2.y
            if (r5 == 0) goto L_0x00d5
            B r11 = r5.f38556e
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            goto L_0x00d6
        L_0x00d5:
            r11 = r2
        L_0x00d6:
            gy3.d0 r12 = new gy3.d0
            r12.<init>()
            if (r5 == 0) goto L_0x00e5
            B r2 = r5.f38556e
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
        L_0x00e5:
            r12.f27483d = r2
            androidx.appcompat.app.AppCompatActivity r2 = r6.f166847e
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r13 = r2.orientation
            androidx.lifecycle.i0 r2 = r6.mo83051g(r4)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r14 = r2.mo75992a4()
            androidx.lifecycle.i0 r2 = r6.mo83051g(r4)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.mo75985T4()
            qj1.sf r7 = r6.f171179Q0
            if (r7 == 0) goto L_0x0118
            androidx.lifecycle.i0 r18 = r6.mo83051g(r4)
            cl1.o r18 = (cl1.C54991o) r18
            boolean r3 = r18.mo75966J4()
            r7.mo87915d1(r3)
        L_0x0118:
            if (r5 != 0) goto L_0x0123
            ok1.e r3 = ok1.C62042e.f176370a
            androidx.appcompat.app.AppCompatActivity r7 = r6.f166847e
            rx3.l r3 = r3.mo87086i0(r7)
            goto L_0x0124
        L_0x0123:
            r3 = r5
        L_0x0124:
            A r7 = r3.f38555d
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            B r3 = r3.f38556e
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            boolean r18 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            r19 = -1
            if (r18 == 0) goto L_0x0169
            androidx.lifecycle.i0 r18 = r6.mo83051g(r4)
            cl1.o r18 = (cl1.C54991o) r18
            boolean r18 = r18.mo76007j4()
            if (r18 != 0) goto L_0x0169
            r5 = 1
            if (r5 != r13) goto L_0x0196
            if (r14 == 0) goto L_0x0154
            ok1.e r3 = ok1.C62042e.f176370a
            int r3 = r3.mo87089j0(r1, r0)
            goto L_0x0155
        L_0x0154:
            r3 = 0
        L_0x0155:
            r10.f27483d = r3
            if (r14 == 0) goto L_0x015d
            int r3 = r0 * r7
            int r3 = r3 / r1
            goto L_0x015e
        L_0x015d:
            r3 = -1
        L_0x015e:
            r12.f27483d = r3
            if (r14 == 0) goto L_0x0167
            int r0 = r0 * r7
            int r0 = r0 / r1
            r11 = r0
            goto L_0x0196
        L_0x0167:
            r11 = -1
            goto L_0x0196
        L_0x0169:
            if (r14 == 0) goto L_0x0196
            androidx.lifecycle.i0 r5 = r6.mo83051g(r4)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.mo76007j4()
            if (r5 != 0) goto L_0x0196
            r5 = 1
            if (r5 != r13) goto L_0x0196
            if (r2 == 0) goto L_0x0196
            androidx.lifecycle.i0 r11 = r6.mo83051g(r4)
            cl1.o r11 = (cl1.C54991o) r11
            boolean r11 = r11.mo75993b4()
            if (r11 == 0) goto L_0x0199
            ok1.e r3 = ok1.C62042e.f176370a
            int r3 = r3.mo87089j0(r1, r0)
            r10.f27483d = r3
            int r0 = r0 * r7
            int r11 = r0 / r1
            r12.f27483d = r11
        L_0x0196:
            r20 = r2
            goto L_0x01dc
        L_0x0199:
            float r11 = (float) r7
            androidx.lifecycle.i0 r16 = r6.mo83051g(r4)
            r5 = r16
            cl1.o r5 = (cl1.C54991o) r5
            int r5 = r5.f154338m1
            float r5 = (float) r5
            androidx.lifecycle.i0 r16 = r6.mo83051g(r4)
            r20 = r2
            r2 = r16
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154335l1
            float r2 = (float) r2
            float r5 = r5 / r2
            float r11 = r11 * r5
            int r2 = (int) r11
            float r3 = (float) r3
            r5 = 1060118724(0x3f3020c4, float:0.68799996)
            float r3 = r3 * r5
            float r5 = (float) r2
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x01ce
            ok1.e r5 = ok1.C62042e.f176370a
            int r0 = r5.mo87089j0(r1, r0)
            r10.f27483d = r0
            r12.f27483d = r2
            r5 = r2
            r11 = r3
            goto L_0x01df
        L_0x01ce:
            r0 = 0
            r10.f27483d = r0
            r12.f27483d = r2
            r0 = 16
            r8.addRule(r0)
            r5 = r2
            r11 = r3
            r2 = -1
            goto L_0x01df
        L_0x01dc:
            r2 = r11
            r5 = 0
            r11 = 0
        L_0x01df:
            int r0 = r10.f27483d
            r9.topMargin = r0
            r9.height = r2
            r9.width = r7
            int r0 = r12.f27483d
            r8.height = r0
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x01f4
            android.widget.RelativeLayout r0 = r0.getPreviewRoot()
            goto L_0x01f5
        L_0x01f4:
            r0 = 0
        L_0x01f5:
            if (r0 != 0) goto L_0x01f8
            goto L_0x01fb
        L_0x01f8:
            r0.setLayoutParams(r9)
        L_0x01fb:
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x020a
            android.view.ViewGroup r0 = r0.getCommonTopContentRoot()
            if (r0 == 0) goto L_0x020a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x020b
        L_0x020a:
            r0 = 0
        L_0x020b:
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0212
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L_0x0213
        L_0x0212:
            r0 = 0
        L_0x0213:
            if (r0 == 0) goto L_0x021d
            r0.height = r2
            int r1 = r10.f27483d
            r0.topMargin = r1
            r0.width = r7
        L_0x021d:
            if (r15 != 0) goto L_0x0220
            goto L_0x0223
        L_0x0220:
            r15.setLayoutParams(r8)
        L_0x0223:
            ii1.e r0 = r6.f171252x1
            if (r0 == 0) goto L_0x022a
            android.view.ViewGroup r0 = r0.f166287d
            goto L_0x022b
        L_0x022a:
            r0 = 0
        L_0x022b:
            if (r0 != 0) goto L_0x022e
            goto L_0x0231
        L_0x022e:
            r0.setLayoutParams(r9)
        L_0x0231:
            r3 = r25
            r7 = 1
            if (r3 == 0) goto L_0x0248
            int r0 = r12.f27483d
            int r1 = r10.f27483d
            r6.mo84876K(r15, r3, r0, r1)
        L_0x023d:
            r12 = r24
            r18 = r8
            r19 = r9
            r21 = r20
            r8 = r4
            r9 = r5
            goto L_0x0269
        L_0x0248:
            if (r15 == 0) goto L_0x023d
            hl1.k$e r2 = new hl1.k$e
            r0 = r2
            r1 = r22
            r7 = r2
            r18 = r8
            r21 = r20
            r8 = 0
            r2 = r23
            r3 = r25
            r8 = r4
            r4 = r12
            r12 = r24
            r19 = r9
            r9 = r5
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 100
            r15.postDelayed(r7, r0)
        L_0x0269:
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x0279
            if (r0 == 0) goto L_0x0274
            org.json.JSONObject r1 = r0.getCurrentMicData()
            goto L_0x0275
        L_0x0274:
            r1 = 0
        L_0x0275:
            r2 = 1
            r0.notifySEIMicUserChange(r1, r2, r12)
        L_0x0279:
            qj1.ze r0 = r6.f171224j
            if (r0 == 0) goto L_0x028a
            if (r0 == 0) goto L_0x0284
            com.tencent.rtmp.ui.TXCloudVideoView r7 = r0.mo88092d1()
            goto L_0x0285
        L_0x0284:
            r7 = 0
        L_0x0285:
            java.lang.String r1 = r6.f171222i
            r0.mo87689H0(r7, r1)
        L_0x028a:
            java.lang.String r0 = r6.f171222i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "adjustLayoutCDN fitLandscapeVideo:"
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = ",curOrientation:"
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = ",videoSizeValid:"
            r1.append(r2)
            r2 = r21
            r1.append(r2)
            java.lang.String r2 = ",uiState:"
            r1.append(r2)
            androidx.lifecycle.i0 r2 = r6.mo83051g(r8)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154291a1
            r1.append(r2)
            java.lang.String r2 = ",videoScaleHeight:"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = ",limitHeight:"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = ",landscapePlayerMiniHeight:"
            r1.append(r2)
            r2 = 0
            r1.append(r2)
            java.lang.String r2 = ",parentLp height:"
            r1.append(r2)
            r2 = r19
            int r3 = r2.height
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.append(r3)
            java.lang.String r3 = ",top:"
            r1.append(r3)
            int r2 = r2.topMargin
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.append(r2)
            java.lang.String r2 = ", height:"
            r1.append(r2)
            r2 = r18
            int r4 = r2.height
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.append(r4)
            r1.append(r3)
            int r2 = r2.topMargin
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x0316:
            java.lang.String r0 = r6.f171222i
            java.lang.String r1 = "adjustLayoutCDN invalid view params"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x031e:
            if (r15 != 0) goto L_0x0321
            goto L_0x0364
        L_0x0321:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.mo10233c(r1)
            java.lang.Object[] r8 = r0.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC"
            java.lang.String r10 = "adjustLayoutCDN"
            java.lang.String r11 = "(Landroid/view/View;Lkotlin/Pair;Z)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setAlpha"
            java.lang.String r14 = "(F)V"
            r7 = r23
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r15.setAlpha(r0)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC"
            java.lang.String r9 = "adjustLayoutCDN"
            java.lang.String r10 = "(Landroid/view/View;Lkotlin/Pair;Z)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setAlpha"
            java.lang.String r13 = "(F)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x0364:
            java.lang.String r0 = r6.f171222i
            java.lang.String r1 = "adjustLayoutCDN video size = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.mo84894r(android.view.View, rx3.l, boolean):void");
    }

    /* renamed from: s */
    public final C58113g mo84895s(long j, String str, int i) {
        Class cls;
        LiveConfig liveConfig;
        byte[] bArr;
        C58113g gVar = r2;
        Class cls2 = C55001u.class;
        C58113g gVar2 = new C58113g("", j, 0, (String) null, 0, 0, (C58107a) null, 0, 0, 0, (HashMap) null, 0, 0, (C64890zp2) null, (String) null, 0, 0, 131068, (C8480h) null);
        C58113g gVar3 = gVar;
        boolean z = false;
        String str2 = "";
        gVar3.f166241k.put(0, new C7170j(str, 0, str2));
        gVar3.f166233c = i;
        FinderObject finderObject = ((C54991o) this.f166851d.mo71262a(C54991o.class)).f154341n;
        byte[] bArr2 = null;
        String str3 = finderObject != null ? finderObject.nickname : null;
        if (str3 != null) {
            str2 = str3;
        }
        gVar3.f166245o = str2;
        try {
            C54127h hVar = this.f166849g;
            if (hVar == null || (liveConfig = hVar.f151977d) == null || (bArr = liveConfig.f157055M) == null) {
                cls = cls2;
            } else {
                FinderLiveService.f159376d.getClass();
                if (FinderLiveService.f159359L) {
                    cls = cls2;
                    try {
                        if (((C55001u) mo83051g(cls)).f154419p.f182318j == null) {
                            z = true;
                        }
                    } catch (Exception e) {
                        e = e;
                        C11348f.C11349a.m11178b(C59319a.f169618b, "parseLiveSdkInfoForPreliveErr", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
                        String str4 = this.f171222i;
                        Log.m105920e(str4, "setLiveRoomInfoFromLiveSdkInfo " + e.getMessage());
                        ((C55004v1) mo83051g(C55004v1.class)).mo76047d3(gVar3);
                        ((C55001u) mo83051g(cls)).mo76043n3(new C58114h(new TRTCCloudDef.TRTCParams(), gVar3, new C58110d(this.f166847e.getClass().getName())));
                        return gVar3;
                    }
                } else {
                    cls = cls2;
                }
                if (z) {
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    C64265bq2 bq22 = new C64265bq2();
                    bq22.parseFrom(bArr2);
                    ((C55001u) mo83051g(cls)).f154419p = bq22;
                }
            }
            C89349b bVar = ((C55001u) mo83051g(cls)).f154419p.f182318j;
            if (bVar != null) {
                C47465a parseFrom = new C64293cq2().parseFrom(bVar.f257327a);
                C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LiveSdkParams");
                C64890zp2 zp22 = ((C64293cq2) parseFrom).f182556f;
                int i2 = zp22.f186817q;
                boolean UY = ((C36594q) C86312j.m106911c(C36594q.class)).mo60733UY(5);
                C54766h4 h4Var = C54766h4.f153491a;
                if (C54766h4.f153494d == null) {
                    C54766h4.f153494d = new C64412h61();
                }
                C64412h61 h612 = C54766h4.f153494d;
                if (h612 != null) {
                    h612.f183407d = 1;
                }
                if (UY) {
                    C54766h4.f153495e = 1;
                }
                if (!UY) {
                    i2 = zp22.f186818r;
                }
                gVar3.f166240j = ((C60106t) C86312j.m106911c(C60106t.class)).Cx0().mo58845Lo(gVar3.f166232b);
                gVar3.f166239i = zp22.f186818r;
                if (i2 < 100) {
                    gVar3.f166237g = C58107a.MMLiveStreamSwitchMode_Fixed;
                    gVar3.f166238h = i2;
                } else if (i2 == 101) {
                    gVar3.f166237g = C58107a.MMLiveStreamSwitchMode_Auto;
                } else if (i2 == 102) {
                    gVar3.f166237g = C58107a.MMLiveStreamSwitchMode_ML;
                }
                LinkedList<C64733to> linkedList = zp22.f186812j;
                if (linkedList != null) {
                    for (C64733to toVar : linkedList) {
                        HashMap<Integer, C7170j> hashMap = gVar3.f166241k;
                        Integer valueOf = Integer.valueOf(toVar.f185623f);
                        String str5 = toVar.f185622e;
                        C87412m.m108593f(str5, "it.url");
                        hashMap.put(valueOf, new C7170j(str5, toVar.f185627j, toVar.f185628n));
                    }
                }
                gVar3.f166244n = zp22;
                String str6 = this.f171222i;
                Log.m105924i(str6, "setLiveRoomInfoFromLiveSdkInfo cdnSwitchSvrCfg:" + i2 + " p2pSwtich " + gVar3.f166244n.f186783C + " appId " + gVar3.f166244n.f186791K);
            }
        } catch (Exception e2) {
            e = e2;
            cls = cls2;
            C11348f.C11349a.m11178b(C59319a.f169618b, "parseLiveSdkInfoForPreliveErr", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
            String str42 = this.f171222i;
            Log.m105920e(str42, "setLiveRoomInfoFromLiveSdkInfo " + e.getMessage());
            ((C55004v1) mo83051g(C55004v1.class)).mo76047d3(gVar3);
            ((C55001u) mo83051g(cls)).mo76043n3(new C58114h(new TRTCCloudDef.TRTCParams(), gVar3, new C58110d(this.f166847e.getClass().getName())));
            return gVar3;
        }
        ((C55004v1) mo83051g(C55004v1.class)).mo76047d3(gVar3);
        ((C55001u) mo83051g(cls)).mo76043n3(new C58114h(new TRTCCloudDef.TRTCParams(), gVar3, new C58110d(this.f166847e.getClass().getName())));
        return gVar3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r3 = r3.getLiveInfo();
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo84896t(long r7) {
        /*
            r6 = this;
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r6.mo83051g(r0)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            te3.e61 r1 = r1.f182363I
            r2 = 0
            if (r1 != 0) goto L_0x0045
            androidx.lifecycle.i0 r1 = r6.mo83051g(r0)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            androidx.lifecycle.i0 r3 = r6.mo83051g(r0)
            cl1.u r3 = (cl1.C55001u) r3
            te3.po2 r3 = r3.f154413g
            if (r3 == 0) goto L_0x0029
            te3.c21 r3 = r3.f184867e
            if (r3 == 0) goto L_0x0029
            te3.e61 r3 = r3.f182363I
            if (r3 != 0) goto L_0x0043
        L_0x0029:
            vp1.e r3 = vp1.C65834e.f189316a
            androidx.lifecycle.i0 r4 = r6.mo83051g(r0)
            cl1.u r4 = (cl1.C55001u) r4
            long r4 = r4.f154416j
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo89871e(r4)
            if (r3 == 0) goto L_0x0042
            te3.c21 r3 = r3.getLiveInfo()
            if (r3 == 0) goto L_0x0042
            te3.e61 r3 = r3.f182363I
            goto L_0x0043
        L_0x0042:
            r3 = r2
        L_0x0043:
            r1.f182363I = r3
        L_0x0045:
            androidx.lifecycle.i0 r1 = r6.mo83051g(r0)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            te3.ga1 r1 = r1.f182362H
            if (r1 != 0) goto L_0x0088
            androidx.lifecycle.i0 r1 = r6.mo83051g(r0)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            androidx.lifecycle.i0 r3 = r6.mo83051g(r0)
            cl1.u r3 = (cl1.C55001u) r3
            te3.po2 r3 = r3.f154413g
            if (r3 == 0) goto L_0x006e
            te3.c21 r3 = r3.f184867e
            if (r3 == 0) goto L_0x006e
            te3.ga1 r3 = r3.f182362H
            if (r3 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r2 = r3
            goto L_0x0086
        L_0x006e:
            vp1.e r3 = vp1.C65834e.f189316a
            androidx.lifecycle.i0 r4 = r6.mo83051g(r0)
            cl1.u r4 = (cl1.C55001u) r4
            long r4 = r4.f154416j
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo89871e(r4)
            if (r3 == 0) goto L_0x0086
            te3.c21 r3 = r3.getLiveInfo()
            if (r3 == 0) goto L_0x0086
            te3.ga1 r2 = r3.f182362H
        L_0x0086:
            r1.f182362H = r2
        L_0x0088:
            sk1.a r1 = sk1.C63947a.f181274a
            androidx.lifecycle.i0 r0 = r6.mo83051g(r0)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.f171222i
            r2.append(r3)
            java.lang.String r3 = "_canPreloadLive_"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            boolean r7 = r1.mo88733s(r0, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.mo84896t(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r0 = r0.f172989A;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84897u() {
        /*
            r3 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r3.mo83051g(r0)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154354q
            r1 = 256(0x100, float:3.59E-43)
            boolean r0 = o40.C61926c.m72696u(r0, r1)
            if (r0 == 0) goto L_0x0020
            p50.e r1 = r3.mo84868C()
            if (r1 == 0) goto L_0x002d
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x002d
            r1.mo82889k()
            goto L_0x002d
        L_0x0020:
            p50.e r1 = r3.mo84868C()
            if (r1 == 0) goto L_0x002d
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x002d
            r1.mo82890l()
        L_0x002d:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "PARAM_FINDER_LIVE_AUDIO_MODE"
            r1.putBoolean(r2, r0)
            p50.e r0 = r3.mo84868C()
            if (r0 == 0) goto L_0x0044
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.f166264k
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            java.lang.String r2 = "PARAM_FINDER_LIVE_IS_SHARE_MODE"
            r1.putBoolean(r2, r0)
            vk1.c r0 = r3.f166848f
            if (r0 == 0) goto L_0x0053
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_MODE_SWITCH
            r0.statusChange(r2, r1)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59988k.mo84897u():void");
    }

    /* renamed from: v */
    public final void mo84898v() {
        LiveConfig liveConfig;
        LiveConfig liveConfig2;
        C54131l lVar;
        C54131l lVar2;
        C64273c21 c212;
        Class cls = C54991o.class;
        StringBuilder sb = new StringBuilder();
        sb.append("checkFinderObject id:");
        FinderObject finderObject = ((C54991o) mo83051g(cls)).f154341n;
        String str = null;
        sb.append(finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
        sb.append(", nonceId:");
        sb.append(((C55001u) mo83051g(C55001u.class)).f154423t);
        sb.append(", data:");
        sb.append(this.f166849g);
        C63329b.f179694a.mo88233d(this.f171222i, sb.toString());
        long j = 0;
        int i = 0;
        if (((C54991o) mo83051g(cls)).f154341n != null) {
            FinderObject finderObject2 = ((C54991o) mo83051g(cls)).f154341n;
            boolean z = true;
            if (!(finderObject2 != null && finderObject2.f164794id == 0)) {
                FinderObject finderObject3 = ((C54991o) mo83051g(cls)).f154341n;
                if (((finderObject3 == null || (c212 = finderObject3.liveInfo) == null) ? null : c212.f182408v) != null) {
                    String L3 = ((C54991o) mo83051g(cls)).mo75969L3();
                    if (!(L3 == null || L3.length() == 0)) {
                        z = false;
                    }
                    if (!z) {
                        return;
                    }
                }
            }
        }
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
        C64916p1 p1Var = (C64916p1) c;
        AppCompatActivity appCompatActivity = this.f166847e;
        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) appCompatActivity;
        C54127h hVar = this.f166849g;
        if (!(hVar == null || (liveConfig2 = hVar.f151977d) == null)) {
            j = liveConfig2.f157075s;
        }
        long j2 = j;
        if (!(hVar == null || (liveConfig = hVar.f151977d) == null)) {
            str = liveConfig.f157080x;
        }
        String str2 = str == null ? "" : str;
        C59966d4 d4Var = r2;
        C59966d4 d4Var2 = new C59966d4(new SoftReference(this), this.f171222i);
        C64916p1.C64917a.m76436c(p1Var, mMActivity, j2, str2, 0, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, hj12, false, 5, d4Var, 16256, (Object) null);
    }

    /* renamed from: w */
    public final void mo84899w(C50347m31 m312) {
        FinderContact finderContact;
        FinderContact finderContact2;
        FinderContact finderContact3;
        FinderContact finderContact4;
        FinderContact finderContact5;
        FinderContact finderContact6;
        Iterator<T> it;
        String str;
        FinderContact finderContact7;
        FinderContact finderContact8;
        FinderContact finderContact9;
        int i;
        FinderContact finderContact10;
        FinderContact finderContact11;
        FinderContact finderContact12;
        FinderContact finderContact13;
        FinderContact finderContact14;
        FinderContact finderContact15;
        C49765hx0 hx02;
        FinderContact finderContact16;
        C50347m31 m313 = m312;
        Class cls = C55001u.class;
        Class cls2 = C54116w.class;
        Class cls3 = C54991o.class;
        Class cls4 = C54963d0.class;
        LinkedList<C50209l31> linkedList = m313 != null ? m313.f137806j : null;
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        C50629o31 o312 = m313 != null ? m313.f137807n : null;
        C49906iw0 iw02 = m313 != null ? m313.f137808o : null;
        String str2 = this.f171222i;
        StringBuilder sb = new StringBuilder();
        sb.append("checkLinkMicStateWhenJoin micUserList.size:");
        sb.append(linkedList.size());
        sb.append(" micInfo:[sessionId:");
        sb.append(m313 != null ? m313.f137800d : null);
        sb.append(", micUserList:");
        sb.append(linkedList);
        sb.append("], micPkInfo:[sessionId:");
        sb.append(o312 != null ? o312.f138922d : null);
        sb.append(", seq:");
        sb.append(o312 != null ? Long.valueOf(o312.f138923e) : null);
        sb.append(", micNickname:");
        sb.append((o312 == null || (hx02 = o312.f138925g) == null || (finderContact16 = hx02.f134919d) == null) ? null : finderContact16.nickname);
        sb.append(", status:");
        sb.append(o312 != null ? Integer.valueOf(o312.f138926h) : null);
        sb.append(']');
        Log.m105924i(str2, sb.toString());
        String str3 = "";
        if (o312 != null) {
            String str4 = o312.f138922d;
            if (!(str4 == null || str4.length() == 0)) {
                String str5 = this.f171222i;
                Log.m105924i(str5, "checkLinkMicStateWhenJoin has unfinished mic pk status:" + Integer.valueOf(o312.f138926h));
                if (o312.f138925g != null && !Util.isEqual(o312.f138924f, ((C54991o) mo83051g(cls3)).mo76015n4())) {
                    int i2 = o312.f138926h;
                    if (i2 == 1) {
                        C54963d0 d0Var = (C54963d0) mo83051g(cls4);
                    } else if (i2 == 2) {
                        LinkedList<C50209l31> linkedList2 = linkedList;
                        ((C54963d0) mo83051g(cls4)).f154069i = o312.f138923e;
                        String str6 = o312.f138924f;
                        C49765hx0 hx03 = o312.f138925g;
                        C54130j jVar = new C54130j(str6, (hx03 == null || (finderContact15 = hx03.f134919d) == null) ? null : finderContact15.headUrl, (hx03 == null || (finderContact14 = hx03.f134919d) == null) ? null : finderContact14.username, (hx03 == null || (finderContact13 = hx03.f134919d) == null) ? null : finderContact13.nickname, 2, o312.f138922d, (C89349b) null, true, 0, (FinderAuthInfo) null, (String) null, 0, 0, false, hx03 != null ? hx03.f134927o : null, false, 0, hx03, false, (Boolean) null, hx03 != null ? hx03.f134935w : null, 0, 0, 7192320, (C8480h) null);
                        ((C54963d0) mo83051g(cls4)).mo75917Y3(jVar);
                        ((C54963d0) mo83051g(cls4)).f154073p = jVar;
                        ((C54963d0) mo83051g(cls4)).f154078u = 4;
                        ((C54116w) C86312j.m106911c(cls2)).Ax0(((C55001u) mo83051g(cls)).f154420q.f182392d, 1);
                        mo84874I(2);
                        ((C54116w) C86312j.m106911c(cls2)).Bx0(((C55001u) mo83051g(cls)).f154420q.f182392d);
                        if (!linkedList2.isEmpty()) {
                            Log.m105924i(this.f171222i, "checkLinkMicStateWhenJoin has self room audience mic");
                            Iterator<T> it4 = linkedList2.iterator();
                            while (it4.hasNext()) {
                                C50209l31 l312 = (C50209l31) it4.next();
                                if ((l312 != null ? l312.f137145d : null) == null) {
                                    str = str3;
                                    it = it4;
                                } else if (!Util.isEqual(l312.f137147f, ((C54991o) mo83051g(cls3)).mo76015n4())) {
                                    Log.m105924i(this.f171222i, "checkLinkMicStateWhenJoin has unfinished mic others. update mic status");
                                    C54963d0 d0Var2 = (C54963d0) mo83051g(cls4);
                                    String str7 = l312.f137147f;
                                    C49765hx0 hx04 = l312.f137145d;
                                    String str8 = (hx04 == null || (finderContact12 = hx04.f134919d) == null) ? null : finderContact12.headUrl;
                                    String str9 = (hx04 == null || (finderContact11 = hx04.f134919d) == null) ? null : finderContact11.username;
                                    String str10 = (hx04 == null || (finderContact10 = hx04.f134919d) == null) ? null : finderContact10.nickname;
                                    int i3 = l312.f137146e;
                                    str = str3;
                                    String str11 = l312.f137148g;
                                    if (hx04 != null) {
                                        it = it4;
                                        i = hx04.f134923h;
                                    } else {
                                        it = it4;
                                        i = 0;
                                    }
                                    d0Var2.mo75917Y3(new C54130j(str7, str8, str9, str10, i3, str11, (C89349b) null, false, 0, (FinderAuthInfo) null, (String) null, 0, i, false, (String) null, false, 0, hx04, false, (Boolean) null, (C64756up2) null, 0, 0, 8253376, (C8480h) null));
                                    mo84874I(Integer.valueOf(l312.f137146e));
                                } else {
                                    str = str3;
                                    it = it4;
                                    Log.m105924i(this.f171222i, "checkLinkMicStateWhenJoin has unfinished mic self. will close mic");
                                    C54963d0 d0Var3 = (C54963d0) mo83051g(cls4);
                                    String str12 = l312.f137148g;
                                    if (str12 == null) {
                                        str12 = str;
                                    }
                                    d0Var3.f154070j = str12;
                                    C54991o oVar = (C54991o) mo83051g(cls3);
                                    String str13 = l312.f137147f;
                                    C49765hx0 hx05 = l312.f137145d;
                                    oVar.mo76009k4(new C54130j(str13, (hx05 == null || (finderContact9 = hx05.f134919d) == null) ? null : finderContact9.headUrl, (hx05 == null || (finderContact8 = hx05.f134919d) == null) ? null : finderContact8.username, (hx05 == null || (finderContact7 = hx05.f134919d) == null) ? null : finderContact7.nickname, l312.f137146e, l312.f137148g, (C89349b) null, false, 0, (FinderAuthInfo) null, (String) null, 0, hx05 != null ? hx05.f134923h : 0, false, (String) null, false, 0, hx05, false, (Boolean) null, (C64756up2) null, 0, 0, 8253376, (C8480h) null));
                                    mo84878M();
                                }
                                str3 = str;
                                it4 = it;
                            }
                        }
                        ((C54963d0) mo83051g(cls4)).mo75925g3(((C54963d0) mo83051g(cls4)).mo75920b4(o312.f138927i), o312.f138922d);
                    }
                }
                if (iw02 != null) {
                    String str14 = this.f171222i;
                    Log.m105924i(str14, "battleInfo.status:" + iw02.f135700f);
                    int i4 = iw02.f135700f;
                    if (i4 == 10) {
                        C54733a1 a1Var = new C54733a1(iw02.f135698d, iw02.f135699e, iw02.f135701g, -1, 2, (List) null, 32, (C8480h) null);
                        LinkedList<C48701ae3> linkedList3 = iw02.f135702h;
                        C87412m.m108593f(linkedList3, "battleInfo.player_info");
                        a1Var.mo75625d(linkedList3);
                        C13598b0 b0Var = C13598b0.f38549a;
                        ((C54963d0) mo83051g(cls4)).f154051E = a1Var;
                        C65762c cVar = this.f166848f;
                        if (cVar != null) {
                            C58124b.C7172a.m7372a(cVar, C58124b.C58125b.FINDER_LIVE_BATTLE_START, (Bundle) null, 2, (Object) null);
                            return;
                        }
                        return;
                    } else if (i4 == 20) {
                        C54733a1 a1Var2 = ((C54963d0) mo83051g(cls4)).f154051E;
                        if (a1Var2 != null) {
                            int i5 = iw02.f135703i;
                            a1Var2.f153392e = 3;
                            a1Var2.f153391d = i5;
                            C13598b0 b0Var2 = C13598b0.f38549a;
                        }
                        C54733a1 a1Var3 = ((C54963d0) mo83051g(cls4)).f154051E;
                        if (a1Var3 != null) {
                            a1Var3.f153390c = iw02.f135701g;
                        }
                        C54733a1 a1Var4 = ((C54963d0) mo83051g(cls4)).f154051E;
                        if (a1Var4 != null) {
                            LinkedList<C48701ae3> linkedList4 = iw02.f135702h;
                            C87412m.m108593f(linkedList4, "battleInfo.player_info");
                            a1Var4.mo75625d(linkedList4);
                            C13598b0 b0Var3 = C13598b0.f38549a;
                        }
                        C65762c cVar2 = this.f166848f;
                        if (cVar2 != null) {
                            C58124b.C7172a.m7372a(cVar2, C58124b.C58125b.FINDER_LIVE_BATTLE_END, (Bundle) null, 2, (Object) null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        String str15 = str3;
        LinkedList<C50209l31> linkedList5 = linkedList;
        String str16 = null;
        if (!linkedList5.isEmpty()) {
            Log.m105924i(this.f171222i, "checkLinkMicStateWhenJoin has unfinished mic");
            for (C50209l31 l313 : linkedList5) {
                if ((l313 != null ? l313.f137145d : str16) != null) {
                    if (!Util.isEqual(l313.f137147f, ((C54991o) mo83051g(cls3)).mo76015n4())) {
                        Log.m105924i(this.f171222i, "checkLinkMicStateWhenJoin has unfinished mic others. update mic status");
                        C54963d0 d0Var4 = (C54963d0) mo83051g(cls4);
                        String str17 = l313.f137147f;
                        C49765hx0 hx06 = l313.f137145d;
                        d0Var4.mo75917Y3(new C54130j(str17, (hx06 == null || (finderContact6 = hx06.f134919d) == null) ? str16 : finderContact6.headUrl, (hx06 == null || (finderContact5 = hx06.f134919d) == null) ? str16 : finderContact5.username, (hx06 == null || (finderContact4 = hx06.f134919d) == null) ? str16 : finderContact4.nickname, l313.f137146e, l313.f137148g, (C89349b) null, false, 0, (FinderAuthInfo) null, (String) null, 0, hx06 != null ? hx06.f134923h : 0, false, (String) null, false, 0, hx06, false, (Boolean) null, (C64756up2) null, 0, 0, 8253376, (C8480h) null));
                        mo84874I(Integer.valueOf(l313.f137146e));
                    } else {
                        Log.m105924i(this.f171222i, "checkLinkMicStateWhenJoin has unfinished mic self. will close mic");
                        C54963d0 d0Var5 = (C54963d0) mo83051g(cls4);
                        String str18 = l313.f137148g;
                        if (str18 == null) {
                            str18 = str15;
                        }
                        d0Var5.f154070j = str18;
                        C54991o oVar2 = (C54991o) mo83051g(cls3);
                        String str19 = l313.f137147f;
                        C49765hx0 hx07 = l313.f137145d;
                        oVar2.mo76009k4(new C54130j(str19, (hx07 == null || (finderContact3 = hx07.f134919d) == null) ? null : finderContact3.headUrl, (hx07 == null || (finderContact2 = hx07.f134919d) == null) ? null : finderContact2.username, (hx07 == null || (finderContact = hx07.f134919d) == null) ? null : finderContact.nickname, l313.f137146e, l313.f137148g, (C89349b) null, false, 0, (FinderAuthInfo) null, (String) null, 0, hx07 != null ? hx07.f134923h : 0, false, (String) null, false, 0, hx07, false, (Boolean) null, (C64756up2) null, 0, 0, 8253376, (C8480h) null));
                        mo84878M();
                    }
                    str16 = null;
                }
            }
            ((C54116w) C86312j.m106911c(cls2)).Ax0(((C55001u) mo83051g(cls)).f154420q.f182392d, 1);
            ((C54116w) C86312j.m106911c(cls2)).Bx0(((C55001u) mo83051g(cls)).f154420q.f182392d);
        }
    }

    /* renamed from: x */
    public final void mo84900x() {
        String str = this.f171222i;
        StringBuilder sb = new StringBuilder();
        sb.append("checkMiniWindow:");
        C65762c cVar = this.f166848f;
        sb.append(cVar != null ? Boolean.valueOf(cVar.getCheckMiniWin()) : null);
        Log.m105924i(str, sb.toString());
        C65762c cVar2 = this.f166848f;
        boolean z = false;
        if (cVar2 != null && !cVar2.getCheckMiniWin()) {
            z = true;
        }
        if (z) {
            mo84885T();
            this.f171201X1.stopTimer();
        }
    }

    /* renamed from: y */
    public final void mo84901y(long j, String str) {
        if (Util.isEqual(str, ((C55001u) mo83051g(C55001u.class)).f154419p.f182319n)) {
            long c = C31543z5.m39453c();
            C54963d0 d0Var = (C54963d0) mo83051g(C54963d0.class);
            long j2 = c - j;
            if (j2 < 0) {
                j2 = 0;
            }
            d0Var.f154049C = j2;
            Log.m105918d(this.f171222i, "anchorServerTime:" + j + " myServerTime:" + c);
            return;
        }
        Log.m105918d(this.f171222i, "anchorId is invalid, maybe is in pk link mic. " + str);
    }
}
