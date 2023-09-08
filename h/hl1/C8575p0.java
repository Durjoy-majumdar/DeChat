package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12482k1;
import vk1.C65762c;

/* renamed from: hl1.p0 */
public final class C8575p0 extends C87413o implements C32224a<C12482k1> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f27661d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8575p0(C65762c cVar) {
        super(0);
        this.f27661d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f27661d.findViewById(C0966R.C0970id.dkj);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…r_live_fast_comment_root)");
        return new C12482k1((ViewGroup) findViewById, this.f27661d);
    }
}
