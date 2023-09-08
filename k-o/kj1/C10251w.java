package kj1;

import ak1.C0073g0;
import ak1.C54108o;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C8777j5;
import lj1.C10538e;
import nj3.C76874e0;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C48814b61;

/* renamed from: kj1.w */
public final class C10251w extends C10538e {

    /* renamed from: h */
    public final int f31279h;

    /* renamed from: i */
    public final String f31280i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10251w(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31279h = e1Var.f31007z;
        this.f31280i = mo10805j() ? "anchorlive.more.heatup" : "startlive.more.heatup";
        if (C62042e.f176370a.mo87091k(e1Var.f30982b)) {
            C10538e.m10469r(this, mo10805j() ? 24036 : 24003, 0, "live_more_heat_up", 2, (Object) null);
        }
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31280i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0);
        C48814b61 b612 = ((C54991o) this.f31809a.mo10534b(C54991o.class)).f154202G;
        return (b612 != null && C62042e.f176370a.mo87101n1(b612)) && C61926c.m72696u((int) G, 2);
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        int i = this.f31279h;
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.mmj);
        C87412m.m108593f(string, "getContext().resources.g…nchor_promotion_mini_app)");
        mo10808n(e0Var, i, string, C0966R.raw.icons_outlined_promotion_mini_app, MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_0));
        C62042e.f176370a.getClass();
        Log.m105924i("FinderLiveUtil", "hasShowAnchorPromotionRedDot");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_PROMOTION_BOOLEAN_SYNC, Boolean.TRUE);
        if (mo10805j()) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C0073g0 g0Var = C0073g0.ANCHOR_PROMOTION_MINI_APP;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 1);
            C13598b0 b0Var = C13598b0.f38549a;
            C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("element", 4);
            jSONObject2.put("type", 1);
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.LIVING_MENU, jSONObject2.toString(), (String) null, 4, (Object) null);
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("element", 3);
        jSONObject3.put("type", 1);
        C7335d c3 = C86312j.m106911c(cls);
        C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c3, 37, jSONObject3.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31279h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C48814b61 b612 = ((C54991o) e1Var.mo10534b(C54991o.class)).f154202G;
        if (b612 != null) {
            C62042e.f176370a.mo87100n1(b612, "clickAnchorPromotionMiniApp", e1Var.f30985d);
        }
        if (mo10805j()) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C0073g0 g0Var = C0073g0.ANCHOR_PROMOTION_MINI_APP;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 2);
            C13598b0 b0Var = C13598b0.f38549a;
            C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("element", 4);
            jSONObject2.put("type", 2);
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.LIVING_MENU, jSONObject2.toString(), (String) null, 4, (Object) null);
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("element", 3);
        jSONObject3.put("type", 2);
        C7335d c3 = C86312j.m106911c(cls);
        C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c3, 37, jSONObject3.toString(), (String) null, 4, (Object) null);
    }
}
