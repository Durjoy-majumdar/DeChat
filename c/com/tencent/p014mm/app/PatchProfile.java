package com.tencent.p014mm.app;

import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import lj2.C88544a;
import p156gj.C87200o;
import p977hj.C87528c;
import qe3.C89625d;

/* renamed from: com.tencent.mm.app.PatchProfile */
public final class PatchProfile extends C87528c {

    /* renamed from: b */
    public static final String f235716b = (MMApplicationContext.getPackageName() + ":patch");

    /* renamed from: a */
    public void mo112236a() {
        long currentTimeMillis = System.currentTimeMillis();
        C80814d b = C80814d.m98665b(this.f253585a.getBaseContext());
        b.mo112570e("PATCH");
        try {
            int intValue = Integer.decode(b.mo112569d(".com.tencent.mm.debug.log.setversion")).intValue();
            C89625d.m112062c(intValue);
            Integer.toHexString(intValue);
        } catch (Exception unused) {
            Log.m105924i("MicroMsg.PatchDebugger", "no debugger was got");
        }
        try {
            String d = b.mo112569d(".com.tencent.mm.debug.log.setapilevel");
            if (!Util.isNullOrNil(d)) {
                C87200o.f252868a = "android-" + d;
                C87200o.f252872e = "android-" + d;
                C87200o.f252873f = "" + d;
                CrashReportFactory.setDebugerApiLevel(d);
                int i = C89625d.f257835a;
                CrashReportFactory.getDebugerApiLevel();
            }
        } catch (Exception unused2) {
            Log.m105924i("MicroMsg.PatchDebugger", "no debugger was got");
        }
        try {
            C89625d.f257840f = (long) Integer.decode(b.mo112569d(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (Exception unused3) {
            Log.m105924i("MicroMsg.PatchDebugger", "no debugger was got");
        }
        try {
            boolean nullAs = Util.nullAs(b.mo112567a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean nullAs2 = Util.nullAs(b.mo112567a(".com.tencent.mm.debug.report.kvstat"), false);
            Util.nullAs(b.mo112567a(".com.tencent.mm.debug.report.clientpref"), false);
            Util.nullAs(b.mo112567a(".com.tencent.mm.debug.report.useraction"), false);
            C88544a.f255754a = nullAs;
            C88544a.f255755b = nullAs2;
        } catch (Exception unused4) {
            Log.m105924i("MicroMsg.PatchDebugger", "no debugger was got");
        }
        Log.m105924i("MicroMsg.PatchProfile", "patchsprofile try to init hotpatch plugin");
        Log.m105924i("MicroMsg.PatchProfile", "start time check patchsprofile use time = " + (System.currentTimeMillis() - currentTimeMillis));
    }

    public String toString() {
        return f235716b;
    }
}
