package qj1;

import al1.C54127h;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import b50.C54408d;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget;
import com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di0.C86299o;
import di1.C58270b;
import di1.C7332a;
import di3.C86312j;
import fy3.C32224a;
import gh1.C59447j;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i70.C87667c;
import il1.C60350b8;
import il1.C60362c7;
import il1.C60382c8;
import il1.C60397f8;
import il1.C60491p4;
import il1.C60494p7;
import il1.C9084o7;
import j50.C60735a;
import java.util.Iterator;
import java.util.LinkedList;
import je1.C46503a;
import kr0.C76630x0;
import lp3.C88629c;
import nj3.C76912y0;
import o40.C61926c;
import o40.C61937h;
import ok1.C62042e;
import org.json.JSONObject;
import p671qy.C63344h;
import p763ym.C79138l;
import pe3.C89349b;
import qg1.C47832n;
import qo3.C12925w;
import rx3.C13598b0;
import sk1.C63953g;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C51613uy0;
import te3.C64247az0;
import te3.C64374fs1;
import te3.C64403gs1;
import te3.C64789vy0;
import z04.C112551y;

/* renamed from: qj1.yg */
public final class C63144yg extends C62660c {

    /* renamed from: p */
    public final C58124b f179178p;

    /* renamed from: q */
    public final String f179179q = "FinderLiveVisitorGamePlugin";

    /* renamed from: r */
    public FinderLiveVisitorGameTogetherWidget f179180r;

    /* renamed from: s */
    public C60362c7 f179181s;

    /* renamed from: t */
    public C87667c<?, ?>.a f179182t;

    /* renamed from: u */
    public boolean f179183u;

    /* renamed from: qj1.yg$a */
    public static final class C63145a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63144yg f179184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63145a(C63144yg ygVar) {
            super(0);
            this.f179184d = ygVar;
        }

        public Object invoke() {
            this.f179184d.mo88070Z0();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.yg$b */
    public static final class C63146b implements C63344h.C63346b {

        /* renamed from: a */
        public final /* synthetic */ C63144yg f179185a;

        /* renamed from: qj1.yg$b$a */
        public static final class C63147a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63144yg f179186d;

            /* renamed from: e */
            public final /* synthetic */ JSONObject f179187e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63147a(C63144yg ygVar, JSONObject jSONObject) {
                super(0);
                this.f179186d = ygVar;
                this.f179187e = jSONObject;
            }

            public Object invoke() {
                String str = null;
                C58124b.C7172a.m7372a(this.f179186d.f179178p, C58124b.C58125b.FINDER_LIVE_VISITOR_GAME_PLAY_TOGETHER_HIDE_HALF, (Bundle) null, 2, (Object) null);
                JSONObject optJSONObject = this.f179187e.optJSONObject("params");
                boolean z = false;
                if (!(optJSONObject != null ? optJSONObject.optBoolean("isCancelPromoting", false) : false)) {
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("toastWording", "");
                    }
                    if (str == null || str.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        C76912y0.m92768g(this.f179186d.f166287d.getContext(), str);
                        String str2 = this.f179186d.f179179q;
                        Log.m105924i(str2, "toastMsg: " + str);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: qj1.yg$b$b */
        public static final class C63148b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63144yg f179188d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63148b(C63144yg ygVar) {
                super(0);
                this.f179188d = ygVar;
            }

            public Object invoke() {
                Log.m105924i(this.f179188d.f179179q, "dynamicCardServerLost");
                this.f179188d.f179183u = true;
                return C13598b0.f38549a;
            }
        }

        /* renamed from: qj1.yg$b$c */
        public static final class C63149c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ JSONObject f179189d;

            /* renamed from: e */
            public final /* synthetic */ C63144yg f179190e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63149c(JSONObject jSONObject, C63144yg ygVar) {
                super(0);
                this.f179189d = jSONObject;
                this.f179190e = ygVar;
            }

            public Object invoke() {
                JSONObject optJSONObject = this.f179189d.optJSONObject("params");
                String optString = optJSONObject != null ? optJSONObject.optString("beforeLiveToast", "") : null;
                if (!(optString == null || optString.length() == 0)) {
                    C76912y0.m92773l(this.f179190e.f166287d.getContext(), optString);
                    String str = this.f179190e.f179179q;
                    Log.m105924i(str, "toastMsg: " + optString);
                }
                return C13598b0.f38549a;
            }
        }

        public C63146b(C63144yg ygVar) {
            this.f179185a = ygVar;
        }

        /* renamed from: a */
        public void mo87817a(String str, JSONObject jSONObject) {
            LinkedList<C64374fs1> linkedList;
            C87412m.m108594g(str, "action");
            C87412m.m108594g(jSONObject, "params");
            String str2 = this.f179185a.f179179q;
            Log.m105924i(str2, "finderLiveCallback action:" + str);
            if (C87412m.m108589b(str, "closePlayTogetherActionSheet")) {
                C61926c.m72668M(new C63147a(this.f179185a, jSONObject));
            } else if (C87412m.m108589b(str, "dynamicCardFirstFrameAction")) {
                String optString = jSONObject.optString("frameSetName");
                String str3 = this.f179185a.f179179q;
                Log.m105918d(str3, "frameFirstRender frameSetName:" + optString);
                C63144yg ygVar = this.f179185a;
                C64789vy0 vy02 = ygVar.f179180r.f160121o;
                C64403gs1 gs12 = vy02 != null ? vy02.f186012d : null;
                if (gs12 != null && (linkedList = gs12.f183356d) != null) {
                    for (C64374fs1 fs12 : linkedList) {
                        if (C112551y.m153810j(fs12.f183222g, optString, false, 2, (Object) null)) {
                            String str4 = ygVar.f179179q;
                            Log.m105924i(str4, "frameFirstRender frameSetName:" + optString + " hideLoading!");
                            FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget = ygVar.f179180r;
                            finderLiveVisitorGameTogetherWidget.getClass();
                            C61926c.m72668M(new C60382c8(finderLiveVisitorGameTogetherWidget));
                        }
                    }
                }
            } else if (C87412m.m108589b(str, "dynamicCardServerLost")) {
                C61926c.m72668M(new C63148b(this.f179185a));
            } else if (C87412m.m108589b(str, "beforeLiveToastAction")) {
                C61926c.m72668M(new C63149c(jSONObject, this.f179185a));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63144yg(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f179178p = bVar;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        this.f179180r = new FinderLiveVisitorGameTogetherWidget(context, viewGroup, bVar, this);
        this.f179181s = new C60362c7(viewGroup, bVar, this);
    }

    /* renamed from: S0 */
    public void mo87693S0(Intent intent) {
        C12925w wVar;
        C60362c7 c7Var = this.f179181s;
        c7Var.getClass();
        boolean z = false;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("extra_start_by_half_screen_empty_area_click_scene", false) : false;
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "clickEmptyAreaClose = " + booleanExtra);
        if (booleanExtra) {
            C12925w wVar2 = c7Var.f172130o;
            if (wVar2 != null && wVar2.mo12466f()) {
                z = true;
            }
            if (z && (wVar = c7Var.f172130o) != null) {
                wVar.mo5085n();
            }
        }
    }

    /* renamed from: Z0 */
    public final void mo88070Z0() {
        if (this.f166287d.getVisibility() == 0) {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f179180r.f160114h;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78802a();
            } else {
                C87412m.m108603p("container");
                throw null;
            }
        }
    }

    /* renamed from: a1 */
    public final void mo88071a1() {
        Class cls = C63344h.class;
        Log.m105924i(this.f179179q, "setupDynamicCardEnv");
        ((C63344h) C86312j.m106911c(cls)).mo88250zf("wxe208ce76dfa39515");
        ((C63344h) C86312j.m106911c(cls)).mo88244Pc(new C63146b(this));
        String str = ((C54991o) mo87696x0(C54991o.class)).f154345o;
        long j = ((C55001u) mo87696x0(C55001u.class)).f154416j;
        C62042e eVar = C62042e.f176370a;
        Context context = this.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        C63344h.C63345a aVar = new C63344h.C63345a(str, j, eVar.mo87042T(context));
        Object obj = new Object();
        Context context2 = this.f166287d.getContext();
        C87412m.m108593f(context2, "root.context");
        C87667c<?, ?>.a qf02 = ((C63344h) C86312j.m106911c(cls)).qf0(obj, context2, aVar);
        this.f179182t = qf02;
        if (qf02 != null) {
            FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget = this.f179180r;
            finderLiveVisitorGameTogetherWidget.getClass();
            finderLiveVisitorGameTogetherWidget.f160123q = qf02;
            Iterator<C63953g> it = finderLiveVisitorGameTogetherWidget.f160120n.iterator();
            while (it.hasNext()) {
                it.next().f181281f = qf02;
            }
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        Class cls = C54991o.class;
        super.mo8357i0();
        C60362c7 c7Var = this.f179181s;
        c7Var.f172110L = null;
        ((C54991o) c7Var.f172118c.mo87696x0(cls)).f154290Z3.observe(c7Var.f172118c, new C60494p7(c7Var));
        C58270b bVar = ((C54991o) mo87696x0(cls)).f154310e4;
        C63145a aVar = new C63145a(this);
        bVar.getClass();
        bVar.observe(this, new C7332a(aVar));
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (this.f166287d.getVisibility() != 0) {
            return false;
        }
        mo88070Z0();
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 2;
    }

    /* renamed from: r0 */
    public void mo8358r0() {
        C87667c<?, ?>.a aVar = this.f179182t;
        if (aVar != null) {
            aVar.mo122102e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3209s0() {
        /*
            r15 = this;
            il1.c7 r0 = r15.f179181s
            r0.getClass()
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onResume "
            r2.append(r3)
            java.lang.String r3 = r0.f172110L
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Finder.FinderLiveVisitorGameTeamWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            java.lang.String r2 = r0.f172110L
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0032
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x002d
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            if (r2 != r3) goto L_0x0032
            r2 = 1
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            if (r2 == 0) goto L_0x0079
            qg1.n r2 = new qg1.n
            qj1.c r5 = r0.f172118c
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r1)
            cl1.u r5 = (cl1.C55001u) r5
            long r6 = r5.f154416j
            qj1.c r5 = r0.f172118c
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r1)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            long r8 = r5.f182392d
            qj1.c r5 = r0.f172118c
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r1)
            cl1.u r5 = (cl1.C55001u) r5
            byte[] r5 = r5.f154417n
            pe3.b r10 = pe3.C89349b.m111674a(r5)
            qj1.c r5 = r0.f172118c
            androidx.lifecycle.i0 r1 = r5.mo87696x0(r1)
            cl1.u r1 = (cl1.C55001u) r1
            java.lang.String r11 = r1.f154423t
            r12 = 0
            r13 = 16
            r14 = 0
            r5 = r2
            r5.<init>(r6, r8, r10, r11, r12, r13, r14)
            nr3.e r1 = r2.mo9225i()
            il1.q7 r2 = new il1.q7
            r2.<init>(r0)
            r1.mo123420E(r2)
        L_0x0079:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget r0 = r15.f179180r
            android.view.View r0 = r0.f160113g
            if (r0 == 0) goto L_0x00b8
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0087
            r0 = 1
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r0 == 0) goto L_0x00b0
            java.lang.String r0 = r15.f179179q
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onResume serverLost:"
            r1.append(r2)
            boolean r2 = r15.f179183u
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            boolean r0 = r15.f179183u
            if (r0 == 0) goto L_0x00ab
            r15.mo88071a1()
            r15.f179183u = r4
        L_0x00ab:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget r0 = r15.f179180r
            r0.mo78278e(r3)
        L_0x00b0:
            i70.c<?, ?>$a r0 = r15.f179182t
            if (r0 == 0) goto L_0x00b7
            r0.mo122105h()
        L_0x00b7:
            return
        L_0x00b8:
            java.lang.String r0 = "rootView"
            gy3.C87412m.m108603p(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63144yg.mo3209s0():void");
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C60491p4 p4Var;
        String string;
        C86299o oVar;
        C12925w wVar;
        Bundle bundle2 = bundle;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        Long l = null;
        if (ordinal != 7) {
            boolean z = true;
            if (ordinal == 118) {
                C60362c7 c7Var = this.f179181s;
                c7Var.mo85329d("updateBottomSheet");
                boolean z2 = ((C54991o) c7Var.f172118c.mo87696x0(cls2)).f154389y1;
                C64247az0 az02 = ((C54991o) c7Var.f172118c.mo87696x0(cls2)).f154379w1;
                C51613uy0 uy02 = ((C54991o) c7Var.f172118c.mo87696x0(cls2)).f154363s1;
                if (!(!z2 || uy02 == null || az02 == null)) {
                    C63084w6 w6Var = (C63084w6) c7Var.f172118c.mo87687E0(C63084w6.class);
                    if (((w6Var == null || (p4Var = w6Var.f179023q) == null) ? false : C87412m.m108589b(p4Var.mo85447c(), Boolean.TRUE)) && c7Var.f172099A) {
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "updateJoinGameGuide");
                        c7Var.mo85344s(uy02, az02);
                    }
                }
                C12925w wVar2 = c7Var.f172130o;
                if (wVar2 != null && wVar2.mo12466f()) {
                    C12925w wVar3 = c7Var.f172130o;
                    if ((wVar3 != null && wVar3.mo12466f()) && c7Var.f172106H) {
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "showing invite bottom sheet");
                    } else if (c7Var.f172107I) {
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "showing invite dialog");
                    } else if (uy02 == null || az02 == null) {
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "updateBottomSheet gameteam " + uy02 + ", " + az02);
                    } else {
                        ((C79138l) C86312j.m106911c(C79138l.class)).mo74004WW(uy02.f143182f, uy02.f143186j, (C79138l.C53540a) null);
                        if (z2) {
                            Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "updateBottomSheet " + C61937h.m72709h(az02));
                            C61926c.m72665J(new C47832n(((C55001u) c7Var.f172118c.mo87696x0(cls)).f154416j, ((C55001u) c7Var.f172118c.mo87696x0(cls)).f154420q.f182392d, C89349b.m111674a(((C55001u) c7Var.f172118c.mo87696x0(cls)).f154417n), ((C55001u) c7Var.f172118c.mo87696x0(cls)).f154423t, 0, 16, (C8480h) null).mo9225i(), new C60350b8(c7Var));
                        }
                    }
                }
                View view = this.f179180r.f160113g;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        z = false;
                    }
                    if (z) {
                        FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget = this.f179180r;
                        Iterator<C63953g> it = finderLiveVisitorGameTogetherWidget.f160120n.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            C63953g next = it.next();
                            int i2 = i + 1;
                            if (i >= 0) {
                                C63953g gVar = next;
                                if (gVar.f181279d == 2 && ((C54991o) finderLiveVisitorGameTogetherWidget.f160109c.mo87696x0(cls2)).f154389y1) {
                                    C88629c J = C61926c.m72665J(new C47832n(((C55001u) finderLiveVisitorGameTogetherWidget.f160109c.mo87696x0(cls)).f154416j, ((C55001u) finderLiveVisitorGameTogetherWidget.f160109c.mo87696x0(cls)).f154420q.f182392d, C89349b.m111674a(((C55001u) finderLiveVisitorGameTogetherWidget.f160109c.mo87696x0(cls)).f154417n), ((C55001u) finderLiveVisitorGameTogetherWidget.f160109c.mo87696x0(cls)).f154423t, 0, 16, (C8480h) null).mo9225i(), new C60397f8(finderLiveVisitorGameTogetherWidget, gVar, i));
                                    if (finderLiveVisitorGameTogetherWidget.f160107a.getContext() instanceof MMActivity) {
                                        Context context = finderLiveVisitorGameTogetherWidget.f160107a.getContext();
                                        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                                        J.mo11397F((MMActivity) context);
                                    }
                                }
                                i = i2;
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                    }
                    ((C54991o) mo87696x0(cls2)).f154389y1 = false;
                    return;
                }
                C87412m.m108603p("rootView");
                throw null;
            } else if (ordinal == 185) {
                C60362c7 c7Var2 = this.f179181s;
                c7Var2.getClass();
                if (bundle2 != null) {
                    l = Long.valueOf(bundle2.getLong("PARAM_FINDER_LIVE_SEND_MSG_SESSION_ID", 0));
                }
                Log.m105925i("Finder.FinderLiveVisitorGameTeamWidget", "ljd notifySendMsgResult sessionId:%d", l);
                long j = c7Var2.f172139x;
                if (l != null && l.longValue() == j) {
                    c7Var2.f172139x = 0;
                    new C46503a(((C55001u) c7Var2.f172118c.mo87696x0(cls)).f154416j, ((C55001u) c7Var2.f172118c.mo87696x0(cls)).f154420q.f182392d, C89349b.m111674a(((C55001u) c7Var2.f172118c.mo87696x0(cls)).f154417n), (bundle2 == null || (string = bundle2.getString("PARAM_FINDER_LIVE_NOTIFY_SEND_MSG_CONTENT")) == null) ? "" : string, ((C54991o) c7Var2.f172118c.mo87696x0(cls2)).f154345o).mo9225i().mo123420E(C9084o7.f28652a);
                    return;
                }
                Log.m105921e("Finder.FinderLiveVisitorGameTeamWidget", "sessionId error, not match, current sessionId:%s", Long.valueOf(c7Var2.f172139x));
            } else if (ordinal == 187) {
                C60362c7 c7Var3 = this.f179181s;
                c7Var3.f172141z = false;
                c7Var3.f172099A = false;
            } else if (ordinal == 210) {
                this.f179181s.mo85328c(8);
            } else if (ordinal == 27 || ordinal == 28) {
                C60362c7 c7Var4 = this.f179181s;
                C12925w wVar4 = c7Var4.f172130o;
                if ((wVar4 != null && wVar4.mo12466f()) && (wVar = c7Var4.f172130o) != null) {
                    wVar.mo5085n();
                }
                C62660c cVar = c7Var4.f172118c;
                if ((cVar != null && ((C54991o) cVar.mo87696x0(cls2)).f154375v1) && (oVar = c7Var4.f172112N) != null) {
                    Log.m105925i("Finder.FinderLiveVisitorGameTeamWidget", "closeWxaApp appId:%s", oVar.f250930b);
                    C76630x0 x0Var = (C76630x0) C86312j.m106911c(C76630x0.class);
                    C86299o oVar2 = c7Var4.f172112N;
                    String str = oVar2 != null ? oVar2.f250929a : null;
                    String str2 = oVar2 != null ? oVar2.f250930b : null;
                    C87412m.m108591d(oVar2);
                    x0Var.mo106894i7(str, str2, oVar2.f250931c, false);
                }
                c7Var4.f172112N = null;
                mo88070Z0();
            } else if (ordinal == 32) {
                this.f179181s.mo85328c(5);
            } else if (ordinal == 33) {
                this.f179181s.mo85328c(4);
            } else if (ordinal == 35) {
                this.f179181s.mo85328c(3);
            } else if (ordinal != 36) {
                switch (ordinal) {
                    case 102:
                        mo88071a1();
                        mo10792g(0);
                        this.f179180r.mo78278e(false);
                        this.f179181s.mo85335j(true);
                        return;
                    case 103:
                        mo88070Z0();
                        return;
                    case 104:
                        mo88070Z0();
                        C60362c7 c7Var5 = this.f179181s;
                        c7Var5.getClass();
                        C60362c7.f172095S = 0;
                        C60362c7.f172096T = 0;
                        C60362c7.f172097U = "";
                        C60362c7.f172098V = null;
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "resetLastGameTeamClick, from:IconClick");
                        c7Var5.mo85330e();
                        return;
                    default:
                        return;
                }
            } else {
                this.f179181s.mo85328c(2);
            }
        } else {
            C60362c7.f172095S = 0;
            C60362c7.f172096T = 0;
            C60362c7.f172097U = "";
            C60362c7.f172098V = null;
            Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "resetLastGameTeamClick, from:STARTLIVE");
        }
    }

    /* renamed from: v0 */
    public void mo12287v0() {
        C56032b z0;
        C54127h data;
        LiveRoomControllerStore liveRoomControllerStore;
        C60362c7 c7Var = this.f179181s;
        c7Var.getClass();
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "stop");
        C62660c cVar = c7Var.f172118c;
        boolean z = true;
        if (cVar == null || !((C54991o) cVar.mo87696x0(C54991o.class)).f154375v1) {
            z = false;
        }
        if (z) {
            Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "floatMode");
            FinderLiveService.f159376d.getClass();
            C60735a aVar = FinderLiveService.f159378f;
            if (aVar != null) {
                Context context = c7Var.f172116a.getContext();
                C87412m.m108593f(context, "root.context");
                C54408d.C54409a.m61121a(aVar, context, false, false, 0, 0, (Bitmap) null, false, (MMVideoFrameLayout) null, 254, (Object) null);
            }
            C62660c cVar2 = c7Var.f172118c;
            if (cVar2 != null && (z0 = cVar2.mo14484z0()) != null && (data = z0.getData()) != null && (liveRoomControllerStore = data.f151979f) != null) {
                C59447j.f169870a.mo84550b(liveRoomControllerStore);
            }
        }
    }
}
