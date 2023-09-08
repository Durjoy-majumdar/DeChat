package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62833je;
import vk1.C65761b;

/* renamed from: gl1.q1 */
public final class C59581q1 extends C87413o implements C32224a<C62833je> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170287d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59581q1(C65761b bVar) {
        super(0);
        this.f170287d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170287d.findViewById(C0966R.C0970id.fyi);
        C87412m.m108593f(findViewById, "it.findViewById(com.tenc…R.id.live_shadow_ui_root)");
        return new C62833je((ViewGroup) findViewById, this.f170287d);
    }
}
