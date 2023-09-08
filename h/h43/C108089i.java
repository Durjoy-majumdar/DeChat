package h43;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: h43.i */
public final class C108089i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108073f f323682d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108089i(C108073f fVar) {
        super(0);
        this.f323682d = fVar;
    }

    public Object invoke() {
        this.f323682d.f323610c = false;
        C111742d.C65942b bVar = this.f323682d.f323616i;
        EGLContext eGLContext = null;
        EGLDisplay eGLDisplay = bVar != null ? bVar.f189591a : null;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (bVar != null) {
            eGLContext = bVar.f189593c;
        }
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        C108073f fVar = this.f323682d;
        fVar.f323608a = !fVar.f323608a;
        fVar.f323610c = true;
        return C13598b0.f38549a;
    }
}
