package lm0;

import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Parameter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.HashMap;
import java.util.NoSuchElementException;
import kr0.C88267e;
import org.json.JSONObject;
import rx3.C13604l;
import sx3.C90364q0;
import z04.C112551y;

/* renamed from: lm0.k */
public final class C88592k extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 854;
    public static final String NAME = "operateRecentUsageList";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        boolean z;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C88267e eVar = (C88267e) fVar;
        if (eVar != null && jSONObject2 != null) {
            Log.m105924i("MicroMsg.operateRecentUsageList", "data = " + jSONObject2);
            HashMap e = C90364q0.m113146e(new C13604l(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 1));
            int optInt = jSONObject2.optInt("actionType", -1);
            C88588g[] values = C88588g.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z = true;
                    break;
                }
                if (values[i3].f255847d == optInt) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                sb.append(optInt);
                mo123035w("fail:illegal actionType", sb.toString());
                eVar.mo109647a(i2, mo115112m("fail:illegal actionType", e));
                return;
            }
            String optString = jSONObject2.optString("username", "");
            if (optString == null || C112551y.m153811k(optString)) {
                mo123035w("fail:username is empty", "");
                eVar.mo109647a(i2, mo115112m("fail:username is empty", e));
                return;
            }
            String optString2 = jSONObject2.optString("appId", "");
            if (optString2 == null || C112551y.m153811k(optString2)) {
                mo123035w("fail:appId is empty", "");
                eVar.mo109647a(i2, mo115112m("fail:appId is empty", e));
                return;
            }
            int optInt2 = jSONObject2.optInt("versionType", -1);
            if (optInt2 == -1) {
                mo123035w("fail:versionType is empty", "");
                eVar.mo109647a(i2, mo115112m("fail:versionType is empty", e));
                return;
            }
            String str = WeChatProcess.PROCESS_MAIN;
            for (C88588g gVar : C88588g.values()) {
                if (gVar.f255847d == optInt) {
                    C87412m.m108593f(optString, "username");
                    C87412m.m108593f(optString2, "appId");
                    C80907o.m98781d(str, new JsApiOperateRecentUsageList$Companion$Parameter(gVar, optString, optString2, optInt2), C88590i.class, new C88591j(eVar, i2, this));
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    /* renamed from: w */
    public final String mo123035w(String str, String str2) {
        Log.m105928w("MicroMsg.operateRecentUsageList", str + str2);
        return str;
    }
}
