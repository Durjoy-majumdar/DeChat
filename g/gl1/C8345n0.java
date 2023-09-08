package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12490l0;
import vk1.C65761b;

/* renamed from: gl1.n0 */
public final class C8345n0 extends C87413o implements C32224a<C12490l0> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27306d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8345n0(C65761b bVar) {
        super(0);
        this.f27306d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27306d.findViewById(C0966R.C0970id.das);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…or_bottom_option_ui_root)");
        return new C12490l0((ViewGroup) findViewById, this.f27306d);
    }
}
