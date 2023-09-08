package hl1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C63129yc;
import vk1.C65762c;

/* renamed from: hl1.w1 */
public final class C60040w1 extends C87413o implements C32224a<C63129yc> {

    /* renamed from: d */
    public final /* synthetic */ ViewStub f171355d;

    /* renamed from: e */
    public final /* synthetic */ C65762c f171356e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60040w1(ViewStub viewStub, C65762c cVar) {
        super(0);
        this.f171355d = viewStub;
        this.f171356e = cVar;
    }

    public Object invoke() {
        View inflate = this.f171355d.inflate();
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C63129yc((ViewGroup) inflate, this.f171356e);
    }
}
