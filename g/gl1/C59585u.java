package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C63151z0;
import vk1.C65761b;

/* renamed from: gl1.u */
public final class C59585u extends C87413o implements C32224a<C63151z0> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170292d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59585u(C65761b bVar) {
        super(0);
        this.f170292d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170292d.findViewById(C0966R.C0970id.frf);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.live_anchor_close_ui_root)");
        return new C63151z0((ViewGroup) findViewById, this.f170292d);
    }
}
