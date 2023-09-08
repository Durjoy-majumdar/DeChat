package androidx.camera.core;

import androidx.camera.core.VideoCapture;

public final /* synthetic */ class VideoCapture$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoCapture f44311d;

    /* renamed from: e */
    public final /* synthetic */ VideoCapture.OnVideoSavedCallback f44312e;

    public /* synthetic */ VideoCapture$$d(VideoCapture videoCapture, VideoCapture.OnVideoSavedCallback onVideoSavedCallback) {
        this.f44311d = videoCapture;
        this.f44312e = onVideoSavedCallback;
    }

    public final void run() {
        this.f44311d.lambda$startRecording$3(this.f44312e);
    }
}
