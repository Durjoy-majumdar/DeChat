package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.SessionConfig;

public final /* synthetic */ class ImageCapture$$g implements SessionConfig.ErrorListener {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f44238a;

    /* renamed from: b */
    public final /* synthetic */ String f44239b;

    /* renamed from: c */
    public final /* synthetic */ ImageCaptureConfig f44240c;

    /* renamed from: d */
    public final /* synthetic */ Size f44241d;

    public /* synthetic */ ImageCapture$$g(ImageCapture imageCapture, String str, ImageCaptureConfig imageCaptureConfig, Size size) {
        this.f44238a = imageCapture;
        this.f44239b = str;
        this.f44240c = imageCaptureConfig;
        this.f44241d = size;
    }

    public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        this.f44238a.lambda$createPipeline$2(this.f44239b, this.f44240c, this.f44241d, sessionConfig, sessionError);
    }
}
