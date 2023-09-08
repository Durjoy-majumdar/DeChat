package p1031sb;

import android.util.ArrayMap;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.appcache.C1517s3;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPluginPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p963fc.C86812g;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lsb/c;", "Lcom/tencent/mm/plugin/appbrand/jsapi/m;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: sb.c */
public final class C90156c implements C1727m {

    /* renamed from: d */
    public final C86812g f258857d;

    /* renamed from: e */
    public JSONArray f258858e;

    public C90156c(C86812g gVar) {
        C87412m.m108594g(gVar, "rt");
        this.f258857d = gVar;
    }

    /* renamed from: a */
    public final int mo124413a(String str) {
        JSONArray jSONArray;
        WxaPkgWrappingInfo wxaPkgWrappingInfo;
        WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap;
        boolean z = true;
        if (str == null || str.length() == 0) {
            return 0;
        }
        AppBrandSysConfigLU o1 = this.f258857d.mo113051d0();
        if (!(o1 == null || (wxaPkgWrappingInfo = o1.f261072r) == null || (wxaRuntimeModulePluginListMap = wxaPkgWrappingInfo.f238590i) == null)) {
            C87412m.m108594g(str, "pluginId");
            ArrayMap<C1517s3, LinkedList<WxaPluginPkgInfo>> arrayMap = wxaRuntimeModulePluginListMap.f238595e;
            if (arrayMap != null) {
                LinkedList linkedList = arrayMap.get(new C1517s3(str));
                WxaPluginPkgInfo wxaPluginPkgInfo = linkedList != null ? (WxaPluginPkgInfo) C110818d0.m150916N(linkedList) : null;
                if (wxaPluginPkgInfo != null) {
                    return wxaPluginPkgInfo.pkgVersion();
                }
            } else {
                C87412m.m108603p("mSecondaryMap");
                throw null;
            }
        }
        if (this.f258858e == null) {
            String str2 = this.f258857d.mo113036W().f234804H.f239463r;
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (z) {
                jSONArray = new JSONArray();
            } else {
                try {
                    jSONArray = new JSONObject(str2).optJSONArray("call_plugin_info");
                    C87412m.m108593f(jSONArray, "{\n                try {\n…          }\n            }");
                } catch (JSONException e) {
                    Log.m105920e("MicroMsg.AppBrandRuntimePluginInfoConfig", "getPluginInnerVersion(appId:" + str + ") parse call_plugin_info get exception:" + e);
                    return 0;
                }
            }
            this.f258858e = jSONArray;
        }
        JSONArray jSONArray2 = this.f258858e;
        if (jSONArray2 != null) {
            int length = jSONArray2.length();
            int i = 0;
            while (i < length) {
                JSONArray jSONArray3 = this.f258858e;
                if (jSONArray3 != null) {
                    JSONObject optJSONObject = jSONArray3.optJSONObject(i);
                    if (C87412m.m108589b(str, optJSONObject.optString("plugin_id"))) {
                        return optJSONObject.optInt("inner_version");
                    }
                    i++;
                } else {
                    C87412m.m108603p("call_plugin_info");
                    throw null;
                }
            }
            return 0;
        }
        C87412m.m108603p("call_plugin_info");
        throw null;
    }
}
