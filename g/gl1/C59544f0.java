package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62668c4;
import vk1.C65761b;

/* renamed from: gl1.f0 */
public final class C59544f0 extends C87413o implements C32224a<C62668c4> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170176d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59544f0(C65761b bVar) {
        super(0);
        this.f170176d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170176d.findViewById(C0966R.C0970id.f358212jl1);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C62668c4((ViewGroup) findViewById, this.f170176d);
    }
}
