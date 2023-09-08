package p172io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import p172io.flutter.embedding.engine.renderer.RenderSurface;

/* renamed from: io.flutter.embedding.android.FlutterSurfaceView */
public class FlutterSurfaceView extends SurfaceView implements RenderSurface {
    private static final int MSG_SURFACE_CHANGED = 2;
    private static final int MSG_SURFACE_CREATED = 1;
    private static final int MSG_SURFACE_DESTROY = 3;
    private static final long SurfaceDestroyDelay = 300;
    private static final String TAG = "FlutterSurfaceView";
    /* access modifiers changed from: private */
    public Handler eventHandler;
    /* access modifiers changed from: private */
    public FlutterRenderer flutterRenderer;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    /* access modifiers changed from: private */
    public boolean isAttachedToFlutterRenderer;
    private boolean isPaused;
    /* access modifiers changed from: private */
    public boolean isSurfaceAvailableForRendering;
    /* access modifiers changed from: private */
    public boolean isSurfaceSwapOut;
    private Runnable nextSurfaceUpdateCallback;
    private final boolean renderTransparently;
    private final SurfaceHolder.Callback surfaceCallback;

    public FlutterSurfaceView(Context context) {
        this(context, (AttributeSet) null, false);
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
        Runnable runnable;
        if (this.flutterRenderer == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        } else if (this.isSurfaceSwapOut) {
            Log.m165288i(TAG, "already swap out this surface, not connect to renderer");
        } else {
            Log.m165288i(TAG, "connectSurfaceToRenderer");
            this.flutterRenderer.startRenderingToSurface(getHolder().getSurface(), this.isPaused);
            if (!this.isSurfaceSwapOut && this.isSurfaceAvailableForRendering && (runnable = this.nextSurfaceUpdateCallback) != null) {
                runnable.run();
                this.nextSurfaceUpdateCallback = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public void disconnectSurfaceFromRenderer() {
        if (this.flutterRenderer != null) {
            Log.m165288i(TAG, "disconnectSurfaceFromRenderer, isSurfaceAvailableForRendering: " + this.isSurfaceAvailableForRendering);
            if (this.isSurfaceSwapOut) {
                Log.m165288i(TAG, "already swap out this surface, ignore disconnect renderer");
            } else {
                this.flutterRenderer.stopRenderingToSurface(getRenderSurface());
            }
        } else {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
    }

    private void init() {
        if (this.renderTransparently) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.surfaceCallback);
        setAlpha(0.0f);
    }

    public void attachToRenderer(FlutterRenderer flutterRenderer2) {
        Log.m165288i(TAG, "Attaching to FlutterRenderer.");
        if (this.flutterRenderer != null) {
            Log.m165288i(TAG, "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.flutterRenderer.stopRenderingToSurface(getRenderSurface());
            this.flutterRenderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        }
        this.flutterRenderer = flutterRenderer2;
        this.isAttachedToFlutterRenderer = true;
        flutterRenderer2.addIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        if (this.isSurfaceAvailableForRendering) {
            Log.m165288i(TAG, "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            connectSurfaceToRenderer();
        }
        this.isPaused = false;
    }

    public void detachFromRenderer() {
        if (this.flutterRenderer != null) {
            if (getWindowToken() != null) {
                Log.m165288i(TAG, "Disconnecting FlutterRenderer from Android surface.");
                disconnectSurfaceFromRenderer();
            }
            setAlpha(0.0f);
            this.flutterRenderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
            this.flutterRenderer = null;
            this.isAttachedToFlutterRenderer = false;
            return;
        }
        Log.m165292w(TAG, "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], (getRight() + i) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    public FlutterRenderer getAttachedRenderer() {
        return this.flutterRenderer;
    }

    public Surface getRenderSurface() {
        return getHolder().getSurface();
    }

    public boolean isAvailableForRendering() {
        return this.isSurfaceAvailableForRendering && getHolder().getSurface() != null;
    }

    public void markSurfaceIsSwapOut(boolean z) {
        Runnable runnable;
        Log.m165288i(TAG, "markSurfaceIsSwapOut:" + z);
        this.isSurfaceSwapOut = z;
        if (!z && this.isSurfaceAvailableForRendering && (runnable = this.nextSurfaceUpdateCallback) != null) {
            runnable.run();
            this.nextSurfaceUpdateCallback = null;
        }
    }

    public void onRenderSurfaceNextUpdate(Runnable runnable) {
        if (this.isSurfaceSwapOut || !this.isSurfaceAvailableForRendering || runnable == null) {
            this.nextSurfaceUpdateCallback = runnable;
        } else {
            Choreographer.getInstance().postFrameCallback(new FlutterSurfaceView$$a(runnable));
        }
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

    public FlutterSurfaceView(Context context, boolean z) {
        this(context, (AttributeSet) null, z);
    }

    public FlutterSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false);
    }

    private FlutterSurfaceView(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isPaused = false;
        this.isAttachedToFlutterRenderer = false;
        this.isSurfaceSwapOut = false;
        this.nextSurfaceUpdateCallback = null;
        this.eventHandler = new Handler(Looper.getMainLooper()) {
            public void handleMessage(Message message) {
                Size size;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && FlutterSurfaceView.this.isAttachedToFlutterRenderer) {
                            Log.m165288i(FlutterSurfaceView.TAG, "start dispatch nativeSurfaceDestroyed");
                            FlutterSurfaceView.this.disconnectSurfaceFromRenderer();
                            Log.m165288i(FlutterSurfaceView.TAG, "end dispatch nativeSurfaceDestroyed");
                        }
                    } else if (FlutterSurfaceView.this.isAttachedToFlutterRenderer && (size = (Size) message.obj) != null) {
                        Log.m165288i(FlutterSurfaceView.TAG, "start dispatch nativeSurfaceChanged");
                        FlutterSurfaceView.this.changeSurfaceSize(size.getWidth(), size.getHeight());
                        Log.m165288i(FlutterSurfaceView.TAG, "end dispatch nativeSurfaceChanged");
                    }
                } else if (FlutterSurfaceView.this.isAttachedToFlutterRenderer) {
                    Log.m165288i(FlutterSurfaceView.TAG, "start dispatch nativeSurfaceCreated");
                    FlutterSurfaceView.this.connectSurfaceToRenderer();
                    Log.m165288i(FlutterSurfaceView.TAG, "finished dispatch nativeSurfaceCreated");
                }
            }
        };
        this.surfaceCallback = new SurfaceHolder.Callback() {
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                Log.m165288i(FlutterSurfaceView.TAG, "SurfaceHolder.Callback.surfaceChanged()");
                Message obtain = Message.obtain();
                obtain.what = 2;
                obtain.obj = new Size(i2, i3);
                FlutterSurfaceView.this.eventHandler.sendMessage(obtain);
            }

            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                Log.m165288i(FlutterSurfaceView.TAG, "SurfaceHolder.Callback.startRenderingToSurface()");
                boolean unused = FlutterSurfaceView.this.isSurfaceAvailableForRendering = true;
                FlutterSurfaceView.this.eventHandler.removeCallbacksAndMessages((Object) null);
                FlutterSurfaceView.this.eventHandler.sendEmptyMessage(1);
            }

            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                Log.m165288i(FlutterSurfaceView.TAG, "SurfaceHolder.Callback.stopRenderingToSurface()");
                boolean unused = FlutterSurfaceView.this.isSurfaceAvailableForRendering = false;
                if (FlutterSurfaceView.this.isAttachedToFlutterRenderer && !FlutterSurfaceView.this.isSurfaceSwapOut) {
                    FlutterSurfaceView.this.disconnectSurfaceFromRenderer();
                }
                Log.m165288i(FlutterSurfaceView.TAG, "surfaceDestroyed remove all msg");
                FlutterSurfaceView.this.eventHandler.removeCallbacksAndMessages((Object) null);
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() {
            public void onFlutterUiDisplayed() {
                Log.m165290v(FlutterSurfaceView.TAG, "onFlutterUiDisplayed()");
                FlutterSurfaceView.this.setAlpha(1.0f);
                if (FlutterSurfaceView.this.flutterRenderer != null) {
                    FlutterSurfaceView.this.flutterRenderer.removeIsDisplayingFlutterUiListener(this);
                }
            }

            public void onFlutterUiNoLongerDisplayed() {
            }
        };
        this.renderTransparently = z;
        init();
    }
}
