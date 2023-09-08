package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C63108xd;

/* renamed from: hl1.d0 */
public final class C59963d0 extends C87413o implements C32224a<C63108xd> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<View> f171100d;

    /* renamed from: e */
    public final /* synthetic */ C56032b f171101e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59963d0(C8479f0<View> f0Var, C56032b bVar) {
        super(0);
        this.f171100d = f0Var;
        this.f171101e = bVar;
    }

    public Object invoke() {
        View findViewById = ((View) this.f171100d.f27484d).findViewById(C0966R.C0970id.no7);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.live_rehearsal_bubble)");
        return new C63108xd((ViewGroup) findViewById, this.f171101e);
    }
}
