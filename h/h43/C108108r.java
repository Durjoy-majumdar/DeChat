package h43;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: h43.r */
public final class C108108r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108115u f323721d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108108r(C108115u uVar) {
        super(0);
        this.f323721d = uVar;
    }

    public Object invoke() {
        this.f323721d.f323744g = false;
        Log.m105924i("MicroMsg.PboSurfaceRender", "stop set pauseRender");
        this.f323721d.f323747j = true;
        return C13598b0.f38549a;
    }
}
