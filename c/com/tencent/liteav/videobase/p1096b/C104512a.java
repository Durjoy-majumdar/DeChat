package com.tencent.liteav.videobase.p1096b;

import android.opengl.GLES20;
import android.view.Surface;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.webrtc.EglBase;

/* renamed from: com.tencent.liteav.videobase.b.a */
public final class C104512a implements C104519h<EGLContext> {

    /* renamed from: h */
    private static final int[] f309759h = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};

    /* renamed from: i */
    private static final int[] f309760i = {12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};

    /* renamed from: a */
    private final int f309761a;

    /* renamed from: b */
    private final int f309762b;

    /* renamed from: c */
    private EGLDisplay f309763c = EGL10.EGL_NO_DISPLAY;

    /* renamed from: d */
    private EGLContext f309764d = EGL10.EGL_NO_CONTEXT;

    /* renamed from: e */
    private EGLSurface f309765e = EGL10.EGL_NO_SURFACE;

    /* renamed from: f */
    private EGL10 f309766f;

    /* renamed from: g */
    private EGLConfig f309767g;

    private C104512a(int i, int i2) {
        this.f309761a = i;
        this.f309762b = i2;
    }

    /* renamed from: a */
    public static C104512a m139802a(EGLContext eGLContext, Surface surface, int i, int i2) {
        int i3;
        C104512a aVar = new C104512a(i, i2);
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            aVar.f309766f = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            aVar.f309763c = eglGetDisplay;
            aVar.f309766f.eglInitialize(eglGetDisplay, new int[2]);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            aVar.f309766f.eglChooseConfig(aVar.f309763c, surface == null ? f309759h : f309760i, eGLConfigArr, 1, new int[1]);
            aVar.f309767g = eGLConfigArr[0];
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
                try {
                    aVar.f309764d = aVar.m139803a(aVar.f309763c, aVar.f309767g, 2, eGLContext);
                } catch (C104518g unused) {
                    LiteavLog.m16901i("EGL10Helper", "failed to create EGLContext of OpenGL ES 3.0, try 2.0");
                    aVar.f309764d = aVar.m139803a(aVar.f309763c, aVar.f309767g, 3, eGLContext);
                    i3 = 3;
                }
            } else {
                aVar.f309764d = aVar.m139803a(aVar.f309763c, aVar.f309767g, 2, eGLContext);
            }
            i3 = 2;
            LiteavLog.m16901i("EGL10Helper", "create eglContext " + aVar.f309764d + ", version:" + i3);
            if (surface == null) {
                aVar.f309765e = aVar.f309766f.eglCreatePbufferSurface(aVar.f309763c, aVar.f309767g, new int[]{12375, aVar.f309761a, 12374, aVar.f309762b, 12344});
            } else {
                aVar.f309765e = aVar.f309766f.eglCreateWindowSurface(aVar.f309763c, aVar.f309767g, surface, (int[]) null);
            }
            if (aVar.f309765e == EGL10.EGL_NO_SURFACE) {
                aVar.m139805h();
            }
            EGL10 egl102 = aVar.f309766f;
            EGLDisplay eGLDisplay = aVar.f309763c;
            EGLSurface eGLSurface = aVar.f309765e;
            if (!egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, aVar.f309764d)) {
                aVar.m139805h();
            }
            return aVar;
        } catch (Exception e) {
            throw new C104518g(aVar.f309766f.eglGetError(), "", e);
        } catch (C104518g e2) {
            aVar.mo147190c();
            throw e2;
        }
    }

    /* renamed from: g */
    private void m139804g() {
        if (this.f309765e != EGL10.EGL_NO_SURFACE) {
            mo147191d();
            if (!this.f309766f.eglDestroySurface(this.f309763c, this.f309765e)) {
                m139805h();
            }
            this.f309765e = EGL10.EGL_NO_SURFACE;
        }
    }

    /* renamed from: h */
    private void m139805h() {
        int eglGetError = this.f309766f.eglGetError();
        if (eglGetError != 12288) {
            throw new C104518g(eglGetError);
        }
    }

    /* renamed from: b */
    public final void mo147189b() {
        EGL10 egl10 = this.f309766f;
        EGLDisplay eGLDisplay = this.f309763c;
        EGLSurface eGLSurface = this.f309765e;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f309764d)) {
            m139805h();
        }
    }

    /* renamed from: c */
    public final void mo147190c() {
        if (this.f309763c != EGL10.EGL_NO_DISPLAY) {
            mo147191d();
            m139804g();
            if (this.f309764d != EGL10.EGL_NO_CONTEXT) {
                LiteavLog.m16901i("EGL10Helper", "destroy eglContext " + this.f309764d);
                this.f309766f.eglDestroyContext(this.f309763c, this.f309764d);
                this.f309764d = EGL10.EGL_NO_CONTEXT;
            }
            this.f309766f.eglTerminate(this.f309763c);
        }
        this.f309763c = EGL10.EGL_NO_DISPLAY;
    }

    /* renamed from: d */
    public final void mo147191d() {
        EGLDisplay eGLDisplay = this.f309763c;
        if (eGLDisplay != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.f309766f;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        }
    }

    /* renamed from: e */
    public final C104507p mo147192e() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        return (!this.f309766f.eglQuerySurface(this.f309763c, this.f309765e, 12375, iArr) || !this.f309766f.eglQuerySurface(this.f309763c, this.f309765e, 12374, iArr2)) ? new C104507p(0, 0) : new C104507p(iArr[0], iArr2[0]);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo147193f() {
        return this.f309764d;
    }

    /* renamed from: a */
    public final void mo147188a() {
        GLES20.glFinish();
        if (!this.f309766f.eglSwapBuffers(this.f309763c, this.f309765e)) {
            m139805h();
        }
    }

    /* renamed from: a */
    private EGLContext m139803a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, EGLContext eGLContext) {
        int[] iArr = {12440, i, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        EGLContext eglCreateContext = this.f309766f.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        m139805h();
        return eglCreateContext;
    }
}
