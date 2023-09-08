package com.tencent.p014mm.plugin.webview.luggage;

import android.webkit.WebResourceResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import js0.C88016e;
import p826uc.C52512c;

/* renamed from: com.tencent.mm.plugin.webview.luggage.l */
public class C43629l implements C52512c {

    /* renamed from: a */
    public String f117884a;

    public C43629l(String str) {
        this.f117884a = str;
    }

    /* renamed from: a */
    public WebResourceResponse mo25133a(String str) {
        String e = C88016e.m109548e("LuggageBridge.js");
        try {
            WebResourceResponse webResourceResponse = new WebResourceResponse("application/javascript", "utf-8", new ByteArrayInputStream((e + this.f117884a).getBytes("UTF-8")));
            HashMap hashMap = new HashMap();
            hashMap.put("Cache-Control", "no-cache, no-store, must-revalidate");
            hashMap.put("Pragma", "no-cache");
            hashMap.put("Expires", "0");
            webResourceResponse.setResponseHeaders(hashMap);
            return webResourceResponse;
        } catch (Exception e2) {
            Log.printDebugStack("MicroMsg.LuggageMMJsBridgeResourceProvider", "", e2);
            return null;
        }
    }

    /* renamed from: b */
    public String mo25134b() {
        return "weixin://bridge.js";
    }
}
