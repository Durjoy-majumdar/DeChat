package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C63144yg;
import vk1.C65762c;

/* renamed from: hl1.l0 */
public final class C60012l0 extends C87413o implements C32224a<C63144yg> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f171295d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60012l0(C65762c cVar) {
        super(0);
        this.f171295d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f171295d.findViewById(C0966R.C0970id.nmg);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…me_together_ui_root_stub)");
        return new C63144yg((ViewGroup) findViewById, this.f171295d);
    }
}
