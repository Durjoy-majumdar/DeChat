package com.tencent.p014mm.plugin.api.recordView;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* renamed from: com.tencent.mm.plugin.api.recordView.h */
public class C104732h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C104729f f311024d;

    public C104732h(C104729f fVar) {
        this.f311024d = fVar;
    }

    public void run() {
        EGLDisplay eGLDisplay;
        C104733i iVar = this.f311024d.f311007c;
        int i = iVar.f311047u;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        int i2 = iVar.f311048v;
        if (i2 != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
        }
        EGLDisplay eGLDisplay2 = this.f311024d.f311016l;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        C104729f fVar = this.f311024d;
        EGLSurface eGLSurface2 = fVar.f311017m;
        if (!(eGLSurface2 == null || fVar.f311018n == null || (eGLDisplay = fVar.f311016l) == null)) {
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface2);
            C104729f fVar2 = this.f311024d;
            EGL14.eglDestroyContext(fVar2.f311016l, fVar2.f311018n);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f311024d.f311016l);
            C104729f fVar3 = this.f311024d;
            fVar3.f311018n = null;
            fVar3.f311016l = null;
            fVar3.f311017m = null;
        }
        this.f311024d.f311006b.removeCallbacksAndMessages((Object) null);
        this.f311024d.f311005a.quitSafely();
    }
}
