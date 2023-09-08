package jo0;

import android.view.View;
import br0.C39836d;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: jo0.a */
public class C87993a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f254599d;

    /* renamed from: e */
    public final /* synthetic */ int f254600e;

    public C87993a(C87995c cVar, C83780d1 d1Var, int i) {
        this.f254599d = d1Var;
        this.f254600e = i;
    }

    public void run() {
        C83797e3 e3Var;
        if (!this.f254599d.isRunning() || (e3Var = this.f254599d.f244558J) == null) {
            Log.m105924i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "requestFullscreen, invalid state");
            return;
        }
        C39836d fullscreenImpl = e3Var.getFullscreenImpl();
        View wrapperView = this.f254599d.f244558J.getWrapperView();
        if (fullscreenImpl == null || wrapperView == null) {
            Log.m105921e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "requestFullscreen, state error, FullscreenImp[%s], fullscreenWebView[%s]", fullscreenImpl, wrapperView);
            return;
        }
        fullscreenImpl.mo62475c(wrapperView, this.f254600e);
        Log.m105925i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "requestFullscreen, target orientation:%s", Integer.valueOf(this.f254600e));
    }
}
