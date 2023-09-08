package p172io.flutter.embedding.engine.renderer;

/* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$$a */
public final /* synthetic */ class FlutterRenderer$$a implements FlutterNextFrameDisplayListener {

    /* renamed from: a */
    public final /* synthetic */ Runnable f351114a;

    public /* synthetic */ FlutterRenderer$$a(Runnable runnable) {
        this.f351114a = runnable;
    }

    public final void onFlutterDisplayNextFrame() {
        this.f351114a.run();
    }
}
