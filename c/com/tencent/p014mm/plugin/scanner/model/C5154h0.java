package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import uk2.C14200b;

/* renamed from: com.tencent.mm.plugin.scanner.model.h0 */
public final class C5154h0 implements C14200b {

    /* renamed from: a */
    public static final C5154h0 f20555a = new C5154h0();

    /* renamed from: a */
    public void mo6118a(int i, int i2) {
        Log.m105918d("MicroMsg.ScanExtReporter", "reportCameraVoiceUsingStateWhenEnterScanUI enterScene: " + i + ", state: " + i2);
        if (i2 != 0) {
            C115669n.INSTANCE.mo160131h(27693, Integer.valueOf(i2), Integer.valueOf(i));
        }
    }
}
