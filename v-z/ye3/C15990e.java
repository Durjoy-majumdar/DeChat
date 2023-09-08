package ye3;

import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.qqlogin.ChangeQQLoginTypeManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.StringKtKt;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C31924c1;
import ft3.C8206g;
import gy3.C87412m;
import java.util.Map;
import ob0.C35136m;
import org.json.JSONObject;
import p156gj.C87203t;
import p244tt.C14088e;
import p286zl.C16293k;

/* renamed from: ye3.e */
public final class C15990e implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C87412m.m108594g(str, "subType");
        C87412m.m108594g(map, "values");
        C87412m.m108594g(aVar, "addMsgInfo");
        if (Util.nullAsNil(str).equals("ChangeQQLoginTypeGuidance")) {
            String str2 = map.get(".sysmsg.ChangeQQLoginTypeGuidance.appid");
            String str3 = str2 == null ? "" : str2;
            String str4 = map.get(".sysmsg.ChangeQQLoginTypeGuidance.page");
            String str5 = str4 == null ? "" : str4;
            int safeToInt = StringKtKt.safeToInt(map.get(".sysmsg.ChangeQQLoginTypeGuidance.timeout"));
            String str6 = map.get(".sysmsg.ChangeQQLoginTypeGuidance.uuid");
            if (str6 == null) {
                str6 = "";
            }
            boolean b = C87412m.m108589b(map.get(".sysmsg.ChangeQQLoginTypeGuidance.forceShow"), "yes");
            String str7 = map.get(".sysmsg.ChangeQQLoginTypeGuidance.scene");
            C16293k.C16295b bVar = new C16293k.C16295b(str3, str5, safeToInt, str6, b, str7 == null ? "" : str7, C87412m.m108589b(map.get(".sysmsg.ChangeQQLoginTypeGuidance.syncEscape"), "yes"));
            ChangeQQLoginTypeManager changeQQLoginTypeManager = ChangeQQLoginTypeManager.f24095a;
            ChangeQQLoginTypeManager.f24096b = bVar;
            boolean z = false;
            if (!C8206g.f27135a.mo9260a(str6, C87203t.m108273i(), "ChangeQQLoginType", false)) {
                Log.m105928w("MicroMsg.ChangeQQLoginTypeManager", "ignore ChangeQQLoginTypeInfo: not my info");
                return;
            }
            String str8 = bVar.f43595c;
            C87412m.m108593f(str8, "info.scene");
            ChangeQQLoginTypeManager.f24097c = str8;
            Bundle bundle = new Bundle();
            bundle.putString("appId", bVar.f43593a);
            bundle.putString("page", bVar.f43594b);
            JSONObject jSONObject = new JSONObject();
            String c = C75592q0.m90773c();
            jSONObject.put("username", c == null || c.length() == 0 ? C75592q0.m90789s() : C75592q0.m90773c());
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, bVar.f43595c);
            String str9 = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
            if (!(str9 == null || str9.length() == 0)) {
                jSONObject.put("bindMobile", (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null));
            }
            String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(5, (Object) null));
            if (nullAsNil == null || nullAsNil.length() == 0) {
                z = true;
            }
            if (!z) {
                jSONObject.put("bindEmail", Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(5, (Object) null)));
            }
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …   }\n        }.toString()");
            bundle.putString(SearchIntents.EXTRA_QUERY, jSONObject2);
            bundle.putBoolean("forbidRightGesture", true);
            ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(MMApplicationContext.getContext(), bundle, true, true, new C15988c(bundle));
        }
    }
}
