package ib1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetect.p045ui.C115433a;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import jb1.C108680a;
import kb1.C108993h;

/* renamed from: ib1.i */
public class C117151i implements C108993h {

    /* renamed from: a */
    public final /* synthetic */ FaceDetectUI f350991a;

    public C117151i(FaceDetectUI faceDetectUI) {
        this.f350991a = faceDetectUI;
    }

    /* renamed from: a */
    public void mo160112a(int i) {
        Log.m105925i("MicroMsg.FaceDetectUI", "alvinluo onPreviewInitDone: %d", Integer.valueOf(i));
        if (i == 0) {
            FaceDetectUI faceDetectUI = this.f350991a;
            int i2 = FaceDetectUI.f345990z;
            faceDetectUI.getClass();
            Log.m105926v("MicroMsg.FaceDetectUI", "alvinluo onPreviewDone");
            if (C108680a.m147401e().f325476h) {
                C108680a.m147401e().mo159699g(faceDetectUI.f346001q.getCameraRotation(), faceDetectUI.f346001q.getCameraPreivewWidth(), faceDetectUI.f346001q.getCameraPreviewHeight(), false, 0, faceDetectUI.f346001q.getCameraBestWidth(), faceDetectUI.f346001q.getCameraPreviewHeight(), true);
            }
            faceDetectUI.f346001q.mo175330e(false, faceDetectUI.f345992e);
            MMHandlerThread.postToMainThreadDelayed(new C115433a(faceDetectUI), 500);
        } else if (i == 1) {
            FaceDetectUI faceDetectUI2 = this.f350991a;
            int i3 = FaceDetectUI.f345990z;
            faceDetectUI2.mo175316I7(4, 90016, "preview error", faceDetectUI2.getString(C0966R.string.jl5));
        } else if (i == 2) {
            FaceDetectUI faceDetectUI3 = this.f350991a;
            String string = faceDetectUI3.getString(C0966R.string.hhq);
            int i4 = FaceDetectUI.f345990z;
            faceDetectUI3.mo175316I7(4, 90008, "camera permission not granted", string);
        }
    }
}
