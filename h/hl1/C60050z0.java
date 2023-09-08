package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62772fb;
import vk1.C65762c;

/* renamed from: hl1.z0 */
public final class C60050z0 extends C87413o implements C32224a<C62772fb> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171375d;

    /* renamed from: e */
    public final /* synthetic */ C65762c f171376e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60050z0(C59988k kVar, C65762c cVar) {
        super(0);
        this.f171375d = kVar;
        this.f171376e = cVar;
    }

    public Object invoke() {
        C62772fb fbVar = this.f171375d.f171236q;
        if (fbVar != null) {
            return fbVar;
        }
        View findViewById = this.f171376e.findViewById(C0966R.C0970id.mqq);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…ve_circle_indicator_root)");
        return new C62772fb((ViewGroup) findViewById, this.f171376e);
    }
}
