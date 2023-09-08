package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12238a0;
import vk1.C65762c;

/* renamed from: hl1.d2 */
public final class C8545d2 extends C87413o implements C32224a<C12238a0> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f27615d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8545d2(C65762c cVar) {
        super(0);
        this.f27615d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f27615d.findViewById(C0966R.C0970id.dak);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…lowance_gift_bubble_root)");
        return new C12238a0((ViewGroup) findViewById, this.f27615d);
    }
}
