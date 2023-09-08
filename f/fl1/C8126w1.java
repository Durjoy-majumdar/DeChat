package fl1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12503ld;
import vk1.C65760a;

/* renamed from: fl1.w1 */
public final class C8126w1 extends C87413o implements C32224a<C12503ld> {

    /* renamed from: d */
    public final /* synthetic */ ViewStub f26986d;

    /* renamed from: e */
    public final /* synthetic */ C65760a f26987e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8126w1(ViewStub viewStub, C65760a aVar) {
        super(0);
        this.f26986d = viewStub;
        this.f26987e = aVar;
    }

    public Object invoke() {
        View inflate = this.f26986d.inflate();
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C12503ld((ViewGroup) inflate, this.f26987e);
    }
}
