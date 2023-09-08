package com.tencent.p014mm.sandbox.monitor;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.xwalk.core.XWalkEnvironment;

/* renamed from: com.tencent.mm.sandbox.monitor.a */
public class C30706a {
    /* renamed from: a */
    public static void m39157a(String str) {
        Log.m105925i("MicroMsg.CrashSecondReport", "secondReportCrash() process:%s", str);
        if (Util.isEqual(str, XWalkEnvironment.MODULE_MM)) {
            C115669n.INSTANCE.idkeyStat(1185, 21, 1, true);
        } else if (Util.isEqual(str, "push")) {
            C115669n.INSTANCE.idkeyStat(1185, 22, 1, true);
        } else if (Util.isEqual(str, "other")) {
            C115669n.INSTANCE.idkeyStat(1185, 23, 1, true);
        }
    }
}
