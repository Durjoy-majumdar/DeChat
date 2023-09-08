package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.c0 */
public class C41910c0 extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "getWePkgAuthResult";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5385e(p828wa.C53096b<com.tencent.p014mm.plugin.game.luggage.page.GameWebPage>.a r12) {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.JsApiGetWePkgAuthResult"
            java.lang.String r1 = "invoke"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            CONTEXT r1 = r12.f148189a
            r2 = r1
            com.tencent.mm.plugin.game.luggage.page.GameWebPage r2 = (com.tencent.p014mm.plugin.game.luggage.page.GameWebPage) r2
            boolean r2 = r2.f117932T
            r3 = 0
            if (r2 == 0) goto L_0x001c
            java.lang.String r1 = "gettingA8Key"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r0 = "auth_result_not_return"
            r12.mo73778c(r0, r3)
            return
        L_0x001c:
            r0 = r1
            com.tencent.mm.plugin.game.luggage.page.GameWebPage r0 = (com.tencent.p014mm.plugin.game.luggage.page.GameWebPage) r0
            java.lang.String r0 = r0.f117928R
            com.tencent.mm.plugin.game.luggage.page.GameWebPage r1 = (com.tencent.p014mm.plugin.game.luggage.page.GameWebPage) r1
            boolean r1 = r1.f112961g1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x006a
            java.lang.String r2 = com.tencent.p014mm.plugin.game.luggage.C41903i.f112900a
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            java.lang.String r6 = "MicroMsg.LuggageGameUinKeyHolder"
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = "fullUrl is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
        L_0x003c:
            r2 = 0
            goto L_0x0064
        L_0x003e:
            int r2 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45379m()
            if (r2 > 0) goto L_0x0045
            goto L_0x003c
        L_0x0045:
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            long r9 = com.tencent.p014mm.plugin.game.luggage.C41903i.f112902c
            long r7 = r7 - r9
            int r2 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45379m()
            long r9 = (long) r2
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x005e
            java.lang.String r2 = "updateTime bigger that one hour"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            goto L_0x003c
        L_0x005e:
            java.lang.String r2 = "hasValidCache"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r2)
            r2 = 1
        L_0x0064:
            if (r2 == 0) goto L_0x006a
            java.lang.String r0 = com.tencent.p014mm.plugin.game.luggage.C41903i.f112900a
            r2 = 1
            goto L_0x006b
        L_0x006a:
            r2 = 0
        L_0x006b:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 == 0) goto L_0x0077
            java.lang.String r0 = "full_url_empty"
            r12.mo73778c(r0, r3)
            goto L_0x00a2
        L_0x0077:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r6 = "set_cookie"
            if (r1 == 0) goto L_0x0088
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r3.put(r6, r1)
            goto L_0x008f
        L_0x0088:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r3.put(r6, r1)
        L_0x008f:
            if (r2 == 0) goto L_0x009a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r2 = "used_cache_uinkey"
            r3.put(r2, r1)
        L_0x009a:
            java.lang.String r1 = "full_url"
            r3.put(r1, r0)
            r12.mo73779d(r3)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.jsapi.C41910c0.mo5385e(wa.b$a):void");
    }
}
