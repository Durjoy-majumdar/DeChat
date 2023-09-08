package kj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import cl1.C0691u1;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import fe1.C58969q;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.Map;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C76874e0;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import te3.C50681oh0;

/* renamed from: kj1.b0 */
public final class C10102b0 extends C10538e {

    /* renamed from: h */
    public final int f30906h;

    /* renamed from: i */
    public final String f30907i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10102b0(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f30906h = e1Var.f31005x;
        this.f30907i = mo10805j() ? "anchorlive.more.giftwish" : "startlive.more.giftwish";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f30907i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return (mo10805j() && ((C54991o) this.f31809a.mo10534b(C54991o.class)).f154234O1) || (!mo10805j() && mo10527v(this.f31809a));
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        if (mo10805j()) {
            if (((C54991o) e1Var.mo10534b(C54991o.class)).f154234O1) {
                mo10811u(e0Var.mo107135b(this.f30906h, C0966R.string.fyw, C0966R.raw.icons_outlined_wish));
                C7335d c = C86312j.m106911c(C8777j5.class);
                C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
                C8777j5.C8778a.m8608i((C8777j5) c, C54067f0.C0066n.MORE_WISH_LIST_BANNER, (Map) null, 2, (Object) null);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("element", 3);
                jSONObject.put("type", 1);
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.LIVING_MENU, jSONObject.toString(), (String) null, 4, (Object) null);
            }
        } else if (mo10527v(e1Var)) {
            int i = this.f30906h;
            String string = e1Var.f30985d.getResources().getString(C0966R.string.fyw);
            C87412m.m108593f(string, "context.resources.getStr…er_live_wish_panel_title)");
            mo10807m(e0Var, i, string, C0966R.raw.icons_outlined_wish);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("element", 2);
            jSONObject2.put("type", 1);
            C7335d c3 = C86312j.m106911c(cls);
            C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c3, 37, jSONObject2.toString(), (String) null, 4, (Object) null);
        }
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f30906h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C10125e1 e1Var2 = e1Var;
        Class cls = C54108o.class;
        Class cls2 = C0691u1.class;
        C87412m.m108594g(e1Var2, "<this>");
        if (mo10805j()) {
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.MORE_WISH_LIST_BANNER, (Map) null, (String) null, 6, (Object) null);
            if (((C54991o) e1Var2.mo10534b(C54991o.class)).mo75963I3()) {
                ((C0691u1) e1Var2.mo10534b(cls2)).mo658c3().postValue(Boolean.TRUE);
            } else {
                C76912y0.m92768g(e1Var2.f30985d, MMApplicationContext.getContext().getResources().getString(C0966R.string.fp6));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("element", 3);
            jSONObject.put("type", 2);
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.LIVING_MENU, jSONObject.toString(), (String) null, 4, (Object) null);
            return;
        }
        if (C62042e.f176370a.mo87067b1(e1Var2.f30982b)) {
            ((C0691u1) e1Var2.f30982b.mo71262a(cls2)).mo658c3().postValue(Boolean.TRUE);
        } else {
            MMActivity mMActivity = e1Var2.f30985d;
            C76912y0.m92768g(mMActivity, mMActivity.getResources().getString(C0966R.string.fp6));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("element", 2);
        jSONObject2.put("type", 2);
        C7335d c3 = C86312j.m106911c(cls);
        C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c3, 37, jSONObject2.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: v */
    public final boolean mo10527v(C10125e1 e1Var) {
        C58969q b;
        C87412m.m108594g(e1Var, "<this>");
        C50681oh0 oh02 = ((C54991o) e1Var.f30982b.mo71262a(C54991o.class)).f154282Y0;
        boolean z = oh02 != null ? oh02.f139178d : true;
        C62042e eVar = C62042e.f176370a;
        C10125e1.C10132d dVar = e1Var.f30989h;
        long j = (dVar == null || (b = dVar.mo10555b()) == null) ? 0 : b.field_liveSwitchFlag;
        eVar.getClass();
        boolean u = C61926c.m72696u((int) j, 16384);
        Log.m105924i("Finder.FinderLivePostUIC", "isWishEnable isBlueAccount " + z + " isWishFlagEnable: " + u);
        return u && z;
    }
}
