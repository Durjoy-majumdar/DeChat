package hl1;

import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import qj1.C63049v9;
import vk1.C65762c;

/* renamed from: hl1.o1 */
public final class C60021o1 extends C87413o implements C32224a<C63049v9> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171313d;

    /* renamed from: e */
    public final /* synthetic */ C65762c f171314e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60021o1(C59988k kVar, C65762c cVar) {
        super(0);
        this.f171313d = kVar;
        this.f171314e = cVar;
    }

    public Object invoke() {
        C65762c cVar = this.f171314e;
        return new C63049v9((ViewGroup) this.f171313d.mo83046i(C0966R.C0970id.fux, this.f171314e), cVar, cVar.getConfettiBitmapManager());
    }
}
