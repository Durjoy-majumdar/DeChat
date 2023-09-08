package t83;

import com.tencent.p014mm.plugin.appbrand.C1523c3;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import w83.C15053a;

/* renamed from: t83.m1 */
public final class C13861m1 implements C13853i {

    /* renamed from: b */
    public static final C13861m1 f39016b = new C13861m1();

    /* renamed from: c */
    public static Map<String, C15053a> f39017c = new HashMap();

    /* renamed from: d */
    public static final C13857k f39018d = new C13857k();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8735a(t83.C13855j r11, t83.C13851h1 r12) {
        /*
            r10 = this;
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r12, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r1 = 1
            if (r0 == 0) goto L_0x0023
            int r0 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            if (r1 <= r0) goto L_0x0023
            java.util.Map r0 = r10.mo13194c()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            java.lang.String r2 = "handleMsg jsApis isEmpty"
            junit.framework.Assert.assertTrue(r2, r0)
        L_0x0023:
            java.util.Map r0 = r10.mo13194c()
            java.lang.String r2 = r12.f38996i
            boolean r0 = r0.containsKey(r2)
            r2 = 0
            if (r0 == 0) goto L_0x0189
            java.util.Map r0 = r10.mo13194c()
            java.lang.String r3 = r12.f38996i
            java.lang.Object r0 = r0.get(r3)
            gy3.C87412m.m108591d(r0)
            w83.a r0 = (w83.C15053a) r0
            t83.k r3 = f39018d
            int r4 = r0.mo7287b()
            boolean r4 = r3.mo13186a(r4)
            r5 = 0
            if (r4 == 0) goto L_0x0070
            t83.g r2 = r11.mo13181a()
            java.lang.String r12 = r12.f38990c
            java.lang.String r4 = "system:too_frequent"
            r2.mo10774a(r12, r4, r5)
            android.content.Context r11 = r11.f38998a
            boolean r12 = r11 instanceof com.tencent.p014mm.plugin.webview.core.C5853h
            if (r12 == 0) goto L_0x006f
            com.tencent.mm.plugin.webview.core.h r11 = (com.tencent.p014mm.plugin.webview.core.C5853h) r11
            java.lang.String r11 = r11.getCurrentURL()
            int r12 = r0.mo7287b()
            java.lang.String r0 = r0.mo7288c()
            r3.mo13187b(r12, r0, r11)
        L_0x006f:
            return r1
        L_0x0070:
            int r3 = r0.mo7287b()
            boolean r3 = r11.mo13185e(r3)
            if (r3 == 0) goto L_0x007f
            boolean r4 = r0.mo7286a(r11, r12)
            goto L_0x00ae
        L_0x007f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "handleMsg access denied func: "
            r4.append(r6)
            java.lang.String r6 = r12.f38996i
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "MicroMsg.WebViewJsApiPool"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r12.f38996i
            java.lang.String r6 = "log"
            boolean r4 = gy3.C87412m.m108589b(r4, r6)
            if (r4 != 0) goto L_0x00ad
            t83.g r4 = r11.mo13181a()
            java.lang.String r6 = r12.f38990c
            java.lang.String r7 = "system:access_denied"
            r4.mo10774a(r6, r7, r5)
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            if (r4 != 0) goto L_0x00b9
            boolean r6 = r0.mo7507d()
            if (r6 == 0) goto L_0x00b9
            if (r3 == 0) goto L_0x00b9
            return r2
        L_0x00b9:
            android.content.Context r3 = r11.f38998a
            boolean r6 = r3 instanceof com.tencent.p014mm.plugin.webview.core.C5853h
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x00da
            com.tencent.mm.plugin.webview.core.h r3 = (com.tencent.p014mm.plugin.webview.core.C5853h) r3
            java.lang.String r6 = r3.mo6901n0()
            java.lang.String r8 = r3.getCurrentURL()
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r9 = "srcUsername"
            java.lang.String r3 = r3.getStringExtra(r9)
            t83.C13863o1.m13166b(r6, r8, r3)
            goto L_0x0112
        L_0x00da:
            e00.t r3 = r11.mo13183c()
            if (r3 == 0) goto L_0x00e6
            java.lang.String r3 = r3.mo63683n0()
            if (r3 != 0) goto L_0x00e7
        L_0x00e6:
            r3 = r7
        L_0x00e7:
            e00.t r6 = r11.mo13183c()
            if (r6 == 0) goto L_0x00f3
            java.lang.String r6 = r6.getCurrentUrl()
            if (r6 != 0) goto L_0x00f4
        L_0x00f3:
            r6 = r7
        L_0x00f4:
            int r8 = r6.length()
            if (r8 != 0) goto L_0x00fc
            r8 = 1
            goto L_0x00fd
        L_0x00fc:
            r8 = 0
        L_0x00fd:
            if (r8 == 0) goto L_0x0100
            r6 = r3
        L_0x0100:
            com.tencent.mm.plugin.webview.stub.m r8 = r11.mo13184d()
            if (r8 == 0) goto L_0x010b
            java.lang.String r8 = r8.ya0()
            goto L_0x010c
        L_0x010b:
            r8 = r5
        L_0x010c:
            if (r8 != 0) goto L_0x010f
            r8 = r7
        L_0x010f:
            t83.C13863o1.m13166b(r3, r6, r8)
        L_0x0112:
            com.tencent.mm.protocal.JsapiPermissionWrapper r11 = r11.mo13182b()
            if (r11 == 0) goto L_0x0120
            int r0 = r0.mo7287b()
            int r2 = r11.mo69443d(r0)
        L_0x0120:
            java.lang.String r11 = r12.f38996i
            java.util.Map<java.lang.String, java.lang.Object> r0 = r12.f38995h
            java.util.Map<java.lang.String, java.lang.Object> r3 = r12.f38983a
            java.lang.String r6 = "key_webview_init_url"
            java.lang.Object r3 = r3.get(r6)
            boolean r6 = r3 instanceof java.lang.String
            if (r6 == 0) goto L_0x0133
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0134
        L_0x0133:
            r3 = r5
        L_0x0134:
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r7)
            java.util.Map<java.lang.String, java.lang.Object> r6 = r12.f38983a
            java.lang.String r8 = "key_wxapp_id"
            java.lang.Object r6 = r6.get(r8)
            boolean r8 = r6 instanceof java.lang.String
            if (r8 == 0) goto L_0x0147
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0148
        L_0x0147:
            r6 = r5
        L_0x0148:
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            java.util.Map<java.lang.String, java.lang.Object> r12 = r12.f38983a
            java.lang.String r8 = "key_wxapp_path"
            java.lang.Object r12 = r12.get(r8)
            boolean r8 = r12 instanceof java.lang.String
            if (r8 == 0) goto L_0x015b
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
        L_0x015b:
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r7)
            if (r0 == 0) goto L_0x0185
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = r0
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.String r7 = "isSuccess"
            r5.put(r7, r4)
            java.lang.String r4 = "report_initUrl"
            r5.put(r4, r3)
            java.lang.String r3 = "containerEnv"
            r5.put(r3, r6)
            java.lang.String r3 = "miniProgramPath"
            r5.put(r3, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "permissionValue"
            r5.put(r2, r12)
        L_0x0185:
            t83.C13863o1.m13167c(r11, r0)
            return r1
        L_0x0189:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t83.C13861m1.mo8735a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public boolean mo8736b(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        return mo13194c().containsKey(h1Var.f38996i);
    }

    /* renamed from: c */
    public final Map<String, C15053a> mo13194c() {
        ((C1523c3) C86312j.m106911c(C1523c3.class)).waitFor();
        return f39017c;
    }
}
