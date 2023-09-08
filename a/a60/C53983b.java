package a60;

import a60.C53979a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: a60.b */
public final class C53983b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53979a f151243d;

    /* renamed from: e */
    public final /* synthetic */ C53979a.C53980a f151244e;

    public C53983b(C53979a aVar, C53979a.C53980a aVar2) {
        this.f151243d = aVar;
        this.f151244e = aVar2;
    }

    public final void run() {
        this.f151243d.f151234i = this.f151244e;
        String str = "[sysmsg]anchor accept mic " + this.f151244e;
        C87412m.m108594g(str, "debugText");
        Log.m105924i("MicroMsg.LiveCoreMic", str);
        C32224a<C13598b0> aVar = this.f151243d.f151227b;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
