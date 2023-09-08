package qj1;

import android.os.Bundle;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C51711vm1;

/* renamed from: qj1.ca */
public final class C62672ca extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62705da f177958d;

    /* renamed from: e */
    public final /* synthetic */ C51711vm1 f177959e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62672ca(C62705da daVar, C51711vm1 vm12) {
        super(0);
        this.f177958d = daVar;
        this.f177959e = vm12;
    }

    public Object invoke() {
        C58124b bVar = this.f177958d.f178040p;
        C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_RECEIVE_LOGO_RESP;
        Bundle bundle = new Bundle();
        bundle.putByteArray("PARAM_FINDER_LIVE_RECEIVE_LOGO_RESP_KEY", this.f177959e.toByteArray());
        C13598b0 b0Var = C13598b0.f38549a;
        bVar.statusChange(bVar2, bundle);
        return C13598b0.f38549a;
    }
}
