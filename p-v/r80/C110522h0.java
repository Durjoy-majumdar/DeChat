package r80;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87413o;
import k80.C108915a;
import o80.C109993a;
import rx3.C13598b0;

/* renamed from: r80.h0 */
public final class C110522h0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110538r f330501d;

    /* renamed from: e */
    public final /* synthetic */ long f330502e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110522h0(C110538r rVar, long j) {
        super(0);
        this.f330501d = rVar;
        this.f330502e = j;
    }

    public Object invoke() {
        C108915a aVar = this.f330501d.f330558H;
        if (aVar != null) {
            aVar.mo160053n();
        }
        String str = this.f330501d.f330612w;
        Log.m105924i(str, "mix audio used " + Util.ticksToNow(this.f330502e));
        C109993a aVar2 = this.f330501d.f330562L;
        if (aVar2 != null) {
            aVar2.mo161327e();
        }
        this.f330501d.mo161994g(false);
        return C13598b0.f38549a;
    }
}
