package z73;

import w83.C15053a;

/* renamed from: z73.g */
public final class C16121g extends C15053a {

    /* renamed from: d */
    public static final C16121g f43307d = new C16121g();

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f4 A[SYNTHETIC, Splitter:B:30:0x00f4] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0136 A[SYNTHETIC, Splitter:B:46:0x0136] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r38, t83.C13851h1 r39) {
        /*
            r37 = this;
            r1 = r38
            r0 = r39
            java.lang.String r2 = "searchBarTextColor"
            java.lang.Class<e00.h0> r3 = e00.C7573h0.class
            java.lang.String r4 = "env"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "msg"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "handleMsg params:"
            r4.append(r5)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r0.f38983a
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.WebSearch.OpenSearchWebViewJSApi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r0.f38983a
            java.lang.String r0 = "actionType"
            r6 = 0
            int r7 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r4, r0, r6)
            java.lang.String r0 = "type"
            int r8 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r4, r0, r6)
            java.lang.String r0 = "extParams"
            java.lang.String r13 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r0)
            java.lang.String r0 = "jumpTo"
            java.lang.String r9 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r0)
            java.lang.String r0 = "navBarColor"
            java.lang.String r10 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r0)
            java.lang.String r0 = "publishId"
            java.lang.String r11 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r0)
            java.lang.String r0 = "hideSearchBar"
            java.lang.String r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r0)
            java.lang.String r12 = "true"
            boolean r14 = gy3.C87412m.m108589b(r0, r12)
            java.lang.String r0 = "isMoreButton"
            java.lang.String r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r0)
            boolean r15 = gy3.C87412m.m108589b(r0, r12)
            java.lang.String r0 = "isShowCancel"
            java.lang.String r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r0)
            boolean r12 = gy3.C87412m.m108589b(r0, r12)
            r39 = r14
            java.lang.String r14 = "isHomePage"
            int r16 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r4, r14, r6)
            java.lang.String r1 = "isSug"
            int r17 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r4, r1, r6)
            java.lang.String r0 = "isHalfScreen"
            int r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r4, r0, r6)
            r6 = 1
            if (r0 != r6) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r6 = 0
        L_0x008d:
            java.lang.String r0 = "nativeConfig"
            java.lang.String r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r0)
            boolean r19 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r20 = r3
            java.lang.String r3 = "title"
            r21 = r1
            java.lang.String r1 = ""
            if (r19 != 0) goto L_0x00e0
            r19 = r14
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x00d4 }
            r14.<init>(r0)     // Catch:{ Exception -> 0x00d4 }
            boolean r0 = r14.has(r3)     // Catch:{ Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = r14.optString(r3, r1)     // Catch:{ Exception -> 0x00d4 }
            r22 = r13
            java.lang.String r13 = "configObj.optString(\"title\", \"\")"
            gy3.C87412m.m108593f(r0, r13)     // Catch:{ Exception -> 0x00bc }
            r13 = r0
            goto L_0x00c1
        L_0x00bc:
            r0 = move-exception
            goto L_0x00d7
        L_0x00be:
            r22 = r13
            r13 = r1
        L_0x00c1:
            boolean r0 = r14.has(r2)     // Catch:{ Exception -> 0x00d2 }
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = r14.optString(r2, r1)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r2 = "configObj.optString(\"searchBarTextColor\", \"\")"
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ Exception -> 0x00d2 }
            r2 = r0
            goto L_0x00e6
        L_0x00d2:
            r0 = move-exception
            goto L_0x00d8
        L_0x00d4:
            r0 = move-exception
            r22 = r13
        L_0x00d7:
            r13 = r1
        L_0x00d8:
            r2 = 0
            java.lang.Object[] r14 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r1, r14)
        L_0x00de:
            r2 = r1
            goto L_0x00e6
        L_0x00e0:
            r22 = r13
            r19 = r14
            r2 = r1
            r13 = r2
        L_0x00e6:
            java.lang.String r0 = "navButtonConfig"
            java.lang.String r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r0)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r23 = r2
            if (r14 != 0) goto L_0x0121
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x0119 }
            r14.<init>(r0)     // Catch:{ Exception -> 0x0119 }
            java.lang.String r0 = "leftBarButtonType"
            java.lang.String r2 = "back"
            java.lang.String r0 = r14.optString(r0, r2)     // Catch:{ Exception -> 0x0119 }
            java.lang.String r2 = "exit"
            boolean r2 = gy3.C87412m.m108589b(r0, r2)     // Catch:{ Exception -> 0x0119 }
            if (r2 == 0) goto L_0x010d
            r2 = 0
            r18 = 1
            goto L_0x0124
        L_0x010d:
            java.lang.String r2 = "none"
            boolean r0 = gy3.C87412m.m108589b(r0, r2)     // Catch:{ Exception -> 0x0119 }
            if (r0 == 0) goto L_0x0121
            r2 = 0
            r18 = 2
            goto L_0x0124
        L_0x0119:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r14 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r1, r14)
            goto L_0x0122
        L_0x0121:
            r2 = 0
        L_0x0122:
            r18 = 0
        L_0x0124:
            if (r6 == 0) goto L_0x0128
            r0 = 2
            goto L_0x012a
        L_0x0128:
            r0 = r18
        L_0x012a:
            java.lang.String r1 = "ftsNeedHideKeyBoard"
            int r1 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r4, r1, r2)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r14 != 0) goto L_0x0149
            int r18 = android.graphics.Color.parseColor(r10)     // Catch:{ Exception -> 0x013d }
            r2 = r18
            goto L_0x014a
        L_0x013d:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "statusBarColor"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r2, r0)
            r1 = 1
            return r1
        L_0x0149:
            r2 = 0
        L_0x014a:
            java.lang.String r5 = "statusBarStyle"
            java.lang.String r5 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r5)
            java.lang.String r10 = "tagId"
            java.lang.String r10 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r10)
            java.lang.String r14 = "sessionId"
            r24 = r6
            java.lang.String r6 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r14)
            r25 = r0
            java.lang.String r0 = "srcUserName"
            com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r0)
            java.lang.String r0 = "scene"
            r26 = r10
            r10 = 0
            int r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r4, r0, r10)
            r27 = r14
            java.lang.String r14 = "subType"
            com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r4, r14, r10)
            r10 = 3
            if (r7 != r10) goto L_0x0353
            java.lang.String r14 = "query"
            java.lang.String r10 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r14)
            r28 = r6
            java.lang.String r6 = "searchId"
            r29 = r14
            java.lang.String r14 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r4, r6)
            r30 = r6
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            r31 = r14
            com.tencent.mm.protocal.JsapiPermissionWrapper r14 = com.tencent.p014mm.protocal.JsapiPermissionWrapper.f121047h
            r32 = r7
            java.lang.String r7 = "hardcode_jspermission"
            r6.putExtra(r7, r14)
            com.tencent.mm.protocal.GeneralControlWrapper r7 = com.tencent.p014mm.protocal.GeneralControlWrapper.f121044e
            java.lang.String r14 = "hardcode_general_ctrl"
            r6.putExtra(r14, r7)
            java.lang.String r7 = "neverGetA8Key"
            r14 = 1
            r6.putExtra(r7, r14)
            java.lang.String r7 = "key_load_js_without_delay"
            r6.putExtra(r7, r14)
            java.lang.String r14 = "ftsQuery"
            r6.putExtra(r14, r10)
            r33 = r7
            java.lang.String r7 = "ftsType"
            r6.putExtra(r7, r8)
            java.lang.String r7 = "customize_status_bar_color"
            r6.putExtra(r7, r2)
            r34 = r2
            java.lang.String r2 = "status_bar_style"
            r6.putExtra(r2, r5)
            r35 = r2
            java.lang.String r2 = "snsContactPage"
            r36 = r5
            r5 = 1
            boolean r2 = z04.C112551y.m153809i(r2, r9, r5)
            java.lang.String r5 = "jumpto_sns_contact_page"
            r6.putExtra(r5, r2)
            java.lang.String r2 = "KPublisherId"
            r6.putExtra(r2, r11)
            java.lang.String r2 = "ftsbizscene"
            r6.putExtra(r2, r0)
            java.lang.String r2 = "ftsismorebutton"
            r6.putExtra(r2, r15)
            java.lang.String r2 = "ftsisshowcancel"
            r6.putExtra(r2, r12)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r2 != 0) goto L_0x01fa
            r6.putExtra(r3, r13)
        L_0x01fa:
            java.lang.String r2 = "tabPageType"
            r3 = 0
            int r2 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r4, r2, r3)
            java.lang.String r3 = "ftsneedkeyboard"
            r4 = 1
            if (r1 == r4) goto L_0x0219
            r5 = 2
            if (r1 != r5) goto L_0x020b
            goto L_0x0219
        L_0x020b:
            if (r1 > 0) goto L_0x0215
            r1 = 7
            r5 = r32
            if (r5 != r1) goto L_0x0215
            r6.putExtra(r3, r4)
        L_0x0215:
            r1 = r22
            r3 = 0
            goto L_0x0222
        L_0x0219:
            if (r1 != r4) goto L_0x021d
            r1 = 1
            goto L_0x021e
        L_0x021d:
            r1 = 0
        L_0x021e:
            r6.putExtra(r3, r1)
            goto L_0x0215
        L_0x0222:
            java.util.Map r4 = u73.C101987v0.m134268b(r0, r3, r8, r1)
            java.lang.String r3 = "utf-8"
            java.lang.String r3 = p206nj.C117627q.m165909b(r10, r3)     // Catch:{ all -> 0x022e }
            goto L_0x022f
        L_0x022e:
            r3 = r10
        L_0x022f:
            r5 = r4
            java.util.HashMap r5 = (java.util.HashMap) r5
            r9 = r29
            r5.put(r9, r3)
            r9 = r30
            r3 = r31
            r5.put(r9, r3)
            java.lang.String r9 = java.lang.String.valueOf(r16)
            r11 = r19
            r5.put(r11, r9)
            java.lang.String r9 = java.lang.String.valueOf(r17)
            r11 = r21
            r5.put(r11, r9)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r28)
            if (r9 != 0) goto L_0x0261
            r9 = r27
            r15 = r28
            r5.put(r9, r15)
            r6.putExtra(r9, r15)
            goto L_0x0263
        L_0x0261:
            r15 = r28
        L_0x0263:
            java.lang.String r11 = u73.C101987v0.m134271e(r0)
            java.lang.String r9 = "subSessionId"
            r5.put(r9, r11)
            r6.putExtra(r9, r11)
            r5 = 0
            java.lang.String r4 = u73.C101987v0.m134270d(r4, r5)
            java.lang.String r5 = "rawUrl"
            r6.putExtra(r5, r4)
            r6.putExtra(r14, r10)
            r4 = r34
            r6.putExtra(r7, r4)
            r5 = r35
            r4 = r36
            r6.putExtra(r5, r4)
            java.lang.String r4 = "tabId"
            r5 = r26
            r6.putExtra(r4, r5)
            r4 = r33
            r5 = 1
            r6.putExtra(r4, r5)
            java.lang.String r4 = "key_back_btn_type"
            r7 = r25
            r6.putExtra(r4, r7)
            java.lang.String r4 = "key_search_bar_text_color"
            r7 = r23
            r6.putExtra(r4, r7)
            java.lang.String r4 = "ftscaneditable"
            if (r2 != r5) goto L_0x02bd
            r2 = 0
            r6.putExtra(r4, r2)
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0 = r11
            r11 = r6
            r12 = r13
            r13 = r1
            r14 = r3
            r16 = r0
            u73.C101987v0.m134277k(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0353
        L_0x02bd:
            r1 = 20
            if (r0 == r1) goto L_0x0328
            r1 = 22
            if (r0 == r1) goto L_0x0328
            r1 = 33
            if (r0 == r1) goto L_0x0328
            r1 = 3
            if (r0 == r1) goto L_0x0328
            r1 = 34
            if (r0 == r1) goto L_0x0328
            r1 = 65
            if (r0 == r1) goto L_0x0328
            r1 = 36
            if (r0 == r1) goto L_0x0328
            r1 = 100
            if (r0 == r1) goto L_0x0328
            r1 = 67
            if (r0 != r1) goto L_0x02e1
            goto L_0x0328
        L_0x02e1:
            java.lang.String r1 = "key_change_search_icon"
            r2 = 1
            r6.putExtra(r1, r2)
            java.lang.String r1 = "key_search_icon_and_hint_fix_default"
            r6.putExtra(r1, r2)
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r8 != r1) goto L_0x02f4
            r1 = 42
            if (r0 == r1) goto L_0x02f8
        L_0x02f4:
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 != r1) goto L_0x02fe
        L_0x02f8:
            java.lang.String r0 = "ftsForceShowDarkMode"
            r1 = 1
            r6.putExtra(r0, r1)
        L_0x02fe:
            if (r24 == 0) goto L_0x0304
            r1 = 0
            r6.putExtra(r4, r1)
        L_0x0304:
            if (r12 == 0) goto L_0x0318
            di3.d r0 = di3.C86312j.m106911c(r20)
            e00.h0 r0 = (e00.C7573h0) r0
            r1 = r38
            android.content.Context r1 = r1.f38998a
            r2 = 800(0x320, float:1.121E-42)
            r3 = r24
            r0.mo8675kO(r1, r6, r2, r3)
            goto L_0x0353
        L_0x0318:
            r1 = r38
            r3 = r24
            di3.d r0 = di3.C86312j.m106911c(r20)
            e00.h0 r0 = (e00.C7573h0) r0
            android.content.Context r1 = r1.f38998a
            r0.mo8674LC(r1, r6, r3)
            goto L_0x0353
        L_0x0328:
            r1 = r38
            r3 = r24
            java.lang.String r2 = "key_search_icon_and_hint_fix_default"
            r4 = 1
            r6.putExtra(r2, r4)
            java.lang.String r2 = "ftsInitToSearch"
            r6.putExtra(r2, r4)
            java.lang.String r2 = "hideSearchInput"
            r5 = r39
            r6.putExtra(r2, r5)
            r2 = 125(0x7d, float:1.75E-43)
            if (r0 != r2) goto L_0x0347
            java.lang.String r0 = "ftsForceShowDarkMode"
            r6.putExtra(r0, r4)
        L_0x0347:
            di3.d r0 = di3.C86312j.m106911c(r20)
            e00.h0 r0 = (e00.C7573h0) r0
            android.content.Context r1 = r1.f38998a
            r0.n10(r1, r6, r3, r4)
            goto L_0x0354
        L_0x0353:
            r4 = 1
        L_0x0354:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z73.C16121g.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return 10000;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "openSearchWebviewJsApi";
    }
}
