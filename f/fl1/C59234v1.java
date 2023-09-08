package fl1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C63129yc;
import vk1.C65760a;

/* renamed from: fl1.v1 */
public final class C59234v1 extends C87413o implements C32224a<C63129yc> {

    /* renamed from: d */
    public final /* synthetic */ ViewStub f169385d;

    /* renamed from: e */
    public final /* synthetic */ C65760a f169386e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59234v1(ViewStub viewStub, C65760a aVar) {
        super(0);
        this.f169385d = viewStub;
        this.f169386e = aVar;
    }

    public Object invoke() {
        View inflate = this.f169385d.inflate();
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C63129yc((ViewGroup) inflate, this.f169386e);
    }
}
