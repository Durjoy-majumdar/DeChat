package p194lc;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: lc.x */
public final class C88469x {

    /* renamed from: a */
    public final SurfaceTexture f255543a;

    /* renamed from: b */
    public EGL10 f255544b;

    /* renamed from: c */
    public EGLDisplay f255545c;

    /* renamed from: d */
    public EGLContext f255546d;

    /* renamed from: e */
    public EGLSurface f255547e;

    /* renamed from: f */
    public final int[] f255548f = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12337, 4, 12344};

    public C88469x(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        this.f255543a = surfaceTexture;
    }

    /* renamed from: a */
    public final void mo122880a() {
        long currentTimeMillis = System.currentTimeMillis();
        EGL egl = EGLContext.getEGL();
        C87412m.m108592e(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        EGL10 egl10 = (EGL10) egl;
        this.f255544b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f255545c = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl102 = this.f255544b;
            C87412m.m108591d(egl102);
            if (egl102.eglInitialize(this.f255545c, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = this.f255548f;
                EGL10 egl103 = this.f255544b;
                C87412m.m108591d(egl103);
                if (egl103.eglChooseConfig(this.f255545c, iArr2, eGLConfigArr, 1, iArr)) {
                    EGLConfig eGLConfig = iArr[0] > 0 ? eGLConfigArr[0] : null;
                    EGL10 egl104 = this.f255544b;
                    C87412m.m108591d(egl104);
                    EGLContext eglCreateContext = egl104.eglCreateContext(this.f255545c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    C87412m.m108593f(eglCreateContext, "egl!!.eglCreateContext(e…L_NO_CONTEXT, attribList)");
                    this.f255546d = eglCreateContext;
                    EGL10 egl105 = this.f255544b;
                    C87412m.m108591d(egl105);
                    EGLSurface eglCreateWindowSurface = egl105.eglCreateWindowSurface(this.f255545c, eGLConfig, this.f255543a, (int[]) null);
                    this.f255547e = eglCreateWindowSurface;
                    if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("GL Error: ");
                        EGL10 egl106 = this.f255544b;
                        C87412m.m108591d(egl106);
                        sb.append(GLUtils.getEGLErrorString(egl106.eglGetError()));
                        throw new RuntimeException(sb.toString());
                    }
                    EGL10 egl107 = this.f255544b;
                    C87412m.m108591d(egl107);
                    EGLDisplay eGLDisplay = this.f255545c;
                    EGLSurface eGLSurface = this.f255547e;
                    if (egl107.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f255546d)) {
                        Log.m105918d("SkylineTextureCleanLogic", "egl init OK.");
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        GLES20.glClear(16384);
                        EGL10 egl108 = this.f255544b;
                        C87412m.m108591d(egl108);
                        if (!egl108.eglSwapBuffers(this.f255545c, this.f255547e)) {
                            EGL10 egl109 = this.f255544b;
                            C87412m.m108591d(egl109);
                            Log.m105918d("SkylineTextureCleanLogic", String.valueOf(egl109.eglGetError()));
                        }
                        EGL10 egl1010 = this.f255544b;
                        C87412m.m108591d(egl1010);
                        EGLDisplay eGLDisplay2 = this.f255545c;
                        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                        egl1010.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                        EGL10 egl1011 = this.f255544b;
                        C87412m.m108591d(egl1011);
                        egl1011.eglDestroySurface(this.f255545c, this.f255547e);
                        EGL10 egl1012 = this.f255544b;
                        C87412m.m108591d(egl1012);
                        egl1012.eglDestroyContext(this.f255545c, this.f255546d);
                        EGL10 egl1013 = this.f255544b;
                        C87412m.m108591d(egl1013);
                        egl1013.eglTerminate(this.f255545c);
                        Log.m105918d("SkylineTextureCleanLogic", "egl destroy OK.");
                        Log.m105924i("SkylineTextureCleanLogic", "clean costTime:" + (System.currentTimeMillis() - currentTimeMillis));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("GL make current error: ");
                    EGL10 egl1014 = this.f255544b;
                    C87412m.m108591d(egl1014);
                    sb4.append(GLUtils.getEGLErrorString(egl1014.eglGetError()));
                    throw new RuntimeException(sb4.toString());
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Failed to choose config: ");
                EGL10 egl1015 = this.f255544b;
                C87412m.m108591d(egl1015);
                sb5.append(GLUtils.getEGLErrorString(egl1015.eglGetError()));
                throw new IllegalArgumentException(sb5.toString().toString());
            }
            throw new RuntimeException("eglInitialize failed");
        }
        throw new RuntimeException("eglGetDisplay failed");
    }
}
