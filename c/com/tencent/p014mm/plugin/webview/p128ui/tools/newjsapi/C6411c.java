package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1769p1;
import com.tencent.p014mm.sdk.platformtools.Log;
import f62.C7994b0;
import java.util.HashMap;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.c */
public final class C6411c extends C15053a {

    /* renamed from: d */
    public static final C6411c f23393d = new C6411c();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.c$a */
    public static final class C6412a implements C7994b0.C7995a {

        /* renamed from: a */
        public final /* synthetic */ String f23394a;

        /* renamed from: b */
        public final /* synthetic */ C13855j f23395b;

        /* renamed from: c */
        public final /* synthetic */ C13851h1 f23396c;

        public C6412a(String str, C13855j jVar, C13851h1 h1Var) {
            this.f23394a = str;
            this.f23395b = jVar;
            this.f23396c = h1Var;
        }

        /* renamed from: a */
        public final void mo1112a(boolean z, String str, String str2) {
            if (z) {
                if (str2 == null || str2.length() == 0) {
                    Log.m105924i("MicroMsg.JsApiAppBindGroup.", "success:" + this.f23394a);
                    HashMap hashMap = new HashMap();
                    hashMap.put("openId", str2);
                    C13849g gVar = this.f23395b.f39001d;
                    String str3 = this.f23396c.f38990c;
                    C6411c.f23393d.getClass();
                    gVar.mo10774a(str3, "bindGroup:success", hashMap);
                    return;
                }
            }
            Log.m105924i("MicroMsg.JsApiAppBindGroup.", "fail:" + str);
            C13849g gVar2 = this.f23395b.f39001d;
            String str4 = this.f23396c.f38990c;
            C6411c.f23393d.getClass();
            gVar2.mo10774a(str4, "bindGroup:fail", (Map<String, Object>) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r9, t83.C13851h1 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r10, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.f38983a
            java.lang.String r1 = "url"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0029
            int r4 = r0.length()
            if (r4 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r4 = 0
            goto L_0x002a
        L_0x0029:
            r4 = 1
        L_0x002a:
            java.lang.String r5 = "bindGroup:fail"
            java.lang.String r6 = "MicroMsg.JsApiAppBindGroup."
            if (r4 == 0) goto L_0x003e
            java.lang.String r0 = "url is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            t83.g r9 = r9.f39001d
            java.lang.String r10 = r10.f38990c
            r9.mo10774a(r10, r5, r2)
            return r3
        L_0x003e:
            t83.g r4 = r9.f39001d
            boolean r7 = r4 instanceof t83.C48590l
            if (r7 == 0) goto L_0x0050
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler"
            gy3.C87412m.m108592e(r4, r7)
            t83.l r4 = (t83.C48590l) r4
            java.lang.String r0 = r4.mo73253q(r0)
            goto L_0x0051
        L_0x0050:
            r0 = r2
        L_0x0051:
            if (r0 == 0) goto L_0x0059
            int r4 = r0.length()
            if (r4 != 0) goto L_0x005a
        L_0x0059:
            r1 = 1
        L_0x005a:
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = "appId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            t83.g r9 = r9.f39001d
            java.lang.String r10 = r10.f38990c
            r9.mo10774a(r10, r5, r2)
            return r3
        L_0x0069:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r10.f38983a
            java.lang.String r4 = "signature"
            java.lang.Object r1 = r1.get(r4)
            boolean r4 = r1 instanceof java.lang.String
            if (r4 == 0) goto L_0x0079
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x007a
        L_0x0079:
            r1 = r2
        L_0x007a:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r10.f38983a
            java.lang.String r5 = "groupId"
            java.lang.Object r4 = r4.get(r5)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L_0x0089
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x008a
        L_0x0089:
            r4 = r2
        L_0x008a:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r10.f38983a
            java.lang.String r6 = "nonceStr"
            java.lang.Object r5 = r5.get(r6)
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L_0x0099
            r2 = r5
            java.lang.String r2 = (java.lang.String) r2
        L_0x0099:
            f62.b0$b r5 = new f62.b0$b
            r5.<init>()
            r5.f26678d = r0
            r5.f26681g = r1
            r5.f26679e = r4
            r5.f26680f = r2
            java.lang.Class<f62.b0> r0 = f62.C7994b0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            f62.b0 r0 = (f62.C7994b0) r0
            android.content.Context r1 = r9.f38998a
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.c$a r2 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.c$a
            r2.<init>(r4, r9, r10)
            r0.mo9096hp(r1, r5, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6411c.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return 376;
    }

    /* renamed from: c */
    public String mo7288c() {
        return C1769p1.NAME;
    }
}
