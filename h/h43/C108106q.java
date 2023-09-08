package h43;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: h43.q */
public final class C108106q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108115u f323711d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108106q(C108115u uVar) {
        super(0);
        this.f323711d = uVar;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.PboSurfaceRender", "start set pauseRender");
        C108115u uVar = this.f323711d;
        uVar.f323744g = true;
        uVar.f323747j = false;
        return C13598b0.f38549a;
    }
}
