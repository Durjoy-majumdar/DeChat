package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import xs1.C66420d;

/* renamed from: hl1.b0 */
public final class C59951b0 extends C87413o implements C32224a<C66420d> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<View> f171078d;

    /* renamed from: e */
    public final /* synthetic */ C56032b f171079e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59951b0(C8479f0<View> f0Var, C56032b bVar) {
        super(0);
        this.f171078d = f0Var;
        this.f171079e = bVar;
    }

    public Object invoke() {
        View findViewById = ((View) this.f171078d.f27484d).findViewById(C0966R.C0970id.nez);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…er_live_vote_bubble_root)");
        return new C66420d((ViewGroup) findViewById, this.f171079e);
    }
}
