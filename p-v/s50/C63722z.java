package s50;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: s50.z */
public final class C63722z extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63714v f180621d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63722z(C63714v vVar) {
        super(0);
        this.f180621d = vVar;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.LiveCoreVisitor", "unsetOutputSurface");
        C63714v vVar = this.f180621d;
        vVar.f180607e = null;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        vVar.f180610h = true;
        return C13598b0.f38549a;
    }
}
