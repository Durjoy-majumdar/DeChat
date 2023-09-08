package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.q1 */
public final class C6544q1<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23720d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23721e;

    public C6544q1(C13855j jVar, C13851h1 h1Var) {
        this.f23720d = jVar;
        this.f23721e = h1Var;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCString iPCString = (IPCString) obj;
        try {
            JSONObject jSONObject = new JSONObject(iPCString.f10315d);
            int optInt = jSONObject.optInt("retCode");
            HashMap hashMap = new HashMap();
            hashMap.put("retCode", Integer.valueOf(optInt));
            String optString = jSONObject.optString("feed_read_info", "");
            if (!Util.isNullOrNil(optString)) {
                hashMap.put("feed_read_info", optString);
            }
            Log.m105924i("MicroMsg.JsApiOpenFinderView", "IPCInvokeCallback :" + iPCString.f10315d);
            if (optInt == 0) {
                C13849g gVar = this.f23720d.f39001d;
                String str = this.f23721e.f38990c;
                gVar.mo10774a(str, this.f23721e.f38996i + ":ok", hashMap);
                return;
            }
            C13849g gVar2 = this.f23720d.f39001d;
            String str2 = this.f23721e.f38990c;
            gVar2.mo10774a(str2, this.f23721e.f38996i + ":fail open fail", (Map<String, Object>) null);
        } catch (Exception unused) {
            C13849g gVar3 = this.f23720d.f39001d;
            String str3 = this.f23721e.f38990c;
            gVar3.mo10774a(str3, this.f23721e.f38996i + ":fail open fail", (Map<String, Object>) null);
        }
    }
}
