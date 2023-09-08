package com.tencent.p014mm.plugin.facedetect.views;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.tencent.p014mm.plugin.facedetect.model.C105224h;
import com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.facedetect.views.b */
public class C105243b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FaceDetectCameraView.C105232c f312663d;

    public C105243b(FaceDetectCameraView.C105232c cVar) {
        this.f312663d = cVar;
    }

    public void run() {
        synchronized (FaceDetectCameraView.this.f312641u) {
            if (this.f312663d.f312647a != null) {
                Log.m105918d("MicroMsg.FaceDetectCameraView", "hy: closeCamera");
                this.f312663d.f312647a.mo149600f((Camera.PreviewCallback) null);
                C105224h b = C105224h.m141309b();
                b.getClass();
                synchronized (C105224h.f312605c) {
                    List<C105224h.C105225a> list = b.f312606a;
                    if (list != null) {
                        list.clear();
                    }
                }
                SurfaceTexture surfaceTexture = FaceDetectCameraView.this.f312632i;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                this.f312663d.f312647a.mo149599e();
                this.f312663d.f312647a = null;
                Log.m105918d("MicroMsg.FaceDetectCameraView", "hy: scanCamera.release() done");
                FaceDetectCameraView.this.f312636p = false;
            }
        }
    }
}
