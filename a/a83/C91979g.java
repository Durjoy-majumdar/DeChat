package a83;

import com.tencent.p014mm.autogen.events.PreLoadWebSearchDataEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: a83.g */
public class C91979g extends IStaticListener<PreLoadWebSearchDataEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02e4 A[SYNTHETIC, Splitter:B:65:0x02e4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r32) {
        /*
            r31 = this;
            r0 = r32
            com.tencent.mm.autogen.events.PreLoadWebSearchDataEvent r0 = (com.tencent.p014mm.autogen.events.PreLoadWebSearchDataEvent) r0
            java.lang.Class<com.tencent.mm.plugin.websearch.l> r1 = com.tencent.p014mm.plugin.websearch.C96603l.class
            di3.d r2 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.websearch.l r2 = (com.tencent.p014mm.plugin.websearch.C96603l) r2
            u73.k r2 = r2.mo134690lS()
            com.tencent.mm.autogen.events.PreLoadWebSearchDataEvent$a r0 = r0.f264991d
            java.lang.String r14 = r0.f264996e
            java.lang.String r15 = r0.f264992a
            java.lang.String r13 = r0.f264993b
            java.lang.String r12 = r0.f264994c
            int r11 = r0.f264995d
            java.lang.String r9 = r0.f264997f
            java.lang.String r10 = r0.f264998g
            int r8 = r0.f264999h
            int r7 = r0.f265000i
            java.lang.String r6 = r0.f265001j
            java.util.Map<java.lang.String, java.lang.String> r5 = r0.f265002k
            com.tencent.mm.plugin.websearch.h r2 = (com.tencent.p014mm.plugin.websearch.C96598h) r2
            r2.getClass()
            r0 = 20
            r4 = 1
            r3 = 2
            r32 = r13
            r13 = 0
            r16 = r7
            java.lang.String r7 = "MicroMsg.WebSearch.FTSWebSearchLogic"
            if (r11 != r0) goto L_0x00d0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r13] = r14
            r0[r4] = r15
            java.lang.String r3 = "preGetTeachSearchData requestId:%s, sessionId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r0)
            di3.d r0 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.websearch.l r0 = (com.tencent.p014mm.plugin.websearch.C96603l) r0
            com.tencent.mm.plugin.websearch.FTSWebViewLogic r1 = r0.f282816j
            if (r1 != 0) goto L_0x0057
            com.tencent.mm.plugin.websearch.FTSWebViewLogic r1 = new com.tencent.mm.plugin.websearch.FTSWebViewLogic
            r1.<init>()
            r0.f282816j = r1
        L_0x0057:
            com.tencent.mm.plugin.websearch.FTSWebViewLogic r0 = r0.f282816j
            r1 = 20
            u73.c r1 = r0.mo134656a(r1, r13, r4)
            boolean r1 = r1.mo141493c()
            if (r1 == 0) goto L_0x0067
            goto L_0x00d0
        L_0x0067:
            java.lang.String r1 = "do real preGetTeachSearchData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            u73.o r1 = r2.f282796o
            com.tencent.mm.plugin.websearch.n r1 = (com.tencent.p014mm.plugin.websearch.C96604n) r1
            r3 = 2
            r1.mo134696c(r3, r14)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r3 = 1048(0x418, float:1.469E-42)
            r1.mo123455a(r3, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r0)
            java.lang.String r1 = "discoverSearchEntry"
            org.json.JSONObject r1 = u73.C78137s0.m94340d(r1)
            java.lang.String r3 = "guideParam"
            long r19 = r1.optLong(r3)
            u73.i0 r1 = new u73.i0
            int r17 = com.tencent.p014mm.plugin.websearch.C43471q.m46977a(r13)
            r21 = -1
            r22 = 20
            r23 = 0
            r24 = 0
            r3 = r1
            r4 = r22
            r25 = r5
            r5 = r23
            r18 = r6
            r6 = r17
            r27 = r7
            r26 = r16
            r7 = r21
            r16 = r8
            r8 = r0
            r0 = r9
            r28 = r10
            r9 = r19
            r29 = r11
            r11 = r14
            r17 = r12
            r12 = r15
            r30 = r32
            r19 = r2
            r2 = 0
            r13 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r12, r13)
            ob0.b0 r3 = f40.C86709a0.m107524d()
            r3.mo123460f(r1)
            goto L_0x00e6
        L_0x00d0:
            r30 = r32
            r19 = r2
            r25 = r5
            r18 = r6
            r27 = r7
            r0 = r9
            r28 = r10
            r29 = r11
            r17 = r12
            r26 = r16
            r2 = 0
            r16 = r8
        L_0x00e6:
            boolean r1 = android.text.TextUtils.isEmpty(r17)
            if (r1 == 0) goto L_0x0104
            boolean r1 = android.text.TextUtils.isEmpty(r18)
            if (r1 == 0) goto L_0x0104
            r1 = 2
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r3 = r17
            r0[r2] = r3
            r4 = 1
            r0[r4] = r18
            java.lang.String r1 = "do not pre get data query:%s,reqKey:%s"
            r5 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            goto L_0x0161
        L_0x0104:
            r3 = r17
            r5 = r27
            r1 = 2
            r4 = 1
            java.lang.Class<u73.n> r6 = u73.C101980n.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            u73.n r6 = (u73.C101980n) r6
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = r6.mo134692sm()
            java.lang.String r7 = ""
            java.lang.String r8 = "websearch_preget_extReqParams"
            java.lang.String r8 = r6.decodeString(r8, r7)
            java.lang.String r9 = "websearch_preget_version"
            int r6 = r6.decodeInt(r9, r2)
            int r9 = com.tencent.p014mm.plugin.websearch.C43471q.m46977a(r2)
            r10 = 3
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r2] = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11[r4] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r11[r1] = r6
            java.lang.String r6 = "getPreGetExtReqParams_:%s,set %s, cur %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r11)
            boolean r6 = android.text.TextUtils.isEmpty(r8)
            r6 = r6 ^ r4
            r9 = 4
            if (r6 != 0) goto L_0x0164
            java.lang.Object[] r0 = new java.lang.Object[r9]
            int r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46977a(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            r0[r4] = r14
            r0[r1] = r15
            r6 = r30
            r0[r10] = r6
            java.lang.String r1 = "do no support pre get data, h5.ver %d, seq %s, sessionId %s, subSessionId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r1, r0)
        L_0x0161:
            r1 = 0
            goto L_0x0360
        L_0x0164:
            r6 = r30
            long r11 = java.lang.System.currentTimeMillis()
            r13 = r19
            long r1 = r13.f282793i
            long r11 = r11 - r1
            long r1 = com.tencent.p014mm.plugin.websearch.C96598h.f282786u
            int r17 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r17 > 0) goto L_0x017c
            java.lang.String r0 = "pre get data fail for time interval limit"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            goto L_0x0161
        L_0x017c:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r2 = 0
            int r9 = com.tencent.p014mm.plugin.websearch.C43471q.m46977a(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r2] = r9
            r1[r4] = r14
            r2 = 2
            r1[r2] = r15
            r1[r10] = r6
            java.lang.String r2 = "pre get data, h5.ver %d, seq %s, sessionId %s, subSessionId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r2, r1)
            java.lang.String r1 = "requestId"
            java.lang.String r2 = "textValue"
            java.lang.String r9 = "key"
            java.lang.String r10 = "preGetSearchData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.String r11 = "displayPattern"
            java.lang.String r12 = "2"
            r10.put(r11, r12)
            java.lang.String r11 = "query"
            r10.put(r11, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r11 = r29
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r11 = "scene"
            r10.put(r11, r3)
            java.lang.String r3 = "type"
            java.lang.String r11 = "0"
            r10.put(r3, r11)
            java.lang.String r3 = "isHomePage"
            java.lang.String r11 = "1"
            r10.put(r3, r11)
            java.lang.String r3 = "sugId"
            r11 = r28
            r10.put(r3, r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            java.lang.String r11 = "sceneActionType"
            r10.put(r11, r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r11 = "parentSearchID"
            if (r3 == 0) goto L_0x0204
            r3 = r25
            if (r3 == 0) goto L_0x0206
            java.lang.Object r0 = r3.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0206
        L_0x0204:
            r3 = r25
        L_0x0206:
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            r16 = 0
            if (r12 != 0) goto L_0x0215
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ all -> 0x0214 }
            r12.<init>(r8)     // Catch:{ all -> 0x0214 }
            goto L_0x0217
        L_0x0214:
        L_0x0215:
            r12 = r16
        L_0x0217:
            if (r12 != 0) goto L_0x021e
            org.json.JSONArray r12 = new org.json.JSONArray
            r12.<init>()
        L_0x021e:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0261 }
            r8.<init>()     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r4 = "netType"
            r8.put(r9, r4)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r4 = com.tencent.p014mm.plugin.websearch.C43471q.m46979c()     // Catch:{ JSONException -> 0x0261 }
            r8.put(r2, r4)     // Catch:{ JSONException -> 0x0261 }
            r12.put(r8)     // Catch:{ JSONException -> 0x0261 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0261 }
            r4.<init>()     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r8 = "currentPage"
            r4.put(r9, r8)     // Catch:{ JSONException -> 0x0261 }
            r8 = 1
            r4.put(r2, r8)     // Catch:{ JSONException -> 0x0261 }
            r12.put(r4)     // Catch:{ JSONException -> 0x0261 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0261 }
            r4.<init>()     // Catch:{ JSONException -> 0x0261 }
            r4.put(r9, r1)     // Catch:{ JSONException -> 0x0261 }
            r4.put(r2, r14)     // Catch:{ JSONException -> 0x0261 }
            r12.put(r4)     // Catch:{ JSONException -> 0x0261 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0261 }
            r4.<init>()     // Catch:{ JSONException -> 0x0261 }
            r4.put(r9, r11)     // Catch:{ JSONException -> 0x0261 }
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x0261 }
            r12.put(r4)     // Catch:{ JSONException -> 0x0261 }
            goto L_0x0268
        L_0x0261:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r8 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r7, r8)
        L_0x0268:
            if (r3 == 0) goto L_0x02b3
            java.lang.String r0 = "crossExtReqParams"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0295
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x0294 }
            java.lang.String r0 = android.net.Uri.decode(r0)     // Catch:{ all -> 0x0294 }
            r4.<init>(r0)     // Catch:{ all -> 0x0294 }
            r0 = 0
        L_0x0282:
            int r7 = r4.length()     // Catch:{ all -> 0x0294 }
            if (r0 >= r7) goto L_0x0295
            org.json.JSONObject r7 = r4.optJSONObject(r0)     // Catch:{ all -> 0x0294 }
            if (r7 == 0) goto L_0x0291
            r12.put(r7)     // Catch:{ all -> 0x0294 }
        L_0x0291:
            int r0 = r0 + 1
            goto L_0x0282
        L_0x0294:
        L_0x0295:
            java.lang.String r0 = "cachePageResult"
            java.lang.Object r4 = r3.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r7 != 0) goto L_0x02b3
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x02b2 }
            r7.<init>()     // Catch:{ Exception -> 0x02b2 }
            r7.put(r9, r0)     // Catch:{ Exception -> 0x02b2 }
            r7.put(r2, r4)     // Catch:{ Exception -> 0x02b2 }
            r12.put(r7)     // Catch:{ Exception -> 0x02b2 }
            goto L_0x02b3
        L_0x02b2:
        L_0x02b3:
            java.lang.String r0 = r12.toString()
            java.lang.String r2 = "extReqParams"
            r10.put(r2, r0)
            java.lang.String r0 = "sessionId"
            r10.put(r0, r15)
            java.lang.String r0 = "subSessionId"
            r10.put(r0, r6)
            r10.put(r1, r14)
            if (r3 == 0) goto L_0x02d0
            r10.putAll(r3)
        L_0x02d0:
            u73.a0 r0 = r13.mo134676b(r10)
            r1 = r26
            r2 = 1
            if (r1 == r2) goto L_0x02dc
            r2 = 2
            if (r1 != r2) goto L_0x02de
        L_0x02dc:
            r0.f300179A = r1
        L_0x02de:
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            if (r2 != 0) goto L_0x02ec
            java.lang.String r2 = java.net.URLDecoder.decode(r18)     // Catch:{ all -> 0x02eb }
            r0.f300180B = r2     // Catch:{ all -> 0x02eb }
            goto L_0x02ee
        L_0x02eb:
        L_0x02ec:
            r2 = r16
        L_0x02ee:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x034b
            r3 = 2
            if (r1 != r3) goto L_0x034b
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r3 = 0
            r4[r3] = r14
            java.lang.String r6 = "preGetChatSearchData:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            u73.a0 r4 = new u73.a0
            r4.<init>()
            r4.f300191f = r3
            r4.f300210y = r14
            r4.f300179A = r1
            r4.f300180B = r2
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "req_key"
            java.lang.String r3 = r4.f300180B     // Catch:{ all -> 0x034b }
            r1.put(r2, r3)     // Catch:{ all -> 0x034b }
            java.lang.String r2 = "action"
            java.lang.String r3 = "chatimgsearch_by_req_key"
            r1.put(r2, r3)     // Catch:{ all -> 0x034b }
            java.lang.String r2 = "sessionid64"
            r1.put(r2, r15)     // Catch:{ all -> 0x034b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x034b }
            r4.f300181C = r1     // Catch:{ all -> 0x034b }
            u73.o r2 = r13.f282796o     // Catch:{ all -> 0x034b }
            r3 = r2
            com.tencent.mm.plugin.websearch.n r3 = (com.tencent.p014mm.plugin.websearch.C96604n) r3     // Catch:{ all -> 0x034b }
            java.lang.String r1 = r3.mo134694a(r1)     // Catch:{ all -> 0x034b }
            com.tencent.mm.plugin.websearch.n r2 = (com.tencent.p014mm.plugin.websearch.C96604n) r2     // Catch:{ all -> 0x034b }
            r3 = 0
            r2.mo134696c(r3, r1)     // Catch:{ all -> 0x034b }
            u73.g0 r1 = new u73.g0     // Catch:{ all -> 0x034b }
            r1.<init>(r4)     // Catch:{ all -> 0x034b }
            ob0.b0 r2 = f40.C86709a0.m107524d()     // Catch:{ all -> 0x034b }
            r2.mo123460f(r1)     // Catch:{ all -> 0x034b }
        L_0x034b:
            u73.o r1 = r13.f282796o
            com.tencent.mm.plugin.websearch.n r1 = (com.tencent.p014mm.plugin.websearch.C96604n) r1
            r2 = 1
            r1.mo134696c(r2, r14)
            com.tencent.mm.plugin.websearch.h$d r1 = r13.f282797p
            r1.mo134679a(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r13.f282793i = r0
            goto L_0x0161
        L_0x0360:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a83.C91979g.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
