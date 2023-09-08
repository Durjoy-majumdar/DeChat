package p172io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicLong;
import p172io.flutter.Log;
import p172io.flutter.embedding.android.AndroidTouchProcessor;
import p172io.flutter.util.ViewUtils;
import p172io.flutter.view.TextureRegistry;

/* renamed from: io.flutter.plugin.platform.PlatformViewWrapper */
class PlatformViewWrapper extends FrameLayout {
    private static final String TAG = "PlatformViewWrapper";
    public ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
    private int bufferHeight;
    private int bufferWidth;
    private int left;
    private final TextureRegistry.OnFrameConsumedListener listener;
    /* access modifiers changed from: private */
    public final AtomicLong pendingFramesCount;
    private int prevLeft;
    private int prevTop;
    private Surface surface;
    private TextureRegistry.SurfaceTextureEntry textureEntry;
    private int top;
    private AndroidTouchProcessor touchProcessor;

    /* renamed from: tx */
    private SurfaceTexture f324801tx;

    public PlatformViewWrapper(Context context) {
        super(context);
        this.pendingFramesCount = new AtomicLong(0);
        this.listener = new TextureRegistry.OnFrameConsumedListener() {
            public void onFrameConsumed() {
                if (Build.VERSION.SDK_INT == 29) {
                    PlatformViewWrapper.this.pendingFramesCount.decrementAndGet();
                }
            }
        };
        setWillNotDraw(false);
    }

    private void onFrameProduced() {
        if (Build.VERSION.SDK_INT == 29) {
            this.pendingFramesCount.incrementAndGet();
        }
    }

    private boolean shouldDrawToSurfaceNow() {
        return Build.VERSION.SDK_INT != 29 || this.pendingFramesCount.get() <= 0;
    }

    public Surface createSurface(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    public void draw(Canvas canvas) {
        Surface surface2 = this.surface;
        if (surface2 == null || !surface2.isValid()) {
            Log.m165286e(TAG, "Invalid surface. The platform view cannot be displayed.");
            return;
        }
        SurfaceTexture surfaceTexture = this.f324801tx;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            Log.m165286e(TAG, "Invalid texture. The platform view cannot be displayed.");
        } else if (!shouldDrawToSurfaceNow()) {
            invalidate();
        } else {
            Canvas lockHardwareCanvas = this.surface.lockHardwareCanvas();
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    lockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
                } else {
                    lockHardwareCanvas.drawColor(0);
                }
                super.draw(lockHardwareCanvas);
                onFrameProduced();
            } finally {
                this.surface.unlockCanvasAndPost(lockHardwareCanvas);
            }
        }
    }

    public int getBufferHeight() {
        return this.bufferHeight;
    }

    public int getBufferWidth() {
        return this.bufferWidth;
    }

    public SurfaceTexture getTexture() {
        return this.f324801tx;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.touchProcessor == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i = this.left;
            this.prevLeft = i;
            int i2 = this.top;
            this.prevTop = i2;
            matrix.postTranslate((float) i, (float) i2);
        } else if (action != 2) {
            matrix.postTranslate((float) this.left, (float) this.top);
        } else {
            matrix.postTranslate((float) this.prevLeft, (float) this.prevTop);
            this.prevLeft = this.left;
            this.prevTop = this.top;
        }
        return this.touchProcessor.onTouchEvent(motionEvent, matrix);
    }

    public void release() {
        this.f324801tx = null;
        Surface surface2 = this.surface;
        if (surface2 != null) {
            surface2.release();
            this.surface = null;
        }
    }

    public void setBufferSize(int i, int i2) {
        this.bufferWidth = i;
        this.bufferHeight = i2;
        SurfaceTexture surfaceTexture = this.f324801tx;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.left = layoutParams.leftMargin;
        this.top = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(final View.OnFocusChangeListener onFocusChangeListener) {
        unsetOnDescendantFocusChangeListener();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.activeFocusListener == null) {
            C1084802 r1 = new ViewTreeObserver.OnGlobalFocusChangeListener() {
                public void onGlobalFocusChanged(View view, View view2) {
                    View.OnFocusChangeListener onFocusChangeListener = onFocusChangeListener;
                    PlatformViewWrapper platformViewWrapper = PlatformViewWrapper.this;
                    onFocusChangeListener.onFocusChange(platformViewWrapper, ViewUtils.childHasFocus(platformViewWrapper));
                }
            };
            this.activeFocusListener = r1;
            viewTreeObserver.addOnGlobalFocusChangeListener(r1);
        }
    }

    public void setTexture(SurfaceTexture surfaceTexture) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            Log.m165286e(TAG, "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.f324801tx = surfaceTexture;
        int i3 = this.bufferWidth;
        if (i3 > 0 && (i = this.bufferHeight) > 0) {
            surfaceTexture.setDefaultBufferSize(i3, i);
        }
        Surface surface2 = this.surface;
        if (surface2 != null) {
            surface2.release();
        }
        Surface createSurface = createSurface(surfaceTexture);
        this.surface = createSurface;
        Canvas lockHardwareCanvas = createSurface.lockHardwareCanvas();
        if (i2 >= 29) {
            try {
                lockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
            } catch (Throwable th) {
                this.surface.unlockCanvasAndPost(lockHardwareCanvas);
                throw th;
            }
        } else {
            lockHardwareCanvas.drawColor(0);
        }
        onFrameProduced();
        this.surface.unlockCanvasAndPost(lockHardwareCanvas);
    }

    public void setTouchProcessor(AndroidTouchProcessor androidTouchProcessor) {
        this.touchProcessor = androidTouchProcessor;
    }

    public void unsetOnDescendantFocusChangeListener() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.activeFocusListener) != null) {
            this.activeFocusListener = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public PlatformViewWrapper(Context context, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        this(context);
        this.textureEntry = surfaceTextureEntry;
        surfaceTextureEntry.setOnFrameConsumedListener(this.listener);
        setTexture(surfaceTextureEntry.surfaceTexture());
    }
}
