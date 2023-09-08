package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import tm0.C90538k;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.x */
public final class C6578x extends C15053a {

    /* renamed from: d */
    public static final C6578x f23812d = new C6578x();

    /* renamed from: e */
    public static final String f23813e = "MicroMsg.JsApiGetNetWorkType";

    /* renamed from: f */
    public static final int f23814f = 16;

    /* renamed from: g */
    public static final String f23815g = C90538k.NAME;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r12, t83.C13851h1 r13) {
        /*
            r11 = this;
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r13, r0)
            android.content.Context r0 = r12.f38998a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r0)
            r2 = 0
            java.lang.String r3 = "network_type:fail"
            r4 = 1
            if (r1 != 0) goto L_0x0025
            java.lang.String r0 = f23813e
            java.lang.String r1 = "getNetworkType, not connected"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            t83.g r12 = r12.f39001d
            java.lang.String r13 = r13.f38990c
            r12.mo10774a(r13, r3, r2)
            return r4
        L_0x0025:
            com.tencent.mm.plugin.webview.stub.l r1 = r12.f39000c
            r5 = 2
            r6 = 0
            if (r1 == 0) goto L_0x005d
            gy3.C87412m.m108591d(r1)     // Catch:{ Exception -> 0x004d }
            r7 = 110(0x6e, float:1.54E-43)
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ Exception -> 0x004d }
            r8.<init>()     // Catch:{ Exception -> 0x004d }
            android.os.Bundle r1 = r1.mo68114V5(r7, r8)     // Catch:{ Exception -> 0x004d }
            java.lang.String r7 = "env.invoker!!.invokeAsRe…_SIM_CARD_TYPE, Bundle())"
            gy3.C87412m.m108593f(r1, r7)     // Catch:{ Exception -> 0x004d }
            java.lang.String r7 = "sim_card_type"
            int r1 = r1.getInt(r7, r6)     // Catch:{ Exception -> 0x004d }
            if (r1 == 0) goto L_0x005d
            if (r1 == r4) goto L_0x004b
            r1 = 2
            goto L_0x005e
        L_0x004b:
            r1 = 1
            goto L_0x005e
        L_0x004d:
            r1 = move-exception
            java.lang.String r7 = f23813e
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r1 = r1.getMessage()
            r8[r6] = r1
            java.lang.String r1 = "invokeAsResult ex %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r1, r8)
        L_0x005d:
            r1 = 0
        L_0x005e:
            int r7 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r0)
            java.lang.String r8 = f23813e
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r6] = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r5[r4] = r6
            java.lang.String r6 = "getNetworkType, type = %s, simType = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r6, r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r0)
            java.lang.String r7 = "network_type:wwan"
            java.lang.String r9 = "subtype"
            java.lang.String r10 = "simtype"
            if (r6 == 0) goto L_0x00a3
            java.lang.String r0 = "getNetworkType, 2g"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.lang.String r0 = "2g"
            r5.put(r9, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.put(r10, r0)
            t83.g r12 = r12.f39001d
            java.lang.String r13 = r13.f38990c
            r12.mo10774a(r13, r7, r5)
            return r4
        L_0x00a3:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r0)
            if (r6 == 0) goto L_0x00c2
            java.lang.String r0 = "getNetworkType, 3g"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.lang.String r0 = "3g"
            r5.put(r9, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.put(r10, r0)
            t83.g r12 = r12.f39001d
            java.lang.String r13 = r13.f38990c
            r12.mo10774a(r13, r7, r5)
            return r4
        L_0x00c2:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is4G(r0)
            if (r6 == 0) goto L_0x00e1
            java.lang.String r0 = "getNetworkType, 4g"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.lang.String r0 = "4g"
            r5.put(r9, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.put(r10, r0)
            t83.g r12 = r12.f39001d
            java.lang.String r13 = r13.f38990c
            r12.mo10774a(r13, r7, r5)
            return r4
        L_0x00e1:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is5G(r0)
            if (r6 == 0) goto L_0x0100
            java.lang.String r0 = "getNetworkType, 5g"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.lang.String r0 = "5g"
            r5.put(r9, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.put(r10, r0)
            t83.g r12 = r12.f39001d
            java.lang.String r13 = r13.f38990c
            r12.mo10774a(r13, r7, r5)
            return r4
        L_0x0100:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r0)
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = "getNetworkType, wifi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.put(r10, r0)
            t83.g r12 = r12.f39001d
            java.lang.String r13 = r13.f38990c
            java.lang.String r0 = "network_type:wifi"
            r12.mo10774a(r13, r0, r5)
            return r4
        L_0x011c:
            java.lang.String r0 = "getNetworkType, unknown"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            t83.g r12 = r12.f39001d
            java.lang.String r13 = r13.f38990c
            r12.mo10774a(r13, r3, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6578x.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23814f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23815g;
    }
}
