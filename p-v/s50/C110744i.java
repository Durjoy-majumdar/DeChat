package s50;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: s50.i */
public final class C110744i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110747k f331227d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110744i(C110747k kVar) {
        super(0);
        this.f331227d = kVar;
    }

    public Object invoke() {
        C111742d.C65942b bVar = this.f331227d.f331234f;
        EGLDisplay eGLDisplay = bVar != null ? bVar.f189591a : null;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, bVar != null ? bVar.f189593c : null);
        C110747k kVar = this.f331227d;
        EGLSurface eGLSurface2 = kVar.f331236h;
        if (eGLSurface2 != null) {
            C111742d.C65942b bVar2 = kVar.f331234f;
            if ((bVar2 != null ? bVar2.f189591a : null) != null) {
                EGL14.eglDestroySurface(bVar2 != null ? bVar2.f189591a : null, eGLSurface2);
                C110747k kVar2 = this.f331227d;
                kVar2.f331236h = null;
                kVar2.f331237i = null;
            }
        }
        return C13598b0.f38549a;
    }
}
