package p172io.flutter.embedding.engine.renderer;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.FlutterJNI;
import p172io.flutter.util.ImmediateExecutor;
import p172io.flutter.view.TextureRegistry;

/* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer */
public class FlutterRenderer implements TextureRegistry {
    private static final String TAG = "FlutterRenderer";
    /* access modifiers changed from: private */
    public Executor backgroundExecutor = new ImmediateExecutor();
    private boolean checkSurfaceOnStopOrPause = false;
    /* access modifiers changed from: private */
    public final FlutterJNI flutterJNI;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    /* access modifiers changed from: private */
    public Handler handler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public boolean isDisplayingFlutterUi = false;
    private final AtomicLong nextTextureId = new AtomicLong(0);
    private Surface surface;

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$ViewportMetrics */
    public static final class ViewportMetrics {
        public static final int unsetValue = -1;
        public float devicePixelRatio = 1.0f;
        public List<DisplayFeature> displayFeatures = new ArrayList();
        public int height = 0;
        public int physicalTouchSlop = -1;
        public int systemGestureInsetBottom = 0;
        public int systemGestureInsetLeft = 0;
        public int systemGestureInsetRight = 0;
        public int systemGestureInsetTop = 0;
        public int viewInsetBottom = 0;
        public int viewInsetLeft = 0;
        public int viewInsetRight = 0;
        public int viewInsetTop = 0;
        public int viewPaddingBottom = 0;
        public int viewPaddingLeft = 0;
        public int viewPaddingRight = 0;
        public int viewPaddingTop = 0;
        public int width = 0;

        public boolean validate() {
            return this.width > 0 && this.height > 0 && this.devicePixelRatio > 0.0f;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureState */
    public enum DisplayFeatureState {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        
        public final int encodedValue;

        private DisplayFeatureState(int i) {
            this.encodedValue = i;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureType */
    public enum DisplayFeatureType {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        
        public final int encodedValue;

        private DisplayFeatureType(int i) {
            this.encodedValue = i;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$SurfaceTextureFinalizerRunnable */
    public static final class SurfaceTextureFinalizerRunnable implements Runnable {
        private final FlutterJNI flutterJNI;

        /* renamed from: id */
        private final long f351112id;

        public SurfaceTextureFinalizerRunnable(long j, FlutterJNI flutterJNI2) {
            this.f351112id = j;
            this.flutterJNI = flutterJNI2;
        }

        public void run() {
            if (this.flutterJNI.isAttached()) {
                Log.m165290v(FlutterRenderer.TAG, "Releasing a SurfaceTexture (" + this.f351112id + ").");
                this.flutterJNI.unregisterTexture(this.f351112id);
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$SurfaceTextureRegistryEntry */
    public final class SurfaceTextureRegistryEntry implements TextureRegistry.SurfaceTextureEntry {
        /* access modifiers changed from: private */

        /* renamed from: id */
        public final long f351113id;
        /* access modifiers changed from: private */
        public TextureRegistry.OnFrameConsumedListener listener;
        private final Runnable onFrameConsumed;
        private SurfaceTexture.OnFrameAvailableListener onFrameListener = new SurfaceTexture.OnFrameAvailableListener() {
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!SurfaceTextureRegistryEntry.this.released && FlutterRenderer.this.flutterJNI.isAttached()) {
                    SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = SurfaceTextureRegistryEntry.this;
                    FlutterRenderer.this.markTextureFrameAvailable(surfaceTextureRegistryEntry.f351113id);
                }
            }
        };
        /* access modifiers changed from: private */
        public boolean released;
        /* access modifiers changed from: private */
        public final SurfaceTextureWrapper textureWrapper;

        public SurfaceTextureRegistryEntry(long j, SurfaceTexture surfaceTexture) {
            C1172391 r2 = new Runnable() {
                public void run() {
                    if (SurfaceTextureRegistryEntry.this.listener != null) {
                        SurfaceTextureRegistryEntry.this.listener.onFrameConsumed();
                    }
                }
            };
            this.onFrameConsumed = r2;
            this.f351113id = j;
            this.textureWrapper = new SurfaceTextureWrapper(surfaceTexture, r2);
            surfaceTexture().setOnFrameAvailableListener(this.onFrameListener, new Handler());
        }

        public void finalize() {
            try {
                if (!this.released) {
                    FlutterRenderer.this.handler.post(new SurfaceTextureFinalizerRunnable(this.f351113id, FlutterRenderer.this.flutterJNI));
                    super.finalize();
                }
            } finally {
                super.finalize();
            }
        }

        /* renamed from: id */
        public long mo159349id() {
            return this.f351113id;
        }

        public void release() {
            if (!this.released) {
                Log.m165288i(FlutterRenderer.TAG, "Releasing a SurfaceTexture (" + this.f351113id + ").");
                FlutterRenderer.this.backgroundExecutor.execute(new Runnable() {
                    public void run() {
                        SurfaceTextureRegistryEntry.this.textureWrapper.release();
                    }
                });
                FlutterRenderer.this.unregisterTexture(this.f351113id);
                this.released = true;
            }
        }

        public void setOnFrameConsumedListener(TextureRegistry.OnFrameConsumedListener onFrameConsumedListener) {
            this.listener = onFrameConsumedListener;
        }

        public SurfaceTexture surfaceTexture() {
            return this.textureWrapper.surfaceTexture();
        }

        public SurfaceTextureWrapper textureWrapper() {
            return this.textureWrapper;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI2) {
        C1172381 r0 = new FlutterUiDisplayListener() {
            public void onFlutterUiDisplayed() {
                boolean unused = FlutterRenderer.this.isDisplayingFlutterUi = true;
            }

            public void onFlutterUiNoLongerDisplayed() {
                boolean unused = FlutterRenderer.this.isDisplayingFlutterUi = false;
            }
        };
        this.flutterUiDisplayListener = r0;
        this.flutterJNI = flutterJNI2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            flutterJNI2.addIsDisplayingFlutterUiListener(r0);
        } else {
            flutterJNI2.addIsDisplayingFlutterUiListenerNotInMainThread(r0);
        }
    }

    /* access modifiers changed from: private */
    public void markTextureFrameAvailable(long j) {
        this.flutterJNI.markTextureFrameAvailable(j);
    }

    private void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.flutterJNI.registerTexture(j, surfaceTextureWrapper);
    }

    /* access modifiers changed from: private */
    public void unregisterTexture(long j) {
        this.flutterJNI.unregisterTexture(j);
    }

    public void addIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener2) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener2);
        } else {
            this.flutterJNI.addIsDisplayingFlutterUiListenerNotInMainThread(flutterUiDisplayListener2);
        }
        if (this.isDisplayingFlutterUi) {
            flutterUiDisplayListener2.onFlutterUiDisplayed();
        }
    }

    public void clearNextFrameDisplayedListener() {
        this.flutterJNI.clearDisplayNextFrameListener();
    }

    public TextureRegistry.SurfaceTextureEntry createSurfaceTexture() {
        Log.m165290v(TAG, "Creating a SurfaceTexture.");
        return registerSurfaceTexture(new SurfaceTexture(0));
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i) {
        this.flutterJNI.dispatchPointerDataPacket(byteBuffer, i);
    }

    public void dispatchSemanticsAction(int i, int i2, ByteBuffer byteBuffer, int i3) {
        this.flutterJNI.dispatchSemanticsAction(i, i2, byteBuffer, i3);
    }

    public Bitmap getBitmap() {
        return this.flutterJNI.getBitmap();
    }

    public boolean getCheckSurfaceOnStopOrPause() {
        return this.checkSurfaceOnStopOrPause;
    }

    public boolean isDisplayingFlutterUi() {
        return this.isDisplayingFlutterUi;
    }

    public boolean isSoftwareRenderingEnabled() {
        return this.flutterJNI.getIsSoftwareRenderingEnabled();
    }

    public void onNextFrameDisplayed(Runnable runnable) {
        FlutterJNI flutterJNI2 = this.flutterJNI;
        Objects.requireNonNull(runnable);
        flutterJNI2.addDisplayNextFrameListener(new FlutterRenderer$$a(runnable));
    }

    public void pauseRenderingToSurface() {
        pauseRenderingToSurface((Surface) null);
    }

    public void pauseScheduleFrame() {
        this.flutterJNI.pauseScheduleFrame();
    }

    public TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new SurfaceTextureRegistryEntry(this.nextTextureId.getAndIncrement(), surfaceTexture);
        Log.m165288i(TAG, "New SurfaceTexture ID: " + surfaceTextureRegistryEntry.mo159349id() + ", " + surfaceTexture);
        registerTexture(surfaceTextureRegistryEntry.mo159349id(), surfaceTextureRegistryEntry.textureWrapper());
        return surfaceTextureRegistryEntry;
    }

    public void removeIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener2) {
        this.flutterJNI.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener2);
    }

    public void requestDrawLastFrame() {
        this.flutterJNI.requestDrawLastFrame();
    }

    public void resumeScheduleFrame() {
        this.flutterJNI.resumeScheduleFrame();
    }

    public void setAccessibilityFeatures(int i) {
        this.flutterJNI.setAccessibilityFeatures(i);
    }

    public void setBackgroundExecutor(Executor executor) {
        this.backgroundExecutor = executor;
    }

    public void setCheckSurfaceOnStopOrPause(boolean z) {
        Log.m165288i(TAG, "setCheckSurfaceOnStopOrPause: " + z);
        this.checkSurfaceOnStopOrPause = z;
    }

    public void setSemanticsEnabled(boolean z) {
        this.flutterJNI.setSemanticsEnabled(z);
    }

    public void setViewportMetrics(ViewportMetrics viewportMetrics) {
        ViewportMetrics viewportMetrics2 = viewportMetrics;
        if (viewportMetrics.validate()) {
            Log.m165290v(TAG, "Setting viewport metrics\nSize: " + viewportMetrics2.width + " x " + viewportMetrics2.height + "\nPadding - L: " + viewportMetrics2.viewPaddingLeft + ", T: " + viewportMetrics2.viewPaddingTop + ", R: " + viewportMetrics2.viewPaddingRight + ", B: " + viewportMetrics2.viewPaddingBottom + "\nInsets - L: " + viewportMetrics2.viewInsetLeft + ", T: " + viewportMetrics2.viewInsetTop + ", R: " + viewportMetrics2.viewInsetRight + ", B: " + viewportMetrics2.viewInsetBottom + "\nSystem Gesture Insets - L: " + viewportMetrics2.systemGestureInsetLeft + ", T: " + viewportMetrics2.systemGestureInsetTop + ", R: " + viewportMetrics2.systemGestureInsetRight + ", B: " + viewportMetrics2.systemGestureInsetRight + "\nDisplay Features: " + viewportMetrics2.displayFeatures.size());
            int[] iArr = new int[(viewportMetrics2.displayFeatures.size() * 4)];
            int[] iArr2 = new int[viewportMetrics2.displayFeatures.size()];
            int[] iArr3 = new int[viewportMetrics2.displayFeatures.size()];
            for (int i = 0; i < viewportMetrics2.displayFeatures.size(); i++) {
                DisplayFeature displayFeature = viewportMetrics2.displayFeatures.get(i);
                int i2 = i * 4;
                Rect rect = displayFeature.bounds;
                iArr[i2] = rect.left;
                iArr[i2 + 1] = rect.top;
                iArr[i2 + 2] = rect.right;
                iArr[i2 + 3] = rect.bottom;
                iArr2[i] = displayFeature.type.encodedValue;
                iArr3[i] = displayFeature.state.encodedValue;
            }
            int[] iArr4 = iArr3;
            FlutterJNI flutterJNI2 = this.flutterJNI;
            flutterJNI2.setViewportMetrics(viewportMetrics2.devicePixelRatio, viewportMetrics2.width, viewportMetrics2.height, viewportMetrics2.viewPaddingTop, viewportMetrics2.viewPaddingRight, viewportMetrics2.viewPaddingBottom, viewportMetrics2.viewPaddingLeft, viewportMetrics2.viewInsetTop, viewportMetrics2.viewInsetRight, viewportMetrics2.viewInsetBottom, viewportMetrics2.viewInsetLeft, viewportMetrics2.systemGestureInsetTop, viewportMetrics2.systemGestureInsetRight, viewportMetrics2.systemGestureInsetBottom, viewportMetrics2.systemGestureInsetLeft, viewportMetrics2.physicalTouchSlop, iArr, iArr2, iArr4);
        }
    }

    public void startRenderingToSurface(Surface surface2, boolean z) {
        Log.m165288i(TAG, "startRendering to surface, keepCurrentSurface:" + z);
        Surface surface3 = this.surface;
        if (surface3 != null && !z) {
            stopRenderingToSurface(surface3);
        }
        this.surface = surface2;
        this.flutterJNI.onSurfaceCreated(surface2);
    }

    public void stopRenderingToSurface() {
        stopRenderingToSurface((Surface) null);
    }

    public void surfaceChanged(int i, int i2) {
        Log.m165288i(TAG, "surfaceChange: " + i + "," + i2 + ", surface: " + this.surface);
        if (this.surface == null) {
            Log.m165286e(TAG, "not attach a surface when surfaceChanged call");
        } else {
            this.flutterJNI.onSurfaceChanged(i, i2);
        }
    }

    public void swapSurface(Surface surface2) {
        this.surface = surface2;
        this.flutterJNI.onSurfaceWindowChanged(surface2);
    }

    public void pauseRenderingToSurface(Surface surface2) {
        Log.m165288i(TAG, "pauseRenderingToSurface: " + surface2);
        if (!this.checkSurfaceOnStopOrPause || surface2 == null || this.surface == surface2) {
            this.flutterJNI.clearCurrentRenderSurface();
            this.surface = null;
            return;
        }
        Log.m165288i(TAG, "surface  " + this.surface + " != targetSurface " + surface2 + ", do not pauseRenderingToSurface");
    }

    public void stopRenderingToSurface(Surface surface2) {
        Log.m165288i(TAG, "stopRenderingToSurface " + surface2);
        if (!this.checkSurfaceOnStopOrPause || surface2 == null || this.surface == surface2) {
            this.flutterJNI.onSurfaceDestroyed();
            this.surface = null;
            if (this.isDisplayingFlutterUi) {
                this.flutterUiDisplayListener.onFlutterUiNoLongerDisplayed();
            }
            this.isDisplayingFlutterUi = false;
            return;
        }
        Log.m165288i(TAG, "surface  " + this.surface + " != targetSurface " + surface2 + ", do not stopRenderingToSurface");
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeature */
    public static final class DisplayFeature {
        public final Rect bounds;
        public final DisplayFeatureState state;
        public final DisplayFeatureType type;

        public DisplayFeature(Rect rect, DisplayFeatureType displayFeatureType, DisplayFeatureState displayFeatureState) {
            this.bounds = rect;
            this.type = displayFeatureType;
            this.state = displayFeatureState;
        }

        public DisplayFeature(Rect rect, DisplayFeatureType displayFeatureType) {
            this.bounds = rect;
            this.type = displayFeatureType;
            this.state = DisplayFeatureState.UNKNOWN;
        }
    }
}
