package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;

public abstract class EglRenderer implements VideoSink {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private final GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final PerformanceStatistics currentStats;
    private final PerformanceInspector detailedPerformanceInspector;
    private final Matrix drawMatrix;
    private RendererCommon.GlDrawer drawer;
    /* access modifiers changed from: private */
    public EglBase eglBase;
    private final EglSurfaceCreation eglSurfaceCreationRunnable;
    private volatile ErrorCallback errorCallback;
    private final Object fpsReductionLock;
    private final VideoFrameDrawer frameDrawer;
    private final ArrayList<FrameListenerAndParams> frameListeners;
    private final Object frameLock;
    /* access modifiers changed from: private */
    public final Object handlerLock;
    private float layoutAspectRatio;
    private final Object layoutLock;
    /* access modifiers changed from: private */
    public final Runnable logStatisticsRunnable;
    private OnFrameInGLEnv mFrameWithGLCallback;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    public final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    /* access modifiers changed from: private */
    public Handler renderThreadHandler;
    private boolean usePresentationTimeStamp;

    public interface ErrorCallback {
        void onGlOutOfMemory();
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    public interface OnFrameInGLEnv {
        boolean doOnDrawFrameWithEGL(EglBase eglBase, VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, VideoFrameDrawer videoFrameDrawer, Matrix matrix);
    }

    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        private EglSurfaceCreation() {
        }

        public synchronized void run() {
            if (!(this.surface == null || EglRenderer.this.eglBase == null || EglRenderer.this.eglBase.hasSurface())) {
                Object obj = this.surface;
                if (obj instanceof Surface) {
                    EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                } else if (obj instanceof SurfaceTexture) {
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                } else {
                    throw new IllegalStateException("Invalid surface: " + this.surface);
                }
                EglRenderer.this.eglBase.makeCurrent();
                GLES20.glPixelStorei(3317, 1);
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }
    }

    public static class HandlerWithExceptionCallback extends Handler {
        private final Runnable exceptionCallback;

        public HandlerWithExceptionCallback(Looper looper, Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }

        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e) {
                Logging.m25024e(EglRenderer.TAG, "Exception on EglRenderer thread", e);
                this.exceptionCallback.run();
                throw e;
            }
        }
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }

    /* access modifiers changed from: private */
    /* renamed from: clearSurfaceOnRenderThread */
    public void lambda$clearImage$6(float f, float f2, float f3, float f4) {
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 != null && eglBase2.hasSurface()) {
            logD("clearSurface");
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(16384);
            this.eglBase.swapBuffers();
        }
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addFrameListener$3(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(EglBase.Context context, int[] iArr) {
        if (context == null) {
            logD("EglBase10.create context");
            this.eglBase = EglBase.EglBaseStatic.createEgl10(iArr);
            return;
        }
        logD("EglBase.create shared context");
        this.eglBase = EglBase.EglBaseStatic.create(context, iArr);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$release$1(CountDownLatch countDownLatch) {
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(0);
        }
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2(Looper looper) {
        logD("Quitting render thread.");
        looper.quit();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseEglSurface$5(Runnable runnable) {
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 != null) {
            eglBase2.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$removeFrameListener$4(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    private void logD(String str) {
        Logging.m25022d(TAG, this.name + str);
    }

    private void logE(String str, Throwable th) {
        Logging.m25024e(TAG, this.name + str, th);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ec, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void logStatistics() {
        /*
            r15 = this;
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "#.0"
            r0.<init>(r1)
            long r1 = java.lang.System.nanoTime()
            org.webrtc.PerformanceStatistics r3 = r15.currentStats
            monitor-enter(r3)
            org.webrtc.PerformanceStatistics r4 = r15.currentStats     // Catch:{ all -> 0x00ed }
            long r5 = r4.statisticsStartTimeNs     // Catch:{ all -> 0x00ed }
            long r5 = r1 - r5
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00eb
            long r9 = r15.minRenderPeriodNs     // Catch:{ all -> 0x00ed }
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x002b
            int r9 = r4.framesReceived     // Catch:{ all -> 0x00ed }
            if (r9 != 0) goto L_0x002b
            goto L_0x00eb
        L_0x002b:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x00ed }
            long r10 = r9.toMillis(r5)     // Catch:{ all -> 0x00ed }
            r4.duration = r10     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r4 = r15.currentStats     // Catch:{ all -> 0x00ed }
            int r10 = r4.framesRendered     // Catch:{ all -> 0x00ed }
            long r10 = (long) r10     // Catch:{ all -> 0x00ed }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00ed }
            r13 = 1
            long r12 = r12.toNanos(r13)     // Catch:{ all -> 0x00ed }
            long r10 = r10 * r12
            float r10 = (float) r10     // Catch:{ all -> 0x00ed }
            float r5 = (float) r5     // Catch:{ all -> 0x00ed }
            float r10 = r10 / r5
            double r5 = (double) r10     // Catch:{ all -> 0x00ed }
            r4.renderFps = r5     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r4 = r15.currentStats     // Catch:{ all -> 0x00ed }
            int r5 = r4.framesRendered     // Catch:{ all -> 0x00ed }
            if (r5 <= 0) goto L_0x0057
            long r10 = r4.renderTimeNs     // Catch:{ all -> 0x00ed }
            long r5 = (long) r5     // Catch:{ all -> 0x00ed }
            long r10 = r10 / r5
            long r5 = r9.toMicros(r10)     // Catch:{ all -> 0x00ed }
            goto L_0x0058
        L_0x0057:
            r5 = r7
        L_0x0058:
            r4.averageRenderTime = r5     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r4 = r15.currentStats     // Catch:{ all -> 0x00ed }
            int r5 = r4.framesRendered     // Catch:{ all -> 0x00ed }
            if (r5 <= 0) goto L_0x0068
            long r6 = r4.renderSwapBufferTimeNs     // Catch:{ all -> 0x00ed }
            long r10 = (long) r5     // Catch:{ all -> 0x00ed }
            long r6 = r6 / r10
            long r7 = r9.toMicros(r6)     // Catch:{ all -> 0x00ed }
        L_0x0068:
            r4.averageSwapBufferTime = r7     // Catch:{ all -> 0x00ed }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r4.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = "Duration: "
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r5 = r15.currentStats     // Catch:{ all -> 0x00ed }
            long r5 = r5.duration     // Catch:{ all -> 0x00ed }
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = " ms. Frames received: "
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r5 = r15.currentStats     // Catch:{ all -> 0x00ed }
            int r5 = r5.framesReceived     // Catch:{ all -> 0x00ed }
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = ". Dropped: "
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r5 = r15.currentStats     // Catch:{ all -> 0x00ed }
            int r5 = r5.framesDropped     // Catch:{ all -> 0x00ed }
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = ". Rendered: "
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r5 = r15.currentStats     // Catch:{ all -> 0x00ed }
            int r5 = r5.framesRendered     // Catch:{ all -> 0x00ed }
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = ". Render fps: "
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r5 = r15.currentStats     // Catch:{ all -> 0x00ed }
            double r5 = r5.renderFps     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r0.format(r5)     // Catch:{ all -> 0x00ed }
            r4.append(r0)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = ". Average render time: "
            r4.append(r0)     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r0 = r15.currentStats     // Catch:{ all -> 0x00ed }
            long r5 = r0.averageRenderTime     // Catch:{ all -> 0x00ed }
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = " us. Average swapBuffer time: "
            r4.append(r0)     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r0 = r15.currentStats     // Catch:{ all -> 0x00ed }
            long r5 = r0.averageSwapBufferTime     // Catch:{ all -> 0x00ed }
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = " us."
            r4.append(r0)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00ed }
            r15.logD(r0)     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceInspector r0 = r15.detailedPerformanceInspector     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r4 = r15.currentStats     // Catch:{ all -> 0x00ed }
            r0.flush(r4)     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r0 = new org.webrtc.PerformanceStatistics     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r4 = r15.currentStats     // Catch:{ all -> 0x00ed }
            r0.<init>(r4)     // Catch:{ all -> 0x00ed }
            r15.onRenderStats(r0)     // Catch:{ all -> 0x00ed }
            org.webrtc.PerformanceStatistics r0 = r15.currentStats     // Catch:{ all -> 0x00ed }
            r0.resetStatistics(r1)     // Catch:{ all -> 0x00ed }
            monitor-exit(r3)     // Catch:{ all -> 0x00ed }
            return
        L_0x00eb:
            monitor-exit(r3)     // Catch:{ all -> 0x00ed }
            return
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ed }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.logStatistics():void");
    }

    private void logW(String str) {
        Logging.m25026w(TAG, this.name + str);
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        if (!this.frameListeners.isEmpty()) {
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
            this.drawMatrix.preScale(1.0f, -1.0f);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
            while (it.hasNext()) {
                FrameListenerAndParams next = it.next();
                if (z || !next.applyFpsReduction) {
                    it.remove();
                    int rotatedWidth = (int) (next.scale * ((float) videoFrame.getRotatedWidth()));
                    int rotatedHeight = (int) (next.scale * ((float) videoFrame.getRotatedHeight()));
                    if (rotatedWidth == 0 || rotatedHeight == 0) {
                        next.listener.onFrame((Bitmap) null);
                    } else {
                        this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                        GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        GLES20.glClear(16384);
                        this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                        GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                        GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, allocateDirect);
                        GLES20.glBindFramebuffer(36160, 0);
                        GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                        Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(allocateDirect);
                        next.listener.onFrame(createBitmap);
                    }
                }
            }
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        if (r0 == null) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        if (r0.hasSurface() != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        r0 = r14.fpsReductionLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = r14.minRenderPeriodNs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        if (r1 != com.tencent.p014mm.sdk.platformtools.MAlarmHandler.NEXT_FIRE_INTERVAL) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r1 > 0) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        r1 = java.lang.System.nanoTime();
        r3 = r14.nextFrameTimeNs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r1 >= r3) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        logD("Skipping frame rendering - fps reduction is active.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        r3 = r3 + r14.minRenderPeriodNs;
        r14.nextFrameTimeNs = r3;
        r14.nextFrameTimeNs = java.lang.Math.max(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        r12 = java.lang.System.nanoTime();
        r0 = ((float) r9.getRotatedWidth()) / ((float) r9.getRotatedHeight());
        r1 = r14.layoutLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2 = r14.layoutAspectRatio;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        if (r2 == 0.0f) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        r1 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0070, code lost:
        if (r0 <= r2) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0072, code lost:
        r2 = r2 / r0;
        r0 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0076, code lost:
        r0 = r0 / r2;
        r2 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
        r14.drawMatrix.reset();
        r14.drawMatrix.preTranslate(0.5f, 0.5f);
        r3 = r14.drawMatrix;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
        if (r14.mirrorHorizontally == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        r4 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0090, code lost:
        r4 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0094, code lost:
        if (r14.mirrorVertically == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0096, code lost:
        r1 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0098, code lost:
        r3.preScale(r4, r1);
        r14.drawMatrix.preScale(r2, r0);
        r14.drawMatrix.preTranslate(-0.5f, -0.5f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a7, code lost:
        if (r11 == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
        if (r14.mFrameWithGLCallback.doOnDrawFrameWithEGL(r14.eglBase, r9, r14.drawer, r14.frameDrawer, r14.drawMatrix) != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ba, code lost:
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16384);
        r14.frameDrawer.drawFrame(r9, r14.drawer, r14.drawMatrix, 0, 0, r14.eglBase.surfaceWidth(), r14.eglBase.surfaceHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00da, code lost:
        r0 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e0, code lost:
        if (r14.usePresentationTimeStamp == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e2, code lost:
        r14.eglBase.swapBuffers(r9.getTimestampNs());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ec, code lost:
        r14.eglBase.swapBuffers();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f1, code lost:
        r2 = java.lang.System.nanoTime();
        r4 = r14.currentStats;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f7, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r5 = r14.currentStats;
        r5.framesRendered++;
        r5.renderTimeNs += r2 - r12;
        r5.renderSwapBufferTimeNs += r2 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010c, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0111, code lost:
        notifyCallbacks(r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0114, code lost:
        r9.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0118, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        logE("Error while drawing frame", r0);
        r0 = r14.errorCallback;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0122, code lost:
        if (r0 != null) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0124, code lost:
        r0.onGlOutOfMemory();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0127, code lost:
        r14.drawer.release();
        r14.frameDrawer.release();
        r14.bitmapTextureFramebuffer.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0137, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0138, code lost:
        r9.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0142, code lost:
        logD("Dropping frame - No surface");
        r9.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x014a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        r0 = r14.eglBase;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void renderFrameOnRenderThread() {
        /*
            r14 = this;
            java.lang.Object r0 = r14.frameLock
            monitor-enter(r0)
            org.webrtc.VideoFrame r9 = r14.pendingFrame     // Catch:{ all -> 0x014b }
            if (r9 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x014b }
            return
        L_0x0009:
            r1 = 0
            r14.pendingFrame = r1     // Catch:{ all -> 0x014b }
            monitor-exit(r0)     // Catch:{ all -> 0x014b }
            org.webrtc.EglBase r0 = r14.eglBase
            if (r0 == 0) goto L_0x0142
            boolean r0 = r0.hasSurface()
            if (r0 != 0) goto L_0x0019
            goto L_0x0142
        L_0x0019:
            java.lang.Object r0 = r14.fpsReductionLock
            monitor-enter(r0)
            long r1 = r14.minRenderPeriodNs     // Catch:{ all -> 0x013f }
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
            r10 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x002b
        L_0x0029:
            r11 = 0
            goto L_0x004f
        L_0x002b:
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0033
        L_0x0031:
            r11 = 1
            goto L_0x004f
        L_0x0033:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x013f }
            long r3 = r14.nextFrameTimeNs     // Catch:{ all -> 0x013f }
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x0043
            java.lang.String r1 = "Skipping frame rendering - fps reduction is active."
            r14.logD(r1)     // Catch:{ all -> 0x013f }
            goto L_0x0029
        L_0x0043:
            long r5 = r14.minRenderPeriodNs     // Catch:{ all -> 0x013f }
            long r3 = r3 + r5
            r14.nextFrameTimeNs = r3     // Catch:{ all -> 0x013f }
            long r1 = java.lang.Math.max(r3, r1)     // Catch:{ all -> 0x013f }
            r14.nextFrameTimeNs = r1     // Catch:{ all -> 0x013f }
            goto L_0x0031
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x013f }
            long r12 = java.lang.System.nanoTime()
            int r0 = r9.getRotatedWidth()
            float r0 = (float) r0
            int r1 = r9.getRotatedHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            java.lang.Object r1 = r14.layoutLock
            monitor-enter(r1)
            float r2 = r14.layoutAspectRatio     // Catch:{ all -> 0x013c }
            r7 = 0
            int r3 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r2 = r0
        L_0x006b:
            monitor-exit(r1)     // Catch:{ all -> 0x013c }
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0076
            float r2 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0079
        L_0x0076:
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0079:
            android.graphics.Matrix r3 = r14.drawMatrix
            r3.reset()
            android.graphics.Matrix r3 = r14.drawMatrix
            r4 = 1056964608(0x3f000000, float:0.5)
            r3.preTranslate(r4, r4)
            android.graphics.Matrix r3 = r14.drawMatrix
            boolean r4 = r14.mirrorHorizontally
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r4 == 0) goto L_0x0090
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0092
        L_0x0090:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0092:
            boolean r6 = r14.mirrorVertically
            if (r6 == 0) goto L_0x0098
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0098:
            r3.preScale(r4, r1)
            android.graphics.Matrix r1 = r14.drawMatrix
            r1.preScale(r2, r0)
            android.graphics.Matrix r0 = r14.drawMatrix
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            r0.preTranslate(r1, r1)
            if (r11 == 0) goto L_0x0111
            org.webrtc.EglRenderer$OnFrameInGLEnv r1 = r14.mFrameWithGLCallback     // Catch:{ GlOutOfMemoryException -> 0x011a }
            org.webrtc.EglBase r2 = r14.eglBase     // Catch:{ GlOutOfMemoryException -> 0x011a }
            org.webrtc.RendererCommon$GlDrawer r4 = r14.drawer     // Catch:{ GlOutOfMemoryException -> 0x011a }
            org.webrtc.VideoFrameDrawer r5 = r14.frameDrawer     // Catch:{ GlOutOfMemoryException -> 0x011a }
            android.graphics.Matrix r6 = r14.drawMatrix     // Catch:{ GlOutOfMemoryException -> 0x011a }
            r3 = r9
            boolean r0 = r1.doOnDrawFrameWithEGL(r2, r3, r4, r5, r6)     // Catch:{ GlOutOfMemoryException -> 0x011a }
            if (r0 != 0) goto L_0x00da
            android.opengl.GLES20.glClearColor(r7, r7, r7, r7)     // Catch:{ GlOutOfMemoryException -> 0x011a }
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ GlOutOfMemoryException -> 0x011a }
            org.webrtc.VideoFrameDrawer r1 = r14.frameDrawer     // Catch:{ GlOutOfMemoryException -> 0x011a }
            org.webrtc.RendererCommon$GlDrawer r3 = r14.drawer     // Catch:{ GlOutOfMemoryException -> 0x011a }
            android.graphics.Matrix r4 = r14.drawMatrix     // Catch:{ GlOutOfMemoryException -> 0x011a }
            r5 = 0
            r6 = 0
            org.webrtc.EglBase r0 = r14.eglBase     // Catch:{ GlOutOfMemoryException -> 0x011a }
            int r7 = r0.surfaceWidth()     // Catch:{ GlOutOfMemoryException -> 0x011a }
            org.webrtc.EglBase r0 = r14.eglBase     // Catch:{ GlOutOfMemoryException -> 0x011a }
            int r8 = r0.surfaceHeight()     // Catch:{ GlOutOfMemoryException -> 0x011a }
            r2 = r9
            r1.drawFrame(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ GlOutOfMemoryException -> 0x011a }
        L_0x00da:
            long r0 = java.lang.System.nanoTime()     // Catch:{ GlOutOfMemoryException -> 0x011a }
            boolean r2 = r14.usePresentationTimeStamp     // Catch:{ GlOutOfMemoryException -> 0x011a }
            if (r2 == 0) goto L_0x00ec
            org.webrtc.EglBase r2 = r14.eglBase     // Catch:{ GlOutOfMemoryException -> 0x011a }
            long r3 = r9.getTimestampNs()     // Catch:{ GlOutOfMemoryException -> 0x011a }
            r2.swapBuffers(r3)     // Catch:{ GlOutOfMemoryException -> 0x011a }
            goto L_0x00f1
        L_0x00ec:
            org.webrtc.EglBase r2 = r14.eglBase     // Catch:{ GlOutOfMemoryException -> 0x011a }
            r2.swapBuffers()     // Catch:{ GlOutOfMemoryException -> 0x011a }
        L_0x00f1:
            long r2 = java.lang.System.nanoTime()     // Catch:{ GlOutOfMemoryException -> 0x011a }
            org.webrtc.PerformanceStatistics r4 = r14.currentStats     // Catch:{ GlOutOfMemoryException -> 0x011a }
            monitor-enter(r4)     // Catch:{ GlOutOfMemoryException -> 0x011a }
            org.webrtc.PerformanceStatistics r5 = r14.currentStats     // Catch:{ all -> 0x010e }
            int r6 = r5.framesRendered     // Catch:{ all -> 0x010e }
            int r6 = r6 + r10
            r5.framesRendered = r6     // Catch:{ all -> 0x010e }
            long r6 = r5.renderTimeNs     // Catch:{ all -> 0x010e }
            long r12 = r2 - r12
            long r6 = r6 + r12
            r5.renderTimeNs = r6     // Catch:{ all -> 0x010e }
            long r6 = r5.renderSwapBufferTimeNs     // Catch:{ all -> 0x010e }
            long r2 = r2 - r0
            long r6 = r6 + r2
            r5.renderSwapBufferTimeNs = r6     // Catch:{ all -> 0x010e }
            monitor-exit(r4)     // Catch:{ all -> 0x010e }
            goto L_0x0111
        L_0x010e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x010e }
            throw r0     // Catch:{ GlOutOfMemoryException -> 0x011a }
        L_0x0111:
            r14.notifyCallbacks(r9, r11)     // Catch:{ GlOutOfMemoryException -> 0x011a }
        L_0x0114:
            r9.release()
            goto L_0x0137
        L_0x0118:
            r0 = move-exception
            goto L_0x0138
        L_0x011a:
            r0 = move-exception
            java.lang.String r1 = "Error while drawing frame"
            r14.logE(r1, r0)     // Catch:{ all -> 0x0118 }
            org.webrtc.EglRenderer$ErrorCallback r0 = r14.errorCallback     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x0127
            r0.onGlOutOfMemory()     // Catch:{ all -> 0x0118 }
        L_0x0127:
            org.webrtc.RendererCommon$GlDrawer r0 = r14.drawer     // Catch:{ all -> 0x0118 }
            r0.release()     // Catch:{ all -> 0x0118 }
            org.webrtc.VideoFrameDrawer r0 = r14.frameDrawer     // Catch:{ all -> 0x0118 }
            r0.release()     // Catch:{ all -> 0x0118 }
            org.webrtc.GlTextureFrameBuffer r0 = r14.bitmapTextureFramebuffer     // Catch:{ all -> 0x0118 }
            r0.release()     // Catch:{ all -> 0x0118 }
            goto L_0x0114
        L_0x0137:
            return
        L_0x0138:
            r9.release()
            throw r0
        L_0x013c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x013c }
            throw r0
        L_0x013f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x013f }
            throw r1
        L_0x0142:
            java.lang.String r0 = "Dropping frame - No surface"
            r14.logD(r0)
            r9.release()
            return
        L_0x014b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x014b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.renderFrameOnRenderThread():void");
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, (RendererCommon.GlDrawer) null, false);
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public OnFrameInGLEnv getFrameWithGLCallback() {
        return this.mFrameWithGLCallback;
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Initializing EglRenderer");
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z;
                HandlerThread handlerThread = new HandlerThread(this.name + TAG);
                handlerThread.start();
                HandlerWithExceptionCallback handlerWithExceptionCallback = new HandlerWithExceptionCallback(handlerThread.getLooper(), new Runnable() {
                    public void run() {
                        synchronized (EglRenderer.this.handlerLock) {
                            Handler unused = EglRenderer.this.renderThreadHandler = null;
                        }
                    }
                });
                this.renderThreadHandler = handlerWithExceptionCallback;
                ThreadUtils.invokeAtFrontUninterruptibly((Handler) handlerWithExceptionCallback, (Runnable) new EglRenderer$$h(this, context, iArr));
                this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                this.currentStats.resetStatistics(System.nanoTime());
                this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4));
            } else {
                throw new IllegalStateException(this.name + "Already initialized");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        r6 = r5.currentStats;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.currentStats.framesDropped++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004b, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrame(org.webrtc.VideoFrame r6) {
        /*
            r5 = this;
            org.webrtc.PerformanceStatistics r0 = r5.currentStats
            monitor-enter(r0)
            org.webrtc.PerformanceInspector r1 = r5.detailedPerformanceInspector     // Catch:{ all -> 0x0057 }
            r1.notifyAnimationFrameStart()     // Catch:{ all -> 0x0057 }
            org.webrtc.PerformanceStatistics r1 = r5.currentStats     // Catch:{ all -> 0x0057 }
            int r2 = r1.framesReceived     // Catch:{ all -> 0x0057 }
            r3 = 1
            int r2 = r2 + r3
            r1.framesReceived = r2     // Catch:{ all -> 0x0057 }
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            java.lang.Object r1 = r5.handlerLock
            monitor-enter(r1)
            android.os.Handler r0 = r5.renderThreadHandler     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x001f
            java.lang.String r6 = "Dropping frame - Not initialized or already released."
            r5.logD(r6)     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)     // Catch:{ all -> 0x0054 }
            return
        L_0x001f:
            java.lang.Object r0 = r5.frameLock     // Catch:{ all -> 0x0054 }
            monitor-enter(r0)     // Catch:{ all -> 0x0054 }
            org.webrtc.VideoFrame r2 = r5.pendingFrame     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            if (r4 == 0) goto L_0x002e
            r2.release()     // Catch:{ all -> 0x0051 }
        L_0x002e:
            r5.pendingFrame = r6     // Catch:{ all -> 0x0051 }
            r6.retain()     // Catch:{ all -> 0x0051 }
            android.os.Handler r6 = r5.renderThreadHandler     // Catch:{ all -> 0x0051 }
            org.webrtc.EglRenderer$$a r2 = new org.webrtc.EglRenderer$$a     // Catch:{ all -> 0x0051 }
            r2.<init>(r5)     // Catch:{ all -> 0x0051 }
            r6.post(r2)     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            monitor-exit(r1)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0050
            org.webrtc.PerformanceStatistics r6 = r5.currentStats
            monitor-enter(r6)
            org.webrtc.PerformanceStatistics r0 = r5.currentStats     // Catch:{ all -> 0x004d }
            int r1 = r0.framesDropped     // Catch:{ all -> 0x004d }
            int r1 = r1 + r3
            r0.framesDropped = r1     // Catch:{ all -> 0x004d }
            monitor-exit(r6)     // Catch:{ all -> 0x004d }
            goto L_0x0050
        L_0x004d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x004d }
            throw r0
        L_0x0050:
            return
        L_0x0051:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r6     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0054 }
            throw r6
        L_0x0057:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.onFrame(org.webrtc.VideoFrame):void");
    }

    public abstract void onRenderStats(PerformanceStatistics performanceStatistics);

    public void onViewVisibilityChange(int i) {
        if (i == 4 || i == 8) {
            this.detailedPerformanceInspector.onBackground();
        }
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            Thread thread = handler == null ? null : handler.getLooper().getThread();
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace.length > 0) {
                    logW("EglRenderer stack trace:");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        logW(stackTraceElement.toString());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        org.webrtc.ThreadUtils.awaitUninterruptibly(r0);
        r0 = r5.frameLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1 = r5.pendingFrame;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        r1.release();
        r5.pendingFrame = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        logD("Releasing done.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r5 = this;
            java.lang.String r0 = "Releasing."
            r5.logD(r0)
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.lang.Object r1 = r5.handlerLock
            monitor-enter(r1)
            android.os.Handler r2 = r5.renderThreadHandler     // Catch:{ all -> 0x0055 }
            if (r2 != 0) goto L_0x0019
            java.lang.String r0 = "Already released"
            r5.logD(r0)     // Catch:{ all -> 0x0055 }
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            return
        L_0x0019:
            java.lang.Runnable r3 = r5.logStatisticsRunnable     // Catch:{ all -> 0x0055 }
            r2.removeCallbacks(r3)     // Catch:{ all -> 0x0055 }
            android.os.Handler r2 = r5.renderThreadHandler     // Catch:{ all -> 0x0055 }
            org.webrtc.EglRenderer$$c r3 = new org.webrtc.EglRenderer$$c     // Catch:{ all -> 0x0055 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0055 }
            r2.postAtFrontOfQueue(r3)     // Catch:{ all -> 0x0055 }
            android.os.Handler r2 = r5.renderThreadHandler     // Catch:{ all -> 0x0055 }
            android.os.Looper r2 = r2.getLooper()     // Catch:{ all -> 0x0055 }
            android.os.Handler r3 = r5.renderThreadHandler     // Catch:{ all -> 0x0055 }
            org.webrtc.EglRenderer$$d r4 = new org.webrtc.EglRenderer$$d     // Catch:{ all -> 0x0055 }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0055 }
            r3.post(r4)     // Catch:{ all -> 0x0055 }
            r2 = 0
            r5.renderThreadHandler = r2     // Catch:{ all -> 0x0055 }
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            org.webrtc.ThreadUtils.awaitUninterruptibly(r0)
            java.lang.Object r0 = r5.frameLock
            monitor-enter(r0)
            org.webrtc.VideoFrame r1 = r5.pendingFrame     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x004b
            r1.release()     // Catch:{ all -> 0x0052 }
            r5.pendingFrame = r2     // Catch:{ all -> 0x0052 }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "Releasing done."
            r5.logD(r0)
            return
        L_0x0052:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r1
        L_0x0055:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.release():void");
    }

    public void releaseEglSurface(Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface((Object) null);
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new EglRenderer$$f(this, runnable));
                return;
            }
            runnable.run();
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                if (Thread.currentThread() != this.renderThreadHandler.getLooper().getThread()) {
                    postToRenderThread(new EglRenderer$$b(this, countDownLatch, frameListener));
                    ThreadUtils.awaitUninterruptibly(countDownLatch);
                    return;
                }
                throw new RuntimeException("removeFrameListener must not be called on the render thread.");
            }
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback2) {
        this.errorCallback = errorCallback2;
    }

    public void setFpsReduction(float f) {
        logD("setFpsReduction: " + f);
        synchronized (this.fpsReductionLock) {
            long j = this.minRenderPeriodNs;
            if (f <= 0.0f) {
                this.minRenderPeriodNs = MAlarmHandler.NEXT_FIRE_INTERVAL;
            } else {
                this.minRenderPeriodNs = (long) (((float) TimeUnit.SECONDS.toNanos(1)) / f);
            }
            if (this.minRenderPeriodNs != j) {
                this.nextFrameTimeNs = System.nanoTime();
            }
        }
    }

    public void setFrameWithGLCallback(OnFrameInGLEnv onFrameInGLEnv) {
        this.mFrameWithGLCallback = onFrameInGLEnv;
    }

    public void setLayoutAspectRatio(float f) {
        logD("setLayoutAspectRatio: " + f);
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f;
        }
    }

    public void setMirror(boolean z) {
        logD("setMirrorHorizontally: " + z);
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z;
        }
    }

    public void setMirrorVertically(boolean z) {
        logD("setMirrorVertically: " + z);
        synchronized (this.layoutLock) {
            this.mirrorVertically = z;
        }
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.mFrameWithGLCallback = null;
        this.handlerLock = new Object();
        this.frameListeners = new ArrayList<>();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.layoutLock = new Object();
        this.currentStats = new PerformanceStatistics();
        this.detailedPerformanceInspector = new PerformanceInspector();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(NativeBitmapStruct.GLFormat.GL_RGBA);
        this.logStatisticsRunnable = new Runnable() {
            public void run() {
                EglRenderer.this.logStatistics();
                synchronized (EglRenderer.this.handlerLock) {
                    if (EglRenderer.this.renderThreadHandler != null) {
                        EglRenderer.this.renderThreadHandler.removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                        EglRenderer.this.renderThreadHandler.postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4));
                    }
                }
            }
        };
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation();
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    public void clearImage(float f, float f2, float f3, float f4) {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.postAtFrontOfQueue(new EglRenderer$$g(this, f, f2, f3, f4));
            }
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
        postToRenderThread(new EglRenderer$$e(this, glDrawer, frameListener, f, z));
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }
}
