package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.ui.contact.k3 */
public class C44879k3 {
    /* renamed from: a */
    public static final void m49760a(String str, int i, int i2, int i3) {
        if (!Util.isNullOrNil(str)) {
            String format = String.format("%s,%d,%d,%d,%d", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), 0});
            Log.m105927v("MicroMsg.SelectContactReportLogic", "reportClick: %s", format);
            C115669n.INSTANCE.kvStat(13234, format);
        }
    }

    /* renamed from: b */
    public static void m49761b(int i) {
        Log.m105925i("MicroMsg.SelectContactReportLogic", "reportCreateChatroomClick %d %d", 13941, Integer.valueOf(i));
        C115669n.INSTANCE.mo160131h(13941, Integer.valueOf(i));
    }
}
