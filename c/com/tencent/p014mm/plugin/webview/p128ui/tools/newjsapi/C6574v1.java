package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import kk0.C88191m;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.v1 */
public final class C6574v1 extends C15053a {

    /* renamed from: d */
    public static final C6574v1 f23797d = new C6574v1();

    /* renamed from: e */
    public static final String f23798e = "MicroMsg.JsApiOpenUrlWithExtraWebview";

    /* renamed from: f */
    public static final int f23799f = C88191m.CTRL_INDEX;

    /* renamed from: g */
    public static final String f23800g = "openUrlWithExtraWebview";

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01b8, code lost:
        if ((r0 != null && r0.isAnnotationPresent(nj3.C88995f1.class)) != false) goto L_0x01ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x021a A[Catch:{ Exception -> 0x02a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0222 A[Catch:{ Exception -> 0x02a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0225 A[Catch:{ Exception -> 0x02a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0287 A[Catch:{ Exception -> 0x02a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0290 A[SYNTHETIC, Splitter:B:53:0x0290] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0294 A[Catch:{ Exception -> 0x02a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02c2 A[Catch:{ Exception -> 0x035f }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x037a A[SYNTHETIC, Splitter:B:81:0x037a] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x039a A[Catch:{ all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x03a5 A[Catch:{ all -> 0x03d0 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r29, t83.C13851h1 r30) {
        /*
            r28 = this;
            r1 = r29
            r2 = r30
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r3 = "halfScreen"
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r3 = 0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r0, r3)
            java.lang.String r4 = "url"
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0121
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.Object r0 = r0.get(r4)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x0038
            boolean r0 = z04.C112551y.m153811k(r9)
            if (r0 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r0 = 0
            goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            if (r0 == 0) goto L_0x0056
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r2.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r2.f38996i
            r4.append(r2)
            java.lang.String r2 = ":fail_invalid_url"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.mo10774a(r1, r2, r6)
            return r3
        L_0x0056:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r4 = "heightPercent"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            r4 = 1061158912(0x3f400000, float:0.75)
            float r11 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r0, r4)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r4 = "reuseWebView"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r0, r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r4 = "showMenu"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r0, r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r4 = "showRefreshIcon"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r22 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r0, r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r4 = "showTitle"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r23 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r0, r5)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r4 = "immersiveUIStyle"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r0, r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r4 = "extData"
            java.lang.Object r0 = r0.get(r4)
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r4 = "hexBackgroundColor"
            java.lang.Object r0 = r0.get(r4)
            r24 = r0
            java.lang.String r24 = (java.lang.String) r24
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r4 = "backMode"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r4 = "openType"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            int r17 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)
            com.tencent.mm.plugin.webview.ui.tools.widget.HalfScreenWebView r0 = new com.tencent.mm.plugin.webview.ui.tools.widget.HalfScreenWebView
            android.content.Context r8 = r1.f38998a
            r3 = 0
            com.tencent.mm.plugin.webview.ui.tools.widget.u r4 = new com.tencent.mm.plugin.webview.ui.tools.widget.u
            r10 = r4
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r25 = 0
            r26 = 18304(0x4780, float:2.565E-41)
            r27 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r12 = 4
            r13 = 0
            r7 = r0
            r10 = r3
            r11 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.show()
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r2.f38990c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.f38996i
            r3.append(r2)
            java.lang.String r2 = ":ok"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.mo10774a(r1, r2, r6)
            return r5
        L_0x0121:
            java.lang.String r7 = "adSnsId"
            java.lang.String r8 = "adSource"
            java.lang.String r9 = "adScene"
            java.lang.String r10 = "preChatTYPE"
            java.lang.String r11 = "preUsername"
            java.lang.String r12 = "adUxInfo"
            java.lang.String r13 = "preChatName"
            java.lang.String r14 = "prePublishId"
            java.lang.String r15 = ""
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.Object r0 = r0.get(r4)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            java.lang.String r3 = "openUrlWithExtraWebview:fail_invalid_url"
            if (r0 == 0) goto L_0x0154
            java.lang.String r0 = f23798e
            java.lang.String r4 = "openUrlWithExtraWebview url is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r2.f38990c
            r0.mo10774a(r1, r3, r6)
            goto L_0x0408
        L_0x0154:
            gy3.C87412m.m108591d(r5)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r6 = "getDefault()"
            gy3.C87412m.m108593f(r0, r6)
            java.lang.String r0 = r5.toLowerCase(r0)
            java.lang.String r6 = "this as java.lang.String).toLowerCase(locale)"
            gy3.C87412m.m108593f(r0, r6)
            java.lang.String r6 = "http://"
            r19 = r7
            r7 = 0
            boolean r6 = z04.C112551y.m153819s(r0, r6, r7)
            if (r6 != 0) goto L_0x018e
            java.lang.String r6 = "https://"
            boolean r0 = z04.C112551y.m153819s(r0, r6, r7)
            if (r0 != 0) goto L_0x018e
            java.lang.String r0 = f23798e
            java.lang.String r4 = "openUrlWithExtraWebview, url is not http"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r2.f38990c
            r2 = 0
            r0.mo10774a(r1, r3, r2)
            goto L_0x0408
        L_0x018e:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r0 = "rawUrl"
            r3.putExtra(r0, r5)
            android.content.Context r0 = r1.f38998a     // Catch:{ Exception -> 0x01bc }
            java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x01bc }
            java.lang.Class<nj3.f1> r6 = nj3.C88995f1.class
            boolean r6 = r0.isAnnotationPresent(r6)     // Catch:{ Exception -> 0x01bc }
            if (r6 != 0) goto L_0x01ba
            java.lang.Class r0 = r0.getSuperclass()     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x01b7
            java.lang.Class<nj3.f1> r6 = nj3.C88995f1.class
            boolean r0 = r0.isAnnotationPresent(r6)     // Catch:{ Exception -> 0x01bc }
            r6 = 1
            if (r0 != r6) goto L_0x01b7
            r0 = 1
            goto L_0x01b8
        L_0x01b7:
            r0 = 0
        L_0x01b8:
            if (r0 == 0) goto L_0x01d7
        L_0x01ba:
            r0 = 1
            goto L_0x01d8
        L_0x01bc:
            r0 = move-exception
            java.lang.String r6 = f23798e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "get ConvertActivityFromTranslucent ex "
            r7.append(r1)
            java.lang.String r0 = r0.getMessage()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
        L_0x01d7:
            r0 = 0
        L_0x01d8:
            java.lang.String r1 = f23798e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "openUrlWithExtraWebview webview, url = %s， convertActivityFromTranslucent = "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r20 = r8
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r8)
            java.lang.String r5 = "convertActivityFromTranslucent"
            r3.putExtra(r5, r0)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "start_activity_time"
            r3.putExtra(r0, r5)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r5 = "prefetchId"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = "KWebPrefetcherId"
            r3.putExtra(r5, r0)
            com.tencent.mm.plugin.webview.stub.m r0 = r29.mo13184d()     // Catch:{ Exception -> 0x02a2 }
            if (r0 == 0) goto L_0x0222
            r6 = 18
            r7 = 0
            android.os.Bundle r0 = r0.mo7031V5(r6, r7)     // Catch:{ Exception -> 0x02a2 }
            goto L_0x0223
        L_0x0222:
            r0 = 0
        L_0x0223:
            if (r0 == 0) goto L_0x024b
            java.lang.String r6 = r0.getString(r14)     // Catch:{ Exception -> 0x02a2 }
            java.lang.String r7 = r0.getString(r13)     // Catch:{ Exception -> 0x02a2 }
            java.lang.String r8 = r0.getString(r11)     // Catch:{ Exception -> 0x02a2 }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x02a2 }
            r5 = 0
            int r0 = r0.getInt(r10, r5)     // Catch:{ Exception -> 0x02a2 }
            r3.putExtra(r14, r6)     // Catch:{ Exception -> 0x02a2 }
            r3.putExtra(r11, r8)     // Catch:{ Exception -> 0x02a2 }
            r3.putExtra(r13, r7)     // Catch:{ Exception -> 0x02a2 }
            r3.putExtra(r10, r0)     // Catch:{ Exception -> 0x02a2 }
            java.lang.String r0 = "kReferrer"
            r3.putExtra(r0, r4)     // Catch:{ Exception -> 0x02a2 }
        L_0x024b:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a     // Catch:{ Exception -> 0x02a2 }
            java.lang.String r4 = "scene"
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x02a2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02a2 }
            r4 = -1
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x02a0 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.f38983a     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r6 = "bizUsername"
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x02a0 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a0 }
            r6.<init>()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r7 = "openUrlWithExtraWebview scene: "
            r6.append(r7)     // Catch:{ Exception -> 0x02a0 }
            r6.append(r0)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r7 = ", bizUsername: "
            r6.append(r7)     // Catch:{ Exception -> 0x02a0 }
            r6.append(r5)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x02a0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)     // Catch:{ Exception -> 0x02a0 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x02a0 }
            if (r1 != 0) goto L_0x028c
            java.lang.String r1 = "geta8key_username"
            r3.putExtra(r1, r5)     // Catch:{ Exception -> 0x02a0 }
        L_0x028c:
            java.lang.String r1 = "geta8key_scene"
            if (r0 <= 0) goto L_0x0294
            r3.putExtra(r1, r0)     // Catch:{ Exception -> 0x02a0 }
            goto L_0x0299
        L_0x0294:
            r0 = 78
            r3.putExtra(r1, r0)     // Catch:{ Exception -> 0x02a0 }
        L_0x0299:
            java.lang.String r0 = "key_enable_teen_mode_check"
            r1 = 1
            r3.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            goto L_0x02ac
        L_0x02a0:
            r0 = move-exception
            goto L_0x02a4
        L_0x02a2:
            r0 = move-exception
            r4 = -1
        L_0x02a4:
            java.lang.String r1 = f23798e
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r15, r6)
        L_0x02ac:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a     // Catch:{ Exception -> 0x035f }
            java.lang.String r1 = "adIsNeedReport"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x035f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x035f }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x035f }
            java.lang.String r5 = "1"
            boolean r1 = gy3.C87412m.m108589b(r1, r5)     // Catch:{ Exception -> 0x035f }
            if (r1 == 0) goto L_0x0368
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Exception -> 0x035f }
            r1.<init>()     // Catch:{ Exception -> 0x035f }
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.f38983a     // Catch:{ Exception -> 0x035f }
            java.lang.Object r5 = r5.get(r12)     // Catch:{ Exception -> 0x035f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x035f }
            java.util.Map<java.lang.String, java.lang.Object> r6 = r2.f38983a     // Catch:{ Exception -> 0x035f }
            java.lang.Object r6 = r6.get(r9)     // Catch:{ Exception -> 0x035f }
            if (r6 == 0) goto L_0x02e6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r2.f38983a     // Catch:{ Exception -> 0x035f }
            java.lang.Object r6 = r6.get(r9)     // Catch:{ Exception -> 0x035f }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x035f }
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)     // Catch:{ Exception -> 0x035f }
            goto L_0x02e7
        L_0x02e6:
            r6 = -1
        L_0x02e7:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.f38983a     // Catch:{ Exception -> 0x035f }
            r8 = r20
            java.lang.Object r7 = r7.get(r8)     // Catch:{ Exception -> 0x035f }
            if (r7 == 0) goto L_0x02ff
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f38983a     // Catch:{ Exception -> 0x035f }
            java.lang.Object r4 = r4.get(r8)     // Catch:{ Exception -> 0x035f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x035f }
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)     // Catch:{ Exception -> 0x035f }
        L_0x02ff:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.f38983a     // Catch:{ Exception -> 0x035f }
            r8 = r19
            java.lang.Object r7 = r7.get(r8)     // Catch:{ Exception -> 0x035f }
            if (r7 == 0) goto L_0x0316
            java.lang.String r7 = "ad_report_sns_id"
            java.util.Map<java.lang.String, java.lang.Object> r9 = r2.f38983a     // Catch:{ Exception -> 0x035f }
            java.lang.Object r8 = r9.get(r8)     // Catch:{ Exception -> 0x035f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x035f }
            r1.putString(r7, r8)     // Catch:{ Exception -> 0x035f }
        L_0x0316:
            java.lang.String r7 = "ad_report_ux_info"
            r1.putString(r7, r5)     // Catch:{ Exception -> 0x035f }
            java.lang.String r7 = "ad_report_scene"
            r1.putInt(r7, r6)     // Catch:{ Exception -> 0x035f }
            java.lang.String r7 = "ad_report_source"
            r1.putInt(r7, r4)     // Catch:{ Exception -> 0x035f }
            java.lang.String r7 = "ad_need_report"
            r8 = 1
            r1.putBoolean(r7, r8)     // Catch:{ Exception -> 0x035f }
            java.lang.String r7 = "ad_report_bundle"
            r3.putExtra(r7, r1)     // Catch:{ Exception -> 0x035f }
            java.lang.String r1 = f23798e     // Catch:{ Exception -> 0x035f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x035f }
            r7.<init>()     // Catch:{ Exception -> 0x035f }
            java.lang.String r8 = "adIsNeedReport="
            r7.append(r8)     // Catch:{ Exception -> 0x035f }
            r7.append(r0)     // Catch:{ Exception -> 0x035f }
            java.lang.String r0 = ", adScene="
            r7.append(r0)     // Catch:{ Exception -> 0x035f }
            r7.append(r6)     // Catch:{ Exception -> 0x035f }
            java.lang.String r0 = ",adSource="
            r7.append(r0)     // Catch:{ Exception -> 0x035f }
            r7.append(r4)     // Catch:{ Exception -> 0x035f }
            java.lang.String r0 = ", adUxInfo="
            r7.append(r0)     // Catch:{ Exception -> 0x035f }
            r7.append(r5)     // Catch:{ Exception -> 0x035f }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x035f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ Exception -> 0x035f }
            goto L_0x0368
        L_0x035f:
            r0 = move-exception
            java.lang.String r1 = f23798e
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r15, r5)
        L_0x0368:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a     // Catch:{ all -> 0x03d0 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x03d0 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03d0 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03d0 }
            java.lang.String r4 = "openUrlWithExtraWebView"
            java.lang.String r5 = "WebViewUI"
            if (r1 == 0) goto L_0x039a
            com.tencent.mm.plugin.webview.stub.m r0 = r29.mo13184d()     // Catch:{ all -> 0x03d0 }
            if (r0 == 0) goto L_0x0389
            r1 = 300(0x12c, float:4.2E-43)
            android.os.Bundle r6 = android.os.Bundle.EMPTY     // Catch:{ all -> 0x03d0 }
            android.os.Bundle r0 = r0.mo7031V5(r1, r6)     // Catch:{ all -> 0x03d0 }
            goto L_0x038a
        L_0x0389:
            r0 = 0
        L_0x038a:
            if (r0 == 0) goto L_0x0393
            java.lang.String r1 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122325q     // Catch:{ all -> 0x03d0 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x03d0 }
            goto L_0x0394
        L_0x0393:
            r0 = 0
        L_0x0394:
            java.lang.String r1 = "intent"
            zd2.C91667a.m115207c(r5, r4, r0, r1)     // Catch:{ all -> 0x03d0 }
            goto L_0x039f
        L_0x039a:
            java.lang.String r1 = "msg.params"
            zd2.C91667a.m115207c(r5, r4, r0, r1)     // Catch:{ all -> 0x03d0 }
        L_0x039f:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03d0 }
            if (r1 != 0) goto L_0x03db
            java.lang.String r1 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122325q     // Catch:{ all -> 0x03d0 }
            r3.putExtra(r1, r0)     // Catch:{ all -> 0x03d0 }
            com.tencent.mm.plugin.webview.stub.m r0 = r29.mo13184d()     // Catch:{ all -> 0x03d0 }
            if (r0 == 0) goto L_0x03b9
            r1 = 299(0x12b, float:4.19E-43)
            android.os.Bundle r4 = android.os.Bundle.EMPTY     // Catch:{ all -> 0x03d0 }
            android.os.Bundle r0 = r0.mo7031V5(r1, r4)     // Catch:{ all -> 0x03d0 }
            goto L_0x03ba
        L_0x03b9:
            r0 = 0
        L_0x03ba:
            if (r0 == 0) goto L_0x03c3
            java.lang.String r1 = "ad_info_traceId"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x03d0 }
            goto L_0x03c4
        L_0x03c3:
            r0 = 0
        L_0x03c4:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x03d0 }
            if (r1 != 0) goto L_0x03db
            java.lang.String r1 = "ad_info"
            r3.putExtra(r1, r0)     // Catch:{ all -> 0x03d0 }
            goto L_0x03db
        L_0x03d0:
            r0 = move-exception
            java.lang.String r1 = f23798e
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "AC_GET_AD_UX_INFO_FOR_JSAPI_PAY"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r5, r4)
        L_0x03db:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r1 = "liteAppId"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x03ea
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x03eb
        L_0x03ea:
            r0 = 0
        L_0x03eb:
            if (r0 == 0) goto L_0x03f2
            java.lang.String r1 = "liteAppSource"
            r3.putExtra(r1, r0)
        L_0x03f2:
            r1 = r29
            android.content.Context r0 = r1.f38998a
            java.lang.String r4 = "webview"
            java.lang.String r5 = ".ui.tools.WebViewUI"
            r6 = 0
            ke3.C88144b.m109791i(r0, r4, r5, r3, r6)
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r2.f38990c
            java.lang.String r2 = "openUrlWithExtraWebview:ok"
            r0.mo10774a(r1, r2, r6)
        L_0x0408:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6574v1.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23799f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23800g;
    }
}
