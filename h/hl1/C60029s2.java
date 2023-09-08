package hl1;

import android.view.View;
import android.view.ViewGroup;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C63118y3;
import vk1.C65762c;

/* renamed from: hl1.s2 */
public final class C60029s2 extends C87413o implements C32224a<C63118y3> {

    /* renamed from: d */
    public final /* synthetic */ View f171332d;

    /* renamed from: e */
    public final /* synthetic */ C65762c f171333e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60029s2(View view, C65762c cVar) {
        super(0);
        this.f171332d = view;
        this.f171333e = cVar;
    }

    public Object invoke() {
        View view = this.f171332d;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C63118y3((ViewGroup) view, this.f171333e);
    }
}
