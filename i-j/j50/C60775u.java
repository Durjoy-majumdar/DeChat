package j50;

import android.graphics.SurfaceTexture;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: j50.u */
public final class C60775u extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60735a f173098d;

    /* renamed from: e */
    public final /* synthetic */ String f173099e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60775u(C60735a aVar, String str) {
        super(1);
        this.f173098d = aVar;
        this.f173099e = str;
    }

    public Object invoke(Object obj) {
        C60735a aVar = this.f173098d;
        aVar.f173021e.post(new C60772t(aVar, (SurfaceTexture) obj, this.f173099e));
        return C13598b0.f38549a;
    }
}
