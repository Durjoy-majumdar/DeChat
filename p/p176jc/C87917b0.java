package p176jc;

import com.tencent.luggage.skyline.SkylineView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.SkylineLogic;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: jc.b0 */
public final class C87917b0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SkylineView f254455d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87917b0(SkylineView skylineView) {
        super(0);
        this.f254455d = skylineView;
    }

    public Object invoke() {
        Log.m105924i("SkylineView", "id:" + this.f254455d.f235004d + " appIsResumed");
        SkylineLogic.INSTANCE.appIsResumed(this.f254455d.f235004d);
        return C13598b0.f38549a;
    }
}
