package hl1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import vi1.C52931n;
import vk1.C65762c;

/* renamed from: hl1.t1 */
public final class C46081t1 extends C87413o implements C32224a<C52931n> {

    /* renamed from: d */
    public final /* synthetic */ ViewStub f124234d;

    /* renamed from: e */
    public final /* synthetic */ C65762c f124235e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46081t1(ViewStub viewStub, C65762c cVar) {
        super(0);
        this.f124234d = viewStub;
        this.f124235e = cVar;
    }

    public Object invoke() {
        View inflate = this.f124234d.inflate();
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C52931n((ViewGroup) inflate, this.f124235e);
    }
}
