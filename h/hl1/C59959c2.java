package hl1;

import android.view.View;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import nk1.C61788m;
import qj1.C63006u7;
import vk1.C65762c;

/* renamed from: hl1.c2 */
public final class C59959c2 extends C87413o implements C32224a<C63006u7> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f171092d;

    /* renamed from: e */
    public final /* synthetic */ C59988k f171093e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59959c2(C65762c cVar, C59988k kVar) {
        super(0);
        this.f171092d = cVar;
        this.f171093e = kVar;
    }

    public Object invoke() {
        View findViewById = this.f171092d.findViewById(C0966R.C0970id.dn8);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…_live_gift_queue_ui_root)");
        C65762c cVar = this.f171092d;
        C61788m mVar = ((C54991o) this.f171093e.mo83051g(C54991o.class)).f154316g;
        View findViewById2 = this.f171092d.findViewById(C0966R.C0970id.dn7);
        C87412m.m108593f(findViewById2, "it.findViewById(R.id.fin…e_gift_queue_outer_space)");
        return new C63006u7((ViewGroup) findViewById, cVar, mVar, (ViewGroup) findViewById2, true);
    }
}
