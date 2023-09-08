package kj1;

import ak1.C0073g0;
import ak1.C54108o;
import android.os.Bundle;
import cl1.C54991o;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
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
import nj3.C76912y0;
import o40.C61926c;
import org.json.JSONObject;
import p244tt.C14088e;
import te3.C64426ho2;

/* renamed from: kj1.u */
public final class C10235u extends C10538e {

    /* renamed from: h */
    public final int f31250h;

    /* renamed from: i */
    public final String f31251i;

    /* renamed from: kj1.u$a */
    public static final class C10236a implements C14088e.C14090b {

        /* renamed from: a */
        public final /* synthetic */ C10125e1 f31252a;

        public C10236a(C10125e1 e1Var) {
            this.f31252a = e1Var;
        }

        /* renamed from: a */
        public void mo1717a() {
            Log.m105924i(this.f31252a.f30980a, "jumpLiteApp success");
        }

        /* renamed from: b */
        public void mo1718b() {
            Log.m105924i(this.f31252a.f30980a, "jumpLiteApp fail");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10235u(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31250h = e1Var.f30962I;
        this.f31251i = mo10805j() ? "anchorlive.more.grow" : "startlive.more.grow";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31251i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return ((C54991o) this.f31809a.mo10534b(C54991o.class)).f154206H != null && C61926c.m72696u((int) C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0), 8);
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        int i = this.f31250h;
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.f360534n72);
        C87412m.m108593f(string, "getContext().resources.g…or_op_promotion_mini_app)");
        mo10808n(e0Var, i, string, C0966R.raw.icons_outlined_popularity_card, MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_0));
        if (mo10805j()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("element", 5);
            jSONObject.put("type", 1);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVING_MENU, jSONObject.toString(), (String) null, 4, (Object) null);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("element", 4);
        jSONObject2.put("type", 1);
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c2, 37, jSONObject2.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31250h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        Class cls = C54108o.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(e1Var, "<this>");
        FinderJumpInfo finderJumpInfo = ((C54991o) e1Var.mo10534b(cls2)).f154206H;
        Integer num = null;
        C64426ho2 ho22 = finderJumpInfo != null ? finderJumpInfo.lite_app_info : null;
        String str = ho22 != null ? ho22.f183521d : null;
        String str2 = ho22 != null ? ho22.f183522e : null;
        String str3 = ho22 != null ? ho22.f183523f : null;
        String str4 = e1Var.f30980a;
        StringBuilder sb = new StringBuilder();
        sb.append("clickAnchorOpPromotionMiniApp anchorOpPromoteMiniAppInfo hash:");
        FinderJumpInfo finderJumpInfo2 = ((C54991o) e1Var.mo10534b(cls2)).f154206H;
        if (finderJumpInfo2 != null) {
            num = Integer.valueOf(finderJumpInfo2.hashCode());
        }
        sb.append(num);
        sb.append(", appId:");
        sb.append(str);
        sb.append(", page:");
        sb.append(str2);
        sb.append(", query:");
        sb.append(str3);
        Log.m105924i(str4, sb.toString());
        if (str == null || str.length() == 0) {
            C76912y0.m92767f(e1Var.f30985d, "请稍候重试");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("appId", str);
            bundle.putString("path", str2);
            bundle.putString(SearchIntents.EXTRA_QUERY, str3);
            ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(e1Var.f30985d, bundle, true, false, new C10236a(e1Var));
        }
        if (mo10805j()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("element", 5);
            jSONObject.put("type", 2);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVING_MENU, jSONObject.toString(), (String) null, 4, (Object) null);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("element", 4);
        jSONObject2.put("type", 2);
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c2, 37, jSONObject2.toString(), (String) null, 4, (Object) null);
    }
}
