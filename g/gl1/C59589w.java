package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12707vb;
import rx3.C36570n;
import te3.C49712hj1;
import vk1.C65761b;

/* renamed from: gl1.w */
public final class C59589w extends C87413o implements C32224a<C12707vb> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170298d;

    /* renamed from: e */
    public final /* synthetic */ C59559k f170299e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59589w(C65761b bVar, C59559k kVar) {
        super(0);
        this.f170298d = bVar;
        this.f170299e = kVar;
    }

    public Object invoke() {
        View findViewById = this.f170298d.findViewById(C0966R.C0970id.n05);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…ers_profile_ui_root_stub)");
        return new C12707vb((ViewGroup) findViewById, this.f170298d, (C49712hj1) ((C36570n) this.f170299e.f166843g).getValue());
    }
}
