package j50;

import android.graphics.SurfaceTexture;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: j50.n */
public final class C60766n extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60735a f173086d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60766n(C60735a aVar) {
        super(1);
        this.f173086d = aVar;
    }

    public Object invoke(Object obj) {
        C60735a aVar = this.f173086d;
        aVar.f173021e.post(new C60765m(aVar, (SurfaceTexture) obj));
        return C13598b0.f38549a;
    }
}
