package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ok1.C11471u;
import qj1.C12389fa;
import vk1.C65761b;

/* renamed from: gl1.v */
public final class C8352v extends C87413o implements C32224a<C12389fa> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27314d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8352v(C65761b bVar) {
        super(0);
        this.f27314d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27314d.findViewById(C0966R.C0970id.fvw);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.live_members_list_ui_root)");
        return new C12389fa((ViewGroup) findViewById, C11471u.C11473b.AUTO, this.f27314d);
    }
}
