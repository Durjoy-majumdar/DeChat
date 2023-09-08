package m93;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: m93.g */
public final class C34483g {
    /* renamed from: a */
    public static final void m40370a(long j, int i, int i2) {
        Log.m105926v("MicroMsg.BrowserChooseReporter", "alvinluo reportBrowserChooseDialogAction action: " + i + ", browserCount: " + i2);
        C115669n.INSTANCE.mo160131h(21454, Integer.valueOf(i), 0, 0, "", Integer.valueOf(i2), Long.valueOf(j));
    }

    /* renamed from: b */
    public static final void m40371b(long j, int i, int i2) {
        Log.m105926v("MicroMsg.BrowserChooseReporter", "alvinluo reportBrowserSettingDialogAction action: " + i + ", browserCount: " + i2);
        C115669n.INSTANCE.mo160131h(21458, Integer.valueOf(i), 0, "", Integer.valueOf(i2), 0, Long.valueOf(j));
    }
}
