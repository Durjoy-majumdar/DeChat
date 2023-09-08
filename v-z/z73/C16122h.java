package z73;

import w83.C15053a;

/* renamed from: z73.h */
public final class C16122h extends C15053a {

    /* renamed from: d */
    public static final C16122h f43308d = new C16122h();

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x020c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r17, t83.C13851h1 r18) {
        /*
            r16 = this;
            r1 = r17
            r2 = r18
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "handleMsg params:"
            r0.append(r3)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.f38983a
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.WebSearch.OpenWeAppPageJSApi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r4 = "userName"
            java.lang.String r4 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r0, r4)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r5 = "relativeURL"
            java.lang.String r6 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r0, r5)
            gy3.C87412m.m108593f(r6, r5)
            java.lang.String r0 = "render_data"
            r5 = 0
            boolean r7 = z04.C112550d0.m153801u(r6, r0, r5)
            if (r7 == 0) goto L_0x0090
            android.net.Uri r7 = android.net.Uri.parse(r6)     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r8 = "widgetData"
            java.lang.String r7 = r7.getQueryParameter(r8)     // Catch:{ JSONException -> 0x0088 }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0088 }
            r8.<init>(r7)     // Catch:{ JSONException -> 0x0088 }
            r8.remove(r0)     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r0 = "(widgetData=.*&)|(widgetData=.*$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r7 = "compile(pattern)"
            gy3.C87412m.m108593f(r0, r7)     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r7 = "&"
            java.util.regex.Matcher r0 = r0.matcher(r6)     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r7 = r0.replaceAll(r7)     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r0 = "nativePattern.matcher(in…).replaceAll(replacement)"
            gy3.C87412m.m108593f(r7, r0)     // Catch:{ JSONException -> 0x0088 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0085 }
            r0.<init>()     // Catch:{ JSONException -> 0x0085 }
            r0.append(r7)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r6 = "&widgetData="
            r0.append(r6)     // Catch:{ JSONException -> 0x0085 }
            r0.append(r8)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r6 = r0.toString()     // Catch:{ JSONException -> 0x0085 }
            goto L_0x0090
        L_0x0085:
            r0 = move-exception
            r6 = r7
            goto L_0x0089
        L_0x0088:
            r0 = move-exception
        L_0x0089:
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r8 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r8, r7)
        L_0x0090:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r3 = "appVersion"
            int r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r0, r3, r5)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.f38983a
            java.lang.String r7 = "searchId"
            java.lang.String r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r3, r7)
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.f38983a
            java.lang.String r8 = "docId"
            java.lang.String r7 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r7, r8)
            java.util.Map<java.lang.String, java.lang.Object> r8 = r2.f38983a
            java.lang.String r9 = "position"
            r10 = 1
            int r8 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r8, r9, r10)
            java.util.Map<java.lang.String, java.lang.Object> r9 = r2.f38983a
            r11 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r12 = "scene"
            int r9 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r9, r12, r11)
            java.util.Map<java.lang.String, java.lang.Object> r11 = r2.f38983a
            java.lang.String r12 = "debugMode"
            int r11 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r11, r12, r5)
            java.util.Map<java.lang.String, java.lang.Object> r12 = r2.f38983a
            java.lang.String r13 = "cookie"
            java.lang.String r12 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r12, r13)
            java.util.Map<java.lang.String, java.lang.Object> r13 = r2.f38983a
            java.lang.String r14 = "appId"
            java.lang.String r13 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r13, r14)
            java.util.Map<java.lang.String, java.lang.Object> r14 = r2.f38983a
            java.lang.String r15 = "startWeAppScene"
            int r14 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r14, r15, r5)
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            java.lang.String r5 = "cookies"
            r15.put(r5, r12)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00ea
        L_0x00e9:
        L_0x00ea:
            if (r11 >= 0) goto L_0x00ee
            r5 = 0
            goto L_0x00ef
        L_0x00ee:
            r5 = r11
        L_0x00ef:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent r11 = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent
            r11.<init>()
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r12 = r11.f9522d
            android.content.Context r10 = r1.f38998a
            r12.f9531f = r10
            r12.f9526a = r4
            r12.f9527b = r6
            r12.f9534i = r0
            java.lang.String r0 = "sos"
            r12.f9547v = r0
            java.lang.String r0 = r15.toString()
            r12.f9548w = r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r0 == 0) goto L_0x0116
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r0 = r11.f9522d
            r0.f9546u = r4
            goto L_0x011a
        L_0x0116:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r0 = r11.f9522d
            r0.f9546u = r13
        L_0x011a:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r0 = r11.f9522d
            r0.f9528c = r5
            if (r14 <= 0) goto L_0x0123
            r0.f9529d = r14
            goto L_0x0170
        L_0x0123:
            r4 = 201(0xc9, float:2.82E-43)
            r5 = 1006(0x3ee, float:1.41E-42)
            if (r9 == r4) goto L_0x016e
            r4 = 14
            if (r9 == r4) goto L_0x016e
            r4 = 22
            if (r9 != r4) goto L_0x0132
            goto L_0x016e
        L_0x0132:
            r4 = 3
            if (r9 != r4) goto L_0x013a
            r4 = 1005(0x3ed, float:1.408E-42)
            r0.f9529d = r4
            goto L_0x0170
        L_0x013a:
            r4 = 16
            if (r9 != r4) goto L_0x0143
            r4 = 1042(0x412, float:1.46E-42)
            r0.f9529d = r4
            goto L_0x0170
        L_0x0143:
            r4 = 20
            if (r9 == r4) goto L_0x0169
            r4 = 34
            if (r9 == r4) goto L_0x0169
            r4 = 67
            if (r9 == r4) goto L_0x0169
            r4 = 17
            if (r9 == r4) goto L_0x0169
            r4 = 100
            if (r9 != r4) goto L_0x0158
            goto L_0x0169
        L_0x0158:
            r4 = 42
            if (r9 == r4) goto L_0x0164
            r4 = 52
            if (r9 != r4) goto L_0x0161
            goto L_0x0164
        L_0x0161:
            r0.f9529d = r5
            goto L_0x0170
        L_0x0164:
            r4 = 1106(0x452, float:1.55E-42)
            r0.f9529d = r4
            goto L_0x0170
        L_0x0169:
            r4 = 1053(0x41d, float:1.476E-42)
            r0.f9529d = r4
            goto L_0x0170
        L_0x016e:
            r0.f9529d = r5
        L_0x0170:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r4 = "statSessionId"
            java.lang.String r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r0, r4)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f38983a
            java.lang.String r5 = "statKeywordId"
            java.lang.String r4 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r5)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.f38983a
            java.lang.String r6 = "subScene"
            java.lang.String r5 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r5, r6)
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r6 = r11.f9522d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r0 = 58
            r9.append(r0)
            r9.append(r4)
            r9.append(r0)
            r9.append(r3)
            r9.append(r0)
            r9.append(r7)
            r9.append(r0)
            r9.append(r8)
            r9.append(r0)
            r9.append(r5)
            java.lang.String r0 = r9.toString()
            r6.f9530e = r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            java.lang.String r3 = ":ok"
            r4 = 0
            if (r0 == 0) goto L_0x020c
            r11.publish()
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r0 = r11.f9523e
            boolean r0 = r0.f9552a
            if (r0 == 0) goto L_0x01e6
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r2.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = r2.f38996i
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r0.mo10774a(r1, r2, r4)
            goto L_0x0250
        L_0x01e6:
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r2.f38990c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.f38996i
            r3.append(r2)
            java.lang.String r2 = ":fail:"
            r3.append(r2)
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r2 = r11.f9523e
            java.lang.String r2 = r2.f9553b
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.mo10774a(r1, r2, r4)
            goto L_0x0250
        L_0x020c:
            di0.o r0 = new di0.o
            r0.<init>()
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r5 = r11.f9522d
            java.lang.String r6 = r5.f9526a
            r0.f250929a = r6
            java.lang.String r6 = r5.f9527b
            r0.f250934f = r6
            int r6 = r5.f9534i
            r0.f250932d = r6
            int r6 = r5.f9529d
            r0.f250939k = r6
            java.lang.String r6 = r5.f9530e
            r0.f250940l = r6
            int r5 = r5.f9528c
            r0.f250931c = r5
            java.lang.Class<kr0.x0> r5 = kr0.C76630x0.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            kr0.x0 r5 = (kr0.C76630x0) r5
            android.content.Context r6 = r1.f38998a
            r5.mo106898tv(r6, r0)
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r2.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = r2.f38996i
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r0.mo10774a(r1, r2, r4)
        L_0x0250:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z73.C16122h.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return 10000;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "openWeAppPageJsApi";
    }
}
