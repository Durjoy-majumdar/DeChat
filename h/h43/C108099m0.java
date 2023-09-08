package h43;

import android.graphics.SurfaceTexture;
import android.util.Size;
import b43.C104031a;
import b43.C104034c;
import b43.C104035d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d43.C106987a;
import fy3.C32226l;
import gy3.C87413o;
import l33.C109247e;
import rx3.C13598b0;

/* renamed from: h43.m0 */
public final class C108099m0 extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108077f0 f323699d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f323700e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108099m0(C108077f0 f0Var, C32226l<? super Boolean, C13598b0> lVar) {
        super(1);
        this.f323699d = f0Var;
        this.f323700e = lVar;
    }

    public Object invoke(Object obj) {
        Size size;
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        if (surfaceTexture == null) {
            return null;
        }
        C104031a aVar = this.f323699d.f323642b;
        if (aVar != null) {
            ((C106987a) aVar).f320249n = surfaceTexture;
        }
        if (aVar != null) {
            C106987a aVar2 = (C106987a) aVar;
            if (C104035d.f307670a.f308688b < 2) {
                Log.m105920e("MicroMsg.Voip.CaptureRender", "ExchangeCapture...gCameraNum= " + C104035d.f307670a.f308688b);
            } else {
                Log.m105924i("MicroMsg.Voip.CaptureRender", "ExchangeCapture start, gCameraNum= " + C104035d.f307670a.f308688b);
                C104034c cVar = aVar2.f320244i;
                if (cVar != null) {
                    cVar.mo145645D(19);
                }
                aVar2.mo145640l();
                aVar2.mo145633e(aVar2.f320244i, !aVar2.f320236a);
                aVar2.mo145638j();
                C109247e.xx0().mo152591E(aVar2.f320238c);
            }
        }
        C108077f0 f0Var = this.f323699d;
        C104031a aVar3 = f0Var.f323642b;
        if (aVar3 == null || (size = ((C106987a) aVar3).f320241f) == null) {
            return null;
        }
        f0Var.mo158497l(size);
        this.f323699d.getClass();
        this.f323699d.f323639J = Util.nowMilliSecond();
        this.f323699d.mo158496k(C109247e.vx0().f333441a);
        C32226l<Boolean, C13598b0> lVar = this.f323700e;
        if (lVar == null) {
            return null;
        }
        lVar.invoke(Boolean.TRUE);
        return null;
    }
}
