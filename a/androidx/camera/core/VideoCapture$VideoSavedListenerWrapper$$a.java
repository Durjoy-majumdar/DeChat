package androidx.camera.core;

import androidx.camera.core.VideoCapture;

public final /* synthetic */ class VideoCapture$VideoSavedListenerWrapper$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoCapture.VideoSavedListenerWrapper f44323d;

    /* renamed from: e */
    public final /* synthetic */ VideoCapture.OutputFileResults f44324e;

    public /* synthetic */ VideoCapture$VideoSavedListenerWrapper$$a(VideoCapture.VideoSavedListenerWrapper videoSavedListenerWrapper, VideoCapture.OutputFileResults outputFileResults) {
        this.f44323d = videoSavedListenerWrapper;
        this.f44324e = outputFileResults;
    }

    public final void run() {
        this.f44323d.lambda$onVideoSaved$0(this.f44324e);
    }
}
