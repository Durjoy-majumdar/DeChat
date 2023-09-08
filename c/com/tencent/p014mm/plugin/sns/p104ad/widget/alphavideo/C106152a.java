package com.tencent.p014mm.plugin.sns.p104ad.widget.alphavideo;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import wq2.C111831c;
import wq2.C111832d;
import wq2.C111835g;
import wq2.C111836h;
import wq2.C111837i;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.a */
public abstract class C106152a implements Runnable {

    /* renamed from: d */
    public final SurfaceTexture f316190d;

    /* renamed from: e */
    public EGL10 f316191e;

    /* renamed from: f */
    public EGLDisplay f316192f;

    /* renamed from: g */
    public EGLContext f316193g;

    /* renamed from: h */
    public EGLSurface f316194h;

    /* renamed from: i */
    public int f316195i;

    /* renamed from: j */
    public int f316196j;

    /* renamed from: n */
    public volatile boolean f316197n;

    /* renamed from: o */
    public volatile boolean f316198o = false;

    /* renamed from: p */
    public final Object f316199p = new Object();

    /* renamed from: q */
    public C94754a f316200q;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.a$a */
    public interface C94754a {
    }

    public C106152a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f316190d = surfaceTexture;
        this.f316195i = i;
        this.f316196j = i2;
        this.f316197n = true;
    }

    /* renamed from: a */
    public abstract boolean mo151901a();

    /* renamed from: b */
    public abstract void mo151902b();

    /* renamed from: c */
    public final void mo151903c() {
        EGLConfig eGLConfig;
        SnsMethodCalculate.markStartTimeMs("initGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f316191e = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f316192f = eglGetDisplay;
        this.f316191e.eglInitialize(eglGetDisplay, new int[2]);
        SnsMethodCalculate.markStartTimeMs("chooseEglConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        SnsMethodCalculate.markStartTimeMs("getOpenGLConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        SnsMethodCalculate.markEndTimeMs("getOpenGLConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        if (this.f316191e.eglChooseConfig(this.f316192f, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
            if (iArr[0] > 0) {
                eGLConfig = eGLConfigArr[0];
                SnsMethodCalculate.markEndTimeMs("chooseEglConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            } else {
                SnsMethodCalculate.markEndTimeMs("chooseEglConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                eGLConfig = null;
            }
            EGL10 egl102 = this.f316191e;
            EGLDisplay eGLDisplay = this.f316192f;
            SnsMethodCalculate.markStartTimeMs("createContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            SnsMethodCalculate.markEndTimeMs("createContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            this.f316193g = eglCreateContext;
            EGLSurface eglCreateWindowSurface = this.f316191e.eglCreateWindowSurface(this.f316192f, eGLConfig, this.f316190d, (int[]) null);
            this.f316194h = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                RuntimeException runtimeException = new RuntimeException("GL Error: " + GLUtils.getEGLErrorString(this.f316191e.eglGetError()));
                SnsMethodCalculate.markEndTimeMs("initGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                throw runtimeException;
            } else if (this.f316191e.eglMakeCurrent(this.f316192f, eglCreateWindowSurface, eglCreateWindowSurface, this.f316193g)) {
                SnsMethodCalculate.markEndTimeMs("initGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            } else {
                RuntimeException runtimeException2 = new RuntimeException("GL Make current error: " + GLUtils.getEGLErrorString(this.f316191e.eglGetError()));
                SnsMethodCalculate.markEndTimeMs("initGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                throw runtimeException2;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed to choose config: " + GLUtils.getEGLErrorString(this.f316191e.eglGetError()));
            SnsMethodCalculate.markEndTimeMs("chooseEglConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            throw illegalArgumentException;
        }
    }

    /* renamed from: d */
    public void mo151904d() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        this.f316197n = false;
        this.f316198o = false;
        synchronized (this.f316199p) {
            try {
                this.f316199p.notifyAll();
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
    }

    /* renamed from: e */
    public void mo151905e() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        this.f316198o = false;
        synchronized (this.f316199p) {
            try {
                this.f316199p.notifyAll();
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
    }

    public void run() {
        boolean z;
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        SnsMethodCalculate.markStartTimeMs("tryInitOpenGL", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        try {
            mo151903c();
            if (this.f316200q != null) {
                SnsMethodCalculate.markStartTimeMs("onOpenGLInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                C111836h.m152498e("AdAlphaPlayerView", "onOpenGLInit");
                SnsMethodCalculate.markEndTimeMs("onOpenGLInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            }
            SnsMethodCalculate.markEndTimeMs("tryInitOpenGL", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            z = false;
        } catch (Throwable th) {
            C111836h.m152496c("TextureSurfaceRenderer", "initGL failed", th);
            if (this.f316200q != null) {
                AdAlphaPlayerView adAlphaPlayerView = (AdAlphaPlayerView) this.f316200q;
                adAlphaPlayerView.getClass();
                SnsMethodCalculate.markStartTimeMs("onOpenGLInitFailed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                C111836h.m152495b("AdAlphaPlayerView", "onOpenGLInitFailed");
                C111837i.m152499a().mo163553b(new C111832d(adAlphaPlayerView));
                SnsMethodCalculate.markEndTimeMs("onOpenGLInitFailed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            }
            SnsMethodCalculate.markEndTimeMs("tryInitOpenGL", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            z = true;
        }
        if (z) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("tryInitOpenGLComponent", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        try {
            mo151902b();
            C94754a aVar = this.f316200q;
            if (aVar != null) {
                ((AdAlphaPlayerView) aVar).mo151882c();
            }
            SnsMethodCalculate.markEndTimeMs("tryInitOpenGLComponent", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            z2 = false;
        } catch (Throwable th4) {
            C111836h.m152496c("TextureSurfaceRenderer", "initGLComponents failed", th4);
            if (this.f316200q != null) {
                AdAlphaPlayerView adAlphaPlayerView2 = (AdAlphaPlayerView) this.f316200q;
                adAlphaPlayerView2.getClass();
                SnsMethodCalculate.markStartTimeMs("onOpenGLComponentsInitFailed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                C111836h.m152495b("AdAlphaPlayerView", "onOpenGLComponentsInitFailed");
                C111837i.m152499a().mo163553b(new C111831c(adAlphaPlayerView2));
                SnsMethodCalculate.markEndTimeMs("onOpenGLComponentsInitFailed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            }
            SnsMethodCalculate.markEndTimeMs("tryInitOpenGLComponent", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            z2 = true;
        }
        if (z2) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            return;
        }
        C111836h.m152494a("TextureSurfaceRenderer", "OpenGL init OK.");
        SnsMethodCalculate.markStartTimeMs("loopDraw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        synchronized (this.f316199p) {
            while (this.f316197n) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (mo151901a()) {
                        this.f316191e.eglSwapBuffers(this.f316192f, this.f316194h);
                    }
                    long currentTimeMillis2 = 32 - (System.currentTimeMillis() - currentTimeMillis);
                    if (currentTimeMillis2 > 0) {
                        if (this.f316198o) {
                            this.f316199p.wait(300);
                        } else {
                            this.f316199p.wait(currentTimeMillis2);
                        }
                    }
                } catch (InterruptedException e) {
                    C111836h.m152497d("TextureSurfaceRenderer", e);
                } catch (Throwable th5) {
                    while (true) {
                        SnsMethodCalculate.markEndTimeMs("loopDraw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                        throw th5;
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("loopDraw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        C111835g gVar = (C111835g) this;
        SnsMethodCalculate.markStartTimeMs("releaseGLComponents", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        GLES20.glDeleteTextures(1, gVar.f334865t, 0);
        GLES20.glDeleteProgram(gVar.f334866u);
        gVar.f334869x.release();
        gVar.f334869x.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        C111836h.m152494a("AlphaTextureRenderer", "releaseGLComponents");
        SnsMethodCalculate.markEndTimeMs("releaseGLComponents", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        C94754a aVar2 = this.f316200q;
        if (aVar2 != null) {
            ((AdAlphaPlayerView) aVar2).getClass();
            SnsMethodCalculate.markStartTimeMs("onOpenGLComponentsRelease", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            C111836h.m152498e("AdAlphaPlayerView", "onOpenGLComponentsRelease");
            SnsMethodCalculate.markEndTimeMs("onOpenGLComponentsRelease", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
        SnsMethodCalculate.markStartTimeMs("releaseGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        EGL10 egl10 = this.f316191e;
        EGLDisplay eGLDisplay = this.f316192f;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        this.f316191e.eglDestroySurface(this.f316192f, this.f316194h);
        this.f316191e.eglDestroyContext(this.f316192f, this.f316193g);
        this.f316191e.eglTerminate(this.f316192f);
        C111836h.m152494a("TextureSurfaceRenderer", "OpenGL deinit OK.");
        SnsMethodCalculate.markEndTimeMs("releaseGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        C94754a aVar3 = this.f316200q;
        if (aVar3 != null) {
            ((AdAlphaPlayerView) aVar3).getClass();
            SnsMethodCalculate.markStartTimeMs("onOpenGLRelease", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            C111836h.m152498e("AdAlphaPlayerView", "onOpenGLRelease");
            SnsMethodCalculate.markEndTimeMs("onOpenGLRelease", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
        C111836h.m152494a("TextureSurfaceRenderer", "OpenGL loop end.");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
    }
}
