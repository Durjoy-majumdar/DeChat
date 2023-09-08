package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12693u2;
import vk1.C65761b;

/* renamed from: gl1.i1 */
public final class C8341i1 extends C87413o implements C32224a<C12693u2> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27302d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8341i1(C65761b bVar) {
        super(0);
        this.f27302d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27302d.findViewById(C0966R.C0970id.mrl);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…sic_select_panel_ui_root)");
        return new C12693u2((ViewGroup) findViewById, this.f27302d);
    }
}
