package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12733x3;

/* renamed from: hl1.e0 */
public final class C8547e0 extends C87413o implements C32224a<C12733x3> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<View> f27618d;

    /* renamed from: e */
    public final /* synthetic */ C56032b f27619e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8547e0(C8479f0<View> f0Var, C56032b bVar) {
        super(0);
        this.f27618d = f0Var;
        this.f27619e = bVar;
    }

    public Object invoke() {
        View findViewById = ((View) this.f27618d.f27484d).findViewById(C0966R.C0970id.iym);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.….finder_live_banner_area)");
        return new C12733x3((ViewGroup) findViewById, this.f27619e);
    }
}
