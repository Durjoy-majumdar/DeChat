package aq3;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: aq3.s */
public final class C54309s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54301o f152426d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54309s(C54301o oVar) {
        super(0);
        this.f152426d = oVar;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.ImageQueryMainUIC", "cancel image query");
        this.f152426d.getActivity().finish();
        return C13598b0.f38549a;
    }
}
