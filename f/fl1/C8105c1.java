package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12256bd;
import vk1.C65760a;

/* renamed from: fl1.c1 */
public final class C8105c1 extends C87413o implements C32224a<C12256bd> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26965d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8105c1(C65760a aVar) {
        super(0);
        this.f26965d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26965d.findViewById(C0966R.C0970id.dvb);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…ive_option_panel_ui_root)");
        return new C12256bd((ViewGroup) findViewById, this.f26965d);
    }
}
