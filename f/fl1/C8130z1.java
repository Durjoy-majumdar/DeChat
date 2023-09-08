package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12399ff;
import te3.C49712hj1;
import vk1.C65760a;

/* renamed from: fl1.z1 */
public final class C8130z1 extends C87413o implements C32224a<C12399ff> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26991d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8130z1(C65760a aVar) {
        super(0);
        this.f26991d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26991d.findViewById(C0966R.C0970id.fzn);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.live_title_ui_root)");
        return new C12399ff((ViewGroup) findViewById, this.f26991d, (C49712hj1) null);
    }
}
