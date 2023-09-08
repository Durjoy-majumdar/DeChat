package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import er1.C58777u0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i70.C87667c;
import il1.C60345b0;
import il1.C60540x;
import java.util.Iterator;
import java.util.LinkedList;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import p671qy.C63344h;
import rx3.C13598b0;
import sk1.C63953g;
import te3.C49712hj1;
import te3.C64374fs1;
import te3.C64403gs1;
import te3.C64789vy0;
import z04.C112551y;

/* renamed from: qj1.l1 */
public final class C62861l1 extends C62660c {

    /* renamed from: p */
    public final C58124b f178389p;

    /* renamed from: q */
    public final String f178390q = "FinderLiveAnchorGamePlugin";

    /* renamed from: r */
    public FinderLiveAnchorGameTogetherWidget f178391r;

    /* renamed from: s */
    public C87667c<?, ?>.a f178392s;

    /* renamed from: t */
    public boolean f178393t;

    /* renamed from: qj1.l1$a */
    public static final class C62862a implements C63344h.C63346b {

        /* renamed from: a */
        public final /* synthetic */ C62861l1 f178394a;

        /* renamed from: qj1.l1$a$a */
        public static final class C62863a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C62861l1 f178395d;

            /* renamed from: e */
            public final /* synthetic */ JSONObject f178396e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62863a(C62861l1 l1Var, JSONObject jSONObject) {
                super(0);
                this.f178395d = l1Var;
                this.f178396e = jSONObject;
            }

            public Object invoke() {
                String str = null;
                C58124b.C7172a.m7372a(this.f178395d.f178389p, C58124b.C58125b.FINDER_LIVE_ANCHOR_GAME_PLAY_TOGETHER_HIDE_HALF, (Bundle) null, 2, (Object) null);
                JSONObject optJSONObject = this.f178396e.optJSONObject("params");
                boolean z = false;
                if (!(optJSONObject != null ? optJSONObject.optBoolean("isCancelPromoting", false) : false)) {
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("toastWording", "");
                    }
                    if (str == null || str.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        C76912y0.m92768g(this.f178395d.f166287d.getContext(), str);
                        String str2 = this.f178395d.f178390q;
                        Log.m105924i(str2, "toastMsg: " + str);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: qj1.l1$a$b */
        public static final class C62864b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C62861l1 f178397d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62864b(C62861l1 l1Var) {
                super(0);
                this.f178397d = l1Var;
            }

            public Object invoke() {
                Log.m105924i(this.f178397d.f178390q, "dynamicCardServerLost");
                this.f178397d.f178393t = true;
                return C13598b0.f38549a;
            }
        }

        /* renamed from: qj1.l1$a$c */
        public static final class C62865c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ JSONObject f178398d;

            /* renamed from: e */
            public final /* synthetic */ C62861l1 f178399e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62865c(JSONObject jSONObject, C62861l1 l1Var) {
                super(0);
                this.f178398d = jSONObject;
                this.f178399e = l1Var;
            }

            public Object invoke() {
                JSONObject optJSONObject = this.f178398d.optJSONObject("params");
                String optString = optJSONObject != null ? optJSONObject.optString("beforeLiveToast", "") : null;
                if (!(optString == null || optString.length() == 0)) {
                    C76912y0.m92773l(this.f178399e.f166287d.getContext(), optString);
                    String str = this.f178399e.f178390q;
                    Log.m105924i(str, "toastMsg: " + optString);
                }
                return C13598b0.f38549a;
            }
        }

        public C62862a(C62861l1 l1Var) {
            this.f178394a = l1Var;
        }

        /* renamed from: a */
        public void mo87817a(String str, JSONObject jSONObject) {
            LinkedList<C64374fs1> linkedList;
            C87412m.m108594g(str, "action");
            C87412m.m108594g(jSONObject, "params");
            String str2 = this.f178394a.f178390q;
            Log.m105924i(str2, "finderLiveCallback action:" + str);
            if (C87412m.m108589b(str, "closePlayTogetherActionSheet")) {
                C61926c.m72668M(new C62863a(this.f178394a, jSONObject));
            } else if (C87412m.m108589b(str, "dynamicCardFirstFrameAction")) {
                String optString = jSONObject.optString("frameSetName");
                String str3 = this.f178394a.f178390q;
                Log.m105918d(str3, "frameFirstRender frameSetName:" + optString);
                C62861l1 l1Var = this.f178394a;
                C64789vy0 vy02 = l1Var.f178391r.f160045j;
                C64403gs1 gs12 = vy02 != null ? vy02.f186012d : null;
                if (gs12 != null && (linkedList = gs12.f183356d) != null) {
                    for (C64374fs1 fs12 : linkedList) {
                        if (C112551y.m153810j(fs12.f183222g, optString, false, 2, (Object) null)) {
                            String str4 = l1Var.f178390q;
                            Log.m105924i(str4, "frameFirstRender frameSetName:" + optString + " hideLoading!");
                            FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget = l1Var.f178391r;
                            finderLiveAnchorGameTogetherWidget.getClass();
                            C61926c.m72668M(new C60540x(finderLiveAnchorGameTogetherWidget));
                        }
                    }
                }
            } else if (C87412m.m108589b(str, "dynamicCardServerLost")) {
                C61926c.m72668M(new C62864b(this.f178394a));
            } else if (C87412m.m108589b(str, "beforeLiveToastAction")) {
                C61926c.m72668M(new C62865c(jSONObject, this.f178394a));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62861l1(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178389p = bVar;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        this.f178391r = new FinderLiveAnchorGameTogetherWidget(context, viewGroup, bVar, this);
    }

    /* renamed from: Z0 */
    public final void mo87813Z0() {
        if (this.f166287d.getVisibility() == 0) {
            Log.m105924i(this.f178390q, "hidePlayTogether");
            LiveBottomSheetPanel liveBottomSheetPanel = this.f178391r.f160048m;
            if (liveBottomSheetPanel == null) {
                C87412m.m108603p("container");
                throw null;
            } else if (liveBottomSheetPanel.f165501h) {
                liveBottomSheetPanel.mo78802a();
            }
        }
    }

    /* renamed from: a1 */
    public final void mo87814a1() {
        Class cls = C63344h.class;
        Log.m105924i(this.f178390q, "setupDynamicCardEnv");
        ((C63344h) C86312j.m106911c(cls)).mo88250zf("wxe208ce76dfa39515");
        ((C63344h) C86312j.m106911c(cls)).mo88244Pc(new C62862a(this));
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
        this.f178392s = qf02;
        if (qf02 != null) {
            FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget = this.f178391r;
            finderLiveAnchorGameTogetherWidget.getClass();
            finderLiveAnchorGameTogetherWidget.f160050o = qf02;
            Iterator<C63953g> it = finderLiveAnchorGameTogetherWidget.f160044i.iterator();
            while (it.hasNext()) {
                it.next().f181281f = qf02;
            }
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo87815b1() {
        Log.m105924i(this.f178390q, "showPlayTogether");
        mo10792g(0);
        this.f178391r.mo78222g(false);
        mo87814a1();
        C58777u0 u0Var = C58777u0.f168283a;
        if (C58777u0.f168284b == 18) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 4);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
            u0Var.mo83836e(jSONObject2);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget = this.f178391r;
        ((C54991o) finderLiveAnchorGameTogetherWidget.f160038c.mo87696x0(C54991o.class)).f154302c4.observe(finderLiveAnchorGameTogetherWidget.f160038c, new C60345b0(finderLiveAnchorGameTogetherWidget));
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (this.f166287d.getVisibility() != 0) {
            return false;
        }
        C58124b.C7172a.m7372a(this.f178391r.f160037b, C58124b.C58125b.FINDER_LIVE_ANCHOR_GAME_PLAY_TOGETHER_HIDE_HALF, (Bundle) null, 2, (Object) null);
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 2;
    }

    public final void onResume() {
        if (this.f166287d.getVisibility() == 0) {
            String str = this.f178390q;
            Log.m105924i(str, "onResume serverLost:" + this.f178393t);
            if (this.f178393t) {
                mo87814a1();
                this.f178393t = false;
            }
            this.f178391r.mo78222g(true);
            C87667c<?, ?>.a aVar = this.f178392s;
            if (aVar != null) {
                aVar.mo122105h();
            }
        }
    }

    /* renamed from: r0 */
    public void mo8358r0() {
        C87667c<?, ?>.a aVar = this.f178392s;
        if (aVar != null) {
            aVar.mo122102e();
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal == 27 || ordinal == 28) {
            mo87813Z0();
        } else if (ordinal == 100) {
            mo87815b1();
        } else if (ordinal == 101) {
            mo87813Z0();
        }
    }
}
