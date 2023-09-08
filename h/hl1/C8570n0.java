package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12583oh;
import vk1.C65762c;

/* renamed from: hl1.n0 */
public final class C8570n0 extends C87413o implements C32224a<C12583oh> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f27653d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8570n0(C65762c cVar) {
        super(0);
        this.f27653d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f27653d.findViewById(C0966R.C0970id.g0y);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.liv…itor_mini_window_ui_root)");
        return new C12583oh((ViewGroup) findViewById, this.f27653d);
    }
}
