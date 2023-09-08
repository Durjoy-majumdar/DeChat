package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12429gi;
import vk1.C65761b;

/* renamed from: gl1.a1 */
public final class C8334a1 extends C87413o implements C32224a<C12429gi> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27295d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8334a1(C65761b bVar) {
        super(0);
        this.f27295d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27295d.findViewById(C0966R.C0970id.izi);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…r_live_wish_banner_group)");
        return new C12429gi((ViewGroup) findViewById, this.f27295d);
    }
}
