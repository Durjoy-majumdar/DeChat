package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import tl1.C13969d;
import vk1.C65761b;

/* renamed from: gl1.k0 */
public final class C8343k0 extends C87413o implements C32224a<C13969d> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27304d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8343k0(C65761b bVar) {
        super(0);
        this.f27304d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27304d.findViewById(C0966R.C0970id.dqr);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…r_live_lottery_card_root)");
        return new C13969d((ViewGroup) findViewById, this.f27304d);
    }
}
