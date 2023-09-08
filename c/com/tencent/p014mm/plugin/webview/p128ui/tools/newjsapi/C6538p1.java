package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiOpenFinderView;
import com.tencent.p014mm.sdk.platformtools.Log;
import ht1.C60216z4;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.p1 */
public final class C6538p1 implements C60216z4.C8821a<Object> {

    /* renamed from: a */
    public final /* synthetic */ JsApiOpenFinderView.C6390a f23704a;

    /* renamed from: b */
    public final /* synthetic */ C1256g<IPCString> f23705b;

    public C6538p1(JsApiOpenFinderView.C6390a aVar, C1256g<IPCString> gVar) {
        this.f23704a = aVar;
        this.f23705b = gVar;
    }

    /* renamed from: a */
    public void mo6382a(Object obj) {
        Log.m105924i("MicroMsg.JsApiOpenFinderView", "onCallback callbackReportReadInfo");
        JsApiOpenFinderView.C6390a aVar = this.f23704a;
        C1256g<IPCString> gVar = this.f23705b;
        aVar.getClass();
        C13598b0 b0Var = null;
        C13604l lVar = obj instanceof C13604l ? (C13604l) obj : null;
        if (lVar != null) {
            A a = lVar.f38555d;
            Integer num = a instanceof Integer ? (Integer) a : null;
            int intValue = num != null ? num.intValue() : 0;
            B b = lVar.f38556e;
            String str = b instanceof String ? (String) b : null;
            if (str == null) {
                str = "";
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("retCode", intValue);
                jSONObject.put("feed_read_info", str);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenFinderView", e, "alvinluo openFinderView exception", new Object[0]);
            }
            if (gVar != null) {
                gVar.mo894a(new IPCString(jSONObject.toString()));
                b0Var = C13598b0.f38549a;
            }
        }
        if (b0Var == null) {
            Log.m105924i("MicroMsg.JsApiOpenFinderView", "callbackReportReadInfo null");
        }
    }
}
