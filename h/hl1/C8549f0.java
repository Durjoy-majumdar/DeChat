package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12429gi;

/* renamed from: hl1.f0 */
public final class C8549f0 extends C87413o implements C32224a<C12429gi> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<View> f27621d;

    /* renamed from: e */
    public final /* synthetic */ C56032b f27622e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8549f0(C8479f0<View> f0Var, C56032b bVar) {
        super(0);
        this.f27621d = f0Var;
        this.f27622e = bVar;
    }

    public Object invoke() {
        View findViewById = ((View) this.f27621d.f27484d).findViewById(C0966R.C0970id.izi);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…r_live_wish_banner_group)");
        return new C12429gi((ViewGroup) findViewById, this.f27622e);
    }
}
