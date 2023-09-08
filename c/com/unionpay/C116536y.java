package com.unionpay;

import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.unionpay.y */
public final class C116536y implements C116517b0 {

    /* renamed from: a */
    public final String f349506a;

    /* renamed from: b */
    public final /* synthetic */ C116516b f349507b;

    public C116536y(C116516b bVar, String str) {
        this.f349507b = bVar;
        this.f349506a = str;
    }

    /* renamed from: a */
    public final void mo180515a(String str) {
        C116516b bVar = this.f349507b;
        String str2 = this.f349506a;
        bVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("responseId", str2);
        hashMap.put("responseData", str);
        bVar.f349480e.runOnUiThread(new C116535x(bVar, String.format("javascript:WebViewJavascriptBridge._handleMessageFromJava('%s');", new Object[]{new JSONObject(hashMap).toString().replace("\\", "\\\\").replace(FastJsonResponse.QUOTE, "\\\"").replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f")})));
    }
}
