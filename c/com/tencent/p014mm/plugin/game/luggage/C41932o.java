package com.tencent.p014mm.plugin.game.luggage;

import com.tencent.p014mm.p136ui.widget.MMWebView;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.game.luggage.o */
public class C41932o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f112949d;

    /* renamed from: e */
    public final /* synthetic */ Map f112950e;

    /* renamed from: f */
    public final /* synthetic */ MMWebView f112951f;

    public C41932o(String str, Map map, MMWebView mMWebView) {
        this.f112949d = str;
        this.f112950e = map;
        this.f112951f = mMWebView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0235 A[Catch:{ Exception -> 0x0287 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0276 A[Catch:{ Exception -> 0x0287 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0279 A[Catch:{ Exception -> 0x0287 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r20 = this;
            r1 = r20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "; max-age="
            r0.append(r2)
            int r2 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45379m()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = "; httponly"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r1.f112949d
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r4 = r3.getHost()
            java.lang.String r5 = r3.getScheme()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 == 0) goto L_0x003e
            java.lang.String r5 = "http"
        L_0x003e:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            java.lang.String r7 = "MicroMsg.LuggageGetA8KeyUtil"
            if (r6 == 0) goto L_0x004c
            java.lang.String r0 = "host is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            return
        L_0x004c:
            java.lang.String r6 = "."
            boolean r6 = r4.startsWith(r6)
            if (r6 == 0) goto L_0x0069
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "://"
            r6.append(r5)
            r6.append(r4)
            java.lang.String r5 = r6.toString()
            goto L_0x007d
        L_0x0069:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "://."
            r6.append(r5)
            r6.append(r4)
            java.lang.String r5 = r6.toString()
        L_0x007d:
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r9 = 0
            r8[r9] = r5
            java.lang.String r10 = "domain = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r8)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            com.tencent.xweb.CookieManager r10 = com.tencent.xweb.CookieManager.getInstance()
            java.lang.String r10 = r10.getCookie(r5)
            r8[r9] = r10
            java.lang.String r10 = "before set cookies:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r8)
            java.util.Map r8 = r1.f112950e
            java.lang.String r10 = "="
            if (r8 == 0) goto L_0x0108
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0108
            java.util.Map r8 = r1.f112950e
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
            r11 = 0
        L_0x00b0:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x0109
            java.lang.Object r11 = r8.next()
            java.lang.String r11 = (java.lang.String) r11
            com.tencent.xweb.CookieManager r12 = com.tencent.xweb.CookieManager.getInstance()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r13.append(r10)
            java.util.Map r14 = r1.f112950e
            java.lang.Object r14 = r14.get(r11)
            java.lang.String r14 = (java.lang.String) r14
            r13.append(r14)
            java.lang.String r14 = "; max-age=0"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.setCookie(r4, r13)
            com.tencent.xweb.CookieManager r12 = com.tencent.xweb.CookieManager.getInstance()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r13.append(r10)
            java.util.Map r14 = r1.f112950e
            java.lang.Object r11 = r14.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            r13.append(r11)
            r13.append(r2)
            java.lang.String r11 = r13.toString()
            r12.setCookie(r5, r11)
            r11 = 1
            goto L_0x00b0
        L_0x0108:
            r11 = 0
        L_0x0109:
            com.tencent.p014mm.plugin.game.commlib.C41853c.m45371e()     // Catch:{ Exception -> 0x0287 }
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r4 = com.tencent.p014mm.plugin.game.commlib.C41853c.f112797a     // Catch:{ Exception -> 0x0287 }
            if (r4 == 0) goto L_0x0113
            py1.a r4 = r4.A8Key     // Catch:{ Exception -> 0x0287 }
            goto L_0x011e
        L_0x0113:
            com.tencent.p014mm.plugin.game.commlib.C41853c.m45381o()     // Catch:{ Exception -> 0x0287 }
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r4 = com.tencent.p014mm.plugin.game.commlib.C41853c.f112797a     // Catch:{ Exception -> 0x0287 }
            if (r4 == 0) goto L_0x011d
            py1.a r4 = r4.A8Key     // Catch:{ Exception -> 0x0287 }
            goto L_0x011e
        L_0x011d:
            r4 = 0
        L_0x011e:
            r12 = 2
            java.lang.String r13 = "utf-8"
            if (r4 == 0) goto L_0x018e
            java.util.LinkedList<py1.f4> r14 = r4.f127551d     // Catch:{ Exception -> 0x0287 }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r14)     // Catch:{ Exception -> 0x0287 }
            if (r14 != 0) goto L_0x018e
            java.util.LinkedList<py1.f4> r4 = r4.f127551d     // Catch:{ Exception -> 0x0287 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0287 }
        L_0x0131:
            boolean r14 = r4.hasNext()     // Catch:{ Exception -> 0x0287 }
            if (r14 == 0) goto L_0x021f
            java.lang.Object r14 = r4.next()     // Catch:{ Exception -> 0x0287 }
            py1.f4 r14 = (py1.C47580f4) r14     // Catch:{ Exception -> 0x0287 }
            java.lang.String r15 = r14.f127698d     // Catch:{ Exception -> 0x0287 }
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)     // Catch:{ Exception -> 0x0287 }
            if (r15 != 0) goto L_0x018c
            java.lang.String r15 = r14.f127698d     // Catch:{ Exception -> 0x0287 }
            java.lang.String r15 = r3.getQueryParameter(r15)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r8 = r14.f127699e     // Catch:{ Exception -> 0x0287 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x0287 }
            if (r8 == 0) goto L_0x0156
            java.lang.String r8 = r14.f127698d     // Catch:{ Exception -> 0x0287 }
            goto L_0x0158
        L_0x0156:
            java.lang.String r8 = r14.f127699e     // Catch:{ Exception -> 0x0287 }
        L_0x0158:
            java.lang.String r14 = "key = %s, value = %s"
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0287 }
            r6[r9] = r8     // Catch:{ Exception -> 0x0287 }
            r17 = 1
            r6[r17] = r15     // Catch:{ Exception -> 0x0287 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r14, r6)     // Catch:{ Exception -> 0x0287 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)     // Catch:{ Exception -> 0x0287 }
            if (r6 != 0) goto L_0x018c
            com.tencent.xweb.CookieManager r6 = com.tencent.xweb.CookieManager.getInstance()     // Catch:{ Exception -> 0x0287 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r11.<init>()     // Catch:{ Exception -> 0x0287 }
            r11.append(r8)     // Catch:{ Exception -> 0x0287 }
            r11.append(r10)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r8 = java.net.URLEncoder.encode(r15, r13)     // Catch:{ Exception -> 0x0287 }
            r11.append(r8)     // Catch:{ Exception -> 0x0287 }
            r11.append(r2)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r8 = r11.toString()     // Catch:{ Exception -> 0x0287 }
            r6.setCookie(r5, r8)     // Catch:{ Exception -> 0x0287 }
            r11 = 1
        L_0x018c:
            r6 = 1
            goto L_0x0131
        L_0x018e:
            java.lang.String r4 = "uin"
            java.lang.String r4 = r3.getQueryParameter(r4)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r6 = "key"
            java.lang.String r6 = r3.getQueryParameter(r6)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r8 = "pass_ticket"
            java.lang.String r3 = r3.getQueryParameter(r8)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r8 = "uin = %s, key = %s, pass_ticket = %s"
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0287 }
            r10[r9] = r4     // Catch:{ Exception -> 0x0287 }
            r14 = 1
            r10[r14] = r6     // Catch:{ Exception -> 0x0287 }
            r10[r12] = r3     // Catch:{ Exception -> 0x0287 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r10)     // Catch:{ Exception -> 0x0287 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x0287 }
            if (r8 != 0) goto L_0x01d4
            com.tencent.xweb.CookieManager r8 = com.tencent.xweb.CookieManager.getInstance()     // Catch:{ Exception -> 0x0287 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r10.<init>()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r12 = "X-WECHAT-UIN="
            r10.append(r12)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r13)     // Catch:{ Exception -> 0x0287 }
            r10.append(r4)     // Catch:{ Exception -> 0x0287 }
            r10.append(r2)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r4 = r10.toString()     // Catch:{ Exception -> 0x0287 }
            r8.setCookie(r5, r4)     // Catch:{ Exception -> 0x0287 }
        L_0x01d4:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x0287 }
            if (r4 != 0) goto L_0x01f9
            com.tencent.xweb.CookieManager r4 = com.tencent.xweb.CookieManager.getInstance()     // Catch:{ Exception -> 0x0287 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r8.<init>()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r10 = "X-WECHAT-KEY="
            r8.append(r10)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r13)     // Catch:{ Exception -> 0x0287 }
            r8.append(r6)     // Catch:{ Exception -> 0x0287 }
            r8.append(r2)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r6 = r8.toString()     // Catch:{ Exception -> 0x0287 }
            r4.setCookie(r5, r6)     // Catch:{ Exception -> 0x0287 }
        L_0x01f9:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x0287 }
            if (r4 != 0) goto L_0x021f
            com.tencent.xweb.CookieManager r4 = com.tencent.xweb.CookieManager.getInstance()     // Catch:{ Exception -> 0x0287 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r6.<init>()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r8 = "pass_ticket="
            r6.append(r8)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r13)     // Catch:{ Exception -> 0x0287 }
            r6.append(r3)     // Catch:{ Exception -> 0x0287 }
            r6.append(r2)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x0287 }
            r4.setCookie(r5, r2)     // Catch:{ Exception -> 0x0287 }
            r11 = 1
        L_0x021f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r2.<init>()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r3 = "hasSetCookie="
            r2.append(r3)     // Catch:{ Exception -> 0x0287 }
            r2.append(r11)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0287 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)     // Catch:{ Exception -> 0x0287 }
            if (r11 == 0) goto L_0x024d
            com.tencent.xweb.CookieManager r2 = com.tencent.xweb.CookieManager.getInstance()     // Catch:{ Exception -> 0x0287 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r3.<init>()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r4 = "cookie_passkey=1"
            r3.append(r4)     // Catch:{ Exception -> 0x0287 }
            r3.append(r0)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0287 }
            r2.setCookie(r5, r0)     // Catch:{ Exception -> 0x0287 }
        L_0x024d:
            com.tencent.xweb.CookieManager r0 = com.tencent.xweb.CookieManager.getInstance()     // Catch:{ Exception -> 0x0287 }
            r0.flush()     // Catch:{ Exception -> 0x0287 }
            com.tencent.xweb.CookieManager r0 = com.tencent.xweb.CookieManager.getInstance()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = r0.getCookie(r5)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r2 = "after set cookies:%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0287 }
            r3[r9] = r0     // Catch:{ Exception -> 0x0287 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r3)     // Catch:{ Exception -> 0x0287 }
            com.tencent.mm.ui.widget.MMWebView r2 = r1.f112951f     // Catch:{ Exception -> 0x0287 }
            java.lang.String r3 = "javascript:if(window.__GAME_LOGIN_CALLBACK) {window.__GAME_LOGIN_CALLBACK({\"cookie_passkey\":1});}"
            r4 = 0
            r2.evaluateJavascript(r3, r4)     // Catch:{ Exception -> 0x0287 }
            u10.a r14 = u10.C52415a.m58668a()     // Catch:{ Exception -> 0x0287 }
            r15 = 10
            if (r11 == 0) goto L_0x0279
            java.lang.String r2 = "SET_COOKIE_SUCCESS"
            goto L_0x027b
        L_0x0279:
            java.lang.String r2 = "SET_COOKIE_FAIL"
        L_0x027b:
            r16 = r2
            java.lang.String r17 = java.net.URLEncoder.encode(r0, r13)     // Catch:{ Exception -> 0x0287 }
            r18 = 0
            r14.mo62980b(r15, r16, r17, r18)     // Catch:{ Exception -> 0x0287 }
            goto L_0x029e
        L_0x0287:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r3, r2)
            u10.a r8 = u10.C52415a.m58668a()
            r9 = 10
            r12 = 0
            java.lang.String r10 = "SET_COOKIE_FAIL"
            java.lang.String r11 = "exception"
            r8.mo62980b(r9, r10, r11, r12)
        L_0x029e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.C41932o.run():void");
    }
}
