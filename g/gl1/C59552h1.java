package gl1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ug1.C65348b;
import vk1.C65761b;

/* renamed from: gl1.h1 */
public final class C59552h1 extends C87413o implements C32224a<C65348b> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170188d;

    /* renamed from: e */
    public final /* synthetic */ C65761b f170189e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59552h1(C59559k kVar, C65761b bVar) {
        super(0);
        this.f170188d = kVar;
        this.f170189e = bVar;
    }

    public Object invoke() {
        C59559k kVar = this.f170188d;
        C65761b bVar = this.f170189e;
        kVar.getClass();
        View inflate = ((ViewStub) bVar.findViewById(C0966R.C0970id.neh)).inflate();
        C87412m.m108593f(inflate, "stub.inflate()");
        return new C65348b((ViewGroup) inflate, this.f170189e);
    }
}
