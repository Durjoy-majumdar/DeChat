package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62889n0;
import vk1.C65760a;

/* renamed from: fl1.e0 */
public final class C8108e0 extends C87413o implements C32224a<C62889n0> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26968d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8108e0(C65760a aVar) {
        super(0);
        this.f26968d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26968d.findViewById(C0966R.C0970id.dih);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…camera_opt_panel_ui_root)");
        return new C62889n0((ViewGroup) findViewById, this.f26968d);
    }
}
