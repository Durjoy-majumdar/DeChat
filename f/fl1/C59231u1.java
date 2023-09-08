package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62712dd;
import vk1.C65760a;

/* renamed from: fl1.u1 */
public final class C59231u1 extends C87413o implements C32224a<C62712dd> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169382d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59231u1(C65760a aVar) {
        super(0);
        this.f169382d = aVar;
    }

    public Object invoke() {
        C65760a aVar = this.f169382d;
        View findViewById = aVar.findViewById(C0966R.C0970id.dxg);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…promote_bubble_container)");
        return new C62712dd(aVar, (ViewGroup) findViewById, this.f169382d);
    }
}
