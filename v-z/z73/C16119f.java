package z73;

import com.tencent.p014mm.sdk.platformtools.Log;
import ht1.C60216z4;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;
import rx3.C13604l;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: z73.f */
public final class C16119f extends C15053a {

    /* renamed from: d */
    public static final C16119f f43303d = new C16119f();

    /* renamed from: z73.f$a */
    public static final class C16120a implements C60216z4.C8821a<Object> {

        /* renamed from: a */
        public final /* synthetic */ HashMap<String, Object> f43304a;

        /* renamed from: b */
        public final /* synthetic */ C13855j f43305b;

        /* renamed from: c */
        public final /* synthetic */ C13851h1 f43306c;

        public C16120a(HashMap<String, Object> hashMap, C13855j jVar, C13851h1 h1Var) {
            this.f43304a = hashMap;
            this.f43305b = jVar;
            this.f43306c = h1Var;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            C13598b0 b0Var;
            Log.m105924i("MicroMsg.WebSearch.OpenFinderViewJSApi", "onCallback callbackReportReadInfo");
            C13604l lVar = obj instanceof C13604l ? (C13604l) obj : null;
            if (lVar != null) {
                HashMap<String, Object> hashMap = this.f43304a;
                C13855j jVar = this.f43305b;
                C13851h1 h1Var = this.f43306c;
                A a = lVar.f38555d;
                Integer num = a instanceof Integer ? (Integer) a : null;
                int intValue = num != null ? num.intValue() : 0;
                B b = lVar.f38556e;
                String str = b instanceof String ? (String) b : null;
                if (str == null) {
                    str = "";
                }
                hashMap.put("retCode", Integer.valueOf(intValue));
                hashMap.put("feed_read_info", str);
                if (intValue == 0) {
                    jVar.f39001d.mo10774a(h1Var.f38990c, h1Var.f38996i + ":ok", hashMap);
                } else {
                    jVar.f39001d.mo10774a(h1Var.f38990c, h1Var.f38996i + ":fail open fail", (Map<String, Object>) null);
                }
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C13855j jVar2 = this.f43305b;
                C13851h1 h1Var2 = this.f43306c;
                Log.m105924i("MicroMsg.WebSearch.OpenFinderViewJSApi", "callbackReportReadInfo null");
                jVar2.f39001d.mo10774a(h1Var2.f38990c, h1Var2.f38996i + ":fail open fail", (Map<String, Object>) null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r13, t83.C13851h1 r14) {
        /*
            r12 = this;
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleMsg params:"
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r14.f38983a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.WebSearch.OpenFinderViewJSApi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r14.f38983a
            java.lang.String r2 = "extInfo"
            java.lang.String r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r0, r2)
            e00.t r3 = r13.mo13183c()
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r3.mo63683n0()
            if (r3 != 0) goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            e00.t r5 = r13.mo13183c()
            if (r5 == 0) goto L_0x0047
            java.lang.String r5 = r5.getCurrentUrl()
            if (r5 != 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r4 = r5
        L_0x0047:
            int r5 = r4.length()
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            if (r5 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r3 = r4
        L_0x0056:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ef }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00ef }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ef }
            r0.<init>()     // Catch:{ Exception -> 0x00ef }
            r0.put(r2, r5)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r2 = "webUrl"
            r0.put(r2, r3)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r2 = "action"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r3 = "openFinderFeed"
            boolean r3 = gy3.C87412m.m108589b(r2, r3)     // Catch:{ Exception -> 0x00ef }
            if (r3 == 0) goto L_0x00aa
            java.lang.String r3 = "behavior"
            org.json.JSONArray r8 = r5.optJSONArray(r3)     // Catch:{ Exception -> 0x009f }
            r5.optJSONObject(r3)     // Catch:{ Exception -> 0x009f }
            if (r8 == 0) goto L_0x00a7
            int r3 = r8.length()     // Catch:{ Exception -> 0x009f }
            r9 = 0
        L_0x008c:
            if (r9 >= r3) goto L_0x00a7
            java.lang.String r10 = r8.getString(r9)     // Catch:{ Exception -> 0x009f }
            java.lang.String r11 = "report_feed_read"
            boolean r10 = gy3.C87412m.m108589b(r10, r11)     // Catch:{ Exception -> 0x009f }
            if (r10 == 0) goto L_0x009c
            r3 = 1
            goto L_0x00a8
        L_0x009c:
            int r9 = r9 + 1
            goto L_0x008c
        L_0x009f:
            r3 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00ef }
            java.lang.String r9 = "getReportRead exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r9, r8)     // Catch:{ Exception -> 0x00ef }
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            r3 = r3 ^ r7
            goto L_0x00ab
        L_0x00aa:
            r3 = 1
        L_0x00ab:
            java.lang.String r8 = "feedFocusChangeNotify"
            boolean r5 = r5.optBoolean(r8)     // Catch:{ Exception -> 0x00ed }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ed }
            r8.<init>()     // Catch:{ Exception -> 0x00ed }
            java.lang.String r9 = "action:"
            r8.append(r9)     // Catch:{ Exception -> 0x00ed }
            r8.append(r2)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r2 = " isCallbackDirect:"
            r8.append(r2)     // Catch:{ Exception -> 0x00ed }
            r8.append(r3)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r2 = " feedFocusChangeNotify "
            r8.append(r2)     // Catch:{ Exception -> 0x00ed }
            r8.append(r5)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r2 = r8.toString()     // Catch:{ Exception -> 0x00ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x00ed }
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x00ed }
            ht1.t1 r2 = (ht1.C60200t1) r2     // Catch:{ Exception -> 0x00ed }
            android.content.Context r5 = r13.f38998a     // Catch:{ Exception -> 0x00ed }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00ed }
            z73.f$a r8 = new z73.f$a     // Catch:{ Exception -> 0x00ed }
            r8.<init>(r4, r13, r14)     // Catch:{ Exception -> 0x00ed }
            r2.mo76898xr(r5, r0, r8)     // Catch:{ Exception -> 0x00ed }
            r0 = 1
            goto L_0x00fa
        L_0x00ed:
            r0 = move-exception
            goto L_0x00f1
        L_0x00ef:
            r0 = move-exception
            r3 = 1
        L_0x00f1:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r5 = "sos openFinderView exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r5, r2)
            r0 = 0
        L_0x00fa:
            if (r3 == 0) goto L_0x0141
            if (r0 == 0) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r6 = -1
        L_0x0100:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.String r2 = "retCode"
            r4.put(r2, r1)
            if (r0 == 0) goto L_0x0126
            t83.g r13 = r13.f39001d
            java.lang.String r0 = r14.f38990c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r14 = r14.f38996i
            r1.append(r14)
            java.lang.String r14 = ":ok"
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r13.mo10774a(r0, r14, r4)
            goto L_0x0141
        L_0x0126:
            t83.g r13 = r13.f39001d
            java.lang.String r0 = r14.f38990c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r14 = r14.f38996i
            r1.append(r14)
            java.lang.String r14 = ":fail open fail"
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r1 = 0
            r13.mo10774a(r0, r14, r1)
        L_0x0141:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z73.C16119f.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return 10000;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "openFinderViewJsApi";
    }
}
