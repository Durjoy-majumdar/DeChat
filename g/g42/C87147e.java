package g42;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: g42.e */
public final class C87147e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87140c f252742d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87147e(C87140c cVar) {
        super(0);
        this.f252742d = cVar;
    }

    public Object invoke() {
        if (this.f252742d.f252732f.isEmpty()) {
            Log.m105924i("MagicBrushClientMgr", "No biz -> unbind service");
            C87140c.m108161c(this.f252742d, false);
        }
        return C13598b0.f38549a;
    }
}
