package com.tencent.liteav.videobase.videobase;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;

@JNINamespace("liteav::video")
public class DisplayTarget {
    private byte _hellAccFlag_;
    private int mHeight;
    private Surface mSurface;
    private WeakReference<SurfaceView> mSurfaceView;
    private C17252a mTargetType;
    private WeakReference<TextureView> mTextureView;
    private WeakReference<TXCloudVideoView> mTxCloudVideoView;
    private final C17111b mUIHandler;
    private int mWidth;

    /* renamed from: com.tencent.liteav.videobase.videobase.DisplayTarget$a */
    public enum C17252a {
        TEXTUREVIEW,
        SURFACEVIEW,
        SURFACE,
        TXCLOUDVIEW
    }

    public DisplayTarget(TXCloudVideoView tXCloudVideoView) {
        this.mUIHandler = new C17111b(Looper.getMainLooper());
        this.mTxCloudVideoView = new WeakReference<>(tXCloudVideoView);
        this.mTargetType = C17252a.TXCLOUDVIEW;
    }

    private void addVideoView() {
        runOnUIThread(C17255c.m17147a(this));
    }

    public static DisplayTarget createDisplayTarget(TXCloudVideoView tXCloudVideoView) {
        return new DisplayTarget(tXCloudVideoView);
    }

    public static /* synthetic */ void lambda$addVideoView$1(DisplayTarget displayTarget) {
        TXCloudVideoView tXCloudVideoView;
        if (displayTarget.getType() == C17252a.TXCLOUDVIEW && (tXCloudVideoView = displayTarget.getTXCloudVideoView()) != null && tXCloudVideoView.getVideoView() == null) {
            tXCloudVideoView.addVideoView(new TextureView(tXCloudVideoView.getContext()));
        }
    }

    public static /* synthetic */ void lambda$removeVideoView$2(DisplayTarget displayTarget) {
        TXCloudVideoView tXCloudVideoView;
        if (displayTarget.getType() == C17252a.TXCLOUDVIEW && (tXCloudVideoView = displayTarget.getTXCloudVideoView()) != null) {
            tXCloudVideoView.removeVideoView();
        }
    }

    public static void lambda$setVisibility$0(View view, int i) {
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/liteav/videobase/videobase/DisplayTarget", "lambda$setVisibility$0", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/liteav/videobase/videobase/DisplayTarget", "lambda$setVisibility$0", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    private void removeVideoView() {
        runOnUIThread(C17256d.m17148a(this));
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.myLooper() == this.mUIHandler.getLooper()) {
            runnable.run();
        } else {
            this.mUIHandler.post(runnable);
        }
    }

    private void setVisibility(View view, int i) {
        if (view != null) {
            runOnUIThread(C17254b.m17146a(view, i));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DisplayTarget displayTarget = (DisplayTarget) obj;
            return this.mWidth == displayTarget.mWidth && this.mHeight == displayTarget.mHeight && this.mTargetType == displayTarget.mTargetType && CommonUtil.equals(getTXCloudVideoView(), displayTarget.getTXCloudVideoView()) && CommonUtil.equals(getTextureView(), displayTarget.getTextureView()) && CommonUtil.equals(getSurfaceView(), displayTarget.getSurfaceView()) && CommonUtil.equals(this.mSurface, displayTarget.mSurface);
        }
    }

    public int getHeight() {
        return this.mHeight;
    }

    public C104507p getSize() {
        int i;
        WeakReference<TXCloudVideoView> weakReference;
        WeakReference<TextureView> weakReference2;
        WeakReference<SurfaceView> weakReference3;
        C17252a aVar = this.mTargetType;
        int i2 = 0;
        if (aVar == C17252a.SURFACE) {
            i2 = this.mWidth;
            i = this.mHeight;
        } else {
            View view = null;
            if (aVar == C17252a.SURFACEVIEW && (weakReference3 = this.mSurfaceView) != null) {
                view = weakReference3.get();
            } else if (aVar == C17252a.TEXTUREVIEW && (weakReference2 = this.mTextureView) != null) {
                view = weakReference2.get();
            } else if (aVar == C17252a.TXCLOUDVIEW && (weakReference = this.mTxCloudVideoView) != null) {
                view = weakReference.get();
            }
            if (view != null) {
                i2 = view.getWidth();
                i = view.getHeight();
            } else {
                i = 0;
            }
        }
        return new C104507p(i2, i);
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public SurfaceView getSurfaceView() {
        WeakReference<SurfaceView> weakReference = this.mSurfaceView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public TXCloudVideoView getTXCloudVideoView() {
        WeakReference<TXCloudVideoView> weakReference = this.mTxCloudVideoView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public TextureView getTextureView() {
        WeakReference<TextureView> weakReference = this.mTextureView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public C17252a getType() {
        return this.mTargetType;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void hideAll() {
        setVisibility(getTextureView(), 8);
        setVisibility(getSurfaceView(), 8);
        setVisibility(getTXCloudVideoView(), 8);
        removeVideoView();
    }

    public void setSurfaceView(SurfaceView surfaceView) {
        this.mSurfaceView = new WeakReference<>(surfaceView);
        this.mTargetType = C17252a.SURFACEVIEW;
    }

    public void setTextureView(TextureView textureView) {
        this.mTextureView = new WeakReference<>(textureView);
        this.mTargetType = C17252a.TEXTUREVIEW;
    }

    public void showAll() {
        addVideoView();
        setVisibility(getTextureView(), 0);
        setVisibility(getSurfaceView(), 0);
        setVisibility(getTXCloudVideoView(), 0);
    }

    public String toString() {
        return "DisplayTarget{mTargetType=" + this.mTargetType + ", mTXCloudVideoView=" + getTXCloudVideoView() + ", mTextureView=" + getTextureView() + ", mSurfaceView=" + getSurfaceView() + ", mSurface=" + this.mSurface + ", mWidth=" + this.mWidth + ", mHeight=" + this.mHeight + '}';
    }

    public DisplayTarget(TextureView textureView) {
        this.mUIHandler = new C17111b(Looper.getMainLooper());
        this.mTargetType = C17252a.TEXTUREVIEW;
        this.mTextureView = new WeakReference<>(textureView);
    }

    public DisplayTarget(SurfaceView surfaceView) {
        this.mUIHandler = new C17111b(Looper.getMainLooper());
        this.mTargetType = C17252a.SURFACEVIEW;
        this.mSurfaceView = new WeakReference<>(surfaceView);
    }

    public DisplayTarget(Surface surface, int i, int i2) {
        this.mUIHandler = new C17111b(Looper.getMainLooper());
        this.mSurface = surface;
        this.mWidth = i;
        this.mHeight = i2;
        this.mTargetType = C17252a.SURFACE;
    }

    public DisplayTarget(DisplayTarget displayTarget) {
        this.mUIHandler = new C17111b(Looper.getMainLooper());
        this.mSurface = displayTarget.mSurface;
        this.mWidth = displayTarget.mWidth;
        this.mHeight = displayTarget.mHeight;
        this.mTargetType = displayTarget.mTargetType;
        this.mTextureView = displayTarget.mTextureView;
        this.mSurfaceView = displayTarget.mSurfaceView;
        this.mTxCloudVideoView = displayTarget.mTxCloudVideoView;
    }
}
