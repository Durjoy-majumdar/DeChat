package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.webkit.JavascriptInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.o */
public class C82865o {

    /* renamed from: a */
    public volatile C82510g f242310a;

    public C82865o(C82510g gVar) {
        this.f242310a = gVar;
    }

    @JavascriptInterface
    public String invokeHandler(String str, String str2, int i) {
        try {
            C82510g gVar = this.f242310a;
            return gVar == null ? "" : gVar.mo114844O(str, str2, "", i);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandJSInterface", e, "invokeHandler", new Object[0]);
            throw e;
        }
    }

    @JavascriptInterface
    public String invokeHandler2(String str, String str2, int i, String str3) {
        try {
            C82510g gVar = this.f242310a;
            return gVar == null ? "" : gVar.mo114844O(str, str2, str3, i);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandJSInterface", e, "invokeHandler", new Object[0]);
            throw e;
        }
    }

    @JavascriptInterface
    public void publishHandler(String str, String str2, String str3) {
        try {
            C82510g gVar = this.f242310a;
            if (gVar != null) {
                int[] iArr = new int[0];
                try {
                    JSONArray jSONArray = new JSONArray(str3);
                    iArr = new int[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        iArr[i] = jSONArray.getInt(i);
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.AppBrandJSInterface", e.getMessage());
                }
                gVar.mo109651e(str, str2, iArr);
            }
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.AppBrandJSInterface", e2, "publishHandler", new Object[0]);
            throw e2;
        }
    }
}
