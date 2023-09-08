package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.z6 */
public class C83137z6 {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.z6$a */
    public class C83138a implements ValueCallback<String> {
        public void onReceiveValue(Object obj) {
            Log.m105925i("MicroMsg.JsScriptEvaluatorWC", "hy: value ret: %s", (String) obj);
        }
    }

    /* renamed from: a */
    public static void m101976a(C83165i iVar, String str, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "{}";
        }
        Log.m105919d("MicroMsg.JsScriptEvaluatorWC", "hy: dispatch, event: %s, data size: %s, srcId: %d", str, Integer.valueOf(str2.length()), Integer.valueOf(i));
        iVar.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler('%s', %s)", new Object[]{str, str2}), new C83138a());
    }
}
