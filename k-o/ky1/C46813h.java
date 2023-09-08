package ky1;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.webview.luggage.C43626k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53138x;

/* renamed from: ky1.h */
public class C46813h {
    @JavascriptInterface
    public void error(String str) {
        if (str != null) {
            Log.m105921e("MicroMsg.GameV8JsInterface", "js console error : %s", str);
        }
    }

    @JavascriptInterface
    public void log(String str) {
        if (str != null) {
            Log.m105925i("MicroMsg.GameV8JsInterface", "js console log : %s", str);
        }
    }

    @JavascriptInterface
    public void postMessage(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("pageId");
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                C53138x xVar = C43626k0.f117879c.get(optString);
                if (xVar == null) {
                    Log.m105921e("MicroMsg.GameV8JsInterface", "page is null, pageId : %s", optString);
                    return;
                }
                String format = String.format("javascript:WxGameJsCoreBridge.invokeEvent(%s)", new Object[]{optJSONObject.toString()});
                Log.m105925i("MicroMsg.GameV8JsInterface", "postMessage, js = %s", format);
                xVar.f148259i.f148245i.evaluateJavascript(format, (ValueCallback<String>) null);
            } catch (JSONException unused) {
            }
        }
    }
}
