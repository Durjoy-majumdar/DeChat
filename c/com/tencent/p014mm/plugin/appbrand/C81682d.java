package com.tencent.p014mm.plugin.appbrand;

import android.util.SparseIntArray;
import com.tencent.p014mm.plugin.appbrand.app.AppBrandProcessSuicideLogic;
import com.tencent.p014mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$$d;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84241t;
import com.tencent.p014mm.plugin.appbrand.utils.C84753j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.d */
public class C81682d {

    /* renamed from: a */
    public static final AtomicBoolean f239731a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final LinkedHashMap<String, AppBrandRuntimeWC> f239732b = new C81685b();

    /* renamed from: c */
    public static final LinkedHashMap<String, AppBrandRuntimeWC> f239733c = new LinkedHashMap<>();

    /* renamed from: d */
    public static final SparseIntArray f239734d = new SparseIntArray();

    /* renamed from: com.tencent.mm.plugin.appbrand.d$a */
    public class C81683a extends C84753j0 {

        /* renamed from: com.tencent.mm.plugin.appbrand.d$a$a */
        public class C81684a implements Runnable {
            public C81684a(C81683a aVar) {
            }

            public void run() {
                boolean isEmpty;
                LinkedHashMap<String, AppBrandRuntimeWC> linkedHashMap = C81682d.f239733c;
                synchronized (linkedHashMap) {
                    isEmpty = linkedHashMap.isEmpty();
                }
                if (isEmpty) {
                    AppBrandProcessSuicideLogic.m99381N(AppBrandProcessSuicideLogic$$d.LOW_MEMORY);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTrimMemory(int r9) {
            /*
                r8 = this;
                java.lang.Class<xv.u> r0 = p757xv.C91353u.class
                java.lang.Class<h81.h> r1 = h81.C32735h.class
                java.lang.String r2 = "MicroMsg.AppBrandBridge"
                java.lang.String r3 = "onTrimMemory level=%d"
                r4 = 1
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
                r7 = 0
                r5[r7] = r6
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)
                r2 = 5
                if (r9 == r2) goto L_0x0075
                r2 = 10
                if (r9 == r2) goto L_0x0075
                r2 = 15
                if (r9 == r2) goto L_0x0075
                r2 = 60
                if (r9 == r2) goto L_0x002b
                r2 = 80
                if (r9 == r2) goto L_0x002b
                goto L_0x00c8
            L_0x002b:
                java.util.LinkedHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC> r9 = com.tencent.p014mm.plugin.appbrand.C81682d.f239733c
                monitor-enter(r9)
                boolean r2 = r9.isEmpty()     // Catch:{ all -> 0x0072 }
                monitor-exit(r9)     // Catch:{ all -> 0x0072 }
                if (r2 == 0) goto L_0x00c8
                boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r9 == 0) goto L_0x003a
                goto L_0x004b
            L_0x003a:
                int r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
                r2 = 671092576(0x28000f60, float:7.108761E-15)
                if (r2 > r9) goto L_0x0048
                r2 = 671092736(0x28001000, float:7.108897E-15)
                if (r9 >= r2) goto L_0x0048
                r9 = 1
                goto L_0x0049
            L_0x0048:
                r9 = 0
            L_0x0049:
                if (r9 == 0) goto L_0x004d
            L_0x004b:
                r9 = 1
                goto L_0x004e
            L_0x004d:
                r9 = 0
            L_0x004e:
                di3.d r1 = di3.C86312j.m106911c(r1)
                h81.h r1 = (h81.C32735h) r1
                h81.h$c r2 = h81.C32735h.C32737c.clicfg_android_appbrand_recycle_backgroud_spare_appbrand_process
                int r9 = r1.mo58779Qe(r2, r9)
                if (r9 != r4) goto L_0x0069
                di3.d r9 = di3.C86312j.m106911c(r0)
                xv.u r9 = (p757xv.C91353u) r9
                boolean r9 = r9.mo112625Sw()
                if (r9 == 0) goto L_0x0069
                goto L_0x006a
            L_0x0069:
                r4 = 0
            L_0x006a:
                if (r4 == 0) goto L_0x00c8
                com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$$d r9 = com.tencent.p014mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$$d.BACKGROUND_MODERATE_AND_SPARE
                com.tencent.p014mm.plugin.appbrand.app.AppBrandProcessSuicideLogic.m99381N(r9)
                goto L_0x00c8
            L_0x0072:
                r0 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x0072 }
                throw r0
            L_0x0075:
                di3.d r9 = di3.C86312j.m106911c(r1)
                h81.h r9 = (h81.C32735h) r9
                h81.h$c r1 = h81.C32735h.C32737c.clicfg_android_appbrand_recycle_runtime_on_low_memory_moderate
                int r9 = r9.mo58779Qe(r1, r4)
                if (r9 != r4) goto L_0x0090
                di3.d r9 = di3.C86312j.m106911c(r0)
                xv.u r9 = (p757xv.C91353u) r9
                boolean r9 = r9.mo112625Sw()
                if (r9 == 0) goto L_0x0090
                goto L_0x0091
            L_0x0090:
                r4 = 0
            L_0x0091:
                if (r4 != 0) goto L_0x0094
                return
            L_0x0094:
                java.util.LinkedHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC> r9 = com.tencent.p014mm.plugin.appbrand.C81682d.f239733c
                monitor-enter(r9)
                java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x00c9 }
                java.util.LinkedHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC> r1 = com.tencent.p014mm.plugin.appbrand.C81682d.f239732b     // Catch:{ all -> 0x00c9 }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00c9 }
                r0.<init>(r1)     // Catch:{ all -> 0x00c9 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00c9 }
            L_0x00a6:
                boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00c9 }
                if (r1 == 0) goto L_0x00c7
                java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00c9 }
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r1     // Catch:{ all -> 0x00c9 }
                boolean r2 = r1.f238122S     // Catch:{ all -> 0x00c9 }
                if (r2 == 0) goto L_0x00b7
                goto L_0x00a6
            L_0x00b7:
                java.util.LinkedHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC> r2 = com.tencent.p014mm.plugin.appbrand.C81682d.f239732b     // Catch:{ all -> 0x00c9 }
                java.lang.String r3 = r1.f238147j     // Catch:{ all -> 0x00c9 }
                r2.remove(r3)     // Catch:{ all -> 0x00c9 }
                com.tencent.mm.plugin.appbrand.d$a$a r2 = new com.tencent.mm.plugin.appbrand.d$a$a     // Catch:{ all -> 0x00c9 }
                r2.<init>(r8)     // Catch:{ all -> 0x00c9 }
                r1.mo113202g2(r2)     // Catch:{ all -> 0x00c9 }
                goto L_0x00a6
            L_0x00c7:
                monitor-exit(r9)     // Catch:{ all -> 0x00c9 }
            L_0x00c8:
                return
            L_0x00c9:
                r0 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x00c9 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C81682d.C81683a.onTrimMemory(int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.d$b */
    public class C81685b extends LinkedHashMap<String, AppBrandRuntimeWC> {

        /* renamed from: com.tencent.mm.plugin.appbrand.d$b$a */
        public class C81686a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppBrandRuntimeWC f239735d;

            public C81686a(C81685b bVar, AppBrandRuntimeWC appBrandRuntimeWC) {
                this.f239735d = appBrandRuntimeWC;
            }

            public void run() {
                this.f239735d.mo113202g2((Runnable) null);
            }
        }

        public boolean removeEldestEntry(Map.Entry<String, AppBrandRuntimeWC> entry) {
            boolean z = size() > (C84566n2.m104161j() ? 5 : 3);
            if (z) {
                AppBrandRuntimeWC value = entry.getValue();
                Log.m105925i("MicroMsg.AppBrandBridge", "%s will be removed from sKeepNoRecycleRuntimeMap", value.toString());
                ((C119157j) C119157j.f356862d).mo183895z(new C81686a(this, value));
            }
            return z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.d$c */
    public class C81687c implements Runnable {
        public void run() {
            boolean isEmpty;
            LinkedHashMap<String, AppBrandRuntimeWC> linkedHashMap = C81682d.f239733c;
            synchronized (linkedHashMap) {
                isEmpty = linkedHashMap.isEmpty();
            }
            if (isEmpty) {
                AppBrandProcessSuicideLogic.m99381N(AppBrandProcessSuicideLogic$$d.NO_RUNTIMES_LEFT);
            }
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 124 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m100221a(com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC r6) {
        /*
            java.lang.String r0 = r6.f238147j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0010
            java.lang.String r6 = "MicroMsg.AppBrandBridge"
            java.lang.String r0 = "clearRuntime with nil appId"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            return
        L_0x0010:
            java.util.LinkedHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC> r0 = f239733c
            monitor-enter(r0)
            java.lang.String r1 = r6.f238147j     // Catch:{ all -> 0x0067 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0067 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r1     // Catch:{ all -> 0x0067 }
            r2 = 0
            if (r1 == 0) goto L_0x0037
            if (r1 != r6) goto L_0x0021
            goto L_0x0037
        L_0x0021:
            java.lang.String r1 = "MicroMsg.AppBrandBridge"
            java.lang.String r3 = "clearRuntime with mismatch instance, stack %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0067 }
            java.lang.Throwable r5 = new java.lang.Throwable     // Catch:{ all -> 0x0067 }
            r5.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r5)     // Catch:{ all -> 0x0067 }
            r4[r2] = r5     // Catch:{ all -> 0x0067 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r3, r4)     // Catch:{ all -> 0x0067 }
            goto L_0x0043
        L_0x0037:
            java.lang.String r1 = r6.f238147j     // Catch:{ all -> 0x0067 }
            r0.remove(r1)     // Catch:{ all -> 0x0067 }
            java.util.LinkedHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC> r1 = f239732b     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = r6.f238147j     // Catch:{ all -> 0x0067 }
            r1.remove(r3)     // Catch:{ all -> 0x0067 }
        L_0x0043:
            android.util.SparseIntArray r1 = f239734d     // Catch:{ all -> 0x0067 }
            int r6 = r6.hashCode()     // Catch:{ all -> 0x0067 }
            r1.delete(r6)     // Catch:{ all -> 0x0067 }
            boolean r6 = r0.isEmpty()     // Catch:{ all -> 0x0067 }
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            if (r6 == 0) goto L_0x0064
            zt3.t r6 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.appbrand.d$c r0 = new com.tencent.mm.plugin.appbrand.d$c
            r0.<init>()
            r3 = 1000(0x3e8, double:4.94E-321)
            zt3.j r6 = (zt3.C119157j) r6
            r6.getClass()
            r6.mo183892w(r0, r3, r2)
        L_0x0064:
            return
        L_0x0065:
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r6
        L_0x0067:
            r6 = move-exception
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C81682d.m100221a(com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC):void");
    }

    /* renamed from: b */
    public static AppBrandRuntimeWC m100222b(String str) {
        AppBrandRuntimeWC appBrandRuntimeWC;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        LinkedHashMap<String, AppBrandRuntimeWC> linkedHashMap = f239733c;
        synchronized (linkedHashMap) {
            appBrandRuntimeWC = linkedHashMap.get(str);
        }
        return appBrandRuntimeWC;
    }

    /* renamed from: c */
    public static int m100223c() {
        int size;
        LinkedHashMap<String, AppBrandRuntimeWC> linkedHashMap = f239733c;
        synchronized (linkedHashMap) {
            size = linkedHashMap.size();
        }
        return size;
    }

    @Deprecated
    /* renamed from: d */
    public static AppBrandStatObject m100224d(String str) {
        AppBrandRuntimeWC b = m100222b(str);
        if (b == null) {
            return null;
        }
        return b.mo121253n1();
    }

    @Deprecated
    /* renamed from: e */
    public static AppBrandSysConfigWC m100225e(String str) {
        AppBrandRuntimeWC b = m100222b(str);
        if (b == null) {
            return null;
        }
        return b.mo113213o1();
    }

    /* renamed from: f */
    public static void m100226f(AppBrandRuntimeWC appBrandRuntimeWC) {
        if (Util.isNullOrNil(appBrandRuntimeWC.f238147j)) {
            Log.m105920e("MicroMsg.AppBrandBridge", "setRuntime with nil appId");
            return;
        }
        LinkedHashMap<String, AppBrandRuntimeWC> linkedHashMap = f239733c;
        synchronized (linkedHashMap) {
            int size = linkedHashMap.size();
            boolean z = linkedHashMap.put(appBrandRuntimeWC.f238147j, appBrandRuntimeWC) != appBrandRuntimeWC;
            f239732b.put(appBrandRuntimeWC.f238147j, appBrandRuntimeWC);
            if (z) {
                f239734d.put(appBrandRuntimeWC.hashCode(), size);
            }
        }
        if (appBrandRuntimeWC.mo113210l1() != null) {
            C84241t.m103847a(appBrandRuntimeWC.f238147j, appBrandRuntimeWC.mo113210l1().f234841u);
        }
    }

    /* renamed from: g */
    public static void m100227g() {
        if (!f239731a.getAndSet(true) && MMApplicationContext.isAppBrandProcess()) {
            MMApplicationContext.getContext().registerComponentCallbacks(new C81683a());
        }
    }
}
