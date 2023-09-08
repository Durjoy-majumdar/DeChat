package xm3;

import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import tm3.C78069w;

/* renamed from: xm3.d0 */
public final class C78880d0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C78877c0 f231731d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78880d0(C78877c0 c0Var) {
        super(0);
        this.f231731d = c0Var;
    }

    public Object invoke() {
        C78069w wVar;
        UIStateCenter e3 = this.f231731d.mo14599e3();
        if (!(e3 == null || (wVar = (C78069w) e3.getState()) == null)) {
            C78877c0 c0Var = this.f231731d;
            boolean z = wVar.f228828p;
            String str = wVar.f228831s;
            if (str == null) {
                str = "";
            }
            C78877c0.m95413i3(c0Var, z, str);
        }
        return C13598b0.f38549a;
    }
}
