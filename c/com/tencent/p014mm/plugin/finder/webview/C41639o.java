package com.tencent.p014mm.plugin.finder.webview;

import android.webkit.JavascriptInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.finder.webview.o */
public final class C41639o {

    /* renamed from: a */
    public float f112081a;

    /* renamed from: b */
    public float f112082b;

    /* renamed from: c */
    public float f112083c;

    /* renamed from: d */
    public String f112084d = "";

    @JavascriptInterface
    public final String getEnv() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("peekHeight", Float.valueOf(this.f112081a));
        jSONObject.put("maxHeight", Float.valueOf(this.f112082b));
        jSONObject.put("currHeight", Float.valueOf(this.f112083c));
        String str = this.f112084d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("jumperExtInfo", str);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "jsonObj.toString()");
        Log.m105924i("Finder.WebViewEnv", "getEnv ");
        return jSONObject2;
    }
}
