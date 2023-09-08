package p172io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.embedding.engine.renderer.RenderSurface;

/* renamed from: io.flutter.embedding.android.FlutterTextureView */
public class FlutterTextureView extends TextureView implements RenderSurface {
    private static final String TAG = "FlutterTextureView";
    private FlutterRenderer flutterRenderer;
    /* access modifiers changed from: private */
    public boolean isAttachedToFlutterRenderer;
    private boolean isPaused;
    /* access modifiers changed from: private */
    public boolean isSurfaceAvailableForRendering;
    /* access modifiers changed from: private */
    public boolean isSurfaceSwapOut;
    /* access modifiers changed from: private */
    public Runnable nextTextureUpdateCallback;
    /* access modifiers changed from: private */
    public Surface renderSurface;
    private final TextureView.SurfaceTextureListener surfaceTextureListener;

    public FlutterTextureView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void changeSurfaceSize(int i, int i2) {
        if (this.flutterRenderer == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        } else if (this.isSurfaceSwapOut) {
            Log.m165288i(TAG, "already swap out this surface, ignore change surface size");
        } else {
            Log.m165288i(TAG, "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
            this.flutterRenderer.surfaceChanged(i, i2);
        }
    }

    /* access modifiers changed from: private */
    public void connectSurfaceToRenderer() {
        if (this.flutterRenderer == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        } else if (this.isSurfaceSwapOut) {
            Log.m165288i(TAG, "already swap out this surface, not connect to renderer");
        } else {
            Surface surface = this.renderSurface;
            if (surface != null) {
                surface.release();
                this.renderSurface = null;
            }
            Surface surface2 = new Surface(getSurfaceTexture());
            this.renderSurface = surface2;
            this.flutterRenderer.startRenderingToSurface(surface2, this.isPaused);
            this.isPaused = false;
        }
    }

    /* access modifiers changed from: private */
    public void disconnectSurfaceFromRenderer() {
        FlutterRenderer flutterRenderer2 = this.flutterRenderer;
        if (flutterRenderer2 == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        } else if (this.isSurfaceSwapOut) {
            Log.m165288i(TAG, "already swap out this surface, ignore disconnect renderer");
        } else {
            flutterRenderer2.stopRenderingToSurface(getRenderSurface());
            Surface surface = this.renderSurface;
            if (surface != null) {
                surface.release();
                this.renderSurface = null;
            }
        }
    }

    private void init() {
        setSurfaceTextureListener(this.surfaceTextureListener);
    }

    public void attachToRenderer(FlutterRenderer flutterRenderer2) {
        Log.m165288i(TAG, "Attaching to FlutterRenderer.");
        if (this.flutterRenderer != null) {
            Log.m165288i(TAG, "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.flutterRenderer.stopRenderingToSurface(getRenderSurface());
        }
        this.flutterRenderer = flutterRenderer2;
        this.isAttachedToFlutterRenderer = true;
        if (this.isSurfaceAvailableForRendering) {
            Log.m165288i(TAG, "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            connectSurfaceToRenderer();
        }
    }

    public void detachFromRenderer() {
        if (this.flutterRenderer != null) {
            if (getWindowToken() != null) {
                Log.m165288i(TAG, "Disconnecting FlutterRenderer from Android surface.");
                disconnectSurfaceFromRenderer();
            }
            this.flutterRenderer = null;
            this.isAttachedToFlutterRenderer = false;
            return;
        }
        Log.m165292w(TAG, "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public FlutterRenderer getAttachedRenderer() {
        return this.flutterRenderer;
    }

    public Surface getRenderSurface() {
        return this.renderSurface;
    }

    public boolean isAvailableForRendering() {
        return this.isSurfaceAvailableForRendering && this.renderSurface != null;
    }

    public void markSurfaceIsSwapOut(boolean z) {
        Log.m165288i(TAG, "markSurfaceIsSwapOut:" + z);
        this.isSurfaceSwapOut = z;
        if (z) {
            this.nextTextureUpdateCallback = null;
        }
    }

    public void onRenderSurfaceNextUpdate(Runnable runnable) {
        this.nextTextureUpdateCallback = runnable;
    }

    public void pause() {
        if (this.flutterRenderer != null) {
            this.flutterRenderer = null;
            this.isPaused = true;
            this.isAttachedToFlutterRenderer = false;
            return;
        }
        Log.m165292w(TAG, "pause() invoked when no FlutterRenderer was attached.");
    }

    public void setRenderSurface(Surface surface) {
        this.renderSurface = surface;
    }

    public FlutterTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isAttachedToFlutterRenderer = false;
        this.isPaused = false;
        this.isSurfaceSwapOut = false;
        this.nextTextureUpdateCallback = null;
        this.surfaceTextureListener = new TextureView.SurfaceTextureListener() {
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                Log.m165288i(FlutterTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureAvailable()");
                boolean unused = FlutterTextureView.this.isSurfaceAvailableForRendering = true;
                if (FlutterTextureView.this.isAttachedToFlutterRenderer) {
                    FlutterTextureView.this.connectSurfaceToRenderer();
                }
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                Log.m165288i(FlutterTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureDestroyed()");
                boolean unused = FlutterTextureView.this.isSurfaceAvailableForRendering = false;
                if (FlutterTextureView.this.isAttachedToFlutterRenderer) {
                    FlutterTextureView.this.disconnectSurfaceFromRenderer();
                }
                if (FlutterTextureView.this.renderSurface == null) {
                    return true;
                }
                FlutterTextureView.this.renderSurface.release();
                Surface unused2 = FlutterTextureView.this.renderSurface = null;
                return true;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                Log.m165288i(FlutterTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
                if (FlutterTextureView.this.isAttachedToFlutterRenderer) {
                    FlutterTextureView.this.changeSurfaceSize(i, i2);
                }
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (!FlutterTextureView.this.isSurfaceSwapOut && FlutterTextureView.this.nextTextureUpdateCallback != null) {
                    FlutterTextureView.this.nextTextureUpdateCallback.run();
                    Runnable unused = FlutterTextureView.this.nextTextureUpdateCallback = null;
                }
            }
        };
        init();
    }
}
