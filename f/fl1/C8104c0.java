package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12522mf;
import vk1.C65760a;

/* renamed from: fl1.c0 */
public final class C8104c0 extends C87413o implements C32224a<C12522mf> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26964d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8104c0(C65760a aVar) {
        super(0);
        this.f26964d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26964d.findViewById(C0966R.C0970id.e0o);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…live_top_comment_ui_root)");
        return new C12522mf((ViewGroup) findViewById, this.f26964d);
    }
}
