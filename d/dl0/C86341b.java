package dl0;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.openim.model.OpenImKefuStartChattingResultReceiver;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82967h0;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import he0.C46025n;
import he0.C59837i;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C49810i73;
import te3.C51195s3;
import te3.C90449z73;

/* renamed from: dl0.b */
public class C86341b extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 1040;
    private static final String NAME = "openCustomerServiceChat";

    /* renamed from: A */
    public int mo120727A(C81925i2 i2Var, JSONObject jSONObject, JSONObject jSONObject2) {
        C87412m.m108594g(jSONObject, "extInfo");
        C87412m.m108594g(jSONObject2, "data");
        return 8;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        AppBrandRuntimeWC J1;
        C81925i2 i2Var = (C81925i2) fVar;
        String str = null;
        String optString = jSONObject != null ? jSONObject.optString("extInfo") : null;
        Log.m105925i("MicroMsg.JsApiOpenCustomerServiceChat", "alvinluo openCustomerServiceChat extInfo: %s", optString);
        if (optString == null || optString.length() == 0) {
            mo120730y(i2Var, i, 1, "extInfo empty");
            return;
        }
        JSONObject jSONObject2 = new JSONObject(optString);
        String optString2 = jSONObject2.optString("url");
        if (optString2 == null || optString2.length() == 0) {
            Log.m105920e("MicroMsg.JsApiOpenCustomerServiceChat", "alvinluo openCustomerServiceChat url invalid");
            mo120730y(i2Var, i, 1, "url empty");
            return;
        }
        int A = mo120727A(i2Var, jSONObject2, jSONObject);
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = "";
        String optString3 = jSONObject2.optString("url", str2);
        OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new OpenIMKefuStartConversationRequest();
        openIMKefuStartConversationRequest.f108515d = i2Var != null ? i2Var.getContext() : null;
        openIMKefuStartConversationRequest.f108516e = currentTimeMillis;
        openIMKefuStartConversationRequest.f108517f = A;
        C51195s3 s3Var = new C51195s3();
        s3Var.f141285d = optString3;
        C49810i73 i732 = new C49810i73();
        i732.f135156f = optString3;
        i732.f135154d = openIMKefuStartConversationRequest.f108517f;
        i732.f135155e = mo120731z(i2Var, jSONObject2, jSONObject);
        s3Var.f141288g = i732;
        openIMKefuStartConversationRequest.f108520i = s3Var;
        openIMKefuStartConversationRequest.f108519h = C46025n.m51344a(openIMKefuStartConversationRequest.f108517f);
        C90449z73 z732 = new C90449z73();
        boolean optBoolean = jSONObject.optBoolean("showMessageCard", false);
        z732.f259951d = optBoolean;
        if (optBoolean) {
            z732.f259952e = jSONObject.optString("sendMessageTitle");
            z732.f259953f = jSONObject.optString("sendMessagePath");
            String optString4 = jSONObject.optString("sendMessageImg");
            z732.f259954g = optString4;
            z732.f259955h = Util.isNullOrNil(optString4);
            if (i2Var instanceof C88267e) {
                z732.f259956i = C82967h0.m101763b(C82967h0.m101766e(((C88267e) i2Var).mo114341l0(), z732.f259954g, true));
            }
            if (mo120729x()) {
                z732.f259967w = jSONObject.optString("sendMessageHintTitle");
                JSONObject optJSONObject = jSONObject.optJSONObject("sendMessageParam");
                z732.f259968x = optJSONObject != null ? optJSONObject.toString() : null;
            }
        }
        if (i2Var instanceof C88267e) {
            C83928t1 M0 = ((C88267e) i2Var).mo114341l0();
            AppBrandSysConfigWC S1 = (M0 == null || (J1 = M0.getRuntime()) == null) ? null : J1.mo113213o1();
            if (S1 != null) {
                z732.f259957j = M0.getAppId();
                z732.f259958n = AppBrandRuntimeWCAccessible.m99325a(i2Var);
                z732.f259959o = S1.f261061d;
                z732.f259960p = S1.f261063f;
                z732.f259961q = S1.f261072r.f238585d;
                z732.f259962r = S1.f261072r.pkgVersion;
                z732.f259963s = S1.f261072r.md5;
                String Q0 = M0.mo116162Q0();
                Log.m105919d("MicroMsg.JsApiOpenCustomerServiceChat", "getCurrentPageId %s", Q0);
                z732.f259965u = Q0;
                z732.f259966v = C83727p2.m102773c(M0.getAppId());
            }
        }
        openIMKefuStartConversationRequest.f108529u.putExtra("key_appbrand_chat_info", z732.toByteArray());
        Intent intent = openIMKefuStartConversationRequest.f108529u;
        if (i2Var != null) {
            str = i2Var.getAppId();
        }
        if (str != null) {
            str2 = str;
        }
        jSONObject.put("appId", str2);
        C13598b0 b0Var = C13598b0.f38549a;
        intent.putExtra("key_appbrand_check_bind_info", jSONObject.toString());
        Intent intent2 = new Intent();
        openIMKefuStartConversationRequest.f108528t = intent2;
        Handler createFreeHandler = MMHandler.createFreeHandler(Looper.getMainLooper());
        C87412m.m108593f(createFreeHandler, "createFreeHandler(Looper.getMainLooper())");
        intent2.putExtra("key_result_receiver", new OpenImKefuStartChattingResultReceiver(createFreeHandler, new C86339a(this, i2Var, i)));
        mo120728w(openIMKefuStartConversationRequest);
        C59837i iVar = (C59837i) C86312j.m106911c(C59837i.class);
        if (iVar != null) {
            iVar.mo71855jT(openIMKefuStartConversationRequest);
        }
        Log.m105925i("MicroMsg.JsApiOpenCustomerServiceChat", "alvinluo openCustomerServiceChat scene: %s, data: %s", Integer.valueOf(A), jSONObject);
    }

    /* renamed from: w */
    public void mo120728w(OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest) {
        C87412m.m108594g(openIMKefuStartConversationRequest, "request");
    }

    /* renamed from: x */
    public boolean mo120729x() {
        return false;
    }

    /* renamed from: y */
    public final void mo120730y(C81925i2 i2Var, int i, int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errCode", Integer.valueOf(i2));
        if (i2 != 0) {
            if (i2Var != null) {
                i2Var.mo109647a(i, mo115112m("fail " + str, hashMap));
            }
        } else if (i2Var != null) {
            i2Var.mo109647a(i, mo115112m("ok", hashMap));
        }
    }

    /* renamed from: z */
    public String mo120731z(C81925i2 i2Var, JSONObject jSONObject, JSONObject jSONObject2) {
        C87412m.m108594g(jSONObject, "extInfo");
        C87412m.m108594g(jSONObject2, "data");
        String appId = i2Var != null ? i2Var.getAppId() : null;
        return appId == null ? "" : appId;
    }
}
