package p747xb;

import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ListIterator;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: xb.d */
public final class C91148d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C91151g f261367d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91148d(C91151g gVar) {
        super(0);
        this.f261367d = gVar;
    }

    public Object invoke() {
        ((MTimerHandler) ((C36570n) this.f261367d.f261377h).getValue()).stopTimer();
        try {
            Log.m105924i("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", "[wxa_reload]onSuspend appId[" + this.f261367d.f261371b + "] try pause all pages's rendering");
            C83849m0 m0Var = this.f261367d.f261370a;
            m0Var.getClass();
            ListIterator<C83820i0> listIterator = m0Var.f244745p.listIterator();
            C91151g gVar = this.f261367d;
            while (listIterator.hasNext()) {
                C83820i0 next = listIterator.next();
                C87412m.m108593f(next, "page");
                C91151g.m114371a(gVar, next);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th, "[wxa_reload]onSuspend appId[" + this.f261367d.f261371b + ']', new Object[0]);
        }
        return C13598b0.f38549a;
    }
}
