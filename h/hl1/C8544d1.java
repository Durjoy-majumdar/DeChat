package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12399ff;
import vk1.C65762c;

/* renamed from: hl1.d1 */
public final class C8544d1 extends C87413o implements C32224a<C12399ff> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f27613d;

    /* renamed from: e */
    public final /* synthetic */ C59988k f27614e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8544d1(C65762c cVar, C59988k kVar) {
        super(0);
        this.f27613d = cVar;
        this.f27614e = kVar;
    }

    public Object invoke() {
        View findViewById = this.f27613d.findViewById(C0966R.C0970id.fzn);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.live_title_ui_root)");
        return new C12399ff((ViewGroup) findViewById, this.f27613d, this.f27614e.f166850h);
    }
}
