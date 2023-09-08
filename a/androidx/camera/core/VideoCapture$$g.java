package androidx.camera.core;

import android.media.MediaCodec;

public final /* synthetic */ class VideoCapture$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f44320d;

    /* renamed from: e */
    public final /* synthetic */ MediaCodec f44321e;

    public /* synthetic */ VideoCapture$$g(boolean z, MediaCodec mediaCodec) {
        this.f44320d = z;
        this.f44321e = mediaCodec;
    }

    public final void run() {
        VideoCapture.lambda$releaseCameraSurface$7(this.f44320d, this.f44321e);
    }
}
