package qj1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import nj3.C76912y0;
import ob0.C89132b;
import rx3.C13598b0;

/* renamed from: qj1.g1 */
public final class C12419g1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C12377f1 f35781a;

    public C12419g1(C12377f1 f1Var) {
        this.f35781a = f1Var;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105924i("Finder.FinderLiveAnchorDescEditPlugin", "CgiFinderLiveModBasicInfo errType:" + cVar.f256793a + " errCode:" + cVar.f256794b);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C76912y0.m92768g(this.f35781a.f166287d.getContext(), this.f35781a.f166287d.getContext().getString(C0966R.string.dkh));
        } else {
            C76912y0.m92768g(this.f35781a.f166287d.getContext(), this.f35781a.f166287d.getContext().getString(C0966R.string.dki));
        }
        C12377f1 f1Var = this.f35781a;
        f1Var.mo12062Z0(false);
        f1Var.mo10792g(8);
        return C13598b0.f38549a;
    }
}
