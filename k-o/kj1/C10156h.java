package kj1;

import ak1.C0073g0;
import ak1.C54108o;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C8777j5;
import ke3.C88144b;
import lj1.C10538e;
import nj3.C76874e0;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: kj1.h */
public final class C10156h extends C10538e {

    /* renamed from: h */
    public final int f31090h;

    /* renamed from: i */
    public final String f31091i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10156h(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31090h = e1Var.f30957D;
        this.f31091i = mo10805j() ? "anchorlive.more.help" : "startlive.more.help";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31091i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_HELP_AND_FEEDBACK_ENTRY_ENABLED_BOOLEAN_SYNC, false);
        String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_HELP_AND_FEEDBACK_ENTRY_URL_STRING_SYNC, "");
        if (!g) {
            return false;
        }
        C87412m.m108593f(I, "feedbackUrl");
        return C112551y.m153811k(I) ^ true;
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        int i = this.f31090h;
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.mvr);
        C87412m.m108593f(string, "getContext().resources.g…action_help_and_feedback)");
        mo10807m(e0Var, i, string, C0966R.raw.icons_outlined_help);
        if (mo10805j()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("element", 8);
            jSONObject.put("type", 1);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVING_MENU, jSONObject.toString(), (String) null, 4, (Object) null);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("element", 7);
        jSONObject2.put("type", 1);
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c2, 37, jSONObject2.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31090h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        Intent intent = new Intent();
        intent.putExtra("rawUrl", C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_HELP_AND_FEEDBACK_ENTRY_URL_STRING_SYNC, ""));
        intent.putExtra("convertActivityFromTranslucent", true);
        C88144b.m109791i(e1Var.f30985d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        if (mo10805j()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("element", 8);
            jSONObject.put("type", 2);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVING_MENU, jSONObject.toString(), (String) null, 4, (Object) null);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("element", 7);
        jSONObject2.put("type", 2);
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c2, 37, jSONObject2.toString(), (String) null, 4, (Object) null);
    }
}
