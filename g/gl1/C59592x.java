package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ll1.C61304a;
import qj1.C63049v9;
import vk1.C65761b;

/* renamed from: gl1.x */
public final class C59592x extends C87413o implements C32224a<C63049v9> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170303d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59592x(C65761b bVar) {
        super(0);
        this.f170303d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170303d.findViewById(C0966R.C0970id.fuw);
        C87412m.m108593f(findViewById, "it.findViewById(com.tenc…ve_like_confetti_ui_root)");
        return new C63049v9((ViewGroup) findViewById, this.f170303d, (C61304a) null);
    }
}
