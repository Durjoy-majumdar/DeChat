package gl1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C63129yc;
import vk1.C65761b;

/* renamed from: gl1.m1 */
public final class C59571m1 extends C87413o implements C32224a<C63129yc> {

    /* renamed from: d */
    public final /* synthetic */ ViewStub f170276d;

    /* renamed from: e */
    public final /* synthetic */ C65761b f170277e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59571m1(ViewStub viewStub, C65761b bVar) {
        super(0);
        this.f170276d = viewStub;
        this.f170277e = bVar;
    }

    public Object invoke() {
        View inflate = this.f170276d.inflate();
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C63129yc((ViewGroup) inflate, this.f170277e);
    }
}
