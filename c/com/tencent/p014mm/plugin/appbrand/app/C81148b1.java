package com.tencent.p014mm.plugin.appbrand.app;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.autogen.mmdata.rpt.Skyline_Dart_Crash_ReporterStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import p1007mc.C88723a;
import u24.C90599h;
import yi0.C91452a;

/* renamed from: com.tencent.mm.plugin.appbrand.app.b1 */
public class C81148b1 extends C88723a.C88724a {
    /* renamed from: a */
    public void mo113338a(C88723a.C88725b bVar) {
        super.mo113338a(bVar);
        try {
            Skyline_Dart_Crash_ReporterStruct skyline_Dart_Crash_ReporterStruct = new Skyline_Dart_Crash_ReporterStruct();
            skyline_Dart_Crash_ReporterStruct.f236387d = skyline_Dart_Crash_ReporterStruct.mo86045b("Runtime", MMApplicationContext.getProcessName(), true);
            skyline_Dart_Crash_ReporterStruct.f236388e = skyline_Dart_Crash_ReporterStruct.mo86045b("CurrentActivity", AppForegroundDelegate.INSTANCE.mo174210c(), true);
            skyline_Dart_Crash_ReporterStruct.f236389f = skyline_Dart_Crash_ReporterStruct.mo86045b("CurrentThread", Thread.currentThread().getName(), true);
            skyline_Dart_Crash_ReporterStruct.f236390g = skyline_Dart_Crash_ReporterStruct.mo86045b("ExtraCrashMsg", Util.nullAsNil(C91452a.f262179d.getCrashReportExtraMessage()).replaceAll(",", "_"), true);
            skyline_Dart_Crash_ReporterStruct.f236391h = skyline_Dart_Crash_ReporterStruct.mo86045b("DeviceParameters", bVar.f256080a.replaceAll(",", "_"), true);
            skyline_Dart_Crash_ReporterStruct.f236392i = skyline_Dart_Crash_ReporterStruct.mo86045b("CustomParameters", bVar.f256081b.replaceAll(",", "_"), true);
            skyline_Dart_Crash_ReporterStruct.f236393j = skyline_Dart_Crash_ReporterStruct.mo86045b("ApplicationParameters", bVar.f256082c.replaceAll(",", "_"), true);
            skyline_Dart_Crash_ReporterStruct.f236394k = skyline_Dart_Crash_ReporterStruct.mo86045b(ExifInterface.TAG_DATETIME, bVar.f256083d, true);
            skyline_Dart_Crash_ReporterStruct.f236395l = skyline_Dart_Crash_ReporterStruct.mo86045b("Context", bVar.f256084e, true);
            skyline_Dart_Crash_ReporterStruct.f236396m = skyline_Dart_Crash_ReporterStruct.mo86045b("CrashContent", C90599h.m113522o(bVar.f256085f.replaceAll(",", "_"), 0, 1024), true);
            skyline_Dart_Crash_ReporterStruct.f236397n = (long) bVar.f256086g;
            skyline_Dart_Crash_ReporterStruct.mo86054n();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMSkylineBootGuard", "report fail: %s", e);
        }
    }
}
