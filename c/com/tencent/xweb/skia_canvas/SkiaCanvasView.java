package com.tencent.xweb.skia_canvas;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.Surface;
import com.tencent.xweb.skia_canvas.VSyncRenderer;
import java.util.Objects;

public class SkiaCanvasView implements VSyncRenderer.PresentCallback {
    private static final String TAG = "SkiaCanvasView";
    private final SkiaCanvasApp mApp;
    /* access modifiers changed from: private */
    public boolean mHasSurfaceSwapped;
    /* access modifiers changed from: private */
    public volatile boolean mIsForeground;
    /* access modifiers changed from: private */
    public Surface mSurface;
    /* access modifiers changed from: private */
    public final String mTag;
    /* access modifiers changed from: private */
    public final long mViewID;

    public SkiaCanvasView(SkiaCanvasApp skiaCanvasApp, final Surface surface, String str, long j) {
        toString();
        this.mApp = skiaCanvasApp;
        this.mTag = str;
        this.mViewID = j;
        checkAndPost(new Runnable() {
            public void run() {
                Surface unused = SkiaCanvasView.this.mSurface = surface;
                SkiaCanvasView skiaCanvasView = SkiaCanvasView.this;
                skiaCanvasView.nativeCreateCanvas(skiaCanvasView.mTag, SkiaCanvasView.this.mViewID, surface);
                boolean unused2 = SkiaCanvasView.this.mIsForeground = true;
                VSyncRenderer.getInstance().addPresentCallback(SkiaCanvasView.this);
            }
        });
    }

    private void checkAndPost(Runnable runnable) {
        this.mApp.checkAndPostOnWorkingThread(runnable);
    }

    /* access modifiers changed from: private */
    public native void nativeCreateCanvas(String str, long j, Surface surface);

    private native void nativeDoPresent(long j, boolean z);

    /* access modifiers changed from: private */
    public native void nativeRemoveCanvas(long j);

    private static native void nativeSetSurfaceSize(Surface surface, int i, int i2);

    /* access modifiers changed from: private */
    public native void nativeSwapSurface(long j, Surface surface);

    private native boolean nativeUpdateBitmap(long j, Bitmap bitmap, int i, int i2, int i3, int i4);

    private void notifyTextureSizeChanged(int i, int i2) {
        if (this.mApp.isRunOnWorkingThread()) {
            toString();
            setSurfaceSize(this.mSurface, i, i2);
            return;
        }
        throw new IllegalStateException("notifyTextureSizeChanged must be called on js thread.");
    }

    public static void setSurfaceSize(Surface surface, int i, int i2) {
        nativeSetSurfaceSize(surface, i, i2);
    }

    public static String version() {
        return "d4272ce16a4b408845eb6f5efc14ce55a70824e5/1.0";
    }

    public void doPresent() {
        if (this.mIsForeground) {
            nativeDoPresent(this.mViewID, this.mHasSurfaceSwapped);
            this.mHasSurfaceSwapped = false;
            VSyncRenderer.getInstance().triggerNextVSync();
        }
    }

    public long getId() {
        return this.mViewID;
    }

    public Bitmap getSnapshot(Rect rect) {
        if (this.mApp.isRunOnWorkingThread()) {
            if (rect.width() > 0 && rect.height() > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                if (nativeUpdateBitmap(this.mViewID, createBitmap, rect.left, rect.top, rect.width(), rect.height())) {
                    return createBitmap;
                }
            }
            return null;
        }
        throw new IllegalStateException("getSnapshot must be called on js thread.");
    }

    public void notifyVisibilityChanged(boolean z) {
        if (z != this.mIsForeground) {
            this.mIsForeground = z;
            if (z) {
                checkAndPost(new Runnable() {
                    public void run() {
                        VSyncRenderer.getInstance().triggerNextVSync();
                    }
                });
            }
        }
    }

    public void recycle() {
        checkAndPost(new Runnable() {
            public void run() {
                Objects.toString(SkiaCanvasView.this);
                SkiaCanvasView skiaCanvasView = SkiaCanvasView.this;
                skiaCanvasView.nativeRemoveCanvas(skiaCanvasView.mViewID);
                VSyncRenderer.getInstance().removePresentCallback(SkiaCanvasView.this);
            }
        });
    }

    public void swapSurface(final Surface surface) {
        checkAndPost(new Runnable() {
            public void run() {
                Objects.toString(SkiaCanvasView.this);
                Objects.toString(SkiaCanvasView.this.mSurface);
                Objects.toString(surface);
                if (surface != SkiaCanvasView.this.mSurface) {
                    Surface unused = SkiaCanvasView.this.mSurface = surface;
                    SkiaCanvasView skiaCanvasView = SkiaCanvasView.this;
                    skiaCanvasView.nativeSwapSurface(skiaCanvasView.mViewID, SkiaCanvasView.this.mSurface);
                    boolean unused2 = SkiaCanvasView.this.mHasSurfaceSwapped = true;
                }
            }
        });
    }
}
