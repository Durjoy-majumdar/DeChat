package wn0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45698f;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import kr0.C88267e;
import org.json.JSONObject;
import te3.C52109yf2;
import te3.C52129yk2;

/* renamed from: wn0.c */
public abstract class C53190c extends C82268c<C88267e> {
    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Iterator<String> keys;
        C88267e eVar = (C88267e) fVar;
        if (eVar != null) {
            if (jSONObject == null) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                eVar.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject2));
                return;
            }
            TransferRequestInfo transferRequestInfo = new TransferRequestInfo();
            transferRequestInfo.f109024d = mo73868x();
            String optString = jSONObject.optString("scope");
            if (optString == null) {
                optString = "";
            }
            transferRequestInfo.f109026f = optString;
            transferRequestInfo.f109031n = jSONObject.optBoolean("needVerifySignature", false);
            transferRequestInfo.f109029i = jSONObject.optBoolean("is_security_check", false);
            transferRequestInfo.f109032o = eVar.getAppId();
            transferRequestInfo.f109025e = "";
            C52129yk2 yk22 = new C52129yk2();
            String optString2 = jSONObject.optString("reqUrl");
            if (optString2 == null) {
                optString2 = "";
            }
            yk22.f145341d = optString2;
            String optString3 = jSONObject.optString("reqBody");
            if (optString3 == null) {
                optString3 = "";
            }
            yk22.f145342e = optString3;
            yk22.f145343f = jSONObject.optInt("cgiCmdId", 0);
            yk22.f145345h = jSONObject.optInt(FirebaseAnalytics.C113379b.METHOD, 0);
            transferRequestInfo.f109028h = yk22;
            JSONObject optJSONObject = jSONObject.optJSONObject("header");
            if (!(optJSONObject == null || (keys = optJSONObject.keys()) == null)) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString4 = optJSONObject.optString(next);
                    if (optString4 == null) {
                        optString4 = "";
                    }
                    LinkedList<C52109yf2> linkedList = transferRequestInfo.f109028h.f145344g;
                    C52109yf2 yf22 = new C52109yf2();
                    yf22.f145258d = next;
                    yf22.f145259e = optString4;
                    linkedList.push(yf22);
                }
            }
            ((C45698f) C86709a0.m107533q(C45698f.class)).mo71195RT(transferRequestInfo, new C53189b(this, i, eVar));
        }
    }

    /* renamed from: w */
    public abstract String mo73867w();

    /* renamed from: x */
    public abstract int mo73868x();
}
