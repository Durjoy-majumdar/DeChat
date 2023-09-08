package r80;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import n80.C109715i;
import rx3.C13598b0;

/* renamed from: r80.b0 */
public final class C110513b0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110538r f330482d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110513b0(C110538r rVar) {
        super(0);
        this.f330482d = rVar;
    }

    public Object invoke() {
        C109715i iVar;
        String str = this.f330482d.f330612w;
        Log.m105924i(str, "onDecodeEnd, encodeFrameCount:" + this.f330482d.f330580b0 + ", drawFrameCount:" + this.f330482d.f330582c0);
        this.f330482d.f330592h0 = true;
        C110538r rVar = this.f330482d;
        if (rVar.f330604o && (iVar = rVar.f330557G) != null) {
            iVar.mo160946d();
        }
        C110538r.m150463e(this.f330482d);
        return C13598b0.f38549a;
    }
}
