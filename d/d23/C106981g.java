package d23;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import w80.C111742d;

/* renamed from: d23.g */
public final class C106981g implements Runnable {

    /* renamed from: d */
    public static final C106981g f320228d = new C106981g();

    public final void run() {
        C111742d.C65942b l = C111742d.C111743a.m152353l(C111742d.f334647a, (EGLContext) null, 1, (Object) null);
        if (C87412m.m108589b(l.f189593c, EGL14.EGL_NO_CONTEXT)) {
            Log.m105920e("MicroMsg.LocalEffectManager", "tryCreateX3DGlobalContext, create EGLContext failed");
            return;
        }
        C106976a.f320208a.mo157409m();
        if (!C87412m.m108589b(l.f189592b, EGL14.EGL_NO_SURFACE)) {
            EGL14.eglDestroySurface(l.f189591a, l.f189592b);
        }
        EGL14.eglDestroyContext(l.f189591a, l.f189593c);
    }
}
