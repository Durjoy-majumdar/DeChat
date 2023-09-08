package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12786zh;
import qj1.C62660c;
import vk1.C65762c;

/* renamed from: hl1.u3 */
public final class C8586u3 extends C87413o implements C32224a<C62660c> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f27675d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8586u3(C65762c cVar) {
        super(0);
        this.f27675d = cVar;
    }

    public Object invoke() {
        C65762c cVar = this.f27675d;
        View genRootViewByStub = cVar.genRootViewByStub(C0966R.C0970id.nf4, cVar);
        C87412m.m108592e(genRootViewByStub, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C12786zh((ViewGroup) genRootViewByStub, this.f27675d);
    }
}
