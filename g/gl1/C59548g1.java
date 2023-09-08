package gl1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12282d7;
import vk1.C65761b;

/* renamed from: gl1.g1 */
public final class C59548g1 extends C87413o implements C32224a<C12282d7> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170182d;

    /* renamed from: e */
    public final /* synthetic */ C65761b f170183e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59548g1(C59559k kVar, C65761b bVar) {
        super(0);
        this.f170182d = kVar;
        this.f170183e = bVar;
    }

    public Object invoke() {
        C59559k kVar = this.f170182d;
        C65761b bVar = this.f170183e;
        kVar.getClass();
        View inflate = ((ViewStub) bVar.findViewById(C0966R.C0970id.dms)).inflate();
        C87412m.m108593f(inflate, "stub.inflate()");
        return new C12282d7((ViewGroup) inflate, this.f170183e, C12282d7.C12288c.ANCHOR_SELECT);
    }
}
