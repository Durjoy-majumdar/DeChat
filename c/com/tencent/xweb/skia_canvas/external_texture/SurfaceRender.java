package com.tencent.xweb.skia_canvas.external_texture;

import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.view.Surface;
import java.util.Objects;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class SurfaceRender {
    private static final String LOG_TAG = "SurfaceRender";
    private EGL10 egl;
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;
    private int mHeight;
    private boolean mInited;
    private int mWidth;
    private Surface surface;

    public SurfaceRender(Surface surface2) {
        this.surface = surface2;
    }

    private void initEGLSurface() {
        EGLSurface eglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, this.surface, (int[]) null);
        this.eglSurface = eglCreateWindowSurface;
        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("GL Error: " + GLUtils.getEGLErrorString(this.egl.eglGetError()) + " with surface " + this.surface);
        } else if (this.egl.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
            int[] iArr = new int[1];
            this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr);
            this.mWidth = iArr[0];
            this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
            this.mHeight = iArr[0];
            Objects.toString(this.surface);
        } else {
            throw new RuntimeException("GL Make current error: " + GLUtils.getEGLErrorString(this.egl.eglGetError()));
        }
    }

    public void adjustViewPort() {
        GLES20.glViewport(0, 0, this.mWidth, this.mHeight);
    }

    public void deinitGL() {
        if (this.mInited) {
            EGL10 egl10 = this.egl;
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.egl.eglDestroySurface(this.eglDisplay, this.eglSurface);
        }
    }

    public int getHeight() {
        return this.mHeight;
    }

    public Surface getSurface() {
        return this.surface;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void init(EGL10 egl10, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        if (!this.mInited) {
            this.egl = egl10;
            this.eglContext = eGLContext;
            this.eglDisplay = eGLDisplay;
            this.eglConfig = eGLConfig;
            initEGLSurface();
            this.mInited = true;
        }
    }

    public void makeCurrent() {
        EGL10 egl10 = this.egl;
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = this.eglSurface;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext);
    }

    public void swapBuffer() {
        this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
    }
}
