package com.tencent.thumbplayer.tmediacodec.preload.glrender;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.thumbplayer.tmediacodec.hook.PreloadSurface;
import com.tencent.thumbplayer.tmediacodec.hook.PreloadSurfaceTexture;
import com.tencent.thumbplayer.tmediacodec.util.LogUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class OutputSurface implements SurfaceTexture.OnFrameAvailableListener {
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final String TAG = "OutputSurface";
    public static final boolean VERBOSE = false;
    public EGL10 mEGL;
    public EGLContext mEGLContext;
    public EGLDisplay mEGLDisplay;
    public EGLSurface mEGLSurface;
    public boolean mFrameAvailable;
    public Object mFrameSyncObject = new Object();
    public Surface mSurface;
    public PreloadSurfaceTexture mSurfaceTexture;
    public TextureRender mTextureRender;

    public OutputSurface(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        eglSetup(i, i2);
        makeCurrent();
        setup();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void awaitNewImage() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mFrameSyncObject
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r4.mFrameAvailable     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0023
            java.lang.Object r1 = r4.mFrameSyncObject     // Catch:{ InterruptedException -> 0x001b }
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x001b }
            boolean r1 = r4.mFrameAvailable     // Catch:{ InterruptedException -> 0x001b }
            if (r1 == 0) goto L_0x0013
            goto L_0x0003
        L_0x0013:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x001b }
            java.lang.String r2 = "Surface frame wait timed out"
            r1.<init>(r2)     // Catch:{ InterruptedException -> 0x001b }
            throw r1     // Catch:{ InterruptedException -> 0x001b }
        L_0x001b:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0034 }
            r1.interrupt()     // Catch:{ all -> 0x0034 }
            goto L_0x0003
        L_0x0023:
            r1 = 0
            r4.mFrameAvailable = r1     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            com.tencent.thumbplayer.tmediacodec.preload.glrender.TextureRender r0 = r4.mTextureRender
            java.lang.String r1 = "before updateTexImage"
            r0.checkGlError(r1)
            com.tencent.thumbplayer.tmediacodec.hook.PreloadSurfaceTexture r0 = r4.mSurfaceTexture
            r0.updateTexImage()
            return
        L_0x0034:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface.awaitNewImage():void");
    }

    public void changeFragmentShader(String str) {
        this.mTextureRender.changeFragmentShader(str);
    }

    public void checkEglError(String str) {
        boolean z = false;
        while (true) {
            int eglGetError = this.mEGL.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            Integer.toHexString(eglGetError);
            z = true;
        }
        if (z) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    public void drawImage() {
        this.mTextureRender.drawFrame(this.mSurfaceTexture);
    }

    public void eglSetup(int i, int i2) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.mEGL = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.mEGLDisplay = eglGetDisplay;
        if (this.mEGL.eglInitialize(eglGetDisplay, (int[]) null)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (this.mEGL.eglChooseConfig(this.mEGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
                this.mEGLContext = this.mEGL.eglCreateContext(this.mEGLDisplay, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                checkEglError("eglCreateContext");
                if (this.mEGLContext != null) {
                    this.mEGLSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, eGLConfigArr[0], new int[]{12375, i, 12374, i2, 12344});
                    checkEglError("eglCreatePbufferSurface");
                    if (this.mEGLSurface == null) {
                        throw new RuntimeException("surface was null");
                    }
                    return;
                }
                throw new RuntimeException("null context");
            }
            throw new RuntimeException("unable to find RGB888+pbuffer EGL config");
        }
        throw new RuntimeException("unable to initialize EGL10");
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public void makeCurrent() {
        if (this.mEGL != null) {
            checkEglError("before makeCurrent");
            EGL10 egl10 = this.mEGL;
            EGLDisplay eGLDisplay = this.mEGLDisplay;
            EGLSurface eGLSurface = this.mEGLSurface;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
                throw new RuntimeException("eglMakeCurrent failed");
            }
            return;
        }
        throw new RuntimeException("not configured for makeCurrent");
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.mFrameSyncObject) {
            if (!this.mFrameAvailable) {
                this.mFrameAvailable = true;
                this.mFrameSyncObject.notifyAll();
            } else {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
        }
    }

    public void release() {
        EGL10 egl10 = this.mEGL;
        if (egl10 != null) {
            if (egl10.eglGetCurrentContext().equals(this.mEGLContext)) {
                EGL10 egl102 = this.mEGL;
                EGLDisplay eGLDisplay = this.mEGLDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.mEGL.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
            this.mEGL.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
        }
        this.mSurface.release();
        this.mEGLDisplay = null;
        this.mEGLContext = null;
        this.mEGLSurface = null;
        this.mEGL = null;
        this.mTextureRender = null;
        this.mSurface = null;
        this.mSurfaceTexture = null;
    }

    public void setup() {
        TextureRender textureRender = new TextureRender();
        this.mTextureRender = textureRender;
        textureRender.surfaceCreated();
        PreloadSurfaceTexture preloadSurfaceTexture = new PreloadSurfaceTexture(this.mTextureRender.getTextureId());
        this.mSurfaceTexture = preloadSurfaceTexture;
        preloadSurfaceTexture.setActionCallback(new PreloadSurfaceTexture.ActionCallback() {
            public void onReleased() {
                LogUtils.m21881d(OutputSurface.TAG, "mSurfaceTexture:" + OutputSurface.this.mSurfaceTexture + " onReleased, release OutputSurface");
                OutputSurface.this.release();
            }
        });
        this.mSurfaceTexture.setOnFrameAvailableListener(this);
        this.mSurface = new PreloadSurface(this.mSurfaceTexture);
    }

    public OutputSurface() {
        setup();
    }
}
