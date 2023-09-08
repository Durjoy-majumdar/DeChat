package com.tencent.p014mm.plugin.facedetect.p045ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.facedetect.ui.b */
public class C115434b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f346016d;

    /* renamed from: e */
    public final /* synthetic */ FaceDetectUI.C115431d f346017e;

    /* renamed from: f */
    public final /* synthetic */ FaceDetectUI f346018f;

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.b$a */
    public class C115435a implements Runnable {
        public C115435a() {
        }

        public void run() {
            FaceDetectUI.C115431d dVar = C115434b.this.f346017e;
            if (dVar != null) {
                C115436c cVar = (C115436c) dVar;
                cVar.getClass();
                Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo set result and return to FaceDetectPrepareUI");
                FaceDetectUI faceDetectUI = cVar.f346020a;
                faceDetectUI.f346007w = true;
                faceDetectUI.mo175315H7(0, 0, "collect data ok", (Bundle) null);
            }
        }
    }

    public C115434b(FaceDetectUI faceDetectUI, Bitmap bitmap, FaceDetectUI.C115431d dVar) {
        this.f346018f = faceDetectUI;
        this.f346016d = bitmap;
        this.f346017e = dVar;
    }

    public void run() {
        C85191v.m105076o(MMApplicationContext.getContext(), this.f346018f.f345992e, this.f346016d);
        MMHandlerThread.postToMainThread(new C115435a());
    }
}
