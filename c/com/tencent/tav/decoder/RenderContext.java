package com.tencent.tav.decoder;

import android.graphics.PointF;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.view.Surface;
import com.google.android.gms.gcm.Task;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.logger.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RenderContext implements IDecoderTrack.SurfaceCreator {
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    private static final String TAG = "RenderContext";
    private EGLContext _eglContext;
    private HashMap<Surface, String> activeSurfaceCache;
    private EGLConfig eglConfig;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;
    private HashMap<String, Surface> freeSurfaceCache;
    private CGRect glViewportRect;
    private int height;
    private boolean isSharedContext;
    private boolean pBufferEnable;
    private RenderContextParams params;
    private volatile boolean released;
    private List<Surface> releasingSurfaceCache;
    private Surface surface;
    private long threadId;
    private HashMap<Surface, VideoTexture> videoTextureMap;
    private int width;

    public RenderContext(int i, int i2) {
        this(i, i2, (Surface) null);
    }

    public static boolean checkEglActionSuccess(String str) {
        StringBuilder sb = new StringBuilder("");
        boolean z = false;
        while (true) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            Logger.m144643e(TAG, str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
            sb.append(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
            z = true;
        }
        if (z) {
            new RuntimeException("EGL error encountered (see log): " + sb.toString());
        }
        return !z;
    }

    public static void checkEglError(String str) {
        checkEglActionSuccess(str);
    }

    private void checkThread() {
        if (this.threadId != Thread.currentThread().getId()) {
            Logger.m144644e(TAG, "线程不对，注意EGL相关的泄露问题！threadId = " + this.threadId + ", Thread.currentThread() name = " + Thread.currentThread().getName(), (Throwable) new RuntimeException());
        }
    }

    private void createEGLSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
        Surface surface2 = this.surface;
        if (surface2 != null) {
            this.eglSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surface2, new int[]{12344}, 0);
            return;
        }
        this.eglSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, this.width, 12374, this.height, 12344}, 0);
    }

    public static int createTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        checkEglError("glBindTexture mTextureID");
        GLES20.glTexParameterf(i, 10241, 9729.0f);
        GLES20.glTexParameterf(i, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        GLES20.glTexParameteri(i, 10242, 33071);
        GLES20.glTexParameteri(i, 10243, 33071);
        checkEglError("glTexParameter");
        return i2;
    }

    private synchronized void eglSetup(EGLContext eGLContext) {
        this.threadId = Thread.currentThread().getId();
        if (!this.released) {
            try {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                this.eglDisplay = eglGetDisplay;
                if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    new RuntimeException("unable to get EGL14 display");
                    return;
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    this.eglDisplay = null;
                    new RuntimeException("unable to initialize EGL14");
                    return;
                }
                int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(this.eglDisplay, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
                    return;
                }
                int[] iArr3 = {12440, 2, 12344};
                if (eGLContext != null) {
                    this.isSharedContext = true;
                    this._eglContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfigArr[0], eGLContext, iArr3, 0);
                    checkEglError("eglCreateContext");
                    if (this._eglContext == null) {
                        new RuntimeException("null context");
                        return;
                    }
                } else {
                    this._eglContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, iArr3, 0);
                    checkEglError("eglCreateContext");
                    if (this._eglContext == null) {
                        new RuntimeException("null context");
                        return;
                    }
                }
                this.eglConfig = eGLConfigArr[0];
                createEGLSurface();
                if (checkEglActionSuccess("eglCreateWindowSurface")) {
                    this.pBufferEnable = true;
                }
                if (this.eglSurface == null) {
                    new RuntimeException("surface was null");
                }
            } catch (Error | Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006e, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int loadShader(int r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.released     // Catch:{ all -> 0x006f }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r4)
            return r1
        L_0x0008:
            int r0 = android.opengl.GLES20.glCreateShader(r5)     // Catch:{ all -> 0x006f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r2.<init>()     // Catch:{ all -> 0x006f }
            java.lang.String r3 = "glCreateShader type="
            r2.append(r3)     // Catch:{ all -> 0x006f }
            r2.append(r5)     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006f }
            checkEglError(r2)     // Catch:{ all -> 0x006f }
            android.opengl.GLES20.glShaderSource(r0, r6)     // Catch:{ all -> 0x006f }
            android.opengl.GLES20.glCompileShader(r0)     // Catch:{ all -> 0x006f }
            r6 = 1
            int[] r6 = new int[r6]     // Catch:{ all -> 0x006f }
            r2 = 35713(0x8b81, float:5.0045E-41)
            android.opengl.GLES20.glGetShaderiv(r0, r2, r6, r1)     // Catch:{ all -> 0x006f }
            r6 = r6[r1]     // Catch:{ all -> 0x006f }
            if (r6 != 0) goto L_0x006c
            java.lang.String r6 = "RenderContext"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r2.<init>()     // Catch:{ all -> 0x006f }
            java.lang.String r3 = "Could not compile shader "
            r2.append(r3)     // Catch:{ all -> 0x006f }
            r2.append(r5)     // Catch:{ all -> 0x006f }
            java.lang.String r5 = ":"
            r2.append(r5)     // Catch:{ all -> 0x006f }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x006f }
            com.tencent.tav.decoder.logger.Logger.m144643e(r6, r5)     // Catch:{ all -> 0x006f }
            java.lang.String r5 = "RenderContext"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r6.<init>()     // Catch:{ all -> 0x006f }
            java.lang.String r2 = " "
            r6.append(r2)     // Catch:{ all -> 0x006f }
            java.lang.String r2 = android.opengl.GLES20.glGetShaderInfoLog(r0)     // Catch:{ all -> 0x006f }
            r6.append(r2)     // Catch:{ all -> 0x006f }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006f }
            com.tencent.tav.decoder.logger.Logger.m144643e(r5, r6)     // Catch:{ all -> 0x006f }
            android.opengl.GLES20.glDeleteShader(r0)     // Catch:{ all -> 0x006f }
            goto L_0x006d
        L_0x006c:
            r1 = r0
        L_0x006d:
            monitor-exit(r4)
            return r1
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.RenderContext.loadShader(int, java.lang.String):int");
    }

    private synchronized void release(Surface surface2) {
        checkThread();
        if (surface2 != null) {
            if (this.videoTextureMap.containsKey(surface2)) {
                this.videoTextureMap.remove(surface2).release();
            }
            surface2.release();
        }
    }

    private void releaseReleadingSurface() {
        checkThread();
        for (int i = 0; i < this.releasingSurfaceCache.size(); i++) {
            release(this.releasingSurfaceCache.remove(i));
        }
    }

    public synchronized Surface createOutputSurface(int i, int i2, int i3) {
        Surface remove;
        if (this.released) {
            return null;
        }
        checkThread();
        releaseReleadingSurface();
        String str = i + "*" + i2 + "-" + i3;
        if (!this.freeSurfaceCache.containsKey(str) || (remove = this.freeSurfaceCache.remove(str)) == null) {
            makeCurrent();
            VideoTexture videoTexture = new VideoTexture(i, i2, 36197, i3);
            videoTexture.setRenderContext(this);
            Surface surface2 = new Surface(videoTexture.surfaceTexture());
            this.videoTextureMap.put(surface2, videoTexture);
            this.activeSurfaceCache.put(surface2, str);
            return surface2;
        }
        this.activeSurfaceCache.put(remove, str);
        return remove;
    }

    public EGLContext eglContext() {
        return this._eglContext;
    }

    public synchronized void free(Surface surface2) {
        Logger.m144646i(TAG, "free " + Thread.currentThread().getId());
        if (surface2 != null) {
            String remove = this.activeSurfaceCache.remove(surface2);
            if (!TextUtils.isEmpty(remove)) {
                this.freeSurfaceCache.containsKey(remove);
            }
            this.releasingSurfaceCache.add(surface2);
        }
    }

    public long getEglSurfaceHandle() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != null) {
            return eGLSurface.getNativeHandle();
        }
        return 0;
    }

    public CGRect getGlViewportRect() {
        return this.glViewportRect;
    }

    public RenderContextParams getParams() {
        return this.params;
    }

    public int height() {
        return this.height;
    }

    public boolean isPBufferEnable() {
        return this.pBufferEnable;
    }

    public synchronized void makeCurrent() {
        makeCurrent(false);
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setParams(RenderContextParams renderContextParams) {
        this.params = renderContextParams;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setPresentationTime(long r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.released     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            android.view.Surface r0 = r4.surface     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0016
            android.opengl.EGLDisplay r0 = r4.eglDisplay     // Catch:{ all -> 0x0018 }
            android.opengl.EGLSurface r1 = r4.eglSurface     // Catch:{ all -> 0x0018 }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r2
            android.opengl.EGLExt.eglPresentationTimeANDROID(r0, r1, r5)     // Catch:{ all -> 0x0018 }
        L_0x0016:
            monitor-exit(r4)
            return
        L_0x0018:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.RenderContext.setPresentationTime(long):void");
    }

    public void setSurface(Surface surface2) {
        this.surface = surface2;
        createEGLSurface();
        makeCurrent();
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public synchronized boolean swapBuffers() {
        checkThread();
        if (this.released) {
            return false;
        }
        return EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
    }

    public String toString() {
        return "RenderContext{_eglContext=" + this._eglContext + ", isSharedContext=" + this.isSharedContext + ", released=" + this.released + '}';
    }

    public void updateViewport(CGRect cGRect) {
        PointF pointF;
        CGSize cGSize;
        if (cGRect != null && (pointF = cGRect.origin) != null && (cGSize = cGRect.size) != null) {
            this.glViewportRect = cGRect;
            updateViewport((int) pointF.x, (int) pointF.y, (int) cGSize.width, (int) cGSize.height);
        }
    }

    public synchronized VideoTexture videoTextureForSurface(Surface surface2) {
        return this.videoTextureMap.get(surface2);
    }

    public int width() {
        return this.width;
    }

    public RenderContext(int i, int i2, Surface surface2) {
        this(i, i2, surface2, (EGLContext) null);
    }

    public RenderContext(int i, int i2, Surface surface2, EGLContext eGLContext) {
        this.eglSurface = EGL14.EGL_NO_SURFACE;
        this.isSharedContext = false;
        this.released = false;
        this.threadId = -1;
        this.pBufferEnable = false;
        this.videoTextureMap = new HashMap<>();
        this.activeSurfaceCache = new HashMap<>();
        this.freeSurfaceCache = new HashMap<>();
        this.releasingSurfaceCache = new ArrayList();
        this.surface = surface2;
        this.width = i;
        this.height = i2;
        eglSetup(eGLContext);
        makeCurrent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void makeCurrent(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.checkThread()     // Catch:{ all -> 0x0028 }
            boolean r0 = r3.released     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r3)
            return
        L_0x000a:
            android.opengl.EGLDisplay r0 = r3.eglDisplay     // Catch:{ all -> 0x0028 }
            android.opengl.EGLSurface r1 = r3.eglSurface     // Catch:{ all -> 0x0028 }
            android.opengl.EGLContext r2 = r3._eglContext     // Catch:{ all -> 0x0028 }
            boolean r0 = android.opengl.EGL14.eglMakeCurrent(r0, r1, r1, r2)     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "eglMakeCurrent failed"
            checkEglError(r0)     // Catch:{ all -> 0x0028 }
            if (r4 != 0) goto L_0x001e
            goto L_0x0026
        L_0x001e:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = "eglMakeCurrent failed"
            r4.<init>(r0)     // Catch:{ all -> 0x0028 }
            throw r4     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r3)
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.RenderContext.makeCurrent(boolean):void");
    }

    public void updateViewport(int i, int i2, int i3, int i4) {
        makeCurrent();
        GLES20.glViewport(i, i2, i3, i4);
    }

    public synchronized void release() {
        checkThread();
        if (!this.released) {
            makeCurrent();
            this.released = true;
            releaseReleadingSurface();
            for (Surface release : this.videoTextureMap.keySet()) {
                release.release();
            }
            for (VideoTexture release2 : this.videoTextureMap.values()) {
                release2.release();
            }
            this.videoTextureMap.clear();
            try {
                if (EGL14.eglGetCurrentContext().equals(this._eglContext)) {
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGL14.eglDestroySurface(this.eglDisplay, this.eglSurface);
                if (!this.isSharedContext) {
                    EGL14.eglDestroyContext(this.eglDisplay, this._eglContext);
                }
            } catch (Exception e) {
                Logger.m144644e(TAG, "release", (Throwable) e);
            } catch (Error e2) {
                Logger.m144644e(TAG, "release", (Throwable) e2);
            }
            this.eglDisplay = null;
            this._eglContext = null;
            this.eglSurface = null;
            this.surface = null;
        }
    }
}
