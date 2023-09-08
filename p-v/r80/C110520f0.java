package r80;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import n80.C109697b;
import rx3.C13598b0;

/* renamed from: r80.f0 */
public final class C110520f0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110538r f330499d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110520f0(C110538r rVar) {
        super(0);
        this.f330499d = rVar;
    }

    public Object invoke() {
        String str = this.f330499d.f330612w;
        Log.m105924i(str, "onEncodeEnd: " + this.f330499d.f330580b0);
        C115669n.INSTANCE.idkeyStat(985, 162, 1, false);
        C109697b bVar = this.f330499d.f330556F;
        if (bVar != null) {
            bVar.mo160922f();
        }
        this.f330499d.mo161994g(true);
        return C13598b0.f38549a;
    }
}
