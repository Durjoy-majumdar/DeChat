package ku0;

import android.graphics.SurfaceTexture;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ku0.C88288a;
import rx3.C13598b0;

/* renamed from: ku0.i */
public final class C88304i extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C88288a f255254d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88304i(C88288a aVar) {
        super(1);
        this.f255254d = aVar;
    }

    public Object invoke(Object obj) {
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        C87412m.m108594g(surfaceTexture, "cameraPreviewSurface");
        C88288a aVar = this.f255254d;
        C88288a.C88289a aVar2 = C88288a.f255199E;
        aVar.mo122668F(surfaceTexture);
        return C13598b0.f38549a;
    }
}
