package com.tencent.p014mm.plugin.webview.luggage;

import android.graphics.Color;
import android.webkit.ValueCallback;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.luggage.z */
public class C6019z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C43658n f22266d;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.z$a */
    public class C6020a implements ValueCallback<String> {
        public C6020a() {
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            Log.m105919d("MicroMsg.LuggageMMWebPage", "get background color s = %s", str);
            if (!Util.isNullOrNil(str)) {
                int color = C6019z.this.f22266d.f148196d.getResources().getColor(C0966R.color.akq);
                if (C43658n.f117909a1.matcher(str).matches()) {
                    String[] split = str.replaceAll(FastJsonResponse.QUOTE, "").replaceFirst("rgba", "").replaceFirst("\\(", "").replaceFirst("\\)", "").split(",");
                    if (split.length == 4) {
                        try {
                            color = Color.argb(Util.getInt(Util.nullAsNil(split[3]).trim(), 0), Util.getInt(Util.nullAsNil(split[0]).trim(), 0), Util.getInt(Util.nullAsNil(split[1]).trim(), 0), Util.getInt(Util.nullAsNil(split[2]).trim(), 0));
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.LuggageMMWebPage", "handle bgColor from html, bgColor = %s, exception = %s", str, e);
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (C43658n.f117910b1.matcher(str).matches()) {
                    String[] split2 = str.replaceAll(FastJsonResponse.QUOTE, "").replaceFirst("rgb", "").replaceFirst("\\(", "").replaceFirst("\\)", "").split(",");
                    if (split2.length == 3) {
                        try {
                            color = Color.argb(255, Util.getInt(Util.nullAsNil(split2[0]).trim(), 0), Util.getInt(Util.nullAsNil(split2[1]).trim(), 0), Util.getInt(Util.nullAsNil(split2[2]).trim(), 0));
                        } catch (Exception e2) {
                            Log.m105921e("MicroMsg.LuggageMMWebPage", "handle bgColor from html, bgColor = %s, exception = %s", str, e2);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    Log.m105919d("MicroMsg.LuggageMMWebPage", "handle bgColor from html, bgColor = %s, can not match", str);
                }
                C6019z.this.f22266d.f117948r.setBackgroundColor(color);
                C6019z.this.f22266d.f117948r.setPullDownViewVisibility(8);
            }
        }
    }

    public C6019z(C43658n nVar) {
        this.f22266d = nVar;
    }

    public void run() {
        this.f22266d.f117947q.evaluateJavascript("javascript:(function(){return window.getComputedStyle(document.body,null).backgroundColor})()", new C6020a());
    }
}
