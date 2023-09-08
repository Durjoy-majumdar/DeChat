package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12256bd;
import vk1.C65761b;

/* renamed from: gl1.r0 */
public final class C8349r0 extends C87413o implements C32224a<C12256bd> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27311d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8349r0(C65761b bVar) {
        super(0);
        this.f27311d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27311d.findViewById(C0966R.C0970id.dvb);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…ive_option_panel_ui_root)");
        return new C12256bd((ViewGroup) findViewById, this.f27311d);
    }
}
