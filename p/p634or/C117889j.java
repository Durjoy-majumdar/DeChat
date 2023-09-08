package p634or;

import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: or.j */
public final class C117889j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C117883g f352421d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117889j(C117883g gVar) {
        super(0);
        this.f352421d = gVar;
    }

    public Object invoke() {
        if (C86709a0.m107522a()) {
            C117883g gVar = this.f352421d;
            if (gVar.f352406g == null) {
                Log.m105924i(gVar.f352403d, "launchInitEngineGroup");
                C117883g gVar2 = this.f352421d;
                gVar2.f352406g = C53895h.m60466d(gVar2.f352404e, (C66212f) null, (C53934p0) null, new C117888i(gVar2, (C15601d<? super C117888i>) null), 3, (Object) null);
            }
        }
        return C13598b0.f38549a;
    }
}
