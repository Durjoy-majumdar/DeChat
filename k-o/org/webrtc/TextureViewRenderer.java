package org.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.IRenderer;
import org.webrtc.RendererCommon;

public class TextureViewRenderer extends TextureView implements TextureView.SurfaceTextureListener, VideoSink, RendererCommon.RendererEvents, IRenderer {
    private static final String TAG = "SurfaceViewRenderer";
    private final TextureEglRenderer eglRenderer;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();

    public TextureViewRenderer(Context context) {
        super(context);
        String resourceName2 = getResourceName();
        this.resourceName = resourceName2;
        this.eglRenderer = new TextureEglRenderer(resourceName2);
        setSurfaceTextureListener(this);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onFrameResolutionChanged$0(int i, int i2) {
        this.rotatedFrameWidth = i;
        this.rotatedFrameHeight = i2;
        requestLayout();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$requestCaptureOnce$1(IRenderer.OnCaptureListener onCaptureListener) {
        onCaptureListener.onCapture(getBitmap());
    }

    private void logD(String str) {
        Logging.m25022d(TAG, this.resourceName + ": " + str);
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f, glDrawer);
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    public EglRenderer.OnFrameInGLEnv getFrameWithGLCallback() {
        return this.eglRenderer.getFrameWithGLCallback();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2) {
        init(context, rendererEvents2, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    public void onFirstFrameRendered() {
        RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
        if (rendererEvents2 != null) {
            rendererEvents2.onFirstFrameRendered();
        }
    }

    public void onFrame(VideoFrame videoFrame) {
        this.eglRenderer.onFrame(videoFrame);
    }

    public void onFrameResolutionChanged(int i, int i2, int i3) {
        RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
        if (rendererEvents2 != null) {
            rendererEvents2.onFrameResolutionChanged(i, i2, i3);
        }
        int i4 = (i3 == 0 || i3 == 180) ? i : i2;
        if (i3 == 0 || i3 == 180) {
            i = i2;
        }
        postOrRun(new TextureViewRenderer$$b(this, i4, i));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio(((float) (i3 - i)) / ((float) (i4 - i2)));
    }

    public void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        Point measure = this.videoLayoutMeasure.measure(i, i2, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
        logD("onMeasure(). New size: " + measure.x + "x" + measure.y);
    }

    public void onRenderStats(PerformanceStatistics performanceStatistics) {
        RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
        if (rendererEvents2 != null) {
            rendererEvents2.onRenderStats(performanceStatistics);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        this.eglRenderer.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.eglRenderer.onSurfaceTextureDestroyed(surfaceTexture);
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.eglRenderer.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.eglRenderer.onSurfaceTextureUpdated(surfaceTexture);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.eglRenderer.onViewVisibilityChange(i);
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public void release() {
        this.eglRenderer.release();
    }

    public void removeFrameListener(EglRenderer.FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    public void requestCaptureOnce(IRenderer.OnCaptureListener onCaptureListener) {
        post(new TextureViewRenderer$$a(this, onCaptureListener));
    }

    public void setFpsReduction(float f) {
        this.eglRenderer.setFpsReduction(f);
    }

    public void setFrameWithGLCallback(EglRenderer.OnFrameInGLEnv onFrameInGLEnv) {
        this.eglRenderer.setFrameWithGLCallback(onFrameInGLEnv);
    }

    public void setMirror(boolean z) {
        this.eglRenderer.setMirror(z);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f) {
        this.eglRenderer.addFrameListener(frameListener, f);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents2;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    public TextureViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String resourceName2 = getResourceName();
        this.resourceName = resourceName2;
        this.eglRenderer = new TextureEglRenderer(resourceName2);
        setSurfaceTextureListener(this);
    }
}
