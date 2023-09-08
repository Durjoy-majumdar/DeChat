package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.s2 */
public final class C83460s2 {

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.s2$a */
    public enum C83461a {
        NONE,
        MISSING_PKG,
        NO_USE_RECENT,
        INVALID_FIELDS,
        VERSION_NOT_FOUND,
        PATH_NOT_FOUND,
        CMD_UPDATE_VERSION,
        ATTRS_NOT_FOUND
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.s2$b */
    public enum C83462b {
        SYNC_GET_ATTRS(20),
        SYNC_LAUNCH(21);
        

        /* renamed from: d */
        public final int f243892d;

        /* access modifiers changed from: public */
        C83462b(int i) {
            this.f243892d = i;
        }
    }

    /* renamed from: a */
    public static void m102419a(C83462b bVar, String str, int i, int i2, int i3, long j, int i4) {
        int e = C84240s.m103839e(str);
        Log.m105919d("MicroMsg.AppBrand.LaunchStepCostReporter", "report %s | %s | %d | %d | %d", bVar.name(), str, Long.valueOf(j), Integer.valueOf(e), Integer.valueOf(i4));
        C115669n.INSTANCE.mo160131h(13886, str, Integer.valueOf(i), Integer.valueOf(1 + i2), Integer.valueOf(bVar.f243892d), "", "", Long.valueOf(j), 0, 0, Integer.valueOf(i3), 0, 0, Integer.valueOf(e), Integer.valueOf(i4));
    }
}
