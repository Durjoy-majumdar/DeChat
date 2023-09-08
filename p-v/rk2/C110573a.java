package rk2;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import h81.C32735h;

/* renamed from: rk2.a */
public class C110573a implements C90000b {

    /* renamed from: a */
    public EGLDisplay f330729a;

    /* renamed from: b */
    public EGLConfig f330730b;

    /* renamed from: c */
    public EGLContext f330731c;

    /* renamed from: d */
    public EGLSurface f330732d;

    /* renamed from: D */
    public void mo124321D() {
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_gpu_opengl_api_hook_laboratory, true)) {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("mmkv_gpu_service_key_muti");
            mmkv.putBoolean("key_has_function_seek_start", true);
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.f330729a = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (EGL14.eglChooseConfig(this.f330729a, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        this.f330730b = eGLConfig;
                        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f330729a, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                        this.f330731c = eglCreateContext;
                        if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f330729a, this.f330730b, new int[]{12375, 64, 12374, 64, 12344}, 0);
                            this.f330732d = eglCreatePbufferSurface;
                            if (eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE && EGL14.eglMakeCurrent(this.f330729a, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f330731c)) {
                                GLES20.glFlush();
                            }
                        }
                    }
                }
            }
            mmkv.putBoolean("key_finish_function_seek", true);
            mmkv.commit();
            Log.m105924i("MicroMsg.GpuHookIndexTask", "release");
            EGL14.eglDestroySurface(this.f330729a, this.f330732d);
            EGL14.eglDestroyContext(this.f330729a, this.f330731c);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f330729a);
            this.f330729a = null;
            this.f330730b = null;
            this.f330731c = null;
            this.f330732d = null;
            Log.m105920e("MicroMsg.GpuHookIndexTask", MMApplicationContext.getProcessName() + ": System.exit()");
        }
    }

    /* renamed from: a */
    public String mo124322a() {
        return "OpenGL_Api_Hook";
    }
}
