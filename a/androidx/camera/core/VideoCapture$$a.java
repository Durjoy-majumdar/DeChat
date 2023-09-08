package androidx.camera.core;

import androidx.camera.core.VideoCapture;
import java.util.concurrent.Executor;

public final /* synthetic */ class VideoCapture$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoCapture f44305d;

    /* renamed from: e */
    public final /* synthetic */ VideoCapture.OutputFileOptions f44306e;

    /* renamed from: f */
    public final /* synthetic */ Executor f44307f;

    /* renamed from: g */
    public final /* synthetic */ VideoCapture.OnVideoSavedCallback f44308g;

    public /* synthetic */ VideoCapture$$a(VideoCapture videoCapture, VideoCapture.OutputFileOptions outputFileOptions, Executor executor, VideoCapture.OnVideoSavedCallback onVideoSavedCallback) {
        this.f44305d = videoCapture;
        this.f44306e = outputFileOptions;
        this.f44307f = executor;
        this.f44308g = onVideoSavedCallback;
    }

    public final void run() {
        this.f44305d.lambda$startRecording$0(this.f44306e, this.f44307f, this.f44308g);
    }
}
