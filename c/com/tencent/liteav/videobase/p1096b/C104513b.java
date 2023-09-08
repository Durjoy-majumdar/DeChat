package com.tencent.liteav.videobase.p1096b;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;
import org.webrtc.EglBase;

/* renamed from: com.tencent.liteav.videobase.b.b */
public final class C104513b implements C104519h<EGLContext> {

    /* renamed from: g */
    private static final int[] f309768g = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};

    /* renamed from: h */
    private static final int[] f309769h = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};

    /* renamed from: a */
    public EGLDisplay f309770a = EGL14.EGL_NO_DISPLAY;

    /* renamed from: b */
    public EGLSurface f309771b = EGL14.EGL_NO_SURFACE;

    /* renamed from: c */
    private final int f309772c;

    /* renamed from: d */
    private final int f309773d;

    /* renamed from: e */
    private EGLConfig f309774e = null;

    /* renamed from: f */
    private EGLContext f309775f = EGL14.EGL_NO_CONTEXT;

    private C104513b(int i, int i2) {
        this.f309772c = i;
        this.f309773d = i2;
    }

    /* renamed from: a */
    public static C104513b m139813a(EGLContext eGLContext, Surface surface, int i, int i2) {
        int i3;
        EGLContext eGLContext2 = eGLContext;
        Surface surface2 = surface;
        C104513b bVar = new C104513b(i, i2);
        try {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            bVar.f309770a = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    if (EGL14.eglChooseConfig(bVar.f309770a, surface2 == null ? f309769h : f309768g, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                        bVar.f309774e = eGLConfigArr[0];
                        if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
                            try {
                                bVar.f309775f = m139812a(bVar.f309770a, bVar.f309774e, 2, eGLContext2);
                            } catch (C104518g unused) {
                                LiteavLog.m16901i("EGL14Helper", "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
                                bVar.f309775f = m139812a(bVar.f309770a, bVar.f309774e, 3, eGLContext2);
                                i3 = 3;
                            }
                        } else {
                            bVar.f309775f = m139812a(bVar.f309770a, bVar.f309774e, 2, eGLContext2);
                        }
                        i3 = 2;
                        LiteavLog.m16901i("EGL14Helper", "create eglContext " + bVar.f309775f + ",version:" + i3);
                        if (surface2 == null) {
                            bVar.f309771b = EGL14.eglCreatePbufferSurface(bVar.f309770a, bVar.f309774e, new int[]{12375, bVar.f309772c, 12374, bVar.f309773d, 12344}, 0);
                        } else {
                            bVar.f309771b = EGL14.eglCreateWindowSurface(bVar.f309770a, bVar.f309774e, surface2, new int[]{12344}, 0);
                        }
                        m139814g();
                        EGLDisplay eGLDisplay = bVar.f309770a;
                        EGLSurface eGLSurface = bVar.f309771b;
                        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, bVar.f309775f)) {
                            m139814g();
                        }
                        return bVar;
                    }
                    throw new C104518g(0);
                }
                bVar.f309770a = null;
                LiteavLog.m16898e("EGL14Helper", "unable to initialize EGL14");
                throw new C104518g(0);
            }
            LiteavLog.m16898e("EGL14Helper", "unable to get EGL14 display");
            throw new C104518g(0);
        } catch (Exception e) {
            throw new C104518g(EGL14.eglGetError(), "", e);
        } catch (C104518g e2) {
            LiteavLog.m16901i("EGL14Helper", e2.toString());
            bVar.mo147190c();
            throw e2;
        }
    }

    /* renamed from: g */
    private static void m139814g() {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            LiteavLog.m16905w("EGL14Helper", "opengl error: ".concat(String.valueOf(eglGetError)));
            throw new C104518g(eglGetError);
        }
    }

    /* renamed from: b */
    public final void mo147189b() {
        EGLDisplay eGLDisplay = this.f309770a;
        EGLSurface eGLSurface = this.f309771b;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f309775f)) {
            m139814g();
        }
    }

    /* renamed from: c */
    public final void mo147190c() {
        EGLDisplay eGLDisplay = this.f309770a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface2 = this.f309771b;
            if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f309770a, eGLSurface2);
                this.f309771b = EGL14.EGL_NO_SURFACE;
            }
            if (this.f309775f != EGL14.EGL_NO_CONTEXT) {
                LiteavLog.m16901i("EGL14Helper", "destroy eglContext " + this.f309775f);
                EGL14.eglDestroyContext(this.f309770a, this.f309775f);
                this.f309775f = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f309770a);
        }
        this.f309770a = EGL14.EGL_NO_DISPLAY;
    }

    /* renamed from: d */
    public final void mo147191d() {
        EGLDisplay eGLDisplay = this.f309770a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
    }

    /* renamed from: e */
    public final C104507p mo147192e() {
        int[] iArr = new int[2];
        return (!EGL14.eglQuerySurface(this.f309770a, this.f309771b, 12375, iArr, 0) || !EGL14.eglQuerySurface(this.f309770a, this.f309771b, 12374, iArr, 1)) ? new C104507p(0, 0) : new C104507p(iArr[0], iArr[1]);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo147193f() {
        return this.f309775f;
    }

    /* renamed from: a */
    public final void mo147188a() {
        GLES20.glFinish();
        if (!EGL14.eglSwapBuffers(this.f309770a, this.f309771b)) {
            m139814g();
        }
    }

    /* renamed from: a */
    private static EGLContext m139812a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, EGLContext eGLContext) {
        int[] iArr = {12440, i, 12344};
        if (eGLContext == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        m139814g();
        return eglCreateContext;
    }
}
