package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12522mf;
import vk1.C65761b;

/* renamed from: gl1.i0 */
public final class C8340i0 extends C87413o implements C32224a<C12522mf> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27301d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8340i0(C65761b bVar) {
        super(0);
        this.f27301d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27301d.findViewById(C0966R.C0970id.e0o);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…live_top_comment_ui_root)");
        return new C12522mf((ViewGroup) findViewById, this.f27301d);
    }
}
