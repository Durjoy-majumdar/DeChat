package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C63170ze;
import vk1.C65761b;

/* renamed from: gl1.y */
public final class C59593y extends C87413o implements C32224a<C63170ze> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170304d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59593y(C65761b bVar) {
        super(0);
        this.f170304d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170304d.findViewById(C0966R.C0970id.fzq);
        C87412m.m108593f(findViewById, "it.findViewById(com.tenc…e_tx_live_player_ui_root)");
        return new C63170ze((ViewGroup) findViewById, this.f170304d);
    }
}
