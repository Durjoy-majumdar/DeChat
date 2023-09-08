package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.sdk.platformtools.Log;
import kj2.C117407d;

/* renamed from: com.tencent.mm.plugin.sns.statistics.v */
public class C5438v {
    /* renamed from: a */
    public static void m5358a(int i, String str, int i2) {
        String format = String.format("%s,%s,%s,%s", new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), Long.valueOf(System.currentTimeMillis())});
        Log.m105925i("MicroMsg.SNS.SnsReportLogic", "snsRedDotAction 16172 report %s", format);
        C117407d.INSTANCE.kvStat(16172, format);
    }
}
