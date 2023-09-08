package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12264c0;
import vk1.C65762c;

/* renamed from: hl1.l2 */
public final class C8567l2 extends C87413o implements C32224a<C12264c0> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f27650d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8567l2(C65762c cVar) {
        super(0);
        this.f27650d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f27650d.findViewById(C0966R.C0970id.dam);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…_allowance_gift_pag_root)");
        return new C12264c0((ViewGroup) findViewById, this.f27650d);
    }
}
