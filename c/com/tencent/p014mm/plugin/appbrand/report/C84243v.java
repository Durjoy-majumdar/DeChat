package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import p823sg.C77710q;

/* renamed from: com.tencent.mm.plugin.appbrand.report.v */
public final class C84243v {

    /* renamed from: a */
    public static final C84243v f246075a = new C84243v();

    /* renamed from: b */
    public static String f246076b;

    /* renamed from: a */
    public static final String m103851a() {
        return "SceneId@" + f246075a.hashCode() + '#' + C77710q.m93738a(C86709a0.m107523b().mo121110g()) + '#' + Util.nowMilliSecond();
    }

    /* renamed from: b */
    public static final void m103852b(LocalUsageInfo localUsageInfo, int i, int i2, String str) {
        if (localUsageInfo != null) {
            String str2 = localUsageInfo.f239041e;
            int i3 = localUsageInfo.f239043g;
            int i4 = localUsageInfo.f239042f + 1;
            if (str2 != null) {
                int e = C84240s.m103839e(str2);
                Log.m105918d("MicroMsg.AppBrandStarOperationReporter", "report, appId: " + str2 + ", appVersion: " + i3 + ", appState: : " + i4 + ", eventId: " + i + ",scene: " + i2 + ", sceneId: " + str + ", serviceType: " + e);
                C115669n.INSTANCE.mo160131h(13801, str2, Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(Util.nowSecond()), Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(e));
            }
        }
    }
}
