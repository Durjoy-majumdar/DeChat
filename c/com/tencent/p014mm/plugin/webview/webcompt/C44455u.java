package com.tencent.p014mm.plugin.webview.webcompt;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C8480h;
import gy3.C87412m;
import java.net.URL;
import java.util.List;
import yc3.C38992a;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.u */
public final class C44455u implements C38992a {

    /* renamed from: a */
    public static final C6610a f120557a = new C6610a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.u$a */
    public static final class C6610a {
        public C6610a(C8480h hVar) {
        }

        /* renamed from: b */
        public static final String m6918b(URL url) {
            String ref = url.getRef();
            C87412m.m108593f(ref, "ref");
            if (!C112551y.m153811k(ref)) {
                return '#' + url.getRef();
            }
            String ref2 = url.getRef();
            C87412m.m108593f(ref2, "ref");
            return ref2;
        }

        /* renamed from: a */
        public final boolean mo7533a() {
            return C6612w.m6920a().containsKey("debug") ? C6612w.m6920a().getBoolean("debug", false) : BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG;
        }
    }

    /* renamed from: b */
    public static final String m48808b(String str) {
        C6610a aVar = f120557a;
        C87412m.m108594g(str, "url");
        if (!aVar.mo7533a()) {
            return str;
        }
        try {
            for (String U : C112550d0.m153785U(C112550d0.m153794d0(str, "#", str), new String[]{"&"}, false, 0, 6, (Object) null)) {
                List U2 = C112550d0.m153785U(U, new String[]{"="}, false, 0, 6, (Object) null);
                if (U2.size() == 2 && C87412m.m108589b(U2.get(0), "mock")) {
                    URL url = new URL(str);
                    return url.getProtocol() + "://" + ((String) U2.get(1)) + url.getFile() + C6610a.m6918b(url);
                }
            }
            URL url2 = new URL(str);
            MultiProcessMMKV a = C6612w.m6920a();
            if (!a.containsKey("mock_" + url2.getHost())) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(url2.getProtocol());
            sb.append("://");
            MultiProcessMMKV a2 = C6612w.m6920a();
            sb.append(a2.getString("mock_" + url2.getHost(), url2.getHost()));
            sb.append(url2.getFile());
            sb.append(C6610a.m6918b(url2));
            return sb.toString();
        } catch (Exception e) {
            Log.printErrStackTrace("WebComptCommand", e, "mockHost", new Object[0]);
            return str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017c, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38a(android.content.Context r4, java.lang.String[] r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r4 = "args"
            gy3.C87412m.m108594g(r5, r4)
            java.lang.String r4 = "username"
            gy3.C87412m.m108594g(r6, r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            r6 = 0
            r0 = 1
            if (r4 != 0) goto L_0x0029
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r4 != 0) goto L_0x0029
            int r4 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            if (r4 != 0) goto L_0x0027
            boolean r4 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r4 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r4 = 0
            goto L_0x002a
        L_0x0029:
            r4 = 1
        L_0x002a:
            if (r4 != 0) goto L_0x002d
            return r6
        L_0x002d:
            java.util.Iterator r4 = gy3.C32617c.m39769a(r5)
            gy3.b r4 = (gy3.C32616b) r4
            java.lang.Object r5 = r4.next()
            java.lang.String r1 = "//webcompt"
            boolean r5 = gy3.C87412m.m108589b(r5, r1)
            if (r5 != 0) goto L_0x0040
            return r6
        L_0x0040:
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            int r1 = r5.hashCode()
            java.lang.String r2 = "debug"
            switch(r1) {
                case -1869744043: goto L_0x015b;
                case 3357066: goto L_0x0127;
                case 94746189: goto L_0x00b3;
                case 95458899: goto L_0x0074;
                case 1541691100: goto L_0x0051;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x017c
        L_0x0051:
            java.lang.String r1 = "debugJS"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x005b
            goto L_0x017c
        L_0x005b:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r2, r0)
            java.lang.Object r4 = r4.next()
            java.lang.String r4 = (java.lang.String) r4
            r5.putString(r1, r4)
            java.lang.String r4 = "webcompt set debugJS"
            com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6921b(r4)
            goto L_0x017b
        L_0x0074:
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x007c
            goto L_0x017c
        L_0x007c:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0092
            java.lang.Object r4 = r4.next()
            java.lang.String r1 = "false"
            boolean r4 = gy3.C87412m.m108589b(r4, r1)
            if (r4 != 0) goto L_0x0093
        L_0x0092:
            r6 = 1
        L_0x0093:
            r5.putBoolean(r2, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "webcompt set debug:"
            r4.append(r5)
            com.tencent.mm.plugin.webview.webcompt.u$a r5 = f120557a
            boolean r5 = r5.mo7533a()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6921b(r4)
            goto L_0x017b
        L_0x00b3:
            java.lang.String r1 = "clear"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x00bd
            goto L_0x017c
        L_0x00bd:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0119
            java.lang.Object r5 = r4.next()
            java.lang.String r1 = "sd"
            boolean r5 = gy3.C87412m.m108589b(r5, r1)
            if (r5 == 0) goto L_0x0119
            boolean r5 = r4.hasNext()
            r1 = 0
            if (r5 == 0) goto L_0x010a
            java.lang.Object r4 = r4.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "jsapi"
            boolean r5 = gy3.C87412m.m108589b(r4, r5)
            if (r5 == 0) goto L_0x00f3
            com.tencent.mm.plugin.webview.webcompt.c$b r4 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
            com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.m48783e(r4, r6, r6, r0, r1)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            java.lang.String r4 = "webcompt clear sdcard jsapi files"
            com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6921b(r4)
            goto L_0x017b
        L_0x00f3:
            java.lang.String r5 = "app"
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 == 0) goto L_0x017b
            com.tencent.mm.plugin.webview.webcompt.c$b r4 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
            r5 = 2
            com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.m48783e(r4, r6, r6, r5, r1)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            java.lang.String r4 = "webcompt clear sdcard app files"
            com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6921b(r4)
            goto L_0x017b
        L_0x010a:
            com.tencent.mm.plugin.webview.webcompt.c$b r4 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
            r5 = 3
            com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.m48783e(r4, r6, r6, r5, r1)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            java.lang.String r4 = "webcompt clear all sdcard files"
            com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6921b(r4)
            goto L_0x017b
        L_0x0119:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
            r4.clear()
            java.lang.String r4 = "webcompt clear all commands"
            com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6921b(r4)
            goto L_0x017b
        L_0x0127:
            java.lang.String r1 = "mock"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0130
            goto L_0x017c
        L_0x0130:
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mock_"
            r1.append(r2)
            java.lang.Object r4 = r4.next()
            java.lang.String r4 = (java.lang.String) r4
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r6.putString(r4, r5)
            java.lang.String r4 = "webcompt mock"
            com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6921b(r4)
            goto L_0x017b
        L_0x015b:
            java.lang.String r1 = "debugA8Key"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0164
            goto L_0x017c
        L_0x0164:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r2, r0)
            java.lang.Object r4 = r4.next()
            java.lang.String r4 = (java.lang.String) r4
            r5.putString(r1, r4)
            java.lang.String r4 = "webcompt set debugA8Key"
            com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6921b(r4)
        L_0x017b:
            return r0
        L_0x017c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.webcompt.C44455u.mo38a(android.content.Context, java.lang.String[], java.lang.String):boolean");
    }
}
