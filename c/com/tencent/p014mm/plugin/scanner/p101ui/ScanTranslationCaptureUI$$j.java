package com.tencent.p014mm.plugin.scanner.p101ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$j */
public class ScanTranslationCaptureUI$$j extends C29060q.C29061a {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f347088d;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$j$a */
    public class C115676a implements Runnable {
        public C115676a() {
        }

        public void run() {
            if (C86709a0.m107524d().mo123467m() != 6 && C86709a0.m107524d().mo123467m() != 4) {
                ScanTranslationCaptureUI scanTranslationCaptureUI = ScanTranslationCaptureUI$$j.this.f347088d;
                if (scanTranslationCaptureUI.f347050H == 1) {
                    C76879j.m92748s(scanTranslationCaptureUI, scanTranslationCaptureUI.getString(C0966R.string.ide), "");
                    ScanTranslationCaptureUI$$j.this.f347088d.mo175941I7();
                }
            }
        }
    }

    public ScanTranslationCaptureUI$$j(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f347088d = scanTranslationCaptureUI;
    }

    public void onNetworkChange(int i) {
        MMHandlerThread.postToMainThread(new C115676a());
    }
}
