package bq0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C86312j;
import dq0.C86390a;
import h81.C32735h;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import sf0.C90188n0;

/* renamed from: bq0.c */
public class C79764c extends C86390a.C86391a {
    /* renamed from: a */
    public void mo109891a(AppBrandRuntime appBrandRuntime, JSONObject jSONObject) {
        super.mo109891a(appBrandRuntime, jSONObject);
        try {
            jSONObject.put("notSupport", ((HashSet) C79766e.f233768b).contains(MD5Util.getMD5String(appBrandRuntime.f238147j)));
            boolean z = false;
            jSONObject.put("switchWebsocket", ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_nodejs_websocket_open, 0));
            String str = C90188n0.f258945m;
            if (str == null) {
                str = "";
            }
            jSONObject.put("jsApiPermissionDebugOn", str.equals("1"));
            if (appBrandRuntime.mo113034V().getStorageSpaceStatistics() != null) {
                z = true;
            }
            jSONObject.put("enableSpaceStatics", z);
        } catch (JSONException unused) {
        }
    }
}
