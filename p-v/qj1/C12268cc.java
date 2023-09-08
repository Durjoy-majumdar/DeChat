package qj1;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;
import te3.C50542nh0;
import te3.C64707sc1;

/* renamed from: qj1.cc */
public final class C12268cc extends C87413o implements C32227p<C64707sc1, C50542nh0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12707vb f35355d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12268cc(C12707vb vbVar) {
        super(2);
        this.f35355d = vbVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C50542nh0 nh02 = (C50542nh0) obj2;
        C87412m.m108594g((C64707sc1) obj, "req");
        C87412m.m108594g(nh02, "ret");
        if (nh02.f138603e == 0) {
            C58124b.C7172a.m7372a(this.f35355d.f36415p, C58124b.C58125b.FINDER_LIVE_MEMBERS_LOADING, (Bundle) null, 2, (Object) null);
            C76912y0.makeText(this.f35355d.f166287d.getContext(), (CharSequence) this.f35355d.f166287d.getContext().getResources().getString(C0966R.string.e3x), 0).show();
            String str = this.f35355d.f36416q;
            Log.m105924i(str, "kicked member succ" + this.f35355d.f36406C);
        } else {
            C76912y0.makeText(this.f35355d.f166287d.getContext(), (CharSequence) this.f35355d.f166287d.getContext().getResources().getString(C0966R.string.e3y), 0).show();
            String str2 = this.f35355d.f36416q;
            Log.m105924i(str2, "kicked member failed:" + nh02.f138603e);
        }
        return C13598b0.f38549a;
    }
}
