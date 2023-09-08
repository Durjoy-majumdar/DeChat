package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12733x3;
import vk1.C65760a;

/* renamed from: fl1.y0 */
public final class C8128y0 extends C87413o implements C32224a<C12733x3> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26989d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8128y0(C65760a aVar) {
        super(0);
        this.f26989d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26989d.findViewById(C0966R.C0970id.iym);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_banner_area)");
        return new C12733x3((ViewGroup) findViewById, this.f26989d);
    }
}
