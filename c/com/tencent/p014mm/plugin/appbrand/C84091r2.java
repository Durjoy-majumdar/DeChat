package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2;
import com.tencent.p014mm.plugin.appbrand.task.C84273a0;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xwalk.core.XWalkEnvironment;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.r2 */
public class C84091r2 {

    /* renamed from: a */
    public static volatile boolean f245511a;

    /* renamed from: b */
    public static volatile boolean f245512b;

    /* renamed from: c */
    public static final Set<C84093b> f245513c = new HashSet();

    /* renamed from: com.tencent.mm.plugin.appbrand.r2$a */
    public class C84092a implements WebView.PreInitCallback {

        /* renamed from: a */
        public final /* synthetic */ PBool f245514a;

        public C84092a(PBool pBool) {
            this.f245514a = pBool;
        }

        public void onCoreInitFailed() {
            this.f245514a.value = false;
        }

        public void onCoreInitFinished() {
            this.f245514a.value = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.r2$b */
    public interface C84093b {
        /* renamed from: a */
        void mo115595a();

        /* renamed from: b */
        void mo115596b();
    }

    /* renamed from: a */
    public static void m103623a() {
        String processName = MMApplicationContext.getProcessName();
        if (!C84273a0.f246143j.equals(processName) || !C84566n2.m104161j()) {
            if (C90599h.m113508a(processName, XWalkEnvironment.MODULE_APPBRAND)) {
                Log.m105928w("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "initWebViewModeForAppBrand, disable multi process by appbrand strategy");
                XWebSdk.setMultiProcessType(0);
            }
        } else if (!C84566n2.m104163l()) {
            Log.m105924i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "initWebViewModeForAppBrand, MULTI_PROCESS_TYPE_DISABLE");
            XWebSdk.setMultiProcessType(0);
        } else if (C84566n2.m104164m()) {
            Log.m105924i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "initWebViewModeForAppBrand, MULTI_PROCESS_TYPE_RENDERER_AND_GPU");
            XWebSdk.setMultiProcessType(2);
            XWebSdk.setEnableSandbox(false);
        } else {
            Log.m105924i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "initWebViewModeForAppBrand, MULTI_PROCESS_TYPE_RENDERER");
            XWebSdk.setMultiProcessType(1);
            XWebSdk.setEnableSandbox(false);
        }
    }

    /* renamed from: b */
    public static void m103624b() {
        if (!MMApplicationContext.isMainProcess() || !C84566n2.m104160i()) {
            Log.m105928w("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "initWebViewModeForMM, disable multi process by appbrand strategy");
        } else if (!C84566n2.m104163l()) {
            Log.m105924i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "initWebViewModeForMM, can not set xweb multi process type");
        } else if (C84566n2.m104164m()) {
            Log.m105924i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "initWebViewModeForMM, MULTI_PROCESS_TYPE_RENDERER_AND_GPU");
            XWebSdk.setMultiProcessType(2);
            XWebSdk.setEnableSandbox(false);
        } else {
            Log.m105924i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "initWebViewModeForMM, MULTI_PROCESS_TYPE_RENDERER");
            XWebSdk.setMultiProcessType(1);
            XWebSdk.setEnableSandbox(false);
        }
    }

    /* renamed from: c */
    public static void m103625c() {
        HashSet hashSet;
        synchronized (C84091r2.class) {
            f245512b = true;
            f245511a = false;
            Set<C84093b> set = f245513c;
            hashSet = new HashSet(set);
            ((HashSet) set).clear();
        }
        Log.m105925i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "notifyPreloadDone callbacks[%d]", Integer.valueOf(hashSet.size()));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C84093b) it.next()).mo115595a();
        }
        if (!C84273a0.f246143j.equals(MMApplicationContext.getProcessName())) {
            return;
        }
        if (XWebSdk.getMultiProcessType() == 2) {
            XWebSdk.preInitRenderProcess();
            XWebSdk.preInitGpuProcess();
        } else if (XWebSdk.getMultiProcessType() == 1) {
            XWebSdk.preInitRenderProcess();
        }
    }

    /* renamed from: d */
    public static void m103626d() {
        HashSet hashSet;
        synchronized (C84091r2.class) {
            f245512b = false;
            f245511a = false;
            Set<C84093b> set = f245513c;
            hashSet = new HashSet(set);
            ((HashSet) set).clear();
        }
        Log.m105925i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "notifyPreloadFailed callbacks[%d]", Integer.valueOf(hashSet.size()));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C84093b) it.next()).mo115596b();
        }
    }

    /* renamed from: e */
    public static boolean m103627e() {
        boolean z;
        synchronized (C84091r2.class) {
            z = f245512b;
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r2 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        r5.mo115595a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "start init");
        r5 = android.os.Process.getThreadPriority(android.os.Process.myTid());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.tencent.p014mm.sdk.platformtools.MMHandlerThread.setCurrentPriority(-2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (com.tencent.xweb.XWebSdk.hasWebViewCoreInited() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        m103625c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        com.tencent.p014mm.sdk.platformtools.MMHandlerThread.setCurrentPriority(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0 = new com.tencent.p014mm.pointers.PBool();
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "startPreload, for process:" + com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName());
        di0.C86292a.f250909a = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond();
        m103624b();
        m103623a();
        ((s00.C90110f) di3.C86312j.m106911c(s00.C90110f.class)).po0(com.tencent.xweb.WebView.sDefaultWebViewKind, new com.tencent.p014mm.plugin.appbrand.C84091r2.C84092a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r0.value == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
        m103625c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        m103626d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        di0.C86292a.f250910b = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (com.tencent.xweb.XWebSdk.isCurrentSupportCustomContext() != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        if (com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess() != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        r0 = lg3.C88494d.f255611c;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("AppBrandWidgetAccessibility", "forceResetOpenScreenAdaptive");
        lg3.C88494d.f255614f = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ac, code lost:
        com.tencent.p014mm.sdk.platformtools.MMHandlerThread.setCurrentPriority(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        com.tencent.p014mm.sdk.platformtools.MMHandlerThread.setCurrentPriority(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m103628f(com.tencent.p014mm.plugin.appbrand.C84091r2.C84093b r5) {
        /*
            java.lang.Class<com.tencent.mm.plugin.appbrand.r2> r0 = com.tencent.p014mm.plugin.appbrand.C84091r2.class
            monitor-enter(r0)
            boolean r1 = f245511a     // Catch:{ all -> 0x00b5 }
            boolean r2 = f245512b     // Catch:{ all -> 0x00b5 }
            r3 = 0
            if (r2 != 0) goto L_0x0018
            if (r5 == 0) goto L_0x0013
            java.util.Set<com.tencent.mm.plugin.appbrand.r2$b> r4 = f245513c     // Catch:{ all -> 0x00b5 }
            java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x00b5 }
            r4.add(r5)     // Catch:{ all -> 0x00b5 }
        L_0x0013:
            r4 = 1
            f245511a = r4     // Catch:{ all -> 0x00b5 }
            f245512b = r3     // Catch:{ all -> 0x00b5 }
        L_0x0018:
            if (r1 == 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            return
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x0025
            if (r5 == 0) goto L_0x0024
            r5.mo115595a()
        L_0x0024:
            return
        L_0x0025:
            java.lang.String r5 = "MicroMsg.XWeb.AppBrandXWebPreloader[preload]"
            java.lang.String r0 = "start init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            int r5 = android.os.Process.myTid()
            int r5 = android.os.Process.getThreadPriority(r5)
            r0 = -2
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.setCurrentPriority(r0)     // Catch:{ all -> 0x00b0 }
            boolean r0 = com.tencent.xweb.XWebSdk.hasWebViewCoreInited()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0046
            m103625c()     // Catch:{ all -> 0x00b0 }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.setCurrentPriority(r5)
            return
        L_0x0046:
            com.tencent.mm.pointers.PBool r0 = new com.tencent.mm.pointers.PBool     // Catch:{ all -> 0x00b0 }
            r0.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "MicroMsg.XWeb.AppBrandXWebPreloader[preload]"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r2.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = "startPreload, for process:"
            r2.append(r4)     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()     // Catch:{ all -> 0x00b0 }
            r2.append(r4)     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x00b0 }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ all -> 0x00b0 }
            di0.C86292a.f250909a = r1     // Catch:{ all -> 0x00b0 }
            m103624b()     // Catch:{ all -> 0x00b0 }
            m103623a()     // Catch:{ all -> 0x00b0 }
            java.lang.Class<s00.f> r1 = s00.C90110f.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ all -> 0x00b0 }
            s00.f r1 = (s00.C90110f) r1     // Catch:{ all -> 0x00b0 }
            com.tencent.xweb.WebView$WebViewKind r2 = com.tencent.xweb.WebView.sDefaultWebViewKind     // Catch:{ all -> 0x00b0 }
            com.tencent.mm.plugin.appbrand.r2$a r4 = new com.tencent.mm.plugin.appbrand.r2$a     // Catch:{ all -> 0x00b0 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b0 }
            r1.po0(r2, r4)     // Catch:{ all -> 0x00b0 }
            boolean r0 = r0.value     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x008c
            m103625c()     // Catch:{ all -> 0x00b0 }
            goto L_0x008f
        L_0x008c:
            m103626d()     // Catch:{ all -> 0x00b0 }
        L_0x008f:
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ all -> 0x00b0 }
            di0.C86292a.f250910b = r0     // Catch:{ all -> 0x00b0 }
            boolean r0 = com.tencent.xweb.XWebSdk.isCurrentSupportCustomContext()     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x00ac
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x00ac
            android.util.DisplayMetrics r0 = lg3.C88494d.f255611c     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "AppBrandWidgetAccessibility"
            java.lang.String r1 = "forceResetOpenScreenAdaptive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00b0 }
            lg3.C88494d.f255614f = r3     // Catch:{ all -> 0x00b0 }
        L_0x00ac:
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.setCurrentPriority(r5)
            return
        L_0x00b0:
            r0 = move-exception
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.setCurrentPriority(r5)
            throw r0
        L_0x00b5:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C84091r2.m103628f(com.tencent.mm.plugin.appbrand.r2$b):void");
    }
}
