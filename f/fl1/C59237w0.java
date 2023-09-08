package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import sl1.C64039c;
import vk1.C65760a;

/* renamed from: fl1.w0 */
public final class C59237w0 extends C87413o implements C32224a<C64039c> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169390d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59237w0(C65760a aVar) {
        super(0);
        this.f169390d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169390d.findViewById(C0966R.C0970id.dqp);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…live_lottery_bubble_root)");
        return new C64039c((ViewGroup) findViewById, this.f169390d);
    }
}
