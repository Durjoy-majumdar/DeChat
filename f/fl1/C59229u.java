package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C63151z0;
import vk1.C65760a;

/* renamed from: fl1.u */
public final class C59229u extends C87413o implements C32224a<C63151z0> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169380d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59229u(C65760a aVar) {
        super(0);
        this.f169380d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169380d.findViewById(C0966R.C0970id.frf);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.live_anchor_close_ui_root)");
        return new C63151z0((ViewGroup) findViewById, this.f169380d);
    }
}
