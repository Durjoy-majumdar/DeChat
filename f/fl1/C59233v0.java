package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62696d3;
import vk1.C65760a;

/* renamed from: fl1.v0 */
public final class C59233v0 extends C87413o implements C32224a<C62696d3> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169384d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59233v0(C65760a aVar) {
        super(0);
        this.f169384d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169384d.findViewById(C0966R.C0970id.f358246e20);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…nning_count_down_ui_root)");
        return new C62696d3((ViewGroup) findViewById, this.f169384d);
    }
}
