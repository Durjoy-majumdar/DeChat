package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12360e8;
import vk1.C65762c;

/* renamed from: hl1.e2 */
public final class C8548e2 extends C87413o implements C32224a<C12360e8> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f27620d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8548e2(C65762c cVar) {
        super(0);
        this.f27620d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f27620d.findViewById(C0966R.C0970id.dn9);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_gift_send_again)");
        return new C12360e8((ViewGroup) findViewById, this.f27620d);
    }
}
