package androidx.camera.core;

import androidx.camera.core.VideoCapture;

public final /* synthetic */ class VideoCapture$VideoSavedListenerWrapper$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoCapture.VideoSavedListenerWrapper f44325d;

    /* renamed from: e */
    public final /* synthetic */ int f44326e;

    /* renamed from: f */
    public final /* synthetic */ String f44327f;

    /* renamed from: g */
    public final /* synthetic */ Throwable f44328g;

    public /* synthetic */ VideoCapture$VideoSavedListenerWrapper$$b(VideoCapture.VideoSavedListenerWrapper videoSavedListenerWrapper, int i, String str, Throwable th) {
        this.f44325d = videoSavedListenerWrapper;
        this.f44326e = i;
        this.f44327f = str;
        this.f44328g = th;
    }

    public final void run() {
        this.f44325d.lambda$onError$1(this.f44326e, this.f44327f, this.f44328g);
    }
}
