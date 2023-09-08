package com.tencent.p014mm.feature.performance;

import android.util.Log;
import com.tencent.p014mm.autogen.mmdata.rpt.AlarmCrashStatisticsStruct;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import p970gg.C87186a;

/* renamed from: com.tencent.mm.feature.performance.a */
public class C80860a implements C87186a.C87187a {
    /* renamed from: a */
    public String mo112618a() {
        try {
            return Log.getStackTraceString(new Throwable());
        } catch (IllegalStateException e) {
            com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.AlarmHelperReportCrashImpl", "getStack() %s", e.getMessage());
            return Util.getStack().toString();
        } catch (Exception e2) {
            com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.AlarmHelperReportCrashImpl", "getStack() %s", e2.getMessage());
            return Util.getStack().toString();
        }
    }

    /* renamed from: b */
    public void mo112619b(int i, int i2, String str) {
        try {
            AlarmCrashStatisticsStruct alarmCrashStatisticsStruct = new AlarmCrashStatisticsStruct();
            alarmCrashStatisticsStruct.f236319e = alarmCrashStatisticsStruct.mo86045b("ProcessName", MMApplicationContext.getProcessName(), true);
            alarmCrashStatisticsStruct.f236318d = (long) i;
            alarmCrashStatisticsStruct.f236320f = (long) i2;
            alarmCrashStatisticsStruct.f236321g = alarmCrashStatisticsStruct.mo86045b("Stack", mo112618a(), true);
            alarmCrashStatisticsStruct.mo86054n();
        } catch (Exception e) {
            com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.AlarmHelperReportCrashImpl", "AlarmHelper.IReportCrash Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }
}
