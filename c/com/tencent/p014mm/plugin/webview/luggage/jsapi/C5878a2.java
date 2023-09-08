package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.a2 */
public class C5878a2 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "setScreenOrientation";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r1.equals("vertical_unforced") != false) goto L_0x0039;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5385e(p828wa.C53096b<com.tencent.p014mm.plugin.webview.luggage.C43658n>.a r6) {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.JsApiSetScreenOrientation"
            java.lang.String r1 = "invoke"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            sa.k r1 = r6.f148190b
            org.json.JSONObject r1 = r1.f129368c
            java.lang.String r2 = "orientation"
            java.lang.String r1 = r1.optString(r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x0023
            java.lang.String r1 = "data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            r0 = 0
            java.lang.String r1 = "invalid_data"
            r6.mo73778c(r1, r0)
            return
        L_0x0023:
            r0 = -1
            java.lang.String r2 = "horizontal"
            boolean r2 = r1.equals(r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0030
        L_0x002e:
            r0 = 0
            goto L_0x0059
        L_0x0030:
            java.lang.String r2 = "vertical"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x003b
        L_0x0039:
            r0 = 1
            goto L_0x0059
        L_0x003b:
            java.lang.String r2 = "sensor"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0046
            r0 = 4
            goto L_0x0059
        L_0x0046:
            java.lang.String r2 = "horizontal_unforced"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x004f
            goto L_0x002e
        L_0x004f:
            java.lang.String r2 = "vertical_unforced"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0059
            goto L_0x0039
        L_0x0059:
            CONTEXT r1 = r6.f148189a
            com.tencent.mm.plugin.webview.luggage.n r1 = (com.tencent.p014mm.plugin.webview.luggage.C43658n) r1
            android.os.Bundle r2 = r1.f148261n
            java.lang.String r3 = "screen_orientation"
            r2.putInt(r3, r0)
            r1.mo67936m()
            r6.mo73776a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.jsapi.C5878a2.mo5385e(wa.b$a):void");
    }
}
