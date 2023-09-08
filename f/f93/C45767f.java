package f93;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: f93.f */
public final class C45767f {

    /* renamed from: a */
    public static final C45767f f123649a = new C45767f();

    /* renamed from: b */
    public static final MMKVSlotManager f123650b;

    /* renamed from: c */
    public static final C13601g f123651c = C36568h.m40985a(C8000b.f26688d);

    /* renamed from: d */
    public static final C13601g f123652d = C36568h.m40985a(C8001c.f26689d);

    /* renamed from: e */
    public static long f123653e;

    /* renamed from: f93.f$a */
    public static final class C7999a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C7999a f26687d = new C7999a();

        public C7999a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("_webview_web_prefetcher_test_info");
        }
    }

    /* renamed from: f93.f$b */
    public static final class C8000b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C8000b f26688d = new C8000b();

        public C8000b() {
            super(0);
        }

        public Object invoke() {
            C32735h.C32737c cVar = C32735h.C32737c.clicfg_prefetch_test_general_control_7;
            Class cls = C32735h.class;
            return Integer.valueOf((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) ? ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 1) : ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0));
        }
    }

    /* renamed from: f93.f$c */
    public static final class C8001c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C8001c f26689d = new C8001c();

        public C8001c() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_prefetch_test_close_7, 0));
        }
    }

    /* renamed from: f93.f$d */
    public static final class C8002d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C8002d f26690d = new C8002d();

        public C8002d() {
            super(0);
        }

        public Object invoke() {
            C32735h.C32737c cVar = C32735h.C32737c.clicfg_prefetch_test_scene_7;
            Class cls = C32735h.class;
            return Integer.valueOf((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) ? ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO) : ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0));
        }
    }

    static {
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) C36568h.m40985a(C7999a.f26687d).getValue();
        C87412m.m108593f(multiProcessMMKV, "kvWebPrefetchTest");
        f123650b = new MMKVSlotManager(multiProcessMMKV, 25200);
        C36568h.m40985a(C8002d.f26690d);
    }

    /* renamed from: a */
    public static final boolean m51055a(int i) {
        if (((Number) ((C36570n) f123651c).getValue()).intValue() <= 0 || ((Number) ((C36570n) f123652d).getValue()).intValue() != 1) {
            return false;
        }
        Log.m105924i("MicroMsg.WebViewPrefetchTestReportUtil", "ClosePrefetch but KeepA8key");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fa  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71242b(f93.C45764a r20, f93.C45766c r21) {
        /*
            r19 = this;
            r1 = r20
            r2 = r21
            f93.a r3 = f93.C45764a.PageFinish
            f93.a r4 = f93.C45764a.PageCommit
            f93.a r5 = f93.C45764a.PageStart
            f93.a r6 = f93.C45764a.StartLoad
            java.lang.String r0 = "action"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "controllerInfo"
            gy3.C87412m.m108594g(r2, r0)
            boolean r0 = r2.f123645l
            if (r0 == 0) goto L_0x001b
            return
        L_0x001b:
            boolean r0 = r2.f123644k
            java.lang.String r7 = "MicroMsg.WebViewPrefetchTestReportUtil"
            r8 = 0
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "reportPrefetchTest useCacheControl ignore report"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            f123653e = r8
            return
        L_0x002b:
            java.lang.String r0 = r2.f123635b
            int r0 = r0.length()
            r10 = 1
            r11 = 0
            if (r0 != 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "reportPrefetchTest reportUrl empty and ignore report"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)
            return
        L_0x0040:
            java.lang.String r0 = r2.f123635b
            java.lang.String r12 = "file://"
            r13 = 2
            r14 = 0
            boolean r0 = z04.C112551y.m153820t(r0, r12, r11, r13, r14)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "reportPrefetchTest reportUrl startsWith file://, and ignore report"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)
            return
        L_0x0052:
            long r15 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r2.f123636c
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0060
            r0 = 1
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r2.f123636c
            goto L_0x0070
        L_0x0066:
            ea3.c r0 = ea3.C45586c.f123303a
            java.lang.String r12 = r2.f123635b
            java.lang.String r14 = "from"
            java.lang.String r0 = r0.mo71108a(r12, r14, r10)
        L_0x0070:
            r12 = r0
            r14 = 6
            java.lang.Object[] r0 = new java.lang.Object[r14]
            int r17 = r21.hashCode()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r0[r11] = r17
            r0[r10] = r1
            f93.b r14 = r2.f123647n
            r0[r13] = r14
            long r13 = r2.f123634a
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r14 = 3
            r0[r14] = r13
            r13 = 4
            r0[r13] = r12
            java.lang.String r13 = r2.f123635b
            r14 = 5
            r0[r14] = r13
            java.lang.String r13 = "reportPrefetchTest controllerInfo: %s, action: %s, prefetchCompleteStatus: %s, session: %s, key: %s, url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r7, r13, r0)
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r0 = f123650b
            java.lang.Object r0 = r0.findSlot(r12)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r0
            if (r0 == 0) goto L_0x00d2
            boolean r13 = r0.containsKey(r12)
            if (r13 == 0) goto L_0x00d2
            byte[] r0 = r0.decodeBytes(r12)
            if (r0 == 0) goto L_0x00d2
            int r13 = r0.length
            if (r13 != 0) goto L_0x00b5
            r13 = 1
            goto L_0x00b6
        L_0x00b5:
            r13 = 0
        L_0x00b6:
            r13 = r13 ^ r10
            if (r13 == 0) goto L_0x00d2
            java.lang.Class<te3.n25> r13 = te3.n25.class
            java.lang.Object r13 = r13.newInstance()     // Catch:{ Exception -> 0x00c8 }
            r14 = r13
            pe3.a r14 = (pe3.C47465a) r14     // Catch:{ Exception -> 0x00c8 }
            r14.parseFrom(r0)     // Catch:{ Exception -> 0x00c8 }
            pe3.a r13 = (pe3.C47465a) r13     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00d3
        L_0x00c8:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r11]
            java.lang.String r14 = "MultiProcessMMKV.decodeProtoBuffer"
            java.lang.String r11 = "decode ProtoBuffer"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r11, r13)
        L_0x00d2:
            r13 = 0
        L_0x00d3:
            te3.n25 r13 = (te3.n25) r13
            if (r13 == 0) goto L_0x0313
            java.util.ArrayList<f93.a> r0 = r2.f123646m
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00e5
            r2.f123648o = r10
            f123653e = r8
        L_0x00e3:
            r0 = 0
            goto L_0x00f2
        L_0x00e5:
            boolean r0 = r2.f123648o
            if (r0 == 0) goto L_0x00ec
            f123653e = r8
            goto L_0x00e3
        L_0x00ec:
            java.util.ArrayList<f93.a> r0 = r2.f123646m
            r0.add(r1)
            r0 = 1
        L_0x00f2:
            if (r0 != 0) goto L_0x00fa
            java.lang.String r0 = "check illegal for report!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            return
        L_0x00fa:
            f93.a r0 = f93.C45764a.OnCreateUI
            if (r1 != r0) goto L_0x0100
            r11 = 1
            goto L_0x0101
        L_0x0100:
            r11 = 0
        L_0x0101:
            if (r11 == 0) goto L_0x0126
            long r10 = r2.f123637d
            int r18 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r18 <= 0) goto L_0x0126
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Long> r0 = r2.f123639f
            int r3 = r1.f123627d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            long r4 = r2.f123638e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.put(r3, r4)
            long r3 = r2.f123638e
            long r5 = r2.f123637d
            long r10 = r3 - r5
            long r3 = r3 - r5
            r5 = r3
            r3 = r8
            r14 = r3
            goto L_0x01d8
        L_0x0126:
            if (r1 == r0) goto L_0x0133
            if (r1 == r6) goto L_0x0133
            if (r1 == r5) goto L_0x0133
            if (r1 == r4) goto L_0x0133
            if (r1 != r3) goto L_0x0131
            goto L_0x0133
        L_0x0131:
            r10 = 0
            goto L_0x0134
        L_0x0133:
            r10 = 1
        L_0x0134:
            if (r10 == 0) goto L_0x0192
            java.lang.Long r10 = java.lang.Long.valueOf(r15)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Long> r11 = r2.f123639f
            int r14 = r1.f123627d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r11.put(r14, r10)
            long r10 = r2.f123637d
            long r10 = r15 - r10
            int r14 = r20.ordinal()
            r8 = 2
            if (r14 == r8) goto L_0x015f
            r8 = 3
            if (r14 == r8) goto L_0x015d
            r8 = 4
            if (r14 == r8) goto L_0x015b
            r6 = 5
            if (r14 == r6) goto L_0x0160
            r4 = 0
            goto L_0x0160
        L_0x015b:
            r4 = r5
            goto L_0x0160
        L_0x015d:
            r4 = r6
            goto L_0x0160
        L_0x015f:
            r4 = r0
        L_0x0160:
            if (r4 != 0) goto L_0x0165
            if (r1 != r3) goto L_0x0165
            goto L_0x0166
        L_0x0165:
            r5 = r4
        L_0x0166:
            if (r5 != 0) goto L_0x016b
        L_0x0168:
            r5 = 0
            goto L_0x018b
        L_0x016b:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Long> r0 = r2.f123639f
            int r3 = r5.f123627d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x0168
            r0.longValue()
            long r3 = r0.longValue()
            long r3 = r15 - r3
            r5 = 0
            long r3 = java.lang.Math.max(r5, r3)
            r5 = r3
        L_0x018b:
            r3 = 0
            r8 = 0
            r14 = 0
            goto L_0x01d8
        L_0x0192:
            f93.a r0 = f93.C45764a.OnConnect
            if (r1 != r0) goto L_0x0198
            r0 = 1
            goto L_0x0199
        L_0x0198:
            r0 = 0
        L_0x0199:
            if (r0 == 0) goto L_0x01d2
            long r3 = r2.f123638e
            long r15 = r15 - r3
            f40.j r0 = f40.C86709a0.m107531m()
            j40.a r0 = r0.mo58407a()
            j40.b r0 = (j40.C87829b) r0
            j40.a$a r0 = r0.f124992e
            long r3 = r0.f125000h
            long r5 = r2.f123637d
            long r3 = r3 - r5
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b6
            r3 = r8
        L_0x01b6:
            long r10 = f123653e
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ce
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ce
            long r5 = r10 - r5
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c7
            r5 = r8
        L_0x01c7:
            f123653e = r8
            r10 = r8
            r14 = r15
            r8 = r5
            r5 = r10
            goto L_0x01d8
        L_0x01ce:
            r5 = r8
            r10 = r5
            r14 = r15
            goto L_0x01d8
        L_0x01d2:
            r8 = 0
            r3 = r8
            r5 = r3
            r10 = r5
            r14 = r10
        L_0x01d8:
            java.lang.String r0 = r13.f138354d
            boolean r0 = gy3.C87412m.m108589b(r12, r0)
            if (r0 != 0) goto L_0x01e8
            java.lang.String r0 = r13.f138361n
            boolean r0 = gy3.C87412m.m108589b(r12, r0)
            if (r0 == 0) goto L_0x0313
        L_0x01e8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "jr: action:"
            r0.append(r12)
            r0.append(r1)
            java.lang.String r12 = ", bizScene:"
            r0.append(r12)
            int r12 = r13.f138356f
            r0.append(r12)
            java.lang.String r12 = ", controlType:"
            r0.append(r12)
            int r12 = r13.f138355e
            r0.append(r12)
            java.lang.String r12 = ", completeStatus:"
            r0.append(r12)
            f93.b r12 = r2.f123647n
            r0.append(r12)
            java.lang.String r12 = ", durationFromStart:"
            r0.append(r12)
            r0.append(r10)
            java.lang.String r12 = ",durationFromLast:"
            r0.append(r12)
            r0.append(r5)
            java.lang.String r12 = ", processBootType:"
            r0.append(r12)
            i93.e$a r12 = r2.f123640g
            r0.append(r12)
            java.lang.String r12 = ", webViewBootType: "
            r0.append(r12)
            i93.e$a r12 = r2.f123641h
            r0.append(r12)
            java.lang.String r12 = ", useTimeForToolInit:"
            r0.append(r12)
            r0.append(r3)
            java.lang.String r12 = ",useTimeForConnect:"
            r0.append(r12)
            r0.append(r14)
            java.lang.String r12 = ", useTimeForXWebInit:"
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = ", host: "
            r0.append(r12)
            java.lang.String r12 = r2.f123635b
            java.lang.String r12 = com.tencent.p014mm.plugin.webview.webcompt.C44404a.m48764a(r12)
            r0.append(r12)
            java.lang.String r12 = ", reCreateWebViewUI: "
            r0.append(r12)
            boolean r12 = r2.f123643j
            r0.append(r12)
            java.lang.String r12 = ", processType: "
            r0.append(r12)
            i93.e$d r12 = r2.f123642i
            int r12 = r12.f124570d
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 23214(0x5aae, float:3.253E-41)
            r12 = 15
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r1 = r1.f123627d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r16 = 0
            r12[r16] = r1
            int r1 = r13.f138356f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r16 = 1
            r12[r16] = r1
            int r1 = r13.f138355e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13 = 2
            r12[r13] = r1
            f93.b r1 = r2.f123647n
            int r1 = r1.f123633d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13 = 3
            r12[r13] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r10 = 4
            r12[r10] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r5 = 5
            r12[r5] = r1
            i93.e$a r1 = r2.f123640g
            int r1 = r1.f124559d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 6
            r12[r5] = r1
            r1 = 7
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12[r1] = r3
            r1 = 8
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            r12[r1] = r3
            r1 = 9
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r12[r1] = r3
            r1 = 10
            i93.e$a r3 = r2.f123641h
            int r3 = r3.f124559d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12[r1] = r3
            r1 = 11
            java.lang.String r3 = r2.f123635b
            java.lang.String r3 = com.tencent.p014mm.plugin.webview.webcompt.C44404a.m48764a(r3)
            r12[r1] = r3
            r1 = 12
            boolean r3 = r2.f123643j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12[r1] = r3
            r1 = 13
            long r3 = r2.f123634a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12[r1] = r3
            r1 = 14
            i93.e$d r2 = r2.f123642i
            int r2 = r2.f124570d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12[r1] = r2
            r0.mo160131h(r7, r12)
        L_0x0313:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f93.C45767f.mo71242b(f93.a, f93.c):void");
    }
}
