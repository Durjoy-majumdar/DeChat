package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62632a6;
import vk1.C65761b;

/* renamed from: gl1.r */
public final class C8348r extends C87413o implements C32224a<C62632a6> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27310d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8348r(C65761b bVar) {
        super(0);
        this.f27310d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27310d.findViewById(C0966R.C0970id.ftd);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.live_common_info_ui_root)");
        return new C62632a6((ViewGroup) findViewById, this.f27310d);
    }
}
