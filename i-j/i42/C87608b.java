package i42;

import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86183k;
import e42.C7594e;
import fy3.C32224a;
import gy3.C87413o;
import j52.C87879c;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: i42.b */
public final class C87608b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87609c<C7594e> f253726d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87608b(C87609c<C7594e> cVar) {
        super(0);
        this.f253726d = cVar;
    }

    public Object invoke() {
        Log.m105924i(this.f253726d.f253746t, "cleanupByConnError");
        IMagicBrushMonitor.C85281a.m105255c(C87879c.f254379e, this.f253726d.f253743q, "onConnException", "", (String) null, 8, (Object) null);
        C87609c<C7594e> cVar = this.f253726d;
        cVar.f253740n = 16;
        Iterator<C86183k> it = cVar.f253733g.iterator();
        while (it.hasNext()) {
            it.next().mo109586a0();
        }
        C87609c<C7594e> cVar2 = this.f253726d;
        cVar2.f253747u = null;
        C87609c.m108957v(cVar2);
        return C13598b0.f38549a;
    }
}
