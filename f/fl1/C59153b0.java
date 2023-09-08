package fl1;

import android.view.View;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import nk1.C61788m;
import qj1.C63006u7;
import vk1.C65760a;

/* renamed from: fl1.b0 */
public final class C59153b0 extends C87413o implements C32224a<C63006u7> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169174d;

    /* renamed from: e */
    public final /* synthetic */ C59161f f169175e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59153b0(C65760a aVar, C59161f fVar) {
        super(0);
        this.f169174d = aVar;
        this.f169175e = fVar;
    }

    public Object invoke() {
        View findViewById = this.f169174d.findViewById(C0966R.C0970id.dn8);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…_live_gift_queue_ui_root)");
        C65760a aVar = this.f169174d;
        C61788m mVar = ((C54991o) this.f169175e.mo83051g(C54991o.class)).f154316g;
        View findViewById2 = this.f169174d.findViewById(C0966R.C0970id.dn7);
        C87412m.m108593f(findViewById2, "it.findViewById(R.id.fin…e_gift_queue_outer_space)");
        return new C63006u7((ViewGroup) findViewById, aVar, mVar, (ViewGroup) findViewById2, false, 16, (C8480h) null);
    }
}
