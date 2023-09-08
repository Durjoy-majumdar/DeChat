package mz1;

import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: mz1.m */
public final class C109655m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109651k f328275d;

    /* renamed from: e */
    public final /* synthetic */ Surface f328276e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109655m(C109651k kVar, Surface surface) {
        super(0);
        this.f328275d = kVar;
        this.f328276e = surface;
    }

    public Object invoke() {
        C109651k kVar = this.f328275d;
        Surface surface = this.f328276e;
        if (surface != null) {
            C109651k.m148964a(kVar);
            if (surface.isValid()) {
                kVar.f328265n = C111742d.f334647a.mo163465h(kVar.mo160869c().f189591a, surface);
            } else {
                Log.m105928w("MicroMsg.GameLiveRenderManager", "outputSurface is invalid, ignore!");
                kVar.f328265n = null;
            }
        } else {
            C109651k.m148964a(kVar);
            kVar.f328265n = null;
            surface = null;
        }
        kVar.f328269r = surface;
        return C13598b0.f38549a;
    }
}
