package com.tencent.p014mm.app;

import com.tencent.p014mm.booter.C80812b0;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import lj2.C88544a;
import p156gj.C87200o;
import p977hj.C87528c;
import qe3.C89625d;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.app.ExDeviceProfile */
public class ExDeviceProfile extends C87528c {

    /* renamed from: b */
    public static final String f235715b = (MMApplicationContext.getPackageName() + ":exdevice");

    /* renamed from: a */
    public void mo112236a() {
        Log.m105924i("MicroMsg.ExDeviceProfile", "exdevice profile oncreate");
        C80814d b = C80814d.m98665b(this.f253585a.getBaseContext());
        C80812b0 b0Var = new C80812b0(b);
        b.mo112570e("EXDEVICE");
        Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.display_errcode"), false);
        boolean z = C90188n0.f258933a;
        Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.display_msgstate"), false);
        Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.network.simulate_fault"), false);
        Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.network.force_touch"), false);
        Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
        Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.crashIsExit"), false);
        Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.album_show_info"), false);
        C90188n0.f258933a = Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.location_help"), false);
        Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.force_soso"), false);
        C90188n0.f258935c = Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.simulatePostServerError"), false);
        C90188n0.f258936d = Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
        Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
        C90188n0.f258938f = Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.filterfpnp"), false);
        Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.testForPull"), false);
        int nullAs = Util.nullAs(b0Var.f237574a.mo112568c(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
        C90188n0.f258937e = nullAs;
        if (nullAs != 4 && nullAs > 0) {
            Log.m105920e("MicroMsg.ExdDebugger", "cdn thread num " + C90188n0.f258937e);
        }
        Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
        try {
            int intValue = Integer.decode(b0Var.mo112566b(".com.tencent.mm.debug.log.setversion")).intValue();
            C89625d.m112062c(intValue);
            Integer.toHexString(intValue);
        } catch (Exception unused) {
            Log.m105924i("MicroMsg.ExdDebugger", "no debugger was got");
        }
        try {
            String b2 = b0Var.mo112566b(".com.tencent.mm.debug.log.setapilevel");
            if (!Util.isNullOrNil(b2)) {
                C87200o.f252868a = "android-" + b2;
                C87200o.f252872e = "android-" + b2;
                C87200o.f252873f = "" + b2;
                CrashReportFactory.setDebugerApiLevel(b2);
                int i = C89625d.f257835a;
                CrashReportFactory.getDebugerApiLevel();
            }
        } catch (Exception unused2) {
            Log.m105924i("MicroMsg.ExdDebugger", "no debugger was got");
        }
        try {
            C89625d.f257840f = (long) Integer.decode(b0Var.mo112566b(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (Exception unused3) {
            Log.m105924i("MicroMsg.ExdDebugger", "no debugger was got");
        }
        try {
            boolean nullAs2 = Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean nullAs3 = Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.report.kvstat"), false);
            Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.report.clientpref"), false);
            Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.report.useraction"), false);
            C88544a.f255754a = nullAs2;
            C88544a.f255755b = nullAs3;
        } catch (Exception unused4) {
            Log.m105924i("MicroMsg.ExdDebugger", "no debugger was got");
        }
        C90188n0.f258945m = Util.nullAs(b0Var.mo112566b(".com.tencent.mm.debug.jsapi.permission"), "");
        Log.m105918d("MicroMsg.ExdDebugger", "Test.jsapiPermission = " + C90188n0.f258945m);
        C90188n0.f258946n = Util.nullAs(b0Var.mo112566b(".com.tencent.mm.debug.generalcontrol.permission"), "");
        Log.m105918d("MicroMsg.ExdDebugger", "Test.generalCtrl = " + C90188n0.f258946n);
        C90188n0.f258947o = Util.nullAs(b0Var.mo112565a(".com.tencent.mm.debug.skiploadurlcheck"), false);
        Log.m105918d("MicroMsg.ExdDebugger", "Test.skipLoadUrlCheck = " + C90188n0.f258947o);
    }

    public String toString() {
        return f235715b;
    }
}
