package fk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wexnet.WeXNet;
import java.util.HashMap;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: fk0.b */
public final class C86910b extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 1180;
    public static final String NAME = "getInferenceEnvInfo";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar != null) {
            try {
                HashMap hashMap = new HashMap();
                WeXNet.Companion.mo120038a();
                hashMap.put("ver", WeXNet.getXNetRuntimeVer());
                C13598b0 b0Var = C13598b0.f38549a;
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                hashMap.put("errno", 0);
                fVar.mo109647a(i, mo115114o("ok", hashMap));
            } catch (WeXNet.C86022a.C86023a unused) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 2004010, "fail:environment not ready");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 2004010);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                fVar.mo109647a(i, mo115115p("fail:environment not ready", jSONObject2));
            }
        }
    }
}
