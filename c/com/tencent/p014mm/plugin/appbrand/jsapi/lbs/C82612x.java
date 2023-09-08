package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.Map;
import ke3.C88144b;
import nj3.C11184p0;
import qo3.C77407n;
import x22.C91134d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.x */
public class C82612x implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f241745d;

    /* renamed from: e */
    public final /* synthetic */ C77407n f241746e;

    /* renamed from: f */
    public final /* synthetic */ C82613z f241747f;

    public C82612x(C82613z zVar, C81925i2 i2Var, C77407n nVar) {
        this.f241747f = zVar;
        this.f241745d = i2Var;
        this.f241746e = nVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() != 2) {
            Map<String, String> map = this.f241747f.f241748h;
            if (map != null) {
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry next = it.next();
                    if (((String) next.getValue()).equals(menuItem.getTitle())) {
                        C82613z zVar = this.f241747f;
                        ((C91134d) zVar.f241754q).mo125198e(zVar.f241752o, zVar.f241753p, (String) next.getKey(), false);
                        break;
                    }
                }
            }
        } else {
            Log.m105925i("MicroMsg.JsApiOpenMapApp", "click tencent map: %s", Boolean.valueOf(this.f241747f.f241748h.containsKey("com.tencent.map")));
            boolean containsKey = this.f241747f.f241748h.containsKey("com.tencent.map");
            Log.m105925i("MicroMsg.JsApiOpenMapApp", "install tencent map: %s.", Boolean.valueOf(containsKey));
            if (containsKey) {
                C82613z zVar2 = this.f241747f;
                ((C91134d) zVar2.f241754q).mo125198e(zVar2.f241752o, zVar2.f241753p, "com.tencent.map", false);
            } else {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", "http://mapdownload.map.qq.com/?key=wx&referer=wx1&channel=00008");
                C88144b.m109791i(this.f241745d.mo114344o0(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
        this.f241746e.mo107572p();
    }
}
