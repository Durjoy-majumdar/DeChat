package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12707vb;
import rx3.C36570n;
import te3.C49712hj1;
import vk1.C65760a;

/* renamed from: fl1.w */
public final class C59236w extends C87413o implements C32224a<C12707vb> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169388d;

    /* renamed from: e */
    public final /* synthetic */ C59161f f169389e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59236w(C65760a aVar, C59161f fVar) {
        super(0);
        this.f169388d = aVar;
        this.f169389e = fVar;
    }

    public Object invoke() {
        View findViewById = this.f169388d.findViewById(C0966R.C0970id.n05);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…ers_profile_ui_root_stub)");
        return new C12707vb((ViewGroup) findViewById, this.f169388d, (C49712hj1) ((C36570n) this.f169389e.f166838g).getValue());
    }
}
