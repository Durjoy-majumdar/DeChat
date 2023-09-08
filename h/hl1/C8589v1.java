package hl1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12772zc;
import vk1.C65762c;

/* renamed from: hl1.v1 */
public final class C8589v1 extends C87413o implements C32224a<C12772zc> {

    /* renamed from: d */
    public final /* synthetic */ ViewStub f27679d;

    /* renamed from: e */
    public final /* synthetic */ C65762c f27680e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8589v1(ViewStub viewStub, C65762c cVar) {
        super(0);
        this.f27679d = viewStub;
        this.f27680e = cVar;
    }

    public Object invoke() {
        View inflate = this.f27679d.inflate();
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C12772zc((ViewGroup) inflate, this.f27680e);
    }
}
