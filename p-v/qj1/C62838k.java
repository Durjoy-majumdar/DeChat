package qj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C50516na1;

/* renamed from: qj1.k */
public final class C62838k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62898o f178334d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C50516na1> f178335e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62838k(C62898o oVar, C8479f0<C50516na1> f0Var) {
        super(0);
        this.f178334d = oVar;
        this.f178335e = f0Var;
    }

    public Object invoke() {
        String str;
        Log.m105928w("FinderLiveAdVideoPlugin", "loadStartupVideo come complete.");
        C62898o oVar = this.f178334d;
        C50516na1 na12 = (C50516na1) this.f178335e.f27484d;
        if (na12 == null || (str = na12.f138504d) == null) {
            str = "";
        }
        oVar.mo87844d1(str, true);
        C62705da daVar = (C62705da) this.f178334d.mo87687E0(C62705da.class);
        if (daVar != null) {
            daVar.mo87717Z0();
        }
        return C13598b0.f38549a;
    }
}
