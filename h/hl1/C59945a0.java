package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import sl1.C64039c;

/* renamed from: hl1.a0 */
public final class C59945a0 extends C87413o implements C32224a<C64039c> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<View> f171067d;

    /* renamed from: e */
    public final /* synthetic */ C56032b f171068e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59945a0(C8479f0<View> f0Var, C56032b bVar) {
        super(0);
        this.f171067d = f0Var;
        this.f171068e = bVar;
    }

    public Object invoke() {
        View findViewById = ((View) this.f171067d.f27484d).findViewById(C0966R.C0970id.dqp);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…live_lottery_bubble_root)");
        return new C64039c((ViewGroup) findViewById, this.f171068e);
    }
}
