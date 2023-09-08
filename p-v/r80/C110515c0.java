package r80;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: r80.c0 */
public final class C110515c0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110538r f330488d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110515c0(C110538r rVar) {
        super(0);
        this.f330488d = rVar;
    }

    public Object invoke() {
        Log.m105920e(this.f330488d.f330612w, "onDecodeError");
        this.f330488d.mo161996j(true, false);
        return C13598b0.f38549a;
    }
}
