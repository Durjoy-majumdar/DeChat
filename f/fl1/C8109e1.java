package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12482k1;
import vk1.C65760a;

/* renamed from: fl1.e1 */
public final class C8109e1 extends C87413o implements C32224a<C12482k1> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26969d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8109e1(C65760a aVar) {
        super(0);
        this.f26969d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26969d.findViewById(C0966R.C0970id.dkj);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…r_live_fast_comment_root)");
        return new C12482k1((ViewGroup) findViewById, this.f26969d);
    }
}
