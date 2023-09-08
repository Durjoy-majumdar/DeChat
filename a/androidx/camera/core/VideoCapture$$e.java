package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.VideoCapture;
import p202m2.C117512b;

public final /* synthetic */ class VideoCapture$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoCapture f44313d;

    /* renamed from: e */
    public final /* synthetic */ VideoCapture.OnVideoSavedCallback f44314e;

    /* renamed from: f */
    public final /* synthetic */ String f44315f;

    /* renamed from: g */
    public final /* synthetic */ Size f44316g;

    /* renamed from: h */
    public final /* synthetic */ VideoCapture.OutputFileOptions f44317h;

    /* renamed from: i */
    public final /* synthetic */ C117512b.C117513a f44318i;

    public /* synthetic */ VideoCapture$$e(VideoCapture videoCapture, VideoCapture.OnVideoSavedCallback onVideoSavedCallback, String str, Size size, VideoCapture.OutputFileOptions outputFileOptions, C117512b.C117513a aVar) {
        this.f44313d = videoCapture;
        this.f44314e = onVideoSavedCallback;
        this.f44315f = str;
        this.f44316g = size;
        this.f44317h = outputFileOptions;
        this.f44318i = aVar;
    }

    public final void run() {
        this.f44313d.lambda$startRecording$4(this.f44314e, this.f44315f, this.f44316g, this.f44317h, this.f44318i);
    }
}
