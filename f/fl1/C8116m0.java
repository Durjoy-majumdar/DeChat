package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12490l0;
import vk1.C65760a;

/* renamed from: fl1.m0 */
public final class C8116m0 extends C87413o implements C32224a<C12490l0> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26976d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8116m0(C65760a aVar) {
        super(0);
        this.f26976d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26976d.findViewById(C0966R.C0970id.das);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…or_bottom_option_ui_root)");
        return new C12490l0((ViewGroup) findViewById, this.f26976d);
    }
}
