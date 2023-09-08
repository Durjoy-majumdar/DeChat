package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62833je;
import vk1.C65760a;

/* renamed from: fl1.l0 */
public final class C59204l0 extends C87413o implements C32224a<C62833je> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169342d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59204l0(C65760a aVar) {
        super(0);
        this.f169342d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169342d.findViewById(C0966R.C0970id.fyi);
        C87412m.m108593f(findViewById, "it.findViewById(com.tenc…R.id.live_shadow_ui_root)");
        return new C62833je((ViewGroup) findViewById, this.f169342d);
    }
}
