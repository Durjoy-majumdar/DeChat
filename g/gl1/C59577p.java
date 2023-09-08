package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62638b0;
import vk1.C65761b;

/* renamed from: gl1.p */
public final class C59577p extends C87413o implements C32224a<C62638b0> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170283d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59577p(C65761b bVar) {
        super(0);
        this.f170283d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170283d.findViewById(C0966R.C0970id.dal);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…allowance_gift_card_root)");
        return new C62638b0((ViewGroup) findViewById, this.f170283d);
    }
}
