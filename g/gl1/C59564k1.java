package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62861l1;
import vk1.C65761b;

/* renamed from: gl1.k1 */
public final class C59564k1 extends C87413o implements C32224a<C62861l1> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170265d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59564k1(C65761b bVar) {
        super(0);
        this.f170265d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170265d.findViewById(C0966R.C0970id.nlt);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…me_together_ui_root_stub)");
        return new C62861l1((ViewGroup) findViewById, this.f170265d);
    }
}
