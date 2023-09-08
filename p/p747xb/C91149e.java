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

/* renamed from: xb.e */
public final class C91149e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C91151g f261368d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91149e(C91151g gVar) {
        super(0);
        this.f261368d = gVar;
    }

    public Object invoke() {
        ((MTimerHandler) ((C36570n) this.f261368d.f261377h).getValue()).stopTimer();
        try {
            Log.m105924i("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", "[wxa_reload]onForeground appId[" + this.f261368d.f261371b + "] try restore top[" + this.f261368d.f261372c + "] pages's rendering");
            C83849m0 m0Var = this.f261368d.f261370a;
            m0Var.getClass();
            ListIterator<C83820i0> listIterator = m0Var.f244745p.listIterator();
            C91151g gVar = this.f261368d;
            int i = 0;
            while (listIterator.hasNext()) {
                C83820i0 next = listIterator.next();
                i++;
                if (i <= gVar.f261372c) {
                    C87412m.m108593f(next, "page");
                    gVar.mo125217c(next);
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th, "[wxa_reload]onForeground appId[" + this.f261368d.f261371b + ']', new Object[0]);
        }
        return C13598b0.f38549a;
    }
}
