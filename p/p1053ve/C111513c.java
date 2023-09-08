package p1053ve;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* renamed from: ve.c */
public class C111513c {

    /* renamed from: a */
    public static EGLDisplay f333887a;

    /* renamed from: b */
    public static EGLConfig f333888b;

    /* renamed from: c */
    public static EGLContext f333889c;

    /* renamed from: d */
    public static EGLSurface f333890d;

    /* renamed from: a */
    public static EGLContext m152016a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        f333887a = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            return null;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(f333887a, iArr, 0, iArr, 1)) {
            return null;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(f333887a, new int[]{12324, 8, 12323, 8, 12322, 8, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return null;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        f333888b = eGLConfig;
        EGLContext eglCreateContext = EGL14.eglCreateContext(f333887a, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        f333889c = eglCreateContext;
        if (eglCreateContext == EGL14.EGL_NO_CONTEXT) {
            return null;
        }
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(f333887a, f333888b, new int[]{12375, 64, 12374, 64, 12344}, 0);
        f333890d = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
            return null;
        }
        EGLDisplay eGLDisplay = f333887a;
        EGLSurface eGLSurface = f333890d;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, f333889c)) {
            return null;
        }
        GLES20.glFlush();
        return f333889c;
    }
}
