package kb1;

import android.graphics.Rect;
import com.tencent.p014mm.plugin.facedetect.model.C105227i;
import com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: kb1.a */
public class C108990a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FaceDetectCameraView f326460d;

    public C108990a(FaceDetectCameraView faceDetectCameraView) {
        this.f326460d = faceDetectCameraView;
    }

    public void run() {
        FaceDetectCameraView faceDetectCameraView = this.f326460d;
        Rect rect = faceDetectCameraView.f312642v;
        long j = faceDetectCameraView.f312633j;
        synchronized (faceDetectCameraView) {
            Log.m105924i("MicroMsg.FaceDetectCameraView", "hy: request clear queue");
            C105227i.f312610f.removeCallbacksAndMessages((Object) null);
            faceDetectCameraView.f312642v = rect;
            faceDetectCameraView.mo149605G();
            ((FaceDetectCameraView.C105232c) faceDetectCameraView.f312646z).mo149620c(j);
        }
        this.f326460d.f312637q = false;
    }
}
