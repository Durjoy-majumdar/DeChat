package p747xb;

import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import gy3.C87412m;
import java.util.ListIterator;
import rx3.C36570n;

/* renamed from: xb.h */
public final class C91155h implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C91151g f261381d;

    public C91155h(C91151g gVar) {
        this.f261381d = gVar;
    }

    public final boolean onTimerExpired() {
        try {
            Log.m105924i("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", "[wxa_reload]onBackground appId[" + this.f261381d.f261371b + "] try pause all pages's rendering, delay[" + ((Number) ((C36570n) this.f261381d.f261376g).getValue()).longValue() + "] switch[" + this.f261381d.f261374e + ']');
            C91151g gVar = this.f261381d;
            if (gVar.f261374e) {
                C83849m0 m0Var = gVar.f261370a;
                m0Var.getClass();
                ListIterator<C83820i0> listIterator = m0Var.f244745p.listIterator();
                C91151g gVar2 = this.f261381d;
                int i = 0;
                while (listIterator.hasNext()) {
                    C83820i0 next = listIterator.next();
                    i++;
                    if (i > gVar2.f261375f) {
                        C87412m.m108593f(next, "page");
                        C91151g.m114371a(gVar2, next);
                    }
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th, "[wxa_reload]onBackground appId[" + this.f261381d.f261371b + ']', new Object[0]);
        }
        return false;
    }
}
