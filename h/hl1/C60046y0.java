package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62843kb;
import vk1.C65762c;

/* renamed from: hl1.y0 */
public final class C60046y0 extends C87413o implements C32224a<C62843kb> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171368d;

    /* renamed from: e */
    public final /* synthetic */ C65762c f171369e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60046y0(C59988k kVar, C65762c cVar) {
        super(0);
        this.f171368d = kVar;
        this.f171369e = cVar;
    }

    public Object invoke() {
        C62843kb kbVar = this.f171368d.f171238r;
        if (kbVar != null) {
            return kbVar;
        }
        View findViewById = this.f171369e.findViewById(C0966R.C0970id.mt9);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.liv…ive_multi_player_ui_root)");
        return new C62843kb((ViewGroup) findViewById, this.f171369e);
    }
}
