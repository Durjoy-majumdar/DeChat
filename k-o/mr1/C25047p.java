package mr1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import mr1.C25026b;
import rx3.C13598b0;

/* renamed from: mr1.p */
public final class C25047p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C25026b f71495d;

    /* renamed from: e */
    public final /* synthetic */ String f71496e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25047p(C25026b bVar, String str) {
        super(0);
        this.f71495d = bVar;
        this.f71496e = str;
    }

    public Object invoke() {
        C25026b.C25027a aVar = this.f71495d.f71361b.get(this.f71496e);
        if (aVar != null) {
            String str = this.f71496e;
            C25026b bVar = this.f71495d;
            aVar.f71376I = true;
            Log.m105924i("FinderNetworkFlowReport", "PRERENDER_stopPreRenderForPlayerStop " + aVar.f71384Q + ' ' + str + " item:" + aVar);
            aVar.f71372E = true;
            if (aVar.f71388a == 4 || aVar.f71377J) {
                bVar.f71361b.remove(str);
                bVar.mo52129f(aVar, "stopPreRenderForPlayerStop");
            }
        }
        return C13598b0.f38549a;
    }
}
