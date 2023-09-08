package j90;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.HandlerThread;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import s80.C110777a;
import w80.C111742d;

/* renamed from: j90.b */
public final class C108661b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108663d f325412d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108661b(C108663d dVar) {
        super(0);
        this.f325412d = dVar;
    }

    public Object invoke() {
        C110777a aVar = this.f325412d.f325420h;
        if (aVar != null) {
            C110777a.m150773o(aVar, false, 1, (Object) null);
        }
        C108663d dVar = this.f325412d;
        dVar.f325420h = null;
        C111742d.C65942b bVar = dVar.f325416d;
        if (bVar != null) {
            EGL14.eglDestroyContext(bVar.f189591a, bVar.f189593c);
            EGL14.eglDestroySurface(bVar.f189591a, bVar.f189592b);
            bVar.f189592b = EGL14.EGL_NO_SURFACE;
            EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
            C87412m.m108593f(eGLContext, "EGL_NO_CONTEXT");
            bVar.f189593c = eGLContext;
            HandlerThread handlerThread = dVar.f325418f;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            dVar.f325418f = null;
            dVar.f325419g = null;
        }
        return C13598b0.f38549a;
    }
}
