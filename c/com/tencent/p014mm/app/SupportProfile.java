package com.tencent.p014mm.app;

import com.tencent.mars.Mars;
import com.tencent.p014mm.booter.C80813c0;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.p014mm.sdk.CommLibFileName;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import lj2.C88544a;
import p156gj.C87200o;
import p206nj.C88957l;
import p581jx.C88036b;
import p757xv.C91348m;
import p977hj.C87528c;
import qe3.C89625d;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.app.SupportProfile */
public class SupportProfile extends C87528c {

    /* renamed from: com.tencent.mm.app.SupportProfile$a */
    public class C80572a implements MMUncaughtExceptionHandler.IOnUncaughtExceptionListener {
        public C80572a(SupportProfile supportProfile) {
        }

        public void uncaughtException(MMUncaughtExceptionHandler mMUncaughtExceptionHandler, String str, Throwable th) {
            C115669n.INSTANCE.idkeyStat(637, 0, 1, false);
            KVCommCrossProcessReceiver.m162690b();
        }
    }

    /* renamed from: a */
    public void mo112236a() {
        MMApplicationContext.getProcessName();
        ClassLoader classLoader = SupportProfile.class.getClassLoader();
        ((C91348m) C86312j.m106911c(C91348m.class)).mo112620jj(new C80572a(this));
        C80814d b = C80814d.m98665b(this.f253585a.getBaseContext());
        C80813c0 c0Var = new C80813c0(b);
        b.mo112570e("SUPPORT");
        Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.display_errcode"), false);
        boolean z = C90188n0.f258933a;
        Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.display_msgstate"), false);
        Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.network.simulate_fault"), false);
        Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.network.force_touch"), false);
        Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
        Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.crashIsExit"), false);
        Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.album_show_info"), false);
        C90188n0.f258933a = Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.location_help"), false);
        Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.force_soso"), false);
        C90188n0.f258935c = Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.simulatePostServerError"), false);
        C90188n0.f258936d = Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
        Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
        C90188n0.f258938f = Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.filterfpnp"), false);
        Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.testForPull"), false);
        int nullAs = Util.nullAs(c0Var.f237574a.mo112568c(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
        C90188n0.f258937e = nullAs;
        if (nullAs != 4 && nullAs > 0) {
            Log.m105920e("SetupSupportDebugger", "cdn thread num " + C90188n0.f258937e);
        }
        Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
        C90188n0.f258948p = Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.forcex5webview"), false);
        C90188n0.f258945m = Util.nullAs(c0Var.mo112566b(".com.tencent.mm.debug.jsapi.permission"), "");
        Log.m105918d("SetupSupportDebugger", "Test.jsapiPermission = " + C90188n0.f258945m);
        try {
            int intValue = Integer.decode(c0Var.mo112566b(".com.tencent.mm.debug.log.setversion")).intValue();
            C89625d.m112062c(intValue);
            Integer.toHexString(intValue);
        } catch (Exception unused) {
            Log.m105924i("SetupSupportDebugger", "no debugger was got");
        }
        try {
            String b2 = c0Var.mo112566b(".com.tencent.mm.debug.log.setapilevel");
            if (!Util.isNullOrNil(b2)) {
                C87200o.f252868a = "android-" + b2;
                C87200o.f252872e = "android-" + b2;
                C87200o.f252873f = "" + b2;
                CrashReportFactory.setDebugerApiLevel(b2);
                int i = C89625d.f257835a;
                CrashReportFactory.getDebugerApiLevel();
            }
        } catch (Exception unused2) {
            Log.m105924i("SetupSupportDebugger", "no debugger was got");
        }
        try {
            C89625d.f257840f = (long) Integer.decode(c0Var.mo112566b(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (Exception unused3) {
            Log.m105924i("SetupSupportDebugger", "no debugger was got");
        }
        try {
            c0Var.f237574a.f237576a = Integer.decode(c0Var.mo112566b(".com.tencent.mm.debug.log.setchannel")).intValue();
        } catch (Exception unused4) {
            Log.m105924i("SetupSupportDebugger", "no debugger was got");
        }
        try {
            boolean nullAs2 = Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean nullAs3 = Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.report.kvstat"), false);
            Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.report.clientpref"), false);
            Util.nullAs(c0Var.mo112565a(".com.tencent.mm.debug.report.useraction"), false);
            C88544a.f255754a = nullAs2;
            C88544a.f255755b = nullAs3;
        } catch (Exception unused5) {
            Log.m105924i("SetupSupportDebugger", "no debugger was got");
        }
        C88957l.m111079o(Mars.libMarsBase, classLoader);
        C88957l.m111079o(CommLibFileName.quic, classLoader);
        C88957l.m111079o(Mars.libMarsMM, classLoader);
        MMActivity.initLanguage(this.f253585a.getBaseContext());
        ((C88036b) C86312j.m106911c(C88036b.class)).init();
    }
}
