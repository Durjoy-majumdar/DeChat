package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62911o3;
import vk1.C65760a;

/* renamed from: fl1.q0 */
public final class C59221q0 extends C87413o implements C32224a<C62911o3> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169367d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59221q0(C65760a aVar) {
        super(0);
        this.f169367d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169367d.findViewById(C0966R.C0970id.dd8);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…anchor_promotion_ui_root)");
        return new C62911o3((ViewGroup) findViewById, this.f169367d);
    }
}
