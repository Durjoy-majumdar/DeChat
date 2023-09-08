package wk2;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60216z4;
import java.util.Map;
import org.json.JSONObject;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import xk2.C15805b;

/* renamed from: wk2.m */
public final class C15493m extends C15805b {

    /* renamed from: f */
    public static final C15493m f42024f = new C15493m();

    /* renamed from: g */
    public static final String f42025g = "openFinderView";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.JsApiOpenFinderView", "openFinderView");
        String str = (String) h1Var.f38983a.get("extInfo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("extInfo", new JSONObject(str));
            C7335d c = C86312j.m106911c(C60200t1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C60200t1.C60201a.m70364b((C60200t1) c, context, jSONObject.toString(), (C60216z4.C8821a) null, 4, (Object) null);
            C13849g gVar = jVar.f39001d;
            String str2 = h1Var.f38990c;
            gVar.mo10774a(str2, h1Var.f38996i + ":fail", (Map<String, Object>) null);
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.JsApiOpenFinderView", e, "openFinderView exception", new Object[0]);
            C13849g gVar2 = jVar.f39001d;
            String str3 = h1Var.f38990c;
            gVar2.mo10774a(str3, h1Var.f38996i + ":fail", (Map<String, Object>) null);
            return false;
        }
    }

    /* renamed from: c */
    public String mo7288c() {
        return f42025g;
    }
}
