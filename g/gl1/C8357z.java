package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12733x3;
import vk1.C65761b;

/* renamed from: gl1.z */
public final class C8357z extends C87413o implements C32224a<C12733x3> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27319d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8357z(C65761b bVar) {
        super(0);
        this.f27319d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27319d.findViewById(C0966R.C0970id.iym);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_banner_area)");
        return new C12733x3((ViewGroup) findViewById, this.f27319d);
    }
}
