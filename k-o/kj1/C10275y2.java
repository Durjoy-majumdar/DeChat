package kj1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.os.Bundle;
import bl3.C39818r;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dj1.C58278c0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C60172g4;
import ht1.C8777j5;
import j50.C60735a;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C76874e0;
import nj3.C76912y0;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: kj1.y2 */
public final class C10275y2 extends C10538e {

    /* renamed from: h */
    public final int f31331h;

    /* renamed from: i */
    public final String f31332i = "";

    /* renamed from: kj1.y2$a */
    public static final class C10276a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C10275y2 f31333d;

        /* renamed from: e */
        public final /* synthetic */ C10125e1 f31334e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10276a(C10275y2 y2Var, C10125e1 e1Var) {
            super(0);
            this.f31333d = y2Var;
            this.f31334e = e1Var;
        }

        public Object invoke() {
            this.f31333d.mo10577v(this.f31334e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kj1.y2$b */
    public static final class C10277b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C10125e1 f31335a;

        public C10277b(C10125e1 e1Var) {
            this.f31335a = e1Var;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C61926c.m72668M(new C10281z2(this.f31335a));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10275y2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31331h = e1Var.f31006y;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31332i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return true;
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        Class cls = C55001u.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        e0Var.mo107144g(this.f31331h, MMApplicationContext.getContext().getResources().getString(C0966R.string.gvx), C0966R.raw.finder_live_dislike);
        ((C54108o) C86312j.m106911c(C54108o.class)).mo9602Jz(C54067f0.C0066n.PANEL_UNLIKE_BUTTON, C90364q0.m113148g(new C13604l("liveId", String.valueOf(((C55001u) e1Var.mo10534b(cls)).f154420q.f182392d)), new C13604l("feedId", String.valueOf(((C55001u) e1Var.mo10534b(cls)).f154416j)), new C13604l("panel_sence", "3")));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 5);
        jSONObject.put("type", 1);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.MENU_OPTION, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31331h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C10125e1.C10126a aVar;
        C87412m.m108594g(e1Var, "<this>");
        String str = e1Var.f30980a;
        Log.m105924i(str, "share2Friend isLandscape:" + e1Var.f30987f);
        if (!e1Var.f30987f || (C85875k4.m106210y() && !C85875k4.m106157N())) {
            mo10577v(e1Var);
            e1Var.mo10539g(C58124b.C58125b.FINDER_LIVE_MORE_ACTION_HIDE, (Bundle) null);
            return;
        }
        e1Var.mo10539g(C58124b.C58125b.FINDER_LIVE_MORE_ACTION_HIDE, (Bundle) null);
        C10125e1.C10127b bVar = e1Var.f30988g;
        if (bVar != null && (aVar = bVar.f31008a) != null) {
            aVar.mo10541a(new C10276a(this, e1Var));
        }
    }

    /* renamed from: v */
    public final void mo10577v(C10125e1 e1Var) {
        C10125e1 e1Var2 = e1Var;
        Class cls = C55001u.class;
        C87412m.m108594g(e1Var2, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 5);
        jSONObject.put("type", 2);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.MENU_OPTION, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null && aVar.mo85682Z()) {
            C76912y0.makeText(MMApplicationContext.getContext(), (int) C0966R.string.mrb, 1).show();
            return;
        }
        MMActivity mMActivity = e1Var2.f30985d;
        C7335d c2 = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c2, C54067f0.C0064m.PANEL_UNLIKE_BUTTON, C90364q0.m113148g(new C13604l("liveId", String.valueOf(((C55001u) e1Var2.mo10534b(cls)).f154420q.f182392d)), new C13604l("feedId", String.valueOf(((C55001u) e1Var2.mo10534b(cls)).f154416j)), new C13604l("panel_sence", "3")), (String) null, 4, (Object) null);
        C55001u uVar = (C55001u) e1Var2.mo10534b(cls);
        C89059e i = new C58278c0(uVar.f154416j, uVar.f154423t, 1, 0, ((C60172g4) C39818r.f106831a.mo62444c(mMActivity).mo62447c(C60172g4.class)).mo12861q3(), 1).mo9225i();
        i.mo123420E(new C10277b(e1Var2));
        i.mo11397F(mMActivity);
    }
}
