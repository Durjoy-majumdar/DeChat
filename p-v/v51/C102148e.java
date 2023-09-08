package v51;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: v51.e */
public class C102148e {
    /* renamed from: a */
    public static void m134580a(long j, long j2) {
        Log.m105925i("MicroMsg.emoji.EmojiReportHepler", "report id stat key:%d, value:%d", Long.valueOf(j), Long.valueOf(j2));
        C115669n.INSTANCE.idkeyStat(96, j, j2, false);
    }

    /* renamed from: b */
    public static void m134581b(String str, int i, int i2, int i3, String str2, int i4, String str3) {
        Log.m105925i("MicroMsg.emoji.EmojiReportHepler", "report kv stat md5:%s, downType:%d donwloadResult:%d verifyResult:%d productID:%s", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2);
        C115669n.INSTANCE.mo160131h(12007, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4), str3);
    }
}
