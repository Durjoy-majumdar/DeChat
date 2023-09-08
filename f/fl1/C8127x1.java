package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12238a0;
import vk1.C65760a;

/* renamed from: fl1.x1 */
public final class C8127x1 extends C87413o implements C32224a<C12238a0> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26988d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8127x1(C65760a aVar) {
        super(0);
        this.f26988d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26988d.findViewById(C0966R.C0970id.dak);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…lowance_gift_bubble_root)");
        return new C12238a0((ViewGroup) findViewById, this.f26988d);
    }
}
