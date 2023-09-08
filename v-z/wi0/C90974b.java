package wi0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: wi0.b */
public final class C90974b {
    /* renamed from: a */
    public static final void m114134a(String str, JSONObject jSONObject, boolean z) {
        JSONArray optJSONArray;
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(jSONObject, "injectConfig");
        long nowMilliSecond = Util.nowMilliSecond();
        JSONObject optJSONObject = jSONObject.optJSONObject("tabBar");
        if (!(optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("list")) == null)) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                optJSONArray.getJSONObject(i).remove("iconData");
                optJSONArray.getJSONObject(i).remove("selectedIconData");
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("subPackages");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                optJSONArray2.getJSONObject(i2).remove("pages");
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("subpackages");
        if (optJSONArray3 != null) {
            int length3 = optJSONArray3.length();
            for (int i3 = 0; i3 < length3; i3++) {
                optJSONArray3.getJSONObject(i3).remove("pages");
            }
        }
        if (z) {
            jSONObject.remove("page");
            jSONObject.remove("preloadRule");
        }
        jSONObject.remove("preloadResources");
        jSONObject.remove("preloadSubpackages");
        jSONObject.remove("manualSplashScreen");
        jSONObject.remove("useCommandBuffer");
        jSONObject.remove("permission");
        jSONObject.remove("navigateToMiniProgramAppIdList");
        long nowMilliSecond2 = Util.nowMilliSecond();
        Log.m105918d("Luggage.WXA.AppBrandAppConfigTrimHelper", "trimOffInjectConfigFields appId[" + str + "] cost[" + (nowMilliSecond2 - nowMilliSecond) + "ms]");
    }
}
