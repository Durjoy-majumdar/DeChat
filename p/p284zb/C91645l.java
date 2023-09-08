package p284zb;

import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPluginPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zb.l */
public final class C91645l {

    /* renamed from: a */
    public final String f262619a;

    /* renamed from: b */
    public final String f262620b = "Luggage.FULL.EventOnSubPackageReady";

    public C91645l(String str) {
        C87412m.m108594g(str, "moduleName");
        this.f262619a = str;
    }

    /* renamed from: a */
    public final void mo125537a(C81925i2 i2Var) {
        WxaPkgWrappingInfo wxaPkgWrappingInfo;
        WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap;
        List<WxaPluginPkgInfo> b;
        C87412m.m108594g(i2Var, "service");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("moduleName", this.f262619a);
            AppBrandSysConfigLU appBrandSysConfigLU = (AppBrandSysConfigLU) i2Var.mo109671p(AppBrandSysConfigLU.class);
            if (!(appBrandSysConfigLU == null || (wxaPkgWrappingInfo = appBrandSysConfigLU.f261072r) == null || (wxaRuntimeModulePluginListMap = wxaPkgWrappingInfo.f238590i) == null || (b = wxaRuntimeModulePluginListMap.mo113464b(this.f262619a)) == null)) {
                JSONArray jSONArray = new JSONArray();
                for (WxaPluginPkgInfo wxaPluginPkgInfo : b) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("plugin_id", wxaPluginPkgInfo.provider);
                    jSONObject2.put("custom_version", wxaPluginPkgInfo.stringVersion);
                    jSONObject2.put("prefix_path", wxaPluginPkgInfo.prefixPath);
                    jSONObject2.put("inner_version", wxaPluginPkgInfo.version);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("separatedPlugins", jSONArray);
            }
            String jSONObject3 = jSONObject.toString();
            C87412m.m108593f(jSONObject3, "try {\n            JSONOb…         return\n        }");
            String str = this.f262620b;
            Log.m105924i(str, "dispatch appId(" + i2Var.getAppId() + ") onSubPackageReady(" + jSONObject3 + ')');
            i2Var.mo114339j0("onSubPackageReady", jSONObject3);
        } catch (JSONException unused) {
            String str2 = this.f262620b;
            Log.m105920e(str2, "dispatch with service(" + i2Var.getAppId() + "), create data failed");
        }
    }
}
