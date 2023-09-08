package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12690u1;
import vk1.C65761b;

/* renamed from: gl1.g0 */
public final class C8339g0 extends C87413o implements C32224a<C12690u1> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27300d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8339g0(C65761b bVar) {
        super(0);
        this.f27300d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27300d.findViewById(C0966R.C0970id.db7);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…live_anchor_like_ui_root)");
        return new C12690u1((ViewGroup) findViewById, this.f27300d);
    }
}
