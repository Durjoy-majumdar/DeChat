package gl1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12503ld;
import vk1.C65761b;

/* renamed from: gl1.n1 */
public final class C8346n1 extends C87413o implements C32224a<C12503ld> {

    /* renamed from: d */
    public final /* synthetic */ ViewStub f27307d;

    /* renamed from: e */
    public final /* synthetic */ C65761b f27308e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8346n1(ViewStub viewStub, C65761b bVar) {
        super(0);
        this.f27307d = viewStub;
        this.f27308e = bVar;
    }

    public Object invoke() {
        View inflate = this.f27307d.inflate();
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C12503ld((ViewGroup) inflate, this.f27308e);
    }
}
