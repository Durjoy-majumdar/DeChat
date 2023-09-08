package p172io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import p172io.flutter.embedding.engine.renderer.SwapRenderSurface;

/* renamed from: io.flutter.embedding.android.SwapTextureViewRenderSurface */
public class SwapTextureViewRenderSurface extends TextureView implements SwapRenderSurface, TextureView.SurfaceTextureListener {
    private static final String TAG = "SwapTextureViewRenderSurface";
    private SwapSurfaceController controller;
    private Runnable nextSurfaceUpdateCallback = null;
    private Surface textureSurface;

    public SwapTextureViewRenderSurface(Context context) {
        super(context);
    }

    public void attachToFlutterView(FlutterView flutterView) {
        this.controller = new SwapSurfaceController(flutterView, this);
        flutterView.addView(this, new ViewGroup.LayoutParams(1, 1));
        setSurfaceTextureListener(this);
    }

    public void onNextSurfaceUpdate(Runnable runnable) {
        this.nextSurfaceUpdateCallback = runnable;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        this.textureSurface = surface;
        this.controller.surfaceAvailable(surface);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.controller.surfaceDestroyed();
        this.textureSurface.release();
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.controller.surfaceSizeChanged(i, i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Runnable runnable = this.nextSurfaceUpdateCallback;
        if (runnable != null) {
            runnable.run();
            this.nextSurfaceUpdateCallback = null;
        }
    }

    public void resumeSurface() {
        this.controller.resumeSurface();
    }

    public void swapSurface() {
        this.controller.swapSurface();
    }

    public SwapTextureViewRenderSurface(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwapTextureViewRenderSurface(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
