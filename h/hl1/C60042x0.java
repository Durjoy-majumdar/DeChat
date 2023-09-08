package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C63170ze;
import vk1.C65762c;

/* renamed from: hl1.x0 */
public final class C60042x0 extends C87413o implements C32224a<C63170ze> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171359d;

    /* renamed from: e */
    public final /* synthetic */ C65762c f171360e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60042x0(C59988k kVar, C65762c cVar) {
        super(0);
        this.f171359d = kVar;
        this.f171360e = cVar;
    }

    public Object invoke() {
        C63170ze zeVar = this.f171359d.f171224j;
        if (zeVar != null) {
            return zeVar;
        }
        View findViewById = this.f171360e.findViewById(C0966R.C0970id.fzq);
        C87412m.m108593f(findViewById, "it.findViewById(\n       …e_tx_live_player_ui_root)");
        return new C63170ze((ViewGroup) findViewById, this.f171360e);
    }
}
