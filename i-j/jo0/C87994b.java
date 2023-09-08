package jo0;

import br0.C39836d;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: jo0.b */
public class C87994b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f254601d;

    public C87994b(C87995c cVar, C83780d1 d1Var) {
        this.f254601d = d1Var;
    }

    public void run() {
        C83797e3 e3Var;
        if (!this.f254601d.isRunning() || (e3Var = this.f254601d.f244558J) == null) {
            Log.m105924i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "exitFullscreen, invalid state");
            return;
        }
        C39836d fullscreenImpl = e3Var.getFullscreenImpl();
        if (fullscreenImpl != null) {
            fullscreenImpl.mo62476d();
            Log.m105924i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "exitFullscreen");
            return;
        }
        Log.m105920e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "exitFullscreen, state error");
    }
}
