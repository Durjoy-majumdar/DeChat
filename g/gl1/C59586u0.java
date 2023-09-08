package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62772fb;
import vk1.C65761b;

/* renamed from: gl1.u0 */
public final class C59586u0 extends C87413o implements C32224a<C62772fb> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170293d;

    /* renamed from: e */
    public final /* synthetic */ C65761b f170294e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59586u0(C59559k kVar, C65761b bVar) {
        super(0);
        this.f170293d = kVar;
        this.f170294e = bVar;
    }

    public Object invoke() {
        C62772fb fbVar = this.f170293d.f170206H;
        if (fbVar != null) {
            return fbVar;
        }
        View findViewById = this.f170294e.findViewById(C0966R.C0970id.mqq);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…ve_circle_indicator_root)");
        return new C62772fb((ViewGroup) findViewById, this.f170294e);
    }
}
