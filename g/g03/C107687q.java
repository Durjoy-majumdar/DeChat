package g03;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.view.Surface;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: g03.q */
public final class C107687q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SurfaceTexture f322192d;

    /* renamed from: e */
    public final /* synthetic */ C107681p f322193e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107687q(SurfaceTexture surfaceTexture, C107681p pVar) {
        super(0);
        this.f322192d = surfaceTexture;
        this.f322193e = pVar;
    }

    public Object invoke() {
        if (this.f322192d != null) {
            this.f322193e.f322163g = C111742d.C111743a.m152352k(C111742d.f334647a, new Surface(this.f322192d), (SurfaceTexture) null, 0, 0, (EGLContext) null, 28, (Object) null);
        } else {
            this.f322193e.f322163g = C111742d.C111743a.m152353l(C111742d.f334647a, (EGLContext) null, 1, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
