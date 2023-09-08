package gl1;

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
import vk1.C65761b;

/* renamed from: gl1.m0 */
public final class C59570m0 extends C87413o implements C32224a<C63006u7> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170274d;

    /* renamed from: e */
    public final /* synthetic */ C59559k f170275e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59570m0(C65761b bVar, C59559k kVar) {
        super(0);
        this.f170274d = bVar;
        this.f170275e = kVar;
    }

    public Object invoke() {
        View findViewById = this.f170274d.findViewById(C0966R.C0970id.dn8);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…_live_gift_queue_ui_root)");
        C65761b bVar = this.f170274d;
        C61788m mVar = ((C54991o) this.f170275e.mo83051g(C54991o.class)).f154316g;
        View findViewById2 = this.f170274d.findViewById(C0966R.C0970id.dn7);
        C87412m.m108593f(findViewById2, "it.findViewById(R.id.fin…e_gift_queue_outer_space)");
        return new C63006u7((ViewGroup) findViewById, bVar, mVar, (ViewGroup) findViewById2, false, 16, (C8480h) null);
    }
}
