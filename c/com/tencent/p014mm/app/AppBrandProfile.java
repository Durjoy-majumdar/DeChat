package com.tencent.p014mm.app;

import android.content.Context;
import android.os.Handler;
import com.tencent.mars.Mars;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.booter.C80831z;
import com.tencent.p014mm.console.Shell;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.p014mm.sdk.CommLibFileName;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import lj2.C88544a;
import p156gj.C87200o;
import p206nj.C88957l;
import p757xv.C91348m;
import p977hj.C87528c;
import qe3.C89625d;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.app.AppBrandProfile */
public class AppBrandProfile extends C87528c {

    /* renamed from: b */
    public static String f235714b = "";

    /* renamed from: com.tencent.mm.app.AppBrandProfile$a */
    public class C80571a implements MMUncaughtExceptionHandler.IOnUncaughtExceptionListener {
        public C80571a(AppBrandProfile appBrandProfile) {
        }

        public void uncaughtException(MMUncaughtExceptionHandler mMUncaughtExceptionHandler, String str, Throwable th) {
            C115669n.INSTANCE.idkeyStat(365, 3, 1, false);
            KVCommCrossProcessReceiver.m162690b();
        }
    }

    /* renamed from: a */
    public void mo112236a() {
        Log.m105924i("MicroMsg.AppBrandProfile", "AppBrandProfile create");
        f235714b = MMApplicationContext.getProcessName();
        ClassLoader classLoader = AppBrandProfile.class.getClassLoader();
        ((C91348m) C86312j.m106911c(C91348m.class)).mo112620jj(new C80571a(this));
        C80831z zVar = new C80831z(C80814d.m98665b(this.f253585a.getBaseContext()));
        String str = f235714b;
        str.replace(MMApplicationContext.getPackageName() + ":appbrand", "");
        Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.display_errcode"), false);
        boolean z = C90188n0.f258933a;
        Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.display_msgstate"), false);
        Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.network.simulate_fault"), false);
        Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.network.force_touch"), false);
        Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
        Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.crashIsExit"), false);
        Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.album_show_info"), false);
        C90188n0.f258933a = Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.location_help"), false);
        Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.force_soso"), false);
        C90188n0.f258935c = Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.simulatePostServerError"), false);
        C90188n0.f258936d = Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
        Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
        C90188n0.f258938f = Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.filterfpnp"), false);
        Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.testForPull"), false);
        int nullAs = Util.nullAs(zVar.f237574a.mo112568c(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
        C90188n0.f258937e = nullAs;
        if (nullAs != 4 && nullAs > 0) {
            Log.m105920e("MicroMsg.AppBDebugger", "cdn thread num " + C90188n0.f258937e);
        }
        Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
        C90188n0.f258948p = Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.forcex5webview"), false);
        C90188n0.f258945m = Util.nullAs(zVar.mo112566b(".com.tencent.mm.debug.jsapi.permission"), "");
        Log.m105918d("MicroMsg.AppBDebugger", "Test.jsapiPermission = " + C90188n0.f258945m);
        boolean nullAs2 = Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.appbrand.comm_lib_coverage_collect"), false);
        C90188n0.f258949q = nullAs2;
        Log.m105925i("MicroMsg.AppBDebugger", "Test.appbrandCommLibCoverageCollect=%b", Boolean.valueOf(nullAs2));
        try {
            int intValue = Integer.decode(zVar.mo112566b(".com.tencent.mm.debug.log.setversion")).intValue();
            C89625d.m112062c(intValue);
            Integer.toHexString(intValue);
        } catch (Exception unused) {
            Log.m105924i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        try {
            String b = zVar.mo112566b(".com.tencent.mm.debug.log.setapilevel");
            if (!Util.isNullOrNil(b)) {
                C87200o.f252868a = "android-" + b;
                C87200o.f252872e = "android-" + b;
                C87200o.f252873f = "" + b;
                CrashReportFactory.setDebugerApiLevel(b);
                int i = C89625d.f257835a;
                CrashReportFactory.getDebugerApiLevel();
            }
        } catch (Exception unused2) {
            Log.m105924i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        try {
            C89625d.f257840f = (long) Integer.decode(zVar.mo112566b(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (Exception unused3) {
            Log.m105924i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        try {
            zVar.f237574a.f237576a = Integer.decode(zVar.mo112566b(".com.tencent.mm.debug.log.setchannel")).intValue();
        } catch (Exception unused4) {
            Log.m105924i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        try {
            boolean nullAs3 = Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean nullAs4 = Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.report.kvstat"), false);
            Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.report.clientpref"), false);
            Util.nullAs(zVar.mo112565a(".com.tencent.mm.debug.report.useraction"), false);
            C88544a.f255754a = nullAs3;
            C88544a.f255755b = nullAs4;
        } catch (Exception unused5) {
            Log.m105924i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        if (WeChatEnvironment.hasDebugger()) {
            Shell shell = new Shell();
            Context context = MMApplicationContext.getContext();
            if (shell.f79323a == null) {
                Shell.Receiver receiver = new Shell.Receiver();
                shell.f79323a = receiver;
                context.registerReceiver(receiver, Shell.f79322c, WeChatEnvironment.hasDebugger() ? null : "com.tencent.mm.permission.MOVE_XLOG", (Handler) null);
            }
        }
        C88957l.m111079o(Mars.libMarsBase, classLoader);
        C88957l.m111079o(CommLibFileName.quic, classLoader);
        C88957l.m111079o(Mars.libMarsMM, classLoader);
    }
}
