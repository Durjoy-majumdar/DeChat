package ss0;

import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.sdk.platformtools.Log;
import p235sm.C90234k0;
import ss0.C90347a;

/* renamed from: ss0.b */
public final class C90355b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WxaPkg f259357d;

    /* renamed from: e */
    public final /* synthetic */ WxaPkg.Info f259358e;

    /* renamed from: f */
    public final /* synthetic */ WxaPkg.Info f259359f;

    /* renamed from: g */
    public final /* synthetic */ C90347a f259360g;

    /* renamed from: h */
    public final /* synthetic */ String f259361h;

    /* renamed from: i */
    public final /* synthetic */ int f259362i;

    /* renamed from: j */
    public final /* synthetic */ String f259363j;

    /* renamed from: ss0.b$a */
    public static final class C90356a implements C90234k0.C90235a {

        /* renamed from: a */
        public final /* synthetic */ C90347a f259364a;

        /* renamed from: b */
        public final /* synthetic */ String f259365b;

        public C90356a(C90347a aVar, String str) {
            this.f259364a = aVar;
            this.f259365b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0084  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCreated() {
            /*
                r17 = this;
                r1 = r17
                ss0.a r2 = r1.f259364a
                java.lang.String r3 = r1.f259365b
                r2.getClass()
                java.lang.String r0 = "appId"
                gy3.C87412m.m108594g(r3, r0)
                java.util.concurrent.ConcurrentHashMap<java.lang.String, ss0.a$c> r0 = ss0.C90347a.f259334h
                java.lang.Object r0 = r0.get(r3)
                r4 = r0
                ss0.a$c r4 = (ss0.C90347a.C90350c) r4
                r5 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                r6 = 2
                java.lang.String r7 = "MicroMsg.Appbrand.WasmCacheService"
                r8 = 1
                if (r4 == 0) goto L_0x00d4
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r0[r5] = r3
                java.lang.String r9 = "start for appId: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r0)
                ss0.a$b r0 = ss0.C90347a.f259331e
                com.tencent.mm.appbrand.commonjni.TWasmCacheManagerJni r0 = ss0.C90347a.C90349b.m113139a(r0)
                long r9 = r4.f259340b
                java.lang.String r11 = r0.start(r9)
                if (r11 == 0) goto L_0x006b
                char[] r12 = new char[r8]
                r0 = 44
                r12[r5] = r0
                r13 = 0
                r14 = 0
                r15 = 6
                r16 = 0
                java.util.List r0 = z04.C112550d0.m153784T(r11, r12, r13, r14, r15, r16)
                java.lang.Object r9 = r0.get(r5)     // Catch:{ Exception -> 0x0060 }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0060 }
                int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x0060 }
                java.lang.Object r0 = r0.get(r8)     // Catch:{ Exception -> 0x005e }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x005e }
                int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x005e }
                goto L_0x006d
            L_0x005e:
                r0 = move-exception
                goto L_0x0062
            L_0x0060:
                r0 = move-exception
                r9 = 0
            L_0x0062:
                java.lang.Object[] r10 = new java.lang.Object[r5]
                java.lang.String r11 = "access compile result"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r11, r10)
                r0 = 0
                goto L_0x006d
            L_0x006b:
                r0 = 0
                r9 = 0
            L_0x006d:
                com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct r4 = r4.f259342d
                if (r4 == 0) goto L_0x007a
                long r10 = (long) r0
                r4.f237313g = r10
                long r10 = (long) r9
                r4.f237314h = r10
                r4.mo86054n()
            L_0x007a:
                java.util.concurrent.ConcurrentHashMap<java.lang.String, ss0.a$c> r4 = ss0.C90347a.f259334h
                java.lang.Object r10 = r4.get(r3)
                ss0.a$c r10 = (ss0.C90347a.C90350c) r10
                if (r10 == 0) goto L_0x00c6
                java.lang.Object[] r11 = new java.lang.Object[r6]
                long r12 = r10.f259340b
                java.lang.Long r12 = java.lang.Long.valueOf(r12)
                r11[r5] = r12
                r11[r8] = r3
                java.lang.String r12 = "finish task: %d, appId: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r11)
                ss0.a$b r11 = ss0.C90347a.f259331e
                com.tencent.mm.appbrand.commonjni.TWasmCacheManagerJni r11 = ss0.C90347a.C90349b.m113139a(r11)
                long r12 = r10.f259340b
                r11.destroyTask(r12)
                com.tencent.mm.plugin.appbrand.jsruntime.c r10 = r10.f259339a
                r10.destroy()
                r4.remove(r3)
                java.util.concurrent.ConcurrentHashMap<java.lang.String, ss0.a$d> r4 = ss0.C90347a.f259335i
                r4.remove(r3)
                java.util.Set r3 = r4.entrySet()
                y04.h r3 = sx3.C110818d0.m150897A(r3)
                java.lang.Object r3 = y04.C112354s.m153288k(r3)
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                if (r3 == 0) goto L_0x00c6
                java.lang.Object r3 = r3.getValue()
                ss0.a$d r3 = (ss0.C90347a.C90351d) r3
                r2.vx0(r3)
            L_0x00c6:
                rx3.l r2 = new rx3.l
                java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.<init>(r3, r0)
                goto L_0x00d9
            L_0x00d4:
                rx3.l r2 = new rx3.l
                r2.<init>(r0, r0)
            L_0x00d9:
                java.lang.Object[] r0 = new java.lang.Object[r6]
                A r3 = r2.f38555d
                r0[r5] = r3
                B r2 = r2.f38556e
                r0[r8] = r2
                java.lang.String r2 = "compile cost time: %d, bytes length: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ss0.C90355b.C90356a.onCreated():void");
        }
    }

    /* renamed from: ss0.b$b */
    public static final class C90357b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C90347a f259366d;

        /* renamed from: e */
        public final /* synthetic */ String f259367e;

        public C90357b(C90347a aVar, String str) {
            this.f259366d = aVar;
            this.f259367e = str;
        }

        public final void run() {
            C90347a aVar = this.f259366d;
            String str = this.f259367e;
            C90347a.C90349b bVar = C90347a.f259331e;
            aVar.getClass();
            C90347a.C90350c cVar = C90347a.f259334h.get(str);
            if (cVar != null) {
                Log.m105925i("MicroMsg.Appbrand.WasmCacheService", "timeout stop task for appId: %s", str);
                C90347a.C90349b.m113139a(C90347a.f259331e).stop(cVar.f259340b);
                WeAppQualityWasmCachePrecompileStruct weAppQualityWasmCachePrecompileStruct = cVar.f259342d;
                if (weAppQualityWasmCachePrecompileStruct != null) {
                    weAppQualityWasmCachePrecompileStruct.f237316j = (long) 3;
                }
            }
        }
    }

    public C90355b(WxaPkg wxaPkg, WxaPkg.Info info, WxaPkg.Info info2, C90347a aVar, String str, int i, String str2) {
        this.f259357d = wxaPkg;
        this.f259358e = info;
        this.f259359f = info2;
        this.f259360g = aVar;
        this.f259361h = str;
        this.f259362i = i;
        this.f259363j = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        cy3.C58003b.m67160a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            r0 = -4
            android.os.Process.setThreadPriority(r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg r0 = r15.f259357d
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r1 = r15.f259358e
            java.lang.String r1 = r1.f238570e
            java.io.InputStream r0 = r0.mo63188a(r1)
            r9 = 0
            java.lang.String r10 = "MicroMsg.Appbrand.WasmCacheService"
            if (r0 == 0) goto L_0x0066
            java.nio.charset.Charset r1 = z04.C119027c.f356488a
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r0, r1)
            r0 = 8192(0x2000, float:1.14794E-41)
            boolean r1 = r2 instanceof java.io.BufferedReader
            if (r1 == 0) goto L_0x0028
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            goto L_0x002e
        L_0x0028:
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r1.<init>(r2, r0)
            r2 = r1
        L_0x002e:
            r0 = 0
            y04.h r1 = cy3.C86157m.m106666b(r2)     // Catch:{ all -> 0x005f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x005f }
        L_0x0037:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x005f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x005f }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x004f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x004f }
            r8.add(r3)     // Catch:{ Exception -> 0x004f }
            goto L_0x0037
        L_0x004f:
            r3 = move-exception
            java.lang.String r4 = "readline precompile.txt"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ all -> 0x005f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r3, r4, r5)     // Catch:{ all -> 0x005f }
            goto L_0x0037
        L_0x0059:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x005f }
            cy3.C58003b.m67160a(r2, r0)
            goto L_0x0066
        L_0x005f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r1 = move-exception
            cy3.C58003b.m67160a(r2, r0)
            throw r1
        L_0x0066:
            int r0 = r8.size()
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "func list empty, abort"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            return
        L_0x0072:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r2 = r15.f259359f
            java.lang.String r2 = r2.f238570e
            r1[r9] = r2
            java.lang.String r2 = "wasm fileName: %s!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            js0.m r1 = new js0.m
            r1.<init>()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg r2 = r15.f259357d
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r3 = r15.f259359f
            java.lang.String r3 = r3.f238570e
            java.lang.String r4 = "info.fileName"
            gy3.C87412m.m108593f(r3, r4)
            com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99668d(r2, r3, r1)
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r2 = r15.f259359f
            java.lang.String r2 = r2.f238570e
            gy3.C87412m.m108593f(r2, r4)
            java.lang.String r6 = r2.substring(r0)
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            gy3.C87412m.m108593f(r6, r2)
            ss0.a r11 = r15.f259360g
            java.lang.String r12 = r15.f259361h
            int r3 = r15.f259362i
            java.lang.String r4 = r15.f259363j
            T r1 = r1.f29691a
            java.lang.String r2 = "pBB.value"
            gy3.C87412m.m108593f(r1, r2)
            r5 = r1
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            ss0.b$a r7 = new ss0.b$a
            ss0.a r1 = r15.f259360g
            java.lang.String r2 = r15.f259361h
            r7.<init>(r1, r2)
            r11.getClass()
            java.lang.String r1 = "appId"
            gy3.C87412m.m108594g(r12, r1)
            java.lang.String r1 = "packageMD5"
            gy3.C87412m.m108594g(r4, r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, ss0.a$d> r13 = ss0.C90347a.f259335i
            boolean r1 = r13.contains(r12)
            if (r1 == 0) goto L_0x00e1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r9] = r12
            java.lang.String r2 = "already added task for appId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r1)
            goto L_0x0107
        L_0x00e1:
            ss0.a$d r14 = new ss0.a$d
            r1 = r14
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.put(r12, r14)
            int r1 = r13.size()
            if (r1 <= r0) goto L_0x00fb
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r9] = r12
            java.lang.String r2 = "more than 1 task, pending for appId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            goto L_0x0107
        L_0x00fb:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r9] = r12
            java.lang.String r2 = "create task for appId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            r11.vx0(r14)
        L_0x0107:
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_android_appbrand_wasm_precompile_cache_timeout
            r3 = 10000(0x2710, float:1.4013E-41)
            int r1 = r1.mo58779Qe(r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0[r9] = r2
            java.lang.String r2 = "set compile timeout: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r0)
            zt3.t r0 = zt3.C119157j.f356862d
            ss0.b$b r2 = new ss0.b$b
            ss0.a r3 = r15.f259360g
            java.lang.String r4 = r15.f259361h
            r2.<init>(r3, r4)
            long r3 = (long) r1
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183878i(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ss0.C90355b.run():void");
    }
}
