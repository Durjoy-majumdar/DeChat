package mr1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import mr1.C25026b;
import rx3.C13598b0;

/* renamed from: mr1.g */
public final class C25038g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C25026b.C25033c f71456d;

    /* renamed from: e */
    public final /* synthetic */ String f71457e;

    /* renamed from: f */
    public final /* synthetic */ C25026b.C25027a f71458f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25038g(C25026b.C25033c cVar, String str, C25026b.C25027a aVar) {
        super(0);
        this.f71456d = cVar;
        this.f71457e = str;
        this.f71458f = aVar;
    }

    public Object invoke() {
        if (this.f71456d.f71431a) {
            Log.m105924i("FinderNetworkFlowReport", "PLAY_onPlayerPrepare#onDownloaderStart " + this.f71457e + ' ' + this.f71458f);
            C25026b.C25027a aVar = this.f71458f;
            aVar.f71369B = true;
            aVar.f71370C = false;
            C25026b.C25027a.f71367U.mo52138c(aVar, this.f71456d.f71432b);
        }
        return C13598b0.f38549a;
    }
}
