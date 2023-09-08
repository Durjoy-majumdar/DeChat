package p172io.flutter.embedding.engine.renderer;

import android.view.Surface;

/* renamed from: io.flutter.embedding.engine.renderer.RenderSurface */
public interface RenderSurface {
    void attachToRenderer(FlutterRenderer flutterRenderer);

    void detachFromRenderer();

    FlutterRenderer getAttachedRenderer();

    Surface getRenderSurface();

    boolean isAvailableForRendering();

    void markSurfaceIsSwapOut(boolean z);

    void onRenderSurfaceNextUpdate(Runnable runnable);

    void pause();
}
