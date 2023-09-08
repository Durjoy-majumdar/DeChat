package t80;

import android.opengl.GLSurfaceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: t80.b */
public final class C110944b implements GLSurfaceView.EGLContextFactory {
    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        C87412m.m108594g(egl10, "egl");
        C87412m.m108594g(eGLDisplay, "display");
        C87412m.m108594g(eGLConfig, "eglConfig");
        Log.m105928w("MicroMsg.RenderContextFactory", "creating OpenGL ES 2.0 context");
        EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, MultiProcessMMKV.getMMKV("mmkv_gl_key").decodeInt("support_egl_context_client_version", 3), 12344});
        C87412m.m108593f(eglCreateContext, "egl.eglCreateContext(dis…_NO_CONTEXT, attrib_list)");
        return eglCreateContext;
    }

    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        C87412m.m108594g(egl10, "egl");
        C87412m.m108594g(eGLDisplay, "display");
        C87412m.m108594g(eGLContext, "context");
        Log.m105928w("MicroMsg.RenderContextFactory", "destroyContext OpenGL ES 2.0 Context");
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }
}
