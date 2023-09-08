package kj1;

import a14.C0000n0;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import cl1.C0696x;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import gy3.C87412m;
import ht1.C8777j5;
import il1.C9002h2;
import il1.C9118u;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C76874e0;
import org.json.JSONObject;
import qo3.C12925w;
import rx3.C13598b0;
import te3.C50326ly0;

/* renamed from: kj1.f */
public final class C10139f extends C10538e {

    /* renamed from: h */
    public final String f31054h;

    /* renamed from: i */
    public final int f31055i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10139f(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31054h = mo10805j() ? "anchorlive.more.fansgroup" : "startlive.more.fansgroup";
        this.f31055i = e1Var.f31004w;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31054h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        C50326ly0 ly02 = ((C0696x) this.f31809a.mo10534b(C0696x.class)).f1644g;
        return ly02 != null && ly02.f137710h;
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        C54067f0.C0066n nVar = C54067f0.C0066n.FAN_GROUP;
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        mo10811u(e0Var.mo107135b(this.f31055i, C0966R.string.dxe, C0966R.raw.icons_outlined_fans));
        if (mo10805j()) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.FANS_CLUB, "1", (String) null, 4, (Object) null);
            ((C54108o) C86312j.m106911c(cls)).mo9602Jz(nVar, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
            return;
        }
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c2, 27, "1", (String) null, 4, (Object) null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 1);
        jSONObject.put("type", 1);
        C7335d c3 = C86312j.m106911c(cls);
        C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c3, 37, jSONObject.toString(), (String) null, 4, (Object) null);
        ((C54108o) C86312j.m106911c(cls)).mo9602Jz(nVar, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.BEFORE));
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31055i;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C9002h2 h2Var;
        C54067f0.C0064m mVar = C54067f0.C0064m.FAN_GROUP;
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        if (mo10805j()) {
            C58124b.C58125b bVar = C58124b.C58125b.FINDER_LIVE_ANCHOR_FANS_CLUB;
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_FANS_MODIFY", true);
            C13598b0 b0Var = C13598b0.f38549a;
            e1Var.mo10539g(bVar, bundle);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, mVar, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 1);
        jSONObject.put("type", 2);
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c2, 37, jSONObject.toString(), (String) null, 4, (Object) null);
        C7335d c3 = C86312j.m106911c(cls);
        C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c3, mVar, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.BEFORE), (String) null, 4, (Object) null);
        C10125e1.C10132d dVar = e1Var.f30989h;
        if (dVar != null) {
            if (dVar.f31037c == null) {
                MMActivity mMActivity = e1Var.f30985d;
                View findViewById = mMActivity.findViewById(16908290);
                C87412m.m108593f(findViewById, "context.findViewById(android.R.id.content)");
                C9118u uVar = new C9118u(mMActivity, (ViewGroup) findViewById, (C45795b) null);
                dVar.f31037c = uVar;
                C0000n0 n0Var = dVar.f31036b;
                C87412m.m108594g(n0Var, "scope");
                uVar.f28732b.setScope(n0Var);
                uVar.f28733c.setScope(n0Var);
            }
            C50326ly0 ly02 = ((C0696x) e1Var.f30982b.mo71262a(C0696x.class)).f1644g;
            boolean z = false;
            if (ly02 != null && ly02.f137707e) {
                z = true;
            }
            if (z) {
                C9118u uVar2 = dVar.f31037c;
                if (uVar2 != null) {
                    uVar2.f28732b.mo9759e((C12925w) null, true);
                    return;
                }
                return;
            }
            C9118u uVar3 = dVar.f31037c;
            if (uVar3 != null && (h2Var = uVar3.f28733c) != null) {
                h2Var.mo9810c();
            }
        }
    }
}
