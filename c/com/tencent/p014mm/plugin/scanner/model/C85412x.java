package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.scanner.model.x */
public final class C85412x {

    /* renamed from: a */
    public static final C85412x f248924a = new C85412x();

    /* renamed from: b */
    public static boolean f248925b;

    /* renamed from: a */
    public final void mo118759a(String str, String str2, int i, int i2, int i3) {
        C87412m.m108594g(str2, "resultType");
        Log.m105925i("MicroMsg.OfflineScanReporter", "alvinluo OfflineScan report resultType: %s, scene: %d, networkType: %d, actionType: %d, result: %s", str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[6];
        objArr[0] = str2;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(i3);
        if (str == null) {
            str = "";
        }
        objArr[4] = str;
        objArr[5] = Integer.valueOf(f248925b ? 1 : 0);
        nVar.mo160131h(17386, objArr);
    }
}
