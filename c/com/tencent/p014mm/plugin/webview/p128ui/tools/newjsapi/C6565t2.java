package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.t2 */
public final class C6565t2 extends C15053a {

    /* renamed from: d */
    public static final C6565t2 f23777d = new C6565t2();

    /* renamed from: e */
    public static final String f23778e = "MicroMsg.JsApiSetPageTitle";

    /* renamed from: f */
    public static final int f23779f = 113;

    /* renamed from: g */
    public static final String f23780g = "setPageTitle";

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[Catch:{ Exception -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075 A[Catch:{ Exception -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r8, t83.C13851h1 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = ""
            android.os.Bundle r1 = new android.os.Bundle
            r2 = 2
            r1.<init>(r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r9.f38983a
            java.lang.String r3 = "title"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "set_page_title_text"
            r1.putString(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r9.f38983a     // Catch:{ Exception -> 0x004d }
            java.lang.String r3 = "wxcolor"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x004d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x004d }
            java.lang.String r2 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.m49071d(r2)     // Catch:{ Exception -> 0x004d }
            if (r2 != 0) goto L_0x0035
            r2 = r0
        L_0x0035:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x004b }
            if (r3 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f38983a     // Catch:{ Exception -> 0x004b }
            java.lang.String r4 = "color"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x004b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x004b }
            if (r3 != 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r0 = r3
        L_0x0049:
            r2 = r0
            goto L_0x005a
        L_0x004b:
            r0 = move-exception
            goto L_0x0051
        L_0x004d:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
        L_0x0051:
            java.lang.String r3 = f23778e
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x005a:
            r0 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            java.util.Map<java.lang.String, java.lang.Object> r4 = r9.f38983a     // Catch:{ Exception -> 0x007a }
            java.lang.String r5 = "alpha"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x007a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x007a }
            if (r4 == 0) goto L_0x0072
            boolean r5 = z04.C112551y.m153811k(r4)     // Catch:{ Exception -> 0x007a }
            if (r5 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r5 = 0
            goto L_0x0073
        L_0x0072:
            r5 = 1
        L_0x0073:
            if (r5 != 0) goto L_0x0084
            float r0 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r4, r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x0084
        L_0x007a:
            r4 = move-exception
            java.lang.String r5 = f23778e
            java.lang.String r4 = r4.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)
        L_0x0084:
            java.lang.String r4 = "set_page_title_color"
            r1.putString(r4, r2)
            java.lang.String r2 = "set_page_title_alpha"
            r1.putFloat(r2, r0)
            com.tencent.mm.plugin.webview.stub.m r0 = r8.mo13184d()
            if (r0 == 0) goto L_0x009b
            r2 = 43
            r0.mo7031V5(r2, r1)
        L_0x009b:
            t83.g r8 = r8.f39001d
            java.lang.String r9 = r9.f38990c
            r0 = 0
            java.lang.String r1 = "setPageTitle:ok"
            r8.mo10774a(r9, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6565t2.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23779f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23780g;
    }
}
