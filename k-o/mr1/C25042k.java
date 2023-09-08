package mr1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import mr1.C25026b;
import rx3.C13598b0;

/* renamed from: mr1.k */
public final class C25042k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C25026b.C25033c f71469d;

    /* renamed from: e */
    public final /* synthetic */ String f71470e;

    /* renamed from: f */
    public final /* synthetic */ C25026b.C25027a f71471f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25042k(C25026b.C25033c cVar, String str, C25026b.C25027a aVar) {
        super(0);
        this.f71469d = cVar;
        this.f71470e = str;
        this.f71471f = aVar;
    }

    public Object invoke() {
        if (this.f71469d.f71431a) {
            Log.m105924i("FinderNetworkFlowReport", "PLAY_onPlayerStart#onDownloaderStart " + this.f71470e + ' ' + this.f71471f);
            C25026b.C25027a aVar = this.f71471f;
            aVar.f71369B = true;
            aVar.f71370C = false;
            C25026b.C25027a.f71367U.mo52138c(aVar, this.f71469d.f71432b);
        }
        return C13598b0.f38549a;
    }
}
