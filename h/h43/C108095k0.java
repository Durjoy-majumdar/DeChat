package h43;

import com.tencent.p014mm.plugin.voip.video.render.VoIPRenderEvent;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: h43.k0 */
public final class C108095k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C108077f0 f323695d;

    public C108095k0(C108077f0 f0Var) {
        this.f323695d = f0Var;
    }

    public final void run() {
        C108077f0 f0Var = this.f323695d;
        f0Var.f323651k = true;
        C32224a<C13598b0> aVar = f0Var.f323650j;
        if (aVar != null) {
            aVar.invoke();
        }
        new VoIPRenderEvent(1).publish();
    }
}
