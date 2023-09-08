package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.w0 */
public final class C44118w0 extends C44101a {

    /* renamed from: e */
    public static final C44118w0 f119512e = new C44118w0();

    /* renamed from: f */
    public static final int f119513f = 371;

    /* renamed from: g */
    public static final String f119514g = "handleVideoAction";

    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v2, types: [kd.c] */
    /* JADX WARNING: type inference failed for: r8v5, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a7 A[Catch:{ Exception -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01b0 A[Catch:{ Exception -> 0x0238 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r20, t83.C13851h1 r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r4 = "action"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r0
            java.lang.String r7 = "MicroMsg.JsApiHandleVideoAction"
            java.lang.String r8 = "handleVideoAction action=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r8 = 0
            if (r5 == 0) goto L_0x004b
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.f38996i
            r5.append(r3)
            java.lang.String r3 = ":fail action is empty"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r0.mo10774a(r2, r3, r8)
            return r4
        L_0x004b:
            java.lang.String r5 = "insertSameLayerVideo"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            java.lang.String r9 = "removeSameLayerVideo"
            if (r5 != 0) goto L_0x0295
            java.lang.String r5 = "updateSameLayerVideo"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 != 0) goto L_0x0295
            java.lang.String r5 = "operateSameLayerVideo"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 != 0) goto L_0x0295
            boolean r5 = gy3.C87412m.m108589b(r9, r0)
            if (r5 != 0) goto L_0x0295
            java.lang.String r5 = "enterFinderFullScreen"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0076
            goto L_0x0295
        L_0x0076:
            java.lang.String r5 = "getFinderPlayInfo"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 != 0) goto L_0x0291
            java.lang.String r5 = "operateFinderVideo"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 != 0) goto L_0x0291
            java.lang.String r5 = "getFinderFeedInfo"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0090
            goto L_0x0291
        L_0x0090:
            java.lang.String r5 = "supportIFrameSameLayer"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            java.lang.String r7 = ":fail"
            java.lang.String r9 = ":ok"
            if (r5 == 0) goto L_0x00df
            com.tencent.mm.ui.widget.MMWebView r0 = r2.f39002e
            gy3.C87412m.m108591d(r0)
            boolean r0 = r0.isXWalkKernel()
            if (r0 == 0) goto L_0x00c6
            boolean r0 = com.tencent.xweb.XWebSdk.isCurrentVersionSupportNativeView()
            if (r0 == 0) goto L_0x00c6
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.f38996i
            r5.append(r3)
            r5.append(r9)
            java.lang.String r3 = r5.toString()
            r0.mo10774a(r2, r3, r8)
            goto L_0x00de
        L_0x00c6:
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.f38996i
            r5.append(r3)
            r5.append(r7)
            java.lang.String r3 = r5.toString()
            r0.mo10774a(r2, r3, r8)
        L_0x00de:
            return r4
        L_0x00df:
            ba3.a r5 = ba3.C39750a.f106644a
            boolean r10 = r5.mo62385a()
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x0179
            java.lang.String r10 = "getInitialParams"
            boolean r10 = gy3.C87412m.m108589b(r10, r0)
            if (r10 == 0) goto L_0x0179
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r6 = ba3.C39750a.f106646c
            java.lang.String r7 = "MicroMsg.MPVideoPreviewDataMgr_prepareOnReceivePageData_vid"
            java.lang.String r10 = r6.decodeString(r7, r11)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            java.lang.String r13 = "MicroMsg.MPVideoPreviewDataMgr"
            if (r12 == 0) goto L_0x010c
            java.lang.String r0 = "getInitialParams vid null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            goto L_0x0160
        L_0x010c:
            java.util.Map r5 = r5.mo62386b(r10)
            java.lang.String r8 = "videoInitialTime"
            if (r5 == 0) goto L_0x011b
            java.lang.Object r12 = r5.get(r8)
            if (r12 != 0) goto L_0x0120
        L_0x011b:
            java.lang.Object r12 = new java.lang.Object
            r12.<init>()
        L_0x0120:
            r0.put(r8, r12)
            java.lang.String r12 = "videoInitialSnapshot"
            if (r5 == 0) goto L_0x012e
            java.lang.Object r5 = r5.get(r12)
            if (r5 != 0) goto L_0x0133
        L_0x012e:
            java.lang.Object r5 = new java.lang.Object
            r5.<init>()
        L_0x0133:
            r0.put(r12, r5)
            java.lang.Object r5 = r6.getSlotForWrite()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r5
            r5.encode((java.lang.String) r7, (java.lang.String) r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getInitialParams vid = "
            r5.append(r6)
            r5.append(r10)
            java.lang.String r6 = ", time = "
            r5.append(r6)
            java.lang.Object r6 = r0.get(r8)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r5)
            r8 = r0
        L_0x0160:
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.f38996i
            r5.append(r3)
            r5.append(r9)
            java.lang.String r3 = r5.toString()
            r0.mo10774a(r2, r3, r8)
            return r4
        L_0x0179:
            java.lang.String r5 = "supportCodec"
            boolean r0 = gy3.C87412m.m108589b(r5, r0)
            if (r0 == 0) goto L_0x0290
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f38983a
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            ea3.k r10 = ea3.C7616k.f25897a     // Catch:{ Exception -> 0x0238 }
            boolean r10 = r10.mo8749a()     // Catch:{ Exception -> 0x0238 }
            if (r10 != 0) goto L_0x0196
            java.lang.String r0 = r1.f119465d     // Catch:{ Exception -> 0x0238 }
            java.lang.String r5 = "isVCodecCapabilityCanSupport  is not use thumbPlayer, return false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)     // Catch:{ Exception -> 0x0238 }
            goto L_0x025b
        L_0x0196:
            if (r0 == 0) goto L_0x01a4
            r10 = r0
            java.util.HashMap r10 = (java.util.HashMap) r10     // Catch:{ Exception -> 0x0238 }
            boolean r10 = r10.isEmpty()     // Catch:{ Exception -> 0x0238 }
            if (r10 == 0) goto L_0x01a2
            goto L_0x01a4
        L_0x01a2:
            r10 = 0
            goto L_0x01a5
        L_0x01a4:
            r10 = 1
        L_0x01a5:
            if (r10 == 0) goto L_0x01b0
            java.lang.String r0 = r1.f119465d     // Catch:{ Exception -> 0x0238 }
            java.lang.String r5 = "isVCodecCapabilityCanSupport  params is empty, return false"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)     // Catch:{ Exception -> 0x0238 }
            goto L_0x025b
        L_0x01b0:
            java.lang.String r10 = "codecId"
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0238 }
            java.lang.Object r10 = r0.get(r10)     // Catch:{ Exception -> 0x0238 }
            gy3.C87412m.m108592e(r10, r5)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0238 }
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r6)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r12 = "width"
            java.lang.Object r12 = r0.get(r12)     // Catch:{ Exception -> 0x0238 }
            gy3.C87412m.m108592e(r12, r5)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0238 }
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r6)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r12 = "height"
            java.lang.Object r12 = r0.get(r12)     // Catch:{ Exception -> 0x0238 }
            gy3.C87412m.m108592e(r12, r5)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0238 }
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r6)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r12 = "frameRate"
            java.lang.Object r0 = r0.get(r12)     // Catch:{ Exception -> 0x0238 }
            gy3.C87412m.m108592e(r0, r5)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0238 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r6)     // Catch:{ Exception -> 0x0238 }
            r5 = 0
            r16 = 0
            r12 = r10
            r13 = r15
            r18 = r14
            r4 = r15
            r15 = r5
            r17 = r0
            boolean r5 = com.tencent.thumbplayer.api.capability.TPCapability.isVCodecCapabilityCanSupport(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r12 = r1.f119465d     // Catch:{ Exception -> 0x0238 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0238 }
            r13.<init>()     // Catch:{ Exception -> 0x0238 }
            java.lang.String r14 = "isVCodecCapabilityCanSupport , codecId:"
            r13.append(r14)     // Catch:{ Exception -> 0x0238 }
            r13.append(r10)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r10 = " , width:"
            r13.append(r10)     // Catch:{ Exception -> 0x0238 }
            r13.append(r4)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r4 = " , height:"
            r13.append(r4)     // Catch:{ Exception -> 0x0238 }
            r4 = r18
            r13.append(r4)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r4 = " , frameRate:"
            r13.append(r4)     // Catch:{ Exception -> 0x0238 }
            r13.append(r0)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r0 = ", result:"
            r13.append(r0)     // Catch:{ Exception -> 0x0238 }
            r13.append(r5)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x0238 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x0238 }
            r6 = r5
            goto L_0x025b
        L_0x0238:
            r0 = move-exception
            java.lang.String r4 = r1.f119465d
            java.lang.Object[] r5 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r11, r5)
            java.lang.String r4 = r1.f119465d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "isVCodecCapabilityCanSupport exception:"
            r5.append(r10)
            r5.append(r0)
            java.lang.String r0 = "  return false"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x025b:
            if (r6 == 0) goto L_0x0276
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            r4.append(r9)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r8)
            goto L_0x028e
        L_0x0276:
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            r4.append(r7)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r8)
        L_0x028e:
            r4 = 1
            return r4
        L_0x0290:
            return r6
        L_0x0291:
            com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler.m66268d(r0, r2, r3)
            return r4
        L_0x0295:
            com.tencent.mm.sdk.platformtools.QueueWorkerThread r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.f121005a
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r5 = "pluginType"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            boolean r10 = r4 instanceof java.lang.String
            if (r10 == 0) goto L_0x02a8
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x02a9
        L_0x02a8:
            r4 = r8
        L_0x02a9:
            if (r4 == 0) goto L_0x02b4
            int r10 = r4.length()
            if (r10 != 0) goto L_0x02b2
            goto L_0x02b4
        L_0x02b2:
            r10 = 0
            goto L_0x02b5
        L_0x02b4:
            r10 = 1
        L_0x02b5:
            if (r10 == 0) goto L_0x02b9
            java.lang.String r4 = "finder"
        L_0x02b9:
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r6] = r4
            java.lang.String r12 = "handleVideoAction pluginType=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r11)
            gy3.C87412m.m108594g(r4, r5)
            org.json.JSONObject r5 = r3.f38991d
            java.lang.String r7 = "viewId"
            if (r5 == 0) goto L_0x031b
            boolean r11 = r5.has(r7)
            if (r11 != 0) goto L_0x02d4
            goto L_0x031b
        L_0x02d4:
            e00.t r11 = r20.mo13183c()
            if (r11 == 0) goto L_0x02df
            java.lang.Object r11 = r11.getWebViewPluginClientProxy()
            goto L_0x02e0
        L_0x02df:
            r11 = r8
        L_0x02e0:
            boolean r12 = r11 instanceof p817kd.C88140c
            if (r12 == 0) goto L_0x02e7
            kd.c r11 = (p817kd.C88140c) r11
            goto L_0x02e8
        L_0x02e7:
            r11 = r8
        L_0x02e8:
            if (r11 != 0) goto L_0x030d
            java.lang.String r5 = r1.f119465d
            java.lang.String r10 = "webview has no plugin client"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r10)
            t83.g r5 = r2.f39001d
            java.lang.String r10 = r3.f38990c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r3.f38996i
            r11.append(r12)
            java.lang.String r12 = "fail:webview has no plugin client"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r5.mo10774a(r10, r11, r8)
            goto L_0x033c
        L_0x030d:
            int r5 = r5.optInt(r7)
            ca3.d r6 = new ca3.d
            r6.<init>(r2, r3)
            r11.mo122546e(r4, r5, r6)
            r6 = 1
            goto L_0x033c
        L_0x031b:
            java.lang.String r5 = r1.f119465d
            java.lang.String r10 = "no viewId in data"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r10)
            t83.g r5 = r2.f39001d
            java.lang.String r10 = r3.f38990c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r3.f38996i
            r11.append(r12)
            java.lang.String r12 = "fail:no viewId in data"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r5.mo10774a(r10, r11, r8)
        L_0x033c:
            boolean r0 = gy3.C87412m.m108589b(r9, r0)
            if (r0 == 0) goto L_0x036f
            org.json.JSONObject r0 = r3.f38991d
            if (r0 == 0) goto L_0x036f
            boolean r0 = r0.has(r7)
            if (r0 == 0) goto L_0x036f
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.w0 r0 = f119512e
            r0.getClass()
            e00.t r0 = r20.mo13183c()
            if (r0 == 0) goto L_0x035c
            java.lang.Object r0 = r0.getWebViewPluginClientProxy()
            goto L_0x035d
        L_0x035c:
            r0 = r8
        L_0x035d:
            boolean r2 = r0 instanceof p817kd.C88140c
            if (r2 == 0) goto L_0x0364
            r8 = r0
            kd.c r8 = (p817kd.C88140c) r8
        L_0x0364:
            if (r8 == 0) goto L_0x036f
            org.json.JSONObject r0 = r3.f38991d
            int r0 = r0.optInt(r7)
            r8.mo122542a(r4, r0)
        L_0x036f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C44118w0.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f119513f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f119514g;
    }
}
