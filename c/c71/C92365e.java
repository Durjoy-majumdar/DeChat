package c71;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: c71.e */
public final class C92365e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C92362c f264308d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f264309e;

    public C92365e(C92362c cVar, C32224a<C13598b0> aVar) {
        this.f264308d = cVar;
        this.f264309e = aVar;
    }

    public final void run() {
        long currentTicks = Util.currentTicks();
        boolean b = this.f264308d.f264301c.mo140811b();
        String str = this.f264308d.f264299a;
        Log.m105924i(str, "finishEncode used " + Util.ticksToNow(currentTicks) + ", ret:" + b + ", totally used " + Util.ticksToNow(this.f264308d.f264302d) + LocaleUtil.MALAY);
        this.f264308d.f264300b.quit();
        C32224a<C13598b0> aVar = this.f264309e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
