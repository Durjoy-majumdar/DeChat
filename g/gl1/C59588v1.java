package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import sl1.C64039c;
import vk1.C65761b;

/* renamed from: gl1.v1 */
public final class C59588v1 extends C87413o implements C32224a<C64039c> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170297d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59588v1(C65761b bVar) {
        super(0);
        this.f170297d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170297d.findViewById(C0966R.C0970id.dqp);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…live_lottery_bubble_root)");
        return new C64039c((ViewGroup) findViewById, this.f170297d);
    }
}
