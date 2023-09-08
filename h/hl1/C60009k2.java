package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62638b0;
import vk1.C65762c;

/* renamed from: hl1.k2 */
public final class C60009k2 extends C87413o implements C32224a<C62638b0> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f171292d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60009k2(C65762c cVar) {
        super(0);
        this.f171292d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f171292d.findViewById(C0966R.C0970id.dal);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…allowance_gift_card_root)");
        return new C62638b0((ViewGroup) findViewById, this.f171292d);
    }
}
