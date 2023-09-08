package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.graphics.Color;
import android.webkit.ValueCallback;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.w1 */
public class C6604w1 implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ WebViewUI f23861a;

    public C6604w1(WebViewUI webViewUI) {
        this.f23861a = webViewUI;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        Log.m105919d("MicroMsg.WebViewUI", "get background color s = %s", str);
        if (!Util.isNullOrNil(str)) {
            int color = this.f23861a.getResources().getColor(C0966R.color.akq);
            if (WebViewUI.f118445G2.matcher(str).matches()) {
                String[] split = str.replaceAll(FastJsonResponse.QUOTE, "").replaceFirst("rgba", "").replaceFirst("\\(", "").replaceFirst("\\)", "").split(",");
                if (split.length == 4) {
                    try {
                        color = Color.argb(Util.getInt(Util.nullAsNil(split[3]).trim(), 0), Util.getInt(Util.nullAsNil(split[0]).trim(), 0), Util.getInt(Util.nullAsNil(split[1]).trim(), 0), Util.getInt(Util.nullAsNil(split[2]).trim(), 0));
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.WebViewUI", "handle bgColor from html, bgColor = %s, exception = %s", str, e);
                        return;
                    }
                } else {
                    return;
                }
            } else if (WebViewUI.f118446H2.matcher(str).matches()) {
                String[] split2 = str.replaceAll(FastJsonResponse.QUOTE, "").replaceFirst("rgb", "").replaceFirst("\\(", "").replaceFirst("\\)", "").split(",");
                if (split2.length == 3) {
                    try {
                        color = Color.argb(255, Util.getInt(Util.nullAsNil(split2[0]).trim(), 0), Util.getInt(Util.nullAsNil(split2[1]).trim(), 0), Util.getInt(Util.nullAsNil(split2[2]).trim(), 0));
                    } catch (Exception e2) {
                        Log.m105921e("MicroMsg.WebViewUI", "handle bgColor from html, bgColor = %s, exception = %s", str, e2);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                Log.m105919d("MicroMsg.WebViewUI", "handle bgColor from html, bgColor = %s, can not match", str);
            }
            this.f23861a.f118531h2.mo68762g(color);
        }
    }
}
