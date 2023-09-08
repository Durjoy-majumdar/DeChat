package p172io.flutter.embedding.android;

import android.view.Choreographer;

/* renamed from: io.flutter.embedding.android.FlutterSurfaceView$$a */
public final /* synthetic */ class FlutterSurfaceView$$a implements Choreographer.FrameCallback {

    /* renamed from: d */
    public final /* synthetic */ Runnable f351086d;

    public /* synthetic */ FlutterSurfaceView$$a(Runnable runnable) {
        this.f351086d = runnable;
    }

    public final void doFrame(long j) {
        this.f351086d.run();
    }
}
