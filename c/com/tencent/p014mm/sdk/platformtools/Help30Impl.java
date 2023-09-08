package com.tencent.p014mm.sdk.platformtools;

import android.graphics.Paint;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES10;
import android.view.View;

/* renamed from: com.tencent.mm.sdk.platformtools.Help30Impl */
class Help30Impl {
    private static final String GPU_TAG = "MicroMsg.GPU_TAG";
    private static final int MIN_TEXTURE_SIZE = 2048;
    private EGLContext mEGLContext;
    private EGLDisplay mEGLDisplay;
    private EGLSurface mEGLSurface;
    private int maxTextureSize;

    /* renamed from: com.tencent.mm.sdk.platformtools.Help30Impl$Singleton */
    public static class Singleton {
        public static Help30Impl instance = new Help30Impl();

        private Singleton() {
        }
    }

    private void eglSetup() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEGLDisplay = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            Log.m105920e(GPU_TAG, "EGL_NO_DISPLAY");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            Log.m105920e(GPU_TAG, "eglInitialize");
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
        this.mEGLContext = EGL14.eglCreateContext(this.mEGLDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.mEGLDisplay, eGLConfigArr[0], new int[]{12344}, 0);
        this.mEGLSurface = eglCreatePbufferSurface;
        EGL14.eglMakeCurrent(this.mEGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, this.mEGLContext);
    }

    public static Help30Impl getInstance() {
        return Singleton.instance;
    }

    private void release() {
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        EGLDisplay eGLDisplay2 = this.mEGLDisplay;
        if (eGLDisplay != eGLDisplay2) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
            EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
    }

    public boolean canUseHardwareAcceleration(int i, int i2) {
        Log.m105919d(GPU_TAG, "canUseHardwareAcceleration maxTextureSize %s w %s h %s.", Integer.valueOf(this.maxTextureSize), Integer.valueOf(i), Integer.valueOf(i2));
        int i3 = this.maxTextureSize;
        return i < i3 && i2 < i3;
    }

    public void decideLayerType(View view, int i, int i2) {
        int i3 = 1;
        Log.m105919d(GPU_TAG, "decideLayerType maxTextureSize %s.", Integer.valueOf(this.maxTextureSize));
        int i4 = this.maxTextureSize;
        if (i < i4 && i2 < i4) {
            i3 = 0;
        }
        if (view.getLayerType() != i3) {
            view.setLayerType(i3, (Paint) null);
        }
    }

    public int getMaxTextureSize() {
        return this.maxTextureSize;
    }

    public void setLayerType(View view) {
        if (view.getLayerType() != 1) {
            view.setLayerType(1, (Paint) null);
        }
    }

    public void updateTextureMaxSize() {
        Log.m105925i(GPU_TAG, "pennqin, updateTextureMaxSize, before: %s.", Integer.valueOf(this.maxTextureSize));
        try {
            eglSetup();
            int[] iArr = new int[1];
            GLES10.glGetIntegerv(3379, iArr, 0);
            int i = iArr[0];
            int i2 = 2048;
            if (i > 2048) {
                i2 = i;
            }
            this.maxTextureSize = i2;
            Log.m105925i(GPU_TAG, "pennqin, get max texture size: %s %s.", Integer.valueOf(i), Integer.valueOf(this.maxTextureSize));
            ForceGpuUtil.canGetTextureSize = false;
            try {
                release();
            } catch (Throwable th) {
                Log.printErrStackTrace(GPU_TAG, th, "release err: %s", th.getMessage());
            }
        } catch (Throwable th4) {
            Log.printErrStackTrace(GPU_TAG, th4, "release err: %s", th4.getMessage());
        }
    }

    private Help30Impl() {
        this.maxTextureSize = 2048;
        Log.m105924i(GPU_TAG, "pennqin, init Help30Impl.");
    }
}
