package p172io.flutter.embedding.engine.renderer;

import p172io.flutter.embedding.android.FlutterView;

/* renamed from: io.flutter.embedding.engine.renderer.SwapRenderSurface */
public interface SwapRenderSurface {
    void attachToFlutterView(FlutterView flutterView);

    void onNextSurfaceUpdate(Runnable runnable);

    void resumeSurface();

    void swapSurface();
}
