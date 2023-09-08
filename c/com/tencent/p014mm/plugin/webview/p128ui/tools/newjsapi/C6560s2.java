package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.xweb.util.WXWebReporter;
import fm0.C8134n0;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.s2 */
public final class C6560s2 extends C15053a {

    /* renamed from: d */
    public static final C6560s2 f23763d = new C6560s2();

    /* renamed from: e */
    public static final String f23764e = "MicroMsg.JsApiSetNavigationBarColor";

    /* renamed from: f */
    public static final int f23765f = WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS;

    /* renamed from: g */
    public static final String f23766g = C8134n0.NAME;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0097 A[Catch:{ Exception -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c0 A[Catch:{ Exception -> 0x00cb }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r9, t83.C13851h1 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = f23764e
            java.lang.String r1 = "setNavigationBarColor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r10.f38983a
            java.lang.String r2 = "actionCode"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "1"
            boolean r1 = gy3.C87412m.m108589b(r2, r1)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "set_navigation_bar_color_reset"
            r4 = 1
            if (r1 == 0) goto L_0x0032
            r2.putBoolean(r3, r4)
            goto L_0x00e1
        L_0x0032:
            r1 = -1
            java.util.Map<java.lang.String, java.lang.Object> r5 = r10.f38983a     // Catch:{ Exception -> 0x006f }
            java.lang.String r6 = "wxcolor"
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x006f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x006f }
            java.lang.String r5 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.m49071d(r5)     // Catch:{ Exception -> 0x006f }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x006f }
            if (r6 == 0) goto L_0x0052
            java.util.Map<java.lang.String, java.lang.Object> r5 = r10.f38983a     // Catch:{ Exception -> 0x006f }
            java.lang.String r6 = "color"
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x006f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x006f }
        L_0x0052:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006f }
            r6.<init>()     // Catch:{ Exception -> 0x006f }
            java.lang.String r7 = "setNavigationBarColor color = "
            r6.append(r7)     // Catch:{ Exception -> 0x006f }
            r6.append(r5)     // Catch:{ Exception -> 0x006f }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x006f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)     // Catch:{ Exception -> 0x006f }
            int r0 = android.graphics.Color.parseColor(r5)     // Catch:{ Exception -> 0x006f }
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 | r0
            goto L_0x007c
        L_0x006f:
            r0 = move-exception
            java.lang.String r5 = f23764e
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r2.putBoolean(r3, r4)
        L_0x007c:
            r0 = 255(0xff, float:3.57E-43)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r10.f38983a     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = "alpha"
            java.lang.Object r3 = r3.get(r5)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00cb }
            r5 = 0
            if (r3 == 0) goto L_0x0094
            boolean r6 = z04.C112551y.m153811k(r3)     // Catch:{ Exception -> 0x00cb }
            if (r6 == 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r6 = 0
            goto L_0x0095
        L_0x0094:
            r6 = 1
        L_0x0095:
            if (r6 != 0) goto L_0x00d5
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r3, r6)     // Catch:{ Exception -> 0x00cb }
            float r6 = (float) r0     // Catch:{ Exception -> 0x00cb }
            float r3 = r3 * r6
            int r3 = (int) r3     // Catch:{ Exception -> 0x00cb }
            if (r3 < 0) goto L_0x00a7
            if (r3 <= r0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r0 = r3
        L_0x00a7:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r10.f38983a     // Catch:{ Exception -> 0x00cb }
            java.lang.String r6 = "titleAlphaAdjustment"
            java.lang.Object r3 = r3.get(r6)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00cb }
            if (r3 == 0) goto L_0x00bd
            boolean r6 = z04.C112551y.m153811k(r3)     // Catch:{ Exception -> 0x00cb }
            if (r6 == 0) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r6 = 0
            goto L_0x00be
        L_0x00bd:
            r6 = 1
        L_0x00be:
            if (r6 != 0) goto L_0x00d5
            java.lang.String r6 = "set_navigation_bar_color_titleAlphaAdjustment"
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r3, r5)     // Catch:{ Exception -> 0x00cb }
            r2.putBoolean(r6, r3)     // Catch:{ Exception -> 0x00cb }
            goto L_0x00d5
        L_0x00cb:
            r3 = move-exception
            java.lang.String r5 = f23764e
            java.lang.String r3 = r3.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
        L_0x00d5:
            java.lang.String r3 = "set_navigation_bar_color_color"
            r2.putInt(r3, r1)
            java.lang.String r1 = "set_navigation_bar_color_alpha"
            r2.putInt(r1, r0)
        L_0x00e1:
            com.tencent.mm.plugin.webview.stub.m r0 = r9.mo13184d()
            if (r0 == 0) goto L_0x00ec
            r1 = 53
            r0.mo7031V5(r1, r2)
        L_0x00ec:
            t83.g r9 = r9.f39001d
            java.lang.String r10 = r10.f38990c
            r0 = 0
            java.lang.String r1 = "setNavigationBarColor:ok"
            r9.mo10774a(r10, r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6560s2.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23765f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23766g;
    }
}
