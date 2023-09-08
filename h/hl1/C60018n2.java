package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62705da;
import vk1.C65762c;

/* renamed from: hl1.n2 */
public final class C60018n2 extends C87413o implements C32224a<C62705da> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f171309d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60018n2(C65762c cVar) {
        super(0);
        this.f171309d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f171309d.findViewById(C0966R.C0970id.mr5);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…ogo_receive_empty_layout)");
        return new C62705da((ViewGroup) findViewById, this.f171309d);
    }
}
