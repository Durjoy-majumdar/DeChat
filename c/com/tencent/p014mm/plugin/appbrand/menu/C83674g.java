package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import kg3.C76577a;
import kr0.C88267e;
import kz1.C88349l;
import lp0.C88619a;
import nj3.C76874e0;
import p576jp.C88007b;
import p635os.C89291d;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13604l;
import sx3.C90363p0;
import vk0.C90809a;
import xq0.C91324b;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.g */
public final class C83674g extends C88619a<C83928t1> {

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.g$a */
    public static final class C83675a {
        public C83675a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.g$b */
    public static final class C83676b extends C82926s {
        private static final int CTRL_INDEX = 1036;
        public static final String NAME = "onGameLiveStateChange";
    }

    static {
        new C83675a((C8480h) null);
    }

    public C83674g() {
        super(32);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        Class cls = C88349l.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(t1Var, "pageView");
        if (!AppBrandRuntimeWCAccessible.m99327c(t1Var) || str == null || !C91324b.m114560a(t1Var.getRuntime())) {
            Log.m105924i("MicroMsg.MenuDelegateGameLive", "gameLive is not permitted according to the configuration from back");
        } else if (!Util.getBoolean(t1Var.getRuntime().mo113184O1(false).Yk0("gameLive"), false)) {
            Log.m105924i("MicroMsg.MenuDelegateGameLive", "gameLive is not permitted due to the develop_config");
        } else {
            ((C88349l) C86312j.m106911c(cls)).R00();
            Boolean Qq0 = ((C89291d) C86312j.m106911c(C89291d.class)).Qq0(str, t1Var.getRuntime().mo113210l1().f239365g);
            Log.m105924i("MicroMsg.MenuDelegateGameLive", "show the gameLive menu, isLiving:" + Qq0 + ", 1 is finish 0 is start");
            ((C88349l) C86312j.m106911c(cls)).mo118251bw(5, System.currentTimeMillis());
            ((C88349l) C86312j.m106911c(cls)).dq0(1);
            if (e0Var != null) {
                int i = this.f255896a;
                C87412m.m108593f(Qq0, "isLiving");
                e0Var.mo107153m(i, context.getString(Qq0.booleanValue() ? C0966R.string.a6d : C0966R.string.a6g), C74933u4.m89768e(context, C0966R.raw.finder_icon_live, C76577a.m92153d(context, C0966R.color.f3441zk)), C76577a.m92153d(context, C0966R.color.f3441zk));
            }
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        Class cls = C88349l.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(t1Var, "pageView");
        ((C88349l) C86312j.m106911c(cls)).dq0(2);
        C84240s.m103840f(t1Var.getAppId(), t1Var.mo116162Q0(), 49, "", Util.nowSecond(), 1, 0);
        if (str != null) {
            Boolean Qq0 = ((C89291d) C86312j.m106911c(C89291d.class)).Qq0(str, t1Var.getRuntime().mo113210l1().f239365g);
            C87412m.m108593f(Qq0, "isLiving");
            if (Qq0.booleanValue()) {
                Log.m105924i("MicroMsg.MenuDelegateGameLive", "click the gameLive menu, isLiving:" + Qq0 + ", 1 is exitGameLive 0 is send event");
                ((C88349l) C86312j.m106911c(cls)).V60(t1Var.getAppId(), t1Var.getRuntime().mo113210l1().f239365g, context, 1, (C88349l.C88351b) null);
            } else if (((C105181w) ((C88007b) C86312j.m106911c(C88007b.class)).mo59116Bp()).f312350M) {
                Log.m105924i("MicroMsg.MenuDelegateGameLive", "is voip talking");
                C77426q qVar = new C77426q(context);
                qVar.mo107595g(C76577a.m92166q(context, C0966R.string.a5h));
                qVar.mo107600l((C47883u) null);
                qVar.mo107589a(true);
                qVar.mo107603o();
            } else {
                if (!(C90809a.C90811b.f260763a.mo124931a().length == 0)) {
                    Log.m105924i("MicroMsg.MenuDelegateGameLive", "is using camera");
                    C77426q qVar2 = new C77426q(context);
                    qVar2.mo107595g(C76577a.m92166q(context, C0966R.string.a5g));
                    qVar2.mo107600l((C47883u) null);
                    qVar2.mo107589a(true);
                    qVar2.mo107603o();
                    return;
                }
                C83676b bVar = new C83676b();
                bVar.mo115165o(C90363p0.m113143b(new C13604l("event", 4)));
                bVar.mo115195q((C88267e) t1Var.getRuntime().f238150p, t1Var.getComponentId());
                bVar.mo115158h();
                C84240s.m103840f(str, t1Var.mo116162Q0(), 49, "", Util.nowSecond(), 1, 0);
            }
        }
    }
}
