package com.tencent.p014mm.app;

import android.content.Context;
import android.os.Looper;
import com.tencent.mars.Mars;
import com.tencent.mars.app.AppLogic;
import com.tencent.mars.p468mm.AppCallBack;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.booter.C80818d0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18054e;
import com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.model.C30684o1;
import com.tencent.p014mm.sdk.CommLibFileName;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.entry.ApplicationLike;
import di3.C86312j;
import f40.C86709a0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import lj2.C88544a;
import p156gj.C87200o;
import p206nj.C11171e;
import p206nj.C88957l;
import p219pm.C77111p;
import p757xv.C91348m;
import p977hj.C87528c;
import qe3.C89625d;
import sf0.C90188n0;
import wo2.C38248j;

/* renamed from: com.tencent.mm.app.ToolsProfile */
public final class ToolsProfile extends C87528c {

    /* renamed from: c */
    public static final String f235746c = MMApplicationContext.getProcessName();

    /* renamed from: b */
    public int f235747b = 0;

    /* renamed from: com.tencent.mm.app.ToolsProfile$a */
    public class C80581a implements MMUncaughtExceptionHandler.IOnUncaughtExceptionListener {
        public C80581a(ToolsProfile toolsProfile) {
        }

        public void uncaughtException(MMUncaughtExceptionHandler mMUncaughtExceptionHandler, String str, Throwable th) {
            KVCommCrossProcessReceiver.m162690b();
        }
    }

    /* renamed from: com.tencent.mm.app.ToolsProfile$b */
    public static final class C80582b {

        /* renamed from: a */
        public static final AtomicInteger f235748a = new AtomicInteger(0);

        /* renamed from: b */
        public static Object f235749b;

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
            if ((r9.values().toArray()[0] instanceof com.tencent.p014mm.ipcinvoker.BaseIPCService) != false) goto L_0x0091;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
            if (r9 == false) goto L_0x00b3;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00d4 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean m98200a(java.lang.String r9) {
            /*
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r1 = "activity"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.app.ActivityManager r0 = (android.app.ActivityManager) r0
                r1 = 0
                if (r0 != 0) goto L_0x0010
                return r1
            L_0x0010:
                java.util.List r0 = r0.getRunningAppProcesses()
                if (r0 != 0) goto L_0x0017
                return r1
            L_0x0017:
                r2 = 1
                int[] r3 = new int[r2]
                r4 = 100
                r3[r1] = r4
                r4 = 2
                int[] r5 = new int[r4]
                r5 = {300, 125} // fill-array
                int[] r6 = new int[r4]
                r6 = {1, 2} // fill-array
                java.util.Iterator r0 = r0.iterator()
            L_0x002d:
                boolean r7 = r0.hasNext()
                if (r7 == 0) goto L_0x00d5
                java.lang.Object r7 = r0.next()
                android.app.ActivityManager$RunningAppProcessInfo r7 = (android.app.ActivityManager.RunningAppProcessInfo) r7
                java.lang.String r8 = r7.processName
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x002d
                int r9 = r7.importance
                boolean r9 = p977hj.C87526a.m108856a(r3, r9)
                java.lang.String r0 = "MicroMsg.ToolsProcessLocker"
                if (r9 != 0) goto L_0x00b3
                int r9 = r7.importance
                boolean r9 = p977hj.C87526a.m108856a(r5, r9)
                if (r9 == 0) goto L_0x00a8
                java.lang.Object r9 = f235749b     // Catch:{ all -> 0x009a }
                if (r9 != 0) goto L_0x00a5
                android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x009a }
                java.lang.Object r9 = m98202c(r9)     // Catch:{ all -> 0x009a }
                f235749b = r9     // Catch:{ all -> 0x009a }
                b34.a r9 = b34.C79664a.m96761i(r9)     // Catch:{ all -> 0x009a }
                java.lang.String r3 = "mServices"
                java.lang.reflect.Field r3 = r9.mo109792e(r3)     // Catch:{ Exception -> 0x0093 }
                r3.getType()     // Catch:{ Exception -> 0x0093 }
                java.lang.Object r9 = r9.f233575b     // Catch:{ Exception -> 0x0093 }
                java.lang.Object r9 = r3.get(r9)     // Catch:{ Exception -> 0x0093 }
                android.util.ArrayMap r9 = (android.util.ArrayMap) r9     // Catch:{ all -> 0x009a }
                int r3 = r9.size()     // Catch:{ all -> 0x009a }
                if (r3 > 0) goto L_0x007d
                goto L_0x0091
            L_0x007d:
                int r3 = r9.size()     // Catch:{ all -> 0x009a }
                if (r3 != r2) goto L_0x00a5
                java.util.Collection r9 = r9.values()     // Catch:{ all -> 0x009a }
                java.lang.Object[] r9 = r9.toArray()     // Catch:{ all -> 0x009a }
                r9 = r9[r1]     // Catch:{ all -> 0x009a }
                boolean r9 = r9 instanceof com.tencent.p014mm.ipcinvoker.BaseIPCService     // Catch:{ all -> 0x009a }
                if (r9 == 0) goto L_0x00a5
            L_0x0091:
                r9 = 1
                goto L_0x00a6
            L_0x0093:
                r9 = move-exception
                b34.b r3 = new b34.b     // Catch:{ all -> 0x009a }
                r3.<init>(r9)     // Catch:{ all -> 0x009a }
                throw r3     // Catch:{ all -> 0x009a }
            L_0x009a:
                r9 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r3[r1] = r9
                java.lang.String r9 = "skipServiceConditionIfOnlyIPCServiceAlive, hack ActivityThread_mServices e=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r9, r3)
            L_0x00a5:
                r9 = 0
            L_0x00a6:
                if (r9 == 0) goto L_0x00b3
            L_0x00a8:
                int r9 = r7.importanceReasonCode
                boolean r9 = p977hj.C87526a.m108856a(r6, r9)
                if (r9 == 0) goto L_0x00b1
                goto L_0x00b3
            L_0x00b1:
                r9 = 0
                goto L_0x00b4
            L_0x00b3:
                r9 = 1
            L_0x00b4:
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
                r3[r1] = r5
                int r5 = r7.importance
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r2] = r5
                int r5 = r7.importanceReasonCode
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r4] = r5
                java.lang.String r4 = "hasRunningServicesOrProviders:%b %d %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r3)
                if (r9 == 0) goto L_0x00d5
                return r2
            L_0x00d5:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.ToolsProfile.C80582b.m98200a(java.lang.String):boolean");
        }

        /* renamed from: b */
        public static boolean m98201b() {
            return f235748a.get() > 0 || m98200a(C86709a0.m107531m().mo58407a().f124988a);
        }

        /* renamed from: c */
        public static Object m98202c(Context context) {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke((Object) null, new Object[0]);
            if (invoke != null) {
                return invoke;
            }
            Field field = context.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(context);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        }
    }

    /* renamed from: a */
    public void mo112236a() {
        ApplicationLike applicationLike;
        long currentTimeMillis = System.currentTimeMillis();
        ClassLoader classLoader = ToolsProfile.class.getClassLoader();
        ((C91348m) C86312j.m106911c(C91348m.class)).mo112620jj(new C80581a(this));
        Log.m105924i("MicroMsg.ToolsProfileTest", f235746c);
        AppLogic.setCallBack(new AppCallBack(MMApplicationContext.getContext()));
        C80814d b = C80814d.m98665b(this.f253585a.getBaseContext());
        C80818d0 d0Var = new C80818d0(b);
        b.mo112570e("TOOL");
        Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.display_errcode"), false);
        boolean z = C90188n0.f258933a;
        Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.display_msgstate"), false);
        Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.network.simulate_fault"), false);
        Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.network.force_touch"), false);
        Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
        Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.crashIsExit"), false);
        Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.album_show_info"), false);
        C90188n0.f258933a = Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.location_help"), false);
        Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.force_soso"), false);
        C90188n0.f258935c = Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.simulatePostServerError"), false);
        C90188n0.f258936d = Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
        Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
        C90188n0.f258938f = Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.filterfpnp"), false);
        Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.testForPull"), false);
        int nullAs = Util.nullAs(d0Var.f237574a.mo112568c(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
        C90188n0.f258937e = nullAs;
        if (nullAs != 4 && nullAs > 0) {
            Log.m105920e("MicroMsg.ToolDebugger", "cdn thread num " + C90188n0.f258937e);
        }
        Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
        try {
            int intValue = Integer.decode(d0Var.mo112566b(".com.tencent.mm.debug.log.setversion")).intValue();
            C89625d.m112062c(intValue);
            Integer.toHexString(intValue);
        } catch (Exception unused) {
            Log.m105924i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        try {
            String b2 = d0Var.mo112566b(".com.tencent.mm.debug.log.setapilevel");
            if (!Util.isNullOrNil(b2)) {
                C87200o.f252868a = "android-" + b2;
                C87200o.f252872e = "android-" + b2;
                C87200o.f252873f = "" + b2;
                CrashReportFactory.setDebugerApiLevel(b2);
                int i = C89625d.f257835a;
                CrashReportFactory.getDebugerApiLevel();
            }
        } catch (Exception unused2) {
            Log.m105924i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        try {
            C89625d.f257840f = (long) Integer.decode(d0Var.mo112566b(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (Exception unused3) {
            Log.m105924i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        try {
            d0Var.f237574a.f237576a = Integer.decode(d0Var.mo112566b(".com.tencent.mm.debug.log.setchannel")).intValue();
        } catch (Exception unused4) {
            Log.m105924i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        try {
            boolean nullAs2 = Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean nullAs3 = Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.report.kvstat"), false);
            Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.report.clientpref"), false);
            Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.report.useraction"), false);
            C88544a.f255754a = nullAs2;
            C88544a.f255755b = nullAs3;
        } catch (Exception unused5) {
            Log.m105924i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        C90188n0.f258945m = Util.nullAs(d0Var.mo112566b(".com.tencent.mm.debug.jsapi.permission"), "");
        Log.m105918d("MicroMsg.ToolDebugger", "Test.jsapiPermission = " + C90188n0.f258945m);
        C90188n0.f258946n = Util.nullAs(d0Var.mo112566b(".com.tencent.mm.debug.generalcontrol.permission"), "");
        Log.m105918d("MicroMsg.ToolDebugger", "Test.generalCtrl = " + C90188n0.f258946n);
        C90188n0.f258947o = Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.skiploadurlcheck"), false);
        Log.m105918d("MicroMsg.ToolDebugger", "Test.skipLoadUrlCheck = " + C90188n0.f258947o);
        C90188n0.f258948p = Util.nullAs(d0Var.mo112565a(".com.tencent.mm.debug.forcex5webview"), false);
        Log.m105918d("MicroMsg.ToolDebugger", "Test.forceX5WebView = " + C90188n0.f258948p);
        C80593h.m98211a(C86709a0.m107531m().mo58407a().f124990c);
        C88957l.m111079o(Mars.libMarsBase, classLoader);
        C88957l.m111079o(CommLibFileName.quic, classLoader);
        C88957l.m111079o(Mars.libMarsMM, classLoader);
        C77111p.f225220d = MMActivity.initLanguage(this.f253585a.getBaseContext());
        if (C11171e.m11046c(14) && (applicationLike = C80589e.f235760a) != null) {
            applicationLike.getApplication().registerActivityLifecycleCallbacks(new C80592f1(this));
        }
        Log.m105924i("MicroMsg.ToolsProfile", "start time check toolsprofile use time = " + (System.currentTimeMillis() - currentTimeMillis));
        Looper.myQueue().addIdleHandler(new C30684o1(MMApplicationContext.getContext()));
        if (MMApplicationContext.isToolsProcess()) {
            try {
                C18054e.f49894a.mo22565c().clearAll();
                Log.m105924i("MicroMsg.AppBrand.ThumbPlayerInitLogic", "resetPreloadData");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.ThumbPlayerInitLogic", e, "", new Object[0]);
            }
        }
        if (MMApplicationContext.isToolsProcess()) {
            SnsMethodCalculate.markStartTimeMs("onProcessStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader");
            Log.m105924i("AdToolsProcessPreloader", "onProcessStart");
            SnsMethodCalculate.markStartTimeMs("preloadAdLandingPagesProxy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader");
            try {
                if (!AdLandingPagesProxy.getInstance().isConnected()) {
                    AdLandingPagesProxy.getInstance().connect(new C38248j(System.currentTimeMillis()));
                } else {
                    Log.m105924i("AdToolsProcessPreloader", "AdLandingPagesProxy connected already");
                }
            } catch (Throwable unused6) {
                Log.m105920e("AdToolsProcessPreloader", "preloadAdLandingPagesProxy");
            }
            SnsMethodCalculate.markEndTimeMs("preloadAdLandingPagesProxy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader");
            SnsMethodCalculate.markEndTimeMs("onProcessStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader");
        }
    }

    public String toString() {
        return f235746c;
    }
}
