package fl1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12282d7;
import vk1.C65760a;

/* renamed from: fl1.j1 */
public final class C59199j1 extends C87413o implements C32224a<C12282d7> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f169334d;

    /* renamed from: e */
    public final /* synthetic */ C65760a f169335e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59199j1(C59161f fVar, C65760a aVar) {
        super(0);
        this.f169334d = fVar;
        this.f169335e = aVar;
    }

    public Object invoke() {
        C59161f fVar = this.f169334d;
        C65760a aVar = this.f169335e;
        fVar.getClass();
        View inflate = ((ViewStub) aVar.findViewById(C0966R.C0970id.dms)).inflate();
        C87412m.m108593f(inflate, "stub.inflate()");
        return new C12282d7((ViewGroup) inflate, this.f169335e, C12282d7.C12288c.ANCHOR_SELECT);
    }
}
