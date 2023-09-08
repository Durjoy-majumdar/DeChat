package com.tencent.liteav.videoproducer.capture;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C17118l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p1096b.C104518g;
import javax.microedition.khronos.egl.EGL10;

/* renamed from: com.tencent.liteav.videoproducer.capture.au */
public class C104533au {

    /* renamed from: a */
    private static volatile C104533au f309852a;

    /* renamed from: b */
    private final C17118l f309853b = new C17118l();

    /* renamed from: c */
    private Object f309854c;

    /* renamed from: d */
    private C104516e f309855d;

    private C104533au() {
        if (this.f309854c == null) {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 17) {
                EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
                EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12379);
                EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                m139874c();
                EGL14.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface, eglGetCurrentSurface, eglGetCurrentContext);
            } else {
                EGL10 egl10 = (EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
                javax.microedition.khronos.egl.EGLDisplay eglGetCurrentDisplay2 = egl10.eglGetCurrentDisplay();
                javax.microedition.khronos.egl.EGLSurface eglGetCurrentSurface2 = egl10.eglGetCurrentSurface(12379);
                javax.microedition.khronos.egl.EGLContext eglGetCurrentContext2 = egl10.eglGetCurrentContext();
                m139874c();
                egl10.eglMakeCurrent(eglGetCurrentDisplay2, eglGetCurrentSurface2, eglGetCurrentSurface2, eglGetCurrentContext2);
            }
            LiteavLog.m16901i("GlobalContextManager", "global context: " + this.f309854c);
        }
    }

    /* renamed from: a */
    public static C104533au m139873a() {
        if (f309852a == null) {
            synchronized (C104533au.class) {
                if (f309852a == null) {
                    f309852a = new C104533au();
                }
            }
        }
        return f309852a;
    }

    /* renamed from: c */
    private void m139874c() {
        C104516e eVar = new C104516e();
        this.f309855d = eVar;
        try {
            eVar.mo147196a((Object) null, (Surface) null, 128, 128);
        } catch (C104518g e) {
            LiteavLog.m16899e("GlobalContextManager", "initializeEGL failed.", (Throwable) e);
            this.f309855d = null;
        }
        C104516e eVar2 = this.f309855d;
        if (eVar2 != null) {
            this.f309854c = eVar2.mo147198c();
        }
    }

    /* renamed from: b */
    public final synchronized Object mo147211b() {
        return this.f309854c;
    }
}
