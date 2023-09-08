package com.tencent.p014mm.plugin.scanner.p101ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$a */
public final /* synthetic */ class ScanTranslationCaptureUI$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f347081d;

    /* renamed from: e */
    public final /* synthetic */ int f347082e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f347083f;

    public /* synthetic */ ScanTranslationCaptureUI$$a(ScanTranslationCaptureUI scanTranslationCaptureUI, int i, Bitmap bitmap) {
        this.f347081d = scanTranslationCaptureUI;
        this.f347082e = i;
        this.f347083f = bitmap;
    }

    public final void run() {
        ScanTranslationCaptureUI scanTranslationCaptureUI = this.f347081d;
        int i = this.f347082e;
        Bitmap bitmap = this.f347083f;
        int i2 = ScanTranslationCaptureUI.f347042S;
        scanTranslationCaptureUI.getClass();
        Log.m105924i("MicroMsg.ScanTranslationCaptureUI", "drawTranslationResult() called with: session = [" + i + "], newBitmap = [" + bitmap + "]");
        if (i == scanTranslationCaptureUI.f347049G) {
            scanTranslationCaptureUI.f347056N.f343793i = (long) ((int) (System.currentTimeMillis() - scanTranslationCaptureUI.f347057P[1]));
            if (bitmap != null) {
                scanTranslationCaptureUI.f347075v = bitmap;
                scanTranslationCaptureUI.mo175942J7();
                scanTranslationCaptureUI.mo175949Q7(scanTranslationCaptureUI.f347075v);
                return;
            }
            scanTranslationCaptureUI.mo175946N7((String) null);
        }
    }
}
