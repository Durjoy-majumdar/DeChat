package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.scanner.model.f1 */
public final class C19019f1 implements C19027m0 {

    /* renamed from: d */
    public final /* synthetic */ int f53450d;

    /* renamed from: e */
    public final /* synthetic */ boolean f53451e;

    /* renamed from: com.tencent.mm.plugin.scanner.model.f1$a */
    public static final class C19020a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f53452d;

        /* renamed from: e */
        public final /* synthetic */ String f53453e;

        /* renamed from: f */
        public final /* synthetic */ boolean f53454f;

        public C19020a(int i, String str, boolean z) {
            this.f53452d = i;
            this.f53453e = str;
            this.f53454f = z;
        }

        public final void run() {
            C19016e1 e1Var = C19016e1.f53424a;
            int i = this.f53452d;
            String str = this.f53453e;
            boolean z = this.f53454f;
            Log.m105919d("MicroMsg.ScanReporter", "alvinluo reportScanFocusEngineReportInfo %s", str);
            if (!(str == null || str.length() == 0)) {
                String str2 = C19016e1.f53427d.get(Integer.valueOf(i));
                String str3 = C19016e1.f53426c.get(Integer.valueOf(i));
                if (!(str2 == null || str2.length() == 0)) {
                    if (!(str3 == null || str3.length() == 0)) {
                        Log.m105919d("MicroMsg.ScanReporter", "alvinluo reportScanFocusEngineReportInfo logId: %d, tabId: %d, tabSession: %s, scanSession: %s, hasResult: %b", 18731, Integer.valueOf(i), str2, str3, Boolean.valueOf(z));
                        C115669n.INSTANCE.mo160131h(18731, str2, str3, Integer.valueOf(z ? 1 : 0), str);
                    }
                }
            }
        }
    }

    public C19019f1(int i, boolean z) {
        this.f53450d = i;
        this.f53451e = z;
    }

    public final void run() {
        String str;
        if (C19021i0.f53461g) {
            str = C19021i0.f53460f.getReportString();
        } else {
            Log.m105928w("MicroMsg.ScanFastFocusEngineManager", "alvinluo getReportString is not init");
            str = null;
        }
        MMHandlerThread.postToMainThread(new C19020a(this.f53450d, str, this.f53451e));
    }
}
