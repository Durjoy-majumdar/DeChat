package com.tencent.p014mm.plugin.performance.jectl;

import com.tencent.p014mm.plugin.performance.jectl.JeVersion;
import com.tencent.p014mm.sdk.crash.ICrashReporter;

/* renamed from: com.tencent.mm.plugin.performance.jectl.b */
public class C30347b implements ICrashReporter.ICrashReportExtraMessageGetter {
    public C30347b(JeVersion.JeService jeService) {
    }

    public String getCrashReportExtraMessage() {
        int decodeInt = JeVersion.f81899a.decodeInt("JV_KEY_CRASH_TIMES_INT", 0) + 1;
        JeVersion.f81899a.encode("JV_KEY_CRASH_TIMES_INT", decodeInt);
        return "JeService crashed for " + decodeInt + " times";
    }
}
