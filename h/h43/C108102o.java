package h43;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: h43.o */
public final class C108102o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108115u f323704d;

    /* renamed from: e */
    public final /* synthetic */ C108091j f323705e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<C108091j, C13598b0> f323706f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108102o(C108115u uVar, C108091j jVar, C32226l<? super C108091j, C13598b0> lVar) {
        super(0);
        this.f323704d = uVar;
        this.f323705e = jVar;
        this.f323706f = lVar;
    }

    public Object invoke() {
        C111742d.C65942b bVar = this.f323704d.f323740c;
        if (bVar != null) {
            C108091j jVar = this.f323705e;
            C32226l<C108091j, C13598b0> lVar = this.f323706f;
            StringBuilder sb = new StringBuilder();
            sb.append("releaseSurface:");
            Object obj = jVar.f323685b;
            sb.append(obj != null ? obj.hashCode() : 0);
            sb.append(", ");
            sb.append(jVar.mo158508a().hashCode());
            Log.m105924i("MicroMsg.PboSurfaceRender", sb.toString());
            C111742d.C111743a aVar = C111742d.f334647a;
            EGLSurface a = jVar.mo158508a();
            Log.m105924i("MicroMsg.GLEnvironmentUtil", "eglUnbindSurface");
            EGL14.eglDestroySurface(bVar.f189591a, a);
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            C87412m.m108593f(eGLSurface, "EGL_NO_SURFACE");
            jVar.f323686c = eGLSurface;
            if (lVar != null) {
                lVar.invoke(jVar);
            }
        }
        return C13598b0.f38549a;
    }
}
