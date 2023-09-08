package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.C43685w;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewInputFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import kg3.C76577a;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.k2 */
public class C43617k2 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "showSmileyPanel";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Log.m105924i("MicroMsg.JsApiShowSmileyPanel", "invokeInOwn");
        C43658n nVar = (C43658n) aVar.f148189a;
        int i = 0;
        if (nVar.f117953w != null) {
            if (Thread.currentThread().getId() == nVar.f117925P.getLooper().getThread().getId()) {
                WebViewInputFooter webViewInputFooter = nVar.f117953w;
                webViewInputFooter.setVisibility(0);
                LinearLayout linearLayout = webViewInputFooter.f119992q;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                webViewInputFooter.f119994s = true;
                webViewInputFooter.f119985g = 1;
                i = webViewInputFooter.mo68985c();
            } else {
                i = ((Integer) new C43685w(nVar, 1000, 0).exec(nVar.f117925P)).intValue();
            }
        }
        if (i > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("height", Integer.valueOf(C76577a.m92152c(((C43658n) aVar.f148189a).f148196d, i)));
            aVar.mo73779d(hashMap);
            return;
        }
        aVar.mo73778c("fail", (JSONObject) null);
    }
}
