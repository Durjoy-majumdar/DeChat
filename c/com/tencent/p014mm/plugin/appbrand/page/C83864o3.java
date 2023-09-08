package com.tencent.p014mm.plugin.appbrand.page;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.BuildConfig;
import com.tencent.xweb.file.XVFSFile;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import u24.C90599h;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.page.o3 */
public class C83864o3 extends C83858n3 {

    /* renamed from: c */
    public static final C83865a f244851c = new C83865a((C8480h) null);

    /* renamed from: d */
    public static final String f244852d;

    /* renamed from: e */
    public static final String[] f244853e = {"app-wxss.js", "page-frame.html", "common.app.js", "webview.app.js"};

    /* renamed from: f */
    public static final String[] f244854f = {"page-frame.js", "common.app.js", "webview.app.js"};

    /* renamed from: b */
    public final C83910s1 f244855b;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.o3$a */
    public static final class C83865a {
        public C83865a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo116421a(String str, int i) {
            C87412m.m108594g(str, "appId");
            StringBuilder sb = new StringBuilder();
            sb.append('v');
            sb.append(i);
            String g = C90599h.m113514g(new String[]{str, sb.toString()}, '-');
            C87412m.m108593f(g, "join(arrayOf(appId, \"v$version\"), SPLITTER)");
            return g;
        }

        /* renamed from: b */
        public final String mo116422b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append('v');
            sb.append(i);
            String g = C90599h.m113514g(new String[]{BuildConfig.INSTALL_TYPE, sb.toString()}, '-');
            C87412m.m108593f(g, "join(arrayOf(LIB_MAGIC_W…$versionCode\"), SPLITTER)");
            return g;
        }

        /* renamed from: c */
        public final String mo116423c() {
            String str = C83864o3.f244852d + "page_scripts";
            C86013q1.m106461v(str);
            return str;
        }
    }

    static {
        String a = C29552h0.m38798a();
        C87412m.m108593f(a, "retrieve()");
        if (!C112551y.m153808h(a, "/", false, 2, (Object) null)) {
            a = a + XVFSFile.SEPARATOR_CHAR;
        }
        f244852d = a;
        LinkedList<String> linkedList = C84754j1.f247167a;
        if (!TextUtils.isEmpty("//XWEB_SCRIPT:")) {
            LinkedList<String> linkedList2 = C84754j1.f247167a;
            synchronized (linkedList2) {
                linkedList2.add("//XWEB_SCRIPT:");
            }
        }
        String str = C29552h0.m38798a() + "/page";
        if (C86013q1.m106450k(str)) {
            C86013q1.m106446g(str, true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83864o3(C83910s1 s1Var) {
        super(s1Var);
        C87412m.m108594g(s1Var, "renderer");
        this.f244855b = s1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x02b8 A[SYNTHETIC, Splitter:B:105:0x02b8] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02eb A[Catch:{ IOException -> 0x03d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0166 A[SYNTHETIC, Splitter:B:50:0x0166] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0253 A[Catch:{ IOException -> 0x03f4 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo116116a(java.lang.String r31) {
        /*
            r30 = this;
            r1 = r30
            r2 = r31
            r4 = 0
            if (r2 == 0) goto L_0x0010
            int r0 = r31.length()
            if (r0 != 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r5 = 0
            if (r0 == 0) goto L_0x0015
            return r5
        L_0x0015:
            java.lang.String r6 = super.mo116116a(r31)
            if (r6 == 0) goto L_0x0024
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            java.lang.String r7 = "WAWebview.js"
            if (r0 == 0) goto L_0x0039
            boolean r0 = gy3.C87412m.m108589b(r7, r2)
            if (r0 == 0) goto L_0x0038
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 370(0x172, float:5.18E-43)
            r3 = 71
            r0.mo175911u(r2, r3)
        L_0x0038:
            return r5
        L_0x0039:
            java.lang.String r0 = "serialize script["
            java.lang.String r8 = ".utf16"
            java.lang.String[] r9 = p1044ub.C90636f.f260396I0
            java.lang.String r10 = "SCRIPTS_LIB_FOR_WEBVIEW"
            gy3.C87412m.m108593f(r9, r10)
            boolean r9 = sx3.C110823p.m151009y(r9, r2)
            r10 = 47
            java.lang.String r11 = "Luggage.WXA.MPPageScriptProviderXWebCodeCacheImpl"
            if (r9 == 0) goto L_0x008c
            boolean r7 = gy3.C87412m.m108589b(r2, r7)
            if (r7 == 0) goto L_0x00c1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.tencent.mm.plugin.appbrand.page.o3$a r9 = f244851c
            java.lang.String r13 = r9.mo116423c()
            r7.append(r13)
            r7.append(r10)
            com.tencent.mm.plugin.appbrand.page.s1 r13 = r1.f244855b
            com.tencent.mm.plugin.appbrand.jsapi.f r13 = r13.mo124764Z()
            com.tencent.mm.plugin.appbrand.page.t1 r13 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r13
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r13 = r13.mo114272k()
            java.lang.String r14 = "renderer.libReader"
            gy3.C87412m.m108593f(r13, r14)
            int r13 = r13.mo113371a()
            java.lang.String r9 = r9.mo116422b(r13)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.vfs.C86013q1.m106461v(r7)
            goto L_0x00ff
        L_0x008c:
            com.tencent.mm.plugin.appbrand.page.s1 r7 = r1.f244855b
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r7 = r7.mo116498d0()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r7 = r7.f238149o
            int r7 = r7.f239365g
            boolean r7 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r7)
            if (r7 != 0) goto L_0x009d
            goto L_0x00c1
        L_0x009d:
            java.lang.String[] r7 = f244853e
            boolean r7 = sx3.C110823p.m151009y(r7, r2)
            if (r7 == 0) goto L_0x00a6
            goto L_0x00bc
        L_0x00a6:
            java.lang.String[] r7 = f244854f
            int r9 = r7.length
            r13 = 0
        L_0x00aa:
            if (r13 >= r9) goto L_0x00b9
            r14 = r7[r13]
            r15 = 2
            boolean r15 = z04.C112551y.m153808h(r2, r14, r4, r15, r5)
            if (r15 == 0) goto L_0x00b6
            goto L_0x00ba
        L_0x00b6:
            int r13 = r13 + 1
            goto L_0x00aa
        L_0x00b9:
            r14 = r5
        L_0x00ba:
            if (r14 == 0) goto L_0x00be
        L_0x00bc:
            r7 = 1
            goto L_0x00bf
        L_0x00be:
            r7 = 0
        L_0x00bf:
            if (r7 != 0) goto L_0x00c8
        L_0x00c1:
            r13 = r5
            r3 = r6
            r5 = r1
            r1 = r2
            r2 = r11
            goto L_0x0459
        L_0x00c8:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.tencent.mm.plugin.appbrand.page.o3$a r9 = f244851c
            java.lang.String r13 = r9.mo116423c()
            r7.append(r13)
            r7.append(r10)
            com.tencent.mm.plugin.appbrand.page.s1 r13 = r1.f244855b
            java.lang.String r13 = r13.mo125215b0()
            java.lang.String r14 = "renderer.appId"
            gy3.C87412m.m108593f(r13, r14)
            com.tencent.mm.plugin.appbrand.page.s1 r14 = r1.f244855b
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r14 = r14.mo116498d0()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r14 = r14.mo113210l1()
            int r14 = r14.f234802F
            java.lang.String r9 = r9.mo116421a(r13, r14)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.vfs.C86013q1.m106461v(r7)
        L_0x00ff:
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream
            java.nio.charset.Charset r13 = z04.C119027c.f356488a
            byte[] r14 = r6.getBytes(r13)
            java.lang.String r15 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r14, r15)
            r9.<init>(r14)
            r14 = 16384(0x4000, float:2.2959E-41)
            java.lang.String r14 = p823sg.C90193h.m112874b(r9, r14)     // Catch:{ all -> 0x04da }
            java.lang.String r3 = "getMD5(inputStream, 16*1024)"
            gy3.C87412m.m108593f(r14, r3)     // Catch:{ all -> 0x04da }
            cy3.C58003b.m67160a(r9, r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r10)
            r3.append(r14)
            r9 = 45
            r3.append(r9)
            java.lang.String r9 = "UTF-8"
            java.lang.String r9 = p206nj.C117627q.m165909b(r2, r9)
            java.lang.String r10 = "encode(this, \"UTF-8\")"
            gy3.C87412m.m108593f(r9, r10)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)     // Catch:{ IOException -> 0x03fa }
            java.lang.String r10 = " frames! runProfiled:log:"
            java.lang.String r5 = "block main thread and skip "
            java.lang.String r4 = "runProfiled:log:"
            r17 = 32
            java.lang.String r12 = "] appId["
            r19 = r7
            java.lang.String r7 = " isMainThread: "
            r20 = r11
            java.lang.String r11 = " ms result:"
            r21 = r15
            java.lang.String r15 = " cost "
            r22 = r6
            java.lang.String r6 = "Luggage.Utils.Profile"
            r23 = r13
            if (r9 == 0) goto L_0x0253
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x024c }
            r9.<init>()     // Catch:{ IOException -> 0x024c }
            java.lang.String r13 = "check serialized file md5 script["
            r9.append(r13)     // Catch:{ IOException -> 0x024c }
            r9.append(r2)     // Catch:{ IOException -> 0x024c }
            r9.append(r12)     // Catch:{ IOException -> 0x024c }
            com.tencent.mm.plugin.appbrand.page.s1 r13 = r1.f244855b     // Catch:{ IOException -> 0x024c }
            java.lang.String r13 = r13.mo125215b0()     // Catch:{ IOException -> 0x024c }
            r9.append(r13)     // Catch:{ IOException -> 0x024c }
            r13 = 93
            r9.append(r13)     // Catch:{ IOException -> 0x024c }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x024c }
            long r24 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x024c }
            com.tencent.mm.vfs.m1 r13 = new com.tencent.mm.vfs.m1     // Catch:{ IOException -> 0x024c }
            r13.<init>((java.lang.String) r3)     // Catch:{ IOException -> 0x024c }
            java.lang.String r13 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo.m99521f(r13)     // Catch:{ IOException -> 0x024c }
            r26 = r8
            boolean r8 = r13 instanceof p170ic.C87690d.C87691a     // Catch:{ IOException -> 0x0247 }
            if (r8 == 0) goto L_0x01a5
            r8 = r13
            ic.d$a r8 = (p170ic.C87690d.C87691a) r8     // Catch:{ IOException -> 0x01a3 }
            java.lang.String r8 = r8.mo63320l()     // Catch:{ IOException -> 0x01a3 }
            goto L_0x01b5
        L_0x01a3:
            r0 = move-exception
            goto L_0x01ae
        L_0x01a5:
            if (r13 == 0) goto L_0x01b3
            java.lang.String r8 = r13.toString()     // Catch:{ IOException -> 0x01a3 }
            if (r8 != 0) goto L_0x01b5
            goto L_0x01b3
        L_0x01ae:
            r5 = r1
            r1 = r2
            r13 = r3
            goto L_0x0406
        L_0x01b3:
            java.lang.String r8 = ""
        L_0x01b5:
            r27 = r3
            boolean r3 = com.tencent.p014mm.plugin.appbrand.utils.C2039g2.m1987a()     // Catch:{ IOException -> 0x03f4 }
            long r28 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x03f4 }
            long r1 = r28 - r24
            int r24 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r24 <= 0) goto L_0x0205
            if (r3 == 0) goto L_0x0205
            r24 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03f4 }
            r12.<init>()     // Catch:{ IOException -> 0x03f4 }
            r12.append(r5)     // Catch:{ IOException -> 0x03f4 }
            r25 = r5
            r29 = r13
            r28 = r14
            r5 = 16
            long r13 = (long) r5     // Catch:{ IOException -> 0x03f4 }
            long r13 = r1 / r13
            int r5 = (int) r13     // Catch:{ IOException -> 0x03f4 }
            r12.append(r5)     // Catch:{ IOException -> 0x03f4 }
            r12.append(r10)     // Catch:{ IOException -> 0x03f4 }
            r12.append(r9)     // Catch:{ IOException -> 0x03f4 }
            r12.append(r15)     // Catch:{ IOException -> 0x03f4 }
            r12.append(r1)     // Catch:{ IOException -> 0x03f4 }
            r12.append(r11)     // Catch:{ IOException -> 0x03f4 }
            r12.append(r8)     // Catch:{ IOException -> 0x03f4 }
            r12.append(r7)     // Catch:{ IOException -> 0x03f4 }
            r12.append(r3)     // Catch:{ IOException -> 0x03f4 }
            r1 = 32
            r12.append(r1)     // Catch:{ IOException -> 0x03f4 }
            java.lang.String r1 = r12.toString()     // Catch:{ IOException -> 0x03f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r1)     // Catch:{ IOException -> 0x03f4 }
            goto L_0x0236
        L_0x0205:
            r25 = r5
            r24 = r12
            r29 = r13
            r28 = r14
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03f4 }
            r5.<init>()     // Catch:{ IOException -> 0x03f4 }
            r5.append(r4)     // Catch:{ IOException -> 0x03f4 }
            r5.append(r9)     // Catch:{ IOException -> 0x03f4 }
            r5.append(r15)     // Catch:{ IOException -> 0x03f4 }
            r5.append(r1)     // Catch:{ IOException -> 0x03f4 }
            r5.append(r11)     // Catch:{ IOException -> 0x03f4 }
            r5.append(r8)     // Catch:{ IOException -> 0x03f4 }
            r5.append(r7)     // Catch:{ IOException -> 0x03f4 }
            r5.append(r3)     // Catch:{ IOException -> 0x03f4 }
            r1 = 32
            r5.append(r1)     // Catch:{ IOException -> 0x03f4 }
            java.lang.String r1 = r5.toString()     // Catch:{ IOException -> 0x03f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)     // Catch:{ IOException -> 0x03f4 }
        L_0x0236:
            r1 = r28
            r2 = r29
            boolean r1 = gy3.C87412m.m108589b(r2, r1)     // Catch:{ IOException -> 0x03f4 }
            if (r1 != 0) goto L_0x0241
            goto L_0x025b
        L_0x0241:
            r5 = r30
            r13 = r27
            goto L_0x037b
        L_0x0247:
            r0 = move-exception
            r27 = r3
            goto L_0x03f5
        L_0x024c:
            r0 = move-exception
            r27 = r3
            r26 = r8
            goto L_0x03f5
        L_0x0253:
            r27 = r3
            r25 = r5
            r26 = r8
            r24 = r12
        L_0x025b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03f4 }
            r1.<init>()     // Catch:{ IOException -> 0x03f4 }
            r1.append(r0)     // Catch:{ IOException -> 0x03f4 }
            r2 = r31
            r1.append(r2)     // Catch:{ IOException -> 0x03f0 }
            r3 = r24
            r1.append(r3)     // Catch:{ IOException -> 0x03f0 }
            r5 = r30
            com.tencent.mm.plugin.appbrand.page.s1 r8 = r5.f244855b     // Catch:{ IOException -> 0x03eb }
            java.lang.String r8 = r8.mo125215b0()     // Catch:{ IOException -> 0x03eb }
            r1.append(r8)     // Catch:{ IOException -> 0x03eb }
            r8 = 93
            r1.append(r8)     // Catch:{ IOException -> 0x03eb }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x03eb }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x03eb }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03eb }
            r12.<init>()     // Catch:{ IOException -> 0x03eb }
            r13 = r27
            r12.append(r13)     // Catch:{ IOException -> 0x03e8 }
            r14 = r26
            r12.append(r14)     // Catch:{ IOException -> 0x03e3 }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x03e3 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r12)     // Catch:{ IOException -> 0x03e3 }
            r26 = r14
            r12 = r22
            r14 = r23
            byte[] r14 = r12.getBytes(r14)     // Catch:{ IOException -> 0x03de }
            r22 = r12
            r12 = r21
            gy3.C87412m.m108593f(r14, r12)     // Catch:{ IOException -> 0x03d9 }
            r21 = r12
            int r12 = r14.length     // Catch:{ IOException -> 0x03e8 }
            r23 = r4
            r4 = 0
            int r12 = com.tencent.p014mm.vfs.C86013q1.m106438T(r13, r14, r4, r12)     // Catch:{ IOException -> 0x03e8 }
            if (r12 == 0) goto L_0x02eb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02e6 }
            r1.<init>()     // Catch:{ IOException -> 0x02e6 }
            r1.append(r0)     // Catch:{ IOException -> 0x02e6 }
            r1.append(r2)     // Catch:{ IOException -> 0x02e6 }
            r1.append(r3)     // Catch:{ IOException -> 0x02e6 }
            com.tencent.mm.plugin.appbrand.page.s1 r0 = r5.f244855b     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r0 = r0.mo125215b0()     // Catch:{ IOException -> 0x02e6 }
            r1.append(r0)     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r0 = "], failed "
            r1.append(r0)     // Catch:{ IOException -> 0x02e6 }
            r1.append(r12)     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x02e6 }
            r3 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ IOException -> 0x03d4 }
            r1 = r2
            r2 = r3
            r3 = r22
            goto L_0x0458
        L_0x02e6:
            r0 = move-exception
            r3 = r20
            goto L_0x03d5
        L_0x02eb:
            r3 = r20
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ IOException -> 0x03d4 }
            boolean r4 = r0 instanceof p170ic.C87690d.C87691a     // Catch:{ IOException -> 0x03d4 }
            if (r4 == 0) goto L_0x02fa
            ic.d$a r0 = (p170ic.C87690d.C87691a) r0     // Catch:{ IOException -> 0x03d4 }
            java.lang.String r0 = r0.mo63320l()     // Catch:{ IOException -> 0x03d4 }
            goto L_0x02ff
        L_0x02fa:
            r0.getClass()     // Catch:{ IOException -> 0x03d4 }
            java.lang.String r0 = "kotlin.Unit"
        L_0x02ff:
            boolean r4 = com.tencent.p014mm.plugin.appbrand.utils.C2039g2.m1987a()     // Catch:{ IOException -> 0x03d4 }
            long r27 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x03d4 }
            long r8 = r27 - r8
            int r12 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r12 <= 0) goto L_0x034e
            if (r4 == 0) goto L_0x034e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0349 }
            r12.<init>()     // Catch:{ IOException -> 0x0349 }
            r14 = r25
            r12.append(r14)     // Catch:{ IOException -> 0x0349 }
            r20 = r3
            r14 = 16
            long r2 = (long) r14
            long r2 = r8 / r2
            int r3 = (int) r2     // Catch:{ IOException -> 0x03d0 }
            r12.append(r3)     // Catch:{ IOException -> 0x03d0 }
            r12.append(r10)     // Catch:{ IOException -> 0x03d0 }
            r12.append(r1)     // Catch:{ IOException -> 0x03d0 }
            r12.append(r15)     // Catch:{ IOException -> 0x03d0 }
            r12.append(r8)     // Catch:{ IOException -> 0x03d0 }
            r12.append(r11)     // Catch:{ IOException -> 0x03d0 }
            r12.append(r0)     // Catch:{ IOException -> 0x03d0 }
            r12.append(r7)     // Catch:{ IOException -> 0x03d0 }
            r12.append(r4)     // Catch:{ IOException -> 0x03d0 }
            r0 = 32
            r12.append(r0)     // Catch:{ IOException -> 0x03d0 }
            java.lang.String r0 = r12.toString()     // Catch:{ IOException -> 0x03d0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)     // Catch:{ IOException -> 0x03d0 }
            goto L_0x037b
        L_0x0349:
            r0 = move-exception
            r20 = r3
            goto L_0x03d1
        L_0x034e:
            r20 = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03d0 }
            r2.<init>()     // Catch:{ IOException -> 0x03d0 }
            r3 = r23
            r2.append(r3)     // Catch:{ IOException -> 0x03d0 }
            r2.append(r1)     // Catch:{ IOException -> 0x03d0 }
            r2.append(r15)     // Catch:{ IOException -> 0x03d0 }
            r2.append(r8)     // Catch:{ IOException -> 0x03d0 }
            r2.append(r11)     // Catch:{ IOException -> 0x03d0 }
            r2.append(r0)     // Catch:{ IOException -> 0x03d0 }
            r2.append(r7)     // Catch:{ IOException -> 0x03d0 }
            r2.append(r4)     // Catch:{ IOException -> 0x03d0 }
            r0 = 32
            r2.append(r0)     // Catch:{ IOException -> 0x03d0 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x03d0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ IOException -> 0x03d0 }
        L_0x037b:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r7 = r19
            r0.<init>((java.lang.String) r7)
            com.tencent.mm.vfs.m1[] r0 = r0.mo119984u()
            if (r0 == 0) goto L_0x03c8
            int r1 = r0.length
            r2 = 0
        L_0x038a:
            if (r2 >= r1) goto L_0x03b5
            r3 = r0[r2]
            java.lang.String r4 = r3.mo119971i()
            java.lang.String r6 = "file.absolutePath"
            gy3.C87412m.m108593f(r4, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r13)
            java.lang.String r7 = ".cachedata"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 0
            boolean r4 = z04.C112551y.m153819s(r4, r6, r7)
            if (r4 == 0) goto L_0x03b2
            r16 = r3
            goto L_0x03b7
        L_0x03b2:
            int r2 = r2 + 1
            goto L_0x038a
        L_0x03b5:
            r16 = 0
        L_0x03b7:
            if (r16 == 0) goto L_0x03c8
            r0 = r5
            com.tencent.mm.plugin.appbrand.page.s1$e r0 = (com.tencent.p014mm.plugin.appbrand.page.C83910s1.C83913e) r0
            com.tencent.mm.plugin.appbrand.page.s1 r0 = com.tencent.p014mm.plugin.appbrand.page.C83910s1.this
            java.util.Set<java.lang.String> r0 = r0.f244979I
            java.util.HashSet r0 = (java.util.HashSet) r0
            r1 = r31
            r0.add(r1)
            goto L_0x03ca
        L_0x03c8:
            r1 = r31
        L_0x03ca:
            r2 = r20
            r3 = r22
            goto L_0x0459
        L_0x03d0:
            r0 = move-exception
        L_0x03d1:
            r1 = r31
            goto L_0x0406
        L_0x03d4:
            r0 = move-exception
        L_0x03d5:
            r1 = r2
            r20 = r3
            goto L_0x0406
        L_0x03d9:
            r0 = move-exception
            r1 = r2
            r21 = r12
            goto L_0x0406
        L_0x03de:
            r0 = move-exception
            r1 = r2
            r22 = r12
            goto L_0x0406
        L_0x03e3:
            r0 = move-exception
            r1 = r2
            r26 = r14
            goto L_0x0406
        L_0x03e8:
            r0 = move-exception
            r1 = r2
            goto L_0x0406
        L_0x03eb:
            r0 = move-exception
        L_0x03ec:
            r1 = r2
        L_0x03ed:
            r13 = r27
            goto L_0x0406
        L_0x03f0:
            r0 = move-exception
            r5 = r30
            goto L_0x03ec
        L_0x03f4:
            r0 = move-exception
        L_0x03f5:
            r5 = r30
            r1 = r31
            goto L_0x03ed
        L_0x03fa:
            r0 = move-exception
            r5 = r1
            r1 = r2
            r13 = r3
            r22 = r6
            r26 = r8
            r20 = r11
            r21 = r15
        L_0x0406:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkScriptSerialized appId["
            r2.append(r3)
            com.tencent.mm.plugin.appbrand.page.s1 r3 = r5.f244855b
            java.lang.String r3 = r3.mo125215b0()
            r2.append(r3)
            java.lang.String r3 = "] scriptName["
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = "] e="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r3 = r26
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            java.nio.charset.Charset r0 = z04.C119027c.f356488a
            r3 = r22
            byte[] r0 = r3.getBytes(r0)
            r4 = r21
            gy3.C87412m.m108593f(r0, r4)
            int r4 = r0.length
            r6 = 0
            com.tencent.p014mm.vfs.C86013q1.m106438T(r13, r0, r6, r4)
        L_0x0458:
            r13 = 0
        L_0x0459:
            if (r13 == 0) goto L_0x04d9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "provideScript use XWEBScript appId["
            r0.append(r4)
            com.tencent.mm.plugin.appbrand.page.s1 r4 = r5.f244855b
            java.lang.String r4 = r4.mo125215b0()
            r0.append(r4)
            java.lang.String r4 = "] name["
            r0.append(r4)
            r0.append(r1)
            java.lang.String r1 = "], path["
            r0.append(r1)
            r8 = 47
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r7 = r13
            int r1 = z04.C112550d0.m153771G(r7, r8, r9, r10, r11, r12)
            if (r1 <= 0) goto L_0x0498
            int r4 = r13.length()
            java.lang.String r1 = r13.substring(r1, r4)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r1, r4)
            goto L_0x0499
        L_0x0498:
            r1 = r13
        L_0x0499:
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.xweb.XWebScript r0 = new com.tencent.xweb.XWebScript
            r1 = 3
            com.tencent.mm.plugin.appbrand.page.s1 r2 = r5.f244855b
            com.tencent.mm.plugin.appbrand.page.j2 r2 = r2.mo116495D0()
            r4 = 0
            r0.<init>(r1, r4, r2)
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106448i(r13, r4)
            java.util.LinkedList<java.lang.String> r2 = com.tencent.p014mm.plugin.appbrand.utils.C84754j1.f247167a
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 11111(0x2b67, float:1.557E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r4] = r7
            java.lang.String r4 = "\n;(function(){return %d;})();"
            java.lang.String r2 = java.lang.String.format(r2, r4, r6)
            r0.setJsSrcAsPath(r1, r2)
            r0.setFallBackLogic(r3)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x04d9:
            return r3
        L_0x04da:
            r0 = move-exception
            r5 = r1
            r1 = r0
            throw r1     // Catch:{ all -> 0x04de }
        L_0x04de:
            r0 = move-exception
            r2 = r0
            cy3.C58003b.m67160a(r9, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83864o3.mo116116a(java.lang.String):java.lang.String");
    }
}
