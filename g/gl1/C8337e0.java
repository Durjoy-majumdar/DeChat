package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12475jc;
import vk1.C65761b;

/* renamed from: gl1.e0 */
public final class C8337e0 extends C87413o implements C32224a<C12475jc> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27298d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8337e0(C65761b bVar) {
        super(0);
        this.f27298d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27298d.findViewById(C0966R.C0970id.e1p);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C12475jc((ViewGroup) findViewById, this.f27298d);
    }
}
